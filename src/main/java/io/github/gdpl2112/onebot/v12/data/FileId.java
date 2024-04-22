package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;

/**
 * <p>FileId class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@Getter
public class FileId extends MessageData {
    @JSONField(name = "file_id")
    public String fileId;

    /**
     * <p>Constructor for FileId.</p>
     */
    public FileId() {
    }

    /**
     * <p>Constructor for FileId.</p>
     *
     * @param fileId a {@link java.lang.String} object
     */
    public FileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>Setter for the field <code>fileId</code>.</p>
     *
     * @param fileId a {@link java.lang.String} object
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
