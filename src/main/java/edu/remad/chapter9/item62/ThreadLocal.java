package edu.remad.chapter9.item62;

/**
 * This is demonstrating typesafe, parametrized class.
 */
public final class ThreadLocal<T> {

    /**
     * Constructor.
     */
    public ThreadLocal() {};

    /**
     * Sets the given value.
     * @param value The given value
     */
    public void set(T value) {
        this.value = value;
    };

    /**
     * @return Returns a typesafe value.
     */
    public T get() {
        return value;
    }

    private T value; // Required, a typesafe value
}
