package com.softlab.applicationHouse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softlab.applicationHouse.dto.ItemDTO;
import com.softlab.applicationHouse.service.ItemFacade;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/items")
public class ItemController {
    private final ItemFacade itemFacade;

    public ItemController(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }


    @GetMapping("api/items")
     public ResponseEntity<List<ItemDTO>> fetchAllItems() {
        return ResponseEntity.ok(this.itemFacade.fetchAllItems());  
    }
    
}
