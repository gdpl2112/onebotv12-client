package io.github.gdpl2112.onebot.v12.data;

import java.io.File;

/**
 * @author github.kloping
 */
public interface ImageUploader {
    Image uploadImage(File file);

    Image uploadImage(String url);

    Image uploadImage(byte[] bytes);
}
