package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzry {

    /* renamed from: a */
    public static final Uri f45080a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f45081b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f45082c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f45083d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f45084e = new AtomicBoolean();

    /* renamed from: f */
    static HashMap f45085f;

    /* renamed from: g */
    static final HashMap f45086g = new HashMap();

    /* renamed from: h */
    static final HashMap f45087h = new HashMap();

    /* renamed from: i */
    static final HashMap f45088i = new HashMap();

    /* renamed from: j */
    static final HashMap f45089j = new HashMap();

    /* renamed from: k */
    private static Object f45090k;

    /* renamed from: l */
    private static boolean f45091l;

    /* renamed from: m */
    static final String[] f45092m = new String[0];

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public static boolean m62972b(android.content.ContentResolver r16, java.lang.String r17, boolean r18) {
        /*
            java.lang.Class<com.google.android.gms.internal.nearby.zzry> r1 = com.google.android.gms.internal.nearby.zzry.class
            monitor-enter(r1)
            m62973c(r16)     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = f45090k     // Catch:{ all -> 0x00e5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            java.util.HashMap r2 = f45086g
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            boolean r5 = r2.containsKey(r4)     // Catch:{ all -> 0x00e2 }
            r6 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x00e2 }
            if (r4 != 0) goto L_0x001e
            r4 = r3
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            goto L_0x0022
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            r4 = r6
        L_0x0022:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x002b
            boolean r0 = r4.booleanValue()
            return r0
        L_0x002b:
            java.lang.String r5 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            m62973c(r16)     // Catch:{ all -> 0x00df }
            java.lang.Object r7 = f45090k     // Catch:{ all -> 0x00df }
            java.util.HashMap r8 = f45085f     // Catch:{ all -> 0x00df }
            boolean r8 = r8.containsKey(r5)     // Catch:{ all -> 0x00df }
            r9 = 1
            if (r8 == 0) goto L_0x004a
            java.util.HashMap r7 = f45085f     // Catch:{ all -> 0x00df }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x00df }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00df }
            if (r5 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x00df }
            goto L_0x0082
        L_0x004a:
            java.lang.String[] r8 = f45092m     // Catch:{ all -> 0x00df }
            int r8 = r8.length     // Catch:{ all -> 0x00df }
            monitor-exit(r1)     // Catch:{ all -> 0x00df }
            android.net.Uri r11 = f45080a
            java.lang.String[] r14 = new java.lang.String[]{r5}
            r12 = 0
            r13 = 0
            r15 = 0
            r10 = r16
            android.database.Cursor r8 = r10.query(r11, r12, r13, r14, r15)
            if (r8 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            boolean r10 = r8.moveToFirst()     // Catch:{ all -> 0x00da }
            if (r10 != 0) goto L_0x006d
            m62974d(r7, r5, r6)     // Catch:{ all -> 0x00da }
        L_0x0069:
            r8.close()
            goto L_0x0082
        L_0x006d:
            java.lang.String r10 = r8.getString(r9)     // Catch:{ all -> 0x00da }
            if (r10 == 0) goto L_0x007a
            boolean r11 = r10.equals(r6)     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x007a
            r10 = r6
        L_0x007a:
            m62974d(r7, r5, r10)     // Catch:{ all -> 0x00da }
            if (r10 != 0) goto L_0x0080
            goto L_0x0069
        L_0x0080:
            r6 = r10
            goto L_0x0069
        L_0x0082:
            if (r6 == 0) goto L_0x00c5
            java.lang.String r5 = ""
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x008d
            goto L_0x00c5
        L_0x008d:
            java.util.regex.Pattern r5 = f45082c
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x009a
            goto L_0x00c6
        L_0x009a:
            java.util.regex.Pattern r3 = f45083d
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x00aa
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r9 = 0
            goto L_0x00c6
        L_0x00aa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "attempt to read gservices key gms:nearby:requires_gms_check (value \""
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = "\") as boolean"
            r3.append(r5)
            java.lang.String r5 = "Gservices"
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
        L_0x00c5:
            r3 = r4
        L_0x00c6:
            java.lang.String r4 = "gms:nearby:requires_gms_check"
            monitor-enter(r1)
            java.lang.Object r5 = f45090k     // Catch:{ all -> 0x00d7 }
            if (r0 != r5) goto L_0x00d5
            r2.put(r4, r3)     // Catch:{ all -> 0x00d7 }
            java.util.HashMap r0 = f45085f     // Catch:{ all -> 0x00d7 }
            r0.remove(r4)     // Catch:{ all -> 0x00d7 }
        L_0x00d5:
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return r9
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            throw r0
        L_0x00da:
            r0 = move-exception
            r8.close()
            throw r0
        L_0x00df:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00df }
            throw r0
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzry.m62972b(android.content.ContentResolver, java.lang.String, boolean):boolean");
    }

    /* renamed from: c */
    private static void m62973c(ContentResolver contentResolver) {
        if (f45085f == null) {
            f45084e.set(false);
            f45085f = new HashMap();
            f45090k = new Object();
            f45091l = false;
            contentResolver.registerContentObserver(f45080a, true, new zzrx((Handler) null));
        } else if (f45084e.getAndSet(false)) {
            f45085f.clear();
            f45086g.clear();
            f45087h.clear();
            f45088i.clear();
            f45089j.clear();
            f45090k = new Object();
            f45091l = false;
        }
    }

    /* renamed from: d */
    private static void m62974d(Object obj, String str, String str2) {
        synchronized (zzry.class) {
            if (obj == f45090k) {
                f45085f.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
