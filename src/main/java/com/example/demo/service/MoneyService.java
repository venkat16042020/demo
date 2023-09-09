package com.example.demo.service;

import com.example.demo.entity.Money;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyService {
    @Autowired
    private MoneyRepository moneyRepository;

    public List<Money> getAllMoneyData(){
        return moneyRepository.findAll();
    }

    public void addMoney(Money money){
        moneyRepository.save(money);
    }

    public Money deleteMoney(String MoneyId){
        Money money = moneyRepository.findById(MoneyId).orElseThrow(
                () -> new ResourceNotFoundException("Money is not found with id: " + MoneyId)
        );
        moneyRepository.delete(money);
        return money;
    }

    public Money getMoneyById(String MoneyId){
        return moneyRepository.findById(MoneyId).orElseThrow(
                () -> new ResourceNotFoundException("Money is not found with id: " + MoneyId)
        );
    }

    public Money updateMoney(String MoneyId, Money money) {
        Money updateMoney = moneyRepository.findById(MoneyId).orElseThrow(
                () -> new ResourceNotFoundException("Money is not found with id: " + MoneyId)
        );
        updateMoney.setMoney(money.getMoney());
        updateMoney.setCommercialMoney(money.getCommercialMoney());
        updateMoney.setFiduciaryMoney(money.getFiduciaryMoney());
        updateMoney.setFaitMoney(money.getFaitMoney());
        updateMoney.setCommodityMoney(money.getCommodityMoney());
        moneyRepository.save(updateMoney);
        return updateMoney;
    }

}
