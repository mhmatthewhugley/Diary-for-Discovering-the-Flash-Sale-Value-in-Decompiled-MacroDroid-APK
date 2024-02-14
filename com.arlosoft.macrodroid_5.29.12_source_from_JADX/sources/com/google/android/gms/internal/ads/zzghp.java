package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzghp {

    /* renamed from: a */
    private ArrayList f36849a = new ArrayList();

    /* renamed from: b */
    private zzghm f36850b = zzghm.f36847b;

    /* renamed from: c */
    private Integer f36851c = null;

    /* renamed from: a */
    public final zzghp mo46810a(zzgbc zzgbc, int i, zzgbl zzgbl) {
        ArrayList arrayList = this.f36849a;
        if (arrayList != null) {
            arrayList.add(new zzghr(zzgbc, i, zzgbl, (zzghq) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final zzghp mo46811b(zzghm zzghm) {
        if (this.f36849a != null) {
            this.f36850b = zzghm;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final zzghp mo46812c(int i) {
        if (this.f36849a != null) {
            this.f36851c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final zzght mo46813d() throws GeneralSecurityException {
        if (this.f36849a != null) {
            Integer num = this.f36851c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f36849a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((zzghr) arrayList.get(i)).mo46814a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzght zzght = new zzght(this.f36850b, Collections.unmodifiableList(this.f36849a), this.f36851c, (zzghs) null);
            this.f36849a = null;
            return zzght;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
