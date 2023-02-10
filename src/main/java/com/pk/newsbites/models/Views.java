package com.pk.newsbites.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Views {
    @GeneratedValue
    @Id
    Long id;
    Long customerID;
    Long newsId;
}
