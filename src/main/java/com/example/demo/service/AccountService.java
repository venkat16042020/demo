package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccountsData(){
        return accountRepository.findAll();
    }

    public void addAccount(Account account){
        accountRepository.save(account);
    }

    public Account deleteAccount(String accountId){
        Account account = accountRepository.findById(accountId).orElseThrow(
                () -> new ResourceNotFoundException("Account is not found with id: " + accountId)
        );
        accountRepository.delete(account);
        return account;
    }

    public Account getAccountById(String accountId){
        return accountRepository.findById(accountId).orElseThrow(
                () -> new ResourceNotFoundException("Account is not found with id: " + accountId)
        );
    }

    public Account updateAccount(String accountId, Account account) {
        Account updateAccount = accountRepository.findById(accountId).orElseThrow(
                () -> new ResourceNotFoundException("Account is not found with id: " + accountId)
        );
        updateAccount.setAccountId(account.getAccountId());
        updateAccount.setAccountName(account.getAccountName());
        updateAccount.setCreatedOn(account.getCreatedOn());
        updateAccount.setCreatedBy(account.getCreatedBy());
        updateAccount.setCreatedBranch(account.getCreatedBranch());
        updateAccount.setBranchAdd(account.getBranchAdd());
        updateAccount.setBranchManagerId(account.getBranchManagerId());
        updateAccount.setAmount(account.getAmount());
        updateAccount.setBlockedAmount(account.getBlockedAmount());
        updateAccount.setFinalAmount(account.getFinalAmount());
        updateAccount.setAccountPlan(account.getAccountPlan());
        updateAccount.setAccountSubPlan(account.getAccountSubPlan());
        updateAccount.setAccCurrentManager(account.getAccCurrentManager());
        updateAccount.setAccountStatus(account.getAccountStatus());
        accountRepository.save(updateAccount);
        return updateAccount;
    }

}
