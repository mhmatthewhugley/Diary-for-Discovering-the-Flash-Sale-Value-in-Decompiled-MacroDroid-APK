package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class zzj implements Iterator {

    /* renamed from: a */
    private Object f39296a;

    /* renamed from: c */
    private int f39297c = 2;

    protected zzj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo48654a();

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final Object mo48655b() {
        this.f39297c = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f39297c;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f39297c = 4;
                    this.f39296a = mo48654a();
                    if (this.f39297c != 3) {
                        this.f39297c = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f39297c = 2;
            Object obj = this.f39296a;
            this.f39296a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
