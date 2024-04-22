package io.github.gdpl2112.onebot.v12.data;

import lombok.Getter;

/**
 * <p>Version class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@Getter
public class Version extends MessageData {
    /**
     * -- GETTER --
     *  <p>Getter for the field <code>impl</code>.</p>
     *
     * @return a {@link String} object.
     */
    private String impl;
    /**
     * -- GETTER --
     *  <p>Getter for the field <code>version</code>.</p>
     *
     * @return a {@link String} object.
     */
    private String version;
    /**
     * -- GETTER --
     *  <p>Getter for the field <code>onebotVersion</code>.</p>
     *
     * @return a {@link String} object.
     */
    private String onebotVersion;

    /**
     * <p>Setter for the field <code>impl</code>.</p>
     *
     * @param impl a {@link java.lang.String} object.
     */
    public void setImpl(String impl) {
        this.impl = impl;
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
     * <p>Setter for the field <code>onebotVersion</code>.</p>
     *
     * @param onebotVersion a {@link java.lang.String} object.
     */
    public void setOnebotVersion(String onebotVersion) {
        this.onebotVersion = onebotVersion;
    }
}
