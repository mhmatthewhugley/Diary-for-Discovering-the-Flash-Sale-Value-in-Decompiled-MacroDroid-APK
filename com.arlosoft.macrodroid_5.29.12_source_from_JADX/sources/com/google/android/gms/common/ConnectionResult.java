package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();
    @ShowFirstParty
    @NonNull
    @KeepForSdk

    /* renamed from: g */
    public static final ConnectionResult f3044g = new ConnectionResult(0);
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3045a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final int f3046c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final PendingIntent f3047d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private final String f3048f;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable PendingIntent pendingIntent, @SafeParcelable.Param @Nullable String str) {
        this.f3045a = i;
        this.f3046c = i2;
        this.f3047d = pendingIntent;
        this.f3048f = str;
    }

    @NonNull
    /* renamed from: r2 */
    static String m3512r2(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f3046c == connectionResult.f3046c && Objects.m4470a(this.f3047d, connectionResult.f3047d) && Objects.m4470a(this.f3048f, connectionResult.f3048f);
    }

    public int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f3046c), this.f3047d, this.f3048f);
    }

    /* renamed from: l2 */
    public int mo21133l2() {
        return this.f3046c;
    }

    @Nullable
    /* renamed from: m2 */
    public String mo21134m2() {
        return this.f3048f;
    }

    @Nullable
    /* renamed from: n2 */
    public PendingIntent mo21135n2() {
        return this.f3047d;
    }

    /* renamed from: o2 */
    public boolean mo21136o2() {
        return (this.f3046c == 0 || this.f3047d == null) ? false : true;
    }

    /* renamed from: p2 */
    public boolean mo21137p2() {
        return this.f3046c == 0;
    }

    /* renamed from: q2 */
    public void mo21138q2(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo21136o2()) {
            PendingIntent pendingIntent = this.f3047d;
            Preconditions.m4488k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper c = Objects.m4472c(this);
        c.mo21720a("statusCode", m3512r2(this.f3046c));
        c.mo21720a("resolution", this.f3047d);
        c.mo21720a("message", this.f3048f);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f3045a);
        SafeParcelWriter.m4576n(parcel, 2, mo21133l2());
        SafeParcelWriter.m4584v(parcel, 3, mo21135n2(), i, false);
        SafeParcelWriter.m4586x(parcel, 4, mo21134m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str);
    }
}
