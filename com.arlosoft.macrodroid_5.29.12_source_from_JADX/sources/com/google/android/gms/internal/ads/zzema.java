package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzema implements zzdej {

    /* renamed from: a */
    boolean f34432a = false;

    /* renamed from: b */
    final /* synthetic */ zzehf f34433b;

    /* renamed from: c */
    final /* synthetic */ zzchh f34434c;

    /* renamed from: d */
    final /* synthetic */ zzemb f34435d;

    zzema(zzemb zzemb, zzehf zzehf, zzchh zzchh) {
        this.f34435d = zzemb;
        this.f34433b = zzehf;
        this.f34434c = zzchh;
    }

    /* renamed from: a */
    private final synchronized void m49066a(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26821B4)).booleanValue()) {
            i = 3;
        }
        this.f34434c.mo43575d(new zzehg(i, zze));
    }

    /* renamed from: d */
    public final synchronized void mo44594d() {
        this.f34434c.mo43574c((Object) null);
    }

    /* renamed from: r1 */
    public final synchronized void mo44595r1(zze zze) {
        if (!this.f34432a) {
            this.f34432a = true;
            m49066a(zze);
        }
    }

    /* renamed from: v */
    public final synchronized void mo44596v(int i) {
        if (!this.f34432a) {
            this.f34432a = true;
            m49066a(new zze(i, zzemb.m49071e(this.f34433b.f34015a, i), "undefined", (zze) null, (IBinder) null));
        }
    }

    /* renamed from: w */
    public final synchronized void mo44597w(int i, @Nullable String str) {
        if (!this.f34432a) {
            this.f34432a = true;
            if (str == null) {
                str = zzemb.m49071e(this.f34433b.f34015a, i);
            }
            m49066a(new zze(i, str, "undefined", (zze) null, (IBinder) null));
        }
    }
}
