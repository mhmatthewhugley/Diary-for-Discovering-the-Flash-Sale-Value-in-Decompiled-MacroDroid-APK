package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @KeepForSdk
    @Nullable

    /* renamed from: a */
    protected final DataHolder f3506a;

    @KeepForSdk
    protected AbstractDataBuffer(@Nullable DataHolder dataHolder) {
        this.f3506a = dataHolder;
    }

    public final void close() {
        release();
    }

    @NonNull
    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.f3506a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @NonNull
    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }

    public void release() {
        DataHolder dataHolder = this.f3506a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
