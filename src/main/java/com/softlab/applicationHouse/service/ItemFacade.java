package com.softlab.applicationHouse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softlab.applicationHouse.dto.ItemDTO;
import com.softlab.applicationHouse.mapper.ItemMapper;
import com.softlab.applicationHouse.repository.ItemRepository;

@Service
public class ItemFacade implements IItemFacade {
  //tools for service  
  private final ItemRepository itemRepository ;
  private final ItemMapper itemMapper ;

// Constructor
public ItemFacade(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    // Add service methods here using itemRepository and itemMapper
@Override
public List<ItemDTO> fetchAllItems() {
  return this.itemRepository.findAll().stream().map(itemMapper::ItemToItemDTO).toList();
}
}
