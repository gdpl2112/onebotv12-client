package io.github.gdpl2112.onebot.v12.data;

/**
 * <p>Version class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class Version extends MessageData {
    private String impl;
    private String version;
    private String onebotVersion;

    /**
     * <p>Getter for the field <code>impl</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getImpl() {
        return impl;
    }

    /**
     * <p>Setter for the field <code>impl</code>.</p>
     *
     * @param impl a {@link java.lang.String} object.
     */
    public void setImpl(String impl) {
        this.impl = impl;
    }

    /**
     * <p>Getter for the field <code>version</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>Setter for the field <code>version</code>.</p>
     *
     * @param version a {@link java.lang.String} object.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>Getter for the field <code>onebotVersion</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getOnebotVersion() {
        return onebotVersion;
    }

    /**
     * <p>Setter for the field <code>onebotVersion</code>.</p>
     *
     * @param onebotVersion a {@link java.lang.String} object.
     */
    public void setOnebotVersion(String onebotVersion) {
        this.onebotVersion = onebotVersion;
    }
}
