package com.employee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.model.Insurence;

public interface InsurenceRepo extends JpaRepository<Insurence, String>{

}
