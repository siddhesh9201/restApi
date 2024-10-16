package com.siddhesh.restApi.controller;


import com.siddhesh.restApi.entity.Course;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class Controller {

    private Map<Long, Course> course =new HashMap<>();

    @GetMapping
    public List<Course> getAll(){
        return new ArrayList<>(course.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody Course myCourse){
        course.put(myCourse.getId(), myCourse);
        return true;
    }

    @GetMapping("id/{myId}")
    public Course getCourseId(@PathVariable Long myId){
      return   course.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public Course deleteCourseId(@PathVariable Long myId){
     return  course.remove(myId);
    }


}
