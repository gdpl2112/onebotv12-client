package io.github.gdpl2112.onebot.v12;

/**
 * <p>Abstract ListenerHost class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class ListenerHost {
    /**
     * 错误抛出处理
     *
     * @param e a {@link java.lang.Throwable} object.
     */
    public abstract void handleException(Throwable e);

    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /** {@inheritDoc} */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return super.toString();
    }

    /** {@inheritDoc} */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
