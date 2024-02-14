package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdzr extends zzbrt {

    /* renamed from: a */
    final /* synthetic */ Object f33452a;

    /* renamed from: c */
    final /* synthetic */ String f33453c;

    /* renamed from: d */
    final /* synthetic */ long f33454d;

    /* renamed from: f */
    final /* synthetic */ zzfjj f33455f;

    /* renamed from: g */
    final /* synthetic */ zzchh f33456g;

    /* renamed from: o */
    final /* synthetic */ zzdzs f33457o;

    zzdzr(zzdzs zzdzs, Object obj, String str, long j, zzfjj zzfjj, zzchh zzchh) {
        this.f33457o = zzdzs;
        this.f33452a = obj;
        this.f33453c = str;
        this.f33454d = j;
        this.f33455f = zzfjj;
        this.f33456g = zzchh;
    }

    /* renamed from: c */
    public final void mo42934c() {
        synchronized (this.f33452a) {
            this.f33457o.m48462v(this.f33453c, true, "", (int) (zzt.m2889b().mo21952c() - this.f33454d));
            this.f33457o.f33469l.mo45060d(this.f33453c);
            this.f33457o.f33472o.mo44674h0(this.f33453c);
            zzfjw e = this.f33457o.f33473p;
            zzfjj zzfjj = this.f33455f;
            zzfjj.mo45801o0(true);
            e.mo45831b(zzfjj.mo45799h());
            this.f33456g.mo43574c(Boolean.TRUE);
        }
    }

    /* renamed from: z */
    public final void mo42933z(String str) {
        synchronized (this.f33452a) {
            this.f33457o.m48462v(this.f33453c, false, str, (int) (zzt.m2889b().mo21952c() - this.f33454d));
            this.f33457o.f33469l.mo45058b(this.f33453c, "error");
            this.f33457o.f33472o.mo44676q(this.f33453c, "error");
            zzfjw e = this.f33457o.f33473p;
            zzfjj zzfjj = this.f33455f;
            zzfjj.mo45801o0(false);
            e.mo45831b(zzfjj.mo45799h());
            this.f33456g.mo43574c(Boolean.FALSE);
        }
    }
}
