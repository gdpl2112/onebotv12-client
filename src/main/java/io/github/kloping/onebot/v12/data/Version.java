package io.github.kloping.onebot.v12.data;

/**
 * @author github.kloping
 */
public class Version extends MessageData {
    private String impl;
    private String version;
    private String onebotVersion;

    public String getImpl() {
        return impl;
    }

    public void setImpl(String impl) {
        this.impl = impl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOnebotVersion() {
        return onebotVersion;
    }

    public void setOnebotVersion(String onebotVersion) {
        this.onebotVersion = onebotVersion;
    }
}
