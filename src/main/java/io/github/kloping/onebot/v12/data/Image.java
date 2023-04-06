package io.github.kloping.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author github.kloping
 */
public class Image extends Message {
    private FileId fileId;

    @Override
    public FileId getData() {
        return fileId;
    }

    @Override
    public void setData(MessageData t) {
        if (t instanceof FileId) setData(((FileId) t));
    }

    public void setData(FileId t) {
        this.fileId = t;
    }

    @JSONField(deserialize = true, serialize = false)
    public String getId() {
        return getData().getFileId();
    }

    public Image() {
        setType("image");
    }
}
