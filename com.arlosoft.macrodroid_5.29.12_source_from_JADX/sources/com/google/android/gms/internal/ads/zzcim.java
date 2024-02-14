package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcim extends FrameLayout implements zzcid {

    /* renamed from: A */
    private boolean f28517A;

    /* renamed from: B */
    private boolean f28518B;

    /* renamed from: C */
    private long f28519C;

    /* renamed from: D */
    private long f28520D;

    /* renamed from: E */
    private String f28521E;

    /* renamed from: F */
    private String[] f28522F;

    /* renamed from: G */
    private Bitmap f28523G;

    /* renamed from: H */
    private final ImageView f28524H;

    /* renamed from: I */
    private boolean f28525I;
    @Nullable

    /* renamed from: J */
    private final Integer f28526J;

    /* renamed from: a */
    private final zzciy f28527a;

    /* renamed from: c */
    private final FrameLayout f28528c;

    /* renamed from: d */
    private final View f28529d;

    /* renamed from: f */
    private final zzbjr f28530f;
    @VisibleForTesting

    /* renamed from: g */
    final zzcja f28531g;

    /* renamed from: o */
    private final long f28532o;
    @Nullable

    /* renamed from: p */
    private final zzcie f28533p;

    /* renamed from: s */
    private boolean f28534s;

    /* renamed from: z */
    private boolean f28535z;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.zzcie, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.google.android.gms.internal.ads.zzcic] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.ads.zzcjq] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcim(android.content.Context r16, com.google.android.gms.internal.ads.zzciy r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzbjr r20, com.google.android.gms.internal.ads.zzcix r21, @androidx.annotation.Nullable java.lang.Integer r22) {
        /*
            r15 = this;
            r0 = r15
            r9 = r16
            r10 = r20
            r15.<init>(r16)
            r7 = r17
            r0.f28527a = r7
            r0.f28530f = r10
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r9)
            r0.f28528c = r11
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r12 = -1
            r1.<init>(r12, r12)
            r15.addView(r11, r1)
            com.google.android.gms.ads.internal.zza r1 = r17.mo43757k()
            com.google.android.gms.common.internal.Preconditions.m4488k(r1)
            com.google.android.gms.ads.internal.zza r1 = r17.mo43757k()
            com.google.android.gms.internal.ads.zzcif r1 = r1.f2315a
            com.google.android.gms.internal.ads.zzciz r8 = new com.google.android.gms.internal.ads.zzciz
            com.google.android.gms.internal.ads.zzcgv r3 = r17.mo43759m()
            java.lang.String r4 = r17.mo43764u()
            com.google.android.gms.internal.ads.zzbjo r6 = r17.mo43760n()
            r1 = r8
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r18
            if (r2 != r1) goto L_0x005c
            com.google.android.gms.internal.ads.zzcjq r13 = new com.google.android.gms.internal.ads.zzcjq
            boolean r6 = com.google.android.gms.internal.ads.zzcif.m45339a(r17)
            r1 = r13
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r19
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0086
        L_0x005c:
            com.google.android.gms.internal.ads.zzcic r13 = new com.google.android.gms.internal.ads.zzcic
            boolean r8 = com.google.android.gms.internal.ads.zzcif.m45339a(r17)
            com.google.android.gms.internal.ads.zzciz r14 = new com.google.android.gms.internal.ads.zzciz
            com.google.android.gms.internal.ads.zzcgv r3 = r17.mo43759m()
            java.lang.String r4 = r17.mo43764u()
            com.google.android.gms.internal.ads.zzbjo r6 = r17.mo43760n()
            r1 = r14
            r2 = r16
            r5 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r13
            r3 = r17
            r4 = r19
            r5 = r8
            r6 = r21
            r7 = r14
            r8 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0086:
            r0.f28533p = r13
            r1 = r22
            r0.f28526J = r1
            android.view.View r1 = new android.view.View
            r1.<init>(r9)
            r0.f28529d = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r12, r12, r3)
            r11.addView(r13, r2)
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f26836D
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r2 = r3.mo42663b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00be
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r12)
            r11.addView(r1, r2)
            r11.bringChildToFront(r1)
        L_0x00be:
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26806A
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r2.mo42663b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d3
            r15.mo43684x()
        L_0x00d3:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r9)
            r0.f28524H = r1
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26856F
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r2.mo42663b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.f28532o = r1
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26826C
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r2.mo42663b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f28518B = r1
            if (r10 == 0) goto L_0x010d
            r2 = 1
            if (r2 == r1) goto L_0x0106
            java.lang.String r1 = "0"
            goto L_0x0108
        L_0x0106:
            java.lang.String r1 = "1"
        L_0x0108:
            java.lang.String r2 = "spinner_used"
            r10.mo42690d(r2, r1)
        L_0x010d:
            com.google.android.gms.internal.ads.zzcja r1 = new com.google.android.gms.internal.ads.zzcja
            r1.<init>(r15)
            r0.f28531g = r1
            r13.mo43634u(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcim.<init>(android.content.Context, com.google.android.gms.internal.ads.zzciy, int, boolean, com.google.android.gms.internal.ads.zzbjr, com.google.android.gms.internal.ads.zzcix, java.lang.Integer):void");
    }

    /* renamed from: s */
    private final void m45340s() {
        if (this.f28527a.mo43756i() != null && this.f28535z && !this.f28517A) {
            this.f28527a.mo43756i().getWindow().clearFlags(128);
            this.f28535z = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m45341t(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer v = mo43683v();
        if (v != null) {
            hashMap.put("playerId", v.toString());
        }
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f28527a.mo42954y("onVideoEvent", hashMap);
    }

    /* renamed from: u */
    private final boolean m45342u() {
        return this.f28524H.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ void mo43662A(boolean z) {
        m45341t("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: B */
    public final void mo43663B() {
        if (this.f28533p != null) {
            if (!TextUtils.isEmpty(this.f28521E)) {
                this.f28533p.mo43654f(this.f28521E, this.f28522F);
            } else {
                m45341t("no_src", new String[0]);
            }
        }
    }

    /* renamed from: C */
    public final void mo43664C() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.f28507c.mo43782d(true);
            zzcie.mo43614n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo43665D() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            long h = (long) zzcie.mo43608h();
            if (this.f28519C != h && h > 0) {
                float f = ((float) h) / 1000.0f;
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue()) {
                    m45341t("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f28533p.mo43628p()), "qoeCachedBytes", String.valueOf(this.f28533p.mo43613m()), "qoeLoadedBytes", String.valueOf(this.f28533p.mo43615o()), "droppedFrames", String.valueOf(this.f28533p.mo43609i()), "reportTime", String.valueOf(zzt.m2889b().mo21950a()));
                } else {
                    m45341t("timeupdate", "time", String.valueOf(f));
                }
                this.f28519C = h;
            }
        }
    }

    /* renamed from: E */
    public final void mo43666E() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43630r();
        }
    }

    /* renamed from: F */
    public final void mo43667F() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43631s();
        }
    }

    /* renamed from: G */
    public final void mo43668G(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43632t(i);
        }
    }

    /* renamed from: H */
    public final void mo43669H(MotionEvent motionEvent) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: I */
    public final void mo43670I(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43655z(i);
        }
    }

    /* renamed from: J */
    public final void mo43671J(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43650A(i);
        }
    }

    /* renamed from: a */
    public final void mo43638a(int i, int i2) {
        if (this.f28518B) {
            zzbiu zzbiu = zzbjc.f26846E;
            int max = Math.max(i / ((Integer) zzay.m1924c().mo42663b(zzbiu)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzay.m1924c().mo42663b(zzbiu)).intValue(), 1);
            Bitmap bitmap = this.f28523G;
            if (bitmap == null || bitmap.getWidth() != max || this.f28523G.getHeight() != max2) {
                this.f28523G = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f28525I = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo43639b() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26868G1)).booleanValue()) {
            this.f28531g.mo43777b();
        }
        if (this.f28527a.mo43756i() != null && !this.f28535z) {
            boolean z = (this.f28527a.mo43756i().getWindow().getAttributes().flags & 128) != 0;
            this.f28517A = z;
            if (!z) {
                this.f28527a.mo43756i().getWindow().addFlags(128);
                this.f28535z = true;
            }
        }
        this.f28534s = true;
    }

    /* renamed from: c */
    public final void mo43640c() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null && this.f28520D == 0) {
            m45341t("canplaythrough", TypedValues.Transition.S_DURATION, String.valueOf(((float) zzcie.mo43610j()) / 1000.0f), "videoWidth", String.valueOf(this.f28533p.mo43612l()), "videoHeight", String.valueOf(this.f28533p.mo43611k()));
        }
    }

    /* renamed from: d */
    public final void mo43641d() {
        m45341t("pause", new String[0]);
        m45340s();
        this.f28534s = false;
    }

    /* renamed from: e */
    public final void mo43642e() {
        this.f28531g.mo43777b();
        zzs.f2304i.post(new zzcij(this));
    }

    /* renamed from: f */
    public final void mo43643f() {
        this.f28529d.setVisibility(4);
        zzs.f2304i.post(new zzcii(this));
    }

    public final void finalize() throws Throwable {
        try {
            this.f28531g.mo43776a();
            zzcie zzcie = this.f28533p;
            if (zzcie != null) {
                zzchc.f28460e.execute(new zzcig(zzcie));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo43644g() {
        if (this.f28525I && this.f28523G != null && !m45342u()) {
            this.f28524H.setImageBitmap(this.f28523G);
            this.f28524H.invalidate();
            this.f28528c.addView(this.f28524H, new FrameLayout.LayoutParams(-1, -1));
            this.f28528c.bringChildToFront(this.f28524H);
        }
        this.f28531g.mo43776a();
        this.f28520D = this.f28519C;
        zzs.f2304i.post(new zzcik(this));
    }

    /* renamed from: h */
    public final void mo43673h(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43651B(i);
        }
    }

    /* renamed from: i */
    public final void mo43645i() {
        if (this.f28534s && m45342u()) {
            this.f28528c.removeView(this.f28524H);
        }
        if (this.f28533p != null && this.f28523G != null) {
            long c = zzt.m2889b().mo21952c();
            if (this.f28533p.getBitmap(this.f28523G) != null) {
                this.f28525I = true;
            }
            long c2 = zzt.m2889b().mo21952c() - c;
            if (zze.m2647m()) {
                zze.m2645k("Spinner frame grab took " + c2 + "ms");
            }
            if (c2 > this.f28532o) {
                zzcgp.m45229g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f28518B = false;
                this.f28523G = null;
                zzbjr zzbjr = this.f28530f;
                if (zzbjr != null) {
                    zzbjr.mo42690d("spinner_jank", Long.toString(c2));
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo43674j(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43652C(i);
        }
    }

    /* renamed from: k */
    public final void mo43675k(int i) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26836D)).booleanValue()) {
            this.f28528c.setBackgroundColor(i);
            this.f28529d.setBackgroundColor(i);
        }
    }

    /* renamed from: l */
    public final void mo43676l(int i) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43653e(i);
        }
    }

    /* renamed from: m */
    public final void mo43677m(String str, String[] strArr) {
        this.f28521E = str;
        this.f28522F = strArr;
    }

    /* renamed from: n */
    public final void mo43678n(int i, int i2, int i3, int i4) {
        if (zze.m2647m()) {
            zze.m2645k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f28528c.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: o */
    public final void mo43679o(float f) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.f28507c.mo43783e(f);
            zzcie.mo43614n();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f28531g.mo43777b();
        } else {
            this.f28531g.mo43776a();
            this.f28520D = this.f28519C;
        }
        zzs.f2304i.post(new zzcih(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f28531g.mo43777b();
            z = true;
        } else {
            this.f28531g.mo43776a();
            this.f28520D = this.f28519C;
            z = false;
        }
        zzs.f2304i.post(new zzcil(this, z));
    }

    /* renamed from: p */
    public final void mo43681p(float f, float f2) {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43637y(f, f2);
        }
    }

    /* renamed from: q */
    public final void mo43647q(String str, @Nullable String str2) {
        m45341t("error", "what", str, "extra", str2);
    }

    /* renamed from: r */
    public final void mo43682r() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.f28507c.mo43782d(false);
            zzcie.mo43614n();
        }
    }

    @Nullable
    /* renamed from: v */
    public final Integer mo43683v() {
        zzcie zzcie = this.f28533p;
        return zzcie != null ? zzcie.f28508d : this.f28526J;
    }

    /* renamed from: x */
    public final void mo43684x() {
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            TextView textView = new TextView(zzcie.getContext());
            textView.setText("AdMob - ".concat(this.f28533p.mo43629q()));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.f28528c.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f28528c.bringChildToFront(textView);
        }
    }

    /* renamed from: y */
    public final void mo43685y() {
        this.f28531g.mo43776a();
        zzcie zzcie = this.f28533p;
        if (zzcie != null) {
            zzcie.mo43636x();
        }
        m45340s();
    }

    /* renamed from: y1 */
    public final void mo43648y1(String str, @Nullable String str2) {
        m45341t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo43686z() {
        m45341t("firstFrameRendered", new String[0]);
    }

    public final void zza() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26868G1)).booleanValue()) {
            this.f28531g.mo43776a();
        }
        m45341t("ended", new String[0]);
        m45340s();
    }
}
