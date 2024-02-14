package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class TaggingLibraryJsInterface {

    /* renamed from: a */
    private final Context f2460a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WebView f2461b;

    /* renamed from: c */
    private final zzape f2462c;

    /* renamed from: d */
    private final int f2463d = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27100d8)).intValue();

    /* renamed from: e */
    private final zzdxv f2464e;

    /* renamed from: f */
    private final boolean f2465f = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27110e8)).booleanValue();

    TaggingLibraryJsInterface(WebView webView, zzape zzape, zzdxv zzdxv) {
        this.f2461b = webView;
        Context context = webView.getContext();
        this.f2460a = context;
        this.f2462c = zzape;
        this.f2464e = zzdxv;
        zzbjc.m43542c(context);
    }

    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(String str) {
        try {
            long a = zzt.m2889b().mo21950a();
            String e = this.f2462c.mo41776c().mo20431e(this.f2460a, str, this.f2461b);
            if (this.f2465f) {
                long a2 = zzt.m2889b().mo21950a() - a;
                zzf.m3062c(this.f2464e, (zzdxl) null, "csg", new Pair("clat", String.valueOf(a2)));
            }
            return e;
        } catch (RuntimeException e2) {
            zzcgp.m45227e("Exception getting click signals. ", e2);
            zzt.m2904q().mo43503t(e2, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            zzcgp.m45226d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.f2463d);
        try {
            return (String) zzchc.f28456a.mo46579F(new zzao(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcgp.m45227e("Exception getting click signals with timeout. ", e);
            zzt.m2904q().mo43503t(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        zzt.m2905r();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f2460a;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.mo19670b(AdMobAdapter.class, bundle);
        QueryInfo.m3084a(context, adFormat, builder.mo19671c(), new zzap(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long a = zzt.m2889b().mo21950a();
            String g = this.f2462c.mo41776c().mo20433g(this.f2460a, this.f2461b, (Activity) null);
            if (this.f2465f) {
                long a2 = zzt.m2889b().mo21950a() - a;
                zzf.m3062c(this.f2464e, (zzdxl) null, "vsg", new Pair("vlat", String.valueOf(a2)));
            }
            return g;
        } catch (RuntimeException e) {
            zzcgp.m45227e("Exception getting view signals. ", e);
            zzt.m2904q().mo43503t(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzcgp.m45226d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.f2463d);
        try {
            return (String) zzchc.f28456a.mo46579F(new zzan(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcgp.m45227e("Exception getting view signals with timeout. ", e);
            zzt.m2904q().mo43503t(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.f2462c.mo41777d(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e) {
                e = e;
                zzcgp.m45227e("Failed to parse the touch string. ", e);
                zzt.m2904q().mo43503t(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e2) {
            e = e2;
            zzcgp.m45227e("Failed to parse the touch string. ", e);
            zzt.m2904q().mo43503t(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
