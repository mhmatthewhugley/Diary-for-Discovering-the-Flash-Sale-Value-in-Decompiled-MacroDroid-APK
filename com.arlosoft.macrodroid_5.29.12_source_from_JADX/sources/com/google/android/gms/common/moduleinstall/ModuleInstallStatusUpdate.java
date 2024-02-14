package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();
    @SafeParcelable.Field

    /* renamed from: a */
    private final int f3802a;
    @SafeParcelable.Field
    @InstallState

    /* renamed from: c */
    private final int f3803c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final Long f3804d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final Long f3805f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f3806g;
    @Nullable

    /* renamed from: o */
    private final ProgressInfo f3807o;

    @Retention(RetentionPolicy.CLASS)
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public @interface InstallState {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class ProgressInfo {

        /* renamed from: a */
        private final long f3808a;

        /* renamed from: b */
        private final long f3809b;

        ProgressInfo(long j, long j2) {
            Preconditions.m4492o(j2);
            this.f3808a = j;
            this.f3809b = j2;
        }
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param int i, @SafeParcelable.Param @InstallState int i2, @SafeParcelable.Param @Nullable Long l, @SafeParcelable.Param @Nullable Long l2, @SafeParcelable.Param int i3) {
        this.f3802a = i;
        this.f3803c = i2;
        this.f3804d = l;
        this.f3805f = l2;
        this.f3806g = i3;
        this.f3807o = (l == null || l2 == null || l2.longValue() == 0) ? null : new ProgressInfo(l.longValue(), l2.longValue());
    }

    /* renamed from: l2 */
    public int mo21856l2() {
        return this.f3806g;
    }

    @InstallState
    /* renamed from: m2 */
    public int mo21857m2() {
        return this.f3803c;
    }

    /* renamed from: n2 */
    public int mo21858n2() {
        return this.f3802a;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo21858n2());
        SafeParcelWriter.m4576n(parcel, 2, mo21857m2());
        SafeParcelWriter.m4582t(parcel, 3, this.f3804d, false);
        SafeParcelWriter.m4582t(parcel, 4, this.f3805f, false);
        SafeParcelWriter.m4576n(parcel, 5, mo21856l2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
