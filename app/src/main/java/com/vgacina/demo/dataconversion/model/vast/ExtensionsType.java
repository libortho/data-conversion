
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ExtensionsType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Extensions_type")
@Namespace(reference = "")
public class ExtensionsType {

    @ElementList(name = "Extension", entry = "Extension", inline = true, required = false)
    private List<Extension> extension;

    public ExtensionsType() {
    }

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

}
