package com.example.demo.controller.fromEmployee;



import com.example.demo.entity.fromEmployee.OrderNew;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.fromEmployee4.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/getAll")
    public List<OrderNew> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderNew> getOrderById(@PathVariable("id") Long id) {
        OrderNew order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException.ResourceNotFoundException1(String.format("Item not found with id: %d", id)));
        return ResponseEntity.ok(order);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<OrderNew> updateOrder(@PathVariable Long id, @RequestBody OrderNew order) {
        OrderNew existngOrder = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Item not found with id: %d", id)));

        existngOrder.setItemName(order.getItemName());
        existngOrder.setItemId(order.getItemId());
        existngOrder.setRawCost(order.getRawCost());
        existngOrder.setStateGST(order.getStateGST());
        existngOrder.setCentralGST(order.getCentralGST());
        existngOrder.setTotalGST(order.getTotalGST());
        existngOrder.setTotalCost(order.getTotalCost());
        existngOrder.setDescription(order.getDescription());


        OrderNew updateOrder = orderRepository.save(existngOrder);
        return ResponseEntity.ok(order);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        OrderNew order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Item not found with id: %d", id)));

        orderRepository.delete(order);
        return ResponseEntity.noContent().build();
    }


    @PostMapping("/create")
    public ResponseEntity<List<OrderNew>> addOrders(@RequestBody List<OrderNew> orders) {
        List<OrderNew> savedOrders = orderRepository.saveAll(orders);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrders);
    }
    //    }
//        @PostMapping("/create")
//    public ResponseEntity<Order> createOrder(@RequestBody ArrayList<Order> rawOrder) {
//        Order order = null;
//        ResponseEntity<Order> x = null;
//        for (int i=0;i<rawOrder.size();i++)
//        {
//            order = orderRepository.save(rawOrder.get(i));
//
//            x = ResponseEntity.status(HttpStatus.CREATED).body(order);
//        }
//
//        return x;
//
//}
}
