package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhw extends zzib {
    zzhw(zzhy zzhy, String str, Double d, boolean z) {
        super(zzhy, "measurement.test.double_flag", d, true, (zzia) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51276a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo51284c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
