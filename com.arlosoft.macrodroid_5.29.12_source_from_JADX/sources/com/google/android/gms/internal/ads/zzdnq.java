package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdnq implements zzdoy {

    /* renamed from: A */
    private zzcq f32516A;

    /* renamed from: a */
    private final Context f32517a;

    /* renamed from: b */
    private final zzdpb f32518b;

    /* renamed from: c */
    private final JSONObject f32519c;

    /* renamed from: d */
    private final zzdtn f32520d;

    /* renamed from: e */
    private final zzdoq f32521e;

    /* renamed from: f */
    private final zzape f32522f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzdds f32523g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zzdcy f32524h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzdkl f32525i;

    /* renamed from: j */
    private final zzfdk f32526j;

    /* renamed from: k */
    private final zzcgv f32527k;

    /* renamed from: l */
    private final zzfef f32528l;

    /* renamed from: m */
    private final zzcvk f32529m;

    /* renamed from: n */
    private final zzdpt f32530n;

    /* renamed from: o */
    private final Clock f32531o;

    /* renamed from: p */
    private final zzdki f32532p;

    /* renamed from: q */
    private final zzfkm f32533q;

    /* renamed from: r */
    private final zzfju f32534r;

    /* renamed from: s */
    private boolean f32535s = false;

    /* renamed from: t */
    private boolean f32536t;

    /* renamed from: u */
    private boolean f32537u = false;

    /* renamed from: v */
    private boolean f32538v = false;

    /* renamed from: w */
    private Point f32539w = new Point();

    /* renamed from: x */
    private Point f32540x = new Point();

    /* renamed from: y */
    private long f32541y = 0;

    /* renamed from: z */
    private long f32542z = 0;

    public zzdnq(Context context, zzdpb zzdpb, JSONObject jSONObject, zzdtn zzdtn, zzdoq zzdoq, zzape zzape, zzdds zzdds, zzdcy zzdcy, zzdkl zzdkl, zzfdk zzfdk, zzcgv zzcgv, zzfef zzfef, zzcvk zzcvk, zzdpt zzdpt, Clock clock, zzdki zzdki, zzfkm zzfkm, zzfju zzfju) {
        this.f32517a = context;
        this.f32518b = zzdpb;
        this.f32519c = jSONObject;
        this.f32520d = zzdtn;
        this.f32521e = zzdoq;
        this.f32522f = zzape;
        this.f32523g = zzdds;
        this.f32524h = zzdcy;
        this.f32525i = zzdkl;
        this.f32526j = zzfdk;
        this.f32527k = zzcgv;
        this.f32528l = zzfef;
        this.f32529m = zzcvk;
        this.f32530n = zzdpt;
        this.f32531o = clock;
        this.f32532p = zzdki;
        this.f32533q = zzfkm;
        this.f32534r = zzfju;
    }

    @Nullable
    /* renamed from: a */
    private final String m47606a(@Nullable View view, @Nullable Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int K = this.f32521e.mo44798K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: b */
    private final boolean m47607b(String str) {
        JSONObject optJSONObject = this.f32519c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m47608d() {
        return this.f32519c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: g */
    private final boolean m47609g(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z) {
        Preconditions.m4483f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f32519c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26889I2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f32517a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.m2905r();
            DisplayMetrics O = zzs.m2741O((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzaw.m1917b().mo43547c(context, O.widthPixels));
                jSONObject7.put("height", zzaw.m1917b().mo43547c(context, O.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27189m7)).booleanValue()) {
                this.f32520d.mo44980i("/clickRecorded", new zzdnn(this, (zzdnm) null));
            } else {
                this.f32520d.mo44980i("/logScionEvent", new zzdnl(this, (zzdnk) null));
            }
            this.f32520d.mo44980i("/nativeImpression", new zzdnp(this, (zzdno) null));
            zzchf.m45244a(this.f32520d.mo44975d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f32535s) {
                return true;
            }
            this.f32535s = zzt.m2908u().mo20310n(this.f32517a, this.f32527k.f28446a, this.f32526j.f35496D.toString(), this.f32528l.f35631f);
            return true;
        } catch (JSONException e) {
            zzcgp.m45227e("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: I */
    public final boolean mo44723I() {
        return m47608d();
    }

    /* renamed from: O0 */
    public final void mo44724O0(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzcgp.m45224b("Click data is null. No click is reported.");
        } else if (!m47607b("click_reporting")) {
            zzcgp.m45226d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            mo44742k((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzaw.m1917b().mo43551j(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: P0 */
    public final void mo44725P0(@Nullable zzcu zzcu) {
        try {
            if (!this.f32537u) {
                if (zzcu == null) {
                    zzdoq zzdoq = this.f32521e;
                    if (zzdoq.mo44806S() != null) {
                        this.f32537u = true;
                        this.f32533q.mo45862c(zzdoq.mo44806S().mo19985c(), this.f32534r);
                        mo44738c();
                        return;
                    }
                }
                this.f32537u = true;
                this.f32533q.mo45862c(zzcu.mo19985c(), this.f32534r);
                mo44738c();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: Q0 */
    public final void mo44726Q0(zzbny zzbny) {
        if (!this.f32519c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcgp.m45229g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f32530n.mo44907d(zzbny);
        }
    }

    /* renamed from: R0 */
    public final void mo44727R0(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.f32539w = zzbx.m2608a(motionEvent, view2);
        long a = this.f32531o.mo21950a();
        this.f32542z = a;
        if (motionEvent.getAction() == 0) {
            this.f32541y = a;
            this.f32540x = this.f32539w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f32539w;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f32522f.mo41777d(obtain);
        obtain.recycle();
    }

    /* renamed from: S0 */
    public final void mo44728S0(String str) {
        mo44742k((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: T0 */
    public final void mo44729T0(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z) {
        View view3 = view2;
        Map map3 = map;
        JSONObject d = zzbx.m2611d(this.f32517a, map, map2, view2);
        JSONObject g = zzbx.m2614g(this.f32517a, view2);
        JSONObject f = zzbx.m2613f(view2);
        JSONObject e = zzbx.m2612e(this.f32517a, view2);
        View view4 = view;
        String a = m47606a(view, map);
        mo44742k(true == ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26909K2)).booleanValue() ? view3 : view4, g, d, f, e, a, zzbx.m2610c(a, this.f32517a, this.f32540x, this.f32539w), (JSONObject) null, z, false);
    }

    /* renamed from: U0 */
    public final void mo44730U0(@Nullable View view, @Nullable Map map, @Nullable Map map2) {
        String str;
        JSONObject d = zzbx.m2611d(this.f32517a, map, map2, view);
        JSONObject g = zzbx.m2614g(this.f32517a, view);
        JSONObject f = zzbx.m2613f(view);
        JSONObject e = zzbx.m2612e(this.f32517a, view);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26889I2)).booleanValue()) {
            try {
                str = this.f32522f.mo41776c().mo20433g(this.f32517a, view, (Activity) null);
            } catch (Exception unused) {
                zzcgp.m45226d("Exception getting data.");
            }
            m47609g(g, d, f, e, str, (JSONObject) null, zzbx.m2615h(this.f32517a, this.f32526j));
        }
        str = null;
        m47609g(g, d, f, e, str, (JSONObject) null, zzbx.m2615h(this.f32517a, this.f32526j));
    }

    /* renamed from: V0 */
    public final void mo44731V0(@Nullable View view, @Nullable Map map) {
        this.f32539w = new Point();
        this.f32540x = new Point();
        if (view != null) {
            this.f32532p.mo44685W0(view);
        }
        this.f32536t = false;
    }

    /* renamed from: W0 */
    public final void mo44732W0(@Nullable View view, @Nullable Map map, @Nullable Map map2, boolean z) {
        View view2 = view;
        Map map3 = map;
        if (!this.f32538v) {
            zzcgp.m45224b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m47608d()) {
            zzcgp.m45224b("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map map4 = map2;
            JSONObject d = zzbx.m2611d(this.f32517a, map, map2, view);
            JSONObject g = zzbx.m2614g(this.f32517a, view);
            JSONObject f = zzbx.m2613f(view);
            JSONObject e = zzbx.m2612e(this.f32517a, view);
            String a = m47606a((View) null, map);
            mo44742k(view, g, d, f, e, a, zzbx.m2610c(a, this.f32517a, this.f32540x, this.f32539w), (JSONObject) null, z, true);
        }
    }

    @Nullable
    /* renamed from: X0 */
    public final JSONObject mo44733X0(@Nullable View view, @Nullable Map map, @Nullable Map map2) {
        JSONObject d = zzbx.m2611d(this.f32517a, map, map2, view);
        JSONObject g = zzbx.m2614g(this.f32517a, view);
        JSONObject f = zzbx.m2613f(view);
        JSONObject e = zzbx.m2612e(this.f32517a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", g);
            jSONObject.put("scroll_view_signal", f);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            zzcgp.m45227e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    /* renamed from: Y0 */
    public final void mo44734Y0(zzcq zzcq) {
        this.f32516A = zzcq;
    }

    /* renamed from: Z0 */
    public final void mo44735Z0(View view) {
        if (!this.f32519c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcgp.m45229g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdpt zzdpt = this.f32530n;
        if (view != null) {
            view.setOnClickListener(zzdpt);
            view.setClickable(true);
            zzdpt.f32761p = new WeakReference(view);
        }
    }

    /* renamed from: a1 */
    public final void mo44736a1(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f32539w = new Point();
        this.f32540x = new Point();
        if (!this.f32536t) {
            this.f32532p.mo44684M0(view);
            this.f32536t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f32529m.mo44409d(this);
        boolean i = zzbx.m2616i(this.f32527k.f28448d);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: b1 */
    public final boolean mo44737b1(Bundle bundle) {
        if (!m47607b("impression_reporting")) {
            zzcgp.m45226d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m47609g((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzaw.m1917b().mo43551j(bundle, (JSONObject) null), false);
    }

    /* renamed from: c */
    public final void mo44738c() {
        try {
            zzcq zzcq = this.f32516A;
            if (zzcq != null) {
                zzcq.mo19983b();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    @Nullable
    /* renamed from: c1 */
    public final JSONObject mo44739c1(@Nullable View view, @Nullable Map map, @Nullable Map map2) {
        JSONObject X0 = mo44733X0(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f32538v && m47608d()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (X0 != null) {
                jSONObject.put("nas", X0);
            }
        } catch (JSONException e) {
            zzcgp.m45227e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final void mo44740e() {
        this.f32520d.mo44977f();
    }

    /* renamed from: f */
    public final void mo44741f() {
        if (this.f32519c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f32530n.mo44906b();
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: k */
    public final void mo44742k(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        Preconditions.m4483f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f32519c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f32518b.mo44864c(this.f32521e.mo44826g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f32521e.mo44798K());
            jSONObject8.put("view_aware_api_used", z);
            zzbls zzbls = this.f32528l.f35634i;
            jSONObject8.put("custom_mute_requested", zzbls != null && zzbls.f27532p);
            jSONObject8.put("custom_mute_enabled", !this.f32521e.mo44823f().isEmpty() && this.f32521e.mo44806S() != null);
            if (this.f32530n.mo44905a() != null && this.f32519c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f32531o.mo21950a());
            if (this.f32538v && m47608d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f32518b.mo44864c(this.f32521e.mo44826g0()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.f32519c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f32522f.mo41776c().mo20431e(this.f32517a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzcgp.m45227e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26910K3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27229q7)).booleanValue() && PlatformVersion.m4907l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27239r7)).booleanValue() && PlatformVersion.m4907l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.f32531o.mo21950a();
            jSONObject9.put("time_from_last_touch_down", a - this.f32541y);
            jSONObject9.put("time_from_last_touch", a - this.f32542z);
            jSONObject7.put("touch_signal", jSONObject9);
            zzchf.m45244a(this.f32520d.mo44975d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzcgp.m45227e("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: l */
    public final void mo44743l() {
        Preconditions.m4483f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f32519c);
            zzchf.m45244a(this.f32520d.mo44975d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzcgp.m45227e("", e);
        }
    }

    /* renamed from: s */
    public final void mo44744s() {
        m47609g((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    /* renamed from: u */
    public final void mo44745u() {
        this.f32538v = true;
    }

    /* renamed from: u1 */
    public final void mo44746u1(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzcgp.m45224b("Touch event data is null. No touch event is reported.");
        } else if (!m47607b("touch_reporting")) {
            zzcgp.m45226d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f32522f.mo41776c().mo20429c((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }
}
