package com.sample.blog;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "blog", path = "blog")
public interface BlogRepo extends MongoRepository<Blog,String> {
    
}
