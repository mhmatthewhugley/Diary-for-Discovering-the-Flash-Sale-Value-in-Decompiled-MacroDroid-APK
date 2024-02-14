package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzvr extends zzvw {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final zzfwv f38735k = zzfwv.m51207b(zzux.f38650a);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final zzfwv f38736l = zzfwv.m51207b(zzuy.f38651a);

    /* renamed from: m */
    public static final /* synthetic */ int f38737m = 0;

    /* renamed from: d */
    private final Object f38738d;
    @Nullable

    /* renamed from: e */
    public final Context f38739e;

    /* renamed from: f */
    private final boolean f38740f;
    @GuardedBy("lock")

    /* renamed from: g */
    private zzvf f38741g;
    @GuardedBy("lock")
    @Nullable

    /* renamed from: h */
    private zzvk f38742h;
    @GuardedBy("lock")

    /* renamed from: i */
    private zzk f38743i;

    /* renamed from: j */
    private final zzum f38744j;

    @Deprecated
    public zzvr() {
        zzvf zzvf = zzvf.f38681S;
        throw null;
    }

    /* renamed from: j */
    protected static int m55204j(zzaf zzaf, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzaf.f24204c)) {
            return 4;
        }
        String n = m55207n(str);
        String n2 = m55207n(zzaf.f24204c);
        if (n2 == null || n == null) {
            if (!z || n2 != null) {
                return 0;
            }
            return 1;
        } else if (n2.startsWith(n) || n.startsWith(n2)) {
            return 3;
        } else {
            if (zzen.m49134I(n2, HelpFormatter.DEFAULT_OPT_PREFIX)[0].equals(zzen.m49134I(n, HelpFormatter.DEFAULT_OPT_PREFIX)[0])) {
                return 2;
            }
            return 0;
        }
    }

    @Nullable
    /* renamed from: n */
    protected static String m55207n(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r8.f38742h.mo48301d(r8.f38743i, r9) != false) goto L_0x008b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean m55209q(com.google.android.gms.internal.ads.zzvr r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.f38738d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzvf r1 = r8.f38741g     // Catch:{ all -> 0x008e }
            boolean r1 = r1.f38693M     // Catch:{ all -> 0x008e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008b
            boolean r1 = r8.f38740f     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x008b
            int r1 = r9.f24226y     // Catch:{ all -> 0x008e }
            r4 = 2
            if (r1 <= r4) goto L_0x008b
            java.lang.String r1 = r9.f24213l     // Catch:{ all -> 0x008e }
            r5 = 32
            if (r1 != 0) goto L_0x001b
            goto L_0x0065
        L_0x001b:
            int r6 = r1.hashCode()     // Catch:{ all -> 0x008e }
            r7 = 3
            switch(r6) {
                case -2123537834: goto L_0x0042;
                case 187078296: goto L_0x0038;
                case 187078297: goto L_0x002e;
                case 1504578661: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x0056
            if (r1 == r3) goto L_0x0056
            if (r1 == r4) goto L_0x0056
            if (r1 == r7) goto L_0x0056
            goto L_0x0065
        L_0x0056:
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008b
            com.google.android.gms.internal.ads.zzvk r1 = r8.f38742h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.mo48304g()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008c
            com.google.android.gms.internal.ads.zzvk r1 = r8.f38742h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            boolean r4 = r1.mo48304g()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            boolean r1 = r1.mo48302e()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzvk r1 = r8.f38742h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.mo48303f()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzvk r1 = r8.f38742h     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzk r8 = r8.f38743i     // Catch:{ all -> 0x008e }
            boolean r8 = r1.mo48301d(r8, r9)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x008c
        L_0x008b:
            r2 = 1
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r2
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvr.m55209q(com.google.android.gms.internal.ads.zzvr, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    /* renamed from: r */
    protected static boolean m55210r(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: s */
    private static void m55211s(zzuh zzuh, zzcu zzcu, Map map) {
        int i = 0;
        while (i < zzuh.f38624a) {
            if (((zzcr) zzcu.f31575y.get(zzuh.mo48265b(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m55212t() {
        boolean z;
        zzvk zzvk;
        synchronized (this.f38738d) {
            z = false;
            if (this.f38741g.f38693M && !this.f38740f && zzen.f34500a >= 32 && (zzvk = this.f38742h) != null && zzvk.mo48304g()) {
                z = true;
            }
        }
        if (z) {
            mo48324h();
        }
    }

    @Nullable
    /* renamed from: u */
    private static final Pair m55213u(int i, zzvv zzvv, int[][][] iArr, zzvm zzvm, Comparator comparator) {
        Object obj;
        zzvv zzvv2 = zzvv;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzvv2.mo48317c(i2)) {
                zzuh d = zzvv2.mo48318d(i2);
                for (int i3 = 0; i3 < d.f38624a; i3++) {
                    zzcp b = d.mo48265b(i3);
                    List a = zzvm.mo48275a(i2, b, iArr[i2][i3]);
                    int i4 = b.f29179a;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        zzvn zzvn = (zzvn) a.get(i6);
                        int b2 = zzvn.mo48281b();
                        if (!zArr[i6] && b2 != 0) {
                            if (b2 == i5) {
                                obj = zzfvn.m51136z(zzvn);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvn);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    zzvn zzvn2 = (zzvn) a.get(i7);
                                    if (zzvn2.mo48281b() == 2 && zzvn.mo48283d(zzvn2)) {
                                        arrayList2.add(zzvn2);
                                        zArr[i7] = true;
                                    }
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        i5 = 1;
                    }
                }
            }
            zzvm zzvm2 = zzvm;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzvn) list.get(i8)).f38718d;
        }
        zzvn zzvn3 = (zzvn) list.get(0);
        return Pair.create(new zzvs(zzvn3.f38717c, iArr2, 0), Integer.valueOf(zzvn3.f38716a));
    }

    /* renamed from: a */
    public final void mo48309a() {
        zzvk zzvk;
        synchronized (this.f38738d) {
            if (zzen.f34500a >= 32 && (zzvk = this.f38742h) != null) {
                zzvk.mo48300c();
            }
        }
        super.mo48309a();
    }

    /* renamed from: b */
    public final void mo48310b(zzk zzk) {
        boolean z;
        synchronized (this.f38738d) {
            z = !this.f38743i.equals(zzk);
            this.f38743i = zzk;
        }
        if (z) {
            m55212t();
        }
    }

    /* renamed from: c */
    public final boolean mo48311c() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.zzvt[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.google.android.gms.internal.ads.zzun} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: com.google.android.gms.internal.ads.zzvu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.gms.internal.ads.zzvu} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo48312i(com.google.android.gms.internal.ads.zzvv r24, int[][][] r25, int[] r26, com.google.android.gms.internal.ads.zzsi r27, com.google.android.gms.internal.ads.zzcn r28) throws com.google.android.gms.internal.ads.zzha {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.Object r3 = r1.f38738d
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzvf r4 = r1.f38741g     // Catch:{ all -> 0x021f }
            boolean r5 = r4.f38693M     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ all -> 0x021f }
            r6 = 32
            if (r5 < r6) goto L_0x0023
            com.google.android.gms.internal.ads.zzvk r5 = r1.f38742h     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch:{ all -> 0x021f }
            com.google.android.gms.internal.ads.zzdd.m47208b(r6)     // Catch:{ all -> 0x021f }
            r5.mo48299b(r1, r6)     // Catch:{ all -> 0x021f }
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            r3 = 2
            com.google.android.gms.internal.ads.zzvs[] r5 = new com.google.android.gms.internal.ads.zzvs[r3]
            com.google.android.gms.internal.ads.zzut r6 = new com.google.android.gms.internal.ads.zzut
            r7 = r26
            r6.<init>(r4, r7)
            com.google.android.gms.internal.ads.zzuu r7 = com.google.android.gms.internal.ads.zzuu.f38646a
            android.util.Pair r6 = m55213u(r3, r0, r2, r6, r7)
            if (r6 == 0) goto L_0x0044
            java.lang.Object r7 = r6.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzvs r6 = (com.google.android.gms.internal.ads.zzvs) r6
            r5[r7] = r6
        L_0x0044:
            r6 = 0
            r7 = 0
        L_0x0046:
            r8 = 1
            if (r7 >= r3) goto L_0x005c
            int r9 = r0.mo48317c(r7)
            if (r9 != r3) goto L_0x0059
            com.google.android.gms.internal.ads.zzuh r9 = r0.mo48318d(r7)
            int r9 = r9.f38624a
            if (r9 <= 0) goto L_0x0059
            r7 = 1
            goto L_0x005d
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x005c:
            r7 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzur r9 = new com.google.android.gms.internal.ads.zzur
            r9.<init>(r1, r4, r7)
            com.google.android.gms.internal.ads.zzus r7 = com.google.android.gms.internal.ads.zzus.f38643a
            android.util.Pair r7 = m55213u(r8, r0, r2, r9, r7)
            if (r7 == 0) goto L_0x0078
            java.lang.Object r9 = r7.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.zzvs r10 = (com.google.android.gms.internal.ads.zzvs) r10
            r5[r9] = r10
        L_0x0078:
            if (r7 != 0) goto L_0x007c
            r7 = 0
            goto L_0x008f
        L_0x007c:
            java.lang.Object r7 = r7.first
            r10 = r7
            com.google.android.gms.internal.ads.zzvs r10 = (com.google.android.gms.internal.ads.zzvs) r10
            com.google.android.gms.internal.ads.zzcp r10 = r10.f38745a
            com.google.android.gms.internal.ads.zzvs r7 = (com.google.android.gms.internal.ads.zzvs) r7
            int[] r7 = r7.f38746b
            r7 = r7[r6]
            com.google.android.gms.internal.ads.zzaf r7 = r10.mo44231b(r7)
            java.lang.String r7 = r7.f24204c
        L_0x008f:
            com.google.android.gms.internal.ads.zzuv r10 = new com.google.android.gms.internal.ads.zzuv
            r10.<init>(r4, r7)
            com.google.android.gms.internal.ads.zzuw r7 = com.google.android.gms.internal.ads.zzuw.f38649a
            r11 = 3
            android.util.Pair r7 = m55213u(r11, r0, r2, r10, r7)
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzvs r7 = (com.google.android.gms.internal.ads.zzvs) r7
            r5[r10] = r7
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 >= r3) goto L_0x011e
            int r10 = r0.mo48317c(r7)
            if (r10 == r3) goto L_0x0115
            if (r10 == r8) goto L_0x0115
            if (r10 == r11) goto L_0x0115
            com.google.android.gms.internal.ads.zzuh r10 = r0.mo48318d(r7)
            r12 = r2[r7]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x00c3:
            int r11 = r10.f38624a
            if (r13 >= r11) goto L_0x0104
            com.google.android.gms.internal.ads.zzcp r11 = r10.mo48265b(r13)
            r17 = r12[r13]
            r9 = r16
            r3 = 0
        L_0x00d0:
            int r6 = r11.f29179a
            if (r3 > 0) goto L_0x00fa
            r6 = r17[r3]
            boolean r8 = r4.f38694N
            boolean r6 = m55210r(r6, r8)
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.zzaf r6 = r11.mo44231b(r3)
            com.google.android.gms.internal.ads.zzva r8 = new com.google.android.gms.internal.ads.zzva
            r2 = r17[r3]
            r8.<init>(r6, r2)
            if (r9 == 0) goto L_0x00f1
            int r2 = r8.compareTo(r9)
            if (r2 <= 0) goto L_0x00f4
        L_0x00f1:
            r15 = r3
            r9 = r8
            r14 = r11
        L_0x00f4:
            int r3 = r3 + 1
            r2 = r25
            r8 = 1
            goto L_0x00d0
        L_0x00fa:
            int r13 = r13 + 1
            r2 = r25
            r16 = r9
            r3 = 2
            r6 = 0
            r8 = 1
            goto L_0x00c3
        L_0x0104:
            if (r14 != 0) goto L_0x0108
            r2 = 0
            goto L_0x0113
        L_0x0108:
            com.google.android.gms.internal.ads.zzvs r2 = new com.google.android.gms.internal.ads.zzvs
            r3 = 1
            int[] r6 = new int[r3]
            r3 = 0
            r6[r3] = r15
            r2.<init>(r14, r6, r3)
        L_0x0113:
            r5[r7] = r2
        L_0x0115:
            int r7 = r7 + 1
            r2 = r25
            r3 = 2
            r6 = 0
            r8 = 1
            r11 = 3
            goto L_0x00ac
        L_0x011e:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            r6 = 2
        L_0x0125:
            if (r3 >= r6) goto L_0x0131
            com.google.android.gms.internal.ads.zzuh r7 = r0.mo48318d(r3)
            m55211s(r7, r4, r2)
            int r3 = r3 + 1
            goto L_0x0125
        L_0x0131:
            com.google.android.gms.internal.ads.zzuh r3 = r24.mo48319e()
            m55211s(r3, r4, r2)
            r3 = 0
        L_0x0139:
            if (r3 >= r6) goto L_0x0150
            int r7 = r0.mo48317c(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            com.google.android.gms.internal.ads.zzcr r7 = (com.google.android.gms.internal.ads.zzcr) r7
            if (r7 != 0) goto L_0x014e
            int r3 = r3 + 1
            goto L_0x0139
        L_0x014e:
            r3 = 0
            throw r3
        L_0x0150:
            r3 = 0
            r2 = 0
        L_0x0152:
            if (r2 >= r6) goto L_0x016c
            com.google.android.gms.internal.ads.zzuh r6 = r0.mo48318d(r2)
            boolean r7 = r4.mo48293g(r2, r6)
            if (r7 != 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            com.google.android.gms.internal.ads.zzvh r6 = r4.mo48291e(r2, r6)
            if (r6 != 0) goto L_0x016b
            r5[r2] = r3
        L_0x0167:
            int r2 = r2 + 1
            r6 = 2
            goto L_0x0152
        L_0x016b:
            throw r3
        L_0x016c:
            r2 = 2
            r3 = 0
        L_0x016e:
            if (r3 >= r2) goto L_0x0190
            int r2 = r0.mo48317c(r3)
            boolean r6 = r4.mo48292f(r3)
            if (r6 != 0) goto L_0x0189
            com.google.android.gms.internal.ads.zzfvs r6 = r4.f31576z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r2 = 0
            goto L_0x018c
        L_0x0189:
            r2 = 0
            r5[r3] = r2
        L_0x018c:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x016e
        L_0x0190:
            r2 = 0
            com.google.android.gms.internal.ads.zzum r3 = r1.f38744j
            com.google.android.gms.internal.ads.zzwh r12 = r23.mo48322f()
            com.google.android.gms.internal.ads.zzfvn r13 = com.google.android.gms.internal.ads.zzun.m55154c(r5)
            r6 = 2
            com.google.android.gms.internal.ads.zzvt[] r14 = new com.google.android.gms.internal.ads.zzvt[r6]
            r15 = 0
        L_0x019f:
            if (r15 >= r6) goto L_0x01e8
            r6 = r5[r15]
            if (r6 == 0) goto L_0x01e0
            int[] r8 = r6.f38746b
            int r7 = r8.length
            if (r7 != 0) goto L_0x01ab
            goto L_0x01e0
        L_0x01ab:
            r11 = 1
            if (r7 != r11) goto L_0x01c6
            com.google.android.gms.internal.ads.zzvu r7 = new com.google.android.gms.internal.ads.zzvu
            com.google.android.gms.internal.ads.zzcp r6 = r6.f38745a
            r16 = 0
            r19 = r8[r16]
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r18 = 1
            goto L_0x01dd
        L_0x01c6:
            r16 = 0
            com.google.android.gms.internal.ads.zzcp r7 = r6.f38745a
            r9 = 0
            java.lang.Object r6 = r13.get(r15)
            r17 = r6
            com.google.android.gms.internal.ads.zzfvn r17 = (com.google.android.gms.internal.ads.zzfvn) r17
            r6 = r3
            r10 = r12
            r18 = 1
            r11 = r17
            com.google.android.gms.internal.ads.zzun r7 = r6.mo48271a(r7, r8, r9, r10, r11)
        L_0x01dd:
            r14[r15] = r7
            goto L_0x01e4
        L_0x01e0:
            r16 = 0
            r18 = 1
        L_0x01e4:
            int r15 = r15 + 1
            r6 = 2
            goto L_0x019f
        L_0x01e8:
            r16 = 0
            com.google.android.gms.internal.ads.zzkc[] r3 = new com.google.android.gms.internal.ads.zzkc[r6]
            r5 = 0
        L_0x01ed:
            if (r5 >= r6) goto L_0x021a
            int r7 = r0.mo48317c(r5)
            boolean r8 = r4.mo48292f(r5)
            if (r8 != 0) goto L_0x0214
            com.google.android.gms.internal.ads.zzfvs r8 = r4.f31576z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x0206
            goto L_0x0214
        L_0x0206:
            int r7 = r0.mo48317c(r5)
            r8 = -2
            if (r7 == r8) goto L_0x0211
            r7 = r14[r5]
            if (r7 == 0) goto L_0x0214
        L_0x0211:
            com.google.android.gms.internal.ads.zzkc r7 = com.google.android.gms.internal.ads.zzkc.f37732a
            goto L_0x0215
        L_0x0214:
            r7 = r2
        L_0x0215:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x021a:
            android.util.Pair r0 = android.util.Pair.create(r3, r14)
            return r0
        L_0x021f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvr.mo48312i(com.google.android.gms.internal.ads.zzvv, int[][][], int[], com.google.android.gms.internal.ads.zzsi, com.google.android.gms.internal.ads.zzcn):android.util.Pair");
    }

    /* renamed from: k */
    public final zzvf mo48313k() {
        zzvf zzvf;
        synchronized (this.f38738d) {
            zzvf = this.f38741g;
        }
        return zzvf;
    }

    /* renamed from: p */
    public final void mo48314p(zzvd zzvd) {
        boolean z;
        zzvf zzvf = new zzvf(zzvd);
        synchronized (this.f38738d) {
            z = !this.f38741g.equals(zzvf);
            this.f38741g = zzvf;
        }
        if (z) {
            if (zzvf.f38693M && this.f38739e == null) {
                zzdw.m48255e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            mo48324h();
        }
    }

    public zzvr(Context context) {
        zzum zzum = new zzum();
        zzvf d = zzvf.m55182d(context);
        this.f38738d = new Object();
        this.f38739e = context != null ? context.getApplicationContext() : null;
        this.f38744j = zzum;
        this.f38741g = d;
        this.f38743i = zzk.f37728c;
        boolean z = false;
        if (context != null && zzen.m49185x(context)) {
            z = true;
        }
        this.f38740f = z;
        if (!z && context != null && zzen.f34500a >= 32) {
            this.f38742h = zzvk.m55187a(context);
        }
        if (this.f38741g.f38693M && context == null) {
            zzdw.m48255e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
