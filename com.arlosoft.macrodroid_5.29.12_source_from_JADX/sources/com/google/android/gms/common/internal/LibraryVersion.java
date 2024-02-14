package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class LibraryVersion {

    /* renamed from: b */
    private static final GmsLogger f3655b = new GmsLogger("LibraryVersion", "");

    /* renamed from: c */
    private static LibraryVersion f3656c = new LibraryVersion();

    /* renamed from: a */
    private ConcurrentHashMap f3657a = new ConcurrentHashMap();

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static LibraryVersion m4468a() {
        return f3656c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo21718b(@androidx.annotation.NonNull java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.m4485h(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f3657a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L_0x001a
            java.util.concurrent.ConcurrentHashMap r0 = r8.f3657a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 1
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x007c }
            r5 = 0
            r3[r5] = r9     // Catch:{ IOException -> 0x007c }
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.lang.String r6 = "/%s.properties"
            java.lang.String r3 = java.lang.String.format(r6, r3)     // Catch:{ IOException -> 0x007c }
            java.io.InputStream r3 = r5.getResourceAsStream(r3)     // Catch:{ IOException -> 0x007c }
            if (r3 == 0) goto L_0x0058
            r2.load(r3)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.String r5 = "version"
            java.lang.String r4 = r2.getProperty(r5, r4)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            com.google.android.gms.common.internal.GmsLogger r2 = f3655b     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.<init>()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.append(r9)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.append(r4)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r2.mo21707g(r1, r5)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            goto L_0x006c
        L_0x0058:
            com.google.android.gms.common.internal.GmsLogger r2 = f3655b     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.<init>()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.append(r0)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r5.append(r9)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
            r2.mo21708h(r1, r5)     // Catch:{ IOException -> 0x0075, all -> 0x0072 }
        L_0x006c:
            if (r3 == 0) goto L_0x0098
            com.google.android.gms.common.util.IOUtils.m4889b(r3)
            goto L_0x0098
        L_0x0072:
            r9 = move-exception
            r4 = r3
            goto L_0x00a9
        L_0x0075:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L_0x007e
        L_0x007a:
            r9 = move-exception
            goto L_0x00a9
        L_0x007c:
            r2 = move-exception
            r3 = r4
        L_0x007e:
            com.google.android.gms.common.internal.GmsLogger r5 = f3655b     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r6.<init>()     // Catch:{ all -> 0x007a }
            r6.append(r0)     // Catch:{ all -> 0x007a }
            r6.append(r9)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x007a }
            r5.mo21705e(r1, r0, r2)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0097
            com.google.android.gms.common.util.IOUtils.m4889b(r4)
        L_0x0097:
            r4 = r3
        L_0x0098:
            if (r4 != 0) goto L_0x00a3
            com.google.android.gms.common.internal.GmsLogger r0 = f3655b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.mo21702b(r1, r2)
            java.lang.String r4 = "UNKNOWN"
        L_0x00a3:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f3657a
            r0.put(r9, r4)
            return r4
        L_0x00a9:
            if (r4 == 0) goto L_0x00ae
            com.google.android.gms.common.util.IOUtils.m4889b(r4)
        L_0x00ae:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.mo21718b(java.lang.String):java.lang.String");
    }
}
