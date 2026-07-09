package org.shubh.jobportalapi.service;

import org.shubh.jobportalapi.entity.Job;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface JobService
{

    Job createJob(Job job);

    List<Job> getAllJob();

    Optional<Job> getJobById(Long id);
}
