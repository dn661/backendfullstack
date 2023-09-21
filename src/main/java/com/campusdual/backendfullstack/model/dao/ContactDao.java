package com.campusdual.backendfullstack.model.dao;

import com.campusdual.backendfullstack.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.websocket.Session;
import java.util.List;

public interface ContactDao extends JpaRepository<Product, Integer> {

}
