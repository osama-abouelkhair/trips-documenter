package com.example.trips_documenter.item.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ItemAdditionTests {

    @Autowired
    ItemAddition itemAddition;

    @Test
    void addTest() throws Exception {
        ItemDTO item = new ItemDTO();
        item.name = "item 1";
        item.trip = 1L;
        item.description = "description";
        CostDTO cost= new CostDTO();
        cost.price = 140F;
        cost.currency = "EUR";
        item.cost = cost;
        ItemDTO addedItem = itemAddition.add(item, 1L);
        assertThat(addedItem.Id).isNotNull();
    }
}
