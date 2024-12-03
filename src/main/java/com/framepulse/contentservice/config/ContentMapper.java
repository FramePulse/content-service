package com.framepulse.contentservice.config;

import com.framepulse.common.mapper.AbstractMapper;
import com.framepulse.contentservice.dto.ContentDTO;
import com.framepulse.contentservice.entity.Content;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ContentMapper implements AbstractMapper<Content, ContentDTO> {
}
