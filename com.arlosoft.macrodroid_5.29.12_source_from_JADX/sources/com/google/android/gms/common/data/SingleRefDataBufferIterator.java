package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: d */
    private Object f3537d;

    @NonNull
    public final Object next() {
        if (hasNext()) {
            int i = this.f3514c + 1;
            this.f3514c = i;
            if (i == 0) {
                Object k = Preconditions.m4488k(this.f3513a.get(0));
                this.f3537d = k;
                if (!(k instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(k.getClass());
                    throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
                }
            } else {
                ((DataBufferRef) Preconditions.m4488k(this.f3537d)).mo21561g(this.f3514c);
            }
            return this.f3537d;
        }
        int i2 = this.f3514c;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }
}
