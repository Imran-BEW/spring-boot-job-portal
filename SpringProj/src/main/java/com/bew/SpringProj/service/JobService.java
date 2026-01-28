package com.bew.SpringProj.service;

import java.util.List;
import com.bew.SpringProj.model.JobPost;
import com.bew.SpringProj.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public List<JobPost> getalljobs(){
        return repo.getalljobs();
    }
    public void addjob(JobPost jobPost){
        repo.addjob(jobPost);
    }
}
