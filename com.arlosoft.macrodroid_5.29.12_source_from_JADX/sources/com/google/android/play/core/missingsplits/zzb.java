package com.google.android.play.core.missingsplits;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.play.core.internal.zzag;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzb implements MissingSplitsManager {

    /* renamed from: e */
    private static final zzag f51737e = new zzag("MissingSplitsManagerImpl");

    /* renamed from: a */
    private final Context f51738a;

    /* renamed from: b */
    private final Runtime f51739b;

    /* renamed from: c */
    private final zza f51740c;

    /* renamed from: d */
    private final AtomicReference f51741d;

    zzb(Context context, Runtime runtime, zza zza, AtomicReference atomicReference) {
        this.f51738a = context;
        this.f51739b = runtime;
        this.f51740c = zza;
        this.f51741d = atomicReference;
    }

    /* renamed from: b */
    private final List m71042b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f51738a.getSystemService("activity")).getAppTasks();
        if (appTasks != null) {
            return appTasks;
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f51737e.mo59809e("App '%s' is not found in PackageManager", r7.f51738a.getPackageName());
        r5 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59917a() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.f51741d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.f51741d     // Catch:{ all -> 0x01b6 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01b6 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01b6 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x009c
            java.util.concurrent.atomic.AtomicReference r1 = r7.f51741d     // Catch:{ all -> 0x01b6 }
            android.content.Context r4 = r7.f51738a     // Catch:{ all -> 0x01b6 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x01b6 }
            android.content.Context r5 = r7.f51738a     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r4 = r5.equals(r4)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.content.Context r4 = r7.f51738a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r5 = r7.f51738a     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0056 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.lang.String[] r4 = r4.splitNames     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.util.Collections.addAll(r5, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            com.google.android.play.core.internal.zzag r4 = f51737e     // Catch:{ all -> 0x01b6 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b6 }
            android.content.Context r6 = r7.f51738a     // Catch:{ all -> 0x01b6 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01b6 }
            r5[r3] = r6     // Catch:{ all -> 0x01b6 }
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.mo59809e(r6, r5)     // Catch:{ all -> 0x01b6 }
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01b6 }
        L_0x006b:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x01b6 }
            if (r4 != 0) goto L_0x007f
            int r4 = r5.size()     // Catch:{ all -> 0x01b6 }
            if (r4 != r2) goto L_0x0081
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x0081
        L_0x007f:
            r4 = 1
            goto L_0x0095
        L_0x0081:
            r4 = 0
            goto L_0x0095
        L_0x0083:
            com.google.android.play.core.internal.zzag r4 = f51737e     // Catch:{ all -> 0x01b6 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b6 }
            android.content.Context r6 = r7.f51738a     // Catch:{ all -> 0x01b6 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01b6 }
            r5[r3] = r6     // Catch:{ all -> 0x01b6 }
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.mo59809e(r6, r5)     // Catch:{ all -> 0x01b6 }
            goto L_0x0081
        L_0x0095:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01b6 }
            r1.set(r4)     // Catch:{ all -> 0x01b6 }
        L_0x009c:
            java.util.concurrent.atomic.AtomicReference r1 = r7.f51741d     // Catch:{ all -> 0x01b6 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01b6 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01b6 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b6 }
            if (r1 == 0) goto L_0x01a3
            java.util.List r0 = r7.m71042b()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f5
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r1 = r1.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r4 = r4.getName()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00b3
            goto L_0x01a2
        L_0x00f5:
            java.util.List r0 = r7.m71042b()
            java.util.Iterator r0 = r0.iterator()
        L_0x00fd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0157
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            if (r1 == 0) goto L_0x00fd
            android.content.Intent r4 = r1.baseIntent
            if (r4 == 0) goto L_0x00fd
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x00fd
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r4 = r1.getClassName()
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x013d }
        L_0x0127:
            if (r1 == 0) goto L_0x00fd
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0133
        L_0x0131:
            r0 = 1
            goto L_0x0158
        L_0x0133:
            java.lang.Class r4 = r1.getSuperclass()
            if (r4 == r1) goto L_0x013b
            r1 = r4
            goto L_0x0127
        L_0x013b:
            r1 = 0
            goto L_0x0127
        L_0x013d:
            com.google.android.play.core.internal.zzag r5 = f51737e
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r4
            java.lang.String r4 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r5.mo59809e(r4, r6)
            android.content.Context r4 = r7.f51738a     // Catch:{ NameNotFoundException -> 0x0155 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0155 }
            android.content.pm.ActivityInfo r1 = r4.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0155 }
            if (r1 == 0) goto L_0x00fd
            goto L_0x0131
        L_0x0155:
            goto L_0x00fd
        L_0x0157:
            r0 = 0
        L_0x0158:
            com.google.android.play.core.missingsplits.zza r1 = r7.f51740c
            r1.mo59920a()
            java.util.List r1 = r7.m71042b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0165:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0175
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x0165
        L_0x0175:
            if (r0 == 0) goto L_0x019d
            android.content.Context r0 = r7.f51738a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r7.f51738a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r7.f51738a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.f51738a
            r1.startActivity(r0)
        L_0x019d:
            java.lang.Runtime r0 = r7.f51739b
            r0.exit(r3)
        L_0x01a2:
            return r2
        L_0x01a3:
            com.google.android.play.core.missingsplits.zza r0 = r7.f51740c
            boolean r0 = r0.mo59922c()
            if (r0 == 0) goto L_0x01b5
            com.google.android.play.core.missingsplits.zza r0 = r7.f51740c
            r0.mo59921b()
            java.lang.Runtime r0 = r7.f51739b
            r0.exit(r3)
        L_0x01b5:
            return r3
        L_0x01b6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.zzb.mo59917a():boolean");
    }
}
