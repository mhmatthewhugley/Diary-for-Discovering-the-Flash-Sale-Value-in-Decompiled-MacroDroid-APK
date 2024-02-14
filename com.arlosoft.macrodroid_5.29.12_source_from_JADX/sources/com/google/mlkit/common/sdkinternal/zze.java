package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.internal.mlkit_common.zzmq;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CloseGuard f56400a;

    /* renamed from: c */
    public final /* synthetic */ int f56401c;

    /* renamed from: d */
    public final /* synthetic */ zzmq f56402d;

    /* renamed from: f */
    public final /* synthetic */ Runnable f56403f;

    public /* synthetic */ zze(CloseGuard closeGuard, int i, zzmq zzmq, Runnable runnable) {
        this.f56400a = closeGuard;
        this.f56401c = i;
        this.f56402d = zzmq;
        this.f56403f = runnable;
    }

    public final void run() {
        this.f56400a.mo64544b(this.f56401c, this.f56402d, this.f56403f);
    }
}
