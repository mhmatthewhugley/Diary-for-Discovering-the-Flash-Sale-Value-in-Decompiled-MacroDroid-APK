package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: com.arlosoft.macrodroid.utils.a0 */
/* compiled from: FileUtils */
public class C6362a0 {

    /* renamed from: a */
    private static final Comparator<File> f14953a = C6461z.f15087a;

    /* renamed from: b */
    private static final FileFilter f14954b = C6458y.f15085a;

    /* renamed from: c */
    private static final FileFilter f14955c = C6454x.f15080a;

    /* renamed from: d */
    public static void m24598d(Context context, Intent intent, File file) {
        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24599e(java.io.File r9, java.io.File r10) throws java.io.IOException {
        /*
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x0009
            r10.createNewFile()
        L_0x0009:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r9)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r10)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x002e }
            r4 = 0
            long r6 = r9.size()     // Catch:{ all -> 0x002e }
            r2 = r0
            r3 = r9
            r2.transferFrom(r3, r4, r6)     // Catch:{ all -> 0x002e }
            r9.close()
            r0.close()
            return
        L_0x002e:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0035
        L_0x0033:
            r10 = move-exception
            r9 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            if (r9 == 0) goto L_0x003f
            r9.close()
        L_0x003f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6362a0.m24599e(java.io.File, java.io.File):void");
    }

    /* renamed from: f */
    public static Bitmap m24600f(String str) {
        if (str == null) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        return decodeFile == null ? BitmapFactory.decodeFile(str.replace("UserIcons", "MacroDroid/UserIcons")) : decodeFile;
    }

    /* renamed from: g */
    public static String m24601g(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf >= 0 ? str.substring(lastIndexOf) : "";
    }

    /* renamed from: h */
    public static File m24602h(Context context) {
        return new File(context.getExternalFilesDir((String) null), "UserIcons");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ boolean m24604j(File file) {
        return file.isFile() && !file.getName().startsWith(".");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ boolean m24605k(File file) {
        return file.isDirectory() && !file.getName().startsWith(".");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0099 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File[] m24606l(java.io.File r9) {
        /*
            r0 = 0
            java.io.File[] r1 = new java.io.File[r0]
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r5 = "su"
            r4[r0] = r5     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r5 = "-c"
            r6 = 1
            r4[r6] = r5     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r6.<init>()     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r7 = "ls -a \""
            r6.append(r7)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r7 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r6.append(r7)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r7 = "\""
            r6.append(r7)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r4[r5] = r6     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.lang.Process r3 = r3.exec(r4)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0099, all -> 0x0094 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r2.<init>()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
        L_0x0048:
            java.lang.String r3 = r4.readLine()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r3 == 0) goto L_0x0052
            r2.add(r3)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            goto L_0x0048
        L_0x0052:
            int r3 = r2.size()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.io.File[] r1 = new java.io.File[r3]     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
        L_0x005c:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            int r5 = r0 + 1
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r7.<init>()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r8 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r7.append(r8)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r7.append(r3)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r1[r0] = r6     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r0 = r5
            goto L_0x005c
        L_0x008b:
            r4.close()     // Catch:{ Exception -> 0x009c }
            goto L_0x009c
        L_0x008f:
            r9 = move-exception
            r2 = r4
            goto L_0x0095
        L_0x0092:
            r2 = r4
            goto L_0x0099
        L_0x0094:
            r9 = move-exception
        L_0x0095:
            r2.close()     // Catch:{ Exception -> 0x0098 }
        L_0x0098:
            throw r9
        L_0x0099:
            r2.close()     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6362a0.m24606l(java.io.File):java.io.File[]");
    }
}
