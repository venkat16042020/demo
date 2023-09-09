package com.example.demo.service;

import com.example.demo.entity.BillsApsrtc;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillsService {
    @Autowired
    private BillsRepository BillsRepository;

    public List<BillsApsrtc> getAllBillsData(){return BillsRepository.findAll();}

    public void addBills(BillsApsrtc Bills){
        BillsRepository.save(Bills);
    }

    public BillsApsrtc deleteBills(String BillsId){
        BillsApsrtc Bills = BillsRepository.findById(BillsId).orElseThrow(
                () -> new ResourceNotFoundException("Bills is not found with id: " + BillsId)
        );
        BillsRepository.delete(Bills);
        return Bills;
    }

    public BillsApsrtc getBillsById(String BillsId){
        return BillsRepository.findById(BillsId).orElseThrow(
                () -> new ResourceNotFoundException("Bills is not found with id: " + BillsId)
        );
    }

    public BillsApsrtc updateBills(String BillsId, BillsApsrtc bill) {
        BillsApsrtc updateBills = BillsRepository.findById(BillsId).orElseThrow(
                () -> new ResourceNotFoundException("Bills is not found with id: " + BillsId)
        );
        updateBills.setBillId(bill.getBillId());
        updateBills.setConsumerName(bill.getConsumerName());
        updateBills.setConsumerNo(bill.getConsumerNo());
        updateBills.setAddress(bill.getAddress());
        updateBills.setBillDate(bill.getBillDate());
        updateBills.setDiscountDate(bill.getDiscountDate());
        updateBills.setDueDate(bill.getDueDate());
        updateBills.setBillPeriod(bill.getBillPeriod());
        updateBills.setBillMonth(bill.getBillMonth());
        updateBills.setMeterNo(bill.getMeterNo());
        updateBills.setMetreUnits(bill.getMetreUnits());
        updateBills.setUnitsBased(bill.getUnitsBased());
        updateBills.setBillAmount(bill.getBillAmount());
        updateBills.setDiscountAmount(bill.getDiscountAmount());


        BillsRepository.save(updateBills);
        return updateBills;
    }

}
