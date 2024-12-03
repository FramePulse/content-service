package com.framepulse.contentservice.service;

import com.framepulse.common.service.AbstractCassandraService;
import com.framepulse.contentservice.entity.Content;
import com.framepulse.contentservice.repository.ContentRepository;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentService extends AbstractCassandraService<Content, String, ContentRepository> {
}
