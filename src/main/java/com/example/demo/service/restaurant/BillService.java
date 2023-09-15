package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Bill;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepository BillRepository;

    public List<Bill> getAllBillsData(){return BillRepository.findAll();}

    public void addBill(Bill bill){
        BillRepository.save(bill);
    }

    public Bill deleteBill(String BillId){
        Bill Bill = BillRepository.findById(BillId).orElseThrow(
                () -> new ResourceNotFoundException("Bill is not found with id: " + BillId)
        );
        BillRepository.delete(Bill);
        return Bill;
    }

    public Bill getBillById(String BillId){
        return BillRepository.findById(BillId).orElseThrow(
                () -> new ResourceNotFoundException("Bill is not found with id: " + BillId)
        );
    }

    public Bill updateBill(String BillId, Bill bill) {
        Bill updateBill = BillRepository.findById(BillId).orElseThrow(
                () -> new ResourceNotFoundException("Bill is not found with id: " + BillId)
        );
        updateBill.setBillId(bill.getBillId());
        updateBill.setDate(bill.getDate());
        updateBill.setAddress(bill.getAddress());
        updateBill.setItem(bill.getItem());
        updateBill.setQuantity(bill.getQuantity());
        updateBill.setPrice(bill.getPrice());
        updateBill.setDiscount(bill.getDiscount());
        updateBill.setAmount(bill.getAmount());
        BillRepository.save(updateBill);
        return updateBill;
    }

}
