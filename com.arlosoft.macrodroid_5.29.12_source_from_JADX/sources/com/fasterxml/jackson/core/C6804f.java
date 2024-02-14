package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.f */
/* compiled from: JsonStreamContext */
public abstract class C6804f {

    /* renamed from: a */
    protected int f15790a;

    /* renamed from: b */
    protected int f15791b;

    protected C6804f() {
    }

    /* renamed from: a */
    public final int mo33878a() {
        int i = this.f15791b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo33879b() {
        return this.f15791b + 1;
    }

    /* renamed from: c */
    public final String mo33880c() {
        int i = this.f15790a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "OBJECT" : "ARRAY" : "ROOT";
    }

    /* renamed from: d */
    public final boolean mo33881d() {
        return this.f15790a == 1;
    }

    /* renamed from: e */
    public final boolean mo33882e() {
        return this.f15790a == 2;
    }

    /* renamed from: f */
    public final boolean mo33883f() {
        return this.f15790a == 0;
    }
}
