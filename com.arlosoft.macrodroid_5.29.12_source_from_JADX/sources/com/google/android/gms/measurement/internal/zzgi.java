package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzgi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f46891a;

    /* renamed from: c */
    final /* synthetic */ String f46892c;

    /* renamed from: d */
    final /* synthetic */ String f46893d;

    /* renamed from: f */
    final /* synthetic */ long f46894f;

    /* renamed from: g */
    final /* synthetic */ zzgj f46895g;

    zzgi(zzgj zzgj, String str, String str2, String str3, long j) {
        this.f46895g = zzgj;
        this.f46891a = str;
        this.f46892c = str2;
        this.f46893d = str3;
        this.f46894f = j;
    }

    public final void run() {
        String str = this.f46891a;
        if (str == null) {
            this.f46895g.f46896a.mo55549u(this.f46892c, (zzie) null);
            return;
        }
        this.f46895g.f46896a.mo55549u(this.f46892c, new zzie(this.f46893d, str, this.f46894f));
    }
}
