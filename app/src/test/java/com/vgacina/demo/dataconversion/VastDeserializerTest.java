package com.vgacina.demo.dataconversion;

import com.vgacina.demo.dataconversion.model.vast.*;
import com.vgacina.demo.dataconversion.utils.SimpleXmlParser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by v.gacina on 8/1/2016.
 */
public class VastDeserializerTest {


    @Test
    public void should_Pass_When_AdIsValid(){

        VAST objVast = null;

        try {
            objVast = SimpleXmlParser.parseVast(AdSamples.VAST_2_0_WRAPPER_AD);
        }catch (Exception e){
            fail(e.getMessage());
        }

        assertNotNull(objVast);

        List<Ad> ads = objVast.getAd();
        assertNotNull(ads);

        assertEquals(1, (long)ads.size());
        Ad ad = ads.get(0);

        Wrapper wrapper = ad.getWrapper();
        assertNotNull(wrapper);
        assertNotNull(wrapper.getAdSystem());
        assertEquals("Improve Digital", wrapper.getAdSystem().getValue());

        assertNotNull(wrapper.getError());
        assertEquals("\n\nhttp://ad.360yield.com/vastevent?e=noad&error_code=[ERRORCODE]&ic=X33NkwNDn9djLz06.akCYZuk8JDohbyjGprxg3qEJ5oTi.V1.12EgbN3H2tFo8IBtDQRh6wDfw3Nm1OXH7hUib4qG7jpR-pl2hZzJhN-lXWu3JQoMTM5fcXdgXrVK7I8r833.SjT104g0q5WOiBpWxagLnakM3TYZJBEhA8zZGZM2PGENVWsp.Hi7JSb9nNO.vvD8W84fFGsNyTDYGVEd8SovxhPUG-HSmZHgo3WoORaCu2b35VTD8EU0N7zaFOGwoFTJLWQKB9b8Kw"
                         + "qpy0fDlOdEM6hInYPyP99A7f.TBG5JhduVQx2buXhk6qCCP0EQKp6FpseUwHIWYvZYbrmFRzoW-i7xB3w1edJj0ORuIBv3AycrC6YqBKAuda.fs50UuBvTZZA\n\n",
                     wrapper.getError());

        assertNotNull(wrapper.getVastAdTagURI());
        assertEquals("\n\nhttp://www.adotube.com/php/services/player/OMLService.php?avpid=oRYYzvQ&platform_version=vast20&ad_type=linear&groupbypass=1&HTTP_REFERER=http://www.longtailvideo.com&video_identifier=longtailvideo.com,test\n\n",
                     wrapper.getVastAdTagURI());

        assertNotNull(wrapper.getImpression());
        assertEquals(6, wrapper.getImpression().size());

        List<String> impressions = wrapper.getImpression();
        assertEquals("\n\nhttp://test.com?publisher_user_id=9c300a37-fa77-4f97-90da-0cd9ff84f850&publisher_dsp_id=233&publisher_call_type=redirect&publisher_redirecturl=http://ad.360yield.com/match\n\n",
                     impressions.get(0));

        assertEquals("\n\nhttp://cm.g.doubleclick.net/pixel?google_nid=improvedigital&google_cm&google_sc&publisher_user_id=9c300a37-fa77-4f97-90da-0cd9ff84f850&publisher_dsp_id=155&publisher_call_type=redirect&publisher_redirecturl=http://ad.360yield.com/match\n\n",
                     impressions.get(1));

        assertEquals("\n\nhttp://ssum.casalemedia.com/usermatch?s=183554&cb=http%3A%2F%2Fad.360yield.com%2Fmatch%3Fpublisher_dsp_id%3D81%26external_user_id%3D__UID__\n\n",
                     impressions.get(2));

        assertEquals("\n\nhttp://rs.gwallet.com/r1/cm/p59?push&&publisher_user_id=9c300a37-fa77-4f97-90da-0cd9ff84f850&publisher_dsp_id=125&publisher_call_type=redirect&publisher_redirecturl=http://ad.360yield.com/match\n\n",
                     impressions.get(3));

        assertEquals("\n\nhttp://dsp.adfarm1.adition.com/cookie/?ssp=4&publisher_user_id=9c300a37-fa77-4f97-90da-0cd9ff84f850&publisher_dsp_id=105&publisher_call_type=redirect&publisher_redirecturl=http://ad.360yield.com/match\n\n",
                     impressions.get(4));

        assertEquals("\n\nhttp://ad.360yield.com/vastevent?e=impression&ic=X33NkwNDn9djLz06.akCYZuk8JDohbyjGprxg3qEJ5oTi.V1.12EgbN3H2tFo8IBtDQRh6wDfw3Nm1OXH7hUib4qG7jpR-pl2hZzJhN-lXWu3JQoMTM5fcXdgXrVK7I8r833.SjT104g0q5WOiBpWxagLnakM3TYZJBEhA8zZGZM2PGENVWsp.Hi7JSb9nNO.vvD8W84fFGsNyTDYGVEd8SovxhPUG-HSmZHgo3WoORaCu2b35VTD8EU0N7zaFOGwoFTJLWQKB9b8Kwqpy0fDlOdEM6hInYPyP99A7f.TBG5JhduVQx2buXhk6qCCP0EQKp6FpseUwHIWYvZYbrmFRzoW-i7xB3w1edJj0ORuIBv3AycrC6YqBKAuda.fs50UuBvTZZA\n\n",
                     impressions.get(5));

        assertNotNull(wrapper.getCreatives());
        assertEquals(1, wrapper.getCreatives().getCreative().size());

        List<Creative> creativeList = wrapper.getCreatives().getCreative();
        Creative creative = creativeList.get(0);
        assertNotNull(creative);
        assertNotNull(creative.getLinear());
        TrackingEventsType trackingEvents = creative.getLinear().getTrackingEvents();
        assertNotNull(trackingEvents);
        assertEquals(16, trackingEvents.getTracking().size());

        List<Tracking> trackingList = trackingEvents.getTracking();
        assertEquals(Event.creativeView, trackingList.get(0).getEvent());
        assertEquals("\n\nhttp://ad.360yield.com/vastevent?e=creativeView&ic=KOuXyNIjPHrw62UYiCYXgCk-xOdSEY7gPCKwRWKmsxgJ97LUzgF-eWJ9WJdsLK-GSsbECO5ck.dcarfJPAgiP3BpKKvNY8bYJPRUsO66IIOgM6JioXbGymKuvNxiqR.tyaasfaJ8jbO3NgW8Vcyagy6F8Y9pWRIjrMqHfNDNOzxi87SpzO9RRNnilw1KPyNOOU1e-I3D8zJep06hjofb8iMvXB5zEyJaGoaWBub1vCqHAHFCbNWGjph36JL4p88OKhvQIPSN1UnriEAnXXb.Dr8aH0J0BBzMtTFR.5hjYx8wmFCJ6UXtJTueLisIRCuc-Y234TQUBiW5oaQTCK-dHzq9WR6TnZgDpV4zdHpU448OZTTJ3tWtC7Y7IprE37L71T4hKKtP\n\n",
                     trackingList.get(0).getValue());
        assertEquals(Event.start, trackingList.get(1).getEvent());
        assertEquals(Event.firstQuartile, trackingList.get(2).getEvent());
        assertEquals(Event.midpoint, trackingList.get(3).getEvent());
        assertEquals(Event.thirdQuartile, trackingList.get(4).getEvent());
        assertEquals(Event.complete, trackingList.get(5).getEvent());
        assertEquals(Event.mute, trackingList.get(6).getEvent());
        assertEquals(Event.unmute, trackingList.get(7).getEvent());
        assertEquals(Event.pause, trackingList.get(8).getEvent());
        assertEquals(Event.resume, trackingList.get(9).getEvent());
        assertEquals(Event.rewind, trackingList.get(10).getEvent());
        assertEquals(Event.fullscreen, trackingList.get(11).getEvent());
        assertEquals(Event.close, trackingList.get(12).getEvent());
        assertEquals(Event.skip, trackingList.get(13).getEvent());
        assertEquals(Event.collapse, trackingList.get(14).getEvent());
        assertEquals(Event.expand, trackingList.get(15).getEvent());


        assertNotNull(creative.getLinear().getVideoClicks());
        List<ClickTracking> clickTracking = creative.getLinear().getVideoClicks().getClickTracking();
        assertEquals(1, clickTracking.size());
        assertEquals("\n\nhttp://ad.360yield.com/click/X33NkwNDn9djLz06.akCYZuk8JDohbyjGprxg3qEJ5oTi.V1.12EgbN3H2tFo8IBtDQRh6wDfw3Nm1OXH7hUib4qG7jpR-pl2hZzJhN-lXWu3JQoMTM5fcXdgXrVK7I8r833.SjT104g0q5WOiBpWxagLnakM3TYZJBEhA8zZGZM2PGENVWsp.Hi7JSb9nNO.vvD8W84fFGsNyTDYGVEd8SovxhPUG-HSmZHgo3WoORaCu2b35VTD8EU0N7zaFOGwoFTJLWQKB9b8Kw"
                         + "\n\n\nqpy0fDlOdEM6hInYPyP99A7f.TBG5JhduVQx2buXhk6qCCP0EQKp6FpseUwHIWYvZYbrmFRzoW-i7xB3w1edJj0ORuIBv3AycrC6YqBKAuda.fs50UuBvTZZA//\n\n",
                     clickTracking.get(0).getValue());

    }


    @Test
    public void should_Pass_When_Sample3_IsValid(){
        VAST objVast = null;

        try {
            objVast = SimpleXmlParser.parseVast(AdSamples.SAMPLE_3_VAST_2_0_INLINE_AD);
        }catch (Exception e){
            fail(e.getMessage());
        }

        assertNotNull(objVast);
        assertEquals("2.0", objVast.getVersion());

        assertNotNull(objVast.getAd());
        assertEquals(1, objVast.getAd().size());

        Ad ad = objVast.getAd().get(0);
        assertNotNull(ad.getInLine());
        InLine inLine = ad.getInLine();

        assertEquals("3.0", inLine.getAdSystem().getVersion());
        assertEquals("Adotube", inLine.getAdSystem().getValue());

        assertEquals("\n Adotube \n", inLine.getAdTitle());


        assertNotNull(inLine.getImpression());
        assertEquals(1, inLine.getImpression().size());

        List<ImpressionType> impressions = inLine.getImpression();

        assertNotNull(impressions);
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&action=Impression&b=0&billing_type=0&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=57a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     impressions.get(0).getValue());

        assertNotNull(inLine.getCreatives());
        List<Creative> creativeList = inLine.getCreatives().getCreative();
        assertEquals(1, creativeList.size());
        Creative creative = creativeList.get(0);
        assertNotNull(creative.getLinear());
        Linear linear = creative.getLinear();
        assertNotNull(linear);
        assertEquals("00:00:13", linear.getDuration());

        assertNotNull(linear.getTrackingEvents());
        List<Tracking> trackingList = linear.getTrackingEvents().getTracking();
        assertEquals(4, trackingList.size());

        assertEquals(Event.firstQuartile, trackingList.get(0).getEvent());
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&action=Views25&b=0&billing_type=0&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=57a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     trackingList.get(0).getValue());

        assertEquals(Event.midpoint, trackingList.get(1).getEvent());
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&action=Views50&b=0&billing_type=0&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=57a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     trackingList.get(1).getValue());

        assertEquals(Event.thirdQuartile, trackingList.get(2).getEvent());
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&action=Views75&b=0&billing_type=0&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=57a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     trackingList.get(2).getValue());

        assertEquals(Event.complete, trackingList.get(3).getEvent());
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&action=Views100&b=0&billing_type=0&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=57a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     trackingList.get(3).getValue());

        assertNotNull(linear.getVideoClicks());
        ClickThrough clickThrough = linear.getVideoClicks().getClickThrough();
        assertNotNull(clickThrough);
        assertEquals("\n\nhttp://stats.adotube.com/log_stats.php?urid=3be2f4cb6d330280bc701d412e7bc528&url=http%3A%2F%2Fadotube.com&action=Click&b=0&conv=1&billing_type=2&avpid_stats=oRYYzvQ&pid=&gid=&publisher_id=1797&capid=&wid=wid_1383451170_579f64bf424916.80474584&geo=RS_02_NoviSad___&ad_id=test&cat_id=0&cam_id=7913&cb=5"
                         + "\n\n\n7a08e0589cfa3.88132468&value=&test=NA_NA_NA_NA_NA_NA_NA_NA&bk=&adex_id=&HTTP_REFERER=http%3A%2F%2Fwww.longtailvideo.com&video_identifier=longtailvideo.com%2Ctest&urid=3be2f4cb6d330280bc701d412e7bc528\n\n",
                     clickThrough.getValue());

        List<MediaFile> mediaFiles = linear.getMediaFiles().getMediaFile();
        assertNotNull(mediaFiles);
        assertEquals(3, mediaFiles.size());
        assertEquals(Delivery.progressive, mediaFiles.get(0).getDelivery());
        assertEquals(Integer.valueOf(600), mediaFiles.get(0).getBitrate());
        assertEquals(Integer.valueOf(640), mediaFiles.get(0).getWidth());
        assertEquals(Integer.valueOf(360), mediaFiles.get(0).getHeight());
        assertEquals("video/mp4", mediaFiles.get(0).getType());
        assertEquals("\n\nhttp://creative.js.adotube.com/creatives/dev_test/pre1_video1_html5.mp4\n\n", mediaFiles.get(0).getValue());

        assertEquals(Delivery.progressive, mediaFiles.get(1).getDelivery());
        assertEquals(Integer.valueOf(600), mediaFiles.get(1).getBitrate());
        assertEquals(Integer.valueOf(640), mediaFiles.get(1).getWidth());
        assertEquals(Integer.valueOf(360), mediaFiles.get(1).getHeight());
        assertEquals("video/x-flv", mediaFiles.get(1).getType());
        assertEquals("\n\nhttp://creative.js.adotube.com/creatives/dev_test/pre1_video1_html5.flv\n\n", mediaFiles.get(1).getValue());

        assertEquals(Delivery.progressive, mediaFiles.get(2).getDelivery());
        assertEquals(Integer.valueOf(600), mediaFiles.get(2).getBitrate());
        assertEquals(Integer.valueOf(640), mediaFiles.get(2).getWidth());
        assertEquals(Integer.valueOf(360), mediaFiles.get(2).getHeight());
        assertEquals("video/webm", mediaFiles.get(2).getType());
        assertEquals("\n\nhttp://creative.js.adotube.com/creatives/dev_test/pre1_video1_html5.webm\n\n", mediaFiles.get(2).getValue());

    }
}
