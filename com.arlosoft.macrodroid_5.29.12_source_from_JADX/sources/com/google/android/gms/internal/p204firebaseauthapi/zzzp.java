package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzp extends AbstractSafeParcelable implements zzxn<zzzp> {
    public static final Parcelable.Creator<zzzp> CREATOR = new zzzq();

    /* renamed from: c */
    private static final String f40726c = zzzp.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private zzzt f40727a;

    public zzzp() {
    }

    /* renamed from: l2 */
    public final List mo50108l2() {
        return this.f40727a.mo50135m2();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        zzzt zzzt;
        int i;
        zzzr zzzr;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                this.f40727a = new zzzt();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<zzzt> creator = zzzt.CREATOR;
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z = false;
                        int i2 = 0;
                        while (i2 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                            if (jSONObject2 == null) {
                                zzzr = new zzzr();
                                i = i2;
                            } else {
                                String a = Strings.m4911a(jSONObject2.optString("localId", (String) null));
                                String a2 = Strings.m4911a(jSONObject2.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
                                boolean optBoolean = jSONObject2.optBoolean("emailVerified", z);
                                String a3 = Strings.m4911a(jSONObject2.optString("displayName", (String) null));
                                String a4 = Strings.m4911a(jSONObject2.optString("photoUrl", (String) null));
                                zzaag l2 = zzaag.m56009l2(jSONObject2.optJSONArray("providerUserInfo"));
                                String a5 = Strings.m4911a(jSONObject2.optString("rawPassword", (String) null));
                                String a6 = Strings.m4911a(jSONObject2.optString("phoneNumber", (String) null));
                                i = i2;
                                long optLong = jSONObject2.optLong("createdAt", 0);
                                zzzr = new zzzr(a, a2, optBoolean, a3, a4, l2, a5, a6, optLong, jSONObject2.optLong("lastLoginAt", 0), false, (zze) null, zzaac.m55995q2(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(zzzr);
                            i2 = i + 1;
                            z = false;
                        }
                        zzzt = new zzzt(arrayList);
                        this.f40727a = zzzt;
                    }
                }
                zzzt = new zzzt(new ArrayList());
                this.f40727a = zzzt;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40726c, str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4584v(parcel, 2, this.f40727a, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzzp(@SafeParcelable.Param zzzt zzzt) {
        zzzt zzzt2;
        if (zzzt == null) {
            zzzt2 = new zzzt();
        } else {
            zzzt2 = zzzt.m58568l2(zzzt);
        }
        this.f40727a = zzzt2;
    }
}
