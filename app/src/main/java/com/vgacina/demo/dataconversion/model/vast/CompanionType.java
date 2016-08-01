
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CompanionType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
public class CompanionType {

    @Element(name = "StaticResource", required = false)
    private StaticResource staticResource;
    @Element(name = "IFrameResource", required = false)
    private String iFrameResource;
    @Element(name = "HTMLResource", required = false)
    private HTMLResourceType htmlResource;
    @Element(name = "CreativeExtensions", required = false)
    private CreativeExtensionsType creativeExtensions;
    @Element(name = "TrackingEvents", required = false)
    private TrackingEventsType trackingEvents;
    @Element(name = "CompanionClickThrough", required = false)
    private String companionClickThrough;
    @Element(name = "AltText", required = false)
    private String altText;
    @Element(name = "AdParameters", required = false)
    private AdParametersType adParameters;
    @Attribute(name = "width", required = true)
    private Integer width;
    @Attribute(name = "height", required = true)
    private Integer height;
    @Attribute(name = "apiFramework", required = false)
    private String apiFramework;
    @Attribute(name = "assetHeight", required = false)
    private Integer assetHeight;
    @Attribute(name = "adSlotId", required = false)
    private String adSlotId;
    @Attribute(name = "assetWidth", required = false)
    private Integer assetWidth;
    @Attribute(name = "id", required = false)
    private String id;
    @Attribute(name = "expandedWidth", required = false)
    private Integer expandedWidth;
    @Attribute(name = "expandedHeight", required = false)
    private Integer expandedHeight;

    public CompanionType() {
    }

    public StaticResource getStaticResource() {
        return staticResource;
    }

    public void setStaticResource(StaticResource staticResource) {
        this.staticResource = staticResource;
    }

    public String getIFrameResource() {
        return iFrameResource;
    }

    public void setIFrameResource(String iFrameResource) {
        this.iFrameResource = iFrameResource;
    }

    public HTMLResourceType getHtmlResource() {
        return htmlResource;
    }

    public void setHtmlResource(HTMLResourceType htmlResource) {
        this.htmlResource = htmlResource;
    }

    public CreativeExtensionsType getCreativeExtensions() {
        return creativeExtensions;
    }

    public void setCreativeExtensions(CreativeExtensionsType creativeExtensions) {
        this.creativeExtensions = creativeExtensions;
    }

    public TrackingEventsType getTrackingEvents() {
        return trackingEvents;
    }

    public void setTrackingEvents(TrackingEventsType trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public String getCompanionClickThrough() {
        return companionClickThrough;
    }

    public void setCompanionClickThrough(String companionClickThrough) {
        this.companionClickThrough = companionClickThrough;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public AdParametersType getAdParameters() {
        return adParameters;
    }

    public void setAdParameters(AdParametersType adParameters) {
        this.adParameters = adParameters;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getApiFramework() {
        return apiFramework;
    }

    public void setApiFramework(String apiFramework) {
        this.apiFramework = apiFramework;
    }

    public Integer getAssetHeight() {
        return assetHeight;
    }

    public void setAssetHeight(Integer assetHeight) {
        this.assetHeight = assetHeight;
    }

    public String getAdSlotId() {
        return adSlotId;
    }

    public void setAdSlotId(String adSlotId) {
        this.adSlotId = adSlotId;
    }

    public Integer getAssetWidth() {
        return assetWidth;
    }

    public void setAssetWidth(Integer assetWidth) {
        this.assetWidth = assetWidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getExpandedWidth() {
        return expandedWidth;
    }

    public void setExpandedWidth(Integer expandedWidth) {
        this.expandedWidth = expandedWidth;
    }

    public Integer getExpandedHeight() {
        return expandedHeight;
    }

    public void setExpandedHeight(Integer expandedHeight) {
        this.expandedHeight = expandedHeight;
    }

}
