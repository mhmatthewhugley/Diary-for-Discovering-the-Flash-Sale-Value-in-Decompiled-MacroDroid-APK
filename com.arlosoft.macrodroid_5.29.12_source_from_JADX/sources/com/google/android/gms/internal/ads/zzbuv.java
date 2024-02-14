package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbuv implements zzbqi {

    /* renamed from: a */
    private final zzchh f27812a;

    /* renamed from: b */
    final /* synthetic */ zzbuw f27813b;

    public zzbuv(zzbuw zzbuw, zzchh zzchh) {
        this.f27813b = zzbuw;
        this.f27812a = zzchh;
    }

    /* renamed from: a */
    public final void mo42885a(JSONObject jSONObject) {
        try {
            this.f27812a.mo43574c(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f27812a.mo43575d(e);
        }
    }

    /* renamed from: o */
    public final void mo42886o(@Nullable String str) {
        if (str == null) {
            try {
                this.f27812a.mo43575d(new zzbtz());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f27812a.mo43575d(new zzbtz(str));
        }
    }
}
