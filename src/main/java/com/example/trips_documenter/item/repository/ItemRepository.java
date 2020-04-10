package com.example.trips_documenter.item.repository;

import com.example.trips_documenter.item.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
