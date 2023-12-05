package com.example.blogapi.repo;

import com.example.blogapi.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Integer> {

}
