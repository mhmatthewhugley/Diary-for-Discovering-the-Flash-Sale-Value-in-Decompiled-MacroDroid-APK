package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzazo {

    /* renamed from: a */
    public final Uri f26354a;

    /* renamed from: b */
    public final long f26355b;

    /* renamed from: c */
    public final long f26356c;

    /* renamed from: d */
    public final long f26357d;

    public zzazo(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzbac.m42924c(j >= 0);
        zzbac.m42924c(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1 : j3;
            zzbac.m42924c(z);
            this.f26354a = uri;
            this.f26355b = j;
            this.f26356c = j2;
            this.f26357d = j3;
        }
        z = true;
        zzbac.m42924c(z);
        this.f26354a = uri;
        this.f26355b = j;
        this.f26356c = j2;
        this.f26357d = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26354a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f26355b;
        long j2 = this.f26356c;
        long j3 = this.f26357d;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j + ", " + j2 + ", " + j3 + ", null, 0]";
    }
}
