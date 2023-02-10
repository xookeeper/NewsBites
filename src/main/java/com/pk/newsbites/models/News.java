package com.pk.newsbites.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class News {
    @GeneratedValue
    @Id
    Long id;
    String heading;
    String body;
    String link;
    Long timestamp;
    String topic;

}
