package io.github.gdpl2112.onebot.v12.utils;

import io.github.gdpl2112.onebot.v12.WebChatClientWithOneBotV12;
import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * <p>HttpSender class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class HttpSender {
    /**
     * <p>sendPost.</p>
     *
     * @param url a {@link java.lang.String} object.
     * @param json a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
    public static String sendPost(String url, String json) throws IOException {
        String data = null;
        data = Jsoup.connect(url)
                .headers(WebChatClientWithOneBotV12.REQ_HEADERS)
                .requestBody(json).ignoreContentType(true)
                .post().body().text();
        return data;
    }
}
