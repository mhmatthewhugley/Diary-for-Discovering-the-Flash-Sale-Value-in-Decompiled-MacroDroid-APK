package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class DataBufferRef {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final DataHolder f3516a;
    @KeepForSdk

    /* renamed from: c */
    protected int f3517c;

    /* renamed from: d */
    private int f3518d;

    @KeepForSdk
    public DataBufferRef(@NonNull DataHolder dataHolder, int i) {
        this.f3516a = (DataHolder) Preconditions.m4488k(dataHolder);
        mo21561g(i);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public byte[] mo21554a(@NonNull String str) {
        return this.f3516a.mo21568m2(str, this.f3517c, this.f3518d);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public float mo21555b(@NonNull String str) {
        return this.f3516a.mo21576u2(str, this.f3517c, this.f3518d);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: c */
    public int mo21556c(@NonNull String str) {
        return this.f3516a.mo21569n2(str, this.f3517c, this.f3518d);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public String mo21557d(@NonNull String str) {
        return this.f3516a.mo21572q2(str, this.f3517c, this.f3518d);
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean mo21558e(@NonNull String str) {
        return this.f3516a.mo21574s2(str);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (!Objects.m4470a(Integer.valueOf(dataBufferRef.f3517c), Integer.valueOf(this.f3517c)) || !Objects.m4470a(Integer.valueOf(dataBufferRef.f3518d), Integer.valueOf(this.f3518d)) || dataBufferRef.f3516a != this.f3516a) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: f */
    public boolean mo21560f(@NonNull String str) {
        return this.f3516a.mo21575t2(str, this.f3517c, this.f3518d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo21561g(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f3516a.getCount()) {
            z = true;
        }
        Preconditions.m4493p(z);
        this.f3517c = i;
        this.f3518d = this.f3516a.mo21573r2(i);
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f3517c), Integer.valueOf(this.f3518d), this.f3516a);
    }
}
