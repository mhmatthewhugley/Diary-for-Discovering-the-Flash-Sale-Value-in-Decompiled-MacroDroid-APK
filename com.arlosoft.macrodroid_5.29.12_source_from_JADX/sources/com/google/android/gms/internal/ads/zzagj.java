package com.google.android.gms.internal.ads;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagj extends zzagn {

    /* renamed from: o */
    private static final byte[] f24414o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f24415p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f24416n;

    zzagj() {
    }

    /* renamed from: j */
    public static boolean m41339j(zzef zzef) {
        return m41340k(zzef, f24414o);
    }

    /* renamed from: k */
    private static boolean m41340k(zzef zzef, byte[] bArr) {
        if (zzef.mo45233i() < 8) {
            return false;
        }
        int k = zzef.mo45235k();
        byte[] bArr2 = new byte[8];
        zzef.mo45226b(bArr2, 0, 8);
        zzef.mo45230f(k);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41449a(zzef zzef) {
        byte[] h = zzef.mo45232h();
        byte b = h[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = h[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo41462f(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE << (i2 & 1) : i2 == 3 ? 60000 : SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41450b(boolean z) {
        super.mo41450b(z);
        if (z) {
            this.f24416n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo41451c(zzef zzef, long j, zzagk zzagk) throws zzbu {
        if (m41340k(zzef, f24414o)) {
            byte[] copyOf = Arrays.copyOf(zzef.mo45232h(), zzef.mo45236l());
            byte b = copyOf[9] & 255;
            List a = zzaag.m40919a(copyOf);
            if (zzagk.f24417a != null) {
                return true;
            }
            zzad zzad = new zzad();
            zzad.mo41343s("audio/opus");
            zzad.mo41326e0(b);
            zzad.mo41344t(48000);
            zzad.mo41333i(a);
            zzagk.f24417a = zzad.mo41349y();
            return true;
        } else if (m41340k(zzef, f24415p)) {
            zzdd.m47208b(zzagk.f24417a);
            if (this.f24416n) {
                return true;
            }
            this.f24416n = true;
            zzef.mo45231g(8);
            zzbq b2 = zzaav.m40954b(zzfvn.m51134u(zzaav.m40955c(zzef, false, false).f23757b));
            if (b2 == null) {
                return true;
            }
            zzad b3 = zzagk.f24417a.mo41422b();
            b3.mo41337m(b2.mo42878d(zzagk.f24417a.f24211j));
            zzagk.f24417a = b3.mo41349y();
            return true;
        } else {
            zzdd.m47208b(zzagk.f24417a);
            return false;
        }
    }
}
