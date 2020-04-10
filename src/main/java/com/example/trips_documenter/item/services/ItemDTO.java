package com.example.trips_documenter.item.services;

import lombok.Data;

@Data
public class ItemDTO {

    public Long Id;

    public Long tripId;

    public String name;

    public CostDTO cost;

    public String description;
}
