package com.pk.newsbites.dtos;

import lombok.Data;

import java.util.List;

@Data
public class TopicRequestDTO {
    Long userId;
    List<String> topics;
}
