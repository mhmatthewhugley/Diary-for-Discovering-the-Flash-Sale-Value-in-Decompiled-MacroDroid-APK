package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzftq extends zzfxm {

    /* renamed from: a */
    private Object f36397a;

    /* renamed from: c */
    private int f36398c = 2;

    protected zzftq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo46195a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo46196b() {
        this.f36398c = 3;
        return null;
    }

    public final boolean hasNext() {
        zzfsx.m50943h(this.f36398c != 4);
        int i = this.f36398c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f36398c = 4;
                this.f36397a = mo46195a();
                if (this.f36398c != 3) {
                    this.f36398c = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f36398c = 2;
            Object obj = this.f36397a;
            this.f36397a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
