package se.kicks.xmlObjects;


import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Payments {

    @XmlElement
    List<PaymentEntry> paymentEntries = new ArrayList<>();


    public List<PaymentEntry> getPaymentEntries() {
        return paymentEntries;
    }

    public void setPaymentEntries(PaymentEntry paymentEntry) {
        this.paymentEntries.add(paymentEntry);
    }
}
