package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class WorkSourceUtil {

    /* renamed from: a */
    private static final int f3948a = Process.myUid();

    /* renamed from: b */
    private static final Method f3949b;

    /* renamed from: c */
    private static final Method f3950c;

    /* renamed from: d */
    private static final Method f3951d;

    /* renamed from: e */
    private static final Method f3952e;

    /* renamed from: f */
    private static final Method f3953f;

    /* renamed from: g */
    private static final Method f3954g;

    /* renamed from: h */
    private static final Method f3955h;

    /* renamed from: i */
    private static final Method f3956i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            f3948a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x001a }
            r5[r3] = r6     // Catch:{ Exception -> 0x001a }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            f3949b = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.m4898c()
            r6 = 2
            if (r5 == 0) goto L_0x0033
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0033 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0033 }
            r5[r3] = r7     // Catch:{ Exception -> 0x0033 }
            r5[r2] = r0     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            f3950c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            f3951d = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0053 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0053 }
            r1[r3] = r5     // Catch:{ Exception -> 0x0053 }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            f3952e = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.m4898c()
            if (r1 == 0) goto L_0x006b
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006b }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006b }
            r1[r3] = r5     // Catch:{ Exception -> 0x006b }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            f3953f = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.m4905j()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L_0x0087
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0088
        L_0x0081:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L_0x0087:
            r1 = r4
        L_0x0088:
            f3954g = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.m4905j()
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x00a5 }
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00a5 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a5 }
            r6[r3] = r7     // Catch:{ Exception -> 0x00a5 }
            r6[r2] = r0     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r6)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        L_0x00ab:
            r0 = r4
        L_0x00ac:
            f3955h = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.m4905j()
            if (r0 == 0) goto L_0x00c1
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00c1 }
            java.lang.reflect.Method r4 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00c1 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            f3956i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m4915a(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = f3950c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f3949b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static WorkSource m4916b(@NonNull Context context, @NonNull String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = Wrappers.m4929a(context).mo21960c(str, 0);
                if (c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m4915a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m4917c(@NonNull Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.m4929a(context).mo21959b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
