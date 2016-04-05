package se.kicks.xmlObjects;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Discounts {

    @XmlElement
    List<DiscountEntry> discountEntery = new ArrayList<>();

    public void setDiscountEntery(DiscountEntry discountEntery) {
        this.discountEntery.add(discountEntery);
    }
}
