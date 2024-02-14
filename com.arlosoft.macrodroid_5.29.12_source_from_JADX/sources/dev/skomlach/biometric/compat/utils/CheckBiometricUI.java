package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/CheckBiometricUI;", "", "()V", "checkApk", "", "fileZip", "", "getAPKs", "", "context", "Landroid/content/Context;", "pkg", "hasExists", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: CheckBiometricUI.kt */
public final class CheckBiometricUI {
    public static final CheckBiometricUI INSTANCE = new CheckBiometricUI();

    private CheckBiometricUI() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095 A[SYNTHETIC, Splitter:B:30:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean checkApk(java.lang.String r10) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = "zip.name"
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0092 }
            r2.<init>(r10)     // Catch:{ all -> 0x0092 }
            java.util.Enumeration r10 = r2.entries()     // Catch:{ all -> 0x008f }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x008f }
            r3.<init>()     // Catch:{ all -> 0x008f }
        L_0x0011:
            boolean r4 = r10.hasMoreElements()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0024
            java.lang.Object r4 = r10.nextElement()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "entries.nextElement()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)     // Catch:{ all -> 0x008f }
            r3.add(r4)     // Catch:{ all -> 0x008f }
            goto L_0x0011
        L_0x0024:
            dev.skomlach.biometric.compat.utils.a r10 = dev.skomlach.biometric.compat.utils.C12084a.f58329a     // Catch:{ all -> 0x008f }
            kotlin.collections.C13622x.m87781y(r3, r10)     // Catch:{ all -> 0x008f }
            java.util.Iterator r10 = r3.iterator()     // Catch:{ all -> 0x008f }
        L_0x002d:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x008f }
            r4 = 0
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x008f }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r3.getName()     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "layout"
            r7 = 1
            boolean r5 = kotlin.text.C15177w.m93659L(r5, r6, r7)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x002d
            java.lang.String r5 = r3.getName()     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "biometric"
            boolean r5 = kotlin.text.C15177w.m93659L(r5, r6, r7)     // Catch:{ all -> 0x008f }
            if (r5 != 0) goto L_0x0069
            java.lang.String r5 = r3.getName()     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "fingerprint"
            r8 = 2
            boolean r5 = kotlin.text.C15177w.m93663N(r5, r6, r4, r8, r1)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x002d
        L_0x0069:
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r10 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE     // Catch:{ all -> 0x008f }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r3.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Resource in APK "
            r3.append(r5)     // Catch:{ all -> 0x008f }
            r3.append(r1)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x008f }
            r0[r4] = r1     // Catch:{ all -> 0x008f }
            r10.mo68217d(r0)     // Catch:{ all -> 0x008f }
            r2.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            return r7
        L_0x008b:
            r2.close()     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            return r4
        L_0x008f:
            r10 = move-exception
            r1 = r2
            goto L_0x0093
        L_0x0092:
            r10 = move-exception
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.CheckBiometricUI.checkApk(java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: checkApk$lambda-0  reason: not valid java name */
    public static final int m101347checkApk$lambda0(ZipEntry zipEntry, ZipEntry zipEntry2) {
        String name = zipEntry.getName();
        String name2 = zipEntry2.getName();
        C13706o.m87928e(name2, "o2.name");
        return name.compareTo(name2);
    }

    private final List<String> getAPKs(Context context, String str) {
        HashSet hashSet = new HashSet();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            C13706o.m87928e(applicationInfo, "context.packageManager.getApplicationInfo(pkg, 0)");
            String str2 = applicationInfo.sourceDir;
            C13706o.m87928e(str2, "applicationInfo.sourceDir");
            hashSet.add(str2);
            String str3 = applicationInfo.publicSourceDir;
            C13706o.m87928e(str3, "applicationInfo.publicSourceDir");
            hashSet.add(str3);
            String[] strArr = applicationInfo.splitSourceDirs;
            if (strArr != null) {
                C13706o.m87928e(strArr, "applicationInfo.splitSourceDirs");
                hashSet.addAll(C13614t.m87751m(Arrays.copyOf(strArr, strArr.length)));
            }
            String[] strArr2 = applicationInfo.splitPublicSourceDirs;
            if (strArr2 != null) {
                C13706o.m87928e(strArr2, "applicationInfo.splitPublicSourceDirs");
                hashSet.addAll(C13614t.m87751m(Arrays.copyOf(strArr2, strArr2.length)));
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
        return new ArrayList(hashSet);
    }

    public final boolean hasExists(Context context) {
        C13706o.m87929f(context, "context");
        try {
            List<String> aPKs = getAPKs(context, "com.android.systemui");
            if (aPKs.isEmpty()) {
                return true;
            }
            for (String checkApk : aPKs) {
                if (checkApk(checkApk)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return false;
        }
    }
}
