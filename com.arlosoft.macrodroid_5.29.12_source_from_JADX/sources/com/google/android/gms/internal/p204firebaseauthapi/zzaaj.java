package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaaj extends AbstractSafeParcelable implements zzxn<zzaaj> {
    public static final Parcelable.Creator<zzaaj> CREATOR = new zzaak();

    /* renamed from: g */
    private static final String f39481g = zzaaj.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f39482a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f39483c;
    @SafeParcelable.Field

    /* renamed from: d */
    private String f39484d;
    @SafeParcelable.Field

    /* renamed from: f */
    private zzaac f39485f;

    public zzaaj() {
    }

    @Nullable
    /* renamed from: l2 */
    public final zzaac mo48756l2() {
        return this.f39485f;
    }

    /* renamed from: m2 */
    public final String mo48757m2() {
        return this.f39482a;
    }

    /* renamed from: n2 */
    public final String mo48758n2() {
        return this.f39483c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.p204firebaseauthapi.zzxn mo48759o(java.lang.String r17) throws com.google.android.gms.internal.p204firebaseauthapi.zzvg {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "mfaInfo"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = com.google.android.gms.common.util.Strings.m4911a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f39482a = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "newEmail"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = com.google.android.gms.common.util.Strings.m4911a(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f39483c = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r4 = "reqType"
            int r4 = r3.optInt(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            java.lang.String r6 = "REVERT_SECOND_FACTOR_ADDITION"
            java.lang.String r7 = "VERIFY_AND_CHANGE_EMAIL"
            java.lang.String r8 = "EMAIL_SIGNIN"
            java.lang.String r9 = "RECOVER_EMAIL"
            java.lang.String r10 = "VERIFY_EMAIL"
            java.lang.String r11 = "PASSWORD_RESET"
            r12 = 1
            if (r4 == r12) goto L_0x0047
            switch(r4) {
                case 4: goto L_0x0045;
                case 5: goto L_0x0043;
                case 6: goto L_0x0041;
                case 7: goto L_0x003f;
                case 8: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r4 = 0
            goto L_0x0048
        L_0x003d:
            r4 = r6
            goto L_0x0048
        L_0x003f:
            r4 = r7
            goto L_0x0048
        L_0x0041:
            r4 = r8
            goto L_0x0048
        L_0x0043:
            r4 = r9
            goto L_0x0048
        L_0x0045:
            r4 = r10
            goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            r1.f39484d = r4     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r4 = "requestType"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            int r13 = r4.hashCode()     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r15 = 4
            r5 = 3
            r14 = 2
            switch(r13) {
                case -1874510116: goto L_0x0089;
                case -1452371317: goto L_0x0081;
                case -1341836234: goto L_0x0079;
                case -1099157829: goto L_0x0071;
                case 870738373: goto L_0x0069;
                case 970484929: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0091
        L_0x0061:
            boolean r6 = r4.equals(r9)
            if (r6 == 0) goto L_0x0091
            r6 = 4
            goto L_0x0092
        L_0x0069:
            boolean r6 = r4.equals(r8)
            if (r6 == 0) goto L_0x0091
            r6 = 2
            goto L_0x0092
        L_0x0071:
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L_0x0091
            r6 = 3
            goto L_0x0092
        L_0x0079:
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L_0x0091
            r6 = 0
            goto L_0x0092
        L_0x0081:
            boolean r6 = r4.equals(r11)
            if (r6 == 0) goto L_0x0091
            r6 = 1
            goto L_0x0092
        L_0x0089:
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0091
            r6 = 5
            goto L_0x0092
        L_0x0091:
            r6 = -1
        L_0x0092:
            if (r6 == 0) goto L_0x00a1
            if (r6 == r12) goto L_0x00a1
            if (r6 == r14) goto L_0x00a1
            if (r6 == r5) goto L_0x00a1
            if (r6 == r15) goto L_0x00a1
            r5 = 5
            if (r6 == r5) goto L_0x00a1
            r5 = 0
            goto L_0x00a2
        L_0x00a1:
            r5 = r4
        L_0x00a2:
            r1.f39484d = r5     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00a4:
            boolean r4 = r3.has(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            com.google.android.gms.internal.firebase-auth-api.zzaac r0 = com.google.android.gms.internal.p204firebaseauthapi.zzaac.m55994m2(r0)     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
            r1.f39485f = r0     // Catch:{ JSONException -> 0x00b7, NullPointerException -> 0x00b5 }
        L_0x00b4:
            return r1
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b8
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            java.lang.String r3 = f39481g
            com.google.android.gms.internal.firebase-auth-api.zzvg r0 = com.google.android.gms.internal.p204firebaseauthapi.zzabk.m56110a(r0, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaaj.mo48759o(java.lang.String):com.google.android.gms.internal.firebase-auth-api.zzxn");
    }

    /* renamed from: o2 */
    public final String mo48760o2() {
        return this.f39484d;
    }

    /* renamed from: p2 */
    public final boolean mo48761p2() {
        return this.f39482a != null;
    }

    /* renamed from: q2 */
    public final boolean mo48762q2() {
        return this.f39485f != null;
    }

    /* renamed from: r2 */
    public final boolean mo48763r2() {
        return this.f39483c != null;
    }

    /* renamed from: s2 */
    public final boolean mo48764s2() {
        return this.f39484d != null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f39482a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f39483c, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f39484d, false);
        SafeParcelWriter.m4584v(parcel, 5, this.f39485f, i, false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @SafeParcelable.Constructor
    zzaaj(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzaac zzaac) {
        this.f39482a = str;
        this.f39483c = str2;
        this.f39484d = str3;
        this.f39485f = zzaac;
    }
}
