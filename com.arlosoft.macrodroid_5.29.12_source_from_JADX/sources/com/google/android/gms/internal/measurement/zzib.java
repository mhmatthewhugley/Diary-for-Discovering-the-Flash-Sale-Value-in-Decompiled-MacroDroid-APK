package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class zzib {

    /* renamed from: g */
    private static final Object f41506g = new Object();

    /* renamed from: h */
    private static volatile zzhz f41507h;

    /* renamed from: i */
    private static final AtomicReference f41508i = new AtomicReference();

    /* renamed from: j */
    private static final zzid f41509j = new zzid(zzht.f41496a, (byte[]) null);

    /* renamed from: k */
    private static final AtomicInteger f41510k = new AtomicInteger();

    /* renamed from: l */
    public static final /* synthetic */ int f41511l = 0;

    /* renamed from: a */
    final zzhy f41512a;

    /* renamed from: b */
    final String f41513b;

    /* renamed from: c */
    private final Object f41514c;

    /* renamed from: d */
    private volatile int f41515d = -1;

    /* renamed from: e */
    private volatile Object f41516e;

    /* renamed from: f */
    private final boolean f41517f;

    /* synthetic */ zzib(zzhy zzhy, String str, Object obj, boolean z, zzia zzia) {
        if (zzhy.f41498b != null) {
            this.f41512a = zzhy;
            this.f41513b = str;
            this.f41514c = obj;
            this.f41517f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m60293d() {
        f41510k.incrementAndGet();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m60294e(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzhz r0 = f41507h
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f41506g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzhz r1 = f41507h     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzhz r1 = f41507h     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo51258a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.measurement.zzhf.m60263d()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzic.m60299b()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhn.m60272d()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhs r1 = new com.google.android.gms.internal.measurement.zzhs     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzii r1 = com.google.android.gms.internal.measurement.zzim.m60309a(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.zzhc r2 = new com.google.android.gms.internal.measurement.zzhc     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f41507h = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f41510k     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzib.m60294e(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo51276a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = r2.mo51268t(mo51284c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo51283b() {
        /*
            r6 = this;
            boolean r0 = r6.f41517f
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.f41513b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f41510k
            int r0 = r0.get()
            int r1 = r6.f41515d
            if (r1 >= r0) goto L_0x00d6
            monitor-enter(r6)
            int r1 = r6.f41515d     // Catch:{ all -> 0x00d3 }
            if (r1 >= r0) goto L_0x00d1
            com.google.android.gms.internal.measurement.zzhz r1 = f41507h     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00cb
            com.google.android.gms.internal.measurement.zzhy r2 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            boolean r3 = r2.f41502f     // Catch:{ all -> 0x00d3 }
            android.net.Uri r2 = r2.f41498b     // Catch:{ all -> 0x00d3 }
            r3 = 0
            if (r2 == 0) goto L_0x0050
            android.content.Context r2 = r1.mo51258a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f41498b     // Catch:{ all -> 0x00d3 }
            boolean r2 = com.google.android.gms.internal.measurement.zzhp.m60277a(r2, r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x004e
            com.google.android.gms.internal.measurement.zzhy r2 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f41504h     // Catch:{ all -> 0x00d3 }
            android.content.Context r2 = r1.mo51258a()     // Catch:{ all -> 0x00d3 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f41498b     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhr r5 = com.google.android.gms.internal.measurement.zzhr.f41494a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhf r2 = com.google.android.gms.internal.measurement.zzhf.m60262a(r2, r4, r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x005e
        L_0x004e:
            r2 = r3
            goto L_0x005e
        L_0x0050:
            android.content.Context r2 = r1.mo51258a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r4.f41497a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhr r4 = com.google.android.gms.internal.measurement.zzhr.f41494a     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzic r2 = com.google.android.gms.internal.measurement.zzic.m60298a(r2, r3, r4)     // Catch:{ all -> 0x00d3 }
        L_0x005e:
            if (r2 == 0) goto L_0x006f
            java.lang.String r4 = r6.mo51284c()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r2.mo51268t(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r6.mo51276a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.measurement.zzhy r2 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f41501e     // Catch:{ all -> 0x00d3 }
            if (r2 != 0) goto L_0x0096
            android.content.Context r2 = r1.mo51258a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhn r2 = com.google.android.gms.internal.measurement.zzhn.m60271a(r2)     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.f41501e     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0089
            r4 = r3
            goto L_0x008b
        L_0x0089:
            java.lang.String r4 = r6.f41513b     // Catch:{ all -> 0x00d3 }
        L_0x008b:
            java.lang.String r2 = r2.mo51268t(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r6.mo51276a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r6.f41514c     // Catch:{ all -> 0x00d3 }
        L_0x009b:
            com.google.android.gms.internal.measurement.zzii r1 = r1.mo51259b()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzig r1 = (com.google.android.gms.internal.measurement.zzig) r1     // Catch:{ all -> 0x00d3 }
            boolean r4 = r1.mo51286b()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r1 = r1.mo51285a()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhh r1 = (com.google.android.gms.internal.measurement.zzhh) r1     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.internal.measurement.zzhy r2 = r6.f41512a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r2.f41498b     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = r2.f41500d     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = r6.f41513b     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.mo51270a(r4, r3, r2, r5)     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r2 = r6.f41514c     // Catch:{ all -> 0x00d3 }
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r2 = r6.mo51276a(r1)     // Catch:{ all -> 0x00d3 }
        L_0x00c6:
            r6.f41516e = r2     // Catch:{ all -> 0x00d3 }
            r6.f41515d = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00d1
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            throw r0
        L_0x00d6:
            java.lang.Object r0 = r6.f41516e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzib.mo51283b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo51284c() {
        String str = this.f41512a.f41500d;
        return this.f41513b;
    }
}
