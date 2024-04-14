package com.example.demo.controller.fromEmployee;


import com.example.demo.entity.fromEmployee.ItemNew;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.fromEmployee4.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<ItemNew> createItem(@RequestBody ItemNew item) {
        ItemNew createdItem = itemRepository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItem);
    }

    @GetMapping("/getAll")
    public List<ItemNew> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemNew> getItemById(@PathVariable("id") Long id) {
        ItemNew item = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Item not found with id: %d", id)));
        return ResponseEntity.ok(item);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ItemNew> updateItem(@PathVariable Long id, @RequestBody ItemNew item) {
        ItemNew existingItem = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Item not found with id: %d", id)));

        existingItem.setItemName(item.getItemName());
        existingItem.setRawCost(item.getRawCost());
        existingItem.setStateGST(item.getStateGST());
        existingItem.setCentralGST(item.getCentralGST());
        existingItem.setTotalGST(item.getTotalGST());
        existingItem.setTotalCost(item.getTotalCost());
        existingItem.setDescription(item.getDescription());


        ItemNew updatedItem = itemRepository.save(existingItem);
        return ResponseEntity.ok(updatedItem);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        ItemNew item = itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Item not found with id: %d", id)));

        itemRepository.delete(item);
        return ResponseEntity.noContent().build();
    }
}

