
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "required")
@Namespace(reference = "")
public enum Required {

    all,
    any,
    none;

}
