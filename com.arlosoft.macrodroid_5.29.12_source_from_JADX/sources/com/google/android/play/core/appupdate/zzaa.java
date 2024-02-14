package com.google.android.play.core.appupdate;

import com.google.android.play.core.internal.zzcq;
import com.google.android.play.core.internal.zzcs;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzaa {

    /* renamed from: a */
    private final zzaa f51122a = this;

    /* renamed from: b */
    private final zzcs f51123b;

    /* renamed from: c */
    private final zzcs f51124c;

    /* renamed from: d */
    private final zzcs f51125d;

    /* renamed from: e */
    private final zzcs f51126e;

    /* renamed from: f */
    private final zzcs f51127f;

    /* renamed from: g */
    private final zzcs f51128g;

    /* synthetic */ zzaa(zzh zzh, zzz zzz) {
        zzj zzj = new zzj(zzh);
        this.f51123b = zzj;
        zzcs b = zzcq.m70943b(new zzt(zzj));
        this.f51124c = b;
        zzcs b2 = zzcq.m70943b(new zzr(zzj, b));
        this.f51125d = b2;
        zzcs b3 = zzcq.m70943b(new zzc(zzj));
        this.f51126e = b3;
        zzcs b4 = zzcq.m70943b(new zzg(b2, b3, zzj));
        this.f51127f = b4;
        this.f51128g = zzcq.m70943b(new zzi(b4));
    }

    /* renamed from: a */
    public final AppUpdateManager mo59547a() {
        return (AppUpdateManager) this.f51128g.zza();
    }
}
