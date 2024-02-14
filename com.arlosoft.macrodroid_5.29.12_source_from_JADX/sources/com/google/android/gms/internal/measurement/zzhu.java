package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhu extends zzib {
    zzhu(zzhy zzhy, String str, Long l, boolean z) {
        super(zzhy, str, l, true, (zzia) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51276a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo51284c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
