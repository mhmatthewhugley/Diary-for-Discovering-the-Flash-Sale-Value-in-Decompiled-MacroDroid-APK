package com.google.android.gms.wearable;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.wearable.zzi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzn extends zzi {

    /* renamed from: a */
    private boolean f48470a;

    /* renamed from: b */
    private final zzm f48471b;

    /* renamed from: c */
    final /* synthetic */ WearableListenerService f48472c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzn(WearableListenerService wearableListenerService, Looper looper) {
        super(looper);
        this.f48472c = wearableListenerService;
        this.f48471b = new zzm(wearableListenerService, (zzl) null);
    }

    /* renamed from: c */
    private final synchronized void m67215c() {
        if (!this.f48470a) {
            if (Log.isLoggable("WearableLS", 2)) {
                "bindService: ".concat(String.valueOf(this.f48472c.f48107a));
            }
            WearableListenerService wearableListenerService = this.f48472c;
            wearableListenerService.bindService(wearableListenerService.f48110f, this.f48471b, 1);
            this.f48470a = true;
        }
    }

    /* renamed from: d */
    private final synchronized void m67216d(String str) {
        if (this.f48470a) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.f48472c.f48107a);
                StringBuilder sb = new StringBuilder();
                sb.append("unbindService: ");
                sb.append(str);
                sb.append(", ");
                sb.append(valueOf);
            }
            try {
                this.f48472c.unbindService(this.f48471b);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.f48470a = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54094a(Message message) {
        m67215c();
        try {
            super.mo54094a(message);
            if (!hasMessages(0)) {
                m67216d("dispatch");
            }
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                m67216d("dispatch");
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo56560b() {
        getLooper().quit();
        m67216d("quit");
    }
}
