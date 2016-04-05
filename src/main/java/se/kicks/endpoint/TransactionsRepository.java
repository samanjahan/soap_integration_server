package se.kicks.endpoint;

import org.springframework.stereotype.Component;
import se.kicks.generator.CreateTransaction;
import se.kicks.xmlObjects.Header;
import se.kicks.xmlObjects.Transaction;
import se.kicks.xmlObjects.Transactions;

import javax.annotation.PostConstruct;


@Component
public class TransactionsRepository {

    private static final Transactions transactions = new Transactions();

    @PostConstruct
    public void initData() {
        CreateTransaction c = new CreateTransaction();
        for(int i = 0 ; i < 1; ++i){
            transactions.setTransaction(c.createTransaction());
        }

    }


    public Transactions geTransaction(){
        return transactions;
    }
}
