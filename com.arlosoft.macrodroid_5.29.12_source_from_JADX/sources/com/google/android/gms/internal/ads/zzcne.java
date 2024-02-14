package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcne extends FrameLayout implements zzcmp {

    /* renamed from: a */
    private final zzcmp f29064a;

    /* renamed from: c */
    private final zzcin f29065c;

    /* renamed from: d */
    private final AtomicBoolean f29066d = new AtomicBoolean();

    public zzcne(zzcmp zzcmp) {
        super(zzcmp.getContext());
        this.f29064a = zzcmp;
        this.f29065c = new zzcin(zzcmp.mo44017J(), this, this);
        addView((View) zzcmp);
    }

    /* renamed from: A */
    public final void mo43743A(zzcnl zzcnl) {
        this.f29064a.mo43743A(zzcnl);
    }

    /* renamed from: A0 */
    public final void mo44006A0(zzblp zzblp) {
        this.f29064a.mo44006A0(zzblp);
    }

    /* renamed from: B */
    public final boolean mo44007B() {
        return this.f29064a.mo44007B();
    }

    /* renamed from: B0 */
    public final void mo44008B0(int i) {
        this.f29064a.mo44008B0(i);
    }

    /* renamed from: C */
    public final zzcoe mo44009C() {
        return this.f29064a.mo44009C();
    }

    /* renamed from: C0 */
    public final void mo44010C0(Context context) {
        this.f29064a.mo44010C0(context);
    }

    /* renamed from: D */
    public final void mo44011D() {
        this.f29065c.mo43690d();
        this.f29064a.mo44011D();
    }

    /* renamed from: D0 */
    public final void mo44012D0() {
        this.f29064a.mo44012D0();
    }

    /* renamed from: E */
    public final void mo43744E(int i) {
        this.f29064a.mo43744E(i);
    }

    /* renamed from: E0 */
    public final boolean mo44013E0(boolean z, int i) {
        if (!this.f29066d.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26857F0)).booleanValue()) {
            return false;
        }
        if (this.f29064a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f29064a.getParent()).removeView((View) this.f29064a);
        }
        this.f29064a.mo44013E0(z, i);
        return true;
    }

    /* renamed from: F */
    public final boolean mo44014F() {
        return this.f29064a.mo44014F();
    }

    /* renamed from: F0 */
    public final void mo44015F0(IObjectWrapper iObjectWrapper) {
        this.f29064a.mo44015F0(iObjectWrapper);
    }

    /* renamed from: G */
    public final void mo44016G() {
        this.f29064a.mo44016G();
    }

    /* renamed from: G0 */
    public final void mo20442G0() {
        this.f29064a.mo20442G0();
    }

    /* renamed from: H */
    public final void mo43745H() {
        this.f29064a.mo43745H();
    }

    /* renamed from: J */
    public final Context mo44017J() {
        return this.f29064a.mo44017J();
    }

    /* renamed from: K */
    public final void mo43746K() {
        this.f29064a.mo43746K();
    }

    /* renamed from: K0 */
    public final void mo44018K0(@Nullable zzblr zzblr) {
        this.f29064a.mo44018K0(zzblr);
    }

    /* renamed from: L */
    public final zzape mo44019L() {
        return this.f29064a.mo44019L();
    }

    /* renamed from: M */
    public final zzl mo44020M() {
        return this.f29064a.mo44020M();
    }

    /* renamed from: M0 */
    public final void mo44138M0(boolean z, int i, String str, boolean z2) {
        this.f29064a.mo44138M0(z, i, str, z2);
    }

    /* renamed from: N */
    public final void mo44021N() {
        zzcmp zzcmp = this.f29064a;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzt.m2907t().mo20259e()));
        hashMap.put("app_volume", String.valueOf(zzt.m2907t().mo20256a()));
        zzcni zzcni = (zzcni) zzcmp;
        hashMap.put("device_volume", String.valueOf(zzab.m2520b(zzcni.getContext())));
        zzcni.mo42954y("volume", hashMap);
    }

    /* renamed from: N0 */
    public final void mo44139N0(zzc zzc, boolean z) {
        this.f29064a.mo44139N0(zzc, z);
    }

    /* renamed from: O */
    public final zzfdn mo44022O() {
        return this.f29064a.mo44022O();
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        this.f29064a.mo42396O0(zzbbp);
    }

    /* renamed from: P */
    public final void mo44023P(boolean z) {
        this.f29064a.mo44023P(z);
    }

    /* renamed from: P0 */
    public final void mo44024P0(boolean z) {
        this.f29064a.mo44024P0(z);
    }

    /* renamed from: Q */
    public final WebViewClient mo44025Q() {
        return this.f29064a.mo44025Q();
    }

    /* renamed from: Q0 */
    public final void mo44026Q0(String str, Predicate predicate) {
        this.f29064a.mo44026Q0(str, predicate);
    }

    /* renamed from: R */
    public final View mo44027R() {
        return this;
    }

    /* renamed from: R0 */
    public final void mo44028R0(String str, String str2, @Nullable String str3) {
        this.f29064a.mo44028R0(str, str2, (String) null);
    }

    /* renamed from: S */
    public final WebView mo44029S() {
        return (WebView) this.f29064a;
    }

    /* renamed from: S0 */
    public final void mo44030S0(boolean z) {
        this.f29064a.mo44030S0(z);
    }

    @Nullable
    /* renamed from: T */
    public final zzblr mo44031T() {
        return this.f29064a.mo44031T();
    }

    /* renamed from: T0 */
    public final IObjectWrapper mo44032T0() {
        return this.f29064a.mo44032T0();
    }

    /* renamed from: U */
    public final void mo44033U(zzl zzl) {
        this.f29064a.mo44033U(zzl);
    }

    /* renamed from: U0 */
    public final void mo44034U0(zzbdd zzbdd) {
        this.f29064a.mo44034U0(zzbdd);
    }

    /* renamed from: V */
    public final void mo44035V() {
        TextView textView = new TextView(getContext());
        zzt.m2905r();
        textView.setText(zzs.m2745S());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: W0 */
    public final void mo44140W0(boolean z, int i, boolean z2) {
        this.f29064a.mo44140W0(z, i, z2);
    }

    /* renamed from: X */
    public final void mo44036X(boolean z) {
        this.f29064a.mo44036X(z);
    }

    /* renamed from: X0 */
    public final boolean mo44037X0() {
        return this.f29064a.mo44037X0();
    }

    /* renamed from: Y0 */
    public final void mo44141Y0(zzbr zzbr, zzego zzego, zzdxq zzdxq, zzfir zzfir, String str, String str2, int i) {
        this.f29064a.mo44141Y0(zzbr, zzego, zzdxq, zzfir, str, str2, 14);
    }

    /* renamed from: Z0 */
    public final zzfzp mo44038Z0() {
        return this.f29064a.mo44038Z0();
    }

    /* renamed from: a0 */
    public final zzl mo44039a0() {
        return this.f29064a.mo44039a0();
    }

    /* renamed from: a1 */
    public final void mo44040a1() {
        this.f29064a.mo44040a1();
    }

    /* renamed from: b */
    public final void mo42953b(String str, JSONObject jSONObject) {
        this.f29064a.mo42953b(str, jSONObject);
    }

    /* renamed from: b0 */
    public final void mo43747b0(int i) {
        this.f29065c.mo43692f(i);
    }

    /* renamed from: b1 */
    public final void mo44041b1(boolean z) {
        this.f29064a.mo44041b1(z);
    }

    /* renamed from: c */
    public final int mo43748c() {
        return this.f29064a.mo43748c();
    }

    /* renamed from: c0 */
    public final void mo43749c0(boolean z) {
        this.f29064a.mo43749c0(false);
    }

    /* renamed from: c1 */
    public final void mo44142c1(boolean z, int i, String str, String str2, boolean z2) {
        this.f29064a.mo44142c1(z, i, str, str2, z2);
    }

    public final boolean canGoBack() {
        return this.f29064a.canGoBack();
    }

    /* renamed from: d1 */
    public final void mo42972d1(String str, JSONObject jSONObject) {
        ((zzcni) this.f29064a).mo42956q(str, jSONObject.toString());
    }

    public final void destroy() {
        IObjectWrapper T0 = mo44032T0();
        if (T0 != null) {
            zzfpz zzfpz = zzs.f2304i;
            zzfpz.post(new zzcnc(T0));
            zzcmp zzcmp = this.f29064a;
            zzcmp.getClass();
            zzfpz.postDelayed(new zzcnd(zzcmp), (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27136h4)).intValue());
            return;
        }
        this.f29064a.destroy();
    }

    /* renamed from: e */
    public final int mo43750e() {
        return this.f29064a.mo43750e();
    }

    /* renamed from: e0 */
    public final zzcoc mo44044e0() {
        return ((zzcni) this.f29064a).mo44146g1();
    }

    /* renamed from: f */
    public final int mo43751f() {
        return this.f29064a.mo43751f();
    }

    /* renamed from: f0 */
    public final void mo43752f0(int i) {
        this.f29064a.mo43752f0(i);
    }

    /* renamed from: g */
    public final int mo43753g() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27046Y2)).booleanValue()) {
            return this.f29064a.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    /* renamed from: g0 */
    public final void mo44045g0(int i) {
        this.f29064a.mo44045g0(i);
    }

    public final void goBack() {
        this.f29064a.goBack();
    }

    /* renamed from: h */
    public final int mo43755h() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27046Y2)).booleanValue()) {
            return this.f29064a.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    /* renamed from: h0 */
    public final void mo20443h0() {
        this.f29064a.mo20443h0();
    }

    @Nullable
    /* renamed from: i */
    public final Activity mo43756i() {
        return this.f29064a.mo43756i();
    }

    /* renamed from: i0 */
    public final void mo44054i0(zzfdk zzfdk, zzfdn zzfdn) {
        this.f29064a.mo44054i0(zzfdk, zzfdn);
    }

    /* renamed from: j0 */
    public final boolean mo44055j0() {
        return this.f29064a.mo44055j0();
    }

    /* renamed from: k */
    public final zza mo43757k() {
        return this.f29064a.mo43757k();
    }

    /* renamed from: k0 */
    public final void mo44056k0() {
        this.f29064a.mo44056k0();
    }

    /* renamed from: l */
    public final zzbjp mo43758l() {
        return this.f29064a.mo43758l();
    }

    /* renamed from: l0 */
    public final void mo44057l0(zzcoe zzcoe) {
        this.f29064a.mo44057l0(zzcoe);
    }

    public final void loadData(String str, String str2, String str3) {
        this.f29064a.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f29064a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.f29064a.loadUrl(str);
    }

    /* renamed from: m */
    public final zzcgv mo43759m() {
        return this.f29064a.mo43759m();
    }

    /* renamed from: m0 */
    public final String mo44061m0() {
        return this.f29064a.mo44061m0();
    }

    /* renamed from: n */
    public final zzbjo mo43760n() {
        return this.f29064a.mo43760n();
    }

    /* renamed from: n0 */
    public final void mo44063n0(String str, zzbpu zzbpu) {
        this.f29064a.mo44063n0(str, zzbpu);
    }

    /* renamed from: o */
    public final void mo42955o(String str) {
        ((zzcni) this.f29064a).mo44149l1(str);
    }

    /* renamed from: o0 */
    public final void mo44064o0(String str, zzbpu zzbpu) {
        this.f29064a.mo44064o0(str, zzbpu);
    }

    public final void onAdClicked() {
        zzcmp zzcmp = this.f29064a;
        if (zzcmp != null) {
            zzcmp.onAdClicked();
        }
    }

    public final void onPause() {
        this.f29065c.mo43691e();
        this.f29064a.onPause();
    }

    public final void onResume() {
        this.f29064a.onResume();
    }

    /* renamed from: p */
    public final zzcnl mo43761p() {
        return this.f29064a.mo43761p();
    }

    /* renamed from: q */
    public final void mo42956q(String str, String str2) {
        this.f29064a.mo42956q("window.inspectorInfo", str2);
    }

    /* renamed from: q0 */
    public final boolean mo44067q0() {
        return this.f29066d.get();
    }

    /* renamed from: r */
    public final String mo43762r() {
        return this.f29064a.mo43762r();
    }

    /* renamed from: r0 */
    public final void mo44068r0(boolean z) {
        this.f29064a.mo44068r0(z);
    }

    /* renamed from: s */
    public final void mo44113s() {
        zzcmp zzcmp = this.f29064a;
        if (zzcmp != null) {
            zzcmp.mo44113s();
        }
    }

    /* renamed from: s0 */
    public final void mo44069s0() {
        setBackgroundColor(0);
        this.f29064a.setBackgroundColor(0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29064a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f29064a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f29064a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f29064a.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final zzfdk mo43986t() {
        return this.f29064a.mo43986t();
    }

    /* renamed from: t0 */
    public final void mo44074t0(zzl zzl) {
        this.f29064a.mo44074t0(zzl);
    }

    /* renamed from: u */
    public final String mo43764u() {
        return this.f29064a.mo43764u();
    }

    /* renamed from: u0 */
    public final zzbdd mo44075u0() {
        return this.f29064a.mo44075u0();
    }

    /* renamed from: v0 */
    public final void mo43765v0(int i) {
        this.f29064a.mo43765v0(i);
    }

    /* renamed from: w */
    public final void mo43766w(String str, zzclb zzclb) {
        this.f29064a.mo43766w(str, zzclb);
    }

    /* renamed from: x */
    public final zzclb mo43767x(String str) {
        return this.f29064a.mo43767x(str);
    }

    /* renamed from: x0 */
    public final zzcin mo43768x0() {
        return this.f29065c;
    }

    /* renamed from: y */
    public final void mo42954y(String str, Map map) {
        this.f29064a.mo42954y(str, map);
    }

    /* renamed from: y0 */
    public final void mo43769y0(boolean z, long j) {
        this.f29064a.mo43769y0(z, j);
    }

    /* renamed from: z */
    public final boolean mo44076z() {
        return this.f29064a.mo44076z();
    }
}
