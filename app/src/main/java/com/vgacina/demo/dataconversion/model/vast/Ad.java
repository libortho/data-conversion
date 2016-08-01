
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Ad<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
public class Ad {

    @Element(name = "InLine", required = false)
    private InLine inLine;
    @Element(name = "Wrapper", required = false)
    private Wrapper wrapper;
    @Attribute(name = "sequence", required = false)
    private Integer sequence;
    @Attribute(name = "id", required = false)
    private String id;

    public Ad() {
    }

    public InLine getInLine() {
        return inLine;
    }

    public void setInLine(InLine inLine) {
        this.inLine = inLine;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
