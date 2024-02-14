package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    @SafeParcelable.Field

    /* renamed from: a */
    private final long f4710a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f4711c;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param long j, @SafeParcelable.Param long j2) {
        this.f4710a = j;
        this.f4711c = j2;
    }

    /* renamed from: a */
    public final JSONObject mo22836a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f4710a);
            jSONObject.put("creationTimestamp", this.f4711c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4581s(parcel, 1, this.f4710a);
        SafeParcelWriter.m4581s(parcel, 2, this.f4711c);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
