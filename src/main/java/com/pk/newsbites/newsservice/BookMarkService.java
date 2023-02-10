package com.pk.newsbites.newsservice;

import com.pk.newsbites.dtos.BookMarkDTO;
import com.pk.newsbites.models.BookMark;
import com.pk.newsbites.repository.BookMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookMarkService {

    @Autowired
    BookMarkRepository bookMarkRepository;

    public BookMark addBookMark(BookMarkDTO boomarkRequest){
        BookMark bookMark = BookMark.builder().userId(boomarkRequest.getUserId()).newsId(boomarkRequest.getNewsId()).build();
        bookMarkRepository.save(bookMark);
        return bookMark;
    }
}
