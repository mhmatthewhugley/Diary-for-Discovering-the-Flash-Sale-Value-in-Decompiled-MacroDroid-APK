package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaov implements zzfos {

    /* renamed from: a */
    final /* synthetic */ zzfms f25192a;

    zzaov(zzaox zzaox, zzfms zzfms) {
        this.f25192a = zzfms;
    }

    /* renamed from: a */
    public final boolean mo41760a(File file) {
        try {
            return this.f25192a.mo45978a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
