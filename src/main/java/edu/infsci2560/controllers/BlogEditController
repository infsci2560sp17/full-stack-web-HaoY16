/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Blog;
import edu.infsci2560.repositories.BlogRepository;
import edu.infsci2560.repositories.RatingRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author kolobj
 */
@Controller
public class BlogEditController {
    @Autowired
    private BlogRepository blogRepository;
    
    @Autowired
    private RatingRepository ratingRepository; 
    
    @RequestMapping(value = "blogs/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {                 
        ModelAndView mv = new ModelAndView("blogEdit");
        Blog blog = blogRepository.findOne(id);
        mv.addObject("blog", blog);
//        mv.addObject("ratings", ratingRepository.findAll());
        mv.addObject("ratings", ratingRepository.findByRatingPkBlogId(blog.getId(), new PageRequest(0, 10)));
        return mv;
    }
    
    @RequestMapping(value = "blogs/edit/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Blog blog, BindingResult result) {
        blogRepository.save(blog);
        return "redirect:/blogs";
    }        
}
