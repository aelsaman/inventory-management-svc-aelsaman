package com.ibm.inventory_management.controllers;

import com.ibm.inventory_management.models.StockItem;
import com.ibm.inventory_management.services.StockItemApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockItemController {

  private final StockItemApi service;

  @Autowired
  public StockItemController(StockItemApi service) {
    this.service = service;
  }

  @GetMapping(path = "/stock-items", produces = "application/json")
  public List<StockItem> listStockItems() {
    return this.service.listStockItems();
  }
}
