package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaao */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaao implements zzxm {

    /* renamed from: a */
    private String f39497a;

    /* renamed from: c */
    private String f39498c;

    /* renamed from: d */
    private String f39499d;

    /* renamed from: f */
    private String f39500f;

    /* renamed from: g */
    private String f39501g;

    /* renamed from: o */
    private String f39502o;

    /* renamed from: p */
    private final zzaaw f39503p = new zzaaw((List) null);

    /* renamed from: s */
    private final zzaaw f39504s = new zzaaw((List) null);
    @Nullable

    /* renamed from: z */
    private String f39505z;

    @NonNull
    /* renamed from: a */
    public final zzaao mo48778a(String str) {
        Preconditions.m4484g(str);
        this.f39504s.mo48805m2().add(str);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final zzaao mo48779b(@Nullable String str) {
        if (str == null) {
            this.f39503p.mo48805m2().add("DISPLAY_NAME");
        } else {
            this.f39498c = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final zzaao mo48780c(@Nullable String str) {
        if (str == null) {
            this.f39503p.mo48805m2().add("EMAIL");
        } else {
            this.f39499d = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final zzaao mo48781d(String str) {
        this.f39497a = Preconditions.m4484g(str);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final zzaao mo48782e(String str) {
        this.f39501g = Preconditions.m4484g(str);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final zzaao mo48783f(@Nullable String str) {
        if (str == null) {
            this.f39503p.mo48805m2().add("PASSWORD");
        } else {
            this.f39500f = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final zzaao mo48784g(@Nullable String str) {
        if (str == null) {
            this.f39503p.mo48805m2().add("PHOTO_URL");
        } else {
            this.f39502o = str;
        }
        return this;
    }

    @NonNull
    /* renamed from: h */
    public final zzaao mo48785h(@Nullable String str) {
        this.f39505z = str;
        return this;
    }

    @Nullable
    /* renamed from: i */
    public final String mo48786i() {
        return this.f39498c;
    }

    @Nullable
    /* renamed from: j */
    public final String mo48787j() {
        return this.f39499d;
    }

    @Nullable
    /* renamed from: k */
    public final String mo48788k() {
        return this.f39500f;
    }

    @Nullable
    /* renamed from: l */
    public final String mo48789l() {
        return this.f39502o;
    }

    /* renamed from: m */
    public final boolean mo48790m(String str) {
        Preconditions.m4484g(str);
        return this.f39503p.mo48805m2().contains(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() throws org.json.JSONException {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f39504s
            java.util.List r1 = r1.mo48805m2()
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f39504s
            java.util.List r1 = r1.mo48805m2()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = 0
        L_0x0024:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0034
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0034:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L_0x0039:
            com.google.android.gms.internal.firebase-auth-api.zzaaw r1 = r11.f39503p
            java.util.List r1 = r1.mo48805m2()
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = 0
        L_0x0046:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0099
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x007a;
                case 66081660: goto L_0x0070;
                case 1939891618: goto L_0x0066;
                case 1999612571: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0084
        L_0x005c:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 2
            goto L_0x0085
        L_0x0066:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 3
            goto L_0x0085
        L_0x0070:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 0
            goto L_0x0085
        L_0x007a:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0084
            r7 = 1
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            if (r7 == 0) goto L_0x0093
            if (r7 == r2) goto L_0x0094
            if (r7 == r10) goto L_0x0091
            if (r7 == r9) goto L_0x008f
            r10 = 0
            goto L_0x0094
        L_0x008f:
            r10 = 4
            goto L_0x0094
        L_0x0091:
            r10 = 5
            goto L_0x0094
        L_0x0093:
            r10 = 1
        L_0x0094:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0046
        L_0x0099:
            if (r4 <= 0) goto L_0x00af
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x00a0:
            if (r3 >= r4) goto L_0x00aa
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00af:
            java.lang.String r1 = r11.f39497a
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b8:
            java.lang.String r1 = r11.f39499d
            if (r1 == 0) goto L_0x00c1
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00c1:
            java.lang.String r1 = r11.f39500f
            if (r1 == 0) goto L_0x00ca
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00ca:
            java.lang.String r1 = r11.f39498c
            if (r1 == 0) goto L_0x00d3
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        L_0x00d3:
            java.lang.String r1 = r11.f39502o
            if (r1 == 0) goto L_0x00dc
            java.lang.String r2 = "photoUrl"
            r0.put(r2, r1)
        L_0x00dc:
            java.lang.String r1 = r11.f39501g
            if (r1 == 0) goto L_0x00e5
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
        L_0x00e5:
            java.lang.String r1 = r11.f39505z
            if (r1 == 0) goto L_0x00ee
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00ee:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzaao.zza():java.lang.String");
    }
}
