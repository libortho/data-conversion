
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "delivery")
@Namespace(reference = "")
public enum Delivery {

    streaming,
    progressive;

}
