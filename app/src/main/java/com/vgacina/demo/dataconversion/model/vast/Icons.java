
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Icons<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Icons")
@Namespace(reference = "")
public class Icons {

    @ElementList(name = "Icon", entry = "Icon", inline = true, required = true)
    private List<IconType> icon;

    public Icons() {
    }

    public List<IconType> getIcon() {
        return icon;
    }

    public void setIcon(List<IconType> icon) {
        this.icon = icon;
    }

}
