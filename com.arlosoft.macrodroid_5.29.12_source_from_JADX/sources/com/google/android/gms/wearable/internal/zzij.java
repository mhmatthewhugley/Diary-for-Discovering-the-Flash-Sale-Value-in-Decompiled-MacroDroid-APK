package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzij implements Callable {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f48375a;

    /* renamed from: c */
    final /* synthetic */ byte[] f48376c;

    zzij(zzim zzim, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f48375a = parcelFileDescriptor;
        this.f48376c = bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|(1:20)|21|22|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4 = java.lang.String.valueOf(r7.f48375a);
        android.util.Log.w("WearableClient", "processAssets: writing data failed: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        if (android.util.Log.isLoggable("WearableClient", 3) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        r1 = java.lang.String.valueOf(r7.f48375a);
        r2 = new java.lang.StringBuilder();
        r2.append("processAssets: closing: ");
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "processAssets: closing: "
            java.lang.String r1 = "WearableClient"
            r2 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r2)
            if (r3 == 0) goto L_0x0016
            android.os.ParcelFileDescriptor r3 = r7.f48375a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "processAssets: writing data to FD : "
            r4.concat(r3)
        L_0x0016:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream
            android.os.ParcelFileDescriptor r4 = r7.f48375a
            r3.<init>(r4)
            byte[] r4 = r7.f48376c     // Catch:{ IOException -> 0x005d }
            r3.write(r4)     // Catch:{ IOException -> 0x005d }
            r3.flush()     // Catch:{ IOException -> 0x005d }
            boolean r4 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x005d }
            if (r4 == 0) goto L_0x003e
            android.os.ParcelFileDescriptor r4 = r7.f48375a     // Catch:{ IOException -> 0x005d }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x005d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005d }
            r5.<init>()     // Catch:{ IOException -> 0x005d }
            java.lang.String r6 = "processAssets: wrote data: "
            r5.append(r6)     // Catch:{ IOException -> 0x005d }
            r5.append(r4)     // Catch:{ IOException -> 0x005d }
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x005d }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x0093 }
            if (r1 == 0) goto L_0x0057
            android.os.ParcelFileDescriptor r1 = r7.f48375a     // Catch:{ IOException -> 0x0093 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0093 }
            r2.<init>()     // Catch:{ IOException -> 0x0093 }
            r2.append(r0)     // Catch:{ IOException -> 0x0093 }
            r2.append(r1)     // Catch:{ IOException -> 0x0093 }
        L_0x0057:
            r3.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0093
        L_0x005b:
            r4 = move-exception
            goto L_0x0094
        L_0x005d:
            android.os.ParcelFileDescriptor r4 = r7.f48375a     // Catch:{ all -> 0x005b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r5.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "processAssets: writing data failed: "
            r5.append(r6)     // Catch:{ all -> 0x005b }
            r5.append(r4)     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005b }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x005b }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x0091 }
            if (r1 == 0) goto L_0x008e
            android.os.ParcelFileDescriptor r1 = r7.f48375a     // Catch:{ IOException -> 0x0091 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0091 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0091 }
            r2.<init>()     // Catch:{ IOException -> 0x0091 }
            r2.append(r0)     // Catch:{ IOException -> 0x0091 }
            r2.append(r1)     // Catch:{ IOException -> 0x0091 }
        L_0x008e:
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x0093:
            return r4
        L_0x0094:
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00ae }
            if (r1 == 0) goto L_0x00ab
            android.os.ParcelFileDescriptor r1 = r7.f48375a     // Catch:{ IOException -> 0x00ae }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00ae }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ae }
            r2.<init>()     // Catch:{ IOException -> 0x00ae }
            r2.append(r0)     // Catch:{ IOException -> 0x00ae }
            r2.append(r1)     // Catch:{ IOException -> 0x00ae }
        L_0x00ab:
            r3.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzij.call():java.lang.Object");
    }
}
