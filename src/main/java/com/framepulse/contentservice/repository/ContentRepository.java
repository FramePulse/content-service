package com.framepulse.contentservice.repository;

import com.framepulse.contentservice.entity.Content;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CassandraRepository<Content, String> {

}
