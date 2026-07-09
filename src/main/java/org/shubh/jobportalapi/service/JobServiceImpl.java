package org.shubh.jobportalapi.service;

import org.shubh.jobportalapi.entity.Job;
import org.shubh.jobportalapi.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService
{
    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository)
    {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job createJob(Job job)
    {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getAllJob()
    {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> getJobById(Long id)
    {
        return jobRepository.findById(id);
    }

}
