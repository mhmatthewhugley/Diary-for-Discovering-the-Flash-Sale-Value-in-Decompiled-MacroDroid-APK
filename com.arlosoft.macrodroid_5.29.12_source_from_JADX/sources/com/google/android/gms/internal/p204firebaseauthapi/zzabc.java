package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabc extends AbstractSafeParcelable implements zzxn<zzabc> {
    public static final Parcelable.Creator<zzabc> CREATOR = new zzabd();

    /* renamed from: g */
    private static final String f39585g = zzabc.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f39586a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f39587c;
    @SafeParcelable.Field

    /* renamed from: d */
    private long f39588d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f39589f;

    public zzabc() {
    }

    /* renamed from: l2 */
    public final String mo48834l2() {
        return this.f39586a;
    }

    /* renamed from: m2 */
    public final String mo48835m2() {
        return this.f39587c;
    }

    /* renamed from: n2 */
    public final boolean mo48836n2() {
        return this.f39589f;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f39586a = Strings.m4911a(jSONObject.optString("idToken", (String) null));
            this.f39587c = Strings.m4911a(jSONObject.optString("refreshToken", (String) null));
            this.f39588d = jSONObject.optLong("expiresIn", 0);
            this.f39589f = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f39585g, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f39586a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f39587c, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f39588d);
        SafeParcelWriter.m4565c(parcel, 5, this.f39589f);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final long zzb() {
        return this.f39588d;
    }

    @SafeParcelable.Constructor
    zzabc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z) {
        this.f39586a = str;
        this.f39587c = str2;
        this.f39588d = j;
        this.f39589f = z;
    }
}
