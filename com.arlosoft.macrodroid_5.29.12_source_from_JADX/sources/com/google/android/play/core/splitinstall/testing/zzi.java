package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final /* synthetic */ class zzi implements zzp {

    /* renamed from: a */
    public final /* synthetic */ Integer f51828a;

    /* renamed from: b */
    public final /* synthetic */ int f51829b;

    /* renamed from: c */
    public final /* synthetic */ int f51830c;

    /* renamed from: d */
    public final /* synthetic */ Long f51831d;

    /* renamed from: e */
    public final /* synthetic */ Long f51832e;

    /* renamed from: f */
    public final /* synthetic */ List f51833f;

    /* renamed from: g */
    public final /* synthetic */ List f51834g;

    public /* synthetic */ zzi(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.f51828a = num;
        this.f51829b = i;
        this.f51830c = i2;
        this.f51831d = l;
        this.f51832e = l2;
        this.f51833f = list;
        this.f51834g = list2;
    }

    /* renamed from: a */
    public final SplitInstallSessionState mo59990a(SplitInstallSessionState splitInstallSessionState) {
        long j;
        Integer num = this.f51828a;
        int i = this.f51829b;
        int i2 = this.f51830c;
        Long l = this.f51831d;
        Long l2 = this.f51832e;
        List<String> list = this.f51833f;
        List<String> list2 = this.f51834g;
        int i3 = FakeSplitInstallManager.f51799q;
        SplitInstallSessionState b = splitInstallSessionState == null ? SplitInstallSessionState.m71110b(0, 0, 0, 0, 0, new ArrayList(), new ArrayList()) : splitInstallSessionState;
        int h = num == null ? b.mo59970h() : num.intValue();
        long a = l == null ? b.mo59964a() : l.longValue();
        if (l2 == null) {
            j = b.mo59972j();
        } else {
            j = l2.longValue();
        }
        return SplitInstallSessionState.m71110b(h, i, i2, a, j, list == null ? b.mo59968f() : list, list2 == null ? b.mo59967e() : list2);
    }
}
