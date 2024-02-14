package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdpp implements zzblr {

    /* renamed from: a */
    final /* synthetic */ zzdql f32732a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f32733b;

    zzdpp(zzdql zzdql, ViewGroup viewGroup) {
        this.f32732a = zzdql;
        this.f32733b = viewGroup;
    }

    /* renamed from: a */
    public final void mo42746a() {
        zzdql zzdql = this.f32732a;
        zzfvn zzfvn = zzdpm.f32714E;
        Map k = zzdql.mo44881k();
        if (k != null) {
            int size = zzfvn.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (k.get((String) zzfvn.get(i)) == null) {
                    i = i2;
                } else {
                    this.f32732a.onClick(this.f32733b);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo42747b(MotionEvent motionEvent) {
        this.f32732a.onTouch((View) null, motionEvent);
    }

    public final JSONObject zza() {
        return this.f32732a.mo44882l();
    }

    public final JSONObject zzb() {
        return this.f32732a.mo44883m();
    }
}
