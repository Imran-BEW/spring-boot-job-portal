package com.bew.SpringProj.controller;
import java.util.List;

import com.bew.SpringProj.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bew.SpringProj.model.JobPost;

@Controller
public class JobController {

    @Autowired
    public JobService service;

    @GetMapping({"/", "/home"})
	public String home() {
        return "home";
	}
	@GetMapping("/addjob")
	public String addjob() {
        return "addjob";
	}

    @GetMapping("/viewalljobs")
    public String vewalljobs(Model m){
        List<JobPost> jobPosts = service.getalljobs();
        m.addAttribute("jobPosts",jobPosts);
        return"viewalljobs";
    }
	@PostMapping("/handleForm")
	public String handleForm(JobPost jobPost) {
		service.addjob(jobPost);
        return "success";
	}
}
