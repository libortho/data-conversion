
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * IconType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Icon_type")
@Namespace(reference = "")
public class IconType {

    @Element(name = "StaticResource", required = false)
    private StaticResource staticResource;
    @Element(name = "IFrameResource", required = false)
    private String iFrameResource;
    @Element(name = "HTMLResource", required = false)
    private HTMLResourceType htmlResource;
    @Element(name = "IconClicks", required = false)
    private IconClicks iconClicks;
    @ElementList(name = "IconViewTracking", entry = "IconViewTracking", inline = true, required = false)
    private List<String> iconViewTracking;
    @Attribute(name = "offset", required = false)
    private String offset;
    @Attribute(name = "yPosition", required = true)
    private String yPosition;
    @Attribute(name = "width", required = true)
    private Integer width;
    @Attribute(name = "height", required = true)
    private Integer height;
    @Attribute(name = "apiFramework", required = false)
    private String apiFramework;
    @Attribute(name = "xPosition", required = true)
    private String xPosition;
    @Attribute(name = "program", required = true)
    private String program;
    @Attribute(name = "duration", required = false)
    private String duration;

    public IconType() {
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

    public IconClicks getIconClicks() {
        return iconClicks;
    }

    public void setIconClicks(IconClicks iconClicks) {
        this.iconClicks = iconClicks;
    }

    public List<String> getIconViewTracking() {
        return iconViewTracking;
    }

    public void setIconViewTracking(List<String> iconViewTracking) {
        this.iconViewTracking = iconViewTracking;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getYPosition() {
        return yPosition;
    }

    public void setYPosition(String yPosition) {
        this.yPosition = yPosition;
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

    public String getXPosition() {
        return xPosition;
    }

    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
