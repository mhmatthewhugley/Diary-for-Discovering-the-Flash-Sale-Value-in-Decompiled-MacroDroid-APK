package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p204firebaseauthapi.zzqx;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new zzai();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f4552a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String f4553c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final long f4554d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f4555f;

    @SafeParcelable.Constructor
    public PhoneMultiFactorInfo(@SafeParcelable.Param @NonNull String str, @SafeParcelable.Param String str2, @SafeParcelable.Param long j, @SafeParcelable.Param @NonNull String str3) {
        this.f4552a = Preconditions.m4484g(str);
        this.f4553c = str2;
        this.f4554d = j;
        this.f4555f = Preconditions.m4484g(str3);
    }

    @Nullable
    /* renamed from: l2 */
    public JSONObject mo22669l2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f4552a);
            jSONObject.putOpt("displayName", this.f4553c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f4554d));
            jSONObject.putOpt("phoneNumber", this.f4555f);
            return jSONObject;
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: m2 */
    public long mo22707m2() {
        return this.f4554d;
    }

    @NonNull
    /* renamed from: n2 */
    public String mo22708n2() {
        return this.f4555f;
    }

    @NonNull
    /* renamed from: o2 */
    public String mo22709o2() {
        return this.f4552a;
    }

    @Nullable
    /* renamed from: p0 */
    public String mo22710p0() {
        return this.f4553c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, mo22709o2(), false);
        SafeParcelWriter.m4586x(parcel, 2, mo22710p0(), false);
        SafeParcelWriter.m4581s(parcel, 3, mo22707m2());
        SafeParcelWriter.m4586x(parcel, 4, mo22708n2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
