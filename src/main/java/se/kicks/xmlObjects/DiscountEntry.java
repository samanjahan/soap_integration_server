package se.kicks.xmlObjects;

public class DiscountEntry {

    int offerType;
    String offerNo;
    double discountAmount;
    int lineNo;
    String memberAttribute;
    String memberAttributeValue;
    double point;
    int seqCode;
    int seqFunction;
    String TrackingNo;

    public int getOfferType() {
        return offerType;
    }

    public void setOfferType(int offerType) {
        this.offerType = offerType;
    }

    public String getOfferNo() {
        return offerNo;
    }

    public void setOfferNo(String offerNo) {
        this.offerNo = offerNo;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public String getMemberAttribute() {
        return memberAttribute;
    }

    public void setMemberAttribute(String memberAttribute) {
        this.memberAttribute = memberAttribute;
    }

    public String getMemberAttributeValue() {
        return memberAttributeValue;
    }

    public void setMemberAttributeValue(String memberAttributeValue) {
        this.memberAttributeValue = memberAttributeValue;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public int getSeqCode() {
        return seqCode;
    }

    public void setSeqCode(int seqCode) {
        this.seqCode = seqCode;
    }

    public int getSeqFunction() {
        return seqFunction;
    }

    public void setSeqFunction(int seqFunction) {
        this.seqFunction = seqFunction;
    }

    public String getTrackingNo() {
        return TrackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        TrackingNo = trackingNo;
    }
}
