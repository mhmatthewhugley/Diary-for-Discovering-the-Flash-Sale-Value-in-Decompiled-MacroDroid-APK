package com.google.android.gms.internal.ads;

import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfft {

    /* renamed from: a */
    private final zzffs f35705a = new zzffs();

    /* renamed from: b */
    private int f35706b;

    /* renamed from: c */
    private int f35707c;

    /* renamed from: d */
    private int f35708d;

    /* renamed from: e */
    private int f35709e;

    /* renamed from: f */
    private int f35710f;

    zzfft() {
    }

    /* renamed from: a */
    public final zzffs mo45694a() {
        zzffs a = this.f35705a.clone();
        zzffs zzffs = this.f35705a;
        zzffs.f35703a = false;
        zzffs.f35704c = false;
        return a;
    }

    /* renamed from: b */
    public final String mo45695b() {
        return "\n\tPool does not exist: " + this.f35708d + "\n\tNew pools created: " + this.f35706b + "\n\tPools removed: " + this.f35707c + "\n\tEntries added: " + this.f35710f + "\n\tNo entries retrieved: " + this.f35709e + IOUtils.LINE_SEPARATOR_UNIX;
    }

    /* renamed from: c */
    public final void mo45696c() {
        this.f35710f++;
    }

    /* renamed from: d */
    public final void mo45697d() {
        this.f35706b++;
        this.f35705a.f35703a = true;
    }

    /* renamed from: e */
    public final void mo45698e() {
        this.f35709e++;
    }

    /* renamed from: f */
    public final void mo45699f() {
        this.f35708d++;
    }

    /* renamed from: g */
    public final void mo45700g() {
        this.f35707c++;
        this.f35705a.f35704c = true;
    }
}
