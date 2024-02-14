package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdpm extends zzbmh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdql {

    /* renamed from: E */
    public static final zzfvn f32714E = zzfvn.m51126D("2011", "1009", "3010");

    /* renamed from: A */
    private IObjectWrapper f32715A = null;

    /* renamed from: B */
    private zzbmb f32716B;

    /* renamed from: C */
    private boolean f32717C;

    /* renamed from: D */
    private boolean f32718D = false;

    /* renamed from: a */
    private final String f32719a;

    /* renamed from: c */
    private Map f32720c = new HashMap();

    /* renamed from: d */
    private FrameLayout f32721d;

    /* renamed from: f */
    private FrameLayout f32722f;

    /* renamed from: g */
    private final zzfzq f32723g;

    /* renamed from: o */
    private View f32724o;

    /* renamed from: p */
    private final int f32725p;

    /* renamed from: s */
    private zzdol f32726s;

    /* renamed from: z */
    private zzbbr f32727z;

    public zzdpm(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f32721d = frameLayout;
        this.f32722f = frameLayout2;
        this.f32725p = 223104000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f32719a = str;
        zzt.m2913z();
        zzchp.m45262a(frameLayout, this);
        zzt.m2913z();
        zzchp.m45263b(frameLayout, this);
        this.f32723g = zzchc.f28460e;
        this.f32727z = new zzbbr(this.f32721d.getContext(), this.f32721d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: Kb */
    private final synchronized void m47849Kb(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f32722f.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f32722f.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzcgp.m45230h("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.f32722f.addView(frameLayout);
    }

    /* renamed from: r */
    private final synchronized void m47850r() {
        this.f32723g.execute(new zzdpl(this));
    }

    /* renamed from: E9 */
    public final synchronized void mo20103E9(zzbmb zzbmb) {
        if (!this.f32718D) {
            this.f32717C = true;
            this.f32716B = zzbmb;
            zzdol zzdol = this.f32726s;
            if (zzdol != null) {
                zzdol.mo44761C().mo44794b(zzbmb);
            }
        }
    }

    /* renamed from: V2 */
    public final synchronized void mo20104V2(IObjectWrapper iObjectWrapper, int i) {
    }

    /* renamed from: Xa */
    public final synchronized void mo20105Xa(String str, IObjectWrapper iObjectWrapper) {
        mo44877g8(str, (View) ObjectWrapper.m5050A1(iObjectWrapper), true);
    }

    /* renamed from: a */
    public final synchronized void mo20106a() {
        if (!this.f32718D) {
            zzdol zzdol = this.f32726s;
            if (zzdol != null) {
                zzdol.mo44788s(this);
                this.f32726s = null;
            }
            this.f32720c.clear();
            this.f32721d.removeAllViews();
            this.f32722f.removeAllViews();
            this.f32720c = null;
            this.f32721d = null;
            this.f32722f = null;
            this.f32724o = null;
            this.f32727z = null;
            this.f32718D = true;
        }
    }

    /* renamed from: a5 */
    public final synchronized void mo20107a5(IObjectWrapper iObjectWrapper) {
        this.f32726s.mo44782m((View) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: c */
    public final /* synthetic */ View mo44874c() {
        return this.f32721d;
    }

    /* renamed from: d0 */
    public final void mo20108d0(IObjectWrapper iObjectWrapper) {
        onTouch(this.f32721d, (MotionEvent) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: e */
    public final FrameLayout mo44875e() {
        return this.f32722f;
    }

    /* renamed from: g */
    public final zzbbr mo44876g() {
        return this.f32727z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* renamed from: g8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44877g8(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f32718D     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map r3 = r1.f32720c     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map r4 = r1.f32720c     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f32725p     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.ads.internal.util.zzbx.m2616i(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpm.mo44877g8(java.lang.String, android.view.View, boolean):void");
    }

    @Nullable
    /* renamed from: h */
    public final IObjectWrapper mo44878h() {
        return this.f32715A;
    }

    /* renamed from: i */
    public final synchronized String mo44879i() {
        return this.f32719a;
    }

    /* renamed from: j */
    public final synchronized Map mo44880j() {
        return this.f32720c;
    }

    /* renamed from: k */
    public final synchronized Map mo44881k() {
        return this.f32720c;
    }

    @Nullable
    /* renamed from: l */
    public final synchronized JSONObject mo44882l() {
        zzdol zzdol = this.f32726s;
        if (zzdol == null) {
            return null;
        }
        return zzdol.mo44763G(this.f32721d, mo44880j(), mo44881k());
    }

    @Nullable
    /* renamed from: m */
    public final synchronized JSONObject mo44883m() {
        zzdol zzdol = this.f32726s;
        if (zzdol == null) {
            return null;
        }
        return zzdol.mo44764H(this.f32721d, mo44880j(), mo44881k());
    }

    @Nullable
    /* renamed from: n */
    public final synchronized Map mo44884n() {
        return null;
    }

    /* renamed from: o9 */
    public final synchronized void mo20109o9(IObjectWrapper iObjectWrapper) {
        if (!this.f32718D) {
            this.f32715A = iObjectWrapper;
        }
    }

    public final synchronized void onClick(View view) {
        zzdol zzdol = this.f32726s;
        if (zzdol != null) {
            zzdol.mo44766K();
            this.f32726s.mo44774S(view, this.f32721d, mo44880j(), mo44881k(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        zzdol zzdol = this.f32726s;
        if (zzdol != null) {
            FrameLayout frameLayout = this.f32721d;
            zzdol.mo44772Q(frameLayout, mo44880j(), mo44881k(), zzdol.m47659w(frameLayout));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdol zzdol = this.f32726s;
        if (zzdol != null) {
            FrameLayout frameLayout = this.f32721d;
            zzdol.mo44772Q(frameLayout, mo44880j(), mo44881k(), zzdol.m47659w(frameLayout));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdol zzdol = this.f32726s;
        if (zzdol != null) {
            zzdol.mo44780k(view, motionEvent, this.f32721d);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo44895q() {
        if (this.f32724o == null) {
            View view = new View(this.f32721d.getContext());
            this.f32724o = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f32721d != this.f32724o.getParent()) {
            this.f32721d.addView(this.f32724o);
        }
    }

    /* renamed from: t */
    public final synchronized IObjectWrapper mo20110t(String str) {
        return ObjectWrapper.m5051g8(mo44889z0(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20111y5(com.google.android.gms.dynamic.IObjectWrapper r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f32718D     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r2)     // Catch:{ all -> 0x006f }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzdol     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.zzdol r0 = r1.f32726s     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x001d
            r0.mo44788s(r1)     // Catch:{ all -> 0x006f }
        L_0x001d:
            r1.m47850r()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzdol r2 = (com.google.android.gms.internal.ads.zzdol) r2     // Catch:{ all -> 0x006f }
            r1.f32726s = r2     // Catch:{ all -> 0x006f }
            r2.mo44787r(r1)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzdol r2 = r1.f32726s     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f32721d     // Catch:{ all -> 0x006f }
            r2.mo44779j(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzdol r2 = r1.f32726s     // Catch:{ all -> 0x006f }
            android.widget.FrameLayout r0 = r1.f32722f     // Catch:{ all -> 0x006f }
            r2.mo44765J(r0)     // Catch:{ all -> 0x006f }
            boolean r2 = r1.f32717C     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzdol r2 = r1.f32726s     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzdon r2 = r2.mo44761C()     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzbmb r0 = r1.f32716B     // Catch:{ all -> 0x006f }
            r2.mo44794b(r0)     // Catch:{ all -> 0x006f }
        L_0x0044:
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f27085c3     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r0.mo42663b(r2)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x006f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzdol r2 = r1.f32726s     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo44762E()     // Catch:{ all -> 0x006f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzdol r2 = r1.f32726s     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.mo44762E()     // Catch:{ all -> 0x006f }
            r1.m47849Kb(r2)     // Catch:{ all -> 0x006f }
            monitor-exit(r1)
            return
        L_0x006d:
            monitor-exit(r1)
            return
        L_0x006f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpm.mo20111y5(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Nullable
    /* renamed from: z0 */
    public final synchronized View mo44889z0(String str) {
        if (this.f32718D) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f32720c.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
