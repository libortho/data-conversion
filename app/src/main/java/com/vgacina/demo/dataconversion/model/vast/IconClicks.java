
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * IconClicks<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "IconClicks")
@Namespace(reference = "")
public class IconClicks {

    @ElementList(name = "IconClickTracking", entry = "IconClickTracking", inline = true, required = false)
    private List<String> iconClickTracking;
    @Element(name = "IconClickThrough", required = false)
    private String iconClickThrough;

    public IconClicks() {
    }

    public List<String> getIconClickTracking() {
        return iconClickTracking;
    }

    public void setIconClickTracking(List<String> iconClickTracking) {
        this.iconClickTracking = iconClickTracking;
    }

    public String getIconClickThrough() {
        return iconClickThrough;
    }

    public void setIconClickThrough(String iconClickThrough) {
        this.iconClickThrough = iconClickThrough;
    }

}
