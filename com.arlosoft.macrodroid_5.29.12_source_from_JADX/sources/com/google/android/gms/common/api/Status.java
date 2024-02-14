package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @ShowFirstParty
    @NonNull
    @KeepForSdk

    /* renamed from: A */
    public static final Status f3133A = new Status(15);
    @ShowFirstParty
    @NonNull
    @KeepForSdk

    /* renamed from: B */
    public static final Status f3134B = new Status(16);
    @NonNull
    @KeepForSdk

    /* renamed from: C */
    public static final Status f3135C = new Status(18);
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    @ShowFirstParty
    @NonNull

    /* renamed from: D */
    public static final Status f3136D = new Status(17);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: o */
    public static final Status f3137o = new Status(-1);
    @ShowFirstParty
    @NonNull
    @KeepForSdk
    @VisibleForTesting

    /* renamed from: p */
    public static final Status f3138p = new Status(0);
    @ShowFirstParty
    @NonNull
    @KeepForSdk

    /* renamed from: s */
    public static final Status f3139s = new Status(14);
    @ShowFirstParty
    @NonNull
    @KeepForSdk

    /* renamed from: z */
    public static final Status f3140z = new Status(8);
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3141a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f3142c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f3143d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final PendingIntent f3144f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final ConnectionResult f3145g;

    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    Status(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable PendingIntent pendingIntent, @SafeParcelable.Param @Nullable ConnectionResult connectionResult) {
        this.f3141a = i;
        this.f3142c = i2;
        this.f3143d = str;
        this.f3144f = pendingIntent;
        this.f3145g = connectionResult;
    }

    /* renamed from: I */
    public boolean mo21289I() {
        return this.f3142c == 16;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f3141a != status.f3141a || this.f3142c != status.f3142c || !Objects.m4470a(this.f3143d, status.f3143d) || !Objects.m4470a(this.f3144f, status.f3144f) || !Objects.m4470a(this.f3145g, status.f3145g)) {
            return false;
        }
        return true;
    }

    @NonNull
    @CanIgnoreReturnValue
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f3141a), Integer.valueOf(this.f3142c), this.f3143d, this.f3144f, this.f3145g);
    }

    @Nullable
    /* renamed from: l2 */
    public ConnectionResult mo21292l2() {
        return this.f3145g;
    }

    @Nullable
    /* renamed from: m2 */
    public PendingIntent mo21293m2() {
        return this.f3144f;
    }

    /* renamed from: n2 */
    public int mo21294n2() {
        return this.f3142c;
    }

    @Nullable
    /* renamed from: o2 */
    public String mo21295o2() {
        return this.f3143d;
    }

    @VisibleForTesting
    /* renamed from: p2 */
    public boolean mo21296p2() {
        return this.f3144f != null;
    }

    @CheckReturnValue
    /* renamed from: q2 */
    public boolean mo21297q2() {
        return this.f3142c <= 0;
    }

    /* renamed from: r2 */
    public void mo21298r2(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo21296p2()) {
            PendingIntent pendingIntent = this.f3144f;
            Preconditions.m4488k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper c = Objects.m4472c(this);
        c.mo21720a("statusCode", zza());
        c.mo21720a("resolution", this.f3144f);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, mo21294n2());
        SafeParcelWriter.m4586x(parcel, 2, mo21295o2(), false);
        SafeParcelWriter.m4584v(parcel, 3, this.f3144f, i, false);
        SafeParcelWriter.m4584v(parcel, 4, mo21292l2(), i, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f3141a);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @NonNull
    public final String zza() {
        String str = this.f3143d;
        return str != null ? str : CommonStatusCodes.m3624a(this.f3142c);
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i) {
        this(1, i, str, connectionResult.mo21135n2(), connectionResult);
    }
}
