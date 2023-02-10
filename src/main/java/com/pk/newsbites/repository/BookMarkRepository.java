package com.pk.newsbites.repository;

import com.pk.newsbites.models.BookMark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepository extends JpaRepository<BookMark, Long> {
}
