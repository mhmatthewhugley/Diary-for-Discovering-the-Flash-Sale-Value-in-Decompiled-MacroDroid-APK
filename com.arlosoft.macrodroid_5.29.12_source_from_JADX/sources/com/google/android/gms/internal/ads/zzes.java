package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzes extends zzer {

    /* renamed from: e */
    private final byte[] f34818e;
    @Nullable

    /* renamed from: f */
    private Uri f34819f;

    /* renamed from: g */
    private int f34820g;

    /* renamed from: h */
    private int f34821h;

    /* renamed from: i */
    private boolean f34822i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzes(byte[] bArr) {
        super(false);
        boolean z = false;
        Objects.requireNonNull(bArr);
        zzdd.m47210d(bArr.length > 0 ? true : z);
        this.f34818e = bArr;
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f34819f;
    }

    /* renamed from: d */
    public final void mo43926d() {
        if (this.f34822i) {
            this.f34822i = false;
            mo45436o();
        }
        this.f34819f = null;
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f34821h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f34818e, this.f34820g, bArr, i, min);
        this.f34820g += min;
        this.f34821h -= min;
        mo45439x(min);
        return min;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws IOException {
        this.f34819f = zzfc.f35396a;
        mo45437p(zzfc);
        long j = zzfc.f35401f;
        int length = this.f34818e.length;
        if (j <= ((long) length)) {
            int i = (int) j;
            this.f34820g = i;
            int i2 = length - i;
            this.f34821h = i2;
            long j2 = zzfc.f35402g;
            if (j2 != -1) {
                this.f34821h = (int) Math.min((long) i2, j2);
            }
            this.f34822i = true;
            mo45438q(zzfc);
            long j3 = zzfc.f35402g;
            return j3 != -1 ? j3 : (long) this.f34821h;
        }
        throw new zzey(2008);
    }
}
