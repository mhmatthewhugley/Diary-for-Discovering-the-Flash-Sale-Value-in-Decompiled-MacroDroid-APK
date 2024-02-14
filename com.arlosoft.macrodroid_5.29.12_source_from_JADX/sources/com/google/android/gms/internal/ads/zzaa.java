package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaa {

    /* renamed from: a */
    private final SparseBooleanArray f23698a;

    /* synthetic */ zzaa(SparseBooleanArray sparseBooleanArray, zzz zzz) {
        this.f23698a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo41188a(int i) {
        zzdd.m47207a(i, 0, this.f23698a.size());
        return this.f23698a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo41189b() {
        return this.f23698a.size();
    }

    /* renamed from: c */
    public final boolean mo41190c(int i) {
        return this.f23698a.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaa = (zzaa) obj;
        if (zzen.f34500a >= 24) {
            return this.f23698a.equals(zzaa.f23698a);
        }
        if (this.f23698a.size() != zzaa.f23698a.size()) {
            return false;
        }
        for (int i = 0; i < this.f23698a.size(); i++) {
            if (mo41188a(i) != zzaa.mo41188a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzen.f34500a >= 24) {
            return this.f23698a.hashCode();
        }
        int size = this.f23698a.size();
        for (int i = 0; i < this.f23698a.size(); i++) {
            size = (size * 31) + mo41188a(i);
        }
        return size;
    }
}
