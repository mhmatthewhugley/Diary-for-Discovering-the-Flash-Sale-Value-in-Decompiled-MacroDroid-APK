package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
/* compiled from: LottieResult */
public final class C1493l<V> {
    @Nullable

    /* renamed from: a */
    private final V f1012a;
    @Nullable

    /* renamed from: b */
    private final Throwable f1013b;

    public C1493l(V v) {
        this.f1012a = v;
        this.f1013b = null;
    }

    @Nullable
    /* renamed from: a */
    public Throwable mo17161a() {
        return this.f1013b;
    }

    @Nullable
    /* renamed from: b */
    public V mo17162b() {
        return this.f1012a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1493l)) {
            return false;
        }
        C1493l lVar = (C1493l) obj;
        if (mo17162b() != null && mo17162b().equals(lVar.mo17162b())) {
            return true;
        }
        if (mo17161a() == null || lVar.mo17161a() == null) {
            return false;
        }
        return mo17161a().toString().equals(mo17161a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo17162b(), mo17161a()});
    }

    public C1493l(Throwable th) {
        this.f1013b = th;
        this.f1012a = null;
    }
}
