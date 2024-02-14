package org.altbeacon.beacon.service;

import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.f */
/* compiled from: MonitoringStatus */
public class C16015f {

    /* renamed from: d */
    private static volatile C16015f f65924d = null;

    /* renamed from: e */
    private static final String f65925e = "f";

    /* renamed from: f */
    private static final Object f65926f = new Object();

    /* renamed from: a */
    private Map<Region, C16019j> f65927a;

    /* renamed from: b */
    private Context f65928b;

    /* renamed from: c */
    private boolean f65929c = true;

    public C16015f(Context context) {
        this.f65928b = context;
    }

    /* renamed from: b */
    private C16019j m96541b(Region region, C16010a aVar) {
        if (m96543f().containsKey(region)) {
            Iterator<Region> it = m96543f().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Region next = it.next();
                if (next.equals(region)) {
                    if (next.mo38038f(region)) {
                        return m96543f().get(next);
                    }
                    String str = f65925e;
                    C7354d.m30376a(str, "Replacing region with unique identifier " + region.mo38036e(), new Object[0]);
                    C7354d.m30376a(str, "Old definition: " + next, new Object[0]);
                    C7354d.m30376a(str, "New definition: " + region, new Object[0]);
                    C7354d.m30376a(str, "clearing state", new Object[0]);
                    m96543f().remove(region);
                }
            }
        }
        C16019j jVar = new C16019j(aVar);
        m96543f().put(region, jVar);
        return jVar;
    }

    /* renamed from: d */
    public static C16015f m96542d(Context context) {
        C16015f fVar = f65924d;
        if (fVar == null) {
            synchronized (f65926f) {
                fVar = f65924d;
                if (fVar == null) {
                    fVar = new C16015f(context.getApplicationContext());
                    f65924d = fVar;
                }
            }
        }
        return fVar;
    }

    /* renamed from: f */
    private Map<Region, C16019j> m96543f() {
        if (this.f65927a == null) {
            m96545o();
        }
        return this.f65927a;
    }

    /* renamed from: k */
    private List<Region> m96544k(Beacon beacon) {
        ArrayList arrayList = new ArrayList();
        for (Region next : mo76444i()) {
            if (next.mo38039g(beacon)) {
                arrayList.add(next);
            } else {
                C7354d.m30376a(f65925e, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    private void m96545o() {
        long currentTimeMillis = System.currentTimeMillis() - mo76441e();
        this.f65927a = new ConcurrentHashMap();
        if (!this.f65929c) {
            C7354d.m30376a(f65925e, "Not restoring monitoring state because persistence is disabled", new Object[0]);
        } else if (currentTimeMillis > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            String str = f65925e;
            C7354d.m30376a(str, "Not restoring monitoring state because it was recorded too many milliseconds ago: " + currentTimeMillis, new Object[0]);
        } else {
            mo76448n();
            C7354d.m30376a(f65925e, "Done restoring monitoring status", new Object[0]);
        }
    }

    /* renamed from: a */
    public C16019j mo76439a(Region region) {
        return m96541b(region, new C16010a((String) null));
    }

    /* renamed from: c */
    public synchronized void mo76440c(Region region, C16010a aVar) {
        m96541b(region, aVar);
        mo76449p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo76441e() {
        return this.f65928b.getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").lastModified();
    }

    /* renamed from: g */
    public synchronized boolean mo76442g() {
        for (Region r : mo76444i()) {
            C16019j r2 = mo76451r(r);
            if (r2 != null && r2.mo76473b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo76443h() {
        return this.f65929c;
    }

    /* renamed from: i */
    public synchronized Set<Region> mo76444i() {
        return m96543f().keySet();
    }

    /* renamed from: j */
    public synchronized int mo76445j() {
        return mo76444i().size();
    }

    /* renamed from: l */
    public void mo76446l(Region region) {
        m96543f().remove(region);
    }

    /* renamed from: m */
    public synchronized void mo76447m(Region region) {
        mo76446l(region);
        mo76449p();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4 A[Catch:{ all -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[SYNTHETIC, Splitter:B:38:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2 A[SYNTHETIC, Splitter:B:45:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9 A[SYNTHETIC, Splitter:B:49:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76448n() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.f65928b     // Catch:{ IOException -> 0x00c2, ClassNotFoundException -> 0x00c0, ClassCastException -> 0x00be, all -> 0x00b9 }
            java.lang.String r3 = "org.altbeacon.beacon.service.monitoring_status_state"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ IOException -> 0x00c2, ClassNotFoundException -> 0x00c0, ClassCastException -> 0x00be, all -> 0x00b9 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00b4, ClassNotFoundException -> 0x00b2, ClassCastException -> 0x00b0, all -> 0x00ad }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00b4, ClassNotFoundException -> 0x00b2, ClassCastException -> 0x00b0, all -> 0x00ad }
            java.lang.Object r0 = r3.readObject()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r4 = f65925e     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r5.<init>()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = "Restored region monitoring state for "
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            int r6 = r0.size()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = " regions."
            r5.append(r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            p097gd.C7354d.m30376a(r4, r5, r6)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Set r4 = r0.keySet()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
        L_0x003e:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.Region r5 = (org.altbeacon.beacon.Region) r5     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r6 = f65925e     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.<init>()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = "Region  "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = " uniqueId: "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = r5.mo38036e()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r8 = " state: "
            r7.append(r8)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r7.append(r5)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            p097gd.C7354d.m30376a(r6, r5, r7)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            goto L_0x003e
        L_0x007b:
            java.util.Collection r4 = r0.values()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
        L_0x0083:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            org.altbeacon.beacon.service.j r5 = (org.altbeacon.beacon.service.C16019j) r5     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            boolean r6 = r5.mo76473b()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r6 == 0) goto L_0x0083
            r5.mo76474c()     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            goto L_0x0083
        L_0x0099:
            java.util.Map<org.altbeacon.beacon.Region, org.altbeacon.beacon.service.j> r4 = r10.f65927a     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            r4.putAll(r0)     // Catch:{ IOException -> 0x00ab, ClassNotFoundException -> 0x00a9, ClassCastException -> 0x00a7 }
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            r3.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ee
        L_0x00a7:
            r0 = move-exception
            goto L_0x00c6
        L_0x00a9:
            r0 = move-exception
            goto L_0x00c6
        L_0x00ab:
            r0 = move-exception
            goto L_0x00c6
        L_0x00ad:
            r1 = move-exception
            r3 = r0
            goto L_0x00bc
        L_0x00b0:
            r3 = move-exception
            goto L_0x00b5
        L_0x00b2:
            r3 = move-exception
            goto L_0x00b5
        L_0x00b4:
            r3 = move-exception
        L_0x00b5:
            r9 = r3
            r3 = r0
            r0 = r9
            goto L_0x00c6
        L_0x00b9:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x00bc:
            r0 = r1
            goto L_0x00f0
        L_0x00be:
            r2 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r2 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r2 = move-exception
        L_0x00c3:
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x00c6:
            boolean r4 = r0 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x00d4
            java.lang.String r0 = f65925e     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "Serialized Monitoring State has wrong class. Just ignoring saved state..."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ef }
            p097gd.C7354d.m30376a(r0, r4, r1)     // Catch:{ all -> 0x00ef }
            goto L_0x00e4
        L_0x00d4:
            java.lang.String r4 = f65925e     // Catch:{ all -> 0x00ef }
            java.lang.String r5 = "Deserialization exception, message: %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ef }
            r6[r1] = r0     // Catch:{ all -> 0x00ef }
            p097gd.C7354d.m30377b(r4, r5, r6)     // Catch:{ all -> 0x00ef }
        L_0x00e4:
            if (r2 == 0) goto L_0x00eb
            r2.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00eb
        L_0x00ea:
        L_0x00eb:
            if (r3 == 0) goto L_0x00ee
            goto L_0x00a3
        L_0x00ee:
            return
        L_0x00ef:
            r0 = move-exception
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            r2.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            if (r3 == 0) goto L_0x00fc
            r3.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16015f.mo76448n():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|(8:9|10|11|12|(2:15|13)|50|16|(2:18|19))|20|21|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[SYNTHETIC, Splitter:B:35:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[SYNTHETIC, Splitter:B:42:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3 A[SYNTHETIC, Splitter:B:46:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76449p() {
        /*
            r9 = this;
            boolean r0 = r9.f65929c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = f65925e
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "saveMonitoringStatusIfOn()"
            p097gd.C7354d.m30376a(r0, r3, r2)
            java.util.Map r2 = r9.m96543f()
            int r2 = r2.size()
            r3 = 50
            java.lang.String r4 = "org.altbeacon.beacon.service.monitoring_status_state"
            if (r2 <= r3) goto L_0x002b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Too many regions being monitored.  Will not persist region state"
            p097gd.C7354d.m30381f(r0, r2, r1)
            android.content.Context r0 = r9.f65928b
            r0.deleteFile(r4)
            goto L_0x0098
        L_0x002b:
            r0 = 0
            android.content.Context r2 = r9.f65928b     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.FileOutputStream r2 = r2.openFileOutput(r4, r1)     // Catch:{ IOException -> 0x0079, all -> 0x0074 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r3.<init>(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            java.util.Map r0 = r9.m96543f()     // Catch:{ IOException -> 0x006a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x006a }
            r4.<init>()     // Catch:{ IOException -> 0x006a }
            java.util.Set r5 = r0.keySet()     // Catch:{ IOException -> 0x006a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x006a }
        L_0x0048:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x006a }
            if (r6 == 0) goto L_0x005e
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x006a }
            org.altbeacon.beacon.Region r6 = (org.altbeacon.beacon.Region) r6     // Catch:{ IOException -> 0x006a }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ IOException -> 0x006a }
            org.altbeacon.beacon.service.j r7 = (org.altbeacon.beacon.service.C16019j) r7     // Catch:{ IOException -> 0x006a }
            r4.put(r6, r7)     // Catch:{ IOException -> 0x006a }
            goto L_0x0048
        L_0x005e:
            r3.writeObject(r4)     // Catch:{ IOException -> 0x006a }
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r3.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x0098
        L_0x006a:
            r0 = move-exception
            goto L_0x007d
        L_0x006c:
            r1 = move-exception
            r3 = r0
            goto L_0x0077
        L_0x006f:
            r3 = move-exception
            r8 = r3
            r3 = r0
            r0 = r8
            goto L_0x007d
        L_0x0074:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x0077:
            r0 = r1
            goto L_0x009a
        L_0x0079:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
        L_0x007d:
            java.lang.String r4 = f65925e     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "Error while saving monitored region states to file "
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0099 }
            r6[r1] = r0     // Catch:{ all -> 0x0099 }
            p097gd.C7354d.m30377b(r4, r5, r6)     // Catch:{ all -> 0x0099 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0099 }
            r0.printStackTrace(r1)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0095
            r2.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r3 == 0) goto L_0x0098
            goto L_0x0066
        L_0x0098:
            return
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            if (r2 == 0) goto L_0x00a1
            r2.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16015f.mo76449p():void");
    }

    /* renamed from: q */
    public synchronized void mo76450q() {
        if (!this.f65929c) {
            this.f65929c = true;
            mo76449p();
        }
    }

    /* renamed from: r */
    public synchronized C16019j mo76451r(Region region) {
        return m96543f().get(region);
    }

    /* renamed from: s */
    public synchronized void mo76452s() {
        this.f65928b.deleteFile("org.altbeacon.beacon.service.monitoring_status_state");
        this.f65929c = false;
    }

    /* renamed from: t */
    public void mo76453t(Region region, Integer num) {
        C16019j jVar = m96543f().get(region);
        if (jVar == null) {
            jVar = mo76439a(region);
        }
        if (num != null) {
            if (num.intValue() == 0) {
                jVar.mo76475d();
            }
            if (num.intValue() == 1) {
                jVar.mo76474c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo76454u(long j) {
        this.f65928b.getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").setLastModified(j);
    }

    /* renamed from: v */
    public synchronized void mo76455v(Beacon beacon) {
        boolean z = false;
        for (Region next : m96544k(beacon)) {
            C16019j jVar = m96543f().get(next);
            if (jVar != null && jVar.mo76474c()) {
                z = true;
                jVar.mo76472a().mo76432a(this.f65928b, "monitoringData", new C16014e(jVar.mo76473b(), next).mo76438d());
            }
        }
        if (z) {
            mo76449p();
        } else {
            mo76454u(System.currentTimeMillis());
        }
    }

    /* renamed from: w */
    public synchronized void mo76456w() {
        boolean z = false;
        for (Region next : mo76444i()) {
            C16019j r = mo76451r(next);
            if (r.mo76476e()) {
                C7354d.m30376a(f65925e, "found a monitor that expired: %s", next);
                r.mo76472a().mo76432a(this.f65928b, "monitoringData", new C16014e(r.mo76473b(), next).mo76438d());
                z = true;
            }
        }
        if (z) {
            mo76449p();
        } else {
            mo76454u(System.currentTimeMillis());
        }
    }
}
