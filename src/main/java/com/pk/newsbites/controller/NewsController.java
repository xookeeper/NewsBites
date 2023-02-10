package com.pk.newsbites.controller;

import com.pk.newsbites.dtos.CreateNewsDTO;
import com.pk.newsbites.models.News;
import com.pk.newsbites.newsservice.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/news", method = RequestMethod.POST)
    public News addNews(@RequestBody CreateNewsDTO newsRequest){
        return newsService.addNews(newsRequest);
    }

    @RequestMapping(value = "news", method = RequestMethod.GET)
    public List<News> getNews(){
        return newsService.getNews();
    }
}
