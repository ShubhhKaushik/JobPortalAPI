package org.shubh.jobportalapi.repository;
import org.shubh.jobportalapi.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Long> {

}
