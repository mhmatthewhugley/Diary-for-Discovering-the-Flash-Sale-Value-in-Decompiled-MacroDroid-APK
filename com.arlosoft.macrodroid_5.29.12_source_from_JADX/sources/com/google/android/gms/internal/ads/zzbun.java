package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbun implements zzbqi {

    /* renamed from: a */
    private final zzbtq f27795a;

    /* renamed from: b */
    private final zzchh f27796b;

    /* renamed from: c */
    final /* synthetic */ zzbuo f27797c;

    public zzbun(zzbuo zzbuo, zzbtq zzbtq, zzchh zzchh) {
        this.f27797c = zzbuo;
        this.f27795a = zzbtq;
        this.f27796b = zzchh;
    }

    /* renamed from: a */
    public final void mo42885a(JSONObject jSONObject) {
        zzbtq zzbtq;
        try {
            this.f27796b.mo43574c(this.f27797c.f27798a.mo42998a(jSONObject));
            zzbtq = this.f27795a;
        } catch (IllegalStateException unused) {
            zzbtq = this.f27795a;
        } catch (JSONException e) {
            this.f27796b.mo43575d(e);
            zzbtq = this.f27795a;
        } catch (Throwable th) {
            this.f27795a.mo42983g();
            throw th;
        }
        zzbtq.mo42983g();
    }

    /* renamed from: o */
    public final void mo42886o(@Nullable String str) {
        zzbtq zzbtq;
        if (str == null) {
            try {
                this.f27796b.mo43575d(new zzbtz());
            } catch (IllegalStateException unused) {
                zzbtq = this.f27795a;
            } catch (Throwable th) {
                this.f27795a.mo42983g();
                throw th;
            }
        } else {
            this.f27796b.mo43575d(new zzbtz(str));
        }
        zzbtq = this.f27795a;
        zzbtq.mo42983g();
    }
}
