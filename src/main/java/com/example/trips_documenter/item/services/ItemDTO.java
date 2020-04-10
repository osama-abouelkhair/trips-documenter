package com.example.trips_documenter.item.services;

import lombok.Data;

@Data
public class ItemDTO {

    public Long Id;

    public Long trip;

    public String name;

    public CostDTO cost;

    public String description;
}
