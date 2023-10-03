package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService {

    TradeAccountRepository tradeAccountRepository;

    //create CRUD methods for MarginAccount objects that interact with the TradeAccountRepository class

    public MarginAccountService(TradeAccountRepository tradeAccountRepository){
        this.tradeAccountRepository = tradeAccountRepository;
    }

    public void createTradeAccount(MarginAccount account){
        this.tradeAccountRepository.createTradeAccount(account);
    }

    public MarginAccount retrieveTradeAccount(String id){
        return (MarginAccount)this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount account){
        this.tradeAccountRepository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id){
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

    // override the deposit and withdraw methods from TradeAccountService class
    // add or subtract to margin of the specified MarginAccount object

    @Override
    public void deposit(String id, BigDecimal amount){
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount){
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }

}