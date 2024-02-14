package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzh implements Iterator {

    /* renamed from: a */
    private Object f40114a;

    /* renamed from: c */
    private int f40115c = 2;

    protected zzh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo49064a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo49445b() {
        this.f40115c = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f40115c;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f40115c = 4;
                    this.f40114a = mo49064a();
                    if (this.f40115c != 3) {
                        this.f40115c = 1;
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
            this.f40115c = 2;
            Object obj = this.f40114a;
            this.f40114a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
