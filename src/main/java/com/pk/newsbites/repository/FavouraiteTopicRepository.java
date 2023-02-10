package com.pk.newsbites.repository;

import com.pk.newsbites.models.FavouraiteTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FavouraiteTopicRepository extends JpaRepository<FavouraiteTopic, Long> {

    @Query(value = "select topic from FavouraiteTopic where userId = (:userId)")
    public List<String> findTopicsByUserId(@Param(value = "userId") Long userId);
}
