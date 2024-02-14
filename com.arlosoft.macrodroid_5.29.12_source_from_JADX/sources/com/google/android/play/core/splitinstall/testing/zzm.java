package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FakeSplitInstallManager f51842a;

    /* renamed from: c */
    public final /* synthetic */ SplitInstallSessionState f51843c;

    public /* synthetic */ zzm(FakeSplitInstallManager fakeSplitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        this.f51842a = fakeSplitInstallManager;
        this.f51843c = splitInstallSessionState;
    }

    public final void run() {
        this.f51842a.mo59977d(this.f51843c);
    }
}
