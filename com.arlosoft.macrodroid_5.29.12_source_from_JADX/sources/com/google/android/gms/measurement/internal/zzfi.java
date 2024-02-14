package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfi extends zzkh implements zzaf {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f46777d = new ArrayMap();
    @VisibleForTesting

    /* renamed from: e */
    final Map f46778e = new ArrayMap();
    @VisibleForTesting

    /* renamed from: f */
    final Map f46779f = new ArrayMap();
    @VisibleForTesting

    /* renamed from: g */
    final Map f46780g = new ArrayMap();

    /* renamed from: h */
    private final Map f46781h = new ArrayMap();

    /* renamed from: i */
    private final Map f46782i = new ArrayMap();
    @VisibleForTesting

    /* renamed from: j */
    final LruCache f46783j = new zzff(this, 20);

    /* renamed from: k */
    final zzr f46784k = new zzfg(this);

    /* renamed from: l */
    private final Map f46785l = new ArrayMap();

    /* renamed from: m */
    private final Map f46786m = new ArrayMap();

    /* renamed from: n */
    private final Map f46787n = new ArrayMap();

    zzfi(zzkt zzkt) {
        super(zzkt);
    }

    @WorkerThread
    /* renamed from: k */
    private final zzff m65623k(String str, byte[] bArr) {
        if (bArr == null) {
            return zzff.m59784I();
        }
        try {
            zzff zzff = (zzff) ((zzfe) zzkv.m66085C(zzff.m59782G(), bArr)).mo51441o();
            zzef t = this.f46899a.mo55221z().mo55102t();
            String str2 = null;
            Long valueOf = zzff.mo50982T() ? Long.valueOf(zzff.mo50972D()) : null;
            if (zzff.mo50981S()) {
                str2 = zzff.mo50974J();
            }
            t.mo55093c("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzff;
        } catch (zzkp e) {
            this.f46899a.mo55221z().mo55103u().mo55093c("Unable to merge remote config. appId", zzeh.m65566x(str), e);
            return zzff.m59784I();
        } catch (RuntimeException e2) {
            this.f46899a.mo55221z().mo55103u().mo55093c("Unable to merge remote config. appId", zzeh.m65566x(str), e2);
            return zzff.m59784I();
        }
    }

    /* renamed from: l */
    private final void m65624l(String str, zzfe zzfe) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (zzfb C : zzfe.mo50963A()) {
            hashSet.add(C.mo50947C());
        }
        for (int i = 0; i < zzfe.mo50964t(); i++) {
            zzfc zzfc = (zzfc) zzfe.mo50965u(i).mo51460y();
            if (zzfc.mo50952v().isEmpty()) {
                this.f46899a.mo55221z().mo55103u().mo55091a("EventConfig contained null event name");
            } else {
                String v = zzfc.mo50952v();
                String b = zzgo.m65769b(zzfc.mo50952v());
                if (!TextUtils.isEmpty(b)) {
                    zzfc.mo50951u(b);
                    zzfe.mo50967x(i, zzfc);
                }
                if (zzfc.mo50955z() && zzfc.mo50953x()) {
                    arrayMap.put(v, Boolean.TRUE);
                }
                if (zzfc.mo50948A() && zzfc.mo50954y()) {
                    arrayMap2.put(zzfc.mo50952v(), Boolean.TRUE);
                }
                if (zzfc.mo50949B()) {
                    if (zzfc.mo50950t() < 2 || zzfc.mo50950t() > 65535) {
                        this.f46899a.mo55221z().mo55103u().mo55093c("Invalid sampling rate. Event name, sample rate", zzfc.mo50952v(), Integer.valueOf(zzfc.mo50950t()));
                    } else {
                        arrayMap3.put(zzfc.mo50952v(), Integer.valueOf(zzfc.mo50950t()));
                    }
                }
            }
        }
        this.f46778e.put(str, hashSet);
        this.f46779f.put(str, arrayMap);
        this.f46780g.put(str, arrayMap2);
        this.f46782i.put(str, arrayMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m65625m(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo55503f()
            r12.mo55073e()
            com.google.android.gms.common.internal.Preconditions.m4484g(r13)
            java.util.Map r0 = r12.f46781h
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x012c
            com.google.android.gms.measurement.internal.zzkt r0 = r12.f47227b
            com.google.android.gms.measurement.internal.zzam r0 = r0.mo55519W()
            com.google.android.gms.common.internal.Preconditions.m4484g(r13)
            r0.mo55073e()
            r0.mo55503f()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo54965P()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r3 != 0) goto L_0x0047
            goto L_0x00a6
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzfr r5 = r0.f46899a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzag r5 = r5.mo55219x()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzdt r6 = com.google.android.gms.measurement.internal.zzdu.f46629q0     // Catch:{ SQLiteException -> 0x0089 }
            boolean r5 = r5.mo54919A(r1, r6)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r6 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.zzfr r6 = r0.f46899a     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.mo55221z()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzef r6 = r6.mo55098p()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeh.m65566x(r13)     // Catch:{ SQLiteException -> 0x0089 }
            r6.mo55092b(r7, r8)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x00a6
        L_0x0080:
            com.google.android.gms.measurement.internal.zzaj r6 = new com.google.android.gms.measurement.internal.zzaj     // Catch:{ SQLiteException -> 0x0089 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0089 }
            r2.close()
            goto L_0x00aa
        L_0x0089:
            r3 = move-exception
            goto L_0x0091
        L_0x008b:
            r13 = move-exception
            goto L_0x0126
        L_0x008e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0091:
            com.google.android.gms.measurement.internal.zzfr r0 = r0.f46899a     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.mo55221z()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzef r0 = r0.mo55098p()     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeh.m65566x(r13)     // Catch:{ all -> 0x0124 }
            r0.mo55093c(r4, r5, r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00a9
        L_0x00a6:
            r2.close()
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 != 0) goto L_0x00da
            java.util.Map r0 = r12.f46777d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46779f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46778e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46780g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46781h
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46785l
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46786m
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46787n
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46782i
            r0.put(r13, r1)
            return
        L_0x00da:
            byte[] r0 = r6.f46429a
            com.google.android.gms.internal.measurement.zzff r0 = r12.m65623k(r13, r0)
            com.google.android.gms.internal.measurement.zzkb r0 = r0.mo51460y()
            com.google.android.gms.internal.measurement.zzfe r0 = (com.google.android.gms.internal.measurement.zzfe) r0
            r12.m65624l(r13, r0)
            java.util.Map r1 = r12.f46777d
            com.google.android.gms.internal.measurement.zzkf r2 = r0.mo51441o()
            com.google.android.gms.internal.measurement.zzff r2 = (com.google.android.gms.internal.measurement.zzff) r2
            java.util.Map r2 = m65627o(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f46781h
            com.google.android.gms.internal.measurement.zzkf r2 = r0.mo51441o()
            com.google.android.gms.internal.measurement.zzff r2 = (com.google.android.gms.internal.measurement.zzff) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.zzkf r1 = r0.mo51441o()
            com.google.android.gms.internal.measurement.zzff r1 = (com.google.android.gms.internal.measurement.zzff) r1
            r12.m65626n(r13, r1)
            java.util.Map r1 = r12.f46785l
            java.lang.String r0 = r0.mo50968y()
            r1.put(r13, r0)
            java.util.Map r0 = r12.f46786m
            java.lang.String r1 = r6.f46430b
            r0.put(r13, r1)
            java.util.Map r0 = r12.f46787n
            java.lang.String r1 = r6.f46431c
            r0.put(r13, r1)
            return
        L_0x0124:
            r13 = move-exception
            r1 = r2
        L_0x0126:
            if (r1 == 0) goto L_0x012b
            r1.close()
        L_0x012b:
            throw r13
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfi.m65625m(java.lang.String):void");
    }

    @WorkerThread
    /* renamed from: n */
    private final void m65626n(String str, zzff zzff) {
        if (zzff.mo50970B() != 0) {
            this.f46899a.mo55221z().mo55102t().mo55092b("EES programs found", Integer.valueOf(zzff.mo50970B()));
            zzgt zzgt = (zzgt) zzff.mo50978N().get(0);
            try {
                zzc zzc = new zzc();
                zzc.mo50784d("internal.remoteConfig", new zzfc(this, str));
                zzc.mo50784d("internal.appMetadata", new zzfd(this, str));
                zzc.mo50784d("internal.logger", new zzfe(this));
                zzc.mo50783c(zzgt);
                this.f46783j.put(str, zzc);
                this.f46899a.mo55221z().mo55102t().mo55093c("EES program loaded for appId, activities", str, Integer.valueOf(zzgt.mo51246B().mo51242B()));
                for (zzgr C : zzgt.mo51246B().mo51243E()) {
                    this.f46899a.mo55221z().mo55102t().mo55092b("EES program activity", C.mo51244C());
                }
            } catch (zzd unused) {
                this.f46899a.mo55221z().mo55098p().mo55092b("Failed to load EES program. appId", str);
            }
        } else {
            this.f46783j.remove(str);
        }
    }

    /* renamed from: o */
    private static final Map m65627o(zzff zzff) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzff != null) {
            for (zzfj zzfj : zzff.mo50979O()) {
                arrayMap.put(zzfj.mo50983C(), zzfj.mo50984D());
            }
        }
        return arrayMap;
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ zzc m65628q(zzfi zzfi, String str) {
        zzfi.mo55503f();
        Preconditions.m4484g(str);
        if (!zzfi.mo55150C(str)) {
            return null;
        }
        if (!zzfi.f46781h.containsKey(str) || zzfi.f46781h.get(str) == null) {
            zzfi.m65625m(str);
        } else {
            zzfi.m65626n(str, (zzff) zzfi.f46781h.get(str));
        }
        return (zzc) zzfi.f46783j.snapshot().get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final boolean mo55149A(String str) {
        mo55073e();
        zzff r = mo55163r(str);
        if (r == null) {
            return false;
        }
        return r.mo50980R();
    }

    /* renamed from: C */
    public final boolean mo55150C(String str) {
        zzff zzff;
        if (TextUtils.isEmpty(str) || (zzff = (zzff) this.f46781h.get(str)) == null || zzff.mo50970B() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo55151D(String str) {
        return "1".equals(mo54918b(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public final boolean mo55152E(String str, String str2) {
        Boolean bool;
        mo55073e();
        m65625m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f46780g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: F */
    public final boolean mo55153F(String str, String str2) {
        Boolean bool;
        mo55073e();
        m65625m(str);
        if (mo55151D(str) && zzlb.m66120W(str2)) {
            return true;
        }
        if (mo55154G(str) && zzlb.m66121X(str2)) {
            return true;
        }
        Map map = (Map) this.f46779f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo55154G(String str) {
        return "1".equals(mo54918b(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: H */
    public final boolean mo55155H(String str, byte[] bArr, String str2, String str3) {
        mo55503f();
        mo55073e();
        Preconditions.m4484g(str);
        zzfe zzfe = (zzfe) m65623k(str, bArr).mo51460y();
        m65624l(str, zzfe);
        m65626n(str, (zzff) zzfe.mo51441o());
        this.f46781h.put(str, (zzff) zzfe.mo51441o());
        this.f46785l.put(str, zzfe.mo50968y());
        this.f46786m.put(str, str2);
        this.f46787n.put(str, str3);
        this.f46777d.put(str, m65627o((zzff) zzfe.mo51441o()));
        this.f47227b.mo55519W().mo54984l(str, new ArrayList(zzfe.mo50969z()));
        try {
            zzfe.mo50966v();
            bArr = ((zzff) zzfe.mo51441o()).mo51306h();
        } catch (RuntimeException e) {
            this.f46899a.mo55221z().mo55103u().mo55093c("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.m65566x(str), e);
        }
        zzam W = this.f47227b.mo55519W();
        Preconditions.m4484g(str);
        W.mo55073e();
        W.mo55503f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (W.f46899a.mo55219x().mo54919A((String) null, zzdu.f46629q0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) W.mo54965P().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                W.f46899a.mo55221z().mo55098p().mo55092b("Failed to update remote config (got 0). appId", zzeh.m65566x(str));
            }
        } catch (SQLiteException e2) {
            W.f46899a.mo55221z().mo55098p().mo55093c("Error storing remote config. appId", zzeh.m65566x(str), e2);
        }
        this.f46781h.put(str, (zzff) zzfe.mo51441o());
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: I */
    public final boolean mo55156I(String str) {
        mo55073e();
        m65625m(str);
        return this.f46778e.get(str) != null && ((Set) this.f46778e.get(str)).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: J */
    public final boolean mo55157J(String str) {
        mo55073e();
        m65625m(str);
        if (this.f46778e.get(str) == null || (!((Set) this.f46778e.get(str)).contains("device_model") && !((Set) this.f46778e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: K */
    public final boolean mo55158K(String str) {
        mo55073e();
        m65625m(str);
        return this.f46778e.get(str) != null && ((Set) this.f46778e.get(str)).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: L */
    public final boolean mo55159L(String str) {
        mo55073e();
        m65625m(str);
        return this.f46778e.get(str) != null && ((Set) this.f46778e.get(str)).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: M */
    public final boolean mo55160M(String str) {
        mo55073e();
        m65625m(str);
        if (this.f46778e.get(str) == null || (!((Set) this.f46778e.get(str)).contains("os_version") && !((Set) this.f46778e.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: N */
    public final boolean mo55161N(String str) {
        mo55073e();
        m65625m(str);
        return this.f46778e.get(str) != null && ((Set) this.f46778e.get(str)).contains("user_id");
    }

    @WorkerThread
    /* renamed from: b */
    public final String mo54918b(String str, String str2) {
        mo55073e();
        m65625m(str);
        Map map = (Map) this.f46777d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo54913j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final int mo55162p(String str, String str2) {
        Integer num;
        mo55073e();
        m65625m(str);
        Map map = (Map) this.f46782i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: r */
    public final zzff mo55163r(String str) {
        mo55503f();
        mo55073e();
        Preconditions.m4484g(str);
        m65625m(str);
        return (zzff) this.f46781h.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: s */
    public final String mo55164s(String str) {
        mo55073e();
        return (String) this.f46787n.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: t */
    public final String mo55165t(String str) {
        mo55073e();
        return (String) this.f46786m.get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final String mo55166u(String str) {
        mo55073e();
        m65625m(str);
        return (String) this.f46785l.get(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final Set mo55167w(String str) {
        mo55073e();
        m65625m(str);
        return (Set) this.f46778e.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: x */
    public final void mo55168x(String str) {
        mo55073e();
        this.f46786m.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final void mo55169y(String str) {
        mo55073e();
        this.f46781h.remove(str);
    }
}
