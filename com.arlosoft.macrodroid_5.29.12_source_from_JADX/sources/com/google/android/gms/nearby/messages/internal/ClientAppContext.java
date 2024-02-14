package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new zzd();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f47676a;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: c */
    public final String f47677c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public final String f47678d;
    @SafeParcelable.Field

    /* renamed from: f */
    public final boolean f47679f;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: g */
    public final int f47680g;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: o */
    public final String f47681o;

    @SafeParcelable.Constructor
    ClientAppContext(@SafeParcelable.Param int i, @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable String str3) {
        this.f47676a = i;
        this.f47677c = (String) Preconditions.m4488k(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[]{str2, "0p:"}));
            str2 = "0p:".concat(str2);
        }
        this.f47678d = str2;
        this.f47679f = z;
        this.f47680g = i2;
        this.f47681o = str3;
    }

    @Nullable
    /* renamed from: l2 */
    static final ClientAppContext m66435l2(@Nullable ClientAppContext clientAppContext, @Nullable String str, @Nullable String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, str, str2, z, 0, (String) null);
    }

    /* renamed from: m2 */
    private static boolean m66436m2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return m66436m2(this.f47677c, clientAppContext.f47677c) && m66436m2(this.f47678d, clientAppContext.f47678d) && this.f47679f == clientAppContext.f47679f && m66436m2(this.f47681o, clientAppContext.f47681o) && this.f47680g == clientAppContext.f47680g;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f47677c, this.f47678d, Boolean.valueOf(this.f47679f), this.f47681o, Integer.valueOf(this.f47680g));
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.f47677c, this.f47678d, Boolean.valueOf(this.f47679f), this.f47681o, Integer.valueOf(this.f47680g)});
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f47676a);
        SafeParcelWriter.m4586x(parcel, 2, this.f47677c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f47678d, false);
        SafeParcelWriter.m4565c(parcel, 4, this.f47679f);
        SafeParcelWriter.m4576n(parcel, 5, this.f47680g);
        SafeParcelWriter.m4586x(parcel, 6, this.f47681o, false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
