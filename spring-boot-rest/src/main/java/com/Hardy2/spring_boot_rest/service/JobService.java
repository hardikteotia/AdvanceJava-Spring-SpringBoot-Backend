package com.Hardy2.spring_boot_rest.service;

import com.Hardy2.spring_boot_rest.*;
import com.Hardy2.spring_boot_rest.model.JobPost;
import com.Hardy2.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public String addnewJob(JobPost newJob){
        String msg = "Job has been added Successfuly";
        jobRepo.addJobs(newJob);
        return msg;
    }
    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return jobRepo.getJob(postId);
    }

    public void updateJob(JobPost job) {
        jobRepo.updateJob(job);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteJob(postId);
    }
}
