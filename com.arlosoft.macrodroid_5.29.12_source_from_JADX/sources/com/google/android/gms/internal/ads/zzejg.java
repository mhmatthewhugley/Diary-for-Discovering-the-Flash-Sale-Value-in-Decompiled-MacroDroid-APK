package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzejg implements zzdmp {

    /* renamed from: a */
    private final zzfdk f34185a;

    /* renamed from: b */
    private final zzbxd f34186b;

    /* renamed from: c */
    private final boolean f34187c;
    @Nullable

    /* renamed from: d */
    private zzdds f34188d = null;

    zzejg(zzfdk zzfdk, zzbxd zzbxd, boolean z) {
        this.f34185a = zzfdk;
        this.f34186b = zzbxd;
        this.f34187c = z;
    }

    /* renamed from: a */
    public final void mo44707a(boolean z, Context context, zzddn zzddn) throws zzdmo {
        boolean z2;
        try {
            if (this.f34187c) {
                z2 = this.f34186b.mo43179c0(ObjectWrapper.m5051g8(context));
            } else {
                z2 = this.f34186b.mo43181q3(ObjectWrapper.m5051g8(context));
            }
            if (!z2) {
                throw new zzdmo("Adapter failed to show.");
            } else if (this.f34188d != null) {
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27213p1)).booleanValue() && this.f34185a.f35518Z == 2) {
                    this.f34188d.zza();
                }
            }
        } catch (Throwable th) {
            throw new zzdmo(th);
        }
    }

    /* renamed from: b */
    public final void mo45335b(zzdds zzdds) {
        this.f34188d = zzdds;
    }
}
