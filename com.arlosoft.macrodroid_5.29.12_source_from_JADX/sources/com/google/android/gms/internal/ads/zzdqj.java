package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdqj {

    /* renamed from: a */
    private final zzduy f32795a;

    /* renamed from: b */
    private final zzdtn f32796b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f32797c = null;

    public zzdqj(zzduy zzduy, zzdtn zzdtn) {
        this.f32795a = zzduy;
        this.f32796b = zzdtn;
    }

    /* renamed from: f */
    private static final int m47907f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzaw.m1917b();
        return zzcgi.m45187w(context, i);
    }

    /* renamed from: a */
    public final View mo44917a(@NonNull View view, @NonNull WindowManager windowManager) throws zzcna {
        zzcmp a = this.f32795a.mo45004a(zzq.m2419n2(), (zzfdk) null, (zzfdn) null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.mo44064o0("/sendMessageToSdk", new zzdqf(this));
        a.mo44064o0("/hideValidatorOverlay", new zzdqg(this, windowManager, view));
        a.mo44064o0("/open", new zzbqf((zzb) null, (zzbxz) null, (zzego) null, (zzdxq) null, (zzfir) null));
        this.f32796b.mo44981j(new WeakReference(a), "/loadNativeAdPolicyViolations", new zzdqh(this, view, windowManager));
        this.f32796b.mo44981j(new WeakReference(a), "/showValidatorOverlay", zzdqi.f32794a);
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo44918b(zzcmp zzcmp, Map map) {
        this.f32796b.mo44978g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo44919c(WindowManager windowManager, View view, zzcmp zzcmp, Map map) {
        zzcgp.m45224b("Hide native ad policy validator overlay.");
        zzcmp.mo44027R().setVisibility(8);
        if (zzcmp.mo44027R().getWindowToken() != null) {
            windowManager.removeView(zzcmp.mo44027R());
        }
        zzcmp.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f32797c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f32797c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44920d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f32796b.mo44978g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo44921e(View view, WindowManager windowManager, zzcmp zzcmp, Map map) {
        int i;
        zzcmp.mo44044e0().mo44085I(new zzdqd(this, map));
        if (map != null) {
            Context context = view.getContext();
            int f = m47907f(context, (String) map.get("validator_width"), ((Integer) zzay.m1924c().mo42663b(zzbjc.f27013U6)).intValue());
            int f2 = m47907f(context, (String) map.get("validator_height"), ((Integer) zzay.m1924c().mo42663b(zzbjc.f27023V6)).intValue());
            int f3 = m47907f(context, (String) map.get("validator_x"), 0);
            int f4 = m47907f(context, (String) map.get("validator_y"), 0);
            zzcmp.mo44057l0(zzcoe.m46200b(f, f2));
            try {
                zzcmp.mo44029S().getSettings().setUseWideViewPort(((Boolean) zzay.m1924c().mo42663b(zzbjc.f27032W6)).booleanValue());
                zzcmp.mo44029S().getSettings().setLoadWithOverviewMode(((Boolean) zzay.m1924c().mo42663b(zzbjc.f27041X6)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams b = zzbx.m2609b();
            b.x = f3;
            b.y = f4;
            windowManager.updateViewLayout(zzcmp.mo44027R(), b);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.f32797c = new zzdqe(view, zzcmp, str, b, i - f4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f32797c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcmp.loadUrl(str2);
            }
        }
    }
}
