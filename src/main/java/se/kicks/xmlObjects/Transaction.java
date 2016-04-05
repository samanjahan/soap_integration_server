package se.kicks.xmlObjects;


import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    String store;
    String termianl;
    Long transactionNo;

    @XmlElement
    List<Header> headers = new ArrayList<>();

    @XmlElement
    List<SalesEntries> salesEntries = new ArrayList<>();

    @XmlElement
    Payments payments = new Payments();

    @XmlElement
    Discounts discounts = new Discounts();


    @XmlElement
    Infocodes infocodes = new Infocodes();


    @XmlElement
    List<DiscountEntry> discountEntries = new ArrayList<>();


    public void setStore(String store) {
        this.store = store;
    }


    public void setTermianl(String termianl) {
        this.termianl = termianl;
    }


    public void setTransactionNo(Long transactionNo) {
        this.transactionNo = transactionNo;
    }


    public void setHeaders(Header header) {
        this.headers.add(header);
    }

    public void setSalesEntries(SalesEntries salesEntry) {
        this.salesEntries.add(salesEntry);
    }


    public void setPaymentEntries(PaymentEntry paymentEntry) {
        this.payments.setPaymentEntries(paymentEntry);
    }

    public void setDiscountEntry(DiscountEntry discountEntry){
        discounts.setDiscountEntery(discountEntry);
    }


    public void setInfocodeEntries(InfocodeEntry infocodeEntry) {
        this.infocodes.setDiscountEntery(infocodeEntry);
    }

}
