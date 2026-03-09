package com.H.RCapacitador.soft.repository;

import com.H.RCapacitador.soft.domain.Course;
import com.H.RCapacitador.soft.domain.Employee;
import com.H.RCapacitador.soft.domain.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findByEmployee(Employee employee);

    List<Enrollment> findByCourse(Course course);

    Optional<Enrollment> findByEmployeeAndCourse(Employee employee, Course course);
}

