package com.example.demo;

import java.util.List;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface ChapterRepository extends DatastoreRepository<Chapter, Long> {
    Chapter findByBookIdAndChapId(String bookId, Long chapId);
}
