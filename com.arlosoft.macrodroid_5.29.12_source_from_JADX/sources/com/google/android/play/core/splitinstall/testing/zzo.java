package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.zzf;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzo implements zzf {

    /* renamed from: a */
    final /* synthetic */ List f51847a;

    /* renamed from: b */
    final /* synthetic */ List f51848b;

    /* renamed from: c */
    final /* synthetic */ long f51849c;

    /* renamed from: d */
    final /* synthetic */ boolean f51850d;

    /* renamed from: e */
    final /* synthetic */ List f51851e;

    /* renamed from: f */
    final /* synthetic */ FakeSplitInstallManager f51852f;

    zzo(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j, boolean z, List list3) {
        this.f51852f = fakeSplitInstallManager;
        this.f51847a = list;
        this.f51848b = list2;
        this.f51849c = j;
        this.f51850d = z;
        this.f51851e = list3;
    }

    /* renamed from: B */
    public final void mo59995B(int i) {
        boolean unused = this.f51852f.m71135n(6, i, (Long) null, (Long) null, (List) null, (Integer) null, (List) null);
    }

    /* renamed from: a */
    public final void mo59996a() {
        if (!this.f51850d) {
            this.f51852f.m71132k(this.f51851e, this.f51847a, this.f51848b, this.f51849c, true);
        }
    }

    public final void zza() {
        this.f51852f.m71134m(this.f51847a, this.f51848b, this.f51849c);
    }
}
