
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * ClickTracking<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
public class ClickTracking {

    @Text(required = true)
    private String value;
    @Attribute(name = "id", required = false)
    private String id;

    public ClickTracking() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
