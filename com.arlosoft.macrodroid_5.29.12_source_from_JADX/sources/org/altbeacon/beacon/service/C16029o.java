package org.altbeacon.beacon.service;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.o */
/* compiled from: ScanState */
public class C16029o implements Serializable {

    /* renamed from: d */
    private static final String f65969d = C16029o.class.getSimpleName();

    /* renamed from: f */
    public static int f65970f = 300000;

    /* renamed from: a */
    private transient C16015f f65971a;

    /* renamed from: c */
    private transient Context f65972c;
    private long mBackgroundBetweenScanPeriod;
    private boolean mBackgroundMode;
    private long mBackgroundScanPeriod;
    private Set<BeaconParser> mBeaconParsers = new HashSet();
    private C16012c mExtraBeaconDataTracker = new C16012c();
    private long mForegroundBetweenScanPeriod;
    private long mForegroundScanPeriod;
    private long mLastScanStartTimeMillis = 0;
    private Map<Region, C16016g> mRangedRegionState = new HashMap();

    public C16029o(Context context) {
        this.f65972c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:64|(2:66|67)|(2:71|72)|73|74) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(5:3|4|5|6|(5:7|8|9|10|(2:12|13)))|14|15|(2:56|57)|58|(1:60)|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0076, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008e, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00f2 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0057 A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0061 A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071 A[SYNTHETIC, Splitter:B:40:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0089 A[SYNTHETIC, Splitter:B:51:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e6 A[SYNTHETIC, Splitter:B:66:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ef A[SYNTHETIC, Splitter:B:71:0x00ef] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.C16029o m96640m(android.content.Context r10) {
        /*
            java.lang.Class<org.altbeacon.beacon.service.o> r0 = org.altbeacon.beacon.service.C16029o.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android-beacon-library-scan-state"
            java.io.FileInputStream r3 = r10.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x007c, IOException -> 0x004e, ClassNotFoundException -> 0x004c, ClassCastException -> 0x004a, all -> 0x0046 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003d, ClassNotFoundException -> 0x003b, ClassCastException -> 0x0039, all -> 0x0036 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x003d, ClassNotFoundException -> 0x003b, ClassCastException -> 0x0039, all -> 0x0036 }
            java.lang.Object r5 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x002f, ClassNotFoundException -> 0x002d, ClassCastException -> 0x002b }
            org.altbeacon.beacon.service.o r5 = (org.altbeacon.beacon.service.C16029o) r5     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x002f, ClassNotFoundException -> 0x002d, ClassCastException -> 0x002b }
            r5.f65972c = r10     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x0029, ClassNotFoundException -> 0x0027, ClassCastException -> 0x0025 }
            if (r3 == 0) goto L_0x001d
            r3.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0091
        L_0x0022:
            goto L_0x0091
        L_0x0025:
            r1 = move-exception
            goto L_0x0053
        L_0x0027:
            r1 = move-exception
            goto L_0x0053
        L_0x0029:
            r1 = move-exception
            goto L_0x0053
        L_0x002b:
            r5 = move-exception
            goto L_0x0030
        L_0x002d:
            r5 = move-exception
            goto L_0x0030
        L_0x002f:
            r5 = move-exception
        L_0x0030:
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x0053
        L_0x0034:
            r5 = r1
            goto L_0x0044
        L_0x0036:
            r10 = move-exception
            r4 = r1
            goto L_0x007a
        L_0x0039:
            r4 = move-exception
            goto L_0x003e
        L_0x003b:
            r4 = move-exception
            goto L_0x003e
        L_0x003d:
            r4 = move-exception
        L_0x003e:
            r5 = r1
            r1 = r4
            r4 = r5
            goto L_0x0053
        L_0x0042:
            r4 = r1
            r5 = r4
        L_0x0044:
            r1 = r3
            goto L_0x007e
        L_0x0046:
            r10 = move-exception
            r4 = r1
            goto L_0x00e4
        L_0x004a:
            r3 = move-exception
            goto L_0x004f
        L_0x004c:
            r3 = move-exception
            goto L_0x004f
        L_0x004e:
            r3 = move-exception
        L_0x004f:
            r4 = r1
            r5 = r4
            r1 = r3
            r3 = r5
        L_0x0053:
            boolean r6 = r1 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x0079 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r1 = f65969d     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "Serialized ScanState has wrong class. Just ignoring saved state..."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0079 }
            p097gd.C7354d.m30376a(r1, r6, r7)     // Catch:{ all -> 0x0079 }
            goto L_0x006f
        L_0x0061:
            java.lang.String r6 = f65969d     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = "Deserialization exception"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0079 }
            p097gd.C7354d.m30377b(r6, r7, r8)     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = "error: "
            android.util.Log.e(r6, r7, r1)     // Catch:{ all -> 0x0079 }
        L_0x006f:
            if (r3 == 0) goto L_0x0076
            r3.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0076
        L_0x0075:
        L_0x0076:
            if (r4 == 0) goto L_0x0091
            goto L_0x001d
        L_0x0079:
            r10 = move-exception
        L_0x007a:
            r1 = r3
            goto L_0x00e4
        L_0x007c:
            r4 = r1
            r5 = r4
        L_0x007e:
            java.lang.String r3 = f65969d     // Catch:{ all -> 0x00e3 }
            java.lang.String r6 = "Serialized ScanState does not exist.  This may be normal on first run."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e3 }
            p097gd.C7354d.m30381f(r3, r6, r7)     // Catch:{ all -> 0x00e3 }
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            if (r4 == 0) goto L_0x0091
            goto L_0x001d
        L_0x0091:
            if (r5 != 0) goto L_0x0098
            org.altbeacon.beacon.service.o r5 = new org.altbeacon.beacon.service.o     // Catch:{ all -> 0x00ea }
            r5.<init>(r10)     // Catch:{ all -> 0x00ea }
        L_0x0098:
            org.altbeacon.beacon.service.c r1 = r5.mExtraBeaconDataTracker     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x00a3
            org.altbeacon.beacon.service.c r1 = new org.altbeacon.beacon.service.c     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            r5.mExtraBeaconDataTracker = r1     // Catch:{ all -> 0x00ea }
        L_0x00a3:
            org.altbeacon.beacon.service.f r10 = org.altbeacon.beacon.service.C16015f.m96542d(r10)     // Catch:{ all -> 0x00ea }
            r5.f65971a = r10     // Catch:{ all -> 0x00ea }
            java.lang.String r10 = f65969d     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = "Scan state restore regions: monitored="
            r1.append(r3)     // Catch:{ all -> 0x00ea }
            org.altbeacon.beacon.service.f r3 = r5.mo76521i()     // Catch:{ all -> 0x00ea }
            java.util.Set r3 = r3.mo76444i()     // Catch:{ all -> 0x00ea }
            int r3 = r3.size()     // Catch:{ all -> 0x00ea }
            r1.append(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = " ranged="
            r1.append(r3)     // Catch:{ all -> 0x00ea }
            java.util.Map r3 = r5.mo76522j()     // Catch:{ all -> 0x00ea }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x00ea }
            int r3 = r3.size()     // Catch:{ all -> 0x00ea }
            r1.append(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ea }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ea }
            p097gd.C7354d.m30376a(r10, r1, r2)     // Catch:{ all -> 0x00ea }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r5
        L_0x00e3:
            r10 = move-exception
        L_0x00e4:
            if (r1 == 0) goto L_0x00ed
            r1.close()     // Catch:{ IOException -> 0x00ec }
            goto L_0x00ed
        L_0x00ea:
            r10 = move-exception
            goto L_0x00f3
        L_0x00ec:
        L_0x00ed:
            if (r4 == 0) goto L_0x00f2
            r4.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00f2:
            throw r10     // Catch:{ all -> 0x00ea }
        L_0x00f3:
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16029o.m96640m(android.content.Context):org.altbeacon.beacon.service.o");
    }

    /* renamed from: a */
    public void mo76513a(BeaconManager beaconManager) {
        this.mBeaconParsers = new HashSet(beaconManager.mo38009r());
        this.mForegroundScanPeriod = beaconManager.mo38012x();
        this.mForegroundBetweenScanPeriod = beaconManager.mo38011w();
        this.mBackgroundScanPeriod = beaconManager.mo38008q();
        this.mBackgroundBetweenScanPeriod = beaconManager.mo38006o();
        this.mBackgroundMode = beaconManager.mo38007p();
        ArrayList arrayList = new ArrayList(this.f65971a.mo76444i());
        ArrayList arrayList2 = new ArrayList(this.mRangedRegionState.keySet());
        ArrayList arrayList3 = new ArrayList(beaconManager.mo37974C());
        ArrayList arrayList4 = new ArrayList(beaconManager.mo37977F());
        String str = f65969d;
        C7354d.m30376a(str, "ranged regions: old=" + arrayList2.size() + " new=" + arrayList4.size(), new Object[0]);
        C7354d.m30376a(str, "monitored regions: old=" + arrayList.size() + " new=" + arrayList3.size(), new Object[0]);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (!arrayList2.contains(region)) {
                String str2 = f65969d;
                C7354d.m30376a(str2, "Starting ranging region: " + region, new Object[0]);
                this.mRangedRegionState.put(region, new C16016g(new C16010a(this.f65972c.getPackageName())));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region2 = (Region) it2.next();
            if (!arrayList4.contains(region2)) {
                String str3 = f65969d;
                C7354d.m30376a(str3, "Stopping ranging region: " + region2, new Object[0]);
                this.mRangedRegionState.remove(region2);
            }
        }
        String str4 = f65969d;
        C7354d.m30376a(str4, "Updated state with " + arrayList4.size() + " ranging regions and " + arrayList3.size() + " monitoring regions.", new Object[0]);
        mo76525n();
    }

    /* renamed from: b */
    public Long mo76514b() {
        return Long.valueOf(this.mBackgroundBetweenScanPeriod);
    }

    /* renamed from: c */
    public Boolean mo76515c() {
        return Boolean.valueOf(this.mBackgroundMode);
    }

    /* renamed from: d */
    public Long mo76516d() {
        return Long.valueOf(this.mBackgroundScanPeriod);
    }

    /* renamed from: e */
    public Set<BeaconParser> mo76517e() {
        return this.mBeaconParsers;
    }

    /* renamed from: f */
    public C16012c mo76518f() {
        return this.mExtraBeaconDataTracker;
    }

    /* renamed from: g */
    public Long mo76519g() {
        return Long.valueOf(this.mForegroundBetweenScanPeriod);
    }

    /* renamed from: h */
    public Long mo76520h() {
        return Long.valueOf(this.mForegroundScanPeriod);
    }

    /* renamed from: i */
    public C16015f mo76521i() {
        return this.f65971a;
    }

    /* renamed from: j */
    public Map<Region, C16016g> mo76522j() {
        return this.mRangedRegionState;
    }

    /* renamed from: k */
    public int mo76523k() {
        long j;
        long j2;
        if (mo76515c().booleanValue()) {
            j2 = mo76516d().longValue();
            j = mo76514b().longValue();
        } else {
            j2 = mo76520h().longValue();
            j = mo76519g().longValue();
        }
        long j3 = j2 + j;
        int i = f65970f;
        return j3 > ((long) i) ? (int) j3 : i;
    }

    /* renamed from: l */
    public int mo76524l() {
        long j;
        String str = f65969d;
        C7354d.m30376a(str, "ScanState says background mode for ScanJob is " + mo76515c(), new Object[0]);
        if (mo76515c().booleanValue()) {
            j = mo76516d().longValue();
        } else {
            j = mo76520h().longValue();
        }
        if (!mo76515c().booleanValue()) {
            int i = f65970f;
            if (j < ((long) i)) {
                return i;
            }
        }
        return (int) j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|(5:3|4|5|6|(3:7|8|(2:10|11)))|12|13|31|32|(1:34)|35|(1:37)|38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|(0)|(0)|50|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        if (r4 == null) goto L_0x004c;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC, Splitter:B:27:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0 A[SYNTHETIC, Splitter:B:43:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c9 A[SYNTHETIC, Splitter:B:48:0x00c9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x004c=Splitter:B:31:0x004c, B:50:0x00cc=Splitter:B:50:0x00cc} */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76525n() {
        /*
            r9 = this;
            java.lang.Class<org.altbeacon.beacon.service.o> r0 = org.altbeacon.beacon.service.C16029o.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            android.content.Context r3 = r9.f65972c     // Catch:{ IOException -> 0x002e, all -> 0x0028 }
            java.lang.String r4 = "android-beacon-library-scan-state-temp"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r2)     // Catch:{ IOException -> 0x002e, all -> 0x0028 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r4.writeObject(r9)     // Catch:{ IOException -> 0x001e }
            if (r3 == 0) goto L_0x001a
            r3.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r4.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004c
        L_0x001e:
            r1 = move-exception
            goto L_0x0032
        L_0x0020:
            r2 = move-exception
            r4 = r1
            goto L_0x002b
        L_0x0023:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x0032
        L_0x0028:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L_0x002b:
            r1 = r2
            goto L_0x00be
        L_0x002e:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
        L_0x0032:
            java.lang.String r5 = f65969d     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = "Error while saving scan status to file: "
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00bd }
            r7[r2] = r1     // Catch:{ all -> 0x00bd }
            p097gd.C7354d.m30377b(r5, r6, r7)     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r4 == 0) goto L_0x004c
            goto L_0x001a
        L_0x004c:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c4 }
            android.content.Context r3 = r9.f65972c     // Catch:{ all -> 0x00c4 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "android-beacon-library-scan-state"
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00c4 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00c4 }
            android.content.Context r4 = r9.f65972c     // Catch:{ all -> 0x00c4 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "android-beacon-library-scan-state-temp"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = f65969d     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r5.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = "Temp file is "
            r5.append(r6)     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ all -> 0x00c4 }
            r5.append(r6)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c4 }
            p097gd.C7354d.m30376a(r4, r5, r6)     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r5.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = "Perm file is "
            r5.append(r6)     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ all -> 0x00c4 }
            r5.append(r6)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c4 }
            p097gd.C7354d.m30376a(r4, r5, r6)     // Catch:{ all -> 0x00c4 }
            boolean r5 = r1.delete()     // Catch:{ all -> 0x00c4 }
            if (r5 != 0) goto L_0x00a9
            java.lang.String r5 = "Error while saving scan status to file: Cannot delete existing file."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c4 }
            p097gd.C7354d.m30377b(r4, r5, r6)     // Catch:{ all -> 0x00c4 }
        L_0x00a9:
            boolean r1 = r3.renameTo(r1)     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = "Error while saving scan status to file: Cannot rename temp file."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c4 }
            p097gd.C7354d.m30377b(r4, r1, r2)     // Catch:{ all -> 0x00c4 }
        L_0x00b6:
            org.altbeacon.beacon.service.f r1 = r9.f65971a     // Catch:{ all -> 0x00c4 }
            r1.mo76449p()     // Catch:{ all -> 0x00c4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00bd:
            r1 = move-exception
        L_0x00be:
            if (r3 == 0) goto L_0x00c7
            r3.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00c7
        L_0x00c4:
            r1 = move-exception
            goto L_0x00cd
        L_0x00c6:
        L_0x00c7:
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00cd:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.C16029o.mo76525n():void");
    }

    /* renamed from: p */
    public void mo76526p(long j) {
        this.mLastScanStartTimeMillis = j;
    }
}
