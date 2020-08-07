package com.example.trips_documenter.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trips_documenter.item.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
