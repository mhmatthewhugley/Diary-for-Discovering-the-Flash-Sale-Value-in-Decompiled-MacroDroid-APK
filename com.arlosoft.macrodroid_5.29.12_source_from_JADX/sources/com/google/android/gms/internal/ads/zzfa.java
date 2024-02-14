package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfa {
    @Nullable

    /* renamed from: a */
    private Uri f35300a;

    /* renamed from: b */
    private final int f35301b = 1;

    /* renamed from: c */
    private Map f35302c = Collections.emptyMap();

    /* renamed from: d */
    private long f35303d;

    /* renamed from: e */
    private int f35304e;

    /* renamed from: a */
    public final zzfa mo45547a(int i) {
        this.f35304e = 6;
        return this;
    }

    /* renamed from: b */
    public final zzfa mo45548b(Map map) {
        this.f35302c = map;
        return this;
    }

    /* renamed from: c */
    public final zzfa mo45549c(long j) {
        this.f35303d = j;
        return this;
    }

    /* renamed from: d */
    public final zzfa mo45550d(Uri uri) {
        this.f35300a = uri;
        return this;
    }

    /* renamed from: e */
    public final zzfc mo45551e() {
        if (this.f35300a != null) {
            return new zzfc(this.f35300a, 0, 1, (byte[]) null, this.f35302c, this.f35303d, -1, (String) null, this.f35304e, (Object) null, (zzfb) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
