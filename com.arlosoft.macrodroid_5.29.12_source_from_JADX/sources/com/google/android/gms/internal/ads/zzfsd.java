package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class zzfsd implements Iterator {

    /* renamed from: a */
    private Object f36332a;

    /* renamed from: c */
    private int f36333c = 2;

    protected zzfsd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo46162a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo46163b() {
        this.f36333c = 3;
        return null;
    }

    public final boolean hasNext() {
        zzfsx.m50943h(this.f36333c != 4);
        int i = this.f36333c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f36333c = 4;
                this.f36332a = mo46162a();
                if (this.f36333c != 3) {
                    this.f36333c = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f36333c = 2;
            Object obj = this.f36332a;
            this.f36332a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
