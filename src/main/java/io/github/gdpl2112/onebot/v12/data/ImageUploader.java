package io.github.gdpl2112.onebot.v12.data;

import java.io.File;

/**
 * upload image
 *
 * @author github.kloping
 */
public interface ImageUploader {
    /**
     * upload file as image
     *
     * @param file
     * @return
     */
    Image uploadImage(File file);

    /**
     * upload url data as image
     *
     * @param url
     * @return
     */
    Image uploadImage(String url);

    /**
     * upload bytes as image
     * @param bytes
     * @return
     */
    Image uploadImage(byte[] bytes);
}
