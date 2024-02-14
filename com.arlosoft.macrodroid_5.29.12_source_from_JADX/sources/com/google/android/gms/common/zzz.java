package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzz {
    @Nullable

    /* renamed from: a */
    private String f4011a = null;

    /* renamed from: b */
    private long f4012b = -1;

    /* renamed from: c */
    private zzag f4013c = zzag.m55889p();

    /* renamed from: d */
    private zzag f4014d = zzag.m55889p();

    zzz() {
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: a */
    public final zzz mo21992a(long j) {
        this.f4012b = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final zzz mo21993b(List list) {
        Preconditions.m4488k(list);
        this.f4014d = zzag.m55888n(list);
        return this;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: c */
    public final zzz mo21994c(List list) {
        Preconditions.m4488k(list);
        this.f4013c = zzag.m55888n(list);
        return this;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: d */
    public final zzz mo21995d(String str) {
        this.f4011a = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final zzab mo21996e() {
        if (this.f4011a == null) {
            throw new IllegalStateException("packageName must be defined");
        } else if (this.f4012b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        } else if (!this.f4013c.isEmpty() || !this.f4014d.isEmpty()) {
            return new zzab(this.f4011a, this.f4012b, this.f4013c, this.f4014d, (zzaa) null);
        } else {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
