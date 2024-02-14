package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfvg extends zzfvh {

    /* renamed from: a */
    Object[] f36466a;

    /* renamed from: b */
    int f36467b = 0;

    /* renamed from: c */
    boolean f36468c;

    zzfvg(int i) {
        this.f36466a = new Object[i];
    }

    /* renamed from: e */
    private final void m51102e(int i) {
        Object[] objArr = this.f36466a;
        int length = objArr.length;
        if (length < i) {
            this.f36466a = Arrays.copyOf(objArr, zzfvh.m51106b(length, i));
            this.f36468c = false;
        } else if (this.f36468c) {
            this.f36466a = (Object[]) objArr.clone();
            this.f36468c = false;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ zzfvh mo46408a(Object obj) {
        throw null;
    }

    /* renamed from: c */
    public final zzfvg mo46409c(Object obj) {
        Objects.requireNonNull(obj);
        m51102e(this.f36467b + 1);
        Object[] objArr = this.f36466a;
        int i = this.f36467b;
        this.f36467b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: d */
    public final zzfvh mo46410d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m51102e(this.f36467b + collection.size());
            if (collection instanceof zzfvi) {
                this.f36467b = ((zzfvi) collection).mo46413c(this.f36466a, this.f36467b);
                return this;
            }
        }
        for (Object a : iterable) {
            mo46408a(a);
        }
        return this;
    }
}
