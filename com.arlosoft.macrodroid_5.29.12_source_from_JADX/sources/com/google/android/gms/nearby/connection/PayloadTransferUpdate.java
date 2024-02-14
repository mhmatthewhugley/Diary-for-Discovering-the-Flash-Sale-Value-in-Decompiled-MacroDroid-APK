package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzq();
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: a */
    public long f47468a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public int f47469c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: d */
    public long f47470d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public long f47471f;

    @SafeParcelable.Reserved
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static final class Builder {

        /* renamed from: a */
        private final PayloadTransferUpdate f47472a;

        public Builder() {
            this.f47472a = new PayloadTransferUpdate((zzp) null);
        }

        @NonNull
        /* renamed from: a */
        public PayloadTransferUpdate mo55698a() {
            return this.f47472a;
        }

        @NonNull
        /* renamed from: b */
        public Builder mo55699b(long j) {
            this.f47472a.f47468a = j;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo55700c(int i) {
            this.f47472a.f47469c = i;
            return this;
        }

        public Builder(@NonNull PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate((zzp) null);
            this.f47472a = payloadTransferUpdate2;
            payloadTransferUpdate2.f47468a = payloadTransferUpdate.f47468a;
            payloadTransferUpdate2.f47469c = payloadTransferUpdate.f47469c;
            payloadTransferUpdate2.f47470d = payloadTransferUpdate.f47470d;
            payloadTransferUpdate2.f47471f = payloadTransferUpdate.f47471f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public @interface Status {
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            return Objects.m4470a(Long.valueOf(this.f47468a), Long.valueOf(payloadTransferUpdate.f47468a)) && Objects.m4470a(Integer.valueOf(this.f47469c), Integer.valueOf(payloadTransferUpdate.f47469c)) && Objects.m4470a(Long.valueOf(this.f47470d), Long.valueOf(payloadTransferUpdate.f47470d)) && Objects.m4470a(Long.valueOf(this.f47471f), Long.valueOf(payloadTransferUpdate.f47471f));
        }
    }

    public int hashCode() {
        return Objects.m4471b(Long.valueOf(this.f47468a), Integer.valueOf(this.f47469c), Long.valueOf(this.f47470d), Long.valueOf(this.f47471f));
    }

    /* renamed from: l2 */
    public long mo55693l2() {
        return this.f47471f;
    }

    /* renamed from: m2 */
    public long mo55694m2() {
        return this.f47468a;
    }

    /* renamed from: n2 */
    public int mo55695n2() {
        return this.f47469c;
    }

    /* renamed from: o2 */
    public long mo55696o2() {
        return this.f47470d;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, mo55694m2());
        SafeParcelWriter.m4576n(parcel, 2, mo55695n2());
        SafeParcelWriter.m4581s(parcel, 3, mo55696o2());
        SafeParcelWriter.m4581s(parcel, 4, mo55693l2());
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    PayloadTransferUpdate(@SafeParcelable.Param long j, @SafeParcelable.Param int i, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3) {
        this.f47468a = j;
        this.f47469c = i;
        this.f47470d = j2;
        this.f47471f = j3;
    }

    /* synthetic */ PayloadTransferUpdate(zzp zzp) {
    }
}
