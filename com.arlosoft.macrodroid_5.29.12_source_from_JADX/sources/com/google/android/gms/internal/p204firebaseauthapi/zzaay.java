package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.internal.zzi;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaay */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaay extends AbstractSafeParcelable implements zzxm {
    public static final Parcelable.Creator<zzaay> CREATOR = new zzaaz();
    @SafeParcelable.Field

    /* renamed from: A */
    private boolean f39546A;
    @SafeParcelable.Field

    /* renamed from: B */
    private String f39547B;
    @SafeParcelable.Field

    /* renamed from: C */
    private String f39548C;
    @SafeParcelable.Field

    /* renamed from: D */
    private String f39549D;
    @SafeParcelable.Field

    /* renamed from: E */
    private String f39550E;
    @SafeParcelable.Field

    /* renamed from: F */
    private boolean f39551F;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: G */
    private String f39552G;
    @SafeParcelable.Field

    /* renamed from: a */
    private String f39553a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f39554c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f39555d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f39556f;
    @SafeParcelable.Field

    /* renamed from: g */
    private String f39557g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private String f39558o;
    @SafeParcelable.Field

    /* renamed from: p */
    private String f39559p;
    @SafeParcelable.Field

    /* renamed from: s */
    private String f39560s;
    @SafeParcelable.Field

    /* renamed from: z */
    private boolean f39561z;

    public zzaay() {
        this.f39561z = true;
        this.f39546A = true;
    }

    /* renamed from: l2 */
    public final zzaay mo48809l2(boolean z) {
        this.f39546A = false;
        return this;
    }

    /* renamed from: m2 */
    public final zzaay mo48810m2(String str) {
        this.f39554c = Preconditions.m4484g(str);
        return this;
    }

    /* renamed from: n2 */
    public final zzaay mo48811n2(boolean z) {
        this.f39551F = true;
        return this;
    }

    /* renamed from: o2 */
    public final zzaay mo48812o2(boolean z) {
        this.f39561z = true;
        return this;
    }

    /* renamed from: p2 */
    public final zzaay mo48813p2(@Nullable String str) {
        this.f39550E = str;
        return this;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f39553a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f39554c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f39555d, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f39556f, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f39557g, false);
        SafeParcelWriter.m4586x(parcel, 7, this.f39558o, false);
        SafeParcelWriter.m4586x(parcel, 8, this.f39559p, false);
        SafeParcelWriter.m4586x(parcel, 9, this.f39560s, false);
        SafeParcelWriter.m4565c(parcel, 10, this.f39561z);
        SafeParcelWriter.m4565c(parcel, 11, this.f39546A);
        SafeParcelWriter.m4586x(parcel, 12, this.f39547B, false);
        SafeParcelWriter.m4586x(parcel, 13, this.f39548C, false);
        SafeParcelWriter.m4586x(parcel, 14, this.f39549D, false);
        SafeParcelWriter.m4586x(parcel, 15, this.f39550E, false);
        SafeParcelWriter.m4565c(parcel, 16, this.f39551F);
        SafeParcelWriter.m4586x(parcel, 17, this.f39552G, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f39546A);
        jSONObject.put("returnSecureToken", this.f39561z);
        String str = this.f39554c;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f39559p;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f39550E;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f39552G;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.f39548C)) {
            jSONObject.put("sessionId", this.f39548C);
        }
        if (!TextUtils.isEmpty(this.f39549D)) {
            jSONObject.put("requestUri", this.f39549D);
        } else {
            String str5 = this.f39553a;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.f39551F);
        return jSONObject.toString();
    }

    public zzaay(zzi zzi, String str) {
        Preconditions.m4488k(zzi);
        this.f39548C = Preconditions.m4484g(zzi.mo22791d());
        this.f39549D = Preconditions.m4484g(str);
        String g = Preconditions.m4484g(zzi.mo22790c());
        this.f39557g = g;
        this.f39561z = true;
        this.f39559p = "providerId=".concat(String.valueOf(g));
    }

    public zzaay(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f39553a = "http://localhost";
        this.f39555d = str;
        this.f39556f = str2;
        this.f39560s = str5;
        this.f39547B = str6;
        this.f39550E = str7;
        this.f39552G = str8;
        this.f39561z = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f39556f) || !TextUtils.isEmpty(this.f39547B)) {
            this.f39557g = Preconditions.m4484g(str3);
            this.f39558o = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f39555d)) {
                sb.append("id_token=");
                sb.append(this.f39555d);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f39556f)) {
                sb.append("access_token=");
                sb.append(this.f39556f);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f39558o)) {
                sb.append("identifier=");
                sb.append(this.f39558o);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f39560s)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f39560s);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f39547B)) {
                sb.append("code=");
                sb.append(this.f39547B);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f39557g);
            this.f39559p = sb.toString();
            this.f39546A = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    @SafeParcelable.Constructor
    zzaay(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11, @SafeParcelable.Param String str12, @SafeParcelable.Param boolean z3, @SafeParcelable.Param String str13) {
        this.f39553a = str;
        this.f39554c = str2;
        this.f39555d = str3;
        this.f39556f = str4;
        this.f39557g = str5;
        this.f39558o = str6;
        this.f39559p = str7;
        this.f39560s = str8;
        this.f39561z = z;
        this.f39546A = z2;
        this.f39547B = str9;
        this.f39548C = str10;
        this.f39549D = str11;
        this.f39550E = str12;
        this.f39551F = z3;
        this.f39552G = str13;
    }
}
