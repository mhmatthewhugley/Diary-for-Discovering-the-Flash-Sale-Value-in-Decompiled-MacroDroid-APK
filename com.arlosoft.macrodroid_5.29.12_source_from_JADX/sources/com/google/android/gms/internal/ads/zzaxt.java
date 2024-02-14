package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzaxw f26182a;

    /* renamed from: c */
    final /* synthetic */ zzaxy f26183c;

    zzaxt(zzaxy zzaxy, zzaxw zzaxw) {
        this.f26183c = zzaxy;
        this.f26182a = zzaxw;
    }

    public final void run() {
        this.f26182a.mo42200a();
        int size = this.f26183c.f26205E.size();
        for (int i = 0; i < size; i++) {
            ((zzayn) this.f26183c.f26205E.valueAt(i)).mo42247i();
        }
    }
}
