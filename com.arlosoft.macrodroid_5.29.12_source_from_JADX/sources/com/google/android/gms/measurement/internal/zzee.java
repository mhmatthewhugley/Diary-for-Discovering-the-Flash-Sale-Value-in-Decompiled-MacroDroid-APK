package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzee implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f46667a;

    /* renamed from: c */
    final /* synthetic */ String f46668c;

    /* renamed from: d */
    final /* synthetic */ Object f46669d;

    /* renamed from: f */
    final /* synthetic */ Object f46670f;

    /* renamed from: g */
    final /* synthetic */ Object f46671g;

    /* renamed from: o */
    final /* synthetic */ zzeh f46672o;

    zzee(zzeh zzeh, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f46672o = zzeh;
        this.f46667a = i;
        this.f46668c = str;
        this.f46669d = obj;
        this.f46670f = obj2;
        this.f46671g = obj3;
    }

    public final void run() {
        zzew F = this.f46672o.f46899a.mo55189F();
        if (F.mo55246l()) {
            zzeh zzeh = this.f46672o;
            if (zzeh.f46678c == 0) {
                if (zzeh.f46899a.mo55219x().mo54925H()) {
                    zzeh zzeh2 = this.f46672o;
                    zzeh2.f46899a.mo55207h();
                    zzeh2.f46678c = 'C';
                } else {
                    zzeh zzeh3 = this.f46672o;
                    zzeh3.f46899a.mo55207h();
                    zzeh3.f46678c = 'c';
                }
            }
            zzeh zzeh4 = this.f46672o;
            if (zzeh4.f46679d < 0) {
                zzeh4.f46899a.mo55219x().mo54932o();
                zzeh4.f46679d = 74029;
            }
            char charAt = "01VDIWEA?".charAt(this.f46667a);
            zzeh zzeh5 = this.f46672o;
            String str = ExifInterface.GPS_MEASUREMENT_2D + charAt + zzeh5.f46678c + zzeh5.f46679d + ":" + zzeh.m65567y(true, this.f46668c, this.f46669d, this.f46670f, this.f46671g);
            if (str.length() > 1024) {
                str = this.f46668c.substring(0, 1024);
            }
            zzeu zzeu = F.f46737d;
            if (zzeu != null) {
                zzeu.mo55123b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f46672o.mo55095C(), "Persisted config not initialized. Not logging error/warn");
    }
}
