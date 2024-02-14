package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzd extends AbstractSafeParcelable implements zzxn<zzzd> {
    public static final Parcelable.Creator<zzzd> CREATOR = new zzze();

    /* renamed from: p */
    private static final String f40684p = zzzd.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f40685a;
    @SafeParcelable.Field

    /* renamed from: c */
    private boolean f40686c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f40687d;
    @SafeParcelable.Field

    /* renamed from: f */
    private boolean f40688f;
    @SafeParcelable.Field

    /* renamed from: g */
    private zzaaw f40689g;
    @SafeParcelable.Field

    /* renamed from: o */
    private List f40690o;

    public zzzd() {
        this.f40689g = new zzaaw((List) null);
    }

    @Nullable
    /* renamed from: l2 */
    public final List mo50091l2() {
        return this.f40690o;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40685a = jSONObject.optString("authUri", (String) null);
            this.f40686c = jSONObject.optBoolean("registered", false);
            this.f40687d = jSONObject.optString("providerId", (String) null);
            this.f40688f = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.f40689g = new zzaaw((List) null);
            } else {
                this.f40689g = new zzaaw(1, zzabk.m56111b(jSONObject.optJSONArray("allProviders")));
            }
            this.f40690o = zzabk.m56111b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40684p, str);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f40685a, false);
        SafeParcelWriter.m4565c(parcel, 3, this.f40686c);
        SafeParcelWriter.m4586x(parcel, 4, this.f40687d, false);
        SafeParcelWriter.m4565c(parcel, 5, this.f40688f);
        SafeParcelWriter.m4584v(parcel, 6, this.f40689g, i, false);
        SafeParcelWriter.m4588z(parcel, 7, this.f40690o, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzzd(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param zzaaw zzaaw, @SafeParcelable.Param List list) {
        zzaaw zzaaw2;
        this.f40685a = str;
        this.f40686c = z;
        this.f40687d = str2;
        this.f40688f = z2;
        if (zzaaw == null) {
            zzaaw2 = new zzaaw((List) null);
        } else {
            zzaaw2 = zzaaw.m56061l2(zzaaw);
        }
        this.f40689g = zzaaw2;
        this.f40690o = list;
    }
}
