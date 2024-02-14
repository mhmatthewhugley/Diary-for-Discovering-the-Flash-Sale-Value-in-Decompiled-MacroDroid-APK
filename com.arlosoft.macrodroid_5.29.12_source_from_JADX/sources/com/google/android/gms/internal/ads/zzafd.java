package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafd implements zzafa {

    /* renamed from: a */
    private final zzef f24235a;

    /* renamed from: b */
    private final int f24236b;

    /* renamed from: c */
    private final int f24237c;

    /* renamed from: d */
    private int f24238d;

    /* renamed from: e */
    private int f24239e;

    public zzafd(zzaew zzaew) {
        zzef zzef = zzaew.f24179b;
        this.f24235a = zzef;
        zzef.mo45230f(12);
        this.f24237c = zzef.mo45246v() & 255;
        this.f24236b = zzef.mo45246v();
    }

    /* renamed from: a */
    public final int mo41428a() {
        int i = this.f24237c;
        if (i == 8) {
            return this.f24235a.mo45243s();
        }
        if (i == 16) {
            return this.f24235a.mo45247w();
        }
        int i2 = this.f24238d;
        this.f24238d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f24239e & 15;
        }
        int s = this.f24235a.mo45243s();
        this.f24239e = s;
        return (s & 240) >> 4;
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.f24236b;
    }
}
