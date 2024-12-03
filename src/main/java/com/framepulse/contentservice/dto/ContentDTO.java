package com.framepulse.contentservice.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ContentDTO {
    private String id;
    private String content_url;
    private String user_id;
    private String title;
    private List<String> tags;
    private String thumbnail_url;
    private LocalDateTime created_on;
    private LocalDateTime updated_on;
}
