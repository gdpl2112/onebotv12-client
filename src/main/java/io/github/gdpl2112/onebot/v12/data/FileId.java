package io.github.gdpl2112.onebot.v12.data;

/**
 * @author github.kloping
 */
public class FileId extends MessageData {
    public String fileId;

    public FileId() {
    }

    public FileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
