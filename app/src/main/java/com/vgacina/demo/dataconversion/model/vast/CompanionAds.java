
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CompanionAds<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
public class CompanionAds {

    @ElementList(name = "Companion", entry = "Companion", inline = true, required = false)
    private List<CompanionType> companion;
    @Attribute(name = "required", required = false)
    private Required required;

    public CompanionAds() {
    }

    public List<CompanionType> getCompanion() {
        return companion;
    }

    public void setCompanion(List<CompanionType> companion) {
        this.companion = companion;
    }

    public Required getRequired() {
        return required;
    }

    public void setRequired(Required required) {
        this.required = required;
    }

}
