package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcfy {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f28383a = new Object();

    /* renamed from: b */
    private final zzj f28384b;

    /* renamed from: c */
    private final zzcgc f28385c;

    /* renamed from: d */
    private boolean f28386d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f28387e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzcgv f28388f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public zzbjh f28389g;
    @Nullable

    /* renamed from: h */
    private Boolean f28390h;

    /* renamed from: i */
    private final AtomicInteger f28391i;

    /* renamed from: j */
    private final zzcfx f28392j;

    /* renamed from: k */
    private final Object f28393k;
    @GuardedBy("grantedPermissionLock")

    /* renamed from: l */
    private zzfzp f28394l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AtomicBoolean f28395m;

    public zzcfy() {
        zzj zzj = new zzj();
        this.f28384b = zzj;
        this.f28385c = new zzcgc(zzaw.m1919d(), zzj);
        this.f28386d = false;
        this.f28389g = null;
        this.f28390h = null;
        this.f28391i = new AtomicInteger(0);
        this.f28392j = new zzcfx((zzcfw) null);
        this.f28393k = new Object();
        this.f28395m = new AtomicBoolean();
    }

    /* renamed from: a */
    public final int mo43489a() {
        return this.f28391i.get();
    }

    @Nullable
    /* renamed from: c */
    public final Context mo43490c() {
        return this.f28387e;
    }

    @Nullable
    /* renamed from: d */
    public final Resources mo43491d() {
        if (this.f28388f.f28449f) {
            return this.f28387e.getResources();
        }
        try {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27310y8)).booleanValue()) {
                return zzcgt.m45235a(this.f28387e).getResources();
            }
            zzcgt.m45235a(this.f28387e).getResources();
            return null;
        } catch (zzcgs e) {
            zzcgp.m45230h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public final zzbjh mo43492f() {
        zzbjh zzbjh;
        synchronized (this.f28383a) {
            zzbjh = this.f28389g;
        }
        return zzbjh;
    }

    /* renamed from: g */
    public final zzcgc mo43493g() {
        return this.f28385c;
    }

    /* renamed from: h */
    public final zzg mo43494h() {
        zzj zzj;
        synchronized (this.f28383a) {
            zzj = this.f28384b;
        }
        return zzj;
    }

    /* renamed from: j */
    public final zzfzp mo43495j() {
        if (this.f28387e != null) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27174l2)).booleanValue()) {
                synchronized (this.f28393k) {
                    zzfzp zzfzp = this.f28394l;
                    if (zzfzp != null) {
                        return zzfzp;
                    }
                    zzfzp F = zzchc.f28456a.mo46579F(new zzcft(this));
                    this.f28394l = F;
                    return F;
                }
            }
        }
        return zzfzg.m51414i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean mo43496k() {
        Boolean bool;
        synchronized (this.f28383a) {
            bool = this.f28390h;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ ArrayList mo43497m() throws Exception {
        Context a = zzcbq.m44809a(this.f28387e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = Wrappers.m4929a(a).mo21963f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void mo43498o() {
        this.f28392j.mo43488a();
    }

    /* renamed from: p */
    public final void mo43499p() {
        this.f28391i.decrementAndGet();
    }

    /* renamed from: q */
    public final void mo43500q() {
        this.f28391i.incrementAndGet();
    }

    /* renamed from: r */
    public final void mo43501r(Context context, zzcgv zzcgv) {
        zzbjh zzbjh;
        synchronized (this.f28383a) {
            if (!this.f28386d) {
                this.f28387e = context.getApplicationContext();
                this.f28388f = zzcgv;
                zzt.m2891d().mo42462c(this.f28385c);
                this.f28384b.mo20390t0(this.f28387e);
                zzcaf.m44758d(this.f28387e, this.f28388f);
                zzt.m2894g();
                if (!((Boolean) zzbkm.f27413c.mo42728e()).booleanValue()) {
                    zze.m2645k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbjh = null;
                } else {
                    zzbjh = new zzbjh();
                }
                this.f28389g = zzbjh;
                if (zzbjh != null) {
                    zzchf.m45244a(new zzcfu(this).mo20314b(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.m4904i()) {
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27179l7)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcfv(this));
                    }
                }
                this.f28386d = true;
                mo43495j();
            }
        }
        zzt.m2905r().mo20412z(context, zzcgv.f28446a);
    }

    /* renamed from: s */
    public final void mo43502s(Throwable th, String str) {
        zzcaf.m44758d(this.f28387e, this.f28388f).mo43252a(th, str, ((Double) zzbla.f27489g.mo42728e()).floatValue());
    }

    /* renamed from: t */
    public final void mo43503t(Throwable th, String str) {
        zzcaf.m44758d(this.f28387e, this.f28388f).mo43253b(th, str);
    }

    /* renamed from: u */
    public final void mo43504u(Boolean bool) {
        synchronized (this.f28383a) {
            this.f28390h = bool;
        }
    }

    /* renamed from: v */
    public final boolean mo43505v(Context context) {
        if (PlatformVersion.m4904i()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27179l7)).booleanValue()) {
                return this.f28395m.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
