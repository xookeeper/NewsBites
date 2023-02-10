package com.pk.newsbites.newsservice;

import com.pk.newsbites.dtos.TopicRequestDTO;
import com.pk.newsbites.models.FavouraiteTopic;
import com.pk.newsbites.repository.FavouraiteTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavouraiteTopicService {

    @Autowired
    FavouraiteTopicRepository favouraiteTopicRepository;

    public List<FavouraiteTopic> addFavouraiteTopics(TopicRequestDTO request){
        List<FavouraiteTopic> topics = new ArrayList<>();

        for(String topic : request.getTopics()){
            FavouraiteTopic favouraiteTopic = FavouraiteTopic.builder().userId(request.getUserId()).topic(topic).build();
            topics.add(favouraiteTopic);
        }
        return favouraiteTopicRepository.saveAll(topics);
    }
}
