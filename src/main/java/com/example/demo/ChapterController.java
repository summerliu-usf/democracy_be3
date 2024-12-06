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
  public Chapter getChapterById(@PathVariable int chapId) {
    return chapterRepository.findById(chapId).orElse(null);
  }

  @PostMapping("/save")
  public Chapter saveChapter(@RequestBody Chapter chapter) {
    return chapterRepository.save(chapter);
  }

}
