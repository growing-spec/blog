package com.rooper.blog.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lipeng
 * @version 1.0
 * @date 2020/4/29 16:56
 */

@Entity
@Table(name = "t_tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

    @Override
    public String toString() {
        return "tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Tag() {
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
