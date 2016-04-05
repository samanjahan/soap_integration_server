package se.kicks.generator;

import se.kicks.xmlObjects.*;

public class CreateTransaction {

    public Transaction createTransaction(){
        Transaction tr = new Transaction();
        tr.setTermianl("P0001");
        tr.setStore("S0001");
        tr.setTransactionNo(369L);
        tr.setHeaders(createHeader());
        tr.setSalesEntries(createSalesEntries());
        tr.setPaymentEntries(createPaymentsEntry());
        tr.setDiscountEntry(createDiscountEntry());
        tr.setDiscountEntry(createDiscountEntry());
        tr.setInfocodeEntries(createInfoEntery());
        return tr;

    }


    public DiscountEntry createDiscountEntry(){
        DiscountEntry discountEntry = new DiscountEntry();
        discountEntry.setOfferType(3);
        discountEntry.setOfferNo("P1020");
        discountEntry.setDiscountAmount(10.31000000000000000000);
        discountEntry.setLineNo(10000);
        discountEntry.setMemberAttribute("");
        discountEntry.setMemberAttributeValue("");
        discountEntry.setPoint(0.00000000000000000000);
        discountEntry.setSeqCode(0);
        discountEntry.setSeqFunction(0);
        discountEntry.setTrackingNo("");
        return discountEntry;


    }

    public Header createHeader(){
        Header header = new Header();
        header.setReceiptNo("00000P0001000001810");
        header.setStaff("101");
        header.setType(2);
        header.setGrossAmount(0.00000000000000000000);
        header.setDiscountAmount(0.00000000000000000000);
        return header;
    }

    public SalesEntries createSalesEntries(){
        SalesEntries salesEntries = new SalesEntries();
        salesEntries.setLineNo(10000L);
        salesEntries.setItemNo(10616860);
        salesEntries.setNetAmount(-112.00000000000000000000);
        salesEntries.setVatAmount(-28.00000000000000000000);
        salesEntries.setQuantity(0.00000000000000000000);
        return salesEntries;
    }

    public PaymentEntry createPaymentsEntry(){
        PaymentEntry paymentEntry = new PaymentEntry();
        paymentEntry.setLineNo(20000);
        paymentEntry.setTenderType(1);
        paymentEntry.setAmountTendered(140.00000000000000000000);
        paymentEntry.setChangeLine(0);
        return paymentEntry;

    }

    public InfocodeEntry createInfoEntery(){
        InfocodeEntry infocodeEntry = new InfocodeEntry();
        infocodeEntry.setTransactionTypr(0);
        infocodeEntry.setInfoCode("RETURN");
        infocodeEntry.setSubCode("5");
        infocodeEntry.setInformation("5");
        infocodeEntry.setNo("");
        return infocodeEntry;

    }

}


