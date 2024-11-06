package com.cassandrademo.repository;

import com.cassandrademo.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, String> {

}
