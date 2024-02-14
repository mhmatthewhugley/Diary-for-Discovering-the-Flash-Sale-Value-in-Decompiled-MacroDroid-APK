package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaal extends AbstractSafeParcelable implements zzxm {
    public static final Parcelable.Creator<zzaal> CREATOR = new zzaam();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f39486a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final long f39487c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final boolean f39488d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f39489f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final String f39490g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f39491o;
    @SafeParcelable.Field

    /* renamed from: p */
    private final boolean f39492p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final String f39493s;
    @Nullable

    /* renamed from: z */
    private zzza f39494z;

    @SafeParcelable.Constructor
    public zzaal(@SafeParcelable.Param String str, @SafeParcelable.Param long j, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param boolean z2, @SafeParcelable.Param @Nullable String str5) {
        this.f39486a = Preconditions.m4484g(str);
        this.f39487c = j;
        this.f39488d = z;
        this.f39489f = str2;
        this.f39490g = str3;
        this.f39491o = str4;
        this.f39492p = z2;
        this.f39493s = str5;
    }

    /* renamed from: l2 */
    public final String mo48768l2() {
        return this.f39489f;
    }

    /* renamed from: m2 */
    public final String mo48769m2() {
        return this.f39486a;
    }

    /* renamed from: n2 */
    public final void mo48770n2(zzza zzza) {
        this.f39494z = zzza;
    }

    /* renamed from: o2 */
    public final boolean mo48771o2() {
        return this.f39488d;
    }

    /* renamed from: p2 */
    public final boolean mo48772p2() {
        return this.f39492p;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f39486a, false);
        SafeParcelWriter.m4581s(parcel, 2, this.f39487c);
        SafeParcelWriter.m4565c(parcel, 3, this.f39488d);
        SafeParcelWriter.m4586x(parcel, 4, this.f39489f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f39490g, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f39491o, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f39492p);
        SafeParcelWriter.m4586x(parcel, 8, this.f39493s, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f39486a);
        String str = this.f39490g;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f39491o;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzza zzza = this.f39494z;
        if (zzza != null) {
            jSONObject.put("autoRetrievalInfo", zzza.mo50087a());
        }
        String str3 = this.f39493s;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.f39487c;
    }
}
