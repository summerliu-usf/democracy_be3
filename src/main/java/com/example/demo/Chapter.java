package com.example.demo;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "Chapter")
public class Chapter {
  @Id
  private Long chapId;
  private String title;
  private String podcastUrl;
  private String bookId;
  private String assistantId;

  public Chapter() {}

  public Chapter(Long chapId, String title, String podcastUrl, String bookId, String assistantId) {
    this.chapId = chapId;
    this.title = title;
    this.podcastUrl = podcastUrl;
    this.bookId = bookId;
    this.assistantId = assistantId;
  }

  public Long getChapId() {
    return chapId;
  }

  public void setChapId(Long chapId) {
    this.chapId = chapId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPodcastUrl() {
    return podcastUrl;
  }

  public void setPodcastUrl(String podcastUrl) {
    this.podcastUrl = podcastUrl;
  }

  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  @Override
  public String toString() {
    return "{" +
            "chapId:" + chapId +
            ", title:'" + title + '\'' +
            ", podcastUrl:'" + podcastUrl + '\'' +
            ", bookIdr:" + bookId +
            ", assistantId:" + assistantId +
            '}';
  }
}
