package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p204firebaseauthapi.zzqx;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbg {

    /* renamed from: a */
    private final Context f4643a;

    /* renamed from: b */
    private final String f4644b;

    /* renamed from: c */
    private final SharedPreferences f4645c;

    /* renamed from: d */
    private final Logger f4646d = new Logger("StorageHelpers", new String[0]);

    public zzbg(Context context, String str) {
        Preconditions.m4488k(context);
        String g = Preconditions.m4484g(str);
        this.f4644b = g;
        Context applicationContext = context.getApplicationContext();
        this.f4643a = applicationContext;
        this.f4645c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{g}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        throw new com.google.android.gms.internal.p204firebaseauthapi.zzqx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013b, code lost:
        r26.f4646d.mo21846j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc A[SYNTHETIC, Splitter:B:33:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134 A[ExcHandler: zzqx | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000c] */
    @androidx.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.auth.internal.zzx m6213f(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r9 == 0) goto L_0x0028
            r8 = r9
        L_0x0028:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r13 = 0
        L_0x0039:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x008b
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzt> r16 = com.google.firebase.auth.internal.zzt.CREATOR     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "userId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "providerId"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "email"
            java.lang.String r20 = r4.optString(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r22 = r4.optString(r14)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "photoUrl"
            java.lang.String r23 = r4.optString(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "isEmailVerified"
            boolean r24 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r25 = r4.optString(r12)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            com.google.firebase.auth.internal.zzt r4 = new com.google.firebase.auth.internal.zzt     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x0084, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r11.add(r4)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            int r13 = r13 + 1
            goto L_0x0039
        L_0x0084:
            r0 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzqx r1 = new com.google.android.gms.internal.firebase-auth-api.zzqx     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            throw r1     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x008b:
            com.google.firebase.FirebaseApp r4 = com.google.firebase.FirebaseApp.m74384n(r6)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            com.google.firebase.auth.internal.zzx r6 = new com.google.firebase.auth.internal.zzx     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r4 != 0) goto L_0x00a1
            com.google.android.gms.internal.firebase-auth-api.zzzy r4 = com.google.android.gms.internal.p204firebaseauthapi.zzzy.m58580l2(r5)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r6.mo22645E2(r4)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x00a1:
            if (r7 != 0) goto L_0x00a6
            r6.mo22826J2()     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x00a6:
            r6.mo22825I2(r8)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r4 == 0) goto L_0x00cf
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            android.os.Parcelable$Creator<com.google.firebase.auth.internal.zzz> r4 = com.google.firebase.auth.internal.zzz.CREATOR     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r3 != 0) goto L_0x00b9
        L_0x00b7:
            r3 = 0
            goto L_0x00ca
        L_0x00b9:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00b7, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00b7, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            com.google.firebase.auth.internal.zzz r3 = new com.google.firebase.auth.internal.zzz     // Catch:{ JSONException -> 0x00b7, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00b7, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x00ca:
            if (r3 == 0) goto L_0x00cf
            r6.mo22831O2(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x00cf:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r3 == 0) goto L_0x0133
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r0 == 0) goto L_0x0133
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r2.<init>()     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r12 = 0
        L_0x00e1:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r12 >= r3) goto L_0x0130
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r3 == 0) goto L_0x0129
            android.os.Parcelable$Creator<com.google.firebase.auth.PhoneMultiFactorInfo> r3 = com.google.firebase.auth.PhoneMultiFactorInfo.CREATOR     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            if (r3 == 0) goto L_0x0121
            java.lang.String r3 = "uid"
            java.lang.String r18 = r4.optString(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            long r20 = r4.optLong(r1)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r22 = r4.optString(r15)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            com.google.firebase.auth.PhoneMultiFactorInfo r3 = new com.google.firebase.auth.PhoneMultiFactorInfo     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            r17 = r3
            r17.<init>(r18, r19, r20, r22)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            goto L_0x012a
        L_0x0121:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            throw r0     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x0129:
            r3 = 0
        L_0x012a:
            r2.add(r3)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
            int r12 = r12 + 1
            goto L_0x00e1
        L_0x0130:
            r6.mo22646F2(r2)     // Catch:{ JSONException -> 0x013a, ArrayIndexOutOfBoundsException -> 0x0138, IllegalArgumentException -> 0x0136, zzqx -> 0x0134 }
        L_0x0133:
            return r6
        L_0x0134:
            r0 = move-exception
            goto L_0x013b
        L_0x0136:
            r0 = move-exception
            goto L_0x013b
        L_0x0138:
            r0 = move-exception
            goto L_0x013b
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            r1 = r26
            com.google.android.gms.common.logging.Logger r2 = r1.f4646d
            r2.mo21846j(r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.zzbg.m6213f(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }

    @Nullable
    /* renamed from: a */
    public final FirebaseUser mo22766a() {
        String string = this.f4645c.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m6213f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final zzzy mo22767b(FirebaseUser firebaseUser) {
        Preconditions.m4488k(firebaseUser);
        String string = this.f4645c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo22654r2()}), (String) null);
        if (string != null) {
            return zzzy.m58580l2(string);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo22768c(String str) {
        this.f4645c.edit().remove(str).apply();
    }

    /* renamed from: d */
    public final void mo22769d(FirebaseUser firebaseUser) {
        String str;
        Preconditions.m4488k(firebaseUser);
        JSONObject jSONObject = new JSONObject();
        if (zzx.class.isAssignableFrom(firebaseUser.getClass())) {
            zzx zzx = (zzx) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzx.mo22643C2());
                jSONObject.put("applicationName", zzx.mo22660x2().mo61951o());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzx.mo22828L2() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List L2 = zzx.mo22828L2();
                    int size = L2.size();
                    if (L2.size() > 30) {
                        this.f4646d.mo21844h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(L2.size()));
                        size = 30;
                    }
                    for (int i = 0; i < size; i++) {
                        jSONArray.put(((zzt) L2.get(i)).mo22813p2());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzx.mo22655s2());
                jSONObject.put(ClientCookie.VERSION_ATTR, ExifInterface.GPS_MEASUREMENT_2D);
                if (zzx.mo22823G2() != null) {
                    jSONObject.put("userMetadata", ((zzz) zzx.mo22823G2()).mo22836a());
                }
                List<MultiFactorInfo> a = new zzac(zzx).mo22668a();
                if (!a.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        jSONArray2.put(a.get(i2).mo22669l2());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e) {
                this.f4646d.mo21845i("Failed to turn object into JSON", e, new Object[0]);
                throw new zzqx(e);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f4645c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
        }
    }

    /* renamed from: e */
    public final void mo22770e(FirebaseUser firebaseUser, zzzy zzzy) {
        Preconditions.m4488k(firebaseUser);
        Preconditions.m4488k(zzzy);
        this.f4645c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo22654r2()}), zzzy.mo50150p2()).apply();
    }
}
