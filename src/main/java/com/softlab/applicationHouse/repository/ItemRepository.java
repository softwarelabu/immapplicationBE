package com.softlab.applicationHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlab.applicationHouse.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
