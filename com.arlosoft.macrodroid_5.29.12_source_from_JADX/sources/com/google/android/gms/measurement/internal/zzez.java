package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzez {

    /* renamed from: a */
    final zzfr f46763a;

    zzez(zzkt zzkt) {
        this.f46763a = zzkt.mo55525c0();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final boolean mo55139a() {
        try {
            PackageManagerWrapper a = Wrappers.m4929a(this.f46763a.mo55202c());
            if (a == null) {
                this.f46763a.mo55221z().mo55102t().mo55091a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo21963f("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f46763a.mo55221z().mo55102t().mo55092b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
