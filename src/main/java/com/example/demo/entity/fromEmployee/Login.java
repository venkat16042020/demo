package com.example.demo.entity.fromEmployee;//package Student.NRI.model;
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Getter
//@Setter
//
//public class Login {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String email;
//    private String password;
//}
//
//import Student.NRI.model.Order;
//import jakarta.transaction.Transactional;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@PostMapping("/create")
//@Transactional
//public ResponseEntity<List<Order>> createOrder(@RequestBody List<Order> rawOrder) {
//    List<Order> savedOrders = new ArrayList<>();
//    for (Order order : rawOrder) {
//        Order savedOrder = orderRepository.save(order);
//        savedOrders.add(savedOrder);
//    }
//    return ResponseEntity.status(HttpStatus.CREATED).body(savedOrders);
//}
//@PostMapping("/create")
//@Transactional
//public ResponseEntity<List<Order>> createOrder(@RequestBody List<Order> rawOrder) {
//    List<Order> savedOrders = new ArrayList<>();
//    for (Order order : rawOrder) {
//        Order savedOrder = orderRepository.save(order);
//        savedOrders.add(savedOrder);
//    }
//    return ResponseEntity.status(HttpStatus.CREATED).body(savedOrders);
//}
//




//package Student.NRI.Controller;
//import Student.NRI.Exception.ResourceNotFoundException;
//import Student.NRI.Repository.OrderRepository;
//import Student.NRI.model.Order;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//    private final OrderRepository orderRepository;
//
//    @Autowired
//    public OrderController(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @GetMapping("/getAll")
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    @GetMapping("/getById/{id}")
//    public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//        return ResponseEntity.ok(order);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order updatedOrder) {
//        Order existingOrder = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//
//        existingOrder.setItemName(updatedOrder.getItemName());
//        existingOrder.setRawCost(updatedOrder.getRawCost());
//        existingOrder.setStateGST(updatedOrder.getStateGST());
//        existingOrder.setCentralGST(updatedOrder.getCentralGST());
//        existingOrder.setTotalGST(updatedOrder.getTotalGST());
//        existingOrder.setTotalCost(updatedOrder.getTotalCost());
//        existingOrder.setDescription(updatedOrder.getDescription());
//
//        // Update other fields as needed...
//
//        Order updated = orderRepository.save(existingOrder);
//        return ResponseEntity.ok(updated);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//
//        orderRepository.delete(order);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<List<Order>> createOrder(@RequestBody List<Order> rawOrders) {
//        // Generate a single orderId for all orders
//        Long orderId = generateOrderId();
//
//        // Assign the same orderId to each order
//        for (Order order : rawOrders) {
//            order.setOrderId(orderId);
//        }
//
//        // Save all orders with the same orderId
//        List<Order> savedOrders = orderRepository.saveAll(rawOrders);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrders);
//    }
//    private Long generateOrderId() {
//        // Implement your logic to generate a unique orderId
//        // For simplicity, let's just return a random number for now
//        return Math.round(Math.random() * 1000);
//    }
//}
//



















































//package Student.NRI.Controller;
//
//import Student.NRI.Exception.ResourceNotFoundException;
//import Student.NRI.Repository.OrderRepository;
//import Student.NRI.model.Order;
//import Student.NRI.model.Student;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//    private final OrderRepository orderRepository;
//
//    @Autowired
//    public OrderController(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @GetMapping("/getAll")
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    @GetMapping("/getById/{id}")
//    public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//        return ResponseEntity.ok(order);
//    }
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order updatedOrder) {
//        Order existingOrder = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//
//        existingOrder.setItemName(updatedOrder.getItemName());
//        existingOrder.setRawCost(updatedOrder.getRawCost());
//        existingOrder.setStateGST(updatedOrder.getStateGST());
//        existingOrder.setCentralGST(updatedOrder.getCentralGST());
//        existingOrder.setTotalGST(updatedOrder.getTotalGST());
//        existingOrder.setTotalCost(updatedOrder.getTotalCost());
//        existingOrder.setDescription(updatedOrder.getDescription());
//
//        // Update other fields as needed...
//
//        Order updated = orderRepository.save(existingOrder);
//        return ResponseEntity.ok(updated);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
//
//        orderRepository.delete(order);
//        return ResponseEntity.noContent().build();
//    }
//
////    @PostMapping("/create")
////    public ResponseEntity<Order> createOrder(@RequestBody ArrayList<Order> rawOrder) {
////        Order order = null;
////        ResponseEntity<Order> x = null;
////        for (int i=0;i<rawOrder.size();i++)
////        {
////            order = orderRepository.save(rawOrder.get(i));
////
////            x = ResponseEntity.status(HttpStatus.CREATED).body(order);
////        }
////
////        return x;
////
////}
//
//@PostMapping("/create")
//public ResponseEntity<Order> createOrder(@RequestBody Order rawOrder) {
//    Order order = orderRepository.save(rawOrder);
//    return ResponseEntity.status(HttpStatus.CREATED).body(order);
//}
//
////    @PostMapping("/create")
////    public ResponseEntity<List<Order>> createOrder(@RequestBody Order rawOrder) {
////        List<Order> orderList = new ArrayList<>();
////        orderList.add(orderRepository.save(rawOrder));
////        return ResponseEntity.status(HttpStatus.CREATED).body(orderList);
////    }
//}
//
//
////@PostMapping("/create")
////@Transactional
////public ResponseEntity<List<Order>> createOrder(@RequestBody List<Order> rawOrder) {
////    List<Order> savedOrders = new ArrayList<>();
////    for (Order order : rawOrder) {
////        Order savedOrder = orderRepository.save(order);
////        savedOrders.add(savedOrder);
////    }
////    return ResponseEntity.status(HttpStatus.CREATED).body(savedOrders);
////}
////
