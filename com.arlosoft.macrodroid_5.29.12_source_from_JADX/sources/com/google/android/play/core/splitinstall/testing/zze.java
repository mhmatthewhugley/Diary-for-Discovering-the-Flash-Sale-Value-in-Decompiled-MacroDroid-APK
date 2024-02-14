package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FakeSplitInstallManager f51820a;

    /* renamed from: c */
    public final /* synthetic */ List f51821c;

    /* renamed from: d */
    public final /* synthetic */ List f51822d;

    /* renamed from: f */
    public final /* synthetic */ List f51823f;

    /* renamed from: g */
    public final /* synthetic */ long f51824g;

    public /* synthetic */ zze(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, long j) {
        this.f51820a = fakeSplitInstallManager;
        this.f51821c = list;
        this.f51822d = list2;
        this.f51823f = list3;
        this.f51824g = j;
    }

    public final void run() {
        this.f51820a.mo59978e(this.f51821c, this.f51822d, this.f51823f, this.f51824g);
    }
}
