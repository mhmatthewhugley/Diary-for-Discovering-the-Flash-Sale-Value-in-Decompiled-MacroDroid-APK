package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzat();

    /* renamed from: p */
    private static final zzau f45987p = new zzau("com.google.android.gms", Locale.getDefault(), (String) null);
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f45988a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f45989c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f45990d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f45991f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f45992g;
    @SafeParcelable.Field

    /* renamed from: o */
    private final int f45993o;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param int i, @SafeParcelable.Param int i2) {
        this.f45988a = str;
        this.f45989c = str2;
        this.f45990d = str3;
        this.f45991f = str4;
        this.f45992g = i;
        this.f45993o = i2;
    }

    /* renamed from: l2 */
    private static String m64742l2(Locale locale) {
        return locale.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzau)) {
            zzau zzau = (zzau) obj;
            return this.f45992g == zzau.f45992g && this.f45993o == zzau.f45993o && this.f45989c.equals(zzau.f45989c) && this.f45988a.equals(zzau.f45988a) && Objects.m4470a(this.f45990d, zzau.f45990d) && Objects.m4470a(this.f45991f, zzau.f45991f);
        }
    }

    public final int hashCode() {
        return Objects.m4471b(this.f45988a, this.f45989c, this.f45990d, this.f45991f, Integer.valueOf(this.f45992g), Integer.valueOf(this.f45993o));
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("clientPackageName", this.f45988a).mo21720a("locale", this.f45989c).mo21720a("accountName", this.f45990d).mo21720a("gCoreClientName", this.f45991f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f45988a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f45989c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f45990d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f45991f, false);
        SafeParcelWriter.m4576n(parcel, 6, this.f45992g);
        SafeParcelWriter.m4576n(parcel, 7, this.f45993o);
        SafeParcelWriter.m4564b(parcel, a);
    }

    private zzau(String str, Locale locale, String str2) {
        this(str, m64742l2(locale), (String) null, (String) null, GoogleApiAvailability.f3058d, 0);
    }

    public zzau(String str, Locale locale, String str2, String str3, int i) {
        this(str, m64742l2(locale), str2, str3, GoogleApiAvailability.f3058d, i);
    }
}
