package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FakeSplitInstallManager f51837a;

    /* renamed from: c */
    public final /* synthetic */ long f51838c;

    /* renamed from: d */
    public final /* synthetic */ List f51839d;

    /* renamed from: f */
    public final /* synthetic */ List f51840f;

    /* renamed from: g */
    public final /* synthetic */ List f51841g;

    public /* synthetic */ zzl(FakeSplitInstallManager fakeSplitInstallManager, long j, List list, List list2, List list3) {
        this.f51837a = fakeSplitInstallManager;
        this.f51838c = j;
        this.f51839d = list;
        this.f51840f = list2;
        this.f51841g = list3;
    }

    public final void run() {
        this.f51837a.mo59976c(this.f51838c, this.f51839d, this.f51840f, this.f51841g);
    }
}
