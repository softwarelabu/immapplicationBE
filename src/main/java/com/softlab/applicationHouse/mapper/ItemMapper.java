package com.softlab.applicationHouse.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.softlab.applicationHouse.dto.ItemDTO;
import com.softlab.applicationHouse.entity.Item;

@Mapper(componentModel = "spring")
@ComponentScan
public interface ItemMapper {

    ItemDTO ItemToItemDTO(Item item);

    Item ItemDTOToItem(ItemDTO itemDTO);
}
