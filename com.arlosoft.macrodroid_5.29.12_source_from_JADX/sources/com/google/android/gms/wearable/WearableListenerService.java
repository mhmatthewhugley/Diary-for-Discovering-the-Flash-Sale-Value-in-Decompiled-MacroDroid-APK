package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.internal.zzbc;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class WearableListenerService extends Service implements DataApi.DataListener, MessageApi.MessageListener, CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, MessageClient.RpcService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ComponentName f48107a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzn f48108c;

    /* renamed from: d */
    private IBinder f48109d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Intent f48110f;

    /* renamed from: g */
    private Looper f48111g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Object f48112o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f48113p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public zzbc f48114s = new zzbc(new zzk(this, (zzj) null));

    /* renamed from: a */
    public void mo56174a(@NonNull CapabilityInfo capabilityInfo) {
    }

    @ShowFirstParty
    @Nullable
    /* renamed from: b */
    public Task<byte[]> mo56213b(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        return null;
    }

    /* renamed from: c */
    public void mo56181c(@NonNull Channel channel, int i, int i2) {
    }

    /* renamed from: d */
    public void mo56182d(@NonNull Channel channel, int i, int i2) {
    }

    /* renamed from: e */
    public void mo56196e(@NonNull DataEventBuffer dataEventBuffer) {
    }

    /* renamed from: f */
    public void mo56183f(@NonNull Channel channel) {
    }

    /* renamed from: g */
    public void mo24754g(@NonNull MessageEvent messageEvent) {
    }

    /* renamed from: h */
    public void mo56184h(@NonNull Channel channel, int i, int i2) {
    }

    @NonNull
    /* renamed from: i */
    public Looper mo56240i() {
        if (this.f48111g == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f48111g = handlerThread.getLooper();
        }
        return this.f48111g;
    }

    /* renamed from: j */
    public void mo56241j(@NonNull ChannelClient.Channel channel, int i, int i2) {
    }

    /* renamed from: k */
    public void mo56242k(@NonNull ChannelClient.Channel channel) {
    }

    /* renamed from: l */
    public void mo56243l(@NonNull List<Node> list) {
    }

    @ShowFirstParty
    /* renamed from: m */
    public void mo56244m(zza zza) {
    }

    /* renamed from: n */
    public void mo56245n(@NonNull ChannelClient.Channel channel, int i, int i2) {
    }

    @ShowFirstParty
    /* renamed from: o */
    public void mo56246o(zzb zzb) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder onBind(@androidx.annotation.NonNull android.content.Intent r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r9.getAction()
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            int r2 = r1.hashCode()
            r3 = 5
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 3
            switch(r2) {
                case -1487371046: goto L_0x004a;
                case -1140095138: goto L_0x0040;
                case -786751258: goto L_0x0036;
                case 915816236: goto L_0x002c;
                case 1003809169: goto L_0x0022;
                case 1460975593: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0054
        L_0x0018:
            java.lang.String r2 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 0
            goto L_0x0055
        L_0x0022:
            java.lang.String r2 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 2
            goto L_0x0055
        L_0x002c:
            java.lang.String r2 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0036:
            java.lang.String r2 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 4
            goto L_0x0055
        L_0x0040:
            java.lang.String r2 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 3
            goto L_0x0055
        L_0x004a:
            java.lang.String r2 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0054
            r1 = 5
            goto L_0x0055
        L_0x0054:
            r1 = -1
        L_0x0055:
            if (r1 == 0) goto L_0x0080
            if (r1 == r6) goto L_0x0080
            if (r1 == r5) goto L_0x0080
            if (r1 == r7) goto L_0x0080
            if (r1 == r4) goto L_0x0080
            if (r1 == r3) goto L_0x0080
            java.lang.String r1 = "WearableLS"
            boolean r1 = android.util.Log.isLoggable(r1, r7)
            if (r1 == 0) goto L_0x007f
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBind: Provided bind intent ("
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = ") is not allowed"
            r1.append(r9)
        L_0x007f:
            return r0
        L_0x0080:
            android.os.IBinder r9 = r8.f48109d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.WearableListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    public void onCreate() {
        super.onCreate();
        this.f48107a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            "onCreate: ".concat(String.valueOf(this.f48107a));
        }
        this.f48108c = new zzn(this, mo56240i());
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f48110f = intent;
        intent.setComponent(this.f48107a);
        this.f48109d = new zzaa(this, (zzz) null);
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            "onDestroy: ".concat(String.valueOf(this.f48107a));
        }
        synchronized (this.f48112o) {
            this.f48113p = true;
            zzn zzn = this.f48108c;
            if (zzn != null) {
                zzn.mo56560b();
            } else {
                String valueOf = String.valueOf(this.f48107a);
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + valueOf);
            }
        }
        super.onDestroy();
    }

    /* renamed from: p */
    public void mo56250p(@NonNull ChannelClient.Channel channel, int i, int i2) {
    }

    /* renamed from: q */
    public void mo32012q(@NonNull Node node) {
    }

    /* renamed from: r */
    public void mo32013r(@NonNull Node node) {
    }
}
