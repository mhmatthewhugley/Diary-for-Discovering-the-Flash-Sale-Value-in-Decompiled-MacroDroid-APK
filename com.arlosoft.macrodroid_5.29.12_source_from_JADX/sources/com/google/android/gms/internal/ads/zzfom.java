package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfom {

    /* renamed from: a */
    private final File f36202a;
    @VisibleForTesting

    /* renamed from: b */
    final File f36203b;

    /* renamed from: c */
    private final SharedPreferences f36204c;

    /* renamed from: d */
    private final int f36205d;

    public zzfom(@NonNull Context context, int i) {
        this.f36204c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfon.m50693a(dir, false);
        this.f36202a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfon.m50693a(dir2, true);
        this.f36203b = dir2;
        this.f36205d = i;
    }

    @VisibleForTesting
    /* renamed from: a */
    static String m50686a(@NonNull zzary zzary) {
        return Hex.m4884a(zzary.mo47051t().mo47109i());
    }

    /* renamed from: e */
    private final File m50687e() {
        File file = new File(this.f36202a, Integer.toString(this.f36205d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m50688f() {
        int i = this.f36205d;
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: g */
    private final String m50689g() {
        int i = this.f36205d;
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46044b(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzarv r8, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfos r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            java.lang.String r0 = r0.mo41864O()
            com.google.android.gms.internal.ads.zzgpw r1 = r8.mo41854J()
            byte[] r1 = r1.mo47109i()
            com.google.android.gms.internal.ads.zzgpw r2 = r8.mo41853I()
            byte[] r2 = r2.mo47109i()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.f36203b
            com.google.android.gms.internal.ads.zzfon.m50696d(r3)
            java.io.File r3 = r7.f36203b
            r3.mkdirs()
            java.io.File r3 = r7.f36203b
            java.io.File r3 = com.google.android.gms.internal.ads.zzfon.m50695c(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.f36203b
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.zzfon.m50694b(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.zzfon.m50697e(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.f36203b
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfon.m50694b(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzfon.m50697e(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            java.lang.String r0 = r0.mo41864O()
            java.io.File r1 = r7.f36203b
            java.io.File r0 = com.google.android.gms.internal.ads.zzfon.m50694b(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.mo41760a(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.zzary r9 = r8.mo41852H()
            java.lang.String r9 = r9.mo41864O()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.f36203b
            java.io.File r0 = com.google.android.gms.internal.ads.zzfon.m50694b(r9, r5, r0)
            java.io.File r2 = r7.f36203b
            java.io.File r2 = com.google.android.gms.internal.ads.zzfon.m50694b(r9, r3, r2)
            java.io.File r6 = r7.m50687e()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfon.m50694b(r9, r5, r6)
            java.io.File r6 = r7.m50687e()
            java.io.File r9 = com.google.android.gms.internal.ads.zzfon.m50694b(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzarx r9 = com.google.android.gms.internal.ads.zzary.m42202I()
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            java.lang.String r0 = r0.mo41864O()
            r9.mo41859x(r0)
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            java.lang.String r0 = r0.mo41863N()
            r9.mo41855n(r0)
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            long r2 = r0.mo41860F()
            r9.mo41856o(r2)
            com.google.android.gms.internal.ads.zzary r0 = r8.mo41852H()
            long r2 = r0.mo41862H()
            r9.mo41858v(r2)
            com.google.android.gms.internal.ads.zzary r8 = r8.mo41852H()
            long r2 = r8.mo41861G()
            r9.mo41857u(r2)
            com.google.android.gms.internal.ads.zzgre r8 = r9.mo47341h()
            com.google.android.gms.internal.ads.zzary r8 = (com.google.android.gms.internal.ads.zzary) r8
            com.google.android.gms.internal.ads.zzary r9 = r7.mo46045c(r1)
            android.content.SharedPreferences r0 = r7.f36204c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.mo41864O()
            java.lang.String r3 = r9.mo41864O()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.m50688f()
            java.lang.String r9 = m50686a(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.m50689g()
            java.lang.String r8 = m50686a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.zzary r0 = r7.mo46045c(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.mo41864O()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.zzary r0 = r7.mo46045c(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.mo41864O()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.m50687e()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.m50687e()
            java.io.File r2 = com.google.android.gms.internal.ads.zzfon.m50695c(r2, r3)
            com.google.android.gms.internal.ads.zzfon.m50696d(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfom.mo46044b(com.google.android.gms.internal.ads.zzarv, com.google.android.gms.internal.ads.zzfos):boolean");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @VisibleForTesting
    /* renamed from: c */
    public final zzary mo46045c(int i) {
        String str;
        if (i == 1) {
            str = this.f36204c.getString(m50689g(), (String) null);
        } else {
            str = this.f36204c.getString(m50688f(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzary L = zzary.m42205L(zzgpw.m52564R(Hex.m4887d(str)));
            String O = L.mo41864O();
            File b = zzfon.m50694b(O, "pcam.jar", m50687e());
            if (!b.exists()) {
                b = zzfon.m50694b(O, "pcam", m50687e());
            }
            File b2 = zzfon.m50694b(O, "pcbc", m50687e());
            if (!b.exists() || !b2.exists()) {
                return null;
            }
            return L;
        } catch (zzgrq unused) {
        }
    }

    @Nullable
    /* renamed from: d */
    public final zzfol mo46046d(int i) {
        zzary c = mo46045c(1);
        if (c == null) {
            return null;
        }
        String O = c.mo41864O();
        File b = zzfon.m50694b(O, "pcam.jar", m50687e());
        if (!b.exists()) {
            b = zzfon.m50694b(O, "pcam", m50687e());
        }
        return new zzfol(c, b, zzfon.m50694b(O, "pcbc", m50687e()), zzfon.m50694b(O, "pcopt", m50687e()));
    }
}
