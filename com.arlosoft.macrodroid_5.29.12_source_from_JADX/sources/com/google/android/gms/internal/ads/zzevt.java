package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevt implements zzeve {

    /* renamed from: a */
    private final Context f35047a;

    /* renamed from: b */
    private final ScheduledExecutorService f35048b;

    /* renamed from: c */
    private final Executor f35049c;

    /* renamed from: d */
    private final int f35050d;

    /* renamed from: e */
    private final zzcfp f35051e;

    public zzevt(zzcfp zzcfp, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f35051e = zzcfp;
        this.f35047a = context;
        this.f35048b = scheduledExecutorService;
        this.f35049c = executor;
        this.f35050d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzevu mo45489a(Throwable th) {
        String str;
        zzaw.m1917b();
        ContentResolver contentResolver = this.f35047a.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzevu((AdvertisingIdClient.Info) null, str);
    }

    public final int zza() {
        return 40;
    }

    public final zzfzp zzb() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26947O0)).booleanValue()) {
            return zzfzg.m51413h(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfzg.m51411f((zzfyx) zzfzg.m51420o(zzfzg.m51418m(zzfyx.m51389C(this.f35051e.mo43461a(this.f35047a, this.f35050d)), zzevr.f35045a, this.f35049c), ((Long) zzay.m1924c().mo42663b(zzbjc.f26957P0)).longValue(), TimeUnit.MILLISECONDS, this.f35048b), Throwable.class, new zzevs(this), this.f35049c);
    }
}
