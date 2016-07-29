
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Linear<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Linear")
@Namespace(reference = "")
public class Linear {

    @Element(name = "Icons", required = false)
    private Icons icons;
    @Element(name = "CreativeExtensions", required = false)
    private CreativeExtensionsType creativeExtensions;
    @Element(name = "Duration", required = true)
    private String duration;
    @Element(name = "TrackingEvents", required = false)
    private TrackingEventsType trackingEvents;
    @Element(name = "AdParameters", required = false)
    private AdParametersType adParameters;
    @Element(name = "VideoClicks", required = false)
    private VideoClicksType videoClicks;
    @Element(name = "MediaFiles", required = false)
    private MediaFiles mediaFiles;
    @Attribute(name = "skipoffset", required = false)
    private String skipoffset;

    public Linear() {
    }

    public Icons getIcons() {
        return icons;
    }

    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    public CreativeExtensionsType getCreativeExtensions() {
        return creativeExtensions;
    }

    public void setCreativeExtensions(CreativeExtensionsType creativeExtensions) {
        this.creativeExtensions = creativeExtensions;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public TrackingEventsType getTrackingEvents() {
        return trackingEvents;
    }

    public void setTrackingEvents(TrackingEventsType trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public AdParametersType getAdParameters() {
        return adParameters;
    }

    public void setAdParameters(AdParametersType adParameters) {
        this.adParameters = adParameters;
    }

    public VideoClicksType getVideoClicks() {
        return videoClicks;
    }

    public void setVideoClicks(VideoClicksType videoClicks) {
        this.videoClicks = videoClicks;
    }

    public MediaFiles getMediaFiles() {
        return mediaFiles;
    }

    public void setMediaFiles(MediaFiles mediaFiles) {
        this.mediaFiles = mediaFiles;
    }

    public String getSkipoffset() {
        return skipoffset;
    }

    public void setSkipoffset(String skipoffset) {
        this.skipoffset = skipoffset;
    }

}
