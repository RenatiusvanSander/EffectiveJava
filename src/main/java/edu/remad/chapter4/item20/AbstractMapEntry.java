package edu.remad.chapter4.item20;

import java.util.Map;
import java.util.Objects;

// Skeletal implementation class
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

    // Entries in a modifiable map must override this method
    @Override
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    // Implements the general contract of Map.Entry.equals
    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if( o == null || o.getClass() != getClass()) {
            return false;
        }
        Map.Entry<?,?> that = (Map.Entry) o;
        return Objects.equals(that.getKey(), getKey())
                && Objects.equals(that.getValue(), getValue());
    }

    // Implements the general contract of Map.Entry.hashCode
    @Override
    public int hashCode() {
        return Objects.hashCode(getKey())
                ^ Objects.hashCode(getValue());
    }

    @Override
    public String toString() {
        return getKey() + "=" + getValue();
    }
}
