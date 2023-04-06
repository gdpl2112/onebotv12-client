package io.github.kloping.onebot.v12.utils;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * @author github.kloping
 */
public class HttpSender {
    public static String sendPost(String url, String json) throws IOException {
        String data = null;
        data = Jsoup.connect(url)
                .requestBody(json).ignoreContentType(true).post().body().text();
        return data;
    }
}
