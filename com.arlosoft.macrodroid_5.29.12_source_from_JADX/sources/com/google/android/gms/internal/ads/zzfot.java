package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfot {

    /* renamed from: f */
    private static final Object f36214f = new Object();

    /* renamed from: a */
    private final Context f36215a;

    /* renamed from: b */
    private final SharedPreferences f36216b;

    /* renamed from: c */
    private final String f36217c;

    /* renamed from: d */
    private final zzfoa f36218d;

    /* renamed from: e */
    private boolean f36219e = false;

    public zzfot(@NonNull Context context, @NonNull int i, @NonNull zzfoa zzfoa, boolean z) {
        this.f36215a = context;
        this.f36217c = Integer.toString(i - 1);
        this.f36216b = context.getSharedPreferences("pcvmspf", 0);
        this.f36218d = zzfoa;
        this.f36219e = z;
    }

    /* renamed from: e */
    private final File m50699e(@NonNull String str) {
        return new File(new File(this.f36215a.getDir("pccache", 0), this.f36217c), str);
    }

    /* renamed from: f */
    private static String m50700f(@NonNull zzarv zzarv) {
        zzarx I = zzary.m42202I();
        I.mo41859x(zzarv.mo41852H().mo41864O());
        I.mo41855n(zzarv.mo41852H().mo41863N());
        I.mo41856o(zzarv.mo41852H().mo41860F());
        I.mo41858v(zzarv.mo41852H().mo41862H());
        I.mo41857u(zzarv.mo41852H().mo41861G());
        return Hex.m4884a(((zzary) I.mo47341h()).mo47051t().mo47109i());
    }

    /* renamed from: g */
    private final String m50701g() {
        return "FBAMTD".concat(String.valueOf(this.f36217c));
    }

    /* renamed from: h */
    private final String m50702h() {
        return "LATMTD".concat(String.valueOf(this.f36217c));
    }

    /* renamed from: i */
    private final void m50703i(int i, long j) {
        zzfoa zzfoa = this.f36218d;
        if (zzfoa != null) {
            zzfoa.mo20426d(i, j);
        }
    }

    /* renamed from: j */
    private final void m50704j(int i, long j, String str) {
        zzfoa zzfoa = this.f36218d;
        if (zzfoa != null) {
            zzfoa.mo20425a(i, j, str);
        }
    }

    @Nullable
    /* renamed from: k */
    private final zzary m50705k(int i) {
        String str;
        zzgqq zzgqq;
        if (i == 1) {
            str = this.f36216b.getString(m50702h(), (String) null);
        } else {
            str = this.f36216b.getString(m50701g(), (String) null);
        }
        if (str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzgpw R = zzgpw.m52564R(Hex.m4887d(str));
            if (this.f36219e) {
                zzgqq = zzgqq.m52900a();
            } else {
                zzgqq = zzgqq.m52901b();
            }
            return zzary.m42206M(R, zzgqq);
        } catch (zzgrq unused) {
            return null;
        } catch (NullPointerException unused2) {
            m50703i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m50703i(2032, currentTimeMillis);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46053a(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzarv r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f36214f
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzary r3 = r7.mo41852H()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.mo41864O()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.m50699e(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.zzgpw r3 = r7.mo41853I()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.mo47109i()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.zzfon.m50697e(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.m50703i(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = m50700f(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f36216b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.m50702h()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.m50703i(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.m50703i(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfot.mo46053a(com.google.android.gms.internal.ads.zzarv):boolean");
    }

    /* renamed from: b */
    public final boolean mo46054b(@NonNull zzarv zzarv, @Nullable zzfos zzfos) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f36214f) {
            zzary k = m50705k(1);
            String O = zzarv.mo41852H().mo41864O();
            if (k == null || !k.mo41864O().equals(O)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = m50699e(O);
                if (e.exists()) {
                    String str = "1";
                    if (true != e.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != e.isFile()) {
                        str2 = "0";
                    }
                    m50704j(4023, currentTimeMillis2, "d:" + str + ",f:" + str2);
                    m50703i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    String str3 = "1";
                    if (true != e.canWrite()) {
                        str3 = "0";
                    }
                    m50704j(4024, currentTimeMillis2, "cw:".concat(str3));
                    m50703i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = m50699e(O);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!zzfon.m50697e(file, zzarv.mo41854J().mo47109i())) {
                    m50703i(4016, currentTimeMillis);
                    return false;
                } else if (!zzfon.m50697e(file2, zzarv.mo41853I().mo47109i())) {
                    m50703i(4017, currentTimeMillis);
                    return false;
                } else if (zzfos == null || zzfos.mo41760a(file)) {
                    String f = m50700f(zzarv);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.f36216b.getString(m50702h(), (String) null);
                    SharedPreferences.Editor edit = this.f36216b.edit();
                    edit.putString(m50702h(), f);
                    if (string != null) {
                        edit.putString(m50701g(), string);
                    }
                    if (!edit.commit()) {
                        m50703i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    zzary k2 = m50705k(1);
                    if (k2 != null) {
                        hashSet.add(k2.mo41864O());
                    }
                    zzary k3 = m50705k(2);
                    if (k3 != null) {
                        hashSet.add(k3.mo41864O());
                    }
                    for (File file3 : new File(this.f36215a.getDir("pccache", 0), this.f36217c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            zzfon.m50696d(file3);
                        }
                    }
                    m50703i(5014, currentTimeMillis);
                    return true;
                } else {
                    m50703i(4018, currentTimeMillis);
                    zzfon.m50696d(e2);
                    return false;
                }
            } else {
                m50703i(4014, currentTimeMillis);
                return false;
            }
        }
    }

    @Nullable
    /* renamed from: c */
    public final zzfol mo46055c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f36214f) {
            zzary k = m50705k(1);
            if (k == null) {
                m50703i(4022, currentTimeMillis);
                return null;
            }
            File e = m50699e(k.mo41864O());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            m50703i(5016, currentTimeMillis);
            zzfol zzfol = new zzfol(k, file, file2, file3);
            return zzfol;
        }
    }

    /* renamed from: d */
    public final boolean mo46056d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f36214f) {
            zzary k = m50705k(1);
            if (k == null) {
                m50703i(4025, currentTimeMillis);
                return false;
            }
            File e = m50699e(k.mo41864O());
            if (!new File(e, "pcam.jar").exists()) {
                m50703i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e, "pcbc").exists()) {
                m50703i(4027, currentTimeMillis);
                return false;
            } else {
                m50703i(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
