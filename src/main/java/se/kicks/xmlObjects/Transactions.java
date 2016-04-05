package se.kicks.xmlObjects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Transactions {

    @XmlElement
    List<Transaction> transaction = new ArrayList<>();

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }
}
