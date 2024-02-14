package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class WebImage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3552a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Uri f3553c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final int f3554d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final int f3555f;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param int i, @SafeParcelable.Param Uri uri, @SafeParcelable.Param int i2, @SafeParcelable.Param int i3) {
        this.f3552a = i;
        this.f3553c = uri;
        this.f3554d = i2;
        this.f3555f = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.m4470a(this.f3553c, webImage.f3553c) && this.f3554d == webImage.f3554d && this.f3555f == webImage.f3555f;
        }
    }

    public int hashCode() {
        return Objects.m4471b(this.f3553c, Integer.valueOf(this.f3554d), Integer.valueOf(this.f3555f));
    }

    /* renamed from: l2 */
    public int mo21597l2() {
        return this.f3555f;
    }

    @NonNull
    /* renamed from: m2 */
    public Uri mo21598m2() {
        return this.f3553c;
    }

    /* renamed from: n2 */
    public int mo21599n2() {
        return this.f3554d;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f3554d), Integer.valueOf(this.f3555f), this.f3553c.toString()});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3552a);
        SafeParcelWriter.m4584v(parcel, 2, mo21598m2(), i, false);
        SafeParcelWriter.m4576n(parcel, 3, mo21599n2());
        SafeParcelWriter.m4576n(parcel, 4, mo21597l2());
        SafeParcelWriter.m4564b(parcel, a);
    }
}
