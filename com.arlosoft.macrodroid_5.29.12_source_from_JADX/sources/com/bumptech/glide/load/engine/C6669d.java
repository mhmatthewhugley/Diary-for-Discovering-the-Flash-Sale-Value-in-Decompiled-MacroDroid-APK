package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p102h4.C7380e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* compiled from: DataCacheKey */
final class C6669d implements C7380e {

    /* renamed from: b */
    private final C7380e f15516b;

    /* renamed from: c */
    private final C7380e f15517c;

    C6669d(C7380e eVar, C7380e eVar2) {
        this.f15516b = eVar;
        this.f15517c = eVar2;
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        this.f15516b.mo33009b(messageDigest);
        this.f15517c.mo33009b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6669d)) {
            return false;
        }
        C6669d dVar = (C6669d) obj;
        if (!this.f15516b.equals(dVar.f15516b) || !this.f15517c.equals(dVar.f15517c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f15516b.hashCode() * 31) + this.f15517c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f15516b + ", signature=" + this.f15517c + '}';
    }
}
