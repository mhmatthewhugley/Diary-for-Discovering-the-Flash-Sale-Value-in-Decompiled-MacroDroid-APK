package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001a0.C0006d;
import p001a0.C0007e;
import p001a0.C0009g;
import p012b0.C1399c;
import p047s.C2090a;
import p047s.C2091b;
import p048t.C2097e;
import p048t.C2100h;
import p051w.C2143b;
import p054y.C2194s;

/* renamed from: com.airbnb.lottie.f */
/* compiled from: LottieDrawable */
public class C1472f extends Drawable implements Drawable.Callback, Animatable {
    @Nullable

    /* renamed from: A */
    private C2091b f924A;
    @Nullable

    /* renamed from: B */
    private C2091b f925B;
    @Nullable

    /* renamed from: C */
    private String f926C;
    @Nullable

    /* renamed from: D */
    private C1460b f927D;
    @Nullable

    /* renamed from: E */
    private C2090a f928E;

    /* renamed from: F */
    private boolean f929F;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: G */
    public C2143b f930G;

    /* renamed from: H */
    private int f931H;

    /* renamed from: I */
    private boolean f932I;

    /* renamed from: J */
    private boolean f933J;

    /* renamed from: K */
    private boolean f934K;

    /* renamed from: L */
    private boolean f935L;

    /* renamed from: M */
    private boolean f936M;

    /* renamed from: a */
    private final Matrix f937a = new Matrix();

    /* renamed from: c */
    private C1463d f938c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0007e f939d;

    /* renamed from: f */
    private float f940f;

    /* renamed from: g */
    private boolean f941g;

    /* renamed from: o */
    private boolean f942o;

    /* renamed from: p */
    private boolean f943p;

    /* renamed from: s */
    private final ArrayList<C1487o> f944s;

    /* renamed from: z */
    private final ValueAnimator.AnimatorUpdateListener f945z;

    /* renamed from: com.airbnb.lottie.f$a */
    /* compiled from: LottieDrawable */
    class C1473a implements C1487o {

        /* renamed from: a */
        final /* synthetic */ String f946a;

        C1473a(String str) {
            this.f946a = str;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17110Y(this.f946a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$b */
    /* compiled from: LottieDrawable */
    class C1474b implements C1487o {

        /* renamed from: a */
        final /* synthetic */ int f948a;

        /* renamed from: b */
        final /* synthetic */ int f949b;

        C1474b(int i, int i2) {
            this.f948a = i;
            this.f949b = i2;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17109X(this.f948a, this.f949b);
        }
    }

    /* renamed from: com.airbnb.lottie.f$c */
    /* compiled from: LottieDrawable */
    class C1475c implements C1487o {

        /* renamed from: a */
        final /* synthetic */ int f951a;

        C1475c(int i) {
            this.f951a = i;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17102Q(this.f951a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$d */
    /* compiled from: LottieDrawable */
    class C1476d implements C1487o {

        /* renamed from: a */
        final /* synthetic */ float f953a;

        C1476d(float f) {
            this.f953a = f;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17118e0(this.f953a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$e */
    /* compiled from: LottieDrawable */
    class C1477e implements C1487o {

        /* renamed from: a */
        final /* synthetic */ C2097e f955a;

        /* renamed from: b */
        final /* synthetic */ Object f956b;

        /* renamed from: c */
        final /* synthetic */ C1399c f957c;

        C1477e(C2097e eVar, Object obj, C1399c cVar) {
            this.f955a = eVar;
            this.f956b = obj;
            this.f957c = cVar;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17114c(this.f955a, this.f956b, this.f957c);
        }
    }

    /* renamed from: com.airbnb.lottie.f$f */
    /* compiled from: LottieDrawable */
    class C1478f implements ValueAnimator.AnimatorUpdateListener {
        C1478f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C1472f.this.f930G != null) {
                C1472f.this.f930G.mo24346H(C1472f.this.f939d.mo45h());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.f$g */
    /* compiled from: LottieDrawable */
    class C1479g implements C1487o {
        C1479g() {
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17096K();
        }
    }

    /* renamed from: com.airbnb.lottie.f$h */
    /* compiled from: LottieDrawable */
    class C1480h implements C1487o {
        C1480h() {
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17098M();
        }
    }

    /* renamed from: com.airbnb.lottie.f$i */
    /* compiled from: LottieDrawable */
    class C1481i implements C1487o {

        /* renamed from: a */
        final /* synthetic */ int f962a;

        C1481i(int i) {
            this.f962a = i;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17111Z(this.f962a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$j */
    /* compiled from: LottieDrawable */
    class C1482j implements C1487o {

        /* renamed from: a */
        final /* synthetic */ float f964a;

        C1482j(float f) {
            this.f964a = f;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17113b0(this.f964a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$k */
    /* compiled from: LottieDrawable */
    class C1483k implements C1487o {

        /* renamed from: a */
        final /* synthetic */ int f966a;

        C1483k(int i) {
            this.f966a = i;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17106U(this.f966a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$l */
    /* compiled from: LottieDrawable */
    class C1484l implements C1487o {

        /* renamed from: a */
        final /* synthetic */ float f968a;

        C1484l(float f) {
            this.f968a = f;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17108W(this.f968a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$m */
    /* compiled from: LottieDrawable */
    class C1485m implements C1487o {

        /* renamed from: a */
        final /* synthetic */ String f970a;

        C1485m(String str) {
            this.f970a = str;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17112a0(this.f970a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$n */
    /* compiled from: LottieDrawable */
    class C1486n implements C1487o {

        /* renamed from: a */
        final /* synthetic */ String f972a;

        C1486n(String str) {
            this.f972a = str;
        }

        /* renamed from: a */
        public void mo17152a(C1463d dVar) {
            C1472f.this.mo17107V(this.f972a);
        }
    }

    /* renamed from: com.airbnb.lottie.f$o */
    /* compiled from: LottieDrawable */
    private interface C1487o {
        /* renamed from: a */
        void mo17152a(C1463d dVar);
    }

    public C1472f() {
        C0007e eVar = new C0007e();
        this.f939d = eVar;
        this.f940f = 1.0f;
        this.f941g = true;
        this.f942o = false;
        this.f943p = false;
        this.f944s = new ArrayList<>();
        C1478f fVar = new C1478f();
        this.f945z = fVar;
        this.f931H = 255;
        this.f935L = true;
        this.f936M = false;
        eVar.addUpdateListener(fVar);
    }

    /* renamed from: d */
    private boolean m793d() {
        return this.f941g || this.f942o;
    }

    /* renamed from: e */
    private float m794e(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: f */
    private boolean m795f() {
        C1463d dVar = this.f938c;
        if (dVar == null || getBounds().isEmpty() || m794e(getBounds()) == m794e(dVar.mo17053b())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m796g() {
        C2143b bVar = new C2143b(this, C2194s.m9015a(this.f938c), this.f938c.mo17061j(), this.f938c);
        this.f930G = bVar;
        if (this.f933J) {
            bVar.mo24344F(true);
        }
    }

    /* renamed from: j */
    private void m797j(@NonNull Canvas canvas) {
        if (!m795f()) {
            m798k(canvas);
        } else {
            m799l(canvas);
        }
    }

    /* renamed from: k */
    private void m798k(Canvas canvas) {
        float f;
        if (this.f930G != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f938c.mo17053b().width());
            float height = ((float) bounds.height()) / ((float) this.f938c.mo17053b().height());
            if (this.f935L) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f937a.reset();
            this.f937a.preScale(width, height);
            this.f930G.mo24128g(canvas, this.f937a, this.f931H);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: l */
    private void m799l(Canvas canvas) {
        float f;
        if (this.f930G != null) {
            float f2 = this.f940f;
            float x = m803x(canvas);
            if (f2 > x) {
                f = this.f940f / x;
            } else {
                x = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f938c.mo17053b().width()) / 2.0f;
                float height = ((float) this.f938c.mo17053b().height()) / 2.0f;
                float f3 = width * x;
                float f4 = height * x;
                canvas.translate((mo17089D() * width) - f3, (mo17089D() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f937a.reset();
            this.f937a.preScale(x, x);
            this.f930G.mo24128g(canvas, this.f937a, this.f931H);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Nullable
    /* renamed from: q */
    private Context m800q() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: r */
    private C2090a m801r() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f928E == null) {
            this.f928E = new C2090a(getCallback(), (C1459a) null);
        }
        return this.f928E;
    }

    /* renamed from: u */
    private C2091b m802u() {
        C2091b bVar = this.f924A;
        if (bVar != null) {
            return bVar;
        }
        if (getCallback() == null) {
            return null;
        }
        C2091b bVar2 = this.f925B;
        if (bVar2 != null && !bVar2.mo24198b(m800q())) {
            this.f925B = null;
        }
        if (this.f925B == null) {
            this.f925B = new C2091b(getCallback(), this.f926C, this.f927D, this.f938c.mo17060i());
        }
        return this.f925B;
    }

    /* renamed from: x */
    private float m803x(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f938c.mo17053b().width()), ((float) canvas.getHeight()) / ((float) this.f938c.mo17053b().height()));
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    /* renamed from: A */
    public float mo17086A() {
        return this.f939d.mo45h();
    }

    /* renamed from: B */
    public int mo17087B() {
        return this.f939d.getRepeatCount();
    }

    /* renamed from: C */
    public int mo17088C() {
        return this.f939d.getRepeatMode();
    }

    /* renamed from: D */
    public float mo17089D() {
        return this.f940f;
    }

    /* renamed from: E */
    public float mo17090E() {
        return this.f939d.mo50p();
    }

    @Nullable
    /* renamed from: F */
    public C1502q mo17091F() {
        return null;
    }

    @Nullable
    /* renamed from: G */
    public Typeface mo17092G(String str, String str2) {
        C2090a r = m801r();
        if (r != null) {
            return r.mo24195b(str, str2);
        }
        return null;
    }

    /* renamed from: H */
    public boolean mo17093H() {
        C0007e eVar = this.f939d;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    /* renamed from: I */
    public boolean mo17094I() {
        return this.f934K;
    }

    /* renamed from: J */
    public void mo17095J() {
        this.f944s.clear();
        this.f939d.mo51r();
    }

    @MainThread
    /* renamed from: K */
    public void mo17096K() {
        if (this.f930G == null) {
            this.f944s.add(new C1479g());
            return;
        }
        if (m793d() || mo17087B() == 0) {
            this.f939d.mo52s();
        }
        if (!m793d()) {
            mo17102Q((int) (mo17090E() < 0.0f ? mo17150y() : mo17149w()));
            this.f939d.mo41g();
        }
    }

    /* renamed from: L */
    public List<C2097e> mo17097L(C2097e eVar) {
        if (this.f930G == null) {
            C0006d.m32c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f930G.mo24126d(eVar, 0, arrayList, new C2097e(new String[0]));
        return arrayList;
    }

    @MainThread
    /* renamed from: M */
    public void mo17098M() {
        if (this.f930G == null) {
            this.f944s.add(new C1480h());
            return;
        }
        if (m793d() || mo17087B() == 0) {
            this.f939d.mo57x();
        }
        if (!m793d()) {
            mo17102Q((int) (mo17090E() < 0.0f ? mo17150y() : mo17149w()));
            this.f939d.mo41g();
        }
    }

    /* renamed from: N */
    public void mo17099N(boolean z) {
        this.f934K = z;
    }

    /* renamed from: O */
    public boolean mo17100O(C1463d dVar) {
        if (this.f938c == dVar) {
            return false;
        }
        this.f936M = false;
        mo17127i();
        this.f938c = dVar;
        m796g();
        this.f939d.mo59z(dVar);
        mo17118e0(this.f939d.getAnimatedFraction());
        mo17128i0(this.f940f);
        Iterator it = new ArrayList(this.f944s).iterator();
        while (it.hasNext()) {
            C1487o oVar = (C1487o) it.next();
            if (oVar != null) {
                oVar.mo17152a(dVar);
            }
            it.remove();
        }
        this.f944s.clear();
        dVar.mo17073u(this.f932I);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: P */
    public void mo17101P(C1459a aVar) {
        C2090a aVar2 = this.f928E;
        if (aVar2 != null) {
            aVar2.mo24196c(aVar);
        }
    }

    /* renamed from: Q */
    public void mo17102Q(int i) {
        if (this.f938c == null) {
            this.f944s.add(new C1475c(i));
        } else {
            this.f939d.mo33A((float) i);
        }
    }

    /* renamed from: R */
    public void mo17103R(boolean z) {
        this.f942o = z;
    }

    /* renamed from: S */
    public void mo17104S(C1460b bVar) {
        this.f927D = bVar;
        C2091b bVar2 = this.f925B;
        if (bVar2 != null) {
            bVar2.mo24199d(bVar);
        }
    }

    /* renamed from: T */
    public void mo17105T(@Nullable String str) {
        this.f926C = str;
    }

    /* renamed from: U */
    public void mo17106U(int i) {
        if (this.f938c == null) {
            this.f944s.add(new C1483k(i));
        } else {
            this.f939d.mo34B(((float) i) + 0.99f);
        }
    }

    /* renamed from: V */
    public void mo17107V(String str) {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            this.f944s.add(new C1486n(str));
            return;
        }
        C2100h k = dVar.mo17062k(str);
        if (k != null) {
            mo17106U((int) (k.f6519b + k.f6520c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: W */
    public void mo17108W(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            this.f944s.add(new C1484l(f));
        } else {
            mo17106U((int) C0009g.m68k(dVar.mo17066o(), this.f938c.mo17057f(), f));
        }
    }

    /* renamed from: X */
    public void mo17109X(int i, int i2) {
        if (this.f938c == null) {
            this.f944s.add(new C1474b(i, i2));
        } else {
            this.f939d.mo35C((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: Y */
    public void mo17110Y(String str) {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            this.f944s.add(new C1473a(str));
            return;
        }
        C2100h k = dVar.mo17062k(str);
        if (k != null) {
            int i = (int) k.f6519b;
            mo17109X(i, ((int) k.f6520c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: Z */
    public void mo17111Z(int i) {
        if (this.f938c == null) {
            this.f944s.add(new C1481i(i));
        } else {
            this.f939d.mo36D(i);
        }
    }

    /* renamed from: a0 */
    public void mo17112a0(String str) {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            this.f944s.add(new C1485m(str));
            return;
        }
        C2100h k = dVar.mo17062k(str);
        if (k != null) {
            mo17111Z((int) k.f6519b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: b0 */
    public void mo17113b0(float f) {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            this.f944s.add(new C1482j(f));
        } else {
            mo17111Z((int) C0009g.m68k(dVar.mo17066o(), this.f938c.mo17057f(), f));
        }
    }

    /* renamed from: c */
    public <T> void mo17114c(C2097e eVar, T t, C1399c<T> cVar) {
        C2143b bVar = this.f930G;
        if (bVar == null) {
            this.f944s.add(new C1477e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar == C2097e.f6512c) {
            bVar.mo24125c(t, cVar);
        } else if (eVar.mo24215d() != null) {
            eVar.mo24215d().mo24125c(t, cVar);
        } else {
            List<C2097e> L = mo17097L(eVar);
            for (int i = 0; i < L.size(); i++) {
                L.get(i).mo24215d().mo24125c(t, cVar);
            }
            z = true ^ L.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C1492k.f982C) {
                mo17118e0(mo17086A());
            }
        }
    }

    /* renamed from: c0 */
    public void mo17115c0(boolean z) {
        if (this.f933J != z) {
            this.f933J = z;
            C2143b bVar = this.f930G;
            if (bVar != null) {
                bVar.mo24344F(z);
            }
        }
    }

    /* renamed from: d0 */
    public void mo17116d0(boolean z) {
        this.f932I = z;
        C1463d dVar = this.f938c;
        if (dVar != null) {
            dVar.mo17073u(z);
        }
    }

    public void draw(@NonNull Canvas canvas) {
        this.f936M = false;
        C1461c.m735a("Drawable#draw");
        if (this.f943p) {
            try {
                m797j(canvas);
            } catch (Throwable th) {
                C0006d.m31b("Lottie crashed in draw!", th);
            }
        } else {
            m797j(canvas);
        }
        C1461c.m736b("Drawable#draw");
    }

    /* renamed from: e0 */
    public void mo17118e0(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        if (this.f938c == null) {
            this.f944s.add(new C1476d(f));
            return;
        }
        C1461c.m735a("Drawable#setProgress");
        this.f939d.mo33A(C0009g.m68k(this.f938c.mo17066o(), this.f938c.mo17057f(), f));
        C1461c.m736b("Drawable#setProgress");
    }

    /* renamed from: f0 */
    public void mo17119f0(int i) {
        this.f939d.setRepeatCount(i);
    }

    /* renamed from: g0 */
    public void mo17120g0(int i) {
        this.f939d.setRepeatMode(i);
    }

    public int getAlpha() {
        return this.f931H;
    }

    public int getIntrinsicHeight() {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo17053b().height()) * mo17089D());
    }

    public int getIntrinsicWidth() {
        C1463d dVar = this.f938c;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo17053b().width()) * mo17089D());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void mo17125h() {
        this.f944s.clear();
        this.f939d.cancel();
    }

    /* renamed from: h0 */
    public void mo17126h0(boolean z) {
        this.f943p = z;
    }

    /* renamed from: i */
    public void mo17127i() {
        if (this.f939d.isRunning()) {
            this.f939d.cancel();
        }
        this.f938c = null;
        this.f930G = null;
        this.f925B = null;
        this.f939d.mo40f();
        invalidateSelf();
    }

    /* renamed from: i0 */
    public void mo17128i0(float f) {
        this.f940f = f;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f936M) {
            this.f936M = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo17093H();
    }

    /* renamed from: j0 */
    public void mo17132j0(float f) {
        this.f939d.mo37E(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo17133k0(Boolean bool) {
        this.f941g = bool.booleanValue();
    }

    /* renamed from: l0 */
    public void mo17134l0(C1502q qVar) {
    }

    /* renamed from: m */
    public void mo17135m(boolean z) {
        if (this.f929F != z) {
            this.f929F = z;
            if (this.f938c != null) {
                m796g();
            }
        }
    }

    /* renamed from: m0 */
    public boolean mo17136m0() {
        return this.f938c.mo17054c().size() > 0;
    }

    /* renamed from: n */
    public boolean mo17137n() {
        return this.f929F;
    }

    @MainThread
    /* renamed from: o */
    public void mo17138o() {
        this.f944s.clear();
        this.f939d.mo41g();
    }

    /* renamed from: p */
    public C1463d mo17139p() {
        return this.f938c;
    }

    /* renamed from: s */
    public int mo17140s() {
        return (int) this.f939d.mo47k();
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(@IntRange(from = 0, mo610to = 255) int i) {
        this.f931H = i;
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        C0006d.m32c("Use addColorFilter instead.");
    }

    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo17096K();
        }
    }

    @MainThread
    public void stop() {
        mo17138o();
    }

    @Nullable
    /* renamed from: t */
    public Bitmap mo17146t(String str) {
        C2091b u = m802u();
        if (u != null) {
            return u.mo24197a(str);
        }
        return null;
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Nullable
    /* renamed from: v */
    public String mo17148v() {
        return this.f926C;
    }

    /* renamed from: w */
    public float mo17149w() {
        return this.f939d.mo48n();
    }

    /* renamed from: y */
    public float mo17150y() {
        return this.f939d.mo49o();
    }

    @Nullable
    /* renamed from: z */
    public C1497n mo17151z() {
        C1463d dVar = this.f938c;
        if (dVar != null) {
            return dVar.mo17064m();
        }
        return null;
    }
}
