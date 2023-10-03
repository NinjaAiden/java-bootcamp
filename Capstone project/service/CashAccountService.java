package service;

import java.math.BigDecimal;

import pojo.CashAccount;
import repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService {

    TradeAccountRepository tradeAccountRepository;

    //create CRUD methods for CashAccount objects that interact with the TradeAccountRepository class

    public CashAccountService(TradeAccountRepository tradeAccountRepository){
        this.tradeAccountRepository = tradeAccountRepository;
    }

    public void createTradeAccount(CashAccount account){
        this.tradeAccountRepository.createTradeAccount(account);
    }

    public CashAccount retrieveTradeAccount(String id){
        return (CashAccount)this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount account){
        this.tradeAccountRepository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id){
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

    // override the deposit and withdraw methods from TradeAccountService class
    // add or subtract to cashBalance of the specified CashAccount object

    @Override
    public void deposit(String id, BigDecimal amount){
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().add(amount));
        updateTradeAccount(cashAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount){
        CashAccount cashAccount = retrieveTradeAccount(id);
        cashAccount.setCashBalance(cashAccount.getCashBalance().subtract(amount));
        updateTradeAccount(cashAccount);
    }

}
