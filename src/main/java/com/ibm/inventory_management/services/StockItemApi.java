package com.ibm.inventory_management.services;

import com.ibm.inventory_management.models.StockItem;

import java.util.List;

public interface StockItemApi {
  List<StockItem> listStockItems();
}
