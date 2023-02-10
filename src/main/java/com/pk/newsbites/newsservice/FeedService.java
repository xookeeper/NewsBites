package com.pk.newsbites.newsservice;

import com.pk.newsbites.dtos.FeedRequestDTO;
import com.pk.newsbites.models.News;
import com.pk.newsbites.repository.FavouraiteTopicRepository;
import com.pk.newsbites.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    @Autowired
    NewsRepository newsRepository;

    @Autowired
    FavouraiteTopicRepository favouraiteTopicRepository;


    public List<News> getNewsFeed(FeedRequestDTO feedRequest){
        List<String> topics = favouraiteTopicRepository.findTopicsByUserId(feedRequest.getUserId());
        return  newsRepository.getNewsFeed(feedRequest.getUserId(), topics, feedRequest.getTimeStamp());
    }

}
