package com.google.android.gms.wearable;

import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zzbf;
import com.google.android.gms.wearable.internal.zzev;
import com.google.android.gms.wearable.internal.zzez;
import com.google.android.gms.wearable.internal.zzfx;
import com.google.android.gms.wearable.internal.zzgm;
import com.google.android.gms.wearable.internal.zzi;
import com.google.android.gms.wearable.internal.zziu;
import com.google.android.gms.wearable.internal.zzl;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzaa extends zzez {

    /* renamed from: a */
    private volatile int f48452a = -1;

    /* renamed from: c */
    final /* synthetic */ WearableListenerService f48453c;

    /* synthetic */ zzaa(WearableListenerService wearableListenerService, zzz zzz) {
        this.f48453c = wearableListenerService;
    }

    /* renamed from: A1 */
    static final /* synthetic */ void m67196A1(zzev zzev, Task task) {
        if (task.mo23719t()) {
            m67197Z8(zzev, true, (byte[]) task.mo23715p());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.mo23714o());
        m67197Z8(zzev, false, (byte[]) null);
    }

    /* renamed from: Z8 */
    private static final void m67197Z8(zzev zzev, boolean z, byte[] bArr) {
        try {
            zzev.mo56409g8(z, bArr);
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    /* renamed from: g8 */
    private final boolean m67198g8(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            String.format("%s: %s %s", new Object[]{str, this.f48453c.f48107a.toString(), obj});
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f48452a) {
            if (zziu.m67180a(this.f48453c).mo56521b("com.google.android.wearable.app.cn") && UidVerifier.m4914b(this.f48453c, callingUid, "com.google.android.wearable.app.cn")) {
                this.f48452a = callingUid;
            } else if (UidVerifier.m4913a(this.f48453c, callingUid)) {
                this.f48452a = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        synchronized (this.f48453c.f48112o) {
            WearableListenerService wearableListenerService = this.f48453c;
            if (wearableListenerService.f48113p) {
                return false;
            }
            wearableListenerService.f48108c.post(runnable);
            return true;
        }
    }

    /* renamed from: Ba */
    public final void mo56411Ba(zzbf zzbf) {
        m67198g8(new zzy(this, zzbf), "onChannelEvent", zzbf);
    }

    /* renamed from: G1 */
    public final void mo56412G1(zzfx zzfx) {
        m67198g8(new zzr(this, zzfx), "onMessageReceived", zzfx);
    }

    /* renamed from: Ta */
    public final void mo56413Ta(zzgm zzgm) {
        m67198g8(new zzt(this, zzgm), "onPeerDisconnected", zzgm);
    }

    /* renamed from: V0 */
    public final void mo56414V0(DataHolder dataHolder) {
        zzq zzq = new zzq(this, dataHolder);
        try {
            String valueOf = String.valueOf(dataHolder);
            int count = dataHolder.getCount();
            if (m67198g8(zzq, "onDataItemChanged", valueOf + ", rows=" + count)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    /* renamed from: a7 */
    public final void mo56415a7(zzi zzi) {
        m67198g8(new zzx(this, zzi), "onEntityUpdate", zzi);
    }

    /* renamed from: b1 */
    public final void mo56416b1(List list) {
        m67198g8(new zzu(this, list), "onConnectedNodes", list);
    }

    /* renamed from: jb */
    public final void mo56417jb(zzgm zzgm) {
        m67198g8(new zzs(this, zzgm), "onPeerConnected", zzgm);
    }

    /* renamed from: ra */
    public final void mo56418ra(zzl zzl) {
        m67198g8(new zzw(this, zzl), "onNotificationReceived", zzl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public final /* synthetic */ void mo56549t1(zzfx zzfx, zzev zzev) {
        Task<byte[]> b = this.f48453c.mo56213b(zzfx.mo56453l2(), zzfx.getPath(), zzfx.getData());
        if (b == null) {
            m67197Z8(zzev, false, (byte[]) null);
        } else {
            b.mo23702c(new zzo(this, zzev, (byte[]) null));
        }
    }

    /* renamed from: u5 */
    public final void mo56419u5(zzfx zzfx, zzev zzev) {
        m67198g8(new zzp(this, zzfx, zzev, (byte[]) null), "onRequestReceived", zzfx);
    }

    /* renamed from: ua */
    public final void mo56420ua(zzao zzao) {
        m67198g8(new zzv(this, zzao), "onConnectedCapabilityChanged", zzao);
    }
}
