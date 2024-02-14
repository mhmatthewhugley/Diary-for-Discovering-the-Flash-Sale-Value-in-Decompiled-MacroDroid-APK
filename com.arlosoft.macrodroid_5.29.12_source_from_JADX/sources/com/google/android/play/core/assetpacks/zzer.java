package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzer {

    /* renamed from: b */
    private static final zzag f51596b = new zzag("VerifySliceTaskHandler");

    /* renamed from: a */
    private final zzbh f51597a;

    zzer(zzbh zzbh) {
        this.f51597a = zzbh;
    }

    /* renamed from: b */
    private final void m70732b(zzeq zzeq, File file) {
        try {
            File C = this.f51597a.mo59624C(zzeq.f51464b, zzeq.f51592c, zzeq.f51593d, zzeq.f51594e);
            if (C.exists()) {
                try {
                    if (zzdq.m70692a(zzep.m70730a(file, C)).equals(zzeq.f51595f)) {
                        f51596b.mo59808d("Verification of slice %s of pack %s successful.", zzeq.f51594e, zzeq.f51464b);
                        return;
                    }
                    throw new zzck(String.format("Verification failed for slice %s.", new Object[]{zzeq.f51594e}), zzeq.f51463a);
                } catch (NoSuchAlgorithmException e) {
                    throw new zzck("SHA256 algorithm not supported.", e, zzeq.f51463a);
                } catch (IOException e2) {
                    throw new zzck(String.format("Could not digest file during verification for slice %s.", new Object[]{zzeq.f51594e}), e2, zzeq.f51463a);
                }
            } else {
                throw new zzck(String.format("Cannot find metadata files for slice %s.", new Object[]{zzeq.f51594e}), zzeq.f51463a);
            }
        } catch (IOException e3) {
            throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{zzeq.f51594e}), e3, zzeq.f51463a);
        }
    }

    /* renamed from: a */
    public final void mo59772a(zzeq zzeq) {
        File D = this.f51597a.mo59625D(zzeq.f51464b, zzeq.f51592c, zzeq.f51593d, zzeq.f51594e);
        if (D.exists()) {
            m70732b(zzeq, D);
            File E = this.f51597a.mo59626E(zzeq.f51464b, zzeq.f51592c, zzeq.f51593d, zzeq.f51594e);
            if (!E.exists()) {
                E.mkdirs();
            }
            if (!D.renameTo(E)) {
                throw new zzck(String.format("Failed to move slice %s after verification.", new Object[]{zzeq.f51594e}), zzeq.f51463a);
            }
            return;
        }
        throw new zzck(String.format("Cannot find unverified files for slice %s.", new Object[]{zzeq.f51594e}), zzeq.f51463a);
    }
}
