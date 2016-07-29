
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "event")
@Namespace(reference = "")
public enum Event {

    creativeView,
    start,
    firstQuartile,
    midpoint,
    thirdQuartile,
    complete,
    mute,
    unmute,
    pause,
    rewind,
    resume,
    fullscreen,
    exitFullscreen,
    expand,
    collapse,
    acceptInvitation,
    close,
    skip,
    progress;

}
