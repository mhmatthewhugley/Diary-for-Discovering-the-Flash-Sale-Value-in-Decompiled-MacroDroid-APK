package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbqd implements zzx {

    /* renamed from: a */
    boolean f27643a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f27644b;

    /* renamed from: c */
    final /* synthetic */ zza f27645c;

    /* renamed from: d */
    final /* synthetic */ Map f27646d;

    /* renamed from: e */
    final /* synthetic */ Map f27647e;

    zzbqd(zzbqf zzbqf, boolean z, zza zza, Map map, Map map2) {
        this.f27644b = z;
        this.f27645c = zza;
        this.f27646d = map;
        this.f27647e = map2;
    }

    /* renamed from: B */
    public final void mo20240B(int i) {
    }

    /* renamed from: O */
    public final void mo20241O(boolean z) {
        if (!this.f27643a) {
            if (z && this.f27644b) {
                ((zzdkn) this.f27645c).mo44113s();
            }
            this.f27643a = true;
            this.f27646d.put((String) this.f27647e.get("event_id"), Boolean.valueOf(z));
            ((zzbsn) this.f27645c).mo42954y("openIntentAsync", this.f27646d);
        }
    }
}
