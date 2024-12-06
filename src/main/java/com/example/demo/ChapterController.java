package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("")
public class ChapterController {

  @Autowired
  private ChapterRepository chapterRepository;

  @GetMapping("/{bookId}/chapters/{chapId}")
  public Chapter getChapterById(@PathVariable String bookId, @PathVariable Long chapId) {
    return chapterRepository.findByBookIdAndChapId(bookId, chapId);
  }

  @PostMapping("/save")
  public String saveChapter(@RequestBody Chapter chapter) {
    if (chapter == null) {
      return "The book is invalid";
    }
    this.chapterRepository.save(chapter);
    return "success";
  }
}
