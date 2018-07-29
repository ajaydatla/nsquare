package com.nsquare.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nsquare.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, String>  {
	
	public User findByUserId(String userId);

}
