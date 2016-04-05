package se.kicks.xmlObjects;

public class InfocodeEntry {
    int transactionTypr;
    String infoCode;
    String SubCode;
    String Information;
    String no;

    public int getTransactionTypr() {
        return transactionTypr;
    }

    public void setTransactionTypr(int transactionTypr) {
        this.transactionTypr = transactionTypr;
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public String getSubCode() {
        return SubCode;
    }

    public void setSubCode(String subCode) {
        SubCode = subCode;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
