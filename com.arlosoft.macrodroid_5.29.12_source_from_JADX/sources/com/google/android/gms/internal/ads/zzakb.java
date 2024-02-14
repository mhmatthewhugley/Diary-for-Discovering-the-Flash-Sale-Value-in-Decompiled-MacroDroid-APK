package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzakb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f24872a;

    /* renamed from: c */
    final /* synthetic */ long f24873c;

    /* renamed from: d */
    final /* synthetic */ zzakd f24874d;

    zzakb(zzakd zzakd, String str, long j) {
        this.f24874d = zzakd;
        this.f24872a = str;
        this.f24873c = j;
    }

    public final void run() {
        this.f24874d.f24878a.mo41608a(this.f24872a, this.f24873c);
        zzakd zzakd = this.f24874d;
        zzakd.f24878a.mo41609b(zzakd.toString());
    }
}
