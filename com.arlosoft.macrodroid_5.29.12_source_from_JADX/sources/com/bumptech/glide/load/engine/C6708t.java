package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p090f5.C7312g;
import p090f5.C7316k;
import p102h4.C7380e;
import p102h4.C7384g;
import p102h4.C7387j;
import p126l4.C7667b;

/* renamed from: com.bumptech.glide.load.engine.t */
/* compiled from: ResourceCacheKey */
final class C6708t implements C7380e {

    /* renamed from: j */
    private static final C7312g<Class<?>, byte[]> f15690j = new C7312g<>(50);

    /* renamed from: b */
    private final C7667b f15691b;

    /* renamed from: c */
    private final C7380e f15692c;

    /* renamed from: d */
    private final C7380e f15693d;

    /* renamed from: e */
    private final int f15694e;

    /* renamed from: f */
    private final int f15695f;

    /* renamed from: g */
    private final Class<?> f15696g;

    /* renamed from: h */
    private final C7384g f15697h;

    /* renamed from: i */
    private final C7387j<?> f15698i;

    C6708t(C7667b bVar, C7380e eVar, C7380e eVar2, int i, int i2, C7387j<?> jVar, Class<?> cls, C7384g gVar) {
        this.f15691b = bVar;
        this.f15692c = eVar;
        this.f15693d = eVar2;
        this.f15694e = i;
        this.f15695f = i2;
        this.f15698i = jVar;
        this.f15696g = cls;
        this.f15697h = gVar;
    }

    /* renamed from: c */
    private byte[] m25409c() {
        C7312g<Class<?>, byte[]> gVar = f15690j;
        byte[] g = gVar.mo37254g(this.f15696g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f15696g.getName().getBytes(C7380e.f18044a);
        gVar.mo37258k(this.f15696g, bytes);
        return bytes;
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f15691b.mo37685d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f15694e).putInt(this.f15695f).array();
        this.f15693d.mo33009b(messageDigest);
        this.f15692c.mo33009b(messageDigest);
        messageDigest.update(bArr);
        C7387j<?> jVar = this.f15698i;
        if (jVar != null) {
            jVar.mo33009b(messageDigest);
        }
        this.f15697h.mo33009b(messageDigest);
        messageDigest.update(m25409c());
        this.f15691b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6708t)) {
            return false;
        }
        C6708t tVar = (C6708t) obj;
        if (this.f15695f != tVar.f15695f || this.f15694e != tVar.f15694e || !C7316k.m30208c(this.f15698i, tVar.f15698i) || !this.f15696g.equals(tVar.f15696g) || !this.f15692c.equals(tVar.f15692c) || !this.f15693d.equals(tVar.f15693d) || !this.f15697h.equals(tVar.f15697h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f15692c.hashCode() * 31) + this.f15693d.hashCode()) * 31) + this.f15694e) * 31) + this.f15695f;
        C7387j<?> jVar = this.f15698i;
        if (jVar != null) {
            hashCode = (hashCode * 31) + jVar.hashCode();
        }
        return (((hashCode * 31) + this.f15696g.hashCode()) * 31) + this.f15697h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f15692c + ", signature=" + this.f15693d + ", width=" + this.f15694e + ", height=" + this.f15695f + ", decodedResourceClass=" + this.f15696g + ", transformation='" + this.f15698i + '\'' + ", options=" + this.f15697h + '}';
    }
}
