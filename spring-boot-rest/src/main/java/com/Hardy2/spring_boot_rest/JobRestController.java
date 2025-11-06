package com.Hardy2.spring_boot_rest;

import com.Hardy2.spring_boot_rest.model.JobPost;
import com.Hardy2.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//while using rest....
//@Controller //....if we use controller here then spring will throw error that where is ur jsp bro
//@ResponseBody//that's why we added @ResponseBody here to tell spring that dude just send response body in json dont search for jsp n all
/*
* so here we use @RestController*/
@RestController
@CrossOrigin(origins = "http://localhost:8080/jobPosts")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

//    [ @GetMapping("jobPost/1") ]//we can use it like this but then we have to hard code it m=by ourself which will be really bad
    //so we are going to use Path Variable here
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addNewJob(@RequestBody JobPost jobPost) {/*so here we're going to send json data from the client to the server therefore, so we use @RequestBody*/
        jobService.addnewJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int  postId) {
        jobService.deleteJob(postId);
        return "success";
    }
}
