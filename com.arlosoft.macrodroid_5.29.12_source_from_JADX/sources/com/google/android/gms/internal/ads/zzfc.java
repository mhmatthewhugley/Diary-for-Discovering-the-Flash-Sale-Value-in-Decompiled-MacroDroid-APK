package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfc {

    /* renamed from: a */
    public final Uri f35396a;

    /* renamed from: b */
    public final int f35397b;
    @Nullable

    /* renamed from: c */
    public final byte[] f35398c;

    /* renamed from: d */
    public final Map f35399d;
    @Deprecated

    /* renamed from: e */
    public final long f35400e;

    /* renamed from: f */
    public final long f35401f;

    /* renamed from: g */
    public final long f35402g;
    @Nullable

    /* renamed from: h */
    public final String f35403h;

    /* renamed from: i */
    public final int f35404i;

    static {
        zzbh.m43425b("media3.datasource");
    }

    private zzfc(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        long j4 = j2;
        long j5 = j + j4;
        boolean z = false;
        zzdd.m47210d(j5 >= 0);
        zzdd.m47210d(j4 >= 0);
        long j6 = -1;
        if (j3 > 0) {
            j6 = j3;
        } else if (j3 != -1) {
            j6 = j3;
            zzdd.m47210d(z);
            this.f35396a = uri;
            this.f35397b = 1;
            this.f35398c = null;
            this.f35399d = Collections.unmodifiableMap(new HashMap(map));
            this.f35401f = j4;
            this.f35400e = j5;
            this.f35402g = j6;
            this.f35403h = null;
            this.f35404i = i2;
        }
        z = true;
        zzdd.m47210d(z);
        this.f35396a = uri;
        this.f35397b = 1;
        this.f35398c = null;
        this.f35399d = Collections.unmodifiableMap(new HashMap(map));
        this.f35401f = j4;
        this.f35400e = j5;
        this.f35402g = j6;
        this.f35403h = null;
        this.f35404i = i2;
    }

    /* synthetic */ zzfc(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, zzfb zzfb) {
        this(uri, 0, 1, (byte[]) null, map, j2, -1, (String) null, i2, (Object) null);
    }

    /* renamed from: a */
    public static String m49838a(int i) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean mo45582b(int i) {
        return (this.f35404i & i) == i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35396a);
        long j = this.f35401f;
        long j2 = this.f35402g;
        int i = this.f35404i;
        return "DataSpec[" + m49838a(1) + " " + valueOf + ", " + j + ", " + j2 + ", null, " + i + "]";
    }

    @Deprecated
    public zzfc(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, j - j2, 1, (byte[]) null, Collections.emptyMap(), j2, j3, (String) null, i, (Object) null);
    }
}
