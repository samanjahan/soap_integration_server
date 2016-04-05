package se.kicks.xmlObjects;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Infocodes {


    @XmlElement
    List<InfocodeEntry> infocodeEntry = new ArrayList<>();

    public void setDiscountEntery(InfocodeEntry infocodeEntry) {
        this.infocodeEntry.add(infocodeEntry);
    }
}
