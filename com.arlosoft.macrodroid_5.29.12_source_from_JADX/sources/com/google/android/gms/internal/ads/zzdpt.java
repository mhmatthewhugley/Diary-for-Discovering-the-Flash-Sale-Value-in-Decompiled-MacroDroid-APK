package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdpt implements View.OnClickListener {

    /* renamed from: a */
    private final zzdtn f32755a;

    /* renamed from: c */
    private final Clock f32756c;
    @Nullable

    /* renamed from: d */
    private zzbny f32757d;
    @Nullable

    /* renamed from: f */
    private zzbpu f32758f;
    @VisibleForTesting
    @Nullable

    /* renamed from: g */
    String f32759g;
    @VisibleForTesting
    @Nullable

    /* renamed from: o */
    Long f32760o;
    @VisibleForTesting
    @Nullable

    /* renamed from: p */
    WeakReference f32761p;

    public zzdpt(zzdtn zzdtn, Clock clock) {
        this.f32755a = zzdtn;
        this.f32756c = clock;
    }

    /* renamed from: f */
    private final void m47885f() {
        View view;
        this.f32759g = null;
        this.f32760o = null;
        WeakReference weakReference = this.f32761p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f32761p = null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzbny mo44905a() {
        return this.f32757d;
    }

    /* renamed from: b */
    public final void mo44906b() {
        if (this.f32757d != null && this.f32760o != null) {
            m47885f();
            try {
                this.f32757d.mo42828b();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo44907d(zzbny zzbny) {
        this.f32757d = zzbny;
        zzbpu zzbpu = this.f32758f;
        if (zzbpu != null) {
            this.f32755a.mo44982k("/unconfirmedClick", zzbpu);
        }
        zzdps zzdps = new zzdps(this, zzbny);
        this.f32758f = zzdps;
        this.f32755a.mo44980i("/unconfirmedClick", zzdps);
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.f32761p;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f32759g == null || this.f32760o == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f32759g);
                hashMap.put("time_interval", String.valueOf(this.f32756c.mo21950a() - this.f32760o.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f32755a.mo44978g("sendMessageToNativeJs", hashMap);
            }
            m47885f();
        }
    }
}
