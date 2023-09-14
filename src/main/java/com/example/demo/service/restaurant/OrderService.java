package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Order9;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order9> getAllOrdersData(){
        return orderRepository.findAll();
    }

    public void addOrder(Order9 order){
        orderRepository.save(order);
    }

    public Order9 deleteOrder(String orderId){
        Order9 order = orderRepository.findById(orderId).orElseThrow(
                () -> new ResourceNotFoundException("Order is not found with id: " + orderId)
        );
        orderRepository.delete(order);
        return order;
    }

    public Order9 getOrderById(String orderId){
        return orderRepository.findById(orderId).orElseThrow(
                () -> new ResourceNotFoundException("Order is not found with id: " + orderId)
        );
    }

    public Order9 updateOrder(String orderId, Order9 order) {
        Order9 updateOrder = orderRepository.findById(orderId).orElseThrow(
                () -> new ResourceNotFoundException("Order is not found with id: " + orderId)
        );
        updateOrder.setOrderId(order.getOrderId());
        updateOrder.setItemId(order.getItemId());
        updateOrder.setItemName(order.getItemName());
        updateOrder.setNumberOfItems(order.getNumberOfItems());
        updateOrder.setCost(order.getCost());
        updateOrder.setDiscount(order.getDiscount());
        updateOrder.setCouponId(order.getCouponId());
        updateOrder.setIsTakeAway(order.getIsTakeAway());
        orderRepository.save(updateOrder);
        return updateOrder;
    }

}
