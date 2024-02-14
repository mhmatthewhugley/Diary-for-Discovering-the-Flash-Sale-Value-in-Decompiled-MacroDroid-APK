package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvu implements zzbbq {

    /* renamed from: a */
    private zzcmp f31702a;

    /* renamed from: c */
    private final Executor f31703c;

    /* renamed from: d */
    private final zzcvg f31704d;

    /* renamed from: f */
    private final Clock f31705f;

    /* renamed from: g */
    private boolean f31706g = false;

    /* renamed from: o */
    private boolean f31707o = false;

    /* renamed from: p */
    private final zzcvj f31708p = new zzcvj();

    public zzcvu(Executor executor, zzcvg zzcvg, Clock clock) {
        this.f31703c = executor;
        this.f31704d = zzcvg;
        this.f31705f = clock;
    }

    /* renamed from: f */
    private final void m46890f() {
        try {
            JSONObject a = this.f31704d.mo42999c(this.f31708p);
            if (this.f31702a != null) {
                this.f31703c.execute(new zzcvt(this, a));
            }
        } catch (JSONException e) {
            zze.m2646l("Failed to call video active view js", e);
        }
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        boolean z;
        zzcvj zzcvj = this.f31708p;
        if (this.f31707o) {
            z = false;
        } else {
            z = zzbbp.f26529j;
        }
        zzcvj.f31659a = z;
        zzcvj.f31662d = this.f31705f.mo21952c();
        this.f31708p.f31664f = zzbbp;
        if (this.f31706g) {
            m46890f();
        }
    }

    /* renamed from: a */
    public final void mo44412a() {
        this.f31706g = false;
    }

    /* renamed from: b */
    public final void mo44413b() {
        this.f31706g = true;
        m46890f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo44414c(JSONObject jSONObject) {
        this.f31702a.mo42972d1("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: d */
    public final void mo44415d(boolean z) {
        this.f31707o = z;
    }

    /* renamed from: e */
    public final void mo44416e(zzcmp zzcmp) {
        this.f31702a = zzcmp;
    }
}
