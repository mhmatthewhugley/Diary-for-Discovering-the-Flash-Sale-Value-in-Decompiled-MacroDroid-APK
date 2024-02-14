package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Asset> CREATOR = new zzc();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private byte[] f48063a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f48064c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public ParcelFileDescriptor f48065d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    public Uri f48066f;

    @SafeParcelable.Constructor
    Asset(@SafeParcelable.Param @Nullable byte[] bArr, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param @Nullable Uri uri) {
        this.f48063a = bArr;
        this.f48064c = str;
        this.f48065d = parcelFileDescriptor;
        this.f48066f = uri;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: l2 */
    public static Asset m66763l2(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        Preconditions.m4488k(parcelFileDescriptor);
        return new Asset((byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
    }

    @NonNull
    /* renamed from: m2 */
    public static Asset m66764m2(@NonNull String str) {
        Preconditions.m4488k(str);
        return new Asset((byte[]) null, str, (ParcelFileDescriptor) null, (Uri) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f48063a, asset.f48063a) && Objects.m4470a(this.f48064c, asset.f48064c) && Objects.m4470a(this.f48065d, asset.f48065d) && Objects.m4470a(this.f48066f, asset.f48066f);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f48063a, this.f48064c, this.f48065d, this.f48066f});
    }

    @Nullable
    /* renamed from: n2 */
    public String mo56168n2() {
        return this.f48064c;
    }

    @Nullable
    /* renamed from: o2 */
    public ParcelFileDescriptor mo56169o2() {
        return this.f48065d;
    }

    @Nullable
    /* renamed from: p2 */
    public Uri mo56170p2() {
        return this.f48066f;
    }

    @Nullable
    /* renamed from: q2 */
    public final byte[] mo56171q2() {
        return this.f48063a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f48064c == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.f48064c);
        }
        if (this.f48063a != null) {
            sb.append(", size=");
            sb.append(((byte[]) Preconditions.m4488k(this.f48063a)).length);
        }
        if (this.f48065d != null) {
            sb.append(", fd=");
            sb.append(this.f48065d);
        }
        if (this.f48066f != null) {
            sb.append(", uri=");
            sb.append(this.f48066f);
        }
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.m4488k(parcel);
        int i2 = i | 1;
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4569g(parcel, 2, this.f48063a, false);
        SafeParcelWriter.m4586x(parcel, 3, mo56168n2(), false);
        SafeParcelWriter.m4584v(parcel, 4, this.f48065d, i2, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f48066f, i2, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
