package com.framepulse.contentservice.controller;

import com.framepulse.contentservice.config.ContentMapper;
import com.framepulse.contentservice.dto.ContentDTO;
import com.framepulse.contentservice.entity.Content;
import com.framepulse.contentservice.repository.ContentRepository;
import com.framepulse.contentservice.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
public class ContentController  {

    @Autowired
    private ContentService contentService;

    @Autowired
    private ContentMapper contentMapper;

    @PostMapping
    public ResponseEntity<ContentDTO> createContent(@RequestBody ContentDTO contentDTO){
        Content content = contentMapper.dtoToEntity(contentDTO);
        content = contentService.save(content);
        return ResponseEntity.ok(contentMapper.entityToDto(content));
    }
}
