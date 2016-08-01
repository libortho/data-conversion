package com.vgacina.demo.dataconversion.utils;

import com.vgacina.demo.dataconversion.model.vast.Ad;
import com.vgacina.demo.dataconversion.model.vast.VAST;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 * Created by Prove on 7/29/2016.
 */
public class SimpleXmlParser {

    public static VAST parseVast(final String vastXML) throws Exception{
        Serializer serializer = new Persister();
        VAST vast = null;
        try {
            vast = serializer.read(VAST.class, vastXML);
        }catch (Exception e){
            throw e;
        }
        return vast;
    }


}
