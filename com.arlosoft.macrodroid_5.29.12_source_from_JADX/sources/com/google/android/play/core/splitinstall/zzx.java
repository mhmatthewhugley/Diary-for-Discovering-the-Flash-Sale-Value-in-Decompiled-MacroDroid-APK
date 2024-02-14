package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.listener.zzc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzx extends zzc {
    @Nullable

    /* renamed from: j */
    private static zzx f51946j;

    /* renamed from: g */
    private final Handler f51947g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final zzg f51948h;

    /* renamed from: i */
    private final Set f51949i = new LinkedHashSet();

    @VisibleForTesting
    public zzx(Context context, zzg zzg) {
        super(new zzag("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f51948h = zzg;
    }

    /* renamed from: g */
    public static synchronized zzx m71229g(Context context) {
        zzx zzx;
        synchronized (zzx.class) {
            if (f51946j == null) {
                f51946j = new zzx(context, zzo.INSTANCE);
            }
            zzx = f51946j;
        }
        return zzx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59548a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            SplitInstallSessionState n = SplitInstallSessionState.m71111n(bundleExtra);
            this.f51726a.mo59805a("ListenerRegistryBroadcastReceiver.onReceive: %s", n);
            zzh zza = this.f51948h.zza();
            if (n.mo59971i() != 3 || zza == null) {
                mo60012i(n);
            } else {
                zza.mo59824a(n.mo59975m(), new zzv(this, n, intent, context));
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo60012i(SplitInstallSessionState splitInstallSessionState) {
        Iterator it = new LinkedHashSet(this.f51949i).iterator();
        while (it.hasNext()) {
            ((SplitInstallStateUpdatedListener) it.next()).mo59589a(splitInstallSessionState);
        }
        super.mo59913d(splitInstallSessionState);
    }
}
