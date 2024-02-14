package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeqn implements zzevd {

    /* renamed from: a */
    private final zzw f34717a;

    /* renamed from: b */
    private final zzcgv f34718b;

    /* renamed from: c */
    private final boolean f34719c;

    public zzeqn(zzw zzw, zzcgv zzcgv, boolean z) {
        this.f34717a = zzw;
        this.f34718b = zzcgv;
        this.f34719c = z;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f34718b.f28448d >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27226q4)).intValue()) {
            bundle.putString("app_open_version", ExifInterface.GPS_MEASUREMENT_2D);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27236r4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f34719c);
        }
        zzw zzw = this.f34717a;
        if (zzw != null) {
            int i = zzw.f2046a;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
