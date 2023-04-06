package io.github.gdpl2112.onebot.v12.data;

import java.io.File;

/**
 * upload image
 *
 * @author github.kloping
 * @version 1.0
 */
public interface ImageUploader {
    /**
     * upload file as image
     *
     * @param file a {@link java.io.File} object
     * @return a {@link io.github.gdpl2112.onebot.v12.data.Image} object
     */
    Image uploadImage(File file);

    /**
     * upload url data as image
     *
     * @param url a {@link java.lang.String} object
     * @return a {@link io.github.gdpl2112.onebot.v12.data.Image} object
     */
    Image uploadImage(String url);

    /**
     * upload bytes as image
     *
     * @param bytes an array of {@link byte} objects
     * @return a {@link io.github.gdpl2112.onebot.v12.data.Image} object
     */
    Image uploadImage(byte[] bytes);
}
