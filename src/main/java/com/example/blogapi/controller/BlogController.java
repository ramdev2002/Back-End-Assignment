package com.example.blogapi.controller;

import com.example.blogapi.entity.Blog;
import com.example.blogapi.repo.BlogRepo;
import com.example.blogapi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/get-all-blogs")
    public ResponseEntity<?> getAllBlogs(){
        return new ResponseEntity<>(blogService.getAllBlogs(), HttpStatus.OK);
    }

    @GetMapping("/get-blog-byId/{blogId}")
    public ResponseEntity<?> getBlogById(@PathVariable("blogId") Integer id){
        return new ResponseEntity<>(blogService.getBlogById(id), HttpStatus.OK);
    }

    @PostMapping("/add-blog")
    public ResponseEntity<?> postBlogs(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.createBlog(blog),HttpStatus.OK);
    }

    @PutMapping("/update-blog/{id}")
    public ResponseEntity<?> updatedBlog(@PathVariable Integer id,@RequestBody Blog updateBlog){
        Blog updated=blogService.updateBlog(id,updateBlog);

        if(updated!=null){
            return new ResponseEntity<>(updated,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
