package com.example.trips_documenter.item.services;

import com.example.trips_documenter.item.entities.Item;
import com.example.trips_documenter.item.entities.ItemFactory;
import com.example.trips_documenter.item.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Currency;

@Service
public class ItemAddition {

    @Autowired
    private ItemRepository itemRepository;

    ModelMapper mapper = new ModelMapper();

    public ItemDTO add(ItemDTO itemDTO, Long userId) {
        //TODO using user id get the user currency
        Item item = new ItemFactory().create(itemDTO.trip,
                itemDTO.name,
                itemDTO.cost.price,
                Currency.getInstance(itemDTO.cost.currency),
                Currency.getInstance("USD"), //USD should be replaced by the user currency
                itemDTO.description);
        item = itemRepository.save(item);
        return mapper.map(item, ItemDTO.class);
    }

}
