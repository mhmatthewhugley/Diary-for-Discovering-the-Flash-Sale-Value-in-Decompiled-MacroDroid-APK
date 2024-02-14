package com.google.android.gms.cloudmessaging;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zzf implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ zzm f2984a;

    public /* synthetic */ zzf(zzm zzm) {
        this.f2984a = zzm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r2.mo21112c(new com.google.android.gms.cloudmessaging.zzq(4, "Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        r2.mo21110a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            com.google.android.gms.cloudmessaging.zzm r0 = r4.f2984a
            int r1 = r5.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x001c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Received response to request: "
            r2.append(r3)
            r2.append(r1)
        L_0x001c:
            monitor-enter(r0)
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r2 = r0.f2996g     // Catch:{ all -> 0x006a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x006a }
            com.google.android.gms.cloudmessaging.zzp r2 = (com.google.android.gms.cloudmessaging.zzp) r2     // Catch:{ all -> 0x006a }
            if (r2 != 0) goto L_0x0041
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r2 = 50
            r5.<init>(r2)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "Received response for unknown request: "
            r5.append(r2)     // Catch:{ all -> 0x006a }
            r5.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "MessengerIpcClient"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006a }
            android.util.Log.w(r1, r5)     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0041:
            android.util.SparseArray<com.google.android.gms.cloudmessaging.zzp<?>> r3 = r0.f2996g     // Catch:{ all -> 0x006a }
            r3.remove(r1)     // Catch:{ all -> 0x006a }
            r0.mo21105f()     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.cloudmessaging.zzq r5 = new com.google.android.gms.cloudmessaging.zzq
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r3 = 0
            r5.<init>(r0, r1, r3)
            r2.mo21112c(r5)
            goto L_0x0068
        L_0x0065:
            r2.mo21110a(r5)
        L_0x0068:
            r5 = 1
            return r5
        L_0x006a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzf.handleMessage(android.os.Message):boolean");
    }
}
