package com.bew.SpringProj.repo;

import java.util.ArrayList;
import java.util.List;

import com.bew.SpringProj.model.JobPost;
import org.springframework.stereotype.Repository;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>();
    public JobRepo() {
        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
        // Frontend Developer Job Post
        jobs.add(
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));
        // Data Scientist Job Post
        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));
    }
    public List<JobPost> getalljobs(){
        return jobs;
    }
    public void addjob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
