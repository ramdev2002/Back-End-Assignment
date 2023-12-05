package com.example.blogapi.service;

import com.example.blogapi.entity.Blog;
import com.example.blogapi.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepo blogRepo;
    //method for get all Blogs
    public List<Blog> getAllBlogs(){
        return blogRepo.findAll();
    }

    /* method for get Blogs by Id */
    public Blog getBlogById(Integer id){
        return blogRepo.findById(id).orElse(null);

    }
    //method for post the blogs
    public Blog createBlog(Blog blog){
        return blogRepo.save(blog);
    }

    //method for update the blog
    public Blog updateBlog(Integer id,Blog updateBlog){
        Blog existingBlog=blogRepo.findById(id).orElse(null);
        if(existingBlog!=null){
            existingBlog.setTitle(updateBlog.getTitle());
            existingBlog.setDescription(updateBlog.getDescription());
            existingBlog.setCategory(updateBlog.getCategory());

            return blogRepo.save(existingBlog);
        }
        return null;
    }
}
