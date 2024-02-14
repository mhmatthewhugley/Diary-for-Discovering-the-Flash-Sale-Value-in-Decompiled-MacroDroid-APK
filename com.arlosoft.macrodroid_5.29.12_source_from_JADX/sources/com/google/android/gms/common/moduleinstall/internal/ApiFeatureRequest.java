package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();

    /* renamed from: g */
    private static final Comparator f3810g = zab.f3817a;
    @SafeParcelable.Field

    /* renamed from: a */
    private final List f3811a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final boolean f3812c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f3813d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final String f3814f;

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@SafeParcelable.Param @NonNull List list, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2) {
        Preconditions.m4488k(list);
        this.f3811a = list;
        this.f3812c = z;
        this.f3813d = str;
        this.f3814f = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f3812c != apiFeatureRequest.f3812c || !Objects.m4470a(this.f3811a, apiFeatureRequest.f3811a) || !Objects.m4470a(this.f3813d, apiFeatureRequest.f3813d) || !Objects.m4470a(this.f3814f, apiFeatureRequest.f3814f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(Boolean.valueOf(this.f3812c), this.f3811a, this.f3813d, this.f3814f);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l2 */
    public List<Feature> mo21862l2() {
        return this.f3811a;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4558B(parcel, 1, mo21862l2(), false);
        SafeParcelWriter.m4565c(parcel, 2, this.f3812c);
        SafeParcelWriter.m4586x(parcel, 3, this.f3813d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f3814f, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
