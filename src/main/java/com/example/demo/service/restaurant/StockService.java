package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Stock;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStockData(){
        return stockRepository.findAll();
    }

    public void addStock(Stock stock){
        System.out.println(stock);
        stockRepository.save(stock);
    }

    public Stock deleteStock(String stockId){
        Stock stock = stockRepository.findById(stockId).orElseThrow(
                () -> new ResourceNotFoundException("stock is not found with stock Id: " + stockId)
        );
        stockRepository.delete(stock);
        return stock;
    }

    public Stock getStockBystockId(String stockId){
        return stockRepository.findById(stockId).orElseThrow(
                () -> new ResourceNotFoundException("stock is not found with stock id: " + stockId)
        );
    }

    public Stock updateStock(String stockId, Stock stock) {
        Stock updateStock = stockRepository.findById(stockId).orElseThrow(
                () -> new ResourceNotFoundException("stock is not found with stock Id: " + stockId)
        );
        updateStock.setStockId(stock.getStockId());
        updateStock.setItemName(stock.getItemName());
        updateStock.setAmount(stock.getAmount());
        updateStock.setUnitCost(stock.getUnitCost());
        updateStock.setTotalCost(stock.getTotalCost());
        updateStock.setNumberOfItemsAvailable(stock.getNumberOfItemsAvailable());
        updateStock.setDate(stock.getDate());
        stockRepository.save(updateStock);
        return updateStock;
    }

    public List<Object> getAllStockList(){
        return stockRepository.allStockList();
    }

}
