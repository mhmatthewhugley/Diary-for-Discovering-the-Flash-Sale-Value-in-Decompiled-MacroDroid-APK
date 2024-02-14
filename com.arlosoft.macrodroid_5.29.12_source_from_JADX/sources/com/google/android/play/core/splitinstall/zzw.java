package com.google.android.play.core.splitinstall;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f51942a;

    /* renamed from: c */
    final /* synthetic */ int f51943c;

    /* renamed from: d */
    final /* synthetic */ int f51944d;

    /* renamed from: f */
    final /* synthetic */ zzx f51945f;

    zzw(zzx zzx, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.f51945f = zzx;
        this.f51942a = splitInstallSessionState;
        this.f51943c = i;
        this.f51944d = i2;
    }

    public final void run() {
        zzx zzx = this.f51945f;
        SplitInstallSessionState splitInstallSessionState = this.f51942a;
        zzx.mo60012i(new zza(splitInstallSessionState.mo59970h(), this.f51943c, this.f51944d, splitInstallSessionState.mo59964a(), splitInstallSessionState.mo59972j(), splitInstallSessionState.mo59974l(), splitInstallSessionState.mo59973k(), splitInstallSessionState.mo59969g(), splitInstallSessionState.mo59975m()));
    }
}
