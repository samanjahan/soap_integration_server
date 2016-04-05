package se.kicks.xmlObjects;


public class PaymentEntry {

    int lineNo;
    int tenderType;
    double amountTendered;
    int ChangeLine;

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public int getTenderType() {
        return tenderType;
    }

    public void setTenderType(int tenderType) {
        this.tenderType = tenderType;
    }

    public double getAmountTendered() {
        return amountTendered;
    }

    public void setAmountTendered(double amountTendered) {
        this.amountTendered = amountTendered;
    }

    public int getChangeLine() {
        return ChangeLine;
    }

    public void setChangeLine(int changeLine) {
        ChangeLine = changeLine;
    }
}
