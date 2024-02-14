package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzaae;
import com.google.android.gms.internal.p204firebaseauthapi.zzqx;
import com.google.android.gms.internal.p204firebaseauthapi.zzzr;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzt extends AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    @SafeParcelable.Field
    @NonNull

    /* renamed from: a */
    private final String f4685a;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: c */
    private final String f4686c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final String f4687d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private String f4688f;
    @Nullable

    /* renamed from: g */
    private Uri f4689g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f4690o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f4691p;
    @SafeParcelable.Field

    /* renamed from: s */
    private final boolean f4692s;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: z */
    private final String f4693z;

    public zzt(zzzr zzzr, String str) {
        Preconditions.m4488k(zzzr);
        Preconditions.m4484g("firebase");
        this.f4685a = Preconditions.m4484g(zzzr.mo50130y2());
        this.f4686c = "firebase";
        this.f4690o = zzzr.mo50129x2();
        this.f4687d = zzzr.mo50127w2();
        Uri m2 = zzzr.mo50117m2();
        if (m2 != null) {
            this.f4688f = m2.toString();
            this.f4689g = m2;
        }
        this.f4692s = zzzr.mo50114C2();
        this.f4693z = null;
        this.f4691p = zzzr.mo50131z2();
    }

    @NonNull
    /* renamed from: I1 */
    public final String mo22715I1() {
        return this.f4686c;
    }

    @Nullable
    /* renamed from: l2 */
    public final String mo22808l2() {
        return this.f4690o;
    }

    @Nullable
    /* renamed from: m2 */
    public final String mo22809m2() {
        return this.f4691p;
    }

    @Nullable
    /* renamed from: n2 */
    public final Uri mo22810n2() {
        if (!TextUtils.isEmpty(this.f4688f) && this.f4689g == null) {
            this.f4689g = Uri.parse(this.f4688f);
        }
        return this.f4689g;
    }

    @NonNull
    /* renamed from: o2 */
    public final String mo22811o2() {
        return this.f4685a;
    }

    @Nullable
    /* renamed from: p0 */
    public final String mo22812p0() {
        return this.f4687d;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo22813p2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f4685a);
            jSONObject.putOpt("providerId", this.f4686c);
            jSONObject.putOpt("displayName", this.f4687d);
            jSONObject.putOpt("photoUrl", this.f4688f);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EMAIL, this.f4690o);
            jSONObject.putOpt("phoneNumber", this.f4691p);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f4692s));
            jSONObject.putOpt("rawUserInfo", this.f4693z);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f4685a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f4686c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f4687d, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f4688f, false);
        SafeParcelWriter.m4586x(parcel, 5, this.f4690o, false);
        SafeParcelWriter.m4586x(parcel, 6, this.f4691p, false);
        SafeParcelWriter.m4565c(parcel, 7, this.f4692s);
        SafeParcelWriter.m4586x(parcel, 8, this.f4693z, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @Nullable
    public final String zza() {
        return this.f4693z;
    }

    public zzt(zzaae zzaae) {
        Preconditions.m4488k(zzaae);
        this.f4685a = zzaae.mo48743o2();
        this.f4686c = Preconditions.m4484g(zzaae.mo48745q2());
        this.f4687d = zzaae.mo48741m2();
        Uri l2 = zzaae.mo48740l2();
        if (l2 != null) {
            this.f4688f = l2.toString();
            this.f4689g = l2;
        }
        this.f4690o = zzaae.mo48742n2();
        this.f4691p = zzaae.mo48744p2();
        this.f4692s = false;
        this.f4693z = zzaae.mo48746r2();
    }

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzt(@SafeParcelable.Param @NonNull String str, @SafeParcelable.Param @NonNull String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param @Nullable String str6, @SafeParcelable.Param boolean z, @SafeParcelable.Param @Nullable String str7) {
        this.f4685a = str;
        this.f4686c = str2;
        this.f4690o = str3;
        this.f4691p = str4;
        this.f4687d = str5;
        this.f4688f = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f4689g = Uri.parse(this.f4688f);
        }
        this.f4692s = z;
        this.f4693z = str7;
    }
}
