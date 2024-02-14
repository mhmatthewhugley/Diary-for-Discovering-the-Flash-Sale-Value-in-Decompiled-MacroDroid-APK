package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public interface zzcmp extends zza, zzdkn, zzcmg, zzbsn, zzcnm, zzcnq, zzbta, zzbbq, zzcnu, zzl, zzcnx, zzcny, zzciy, zzcnz {
    /* renamed from: A */
    void mo43743A(zzcnl zzcnl);

    /* renamed from: A0 */
    void mo44006A0(zzblp zzblp);

    /* renamed from: B */
    boolean mo44007B();

    /* renamed from: B0 */
    void mo44008B0(int i);

    /* renamed from: C */
    zzcoe mo44009C();

    /* renamed from: C0 */
    void mo44010C0(Context context);

    /* renamed from: D */
    void mo44011D();

    /* renamed from: D0 */
    void mo44012D0();

    /* renamed from: E0 */
    boolean mo44013E0(boolean z, int i);

    /* renamed from: F */
    boolean mo44014F();

    /* renamed from: F0 */
    void mo44015F0(IObjectWrapper iObjectWrapper);

    /* renamed from: G */
    void mo44016G();

    /* renamed from: J */
    Context mo44017J();

    /* renamed from: K0 */
    void mo44018K0(zzblr zzblr);

    /* renamed from: L */
    zzape mo44019L();

    /* renamed from: M */
    com.google.android.gms.ads.internal.overlay.zzl mo44020M();

    /* renamed from: N */
    void mo44021N();

    /* renamed from: O */
    zzfdn mo44022O();

    /* renamed from: P */
    void mo44023P(boolean z);

    /* renamed from: P0 */
    void mo44024P0(boolean z);

    /* renamed from: Q */
    WebViewClient mo44025Q();

    /* renamed from: Q0 */
    void mo44026Q0(String str, Predicate predicate);

    /* renamed from: R */
    View mo44027R();

    /* renamed from: R0 */
    void mo44028R0(String str, String str2, String str3);

    /* renamed from: S */
    WebView mo44029S();

    /* renamed from: S0 */
    void mo44030S0(boolean z);

    /* renamed from: T */
    zzblr mo44031T();

    /* renamed from: T0 */
    IObjectWrapper mo44032T0();

    /* renamed from: U */
    void mo44033U(com.google.android.gms.ads.internal.overlay.zzl zzl);

    /* renamed from: U0 */
    void mo44034U0(zzbdd zzbdd);

    /* renamed from: V */
    void mo44035V();

    /* renamed from: X */
    void mo44036X(boolean z);

    /* renamed from: X0 */
    boolean mo44037X0();

    /* renamed from: Z0 */
    zzfzp mo44038Z0();

    /* renamed from: a0 */
    com.google.android.gms.ads.internal.overlay.zzl mo44039a0();

    /* renamed from: a1 */
    void mo44040a1();

    /* renamed from: b1 */
    void mo44041b1(boolean z);

    boolean canGoBack();

    void destroy();

    /* renamed from: e0 */
    zzcoc mo44044e0();

    /* renamed from: g0 */
    void mo44045g0(int i);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: i */
    Activity mo43756i();

    /* renamed from: i0 */
    void mo44054i0(zzfdk zzfdk, zzfdn zzfdn);

    /* renamed from: j0 */
    boolean mo44055j0();

    /* renamed from: k */
    com.google.android.gms.ads.internal.zza mo43757k();

    /* renamed from: k0 */
    void mo44056k0();

    /* renamed from: l */
    zzbjp mo43758l();

    /* renamed from: l0 */
    void mo44057l0(zzcoe zzcoe);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    zzcgv mo43759m();

    /* renamed from: m0 */
    String mo44061m0();

    void measure(int i, int i2);

    /* renamed from: n0 */
    void mo44063n0(String str, zzbpu zzbpu);

    /* renamed from: o0 */
    void mo44064o0(String str, zzbpu zzbpu);

    void onPause();

    void onResume();

    /* renamed from: p */
    zzcnl mo43761p();

    /* renamed from: q0 */
    boolean mo44067q0();

    /* renamed from: r0 */
    void mo44068r0(boolean z);

    /* renamed from: s0 */
    void mo44069s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t */
    zzfdk mo43986t();

    /* renamed from: t0 */
    void mo44074t0(com.google.android.gms.ads.internal.overlay.zzl zzl);

    /* renamed from: u0 */
    zzbdd mo44075u0();

    /* renamed from: w */
    void mo43766w(String str, zzclb zzclb);

    /* renamed from: z */
    boolean mo44076z();
}
