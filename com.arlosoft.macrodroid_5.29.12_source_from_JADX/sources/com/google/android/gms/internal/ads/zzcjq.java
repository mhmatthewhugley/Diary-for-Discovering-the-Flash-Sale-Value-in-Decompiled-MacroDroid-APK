package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcjq extends zzcie implements TextureView.SurfaceTextureListener, zzcio {

    /* renamed from: A */
    private String f28645A;

    /* renamed from: B */
    private String[] f28646B;

    /* renamed from: C */
    private boolean f28647C;

    /* renamed from: D */
    private int f28648D = 1;

    /* renamed from: E */
    private zzciw f28649E;

    /* renamed from: F */
    private final boolean f28650F;

    /* renamed from: G */
    private boolean f28651G;

    /* renamed from: H */
    private boolean f28652H;

    /* renamed from: I */
    private int f28653I;

    /* renamed from: J */
    private int f28654J;

    /* renamed from: K */
    private float f28655K;

    /* renamed from: f */
    private final zzciy f28656f;

    /* renamed from: g */
    private final zzciz f28657g;

    /* renamed from: o */
    private final zzcix f28658o;

    /* renamed from: p */
    private zzcid f28659p;

    /* renamed from: s */
    private Surface f28660s;

    /* renamed from: z */
    private zzcip f28661z;

    public zzcjq(Context context, zzciz zzciz, zzciy zzciy, boolean z, boolean z2, zzcix zzcix, @Nullable Integer num) {
        super(context, num);
        this.f28656f = zzciy;
        this.f28657g = zzciz;
        this.f28650F = z;
        this.f28658o = zzcix;
        setSurfaceTextureListener(this);
        zzciz.mo43770a(this);
    }

    /* renamed from: S */
    private static String m45477S(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    /* renamed from: T */
    private final void m45478T() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43711S(true);
        }
    }

    /* renamed from: U */
    private final void m45479U() {
        if (!this.f28651G) {
            this.f28651G = true;
            zzs.f2304i.post(new zzcjk(this));
            mo43614n();
            this.f28657g.mo43771b();
            if (this.f28652H) {
                mo43631s();
            }
        }
    }

    /* renamed from: V */
    private final void m45480V(boolean z) {
        zzcip zzcip = this.f28661z;
        if ((zzcip == null || z) && this.f28645A != null && this.f28660s != null) {
            if (z) {
                if (m45488d0()) {
                    zzcip.mo43715W();
                    m45482X();
                } else {
                    zzcgp.m45229g("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.f28645A.startsWith("cache:")) {
                zzclb x = this.f28656f.mo43767x(this.f28645A);
                if (x instanceof zzclk) {
                    zzcip v = ((zzclk) x).mo43915v();
                    this.f28661z = v;
                    if (!v.mo43716X()) {
                        zzcgp.m45229g("Precached video player has been released.");
                        return;
                    }
                } else if (x instanceof zzclh) {
                    zzclh zzclh = (zzclh) x;
                    String E = mo43799E();
                    ByteBuffer x2 = zzclh.mo43911x();
                    boolean y = zzclh.mo43912y();
                    String v2 = zzclh.mo43910v();
                    if (v2 == null) {
                        zzcgp.m45229g("Stream cache URL is null.");
                        return;
                    }
                    zzcip D = mo43798D();
                    this.f28661z = D;
                    D.mo43702I(new Uri[]{Uri.parse(v2)}, E, x2, y);
                } else {
                    zzcgp.m45229g("Stream cache miss: ".concat(String.valueOf(this.f28645A)));
                    return;
                }
            } else {
                this.f28661z = mo43798D();
                String E2 = mo43799E();
                Uri[] uriArr = new Uri[this.f28646B.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f28646B;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f28661z.mo43701H(uriArr, E2);
            }
            this.f28661z.mo43707N(this);
            m45484Z(this.f28660s, false);
            if (this.f28661z.mo43716X()) {
                int a0 = this.f28661z.mo43718a0();
                this.f28648D = a0;
                if (a0 == 3) {
                    m45479U();
                }
            }
        }
    }

    /* renamed from: W */
    private final void m45481W() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43711S(false);
        }
    }

    /* renamed from: X */
    private final void m45482X() {
        if (this.f28661z != null) {
            m45484Z((Surface) null, true);
            zzcip zzcip = this.f28661z;
            if (zzcip != null) {
                zzcip.mo43707N((zzcio) null);
                this.f28661z.mo43703J();
                this.f28661z = null;
            }
            this.f28648D = 1;
            this.f28647C = false;
            this.f28651G = false;
            this.f28652H = false;
        }
    }

    /* renamed from: Y */
    private final void m45483Y(float f, boolean z) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            try {
                zzcip.mo43714V(f, false);
            } catch (IOException e) {
                zzcgp.m45230h("", e);
            }
        } else {
            zzcgp.m45229g("Trying to set volume before player is initialized.");
        }
    }

    /* renamed from: Z */
    private final void m45484Z(Surface surface, boolean z) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            try {
                zzcip.mo43713U(surface, z);
            } catch (IOException e) {
                zzcgp.m45230h("", e);
            }
        } else {
            zzcgp.m45229g("Trying to set surface before player is initialized.");
        }
    }

    /* renamed from: a0 */
    private final void m45485a0() {
        m45486b0(this.f28653I, this.f28654J);
    }

    /* renamed from: b0 */
    private final void m45486b0(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f28655K != f) {
            this.f28655K = f;
            requestLayout();
        }
    }

    /* renamed from: c0 */
    private final boolean m45487c0() {
        return m45488d0() && this.f28648D != 1;
    }

    /* renamed from: d0 */
    private final boolean m45488d0() {
        zzcip zzcip = this.f28661z;
        return zzcip != null && zzcip.mo43716X() && !this.f28647C;
    }

    /* renamed from: A */
    public final void mo43650A(int i) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43706M(i);
        }
    }

    /* renamed from: B */
    public final void mo43651B(int i) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43708P(i);
        }
    }

    /* renamed from: C */
    public final void mo43652C(int i) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43709Q(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final zzcip mo43798D() {
        if (this.f28658o.f28594m) {
            return new zzcmc(this.f28656f.getContext(), this.f28658o, this.f28656f);
        }
        return new zzckg(this.f28656f.getContext(), this.f28658o, this.f28656f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo43799E() {
        return zzt.m2905r().mo20412z(this.f28656f.getContext(), this.f28656f.mo43759m().f28446a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo43800F(String str) {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43647q("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo43801G() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.zza();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo43802H() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43640c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo43803I(boolean z, long j) {
        this.f28656f.mo43769y0(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo43804J(String str) {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43648y1("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo43805K() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43643f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo43806L() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43642e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo43807M() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43644g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo43808N(int i, int i2) {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43638a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo43809O() {
        m45483Y(this.f28507c.mo43779a(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo43810P(int i) {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo43811Q() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43641d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final /* synthetic */ void mo43812R() {
        zzcid zzcid = this.f28659p;
        if (zzcid != null) {
            zzcid.mo43639b();
        }
    }

    /* renamed from: a */
    public final void mo43693a(int i, int i2) {
        this.f28653I = i;
        this.f28654J = i2;
        m45485a0();
    }

    /* renamed from: b */
    public final void mo43694b(int i) {
        if (this.f28648D != i) {
            this.f28648D = i;
            if (i == 3) {
                m45479U();
            } else if (i == 4) {
                if (this.f28658o.f28582a) {
                    m45481W();
                }
                this.f28657g.mo43774e();
                this.f28507c.mo43781c();
                zzs.f2304i.post(new zzcje(this));
            }
        }
    }

    /* renamed from: c */
    public final void mo43695c(String str, Exception exc) {
        String S = m45477S("onLoadException", exc);
        zzcgp.m45229g("ExoPlayerAdapter exception: ".concat(S));
        zzt.m2904q().mo43502s(exc, "AdExoPlayerView.onException");
        zzs.f2304i.post(new zzcjf(this, S));
    }

    /* renamed from: d */
    public final void mo43696d(boolean z, long j) {
        if (this.f28656f != null) {
            zzchc.f28460e.execute(new zzcjd(this, z, j));
        }
    }

    /* renamed from: e */
    public final void mo43653e(int i) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43712T(i);
        }
    }

    /* renamed from: f */
    public final void mo43654f(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.f28646B = new String[]{str};
            } else {
                this.f28646B = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.f28645A;
            if (!this.f28658o.f28595n || str2 == null || str.equals(str2) || this.f28648D != 4) {
                z = false;
            }
            this.f28645A = str;
            m45480V(z);
        }
    }

    /* renamed from: g */
    public final void mo43697g(String str, Exception exc) {
        String S = m45477S(str, exc);
        zzcgp.m45229g("ExoPlayerAdapter error: ".concat(S));
        this.f28647C = true;
        if (this.f28658o.f28582a) {
            m45481W();
        }
        zzs.f2304i.post(new zzcjg(this, S));
        zzt.m2904q().mo43502s(exc, "AdExoPlayerView.onError");
    }

    /* renamed from: h */
    public final int mo43608h() {
        if (m45487c0()) {
            return (int) this.f28661z.mo43722f0();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo43609i() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            return zzcip.mo43717Y();
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo43610j() {
        if (m45487c0()) {
            return (int) this.f28661z.mo43723g0();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo43611k() {
        return this.f28654J;
    }

    /* renamed from: l */
    public final int mo43612l() {
        return this.f28653I;
    }

    /* renamed from: m */
    public final long mo43613m() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            return zzcip.mo43721e0();
        }
        return -1;
    }

    /* renamed from: n */
    public final void mo43614n() {
        if (this.f28658o.f28594m) {
            zzs.f2304i.post(new zzcji(this));
        } else {
            m45483Y(this.f28507c.mo43779a(), false);
        }
    }

    /* renamed from: o */
    public final long mo43615o() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            return zzcip.mo43699F();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f28655K;
        if (f != 0.0f && this.f28649E == null) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / ((float) measuredHeight);
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (((float) measuredHeight) * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzciw zzciw = this.f28649E;
        if (zzciw != null) {
            zzciw.mo43736b(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f28650F) {
            zzciw zzciw = new zzciw(getContext());
            this.f28649E = zzciw;
            zzciw.mo43737c(surfaceTexture, i, i2);
            this.f28649E.start();
            SurfaceTexture a = this.f28649E.mo43735a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.f28649E.mo43738d();
                this.f28649E = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f28660s = surface;
        if (this.f28661z == null) {
            m45480V(false);
        } else {
            m45484Z(surface, true);
            if (!this.f28658o.f28582a) {
                m45478T();
            }
        }
        if (this.f28653I == 0 || this.f28654J == 0) {
            m45486b0(i, i2);
        } else {
            m45485a0();
        }
        zzs.f2304i.post(new zzcjl(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo43630r();
        zzciw zzciw = this.f28649E;
        if (zzciw != null) {
            zzciw.mo43738d();
            this.f28649E = null;
        }
        if (this.f28661z != null) {
            m45481W();
            Surface surface = this.f28660s;
            if (surface != null) {
                surface.release();
            }
            this.f28660s = null;
            m45484Z((Surface) null, true);
        }
        zzs.f2304i.post(new zzcjo(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzciw zzciw = this.f28649E;
        if (zzciw != null) {
            zzciw.mo43736b(i, i2);
        }
        zzs.f2304i.post(new zzcjn(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f28657g.mo43775f(this);
        this.f28506a.mo43725a(surfaceTexture, this.f28659p);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.m2645k("AdExoPlayerView3 window visibility changed to " + i);
        zzs.f2304i.post(new zzcjm(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final long mo43628p() {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            return zzcip.mo43700G();
        }
        return -1;
    }

    /* renamed from: q */
    public final String mo43629q() {
        return "ExoPlayer/3".concat(true != this.f28650F ? "" : " spherical");
    }

    /* renamed from: r */
    public final void mo43630r() {
        if (m45487c0()) {
            if (this.f28658o.f28582a) {
                m45481W();
            }
            this.f28661z.mo43710R(false);
            this.f28657g.mo43774e();
            this.f28507c.mo43781c();
            zzs.f2304i.post(new zzcjj(this));
        }
    }

    /* renamed from: s */
    public final void mo43631s() {
        if (m45487c0()) {
            if (this.f28658o.f28582a) {
                m45478T();
            }
            this.f28661z.mo43710R(true);
            this.f28657g.mo43772c();
            this.f28507c.mo43780b();
            this.f28506a.mo43726b();
            zzs.f2304i.post(new zzcjp(this));
            return;
        }
        this.f28652H = true;
    }

    /* renamed from: t */
    public final void mo43632t(int i) {
        if (m45487c0()) {
            this.f28661z.mo43704K((long) i);
        }
    }

    /* renamed from: u */
    public final void mo43634u(zzcid zzcid) {
        this.f28659p = zzcid;
    }

    /* renamed from: v */
    public final void mo43635v(String str) {
        if (str != null) {
            mo43654f(str, (String[]) null);
        }
    }

    /* renamed from: w */
    public final void mo43698w() {
        zzs.f2304i.post(new zzcjh(this));
    }

    /* renamed from: x */
    public final void mo43636x() {
        if (m45488d0()) {
            this.f28661z.mo43715W();
            m45482X();
        }
        this.f28657g.mo43774e();
        this.f28507c.mo43781c();
        this.f28657g.mo43773d();
    }

    /* renamed from: y */
    public final void mo43637y(float f, float f2) {
        zzciw zzciw = this.f28649E;
        if (zzciw != null) {
            zzciw.mo43739e(f, f2);
        }
    }

    /* renamed from: z */
    public final void mo43655z(int i) {
        zzcip zzcip = this.f28661z;
        if (zzcip != null) {
            zzcip.mo43705L(i);
        }
    }
}
