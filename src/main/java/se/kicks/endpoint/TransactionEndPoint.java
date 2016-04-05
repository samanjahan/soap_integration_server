package se.kicks.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import se.kicks.xmlObjects.Transactions;


@Endpoint
public class TransactionEndPoint {

    private static final String NAMESPACE_URI = "http://localhost:8081/ws";

    private TransactionsRepository transactionsRepository;

    @Autowired
    public TransactionEndPoint(TransactionsRepository transactionsRepository) {
        this.transactionsRepository = transactionsRepository;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTransactionRequest")
    @ResponsePayload
    public Transactions getTransaction(){
        return transactionsRepository.geTransaction();
    }
}
