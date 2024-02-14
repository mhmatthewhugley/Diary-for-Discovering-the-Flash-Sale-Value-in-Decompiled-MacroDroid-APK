package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.wearable.zzd;
import com.google.android.gms.internal.wearable.zzh;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.zze;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzim extends GmsClient {

    /* renamed from: Z */
    private final ExecutorService f48388Z;

    /* renamed from: a0 */
    private final zzff f48389a0 = new zzff();

    /* renamed from: b0 */
    private final zzff f48390b0 = new zzff();

    /* renamed from: c0 */
    private final zzff f48391c0 = new zzff();

    /* renamed from: d0 */
    private final zzff f48392d0 = new zzff();

    /* renamed from: e0 */
    private final zzff f48393e0 = new zzff();

    /* renamed from: f0 */
    private final zzff f48394f0 = new zzff();

    /* renamed from: g0 */
    private final zzff f48395g0 = new zzff();

    /* renamed from: h0 */
    private final zzff f48396h0 = new zzff();

    /* renamed from: i0 */
    private final zzff f48397i0 = new zzff();

    /* renamed from: j0 */
    private final zzff f48398j0 = new zzff();

    /* renamed from: k0 */
    private final zziu f48399k0;

    /* renamed from: l0 */
    private final File f48400l0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzim(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zzh.m64560a();
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        zziu a = zziu.m67180a(context);
        this.f48388Z = (ExecutorService) Preconditions.m4488k(unconfigurableExecutorService);
        this.f48399k0 = a;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        this.f48400l0 = file;
    }

    /* renamed from: A */
    public final Feature[] mo21618A() {
        return zze.f48468o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56504A0(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r14, com.google.android.gms.wearable.PutDataRequest r15) throws android.os.RemoteException {
        /*
            r13 = this;
            java.util.Map r0 = r15.mo56229m2()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.wearable.Asset r1 = (com.google.android.gms.wearable.Asset) r1
            byte[] r2 = r1.mo56171q2()
            if (r2 != 0) goto L_0x000c
            java.lang.String r2 = r1.mo56168n2()
            if (r2 != 0) goto L_0x000c
            android.os.ParcelFileDescriptor r2 = r1.mo56169o2()
            if (r2 != 0) goto L_0x000c
            android.net.Uri r2 = r1.mo56170p2()
            if (r2 == 0) goto L_0x0037
            goto L_0x000c
        L_0x0037:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            android.net.Uri r15 = r15.mo56230n2()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Put for "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " contains invalid asset: "
            r1.append(r15)
            r1.append(r0)
            java.lang.String r15 = r1.toString()
            r14.<init>(r15)
            throw r14
        L_0x0062:
            android.net.Uri r0 = r15.mo56230n2()
            com.google.android.gms.wearable.PutDataRequest r0 = com.google.android.gms.wearable.PutDataRequest.m66812t2(r0)
            byte[] r1 = r15.getData()
            r0.mo56233q2(r1)
            boolean r1 = r15.mo56231o2()
            if (r1 == 0) goto L_0x007a
            r0.mo56234r2()
        L_0x007a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r2 = r15.mo56229m2()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            com.google.android.gms.wearable.Asset r4 = (com.google.android.gms.wearable.Asset) r4
            byte[] r5 = r4.mo56171q2()
            java.lang.String r6 = "WearableClient"
            if (r5 == 0) goto L_0x0118
            android.os.ParcelFileDescriptor[] r5 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ IOException -> 0x0107 }
            r7 = 3
            boolean r6 = android.util.Log.isLoggable(r6, r7)
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x00df
            java.lang.String r6 = java.lang.String.valueOf(r4)
            r9 = r5[r8]
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r10 = r5[r7]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "processAssets: replacing data with FD in asset: "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r6 = " read:"
            r11.append(r6)
            r11.append(r9)
            java.lang.String r6 = " write:"
            r11.append(r6)
            r11.append(r10)
        L_0x00df:
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r6 = r5[r8]
            com.google.android.gms.wearable.Asset r6 = com.google.android.gms.wearable.Asset.m66763l2(r6)
            r0.mo56232p2(r3, r6)
            r3 = r5[r7]
            byte[] r4 = r4.mo56171q2()
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask
            com.google.android.gms.wearable.internal.zzij r6 = new com.google.android.gms.wearable.internal.zzij
            r6.<init>(r13, r3, r4)
            r5.<init>(r6)
            r1.add(r5)
            java.util.concurrent.ExecutorService r3 = r13.f48388Z
            r3.submit(r5)
            goto L_0x008b
        L_0x0107:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "Unable to create ParcelFileDescriptor for asset in request: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15, r14)
            throw r0
        L_0x0118:
            android.net.Uri r5 = r4.mo56170p2()
            r7 = 4005(0xfa5, float:5.612E-42)
            r8 = 0
            if (r5 == 0) goto L_0x0161
            android.content.Context r5 = r13.mo21621D()     // Catch:{ FileNotFoundException -> 0x0142 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0142 }
            android.net.Uri r9 = r4.mo56170p2()     // Catch:{ FileNotFoundException -> 0x0142 }
            java.lang.String r10 = "r"
            android.os.ParcelFileDescriptor r5 = r5.openFileDescriptor(r9, r10)     // Catch:{ FileNotFoundException -> 0x0142 }
            com.google.android.gms.wearable.Asset r5 = com.google.android.gms.wearable.Asset.m66763l2(r5)     // Catch:{ FileNotFoundException -> 0x0142 }
            java.lang.Object r3 = r3.getKey()     // Catch:{ FileNotFoundException -> 0x0142 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ FileNotFoundException -> 0x0142 }
            r0.mo56232p2(r3, r5)     // Catch:{ FileNotFoundException -> 0x0142 }
            goto L_0x008b
        L_0x0142:
            com.google.android.gms.wearable.internal.zzid r15 = new com.google.android.gms.wearable.internal.zzid
            r15.<init>(r14, r1)
            com.google.android.gms.wearable.internal.zzgu r14 = new com.google.android.gms.wearable.internal.zzgu
            r14.<init>(r7, r8)
            r15.mo56275d9(r14)
            android.net.Uri r14 = r4.mo56170p2()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "Couldn't resolve asset URI: "
            java.lang.String r14 = r15.concat(r14)
            android.util.Log.w(r6, r14)
            return
        L_0x0161:
            android.os.ParcelFileDescriptor r5 = r4.mo56169o2()
            if (r5 == 0) goto L_0x01cd
            android.os.ParcelFileDescriptor r5 = r4.mo56169o2()     // Catch:{ IOException -> 0x018f, all -> 0x018d }
            java.io.File r9 = r13.f48400l0     // Catch:{ IOException -> 0x018f, all -> 0x018d }
            java.io.File r5 = com.google.android.gms.internal.wearable.zzj.m64562a(r5, r9)     // Catch:{ IOException -> 0x018f, all -> 0x018d }
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r9 = android.os.ParcelFileDescriptor.open(r5, r9)     // Catch:{ IOException -> 0x018b }
            com.google.android.gms.wearable.Asset r9 = com.google.android.gms.wearable.Asset.m66763l2(r9)     // Catch:{ IOException -> 0x018b }
            java.lang.Object r3 = r3.getKey()     // Catch:{ IOException -> 0x018b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x018b }
            r0.mo56232p2(r3, r9)     // Catch:{ IOException -> 0x018b }
            if (r5 == 0) goto L_0x008b
            r5.delete()
            goto L_0x008b
        L_0x018b:
            r15 = move-exception
            goto L_0x0191
        L_0x018d:
            r14 = move-exception
            goto L_0x01c7
        L_0x018f:
            r15 = move-exception
            r5 = r8
        L_0x0191:
            java.lang.String r0 = "DataItem asset copy failed"
            android.util.Log.w(r6, r0, r15)     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.wearable.internal.zzid r15 = new com.google.android.gms.wearable.internal.zzid     // Catch:{ all -> 0x01c5 }
            r15.<init>(r14, r1)     // Catch:{ all -> 0x01c5 }
            com.google.android.gms.wearable.internal.zzgu r14 = new com.google.android.gms.wearable.internal.zzgu     // Catch:{ all -> 0x01c5 }
            r14.<init>(r7, r8)     // Catch:{ all -> 0x01c5 }
            r15.mo56275d9(r14)     // Catch:{ all -> 0x01c5 }
            android.os.ParcelFileDescriptor r14 = r4.mo56169o2()     // Catch:{ all -> 0x01c5 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r15.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "Couldn't asset from a file descriptor: "
            r15.append(r0)     // Catch:{ all -> 0x01c5 }
            r15.append(r14)     // Catch:{ all -> 0x01c5 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x01c5 }
            android.util.Log.w(r6, r14)     // Catch:{ all -> 0x01c5 }
            if (r5 == 0) goto L_0x01c4
            r5.delete()
        L_0x01c4:
            return
        L_0x01c5:
            r14 = move-exception
            r8 = r5
        L_0x01c7:
            if (r8 == 0) goto L_0x01cc
            r8.delete()
        L_0x01cc:
            throw r14
        L_0x01cd:
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.mo56232p2(r3, r4)
            goto L_0x008b
        L_0x01d8:
            android.os.IInterface r15 = r13.mo21626I()
            com.google.android.gms.wearable.internal.zzfb r15 = (com.google.android.gms.wearable.internal.zzfb) r15
            com.google.android.gms.wearable.internal.zzid r2 = new com.google.android.gms.wearable.internal.zzid
            r2.<init>(r14, r1)
            r15.mo56439Zb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzim.mo56504A0(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder, com.google.android.gms.wearable.PutDataRequest):void");
    }

    /* renamed from: B0 */
    public final void mo56505B0(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, boolean z) {
        try {
            ExecutorService executorService = this.f48388Z;
            Preconditions.m4488k(resultHolder);
            Preconditions.m4488k(str);
            Preconditions.m4488k(uri);
            executorService.execute(new zzik(this, uri, resultHolder, z, str));
        } catch (RuntimeException e) {
            resultHolder.mo21321b(new Status(8));
            throw e;
        }
    }

    /* renamed from: C0 */
    public final void mo56506C0(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener) throws RemoteException {
        this.f48398j0.mo56451c(this, resultHolder, capabilityListener);
    }

    /* renamed from: D0 */
    public final void mo56507D0(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, String str) throws RemoteException {
        if (str == null) {
            this.f48391c0.mo56451c(this, resultHolder, channelListener);
            return;
        }
        this.f48391c0.mo56451c(this, resultHolder, new zzhe(str, channelListener));
    }

    /* renamed from: E0 */
    public final void mo56508E0(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener) throws RemoteException {
        this.f48393e0.mo56451c(this, resultHolder, dataListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo21029J() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo21030K() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final String mo21627L() {
        return this.f48399k0.mo56521b("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo21634S(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
        }
        if (i == 0) {
            this.f48389a0.mo56450b(iBinder);
            this.f48390b0.mo56450b(iBinder);
            this.f48391c0.mo56450b(iBinder);
            this.f48393e0.mo56450b(iBinder);
            this.f48394f0.mo56450b(iBinder);
            this.f48395g0.mo56450b(iBinder);
            this.f48396h0.mo56450b(iBinder);
            this.f48397i0.mo56450b(iBinder);
            this.f48398j0.mo56450b(iBinder);
            this.f48392d0.mo56450b(iBinder);
            i = 0;
        }
        super.mo21634S(i, iBinder, bundle, i2);
    }

    /* renamed from: X */
    public final boolean mo21639X() {
        return true;
    }

    /* renamed from: h */
    public final void mo21646h(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!mo21647i()) {
            try {
                Bundle bundle = mo21621D().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i);
                    Context D = mo21621D();
                    Context D2 = mo21621D();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (D2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo21638W(connectionProgressReportCallbacks, 6, PendingIntent.getActivity(D, 0, intent, zzd.f45669a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                mo21638W(connectionProgressReportCallbacks, 16, (PendingIntent) null);
                return;
            }
        }
        super.mo21646h(connectionProgressReportCallbacks);
    }

    /* renamed from: i */
    public final boolean mo21647i() {
        return !this.f48399k0.mo56521b("com.google.android.wearable.app.cn");
    }

    /* renamed from: q */
    public final int mo21032q() {
        return 8600000;
    }

    /* renamed from: r0 */
    public final void mo56509r0(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener) throws RemoteException {
        this.f48394f0.mo56451c(this, resultHolder, messageListener);
    }

    /* renamed from: s0 */
    public final void mo56510s0(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService) throws RemoteException {
        this.f48395g0.mo56451c(this, resultHolder, rpcService);
    }

    /* renamed from: t0 */
    public final void mo56511t0(BaseImplementation.ResultHolder resultHolder, String str, Uri uri, long j, long j2) {
        try {
            ExecutorService executorService = this.f48388Z;
            Preconditions.m4488k(resultHolder);
            Preconditions.m4488k(str);
            Preconditions.m4488k(uri);
            Preconditions.m4480c(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
            Preconditions.m4480c(j2 >= -1, "invalid length: %s", Long.valueOf(j2));
            executorService.execute(new zzil(this, uri, resultHolder, str, j, j2));
        } catch (RuntimeException e) {
            BaseImplementation.ResultHolder resultHolder2 = resultHolder;
            resultHolder.mo21321b(new Status(8));
            throw e;
        }
    }

    /* renamed from: u0 */
    public final void mo56512u0(BaseImplementation.ResultHolder resultHolder, CapabilityApi.CapabilityListener capabilityListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.f48398j0.mo56449a(this, resultHolder, capabilityListener, zzit.m67166t1(listenerHolder, intentFilterArr));
    }

    /* renamed from: v0 */
    public final void mo56513v0(BaseImplementation.ResultHolder resultHolder, ChannelApi.ChannelListener channelListener, ListenerHolder listenerHolder, String str, IntentFilter[] intentFilterArr) throws RemoteException {
        if (str == null) {
            this.f48391c0.mo56449a(this, resultHolder, channelListener, zzit.m67157A1(listenerHolder, intentFilterArr));
            return;
        }
        this.f48391c0.mo56449a(this, resultHolder, new zzhe(str, channelListener), zzit.m67163g8(listenerHolder, str, intentFilterArr));
    }

    /* renamed from: w0 */
    public final void mo56514w0(BaseImplementation.ResultHolder resultHolder, DataApi.DataListener dataListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.f48393e0.mo56449a(this, resultHolder, dataListener, zzit.m67162Z8(listenerHolder, intentFilterArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo21035x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof zzfb ? (zzfb) queryLocalInterface : new zzfb(iBinder);
    }

    /* renamed from: x0 */
    public final void mo56515x0(BaseImplementation.ResultHolder resultHolder, MessageApi.MessageListener messageListener, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.f48394f0.mo56449a(this, resultHolder, messageListener, zzit.m67164ia(listenerHolder, intentFilterArr));
    }

    /* renamed from: y0 */
    public final void mo56516y0(BaseImplementation.ResultHolder resultHolder, MessageClient.RpcService rpcService, ListenerHolder listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.f48395g0.mo56449a(this, resultHolder, rpcService, zzit.m67165sb(listenerHolder, intentFilterArr));
    }

    /* renamed from: z0 */
    public final void mo56517z0(BaseImplementation.ResultHolder resultHolder, Asset asset) throws RemoteException {
        ((zzfb) mo21626I()).mo56434Vb(new zzhz(resultHolder), asset);
    }
}
