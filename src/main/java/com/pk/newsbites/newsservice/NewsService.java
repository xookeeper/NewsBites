package com.pk.newsbites.newsservice;

import com.pk.newsbites.dtos.CreateNewsDTO;
import com.pk.newsbites.models.News;
import com.pk.newsbites.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    NewsRepository newsRepository;

    public News addNews(CreateNewsDTO newsRequest){
        News news = News.builder().topic(newsRequest.getTopic()).body(newsRequest.getBody()).heading(newsRequest.getHeading()).timestamp(newsRequest.getTimestamp()).build();
        newsRepository.save(news);
        return news;
    }

    public List<News> getNews(){
        return newsRepository.findAll();
    }
}
