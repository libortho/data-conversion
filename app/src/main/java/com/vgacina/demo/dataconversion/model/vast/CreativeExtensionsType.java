
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CreativeExtensionsType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CreativeExtensions_type")
@Namespace(reference = "")
public class CreativeExtensionsType {

    @ElementList(name = "CreativeExtension", entry = "CreativeExtension", inline = true, required = false)
    private List<CreativeExtension> creativeExtension;

    public CreativeExtensionsType() {
    }

    public List<CreativeExtension> getCreativeExtension() {
        return creativeExtension;
    }

    public void setCreativeExtension(List<CreativeExtension> creativeExtension) {
        this.creativeExtension = creativeExtension;
    }

}
