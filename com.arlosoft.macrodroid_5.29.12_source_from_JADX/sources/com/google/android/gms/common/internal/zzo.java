package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzo implements ServiceConnection, zzs {

    /* renamed from: a */
    private final Map f3770a = new HashMap();

    /* renamed from: c */
    private int f3771c = 2;

    /* renamed from: d */
    private boolean f3772d;
    @Nullable

    /* renamed from: f */
    private IBinder f3773f;

    /* renamed from: g */
    private final zzn f3774g;

    /* renamed from: o */
    private ComponentName f3775o;

    /* renamed from: p */
    final /* synthetic */ zzr f3776p;

    public zzo(zzr zzr, zzn zzn) {
        this.f3776p = zzr;
        this.f3774g = zzn;
    }

    /* renamed from: a */
    public final int mo21818a() {
        return this.f3771c;
    }

    /* renamed from: b */
    public final ComponentName mo21819b() {
        return this.f3775o;
    }

    @Nullable
    /* renamed from: c */
    public final IBinder mo21820c() {
        return this.f3773f;
    }

    /* renamed from: d */
    public final void mo21821d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f3770a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo21822e(String str, @Nullable Executor executor) {
        this.f3771c = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.m4908m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            zzr zzr = this.f3776p;
            boolean d = zzr.f3782j.mo21940d(zzr.f3779g, str, this.f3774g.mo21813c(zzr.f3779g), this, this.f3774g.mo21811a(), executor);
            this.f3772d = d;
            if (d) {
                this.f3776p.f3780h.sendMessageDelayed(this.f3776p.f3780h.obtainMessage(1, this.f3774g), this.f3776p.f3784l);
            } else {
                this.f3771c = 2;
                try {
                    zzr zzr2 = this.f3776p;
                    zzr2.f3782j.mo21939c(zzr2.f3779g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo21823f(ServiceConnection serviceConnection, String str) {
        this.f3770a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo21824g(String str) {
        this.f3776p.f3780h.removeMessages(1, this.f3774g);
        zzr zzr = this.f3776p;
        zzr.f3782j.mo21939c(zzr.f3779g, this);
        this.f3772d = false;
        this.f3771c = 2;
    }

    /* renamed from: h */
    public final boolean mo21825h(ServiceConnection serviceConnection) {
        return this.f3770a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo21826i() {
        return this.f3770a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo21827j() {
        return this.f3772d;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3776p.f3778f) {
            this.f3776p.f3780h.removeMessages(1, this.f3774g);
            this.f3773f = iBinder;
            this.f3775o = componentName;
            for (ServiceConnection onServiceConnected : this.f3770a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3771c = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3776p.f3778f) {
            this.f3776p.f3780h.removeMessages(1, this.f3774g);
            this.f3773f = null;
            this.f3775o = componentName;
            for (ServiceConnection onServiceDisconnected : this.f3770a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3771c = 2;
        }
    }
}
