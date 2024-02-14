package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaio {

    /* renamed from: a */
    private final String f24767a;

    /* renamed from: b */
    private final int f24768b;

    /* renamed from: c */
    private final int f24769c;

    /* renamed from: d */
    private int f24770d;

    /* renamed from: e */
    private String f24771e;

    public zzaio(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f24767a = str;
        this.f24768b = i2;
        this.f24769c = i3;
        this.f24770d = Integer.MIN_VALUE;
        this.f24771e = "";
    }

    /* renamed from: d */
    private final void m41538d() {
        if (this.f24770d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int mo41515a() {
        m41538d();
        return this.f24770d;
    }

    /* renamed from: b */
    public final String mo41516b() {
        m41538d();
        return this.f24771e;
    }

    /* renamed from: c */
    public final void mo41517c() {
        int i = this.f24770d;
        int i2 = i == Integer.MIN_VALUE ? this.f24768b : i + this.f24769c;
        this.f24770d = i2;
        String str = this.f24767a;
        this.f24771e = str + i2;
    }
}
