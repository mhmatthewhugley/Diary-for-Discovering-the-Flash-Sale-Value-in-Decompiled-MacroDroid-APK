package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class VideoController {

    /* renamed from: a */
    private final Object f1717a = new Object();
    @Nullable

    /* renamed from: b */
    private zzdk f1718b;
    @Nullable

    /* renamed from: c */
    private VideoLifecycleCallbacks f1719c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class VideoLifecycleCallbacks {
        /* renamed from: a */
        public void mo19755a() {
        }

        /* renamed from: b */
        public void mo19756b(boolean z) {
        }

        /* renamed from: c */
        public void mo19757c() {
        }

        /* renamed from: d */
        public void mo19758d() {
        }

        /* renamed from: e */
        public void mo19759e() {
        }
    }

    /* renamed from: a */
    public void mo19752a(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfe zzfe;
        synchronized (this.f1717a) {
            this.f1719c = videoLifecycleCallbacks;
            zzdk zzdk = this.f1718b;
            if (zzdk != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfe = null;
                } else {
                    try {
                        zzfe = new zzfe(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        zzcgp.m45227e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                zzdk.mo19998E6(zzfe);
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public final zzdk mo19753b() {
        zzdk zzdk;
        synchronized (this.f1717a) {
            zzdk = this.f1718b;
        }
        return zzdk;
    }

    /* renamed from: c */
    public final void mo19754c(@Nullable zzdk zzdk) {
        synchronized (this.f1717a) {
            this.f1718b = zzdk;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.f1719c;
            if (videoLifecycleCallbacks != null) {
                mo19752a(videoLifecycleCallbacks);
            }
        }
    }
}
