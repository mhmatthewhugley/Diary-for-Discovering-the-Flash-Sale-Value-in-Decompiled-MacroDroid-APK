package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdki extends zzdij implements zzbbq {

    /* renamed from: c */
    private final Map f32377c = new WeakHashMap(1);

    /* renamed from: d */
    private final Context f32378d;

    /* renamed from: f */
    private final zzfdk f32379f;

    public zzdki(Context context, Set set, zzfdk zzfdk) {
        super(set);
        this.f32378d = context;
        this.f32379f = zzfdk;
    }

    /* renamed from: M0 */
    public final synchronized void mo44684M0(View view) {
        zzbbr zzbbr = (zzbbr) this.f32377c.get(view);
        if (zzbbr == null) {
            zzbbr = new zzbbr(this.f32378d, view);
            zzbbr.mo42398c(this);
            this.f32377c.put(view, zzbbr);
        }
        if (this.f32379f.f35517Y) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27133h1)).booleanValue()) {
                zzbbr.mo42402g(((Long) zzay.m1924c().mo42663b(zzbjc.f27123g1)).longValue());
                return;
            }
        }
        zzbbr.mo42401f();
    }

    /* renamed from: O0 */
    public final synchronized void mo42396O0(zzbbp zzbbp) {
        mo44631L0(new zzdkh(zzbbp));
    }

    /* renamed from: W0 */
    public final synchronized void mo44685W0(View view) {
        if (this.f32377c.containsKey(view)) {
            ((zzbbr) this.f32377c.get(view)).mo42400e(this);
            this.f32377c.remove(view);
        }
    }
}
