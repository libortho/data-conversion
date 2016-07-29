
package com.vgacina.demo.dataconversion.model.vast;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * InLine<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "InLine")
@Namespace(reference = "")
public class InLine {

    @Element(name = "AdSystem", required = true)
    private AdSystemType adSystem;
    @Element(name = "AdTitle", required = true)
    private String adTitle;
    @Element(name = "Description", required = false)
    private String description;
    @Element(name = "Advertiser", required = false)
    private String advertiser;
    @Element(name = "Pricing", required = false)
    private Pricing pricing;
    @Element(name = "Survey", required = false)
    private String survey;
    @Element(name = "Error", required = false)
    private String error;
    @ElementList(name = "Impression", entry = "Impression", inline = true, required = true)
    private List<ImpressionType> impression;
    @Element(name = "Creatives", required = true)
    private Creatives creatives;
    @Element(name = "Extensions", required = false)
    private ExtensionsType extensions;

    public InLine() {
    }

    public AdSystemType getAdSystem() {
        return adSystem;
    }

    public void setAdSystem(AdSystemType adSystem) {
        this.adSystem = adSystem;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public String getSurvey() {
        return survey;
    }

    public void setSurvey(String survey) {
        this.survey = survey;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<ImpressionType> getImpression() {
        return impression;
    }

    public void setImpression(List<ImpressionType> impression) {
        this.impression = impression;
    }

    public Creatives getCreatives() {
        return creatives;
    }

    public void setCreatives(Creatives creatives) {
        this.creatives = creatives;
    }

    public ExtensionsType getExtensions() {
        return extensions;
    }

    public void setExtensions(ExtensionsType extensions) {
        this.extensions = extensions;
    }

}
