package com.celebrityApp.celebrity_api.repository;

import com.celebrityApp.celebrity_api.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,String> {
}
