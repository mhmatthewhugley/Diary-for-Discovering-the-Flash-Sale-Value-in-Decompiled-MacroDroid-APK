package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p090f5.C7315j;
import p102h4.C7380e;
import p102h4.C7384g;
import p102h4.C7387j;

/* renamed from: com.bumptech.glide.load.engine.m */
/* compiled from: EngineKey */
class C6699m implements C7380e {

    /* renamed from: b */
    private final Object f15653b;

    /* renamed from: c */
    private final int f15654c;

    /* renamed from: d */
    private final int f15655d;

    /* renamed from: e */
    private final Class<?> f15656e;

    /* renamed from: f */
    private final Class<?> f15657f;

    /* renamed from: g */
    private final C7380e f15658g;

    /* renamed from: h */
    private final Map<Class<?>, C7387j<?>> f15659h;

    /* renamed from: i */
    private final C7384g f15660i;

    /* renamed from: j */
    private int f15661j;

    C6699m(Object obj, C7380e eVar, int i, int i2, Map<Class<?>, C7387j<?>> map, Class<?> cls, Class<?> cls2, C7384g gVar) {
        this.f15653b = C7315j.m30204d(obj);
        this.f15658g = (C7380e) C7315j.m30205e(eVar, "Signature must not be null");
        this.f15654c = i;
        this.f15655d = i2;
        this.f15659h = (Map) C7315j.m30204d(map);
        this.f15656e = (Class) C7315j.m30205e(cls, "Resource class must not be null");
        this.f15657f = (Class) C7315j.m30205e(cls2, "Transcode class must not be null");
        this.f15660i = (C7384g) C7315j.m30204d(gVar);
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6699m)) {
            return false;
        }
        C6699m mVar = (C6699m) obj;
        if (!this.f15653b.equals(mVar.f15653b) || !this.f15658g.equals(mVar.f15658g) || this.f15655d != mVar.f15655d || this.f15654c != mVar.f15654c || !this.f15659h.equals(mVar.f15659h) || !this.f15656e.equals(mVar.f15656e) || !this.f15657f.equals(mVar.f15657f) || !this.f15660i.equals(mVar.f15660i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f15661j == 0) {
            int hashCode = this.f15653b.hashCode();
            this.f15661j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f15658g.hashCode()) * 31) + this.f15654c) * 31) + this.f15655d;
            this.f15661j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f15659h.hashCode();
            this.f15661j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f15656e.hashCode();
            this.f15661j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f15657f.hashCode();
            this.f15661j = hashCode5;
            this.f15661j = (hashCode5 * 31) + this.f15660i.hashCode();
        }
        return this.f15661j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f15653b + ", width=" + this.f15654c + ", height=" + this.f15655d + ", resourceClass=" + this.f15656e + ", transcodeClass=" + this.f15657f + ", signature=" + this.f15658g + ", hashCode=" + this.f15661j + ", transformations=" + this.f15659h + ", options=" + this.f15660i + '}';
    }
}
