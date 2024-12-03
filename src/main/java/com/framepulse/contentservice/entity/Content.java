package com.framepulse.contentservice.entity;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Content implements Serializable {
     @PrimaryKey
     private String id;
     private String content_url;
     private String user_id;
     private String title;
     private List<String> tags;
     private String thumbnail_url;
     private LocalDateTime created_on;
     private LocalDateTime updated_on;

}
