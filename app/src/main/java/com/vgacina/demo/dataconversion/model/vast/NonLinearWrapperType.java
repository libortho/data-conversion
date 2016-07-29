
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * NonLinearWrapperType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NonLinearWrapper_type")
@Namespace(reference = "")
public class NonLinearWrapperType {

    @Element(name = "CreativeExtensions", required = false)
    private CreativeExtensionsType creativeExtensions;
    @ElementList(name = "NonLinearClickTracking", entry = "NonLinearClickTracking", inline = true, required = false)
    private List<String> nonLinearClickTracking;
    @Attribute(name = "maintainAspectRatio", required = false)
    private Boolean maintainAspectRatio;
    @Attribute(name = "width", required = false)
    private Integer width;
    @Attribute(name = "height", required = false)
    private Integer height;
    @Attribute(name = "apiFramework", required = false)
    private String apiFramework;
    @Attribute(name = "scalable", required = false)
    private Boolean scalable;
    @Attribute(name = "id", required = false)
    private String id;
    @Attribute(name = "minSuggestedDuration", required = false)
    private String minSuggestedDuration;
    @Attribute(name = "expandedWidth", required = false)
    private Integer expandedWidth;
    @Attribute(name = "expandedHeight", required = false)
    private Integer expandedHeight;

    public NonLinearWrapperType() {
    }

    public CreativeExtensionsType getCreativeExtensions() {
        return creativeExtensions;
    }

    public void setCreativeExtensions(CreativeExtensionsType creativeExtensions) {
        this.creativeExtensions = creativeExtensions;
    }

    public List<String> getNonLinearClickTracking() {
        return nonLinearClickTracking;
    }

    public void setNonLinearClickTracking(List<String> nonLinearClickTracking) {
        this.nonLinearClickTracking = nonLinearClickTracking;
    }

    public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
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

    public Boolean getScalable() {
        return scalable;
    }

    public void setScalable(Boolean scalable) {
        this.scalable = scalable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinSuggestedDuration() {
        return minSuggestedDuration;
    }

    public void setMinSuggestedDuration(String minSuggestedDuration) {
        this.minSuggestedDuration = minSuggestedDuration;
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
