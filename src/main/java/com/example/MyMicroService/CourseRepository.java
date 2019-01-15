package com.example.MyMicroService;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface  CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
