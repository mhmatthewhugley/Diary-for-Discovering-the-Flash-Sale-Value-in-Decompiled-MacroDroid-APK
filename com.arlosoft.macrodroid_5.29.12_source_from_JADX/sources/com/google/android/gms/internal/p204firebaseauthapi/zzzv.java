package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzv implements zzxm {

    /* renamed from: a */
    private final String f40742a;

    /* renamed from: c */
    private String f40743c;

    /* renamed from: d */
    private String f40744d;

    /* renamed from: f */
    private String f40745f;

    /* renamed from: g */
    private ActionCodeSettings f40746g;
    @Nullable

    /* renamed from: o */
    private String f40747o;

    public zzzv(int i) {
        this.f40742a = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private zzzv(int i, ActionCodeSettings actionCodeSettings, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f40742a = "VERIFY_AND_CHANGE_EMAIL";
        this.f40746g = (ActionCodeSettings) Preconditions.m4488k(actionCodeSettings);
        this.f40743c = null;
        this.f40744d = str2;
        this.f40745f = str3;
        this.f40747o = null;
    }

    /* renamed from: b */
    public static zzzv m58570b(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(actionCodeSettings);
        return new zzzv(7, actionCodeSettings, (String) null, str2, str, (String) null);
    }

    /* renamed from: a */
    public final ActionCodeSettings mo50139a() {
        return this.f40746g;
    }

    /* renamed from: c */
    public final zzzv mo50140c(ActionCodeSettings actionCodeSettings) {
        this.f40746g = (ActionCodeSettings) Preconditions.m4488k(actionCodeSettings);
        return this;
    }

    /* renamed from: d */
    public final zzzv mo50141d(String str) {
        this.f40743c = Preconditions.m4484g(str);
        return this;
    }

    /* renamed from: e */
    public final zzzv mo50142e(@Nullable String str) {
        this.f40747o = str;
        return this;
    }

    /* renamed from: f */
    public final zzzv mo50143f(String str) {
        this.f40745f = Preconditions.m4484g(str);
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() throws org.json.JSONException {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.f40742a
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0031;
                case -1341836234: goto L_0x0027;
                case -1099157829: goto L_0x001d;
                case 870738373: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x003b
        L_0x0013:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 2
            goto L_0x003c
        L_0x001d:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 3
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = 0
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            if (r1 == 0) goto L_0x004b
            if (r1 == r6) goto L_0x0049
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r3 = 7
            goto L_0x004c
        L_0x0047:
            r3 = 6
            goto L_0x004c
        L_0x0049:
            r3 = 4
            goto L_0x004c
        L_0x004b:
            r3 = 1
        L_0x004c:
            java.lang.String r1 = "requestType"
            r0.put(r1, r3)
            java.lang.String r1 = r7.f40743c
            if (r1 == 0) goto L_0x005a
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x005a:
            java.lang.String r1 = r7.f40744d
            if (r1 == 0) goto L_0x0063
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L_0x0063:
            java.lang.String r1 = r7.f40745f
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x006c:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            if (r1 == 0) goto L_0x00f6
            boolean r1 = r1.mo22555m2()
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            boolean r1 = r1.mo22554l2()
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22559q2()
            if (r1 == 0) goto L_0x0097
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22559q2()
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L_0x0097:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22558p2()
            if (r1 == 0) goto L_0x00aa
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22558p2()
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        L_0x00aa:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22561u2()
            if (r1 == 0) goto L_0x00bd
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22561u2()
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        L_0x00bd:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22557o2()
            if (r1 == 0) goto L_0x00d0
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22557o2()
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        L_0x00d0:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22556n2()
            if (r1 == 0) goto L_0x00e3
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22556n2()
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        L_0x00e3:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22560t2()
            if (r1 == 0) goto L_0x00f6
            com.google.firebase.auth.ActionCodeSettings r1 = r7.f40746g
            java.lang.String r1 = r1.mo22560t2()
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        L_0x00f6:
            java.lang.String r1 = r7.f40747o
            if (r1 == 0) goto L_0x00ff
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00ff:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzzv.zza():java.lang.String");
    }
}
