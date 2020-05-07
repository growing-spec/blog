package com.rooper.blog.web;

import com.rooper.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexContoller {
    @GetMapping(/*"/{id}/{name}"*/)
    public String index(/*@PathVariable Integer id, @PathVariable String name*/){

/*        *//*int i = 9/0;*//*
        String blog = null;
        if(blog == null){
            throw new NotFoundException();
        }*/
/*        System.out.println("--------------index--------------"+id+name);*/
        return "types";
    }



}
