package org.shubh.jobportalapi.controller;


import org.shubh.jobportalapi.entity.Job;
import org.shubh.jobportalapi.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobs")
public class JobController
{
    private final JobService jobService;

    public JobController(JobService jobService)
    {
        this.jobService = jobService;
    }

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job)
    {
        Job savedJob = jobService.createJob(job);
        return ResponseEntity.ok(savedJob);

    }

    @GetMapping
    public ResponseEntity<List<Job>> getAllJob()
    {
        List<Job> jobs = jobService.getAllJob();
        return ResponseEntity.ok(jobs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id)
    {
        Optional<Job> job = jobService.getJobById(id);

        if(job.isPresent())
        {
            return ResponseEntity.ok(job.get());
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }

}
