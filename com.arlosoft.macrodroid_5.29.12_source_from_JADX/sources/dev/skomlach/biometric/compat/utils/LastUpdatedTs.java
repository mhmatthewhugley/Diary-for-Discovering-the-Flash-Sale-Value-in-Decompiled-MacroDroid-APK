package dev.skomlach.biometric.compat.utils;

import android.content.pm.ApplicationInfo;
import androidx.core.content.ContextCompat;
import dev.skomlach.common.contextprovider.C12104a;
import java.io.File;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\"\u0010\n\u001a\u00020\t8F@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/LastUpdatedTs;", "", "Ljava/io/File;", "fileOrDirectory", "", "", "apks", "Lja/u;", "scanRecursivly", "", "timestamp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: LastUpdatedTs.kt */
public final class LastUpdatedTs {
    public static final LastUpdatedTs INSTANCE = new LastUpdatedTs();
    private static long timestamp;

    private LastUpdatedTs() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011 A[Catch:{ all -> 0x000c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[Catch:{ all -> 0x000c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void scanRecursivly(java.io.File r6, java.util.Set<java.lang.String> r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x000e
            boolean r2 = r6.isDirectory()     // Catch:{ all -> 0x000c }
            if (r2 != r0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000c:
            r6 = move-exception
            goto L_0x0057
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x002b
            java.io.File[] r6 = r6.listFiles()     // Catch:{ all -> 0x000c }
            if (r6 == 0) goto L_0x005a
            int r2 = r6.length     // Catch:{ all -> 0x000c }
            if (r2 != 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x005a
            int r0 = r6.length     // Catch:{ all -> 0x000c }
        L_0x0021:
            if (r1 >= r0) goto L_0x005a
            r2 = r6[r1]     // Catch:{ all -> 0x000c }
            r5.scanRecursivly(r2, r7)     // Catch:{ all -> 0x000c }
            int r1 = r1 + 1
            goto L_0x0021
        L_0x002b:
            if (r6 == 0) goto L_0x0034
            boolean r2 = r6.isFile()     // Catch:{ all -> 0x000c }
            if (r2 != r0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x000c }
            java.lang.String r2 = "fileOrDirectory.name"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)     // Catch:{ all -> 0x000c }
            java.lang.String r2 = "dex"
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.C15176v.m93640u(r0, r2, r1, r3, r4)     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x005a
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "fileOrDirectory.absolutePath"
            kotlin.jvm.internal.C13706o.m87928e(r6, r0)     // Catch:{ all -> 0x000c }
            r7.add(r6)     // Catch:{ all -> 0x000c }
            goto L_0x005a
        L_0x0057:
            r6.printStackTrace()
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.LastUpdatedTs.scanRecursivly(java.io.File, java.util.Set):void");
    }

    public final long getTimestamp() {
        long j = 0;
        if (timestamp == 0) {
            try {
                HashSet<String> hashSet = new HashSet<>();
                C12104a aVar = C12104a.f58372a;
                ApplicationInfo applicationInfo = aVar.mo68283g().getPackageManager().getApplicationInfo(aVar.mo68283g().getPackageName(), 0);
                C13706o.m87928e(applicationInfo, "AndroidContext.appContex…                        )");
                String str = applicationInfo.sourceDir;
                if (str != null) {
                    hashSet.add(str);
                }
                String str2 = applicationInfo.publicSourceDir;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String[] strArr = applicationInfo.splitSourceDirs;
                if (strArr != null) {
                    hashSet.addAll(C13614t.m87751m(Arrays.copyOf(strArr, strArr.length)));
                }
                String[] strArr2 = applicationInfo.splitPublicSourceDirs;
                if (strArr2 != null) {
                    hashSet.addAll(C13614t.m87751m(Arrays.copyOf(strArr2, strArr2.length)));
                }
                scanRecursivly(ContextCompat.getCodeCacheDir(aVar.mo68283g()), hashSet);
                for (String str3 : hashSet) {
                    if (new File(str3).exists()) {
                        long lastModified = new File(str3).lastModified();
                        if (lastModified > j) {
                            j = lastModified;
                        }
                    }
                }
                timestamp = j;
            } catch (Throwable unused) {
                timestamp = new SecureRandom().nextLong();
            }
        }
        return timestamp;
    }

    public final void setTimestamp(long j) {
        timestamp = j;
    }
}
