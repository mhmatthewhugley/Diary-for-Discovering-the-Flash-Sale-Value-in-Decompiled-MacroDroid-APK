package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.play.core.internal.zzau;
import com.google.android.play.core.internal.zzaw;
import com.google.android.play.core.internal.zzay;
import com.google.android.play.core.internal.zzbt;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzr;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class SplitCompat {

    /* renamed from: e */
    private static final AtomicReference f51757e = new AtomicReference((Object) null);

    /* renamed from: f */
    public static final /* synthetic */ int f51758f = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zze f51759a;

    /* renamed from: b */
    private final zzbe f51760b;
    @GuardedBy("emulatedSplits")

    /* renamed from: c */
    private final Set f51761c = new HashSet();

    /* renamed from: d */
    private final zza f51762d;

    private SplitCompat(Context context) {
        try {
            zze zze = new zze(context);
            this.f51759a = zze;
            this.f51762d = new zza(zze);
            this.f51760b = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbt("Failed to initialize FileStorage", e);
        }
    }

    /* renamed from: a */
    public static boolean m71055a(@NonNull Context context) {
        return m71062h(context, false);
    }

    /* renamed from: d */
    public static boolean m71058d(Context context) {
        return m71062h(context, true);
    }

    /* renamed from: e */
    public static boolean m71059e() {
        return f51757e.get() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m71060f(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zze.m71069l(this.f51759a.mo59947g((String) it.next()));
        }
        this.f51760b.mo60008b();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0190 */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018d A[SYNTHETIC, Splitter:B:76:0x018d] */
    @androidx.annotation.RequiresApi(21)
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m71061g(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            com.google.android.play.core.splitcompat.zze r0 = r8.f51759a     // Catch:{ all -> 0x0216 }
            r0.mo59951k()     // Catch:{ all -> 0x0216 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.zzd.m71068a()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzp r1 = new com.google.android.play.core.splitcompat.zzp     // Catch:{ all -> 0x0216 }
            r1.<init>(r8)     // Catch:{ all -> 0x0216 }
            r0.execute(r1)     // Catch:{ all -> 0x0216 }
        L_0x0015:
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0216 }
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0204 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0204 }
            java.lang.String[] r2 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x0204 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0204 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x0204 }
            goto L_0x0030
        L_0x002c:
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ NameNotFoundException -> 0x0204 }
        L_0x0030:
            com.google.android.play.core.splitcompat.zze r0 = r8.f51759a     // Catch:{ all -> 0x0216 }
            java.util.Set r0 = r0.mo59950j()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitinstall.zzbe r1 = r8.f51760b     // Catch:{ all -> 0x0216 }
            java.util.Set r1 = r1.mo60007a()     // Catch:{ all -> 0x0216 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0216 }
            r3.<init>()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x0045:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0216 }
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch:{ all -> 0x0216 }
            java.lang.String r5 = r5.mo59936b()     // Catch:{ all -> 0x0216 }
            boolean r6 = r2.contains(r5)     // Catch:{ all -> 0x0216 }
            if (r6 != 0) goto L_0x0065
            java.lang.String r6 = com.google.android.play.core.splitinstall.zzs.m71223a(r5)     // Catch:{ all -> 0x0216 }
            boolean r6 = r1.contains(r6)     // Catch:{ all -> 0x0216 }
            if (r6 == 0) goto L_0x0045
        L_0x0065:
            r3.add(r5)     // Catch:{ all -> 0x0216 }
            r4.remove()     // Catch:{ all -> 0x0216 }
            goto L_0x0045
        L_0x006c:
            if (r10 == 0) goto L_0x0072
            r8.m71060f(r3)     // Catch:{ all -> 0x0216 }
            goto L_0x0084
        L_0x0072:
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x0216 }
            if (r1 != 0) goto L_0x0084
            java.util.concurrent.Executor r1 = com.google.android.play.core.splitcompat.zzd.m71068a()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzq r4 = new com.google.android.play.core.splitcompat.zzq     // Catch:{ all -> 0x0216 }
            r4.<init>(r8, r3)     // Catch:{ all -> 0x0216 }
            r1.execute(r4)     // Catch:{ all -> 0x0216 }
        L_0x0084:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0216 }
            r1.<init>()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x008d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0216 }
            if (r4 == 0) goto L_0x00a7
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r4 = (com.google.android.play.core.splitcompat.zzs) r4     // Catch:{ all -> 0x0216 }
            java.lang.String r4 = r4.mo59936b()     // Catch:{ all -> 0x0216 }
            boolean r5 = com.google.android.play.core.splitinstall.zzs.m71225c(r4)     // Catch:{ all -> 0x0216 }
            if (r5 != 0) goto L_0x008d
            r1.add(r4)     // Catch:{ all -> 0x0216 }
            goto L_0x008d
        L_0x00a7:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0216 }
        L_0x00ab:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0216 }
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0216 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0216 }
            boolean r4 = com.google.android.play.core.splitinstall.zzs.m71225c(r3)     // Catch:{ all -> 0x0216 }
            if (r4 != 0) goto L_0x00ab
            r1.add(r3)     // Catch:{ all -> 0x0216 }
            goto L_0x00ab
        L_0x00c1:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0216 }
            int r3 = r0.size()     // Catch:{ all -> 0x0216 }
            r2.<init>(r3)     // Catch:{ all -> 0x0216 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x00ce:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0216 }
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r3 = (com.google.android.play.core.splitcompat.zzs) r3     // Catch:{ all -> 0x0216 }
            java.lang.String r4 = r3.mo59936b()     // Catch:{ all -> 0x0216 }
            boolean r4 = com.google.android.play.core.splitinstall.zzs.m71224b(r4)     // Catch:{ all -> 0x0216 }
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = r3.mo59936b()     // Catch:{ all -> 0x0216 }
            java.lang.String r4 = com.google.android.play.core.splitinstall.zzs.m71223a(r4)     // Catch:{ all -> 0x0216 }
            boolean r4 = r1.contains(r4)     // Catch:{ all -> 0x0216 }
            if (r4 == 0) goto L_0x00ce
        L_0x00f2:
            r2.add(r3)     // Catch:{ all -> 0x0216 }
            goto L_0x00ce
        L_0x00f6:
            com.google.android.play.core.splitcompat.zzm r0 = new com.google.android.play.core.splitcompat.zzm     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zze r1 = r8.f51759a     // Catch:{ all -> 0x0216 }
            r0.<init>(r1)     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.internal.zzaz r1 = com.google.android.play.core.internal.zzba.m70844a()     // Catch:{ all -> 0x0216 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x0216 }
            if (r10 == 0) goto L_0x010f
            java.util.Set r0 = r0.mo59957c()     // Catch:{ all -> 0x0216 }
            r1.mo59831b(r3, r0)     // Catch:{ all -> 0x0216 }
            goto L_0x012d
        L_0x010f:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0216 }
        L_0x0113:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0216 }
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch:{ all -> 0x0216 }
            java.util.Set r5 = r0.mo59956b(r5)     // Catch:{ all -> 0x0216 }
            if (r5 != 0) goto L_0x0129
            r4.remove()     // Catch:{ all -> 0x0216 }
            goto L_0x0113
        L_0x0129:
            r1.mo59831b(r3, r5)     // Catch:{ all -> 0x0216 }
            goto L_0x0113
        L_0x012d:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0216 }
            r0.<init>()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0216 }
        L_0x0136:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0216 }
            if (r5 == 0) goto L_0x0191
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r5 = (com.google.android.play.core.splitcompat.zzs) r5     // Catch:{ all -> 0x0216 }
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0189 }
            java.io.File r7 = r5.mo59935a()     // Catch:{ IOException -> 0x0189 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0189 }
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch:{ IOException -> 0x0187 }
            r6.close()     // Catch:{ IOException -> 0x0187 }
            if (r7 == 0) goto L_0x017f
            com.google.android.play.core.splitcompat.zze r6 = r8.f51759a     // Catch:{ all -> 0x0216 }
            java.lang.String r7 = r5.mo59936b()     // Catch:{ all -> 0x0216 }
            java.io.File r6 = r6.mo59941a(r7)     // Catch:{ all -> 0x0216 }
            java.io.File r7 = r5.mo59935a()     // Catch:{ all -> 0x0216 }
            boolean r6 = r1.mo59830a(r3, r6, r7, r10)     // Catch:{ all -> 0x0216 }
            if (r6 == 0) goto L_0x016b
            goto L_0x017f
        L_0x016b:
            java.lang.String r6 = "SplitCompat"
            java.lang.String r7 = "split was not installed "
            java.io.File r5 = r5.mo59935a()     // Catch:{ all -> 0x0216 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0216 }
            java.lang.String r5 = r7.concat(r5)     // Catch:{ all -> 0x0216 }
            android.util.Log.w(r6, r5)     // Catch:{ all -> 0x0216 }
            goto L_0x0136
        L_0x017f:
            java.io.File r5 = r5.mo59935a()     // Catch:{ all -> 0x0216 }
            r0.add(r5)     // Catch:{ all -> 0x0216 }
            goto L_0x0136
        L_0x0187:
            r9 = move-exception
            goto L_0x018b
        L_0x0189:
            r9 = move-exception
            r6 = 0
        L_0x018b:
            if (r6 == 0) goto L_0x0190
            r6.close()     // Catch:{ IOException -> 0x0190 }
        L_0x0190:
            throw r9     // Catch:{ all -> 0x0216 }
        L_0x0191:
            com.google.android.play.core.splitcompat.zza r10 = r8.f51762d     // Catch:{ all -> 0x0216 }
            r10.mo59934a(r9, r0)     // Catch:{ all -> 0x0216 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0216 }
            r9.<init>()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0216 }
        L_0x019f:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x01f6
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0216 }
            com.google.android.play.core.splitcompat.zzs r1 = (com.google.android.play.core.splitcompat.zzs) r1     // Catch:{ all -> 0x0216 }
            java.io.File r2 = r1.mo59935a()     // Catch:{ all -> 0x0216 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x0216 }
            if (r2 == 0) goto L_0x01d9
            java.lang.String r2 = r1.mo59936b()     // Catch:{ all -> 0x0216 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0216 }
            int r4 = r2.length()     // Catch:{ all -> 0x0216 }
            int r4 = r4 + 30
            r3.<init>(r4)     // Catch:{ all -> 0x0216 }
            java.lang.String r4 = "Split '"
            r3.append(r4)     // Catch:{ all -> 0x0216 }
            r3.append(r2)     // Catch:{ all -> 0x0216 }
            java.lang.String r2 = "' installation emulated"
            r3.append(r2)     // Catch:{ all -> 0x0216 }
            java.lang.String r1 = r1.mo59936b()     // Catch:{ all -> 0x0216 }
            r9.add(r1)     // Catch:{ all -> 0x0216 }
            goto L_0x019f
        L_0x01d9:
            java.lang.String r1 = r1.mo59936b()     // Catch:{ all -> 0x0216 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0216 }
            int r3 = r1.length()     // Catch:{ all -> 0x0216 }
            int r3 = r3 + 35
            r2.<init>(r3)     // Catch:{ all -> 0x0216 }
            java.lang.String r3 = "Split '"
            r2.append(r3)     // Catch:{ all -> 0x0216 }
            r2.append(r1)     // Catch:{ all -> 0x0216 }
            java.lang.String r1 = "' installation not emulated."
            r2.append(r1)     // Catch:{ all -> 0x0216 }
            goto L_0x019f
        L_0x01f6:
            java.util.Set r10 = r8.f51761c     // Catch:{ all -> 0x0216 }
            monitor-enter(r10)     // Catch:{ all -> 0x0216 }
            java.util.Set r0 = r8.f51761c     // Catch:{ all -> 0x0201 }
            r0.addAll(r9)     // Catch:{ all -> 0x0201 }
            monitor-exit(r10)     // Catch:{ all -> 0x0201 }
            monitor-exit(r8)
            return
        L_0x0201:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0201 }
            throw r9     // Catch:{ all -> 0x0216 }
        L_0x0204:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0216 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0216 }
            r2[r1] = r0     // Catch:{ all -> 0x0216 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0216 }
            r10.<init>(r0, r9)     // Catch:{ all -> 0x0216 }
            throw r10     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.SplitCompat.m71061g(android.content.Context, boolean):void");
    }

    /* renamed from: h */
    private static boolean m71062h(Context context, boolean z) {
        if (m71063i()) {
            return false;
        }
        AtomicReference atomicReference = f51757e;
        boolean compareAndSet = atomicReference.compareAndSet((Object) null, new SplitCompat(context));
        SplitCompat splitCompat = (SplitCompat) atomicReference.get();
        if (compareAndSet) {
            zzo.INSTANCE.mo60010b(new zzaw(context, zzd.m71068a(), new zzay(context, splitCompat.f51759a, new zzau()), splitCompat.f51759a, new zzr(), (byte[]) null));
            zzr.m71222a(new zzo(splitCompat));
            zzd.m71068a().execute(new zzn(context));
        }
        try {
            splitCompat.m71061g(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    /* renamed from: i */
    private static boolean m71063i() {
        return false;
    }
}
