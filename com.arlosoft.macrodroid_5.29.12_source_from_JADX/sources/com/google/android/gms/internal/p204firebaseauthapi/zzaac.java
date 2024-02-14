package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaac> CREATOR = new zzaad();
    @SafeParcelable.Field
    @Nullable

    /* renamed from: a */
    private final String f39465a;
    @SafeParcelable.Field
    @NonNull

    /* renamed from: c */
    private final String f39466c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final String f39467d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final long f39468f;
    @Nullable

    /* renamed from: g */
    private String f39469g;

    @SafeParcelable.Constructor
    public zzaac(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param long j) {
        this.f39465a = str;
        this.f39466c = Preconditions.m4484g(str2);
        this.f39467d = str3;
        this.f39468f = j;
    }

    /* renamed from: m2 */
    public static zzaac m55994m2(@NonNull JSONObject jSONObject) {
        zzaac zzaac = new zzaac(jSONObject.optString("phoneInfo", (String) null), jSONObject.optString("mfaEnrollmentId", (String) null), jSONObject.optString("displayName", (String) null), m55996r2(jSONObject.optString("enrolledAt", "")));
        zzaac.f39469g = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzaac;
    }

    /* renamed from: q2 */
    public static List m55995q2(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m55994m2(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: r2 */
    private static long m55996r2(String str) {
        String replaceAll = str.replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(replaceAll).getTime();
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString", e);
            return 0;
        }
    }

    /* renamed from: l2 */
    public final long mo48733l2() {
        return this.f39468f;
    }

    /* renamed from: n2 */
    public final String mo48734n2() {
        return this.f39467d;
    }

    /* renamed from: o2 */
    public final String mo48735o2() {
        return this.f39466c;
    }

    @Nullable
    /* renamed from: p2 */
    public final String mo48736p2() {
        return this.f39465a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, this.f39465a, false);
        SafeParcelWriter.m4586x(parcel, 2, this.f39466c, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f39467d, false);
        SafeParcelWriter.m4581s(parcel, 4, this.f39468f);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
