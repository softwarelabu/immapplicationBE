package com.softlab.applicationHouse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softlab.applicationHouse.dto.ItemDTO;
import com.softlab.applicationHouse.mapper.ItemMapper;
import com.softlab.applicationHouse.repository.ItemRepository;

@Service
public class ItemFacade {
    private final ItemRepository itemRepository ;
    private final ItemMapper itemMapper ;
public ItemFacade(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    // Add service methods here using itemRepository and itemMapper
public List<ItemDTO> fetchAllItems() {
  return this.itemRepository.findAll().stream().map(itemMapper::ItemToItemDTO).toList();
}
}
