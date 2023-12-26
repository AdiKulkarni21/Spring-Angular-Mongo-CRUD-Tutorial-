package com.SMA.demo.Repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.SMA.demo.model.*;
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByTitleContaining(String title);
  List<Tutorial> findByPublished(boolean published);
}
