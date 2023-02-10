package com.pk.newsbites.controller;

import com.pk.newsbites.dtos.FeedRequestDTO;
import com.pk.newsbites.models.News;
import com.pk.newsbites.newsservice.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    FeedService feedService;
    @RequestMapping(value = "/feeds", method = RequestMethod.GET)
    public List<News> getNewsFeeds(@RequestBody FeedRequestDTO feedRequest){
        return feedService.getNewsFeed(feedRequest);
    }
}
