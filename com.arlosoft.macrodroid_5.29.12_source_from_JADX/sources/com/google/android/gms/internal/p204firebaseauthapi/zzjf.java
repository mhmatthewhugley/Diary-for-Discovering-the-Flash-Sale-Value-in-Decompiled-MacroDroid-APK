package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjf {

    /* renamed from: a */
    private ArrayList f40204a = new ArrayList();

    /* renamed from: b */
    private zzjc f40205b = zzjc.f40202b;

    /* renamed from: c */
    private Integer f40206c = null;

    /* renamed from: a */
    public final zzjf mo49501a(zzbe zzbe, int i, zzbn zzbn) {
        ArrayList arrayList = this.f40204a;
        if (arrayList != null) {
            arrayList.add(new zzjh(zzbe, i, zzbn, (zzjg) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final zzjf mo49502b(zzjc zzjc) {
        if (this.f40204a != null) {
            this.f40205b = zzjc;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final zzjf mo49503c(int i) {
        if (this.f40204a != null) {
            this.f40206c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final zzjj mo49504d() throws GeneralSecurityException {
        if (this.f40204a != null) {
            Integer num = this.f40206c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f40204a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((zzjh) arrayList.get(i)).mo49505a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzjj zzjj = new zzjj(this.f40205b, Collections.unmodifiableList(this.f40204a), this.f40206c, (zzji) null);
            this.f40204a = null;
            return zzjj;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
