package com.google.android.gms.internal.nearby;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzed {

    /* renamed from: a */
    private final zzef f44596a = new zzef((zzee) null);

    /* renamed from: a */
    public final zzed mo52637a(@Nullable zzcv zzcv) {
        this.f44596a.f44602o = zzcv;
        return this;
    }

    /* renamed from: b */
    public final zzed mo52638b(ExposureConfiguration exposureConfiguration) {
        this.f44596a.f44600f = exposureConfiguration;
        return this;
    }

    /* renamed from: c */
    public final zzed mo52639c(List list) {
        this.f44596a.f44599d = list;
        return this;
    }

    /* renamed from: d */
    public final zzed mo52640d(IStatusCallback iStatusCallback) {
        this.f44596a.f44598c = iStatusCallback;
        return this;
    }

    /* renamed from: e */
    public final zzed mo52641e(String str) {
        this.f44596a.f44601g = str;
        return this;
    }

    /* renamed from: f */
    public final zzef mo52642f() {
        return this.f44596a;
    }
}
