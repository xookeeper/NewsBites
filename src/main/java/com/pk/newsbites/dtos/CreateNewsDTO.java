package com.pk.newsbites.dtos;

import lombok.Data;

@Data
public class CreateNewsDTO {
    String heading;
    String body;
    String link;
    String imageurl;
    String topic;
    Long timestamp;
}
