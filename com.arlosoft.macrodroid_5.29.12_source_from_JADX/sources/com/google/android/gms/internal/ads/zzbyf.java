package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzbyf {

    /* renamed from: a */
    private final zzcmp f27994a;

    /* renamed from: b */
    private final String f27995b;

    public zzbyf(zzcmp zzcmp, String str) {
        this.f27994a = zzcmp;
        this.f27995b = str;
    }

    /* renamed from: b */
    public final void mo43217b(int i, int i2, int i3, int i4) {
        try {
            this.f27994a.mo42953b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo43218c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f27995b);
            zzcmp zzcmp = this.f27994a;
            if (zzcmp != null) {
                zzcmp.mo42953b("onError", put);
            }
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void mo43219d(String str) {
        try {
            this.f27994a.mo42953b("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void mo43220e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f27994a.mo42953b("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put(Key.ROTATION, i5));
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void mo43221f(int i, int i2, int i3, int i4) {
        try {
            this.f27994a.mo42953b("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void mo43222g(String str) {
        try {
            this.f27994a.mo42953b("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzcgp.m45227e("Error occurred while dispatching state change.", e);
        }
    }
}
