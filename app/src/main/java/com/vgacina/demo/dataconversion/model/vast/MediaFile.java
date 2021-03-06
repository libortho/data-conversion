
package com.vgacina.demo.dataconversion.model.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * MediaFile<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "MediaFile")
@Namespace(reference = "")
public class MediaFile {

    @Text(required = true)
    private String value;
    @Attribute(name = "id", required = false)
    private String id;
    @Attribute(name = "delivery", required = true)
    private Delivery delivery;
    @Attribute(name = "type", required = true)
    private String type;
    @Attribute(name = "bitrate", required = false)
    private Integer bitrate;
    @Attribute(name = "minBitrate", required = false)
    private Integer minBitrate;
    @Attribute(name = "maxBitrate", required = false)
    private Integer maxBitrate;
    @Attribute(name = "width", required = true)
    private Integer width;
    @Attribute(name = "height", required = true)
    private Integer height;
    @Attribute(name = "scalable", required = false)
    private Boolean scalable;
    @Attribute(name = "maintainAspectRatio", required = false)
    private Boolean maintainAspectRatio;
    @Attribute(name = "apiFramework", required = false)
    private String apiFramework;
    @Attribute(name = "codec", required = false)
    private String codec;

    public MediaFile() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Integer getMinBitrate() {
        return minBitrate;
    }

    public void setMinBitrate(Integer minBitrate) {
        this.minBitrate = minBitrate;
    }

    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
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

    public Boolean getScalable() {
        return scalable;
    }

    public void setScalable(Boolean scalable) {
        this.scalable = scalable;
    }

    public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    public String getApiFramework() {
        return apiFramework;
    }

    public void setApiFramework(String apiFramework) {
        this.apiFramework = apiFramework;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

}
