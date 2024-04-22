package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>Image class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class Image extends Message {
    private FileId data;

    /**
     * <p>Constructor for Image.</p>
     */
    public Image() {
        setType("image");
    }

    /** {@inheritDoc} */
    @Override
    public FileId getData() {
        return data;
    }

    /** {@inheritDoc} */
    @Override
    public void setData(MessageData t) {
        if (t instanceof FileId) setData(((FileId) t));
    }

    /**
     * <p>setData.</p>
     *
     * @param t a {@link io.github.gdpl2112.onebot.v12.data.FileId} object
     */
    public void setData(FileId t) {
        this.data = t;
    }

    /**
     * <p>getId.</p>
     *
     * @return a {@link java.lang.String} object
     */
    @JSONField(deserialize = true, serialize = false)
    public String getId() {
        return getData().getFileId();
    }
}
