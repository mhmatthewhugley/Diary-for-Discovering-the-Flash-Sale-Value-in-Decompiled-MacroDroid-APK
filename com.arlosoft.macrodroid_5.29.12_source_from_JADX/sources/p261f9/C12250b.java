package p261f9;

import android.app.AppOpsManager;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12120d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tJ!\u0010\r\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00112\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002J\"\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0007R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo71668d2 = {"Lf9/b;", "", "", "permission", "", "h", "i", "manifestPermission", "g", "", "permissions", "c", "", "d", "([Ljava/lang/String;)Z", "targetPermissionsKes", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "channelId", "e", "opCode", "", "uid", "pkg", "a", "f", "()Z", "isAllowedNotificationsPermission", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: f9.b */
/* compiled from: PermissionUtils.kt */
public final class C12250b {

    /* renamed from: a */
    public static final C12250b f58845a = new C12250b();

    /* renamed from: b */
    private static final Context f58846b = C12104a.f58372a.mo68283g();

    /* renamed from: c */
    private static final Map<String, Boolean> f58847c = new HashMap();

    private C12250b() {
    }

    /* renamed from: g */
    private final boolean m82961g(String str) {
        try {
            PermissionInfo permissionInfo = f58846b.getPackageManager().getPermissionInfo(str, 128);
            C11966a aVar = C11966a.f58161a;
            aVar.mo67380c("PermissionUtils.isAppOpPermission - " + str + " " + permissionInfo);
            if (Build.VERSION.SDK_INT >= 28) {
                if ((permissionInfo.getProtection() & 64) == 0 && (permissionInfo.protectionLevel & 64) == 0) {
                    return false;
                }
            } else if ((permissionInfo.protectionLevel & 64) == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C11966a.f58161a.mo67381d(th);
            return false;
        }
    }

    /* renamed from: h */
    private final boolean m82962h(String str) {
        String str2;
        try {
            List<PermissionGroupInfo> allPermissionGroups = f58846b.getPackageManager().getAllPermissionGroups(0);
            C13706o.m87928e(allPermissionGroups, "appContext.packageManage…getAllPermissionGroups(0)");
            allPermissionGroups.add((Object) null);
            for (PermissionGroupInfo next : allPermissionGroups) {
                if (!(next == null || (str2 = next.name) == null)) {
                    List<PermissionInfo> queryPermissionsByGroup = f58846b.getPackageManager().queryPermissionsByGroup(str2, 0);
                    C13706o.m87928e(queryPermissionsByGroup, "appContext.packageManage…PermissionsByGroup(it, 0)");
                    for (PermissionInfo next2 : queryPermissionsByGroup) {
                        C13706o.m87928e(next2, "lstPermissions");
                        if (C13706o.m87924a(next2.name, str)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        } catch (Throwable th) {
            C11966a.f58161a.mo67381d(th);
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5 = android.os.Process.myUid();
        r6 = f58846b.getPackageName();
        kotlin.jvm.internal.C13706o.m87928e(r6, "appContext.packageName");
        r5 = mo68572a(r4, r5, r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be A[Catch:{ all -> 0x00f2 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82963i(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "PermissionUtils.isPermissionGranted - normal permission - "
            java.lang.String r1 = " - "
            r2 = 0
            r3 = 1
            f9.a r4 = p261f9.C12249a.f58793a     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = r4.mo68571a(r11)     // Catch:{ all -> 0x00f2 }
            if (r4 != 0) goto L_0x0010
            java.lang.String r4 = ""
        L_0x0010:
            int r5 = r4.length()     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x0018
            r5 = 1
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            if (r5 == 0) goto L_0x0045
            android.content.Context r4 = f58846b     // Catch:{ all -> 0x00f2 }
            int r4 = androidx.core.content.PermissionChecker.checkSelfPermission(r4, r11)     // Catch:{ all -> 0x00f2 }
            if (r4 != 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            d9.a r5 = p240d9.C11966a.f58161a     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r7.<init>()     // Catch:{ all -> 0x00f2 }
            r7.append(r0)     // Catch:{ all -> 0x00f2 }
            r7.append(r11)     // Catch:{ all -> 0x00f2 }
            r7.append(r1)     // Catch:{ all -> 0x00f2 }
            r7.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00f2 }
            r6[r2] = r7     // Catch:{ all -> 0x00f2 }
            r5.mo67380c(r6)     // Catch:{ all -> 0x00f2 }
            return r4
        L_0x0045:
            android.content.Context r5 = f58846b     // Catch:{ all -> 0x0054 }
            int r6 = android.os.Process.myUid()     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = r5.getPackageName()     // Catch:{ all -> 0x0054 }
            int r5 = androidx.core.app.AppOpsManagerCompat.noteOpNoThrow(r5, r4, r6, r7)     // Catch:{ all -> 0x0054 }
            goto L_0x0067
        L_0x0054:
            int r5 = android.os.Process.myUid()     // Catch:{ all -> 0x00f2 }
            android.content.Context r6 = f58846b     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = "appContext.packageName"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x00f2 }
            int r5 = r10.mo68572a(r4, r5, r6)     // Catch:{ all -> 0x00f2 }
        L_0x0067:
            if (r5 != 0) goto L_0x006b
            r6 = 1
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r5 != r3) goto L_0x0070
            r5 = 1
            goto L_0x0071
        L_0x0070:
            r5 = 0
        L_0x0071:
            if (r5 == 0) goto L_0x0088
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = f58847c     // Catch:{ all -> 0x00f2 }
            boolean r7 = r5.containsKey(r11)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x0088
            java.lang.Object r5 = r5.get(r11)     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00f2 }
            if (r5 == 0) goto L_0x0091
            boolean r6 = r5.booleanValue()     // Catch:{ all -> 0x00f2 }
            goto L_0x0091
        L_0x0088:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = f58847c     // Catch:{ all -> 0x00f2 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00f2 }
            r5.put(r11, r7)     // Catch:{ all -> 0x00f2 }
        L_0x0091:
            boolean r5 = r10.m82961g(r11)     // Catch:{ all -> 0x00f2 }
            if (r5 == 0) goto L_0x00be
            d9.a r5 = p240d9.C11966a.f58161a     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r8.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r9 = "PermissionUtils.isPermissionGranted - appOp permission - "
            r8.append(r9)     // Catch:{ all -> 0x00f2 }
            r8.append(r11)     // Catch:{ all -> 0x00f2 }
            r8.append(r1)     // Catch:{ all -> 0x00f2 }
            r8.append(r4)     // Catch:{ all -> 0x00f2 }
            r8.append(r1)     // Catch:{ all -> 0x00f2 }
            r8.append(r6)     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x00f2 }
            r7[r2] = r4     // Catch:{ all -> 0x00f2 }
            r5.mo67380c(r7)     // Catch:{ all -> 0x00f2 }
            goto L_0x00f1
        L_0x00be:
            if (r6 == 0) goto L_0x00ca
            android.content.Context r5 = f58846b     // Catch:{ all -> 0x00f2 }
            int r5 = androidx.core.content.PermissionChecker.checkSelfPermission(r5, r11)     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x00ca
            r6 = 1
            goto L_0x00cb
        L_0x00ca:
            r6 = 0
        L_0x00cb:
            d9.a r5 = p240d9.C11966a.f58161a     // Catch:{ all -> 0x00f2 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r8.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r9 = "PermissionUtils.isPermissionGranted - danger permission - "
            r8.append(r9)     // Catch:{ all -> 0x00f2 }
            r8.append(r11)     // Catch:{ all -> 0x00f2 }
            r8.append(r1)     // Catch:{ all -> 0x00f2 }
            r8.append(r4)     // Catch:{ all -> 0x00f2 }
            r8.append(r1)     // Catch:{ all -> 0x00f2 }
            r8.append(r6)     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x00f2 }
            r7[r2] = r4     // Catch:{ all -> 0x00f2 }
            r5.mo67380c(r7)     // Catch:{ all -> 0x00f2 }
        L_0x00f1:
            return r6
        L_0x00f2:
            r4 = move-exception
            d9.a r5 = p240d9.C11966a.f58161a
            r5.mo67381d(r4)
            android.content.Context r4 = f58846b
            int r4 = androidx.core.content.PermissionChecker.checkSelfPermission(r4, r11)
            if (r4 != 0) goto L_0x0102
            r4 = 1
            goto L_0x0103
        L_0x0102:
            r4 = 0
        L_0x0103:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r11)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r11 = r6.toString()
            r3[r2] = r11
            r5.mo67380c(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p261f9.C12250b.m82963i(java.lang.String):boolean");
    }

    @RequiresApi(19)
    /* renamed from: a */
    public final int mo68572a(String str, int i, String str2) {
        Class<String> cls = String.class;
        C13706o.m87929f(str2, "pkg");
        try {
            Object systemService = f58846b.getSystemService("appops");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            Object invoke = AppOpsManager.class.getMethod("noteOpNoThrow", new Class[]{cls, Integer.TYPE, cls}).invoke((AppOpsManager) systemService, new Object[]{str, Integer.valueOf(i), str2});
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue();
        } catch (Exception e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                return 0;
            }
            C11966a.f58161a.mo67381d(e);
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r9.protectionLevel != 0) goto L_0x0088;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.lang.String, java.lang.String> mo68573b(java.util.List<java.lang.String> r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "manifestPermissions"
            java.lang.String r2 = "targetPermissionsKes"
            kotlin.jvm.internal.C13706o.m87929f(r0, r2)
            boolean r2 = r17.isEmpty()
            if (r2 != 0) goto L_0x00b7
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.content.Context r3 = f58846b     // Catch:{ all -> 0x00ae }
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x00ae }
            r5 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r5)     // Catch:{ all -> 0x00ae }
            java.lang.String[] r3 = r3.requestedPermissions     // Catch:{ all -> 0x00ae }
            kotlin.jvm.internal.C13706o.m87928e(r3, r1)     // Catch:{ all -> 0x00ae }
            int r4 = r3.length     // Catch:{ all -> 0x00ae }
            r5 = 0
            r6 = 0
        L_0x002c:
            if (r6 >= r4) goto L_0x00ab
            r7 = r3[r6]     // Catch:{ all -> 0x00ae }
            kotlin.jvm.internal.C13706o.m87928e(r7, r1)     // Catch:{ all -> 0x00ae }
            boolean r8 = r0.contains(r7)     // Catch:{ all -> 0x00a6 }
            if (r8 == 0) goto L_0x00a6
            android.content.Context r8 = f58846b     // Catch:{ all -> 0x00a6 }
            android.content.pm.PackageManager r9 = r8.getPackageManager()     // Catch:{ all -> 0x00a6 }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.PermissionInfo r9 = r9.getPermissionInfo(r7, r10)     // Catch:{ all -> 0x00a6 }
            d9.a r10 = p240d9.C11966a.f58161a     // Catch:{ all -> 0x00a6 }
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x00a6 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a6 }
            r14 = 28
            if (r13 < r14) goto L_0x0055
            int r15 = r9.getProtection()     // Catch:{ all -> 0x00a6 }
            goto L_0x0057
        L_0x0055:
            int r15 = r9.protectionLevel     // Catch:{ all -> 0x00a6 }
        L_0x0057:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r11.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r14 = "PermissionUtils.getPermissions: "
            r11.append(r14)     // Catch:{ all -> 0x00a6 }
            r11.append(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.String r14 = " "
            r11.append(r14)     // Catch:{ all -> 0x00a6 }
            r11.append(r15)     // Catch:{ all -> 0x00a6 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00a6 }
            r12[r5] = r11     // Catch:{ all -> 0x00a6 }
            r10.mo67380c(r12)     // Catch:{ all -> 0x00a6 }
            r10 = 28
            if (r13 < r10) goto L_0x0084
            int r10 = r9.getProtection()     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a6
            int r10 = r9.protectionLevel     // Catch:{ all -> 0x00a6 }
            if (r10 != 0) goto L_0x0088
            goto L_0x00a6
        L_0x0084:
            int r10 = r9.protectionLevel     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a6
        L_0x0088:
            r10 = 1
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x00a6 }
            r10[r5] = r7     // Catch:{ all -> 0x00a6 }
            r11 = r16
            boolean r10 = r11.mo68575d(r10)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x0096
            goto L_0x00a8
        L_0x0096:
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x00a8 }
            java.lang.CharSequence r8 = r9.loadLabel(r8)     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a8 }
            r2.put(r7, r8)     // Catch:{ all -> 0x00a8 }
            goto L_0x00a8
        L_0x00a6:
            r11 = r16
        L_0x00a8:
            int r6 = r6 + 1
            goto L_0x002c
        L_0x00ab:
            r11 = r16
            goto L_0x00b6
        L_0x00ae:
            r0 = move-exception
            r11 = r16
            d9.a r1 = p240d9.C11966a.f58161a
            r1.mo67381d(r0)
        L_0x00b6:
            return r2
        L_0x00b7:
            r11 = r16
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Provide at least one permission string"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p261f9.C12250b.mo68573b(java.util.List):java.util.HashMap");
    }

    /* renamed from: c */
    public final boolean mo68574c(List<String> list) {
        C13706o.m87929f(list, "permissions");
        Object[] array = list.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        return mo68575d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public final boolean mo68575d(String... strArr) {
        C13706o.m87929f(strArr, "permissions");
        for (String str : strArr) {
            if (m82962h(str) && !m82963i(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo68576e(String str) {
        C13706o.m87929f(str, "channelId");
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return true;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) f58846b.getSystemService(NotificationManager.class);
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
            if (i >= 28) {
                C11966a aVar = C11966a.f58161a;
                Object[] objArr = new Object[1];
                String group = notificationChannel.getGroup();
                NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(notificationChannel.getGroup());
                Boolean valueOf = notificationChannelGroup != null ? Boolean.valueOf(notificationChannelGroup.isBlocked()) : null;
                int importance = notificationChannel.getImportance();
                objArr[0] = "PermissionUtils.NotificationGroup " + group + ":" + valueOf + "; NotificationChannel " + str + ":" + importance;
                aVar.mo67380c(objArr);
                NotificationChannelGroup notificationChannelGroup2 = notificationManager.getNotificationChannelGroup(notificationChannel.getGroup());
                if (notificationChannelGroup2 != null && notificationChannelGroup2.isBlocked()) {
                    return true;
                }
                if (notificationChannel.getImportance() != 0) {
                    return true;
                }
            } else {
                C11966a aVar2 = C11966a.f58161a;
                int importance2 = notificationChannel.getImportance();
                aVar2.mo67380c("PermissionUtils.NotificationChannel " + str + ":" + importance2);
                if (notificationChannel.getImportance() != 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C11966a.f58161a.mo67381d(th);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo68577f() {
        if (C12120d.f58384a.mo68317d()) {
            return mo68575d("android.permission.POST_NOTIFICATIONS") && NotificationManagerCompat.from(f58846b).areNotificationsEnabled();
        }
        return NotificationManagerCompat.from(f58846b).areNotificationsEnabled();
    }
}
