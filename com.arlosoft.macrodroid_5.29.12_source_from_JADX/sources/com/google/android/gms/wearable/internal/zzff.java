package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzff {

    /* renamed from: a */
    private final Map f48290a = new HashMap();

    zzff() {
    }

    /* renamed from: a */
    public final void mo56449a(zzim zzim, BaseImplementation.ResultHolder resultHolder, Object obj, zzit zzit) throws RemoteException {
        synchronized (this.f48290a) {
            if (this.f48290a.get(obj) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append("duplicate listener: ");
                    sb.append(valueOf);
                }
                resultHolder.mo21038a(new Status(4001));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("new listener: ");
                sb2.append(valueOf2);
            }
            this.f48290a.put(obj, zzit);
            try {
                ((zzfb) zzim.mo21626I()).mo56446sb(new zzfd(this.f48290a, obj, resultHolder), new zzd(zzit));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(obj);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("addListener failed, removing listener: ");
                    sb3.append(valueOf3);
                }
                this.f48290a.remove(obj);
                throw e;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = java.lang.String.valueOf(r3.getKey());
        r4 = java.lang.String.valueOf(r4);
        android.util.Log.w("WearableClient", "onPostInitHandler: Didn't add: " + r3 + "/" + r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56450b(android.os.IBinder r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.f48290a
            monitor-enter(r0)
            if (r10 != 0) goto L_0x0007
            r10 = 0
            goto L_0x001b
        L_0x0007:
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)     // Catch:{ all -> 0x009c }
            boolean r2 = r1 instanceof com.google.android.gms.wearable.internal.zzfb     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0015
            r10 = r1
            com.google.android.gms.wearable.internal.zzfb r10 = (com.google.android.gms.wearable.internal.zzfb) r10     // Catch:{ all -> 0x009c }
            goto L_0x001b
        L_0x0015:
            com.google.android.gms.wearable.internal.zzfb r1 = new com.google.android.gms.wearable.internal.zzfb     // Catch:{ all -> 0x009c }
            r1.<init>(r10)     // Catch:{ all -> 0x009c }
            r10 = r1
        L_0x001b:
            com.google.android.gms.wearable.internal.zzib r1 = new com.google.android.gms.wearable.internal.zzib     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
            java.util.Map r2 = r9.f48290a     // Catch:{ all -> 0x009c }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x009c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x009c }
        L_0x002a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x009a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009c }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x009c }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x009c }
            com.google.android.gms.wearable.internal.zzit r4 = (com.google.android.gms.wearable.internal.zzit) r4     // Catch:{ all -> 0x009c }
            com.google.android.gms.wearable.internal.zzd r5 = new com.google.android.gms.wearable.internal.zzd     // Catch:{ RemoteException -> 0x006f }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x006f }
            r10.mo56446sb(r1, r5)     // Catch:{ RemoteException -> 0x006f }
            java.lang.String r5 = "WearableClient"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ RemoteException -> 0x006f }
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r3.getKey()     // Catch:{ RemoteException -> 0x006f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x006f }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x006f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x006f }
            r7.<init>()     // Catch:{ RemoteException -> 0x006f }
            java.lang.String r8 = "onPostInitHandler: added: "
            r7.append(r8)     // Catch:{ RemoteException -> 0x006f }
            r7.append(r5)     // Catch:{ RemoteException -> 0x006f }
            java.lang.String r5 = "/"
            r7.append(r5)     // Catch:{ RemoteException -> 0x006f }
            r7.append(r6)     // Catch:{ RemoteException -> 0x006f }
            goto L_0x002a
        L_0x006f:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x009c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x009c }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r5.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "onPostInitHandler: Didn't add: "
            r5.append(r6)     // Catch:{ all -> 0x009c }
            r5.append(r3)     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch:{ all -> 0x009c }
            r5.append(r4)     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "WearableClient"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x009c }
            android.util.Log.w(r3, r4)     // Catch:{ all -> 0x009c }
            goto L_0x002a
        L_0x009a:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return
        L_0x009c:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzff.mo56450b(android.os.IBinder):void");
    }

    /* renamed from: c */
    public final void mo56451c(zzim zzim, BaseImplementation.ResultHolder resultHolder, Object obj) throws RemoteException {
        synchronized (this.f48290a) {
            zzit zzit = (zzit) this.f48290a.remove(obj);
            if (zzit == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append("remove Listener unknown: ");
                    sb.append(valueOf);
                }
                resultHolder.mo21038a(new Status(4002));
                return;
            }
            zzit.mo56519p();
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("service.removeListener: ");
                sb2.append(valueOf2);
            }
            ((zzfb) zzim.mo21626I()).mo56441bc(new zzfe(this.f48290a, obj, resultHolder), new zzgw(zzit));
        }
    }
}
