package com.example.trips_documenter.plan.repository;

import com.example.trips_documenter.plan.entity.ActionStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ActionStatusRepository<T extends ActionStatus> extends CrudRepository<T, Integer> {

//    @Query("select s from #{#entityName} as s where s.status = ?1 ")
//    T findOneByStatus(String status);
}
