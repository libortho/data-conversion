package com.vgacina.demo.dataconversion.utils;

import com.vgacina.demo.dataconversion.model.vast.Ad;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 * Created by Prove on 7/29/2016.
 */
public class SimpleXmlParser {

    public static Ad parseAd(final String adXML){
        Serializer serializer = new Persister();
        Ad ad = null;
        try {
            ad = serializer.read(Ad.class, adXML);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ad;
    }


}
