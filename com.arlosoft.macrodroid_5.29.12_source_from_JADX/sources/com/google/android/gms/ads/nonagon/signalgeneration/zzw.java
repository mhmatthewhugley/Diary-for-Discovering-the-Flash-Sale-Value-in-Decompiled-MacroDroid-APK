package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfzc;
import com.google.android.gms.internal.ads.zzfzp;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzw implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzfzp f2574a;

    /* renamed from: b */
    final /* synthetic */ zzcfk f2575b;

    /* renamed from: c */
    final /* synthetic */ zzcfd f2576c;

    /* renamed from: d */
    final /* synthetic */ zzfjj f2577d;

    /* renamed from: e */
    final /* synthetic */ long f2578e;

    /* renamed from: f */
    final /* synthetic */ zzaa f2579f;

    zzw(zzaa zzaa, zzfzp zzfzp, zzcfk zzcfk, zzcfd zzcfd, zzfjj zzfjj, long j) {
        this.f2579f = zzaa;
        this.f2574a = zzfzp;
        this.f2575b = zzcfk;
        this.f2576c = zzcfd;
        this.f2577d = zzfjj;
        this.f2578e = j;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        long a = zzt.m2889b().mo21950a();
        long j = this.f2578e;
        String message = th.getMessage();
        zzt.m2904q().mo43503t(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaa = this.f2579f;
        zzf.m3062c(zzaa.f2478D, zzaa.f2498g, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(a - j)));
        zzfju pc = zzaa.m3014pc(this.f2574a, this.f2575b);
        if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
            zzfjj zzfjj = this.f2577d;
            zzfjj.mo45801o0(false);
            pc.mo45822a(zzfjj);
            pc.mo45828g();
        }
        try {
            zzcfd zzcfd = this.f2576c;
            zzcfd.mo43235t("Internal error. " + message);
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(@Nullable Object obj) {
        zzam zzam = (zzam) obj;
        zzfju pc = zzaa.m3014pc(this.f2574a, this.f2575b);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26863F6)).booleanValue()) {
            try {
                this.f2576c.mo43235t("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zzcgp.m45226d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                zzfjj zzfjj = this.f2577d;
                zzfjj.mo45801o0(false);
                pc.mo45822a(zzfjj);
                pc.mo45828g();
                return;
            }
            return;
        }
        long a = zzt.m2889b().mo21950a() - this.f2578e;
        if (zzam == null) {
            try {
                this.f2576c.mo43234F2((String) null, (String) null, (Bundle) null);
                zzaa zzaa = this.f2579f;
                zzf.m3062c(zzaa.f2478D, zzaa.f2498g, "sgs", new Pair("rid", "-1"));
                this.f2577d.mo45801o0(true);
                if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                    pc.mo45822a(this.f2577d);
                    pc.mo45828g();
                }
            } catch (RemoteException e2) {
                this.f2577d.mo45801o0(false);
                zzcgp.m45227e("", e2);
                if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                    pc.mo45822a(this.f2577d);
                    pc.mo45828g();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                    pc.mo45822a(this.f2577d);
                    pc.mo45828g();
                }
                throw th;
            }
        } else {
            try {
                String optString = new JSONObject(zzam.f2526b).optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    zzcgp.m45229g("The request ID is empty in request JSON.");
                    this.f2576c.mo43235t("Internal error: request ID is empty in request JSON.");
                    zzaa zzaa2 = this.f2579f;
                    zzf.m3062c(zzaa2.f2478D, zzaa2.f2498g, "sgf", new Pair("sgf_reason", "rid_missing"));
                    this.f2577d.mo45801o0(false);
                    if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                        pc.mo45822a(this.f2577d);
                        pc.mo45828g();
                        return;
                    }
                    return;
                }
                zzaa zzaa3 = this.f2579f;
                zzaa.m2995Qb(zzaa3, optString, zzam.f2526b, zzaa3.f2498g);
                Bundle bundle = zzam.f2527c;
                zzaa zzaa4 = this.f2579f;
                if (zzaa4.f2483I && bundle != null && bundle.getInt(zzaa4.f2485K, -1) == -1) {
                    zzaa zzaa5 = this.f2579f;
                    bundle.putInt(zzaa5.f2485K, zzaa5.f2486L.get());
                }
                zzaa zzaa6 = this.f2579f;
                if (zzaa6.f2482H && bundle != null && TextUtils.isEmpty(bundle.getString(zzaa6.f2484J))) {
                    if (TextUtils.isEmpty(this.f2579f.f2488N)) {
                        zzaa zzaa7 = this.f2579f;
                        zzs r = zzt.m2905r();
                        zzaa zzaa8 = this.f2579f;
                        zzaa7.f2488N = r.mo20412z(zzaa8.f2495c, zzaa8.f2487M.f28446a);
                    }
                    zzaa zzaa9 = this.f2579f;
                    bundle.putString(zzaa9.f2484J, zzaa9.f2488N);
                }
                this.f2576c.mo43234F2(zzam.f2525a, zzam.f2526b, bundle);
                zzaa zzaa10 = this.f2579f;
                zzf.m3062c(zzaa10.f2478D, zzaa10.f2498g, "sgs", new Pair("tqgt", String.valueOf(a)));
                this.f2577d.mo45801o0(true);
                if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                    pc.mo45822a(this.f2577d);
                    pc.mo45828g();
                }
            } catch (JSONException e3) {
                zzcgp.m45229g("Failed to create JSON object from the request string.");
                zzcfd zzcfd = this.f2576c;
                String obj2 = e3.toString();
                zzcfd.mo43235t("Internal error for request JSON: " + obj2);
                zzaa zzaa11 = this.f2579f;
                zzf.m3062c(zzaa11.f2478D, zzaa11.f2498g, "sgf", new Pair("sgf_reason", "request_invalid"));
                this.f2577d.mo45801o0(false);
                if (((Boolean) zzbkl.f27410e.mo42728e()).booleanValue() && pc != null) {
                    pc.mo45822a(this.f2577d);
                    pc.mo45828g();
                }
            }
        }
    }
}
