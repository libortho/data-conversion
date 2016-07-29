
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "model")
@Namespace(reference = "")
public enum Model {

    cpc,
    cpm,
    cpe,
    cpv;

}
