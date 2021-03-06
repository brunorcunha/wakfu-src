package com.ankamagames.framework.kernel.core.common.collections.lightweight.longKey;

import java.util.*;
import com.ankamagames.framework.kernel.core.common.collections.iterators.*;

public class LongObjectLightWeightMap<T> extends AbstractLongKeyLightWeightMap implements Iterable<T>
{
    private T[] m_values;
    
    public LongObjectLightWeightMap() {
        this(10);
    }
    
    public LongObjectLightWeightMap(final int initialCapacity) {
        super(initialCapacity);
        this.m_values = new Object[initialCapacity];
    }
    
    @Override
    public boolean ensureCapacity(final int newCapacity) {
        final int oldCapacity = this.m_indexes.length;
        if (!super.ensureCapacity(newCapacity)) {
            return false;
        }
        final T[] values = (T[])this.m_values;
        System.arraycopy(values, 0, this.m_values = new Object[newCapacity], 0, oldCapacity);
        return true;
    }
    
    public void put(final long key, final T value) {
        this.checkCapacity();
        int index = this.insertIndex(key);
        if (index < 0) {
            index = -index - 1;
        }
        else {
            ++this.m_size;
            this.m_indexes[index] = key;
        }
        this.m_values[index] = value;
    }
    
    public T remove(final long key) {
        if (this.m_size == 0) {
            return null;
        }
        final int index = this.index(key);
        if (index < 0) {
            return null;
        }
        return this.removeQuick(index);
    }
    
    private T removeQuick(final int index) {
        final T removed = (T)this.m_values[index];
        if (index < this.m_size - 1) {
            this.m_indexes[index] = this.m_indexes[this.m_size - 1];
            this.m_values[index] = this.m_values[this.m_size - 1];
            this.m_indexes[this.m_size - 1] = 0L;
            this.m_values[this.m_size - 1] = null;
        }
        else {
            this.m_indexes[index] = 0L;
            this.m_values[index] = null;
        }
        --this.m_size;
        return removed;
    }
    
    @Override
    public void clear() {
        super.clear();
        for (int i = 0, size = this.m_values.length; i < size; ++i) {
            this.m_values[i] = null;
        }
    }
    
    public T get(final long key) {
        final int index = this.index(key);
        if (index < 0) {
            return null;
        }
        return (T)this.m_values[index];
    }
    
    public T getQuickValue(final int index) {
        return (T)this.m_values[index];
    }
    
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>((T[])this.m_values, false);
    }
}
