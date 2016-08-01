
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * AdParametersType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
public class AdParametersType {

    @Text(required = true)
    private String value;
    @Attribute(name = "xmlEncoded", required = false)
    private Boolean xmlEncoded;

    public AdParametersType() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getXmlEncoded() {
        return xmlEncoded;
    }

    public void setXmlEncoded(Boolean xmlEncoded) {
        this.xmlEncoded = xmlEncoded;
    }

}
