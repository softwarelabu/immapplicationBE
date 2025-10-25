package com.softlab.applicationHouse.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.softlab.applicationHouse.dto.ItemDTO;

@Component
public interface IItemFacade {

    List<ItemDTO> fetchAllItems();

}
