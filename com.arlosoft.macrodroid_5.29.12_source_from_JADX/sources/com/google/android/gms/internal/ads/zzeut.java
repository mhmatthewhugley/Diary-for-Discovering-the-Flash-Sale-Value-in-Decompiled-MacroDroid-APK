package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeut implements zzeve {

    /* renamed from: a */
    private final zzfzq f34974a;

    /* renamed from: b */
    private final Context f34975b;

    /* renamed from: c */
    private final zzcgv f34976c;

    public zzeut(zzfzq zzfzq, Context context, zzcgv zzcgv) {
        this.f34974a = zzfzq;
        this.f34975b = context;
        this.f34976c = zzcgv;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzeuu mo45476a() throws Exception {
        int i;
        boolean g = Wrappers.m4929a(this.f34975b).mo21964g();
        zzt.m2905r();
        boolean a = zzs.m2750a(this.f34975b);
        String str = this.f34976c.f28446a;
        zzt.m2905r();
        boolean b = zzs.m2751b();
        zzt.m2905r();
        ApplicationInfo applicationInfo = this.f34975b.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new zzeuu(g, a, str, b, i, DynamiteModule.m5095c(this.f34975b, ModuleDescriptor.MODULE_ID), DynamiteModule.m5094a(this.f34975b, ModuleDescriptor.MODULE_ID));
    }

    public final int zza() {
        return 35;
    }

    public final zzfzp zzb() {
        return this.f34974a.mo46579F(new zzeus(this));
    }
}
