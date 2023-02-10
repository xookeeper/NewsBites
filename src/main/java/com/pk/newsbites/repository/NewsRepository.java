package com.pk.newsbites.repository;

import com.pk.newsbites.models.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {


    @Query(value = "select News from News where News.userId = (:userId) and News.topic IN (:topics) ORDER BY NEWS.timestamp")
    public List<News> getNewsFeed(@Param("userId ") Long userId, @Param("topics") List<String> topics, @Param("timestamp") Long timeStamp);
}
