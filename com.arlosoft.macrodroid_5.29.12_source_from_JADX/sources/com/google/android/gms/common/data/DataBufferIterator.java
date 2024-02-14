package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class DataBufferIterator<T> implements Iterator<T> {
    @NonNull

    /* renamed from: a */
    protected final DataBuffer f3513a;

    /* renamed from: c */
    protected int f3514c = -1;

    public DataBufferIterator(@NonNull DataBuffer dataBuffer) {
        this.f3513a = (DataBuffer) Preconditions.m4488k(dataBuffer);
    }

    public final boolean hasNext() {
        return this.f3514c < this.f3513a.getCount() + -1;
    }

    @NonNull
    public Object next() {
        if (hasNext()) {
            DataBuffer dataBuffer = this.f3513a;
            int i = this.f3514c + 1;
            this.f3514c = i;
            return dataBuffer.get(i);
        }
        int i2 = this.f3514c;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
