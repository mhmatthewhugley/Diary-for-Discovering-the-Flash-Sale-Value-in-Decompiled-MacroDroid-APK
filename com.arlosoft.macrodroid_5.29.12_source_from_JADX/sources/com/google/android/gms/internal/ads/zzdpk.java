package com.google.android.gms.internal.ads;

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
public final class zzdpk extends zzbmn implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdql {

    /* renamed from: a */
    private final WeakReference f32707a;

    /* renamed from: c */
    private final Map f32708c = new HashMap();

    /* renamed from: d */
    private final Map f32709d = new HashMap();

    /* renamed from: f */
    private final Map f32710f = new HashMap();

    /* renamed from: g */
    private zzdol f32711g;

    /* renamed from: o */
    private zzbbr f32712o;

    public zzdpk(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.m2913z();
        zzchp.m45262a(view, this);
        zzt.m2913z();
        zzchp.m45263b(view, this);
        this.f32707a = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f32708c.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f32710f.putAll(this.f32708c);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f32709d.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f32710f.putAll(this.f32709d);
        this.f32712o = new zzbbr(view.getContext(), view);
    }

    /* renamed from: Y0 */
    public final synchronized void mo20112Y0(IObjectWrapper iObjectWrapper) {
        Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
        if (!(A1 instanceof zzdol)) {
            zzcgp.m45229g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44788s(this);
        }
        zzdol zzdol2 = (zzdol) A1;
        if (zzdol2.mo44789t()) {
            this.f32711g = zzdol2;
            zzdol2.mo44787r(this);
            this.f32711g.mo44779j(mo44874c());
            return;
        }
        zzcgp.m45226d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Nullable
    /* renamed from: c */
    public final View mo44874c() {
        return (View) this.f32707a.get();
    }

    /* renamed from: d */
    public final synchronized void mo20113d() {
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44788s(this);
            this.f32711g = null;
        }
    }

    @Nullable
    /* renamed from: e */
    public final FrameLayout mo44875e() {
        return null;
    }

    /* renamed from: g */
    public final zzbbr mo44876g() {
        return this.f32712o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: g8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44877g8(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r4 = r1.f32710f     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map r4 = r1.f32708c     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpk.mo44877g8(java.lang.String, android.view.View, boolean):void");
    }

    @Nullable
    /* renamed from: h */
    public final synchronized IObjectWrapper mo44878h() {
        return null;
    }

    /* renamed from: i */
    public final synchronized String mo44879i() {
        return "1007";
    }

    /* renamed from: j */
    public final synchronized Map mo44880j() {
        return this.f32710f;
    }

    /* renamed from: k */
    public final synchronized Map mo44881k() {
        return this.f32708c;
    }

    @Nullable
    /* renamed from: l */
    public final synchronized JSONObject mo44882l() {
        return null;
    }

    @Nullable
    /* renamed from: m */
    public final synchronized JSONObject mo44883m() {
        zzdol zzdol = this.f32711g;
        if (zzdol == null) {
            return null;
        }
        return zzdol.mo44764H(mo44874c(), mo44880j(), mo44881k());
    }

    @Nullable
    /* renamed from: n */
    public final synchronized Map mo44884n() {
        return this.f32709d;
    }

    public final synchronized void onClick(View view) {
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44774S(view, mo44874c(), mo44880j(), mo44881k(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44772Q(mo44874c(), mo44880j(), mo44881k(), zzdol.m47659w(mo44874c()));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44772Q(mo44874c(), mo44880j(), mo44881k(), zzdol.m47659w(mo44874c()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdol zzdol = this.f32711g;
        if (zzdol != null) {
            zzdol.mo44780k(view, motionEvent, mo44874c());
        }
        return false;
    }

    /* renamed from: q0 */
    public final synchronized void mo20114q0(IObjectWrapper iObjectWrapper) {
        if (this.f32711g != null) {
            Object A1 = ObjectWrapper.m5050A1(iObjectWrapper);
            if (!(A1 instanceof View)) {
                zzcgp.m45229g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f32711g.mo44782m((View) A1);
        }
    }

    @Nullable
    /* renamed from: z0 */
    public final synchronized View mo44889z0(String str) {
        WeakReference weakReference = (WeakReference) this.f32710f.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
