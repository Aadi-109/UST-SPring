package com.ust.JobNotificationApplication.controller;

import com.ust.JobNotificationApplication.model.JobNotification;
import com.ust.JobNotificationApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ust")
public class JobNotiControll
{

    @Autowired
    private JobNotificationService jobNotificationService;

    @PostMapping
    public ResponseEntity<JobNotification> createJob(@RequestBody JobNotification jobNotification) 
    {
        JobNotification createdJob = jobNotificationService.addJob(jobNotification);
        return ResponseEntity.ok(createdJob);
    }

    @GetMapping
    public ResponseEntity<List<JobNotification>> getAllJobs() 
    {
        List<JobNotification> jobs = jobNotificationService.getAllJobs();
        return ResponseEntity.ok(jobs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobNotification> getJobById(@PathVariable Long id) 
    {
        Optional<JobNotification> jobNotification = jobNotificationService.getJobById(id);
        if (jobNotification.isPresent()) 
        {
            return ResponseEntity.ok(jobNotification.get());
        } 
        else 
        {
            return ResponseEntity.notFound().build();
        }
    }
}
