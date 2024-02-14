package p051w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1463d;
import com.airbnb.lottie.C1472f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0006d;
import p001a0.C0010h;
import p012b0.C1399c;
import p043p.C2044a;
import p045q.C2049c;
import p045q.C2051e;
import p046r.C2068a;
import p046r.C2076c;
import p046r.C2080g;
import p046r.C2088o;
import p048t.C2097e;
import p048t.C2098f;
import p050v.C2122g;
import p050v.C2130l;
import p051w.C2146d;

/* renamed from: w.a */
/* compiled from: BaseLayer */
public abstract class C2140a implements C2051e, C2068a.C2070b, C2098f {

    /* renamed from: a */
    private final Path f6659a = new Path();

    /* renamed from: b */
    private final Matrix f6660b = new Matrix();

    /* renamed from: c */
    private final Paint f6661c = new C2044a(1);

    /* renamed from: d */
    private final Paint f6662d = new C2044a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f6663e = new C2044a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f6664f;

    /* renamed from: g */
    private final Paint f6665g;

    /* renamed from: h */
    private final RectF f6666h;

    /* renamed from: i */
    private final RectF f6667i;

    /* renamed from: j */
    private final RectF f6668j;

    /* renamed from: k */
    private final RectF f6669k;

    /* renamed from: l */
    private final String f6670l;

    /* renamed from: m */
    final Matrix f6671m;

    /* renamed from: n */
    final C1472f f6672n;

    /* renamed from: o */
    final C2146d f6673o;
    @Nullable

    /* renamed from: p */
    private C2080g f6674p;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: q */
    public C2076c f6675q;
    @Nullable

    /* renamed from: r */
    private C2140a f6676r;
    @Nullable

    /* renamed from: s */
    private C2140a f6677s;

    /* renamed from: t */
    private List<C2140a> f6678t;

    /* renamed from: u */
    private final List<C2068a<?, ?>> f6679u;

    /* renamed from: v */
    final C2088o f6680v;

    /* renamed from: w */
    private boolean f6681w;

    /* renamed from: x */
    private boolean f6682x;
    @Nullable

    /* renamed from: y */
    private Paint f6683y;

    /* renamed from: w.a$a */
    /* compiled from: BaseLayer */
    class C2141a implements C2068a.C2070b {
        C2141a() {
        }

        /* renamed from: a */
        public void mo24123a() {
            C2140a aVar = C2140a.this;
            aVar.m8827I(aVar.f6675q.mo24164p() == 1.0f);
        }
    }

    /* renamed from: w.a$b */
    /* compiled from: BaseLayer */
    static /* synthetic */ class C2142b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6685a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6686b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                v.g$a[] r0 = p050v.C2122g.C2123a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6686b = r0
                r1 = 1
                v.g$a r2 = p050v.C2122g.C2123a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6686b     // Catch:{ NoSuchFieldError -> 0x001d }
                v.g$a r3 = p050v.C2122g.C2123a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6686b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.g$a r4 = p050v.C2122g.C2123a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6686b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.g$a r5 = p050v.C2122g.C2123a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                w.d$a[] r4 = p051w.C2146d.C2147a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6685a = r4
                w.d$a r5 = p051w.C2146d.C2147a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6685a     // Catch:{ NoSuchFieldError -> 0x004e }
                w.d$a r4 = p051w.C2146d.C2147a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6685a     // Catch:{ NoSuchFieldError -> 0x0058 }
                w.d$a r1 = p051w.C2146d.C2147a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6685a     // Catch:{ NoSuchFieldError -> 0x0062 }
                w.d$a r1 = p051w.C2146d.C2147a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6685a     // Catch:{ NoSuchFieldError -> 0x006d }
                w.d$a r1 = p051w.C2146d.C2147a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6685a     // Catch:{ NoSuchFieldError -> 0x0078 }
                w.d$a r1 = p051w.C2146d.C2147a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6685a     // Catch:{ NoSuchFieldError -> 0x0083 }
                w.d$a r1 = p051w.C2146d.C2147a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051w.C2140a.C2142b.<clinit>():void");
        }
    }

    C2140a(C1472f fVar, C2146d dVar) {
        C2044a aVar = new C2044a(1);
        this.f6664f = aVar;
        this.f6665g = new C2044a(PorterDuff.Mode.CLEAR);
        this.f6666h = new RectF();
        this.f6667i = new RectF();
        this.f6668j = new RectF();
        this.f6669k = new RectF();
        this.f6671m = new Matrix();
        this.f6679u = new ArrayList();
        this.f6681w = true;
        this.f6672n = fVar;
        this.f6673o = dVar;
        this.f6670l = dVar.mo24358g() + "#draw";
        if (dVar.mo24357f() == C2146d.C2148b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C2088o b = dVar.mo24373u().mo24234b();
        this.f6680v = b;
        b.mo24187b(this);
        if (dVar.mo24356e() != null && !dVar.mo24356e().isEmpty()) {
            C2080g gVar = new C2080g(dVar.mo24356e());
            this.f6674p = gVar;
            for (C2068a<C2130l, Path> a : gVar.mo24171a()) {
                a.mo24142a(this);
            }
            for (C2068a next : this.f6674p.mo24173c()) {
                mo24347i(next);
                next.mo24142a(this);
            }
        }
        m8828J();
    }

    /* renamed from: A */
    private void m8825A() {
        this.f6672n.invalidateSelf();
    }

    /* renamed from: B */
    private void m8826B(float f) {
        this.f6672n.mo17139p().mo17064m().mo17171a(this.f6673o.mo24358g(), f);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m8827I(boolean z) {
        if (z != this.f6681w) {
            this.f6681w = z;
            m8825A();
        }
    }

    /* renamed from: J */
    private void m8828J() {
        boolean z = true;
        if (!this.f6673o.mo24354c().isEmpty()) {
            C2076c cVar = new C2076c(this.f6673o.mo24354c());
            this.f6675q = cVar;
            cVar.mo24152l();
            this.f6675q.mo24142a(new C2141a());
            if (((Float) this.f6675q.mo24148h()).floatValue() != 1.0f) {
                z = false;
            }
            m8827I(z);
            mo24347i(this.f6675q);
            return;
        }
        m8827I(true);
    }

    /* renamed from: j */
    private void m8831j(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        this.f6661c.setAlpha((int) (((float) aVar2.mo24148h().intValue()) * 2.55f));
        canvas.drawPath(this.f6659a, this.f6661c);
    }

    /* renamed from: k */
    private void m8832k(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        C0010h.m83m(canvas, this.f6666h, this.f6662d);
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        this.f6661c.setAlpha((int) (((float) aVar2.mo24148h().intValue()) * 2.55f));
        canvas.drawPath(this.f6659a, this.f6661c);
        canvas.restore();
    }

    /* renamed from: l */
    private void m8833l(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        C0010h.m83m(canvas, this.f6666h, this.f6661c);
        canvas.drawRect(this.f6666h, this.f6661c);
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        this.f6661c.setAlpha((int) (((float) aVar2.mo24148h().intValue()) * 2.55f));
        canvas.drawPath(this.f6659a, this.f6663e);
        canvas.restore();
    }

    /* renamed from: m */
    private void m8834m(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        C0010h.m83m(canvas, this.f6666h, this.f6662d);
        canvas.drawRect(this.f6666h, this.f6661c);
        this.f6663e.setAlpha((int) (((float) aVar2.mo24148h().intValue()) * 2.55f));
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        canvas.drawPath(this.f6659a, this.f6663e);
        canvas.restore();
    }

    /* renamed from: n */
    private void m8835n(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        C0010h.m83m(canvas, this.f6666h, this.f6663e);
        canvas.drawRect(this.f6666h, this.f6661c);
        this.f6663e.setAlpha((int) (((float) aVar2.mo24148h().intValue()) * 2.55f));
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        canvas.drawPath(this.f6659a, this.f6663e);
        canvas.restore();
    }

    /* renamed from: o */
    private void m8836o(Canvas canvas, Matrix matrix) {
        C1461c.m735a("Layer#saveLayer");
        C0010h.m84n(canvas, this.f6666h, this.f6662d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m8840s(canvas);
        }
        C1461c.m736b("Layer#saveLayer");
        for (int i = 0; i < this.f6674p.mo24172b().size(); i++) {
            C2122g gVar = this.f6674p.mo24172b().get(i);
            C2068a aVar = this.f6674p.mo24171a().get(i);
            C2068a aVar2 = this.f6674p.mo24173c().get(i);
            int i2 = C2142b.f6686b[gVar.mo24274a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f6661c.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f6661c.setAlpha(255);
                        canvas.drawRect(this.f6666h, this.f6661c);
                    }
                    if (gVar.mo24277d()) {
                        m8835n(canvas, matrix, gVar, aVar, aVar2);
                    } else {
                        m8837p(canvas, matrix, gVar, aVar, aVar2);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (gVar.mo24277d()) {
                            m8833l(canvas, matrix, gVar, aVar, aVar2);
                        } else {
                            m8831j(canvas, matrix, gVar, aVar, aVar2);
                        }
                    }
                } else if (gVar.mo24277d()) {
                    m8834m(canvas, matrix, gVar, aVar, aVar2);
                } else {
                    m8832k(canvas, matrix, gVar, aVar, aVar2);
                }
            } else if (m8838q()) {
                this.f6661c.setAlpha(255);
                canvas.drawRect(this.f6666h, this.f6661c);
            }
        }
        C1461c.m735a("Layer#restoreLayer");
        canvas.restore();
        C1461c.m736b("Layer#restoreLayer");
    }

    /* renamed from: p */
    private void m8837p(Canvas canvas, Matrix matrix, C2122g gVar, C2068a<C2130l, Path> aVar, C2068a<Integer, Integer> aVar2) {
        this.f6659a.set(aVar.mo24148h());
        this.f6659a.transform(matrix);
        canvas.drawPath(this.f6659a, this.f6663e);
    }

    /* renamed from: q */
    private boolean m8838q() {
        if (this.f6674p.mo24171a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f6674p.mo24172b().size(); i++) {
            if (this.f6674p.mo24172b().get(i).mo24274a() != C2122g.C2123a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private void m8839r() {
        if (this.f6678t == null) {
            if (this.f6677s == null) {
                this.f6678t = Collections.emptyList();
                return;
            }
            this.f6678t = new ArrayList();
            for (C2140a aVar = this.f6677s; aVar != null; aVar = aVar.f6677s) {
                this.f6678t.add(aVar);
            }
        }
    }

    /* renamed from: s */
    private void m8840s(Canvas canvas) {
        C1461c.m735a("Layer#clearLayer");
        RectF rectF = this.f6666h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6665g);
        C1461c.m736b("Layer#clearLayer");
    }

    @Nullable
    /* renamed from: u */
    static C2140a m8841u(C2146d dVar, C1472f fVar, C1463d dVar2) {
        switch (C2142b.f6685a[dVar.mo24355d().ordinal()]) {
            case 1:
                return new C2150f(fVar, dVar);
            case 2:
                return new C2143b(fVar, dVar, dVar2.mo17065n(dVar.mo24362k()), dVar2);
            case 3:
                return new C2151g(fVar, dVar);
            case 4:
                return new C2145c(fVar, dVar);
            case 5:
                return new C2149e(fVar, dVar);
            case 6:
                return new C2152h(fVar, dVar);
            default:
                C0006d.m32c("Unknown layer type " + dVar.mo24355d());
                return null;
        }
    }

    /* renamed from: y */
    private void m8842y(RectF rectF, Matrix matrix) {
        this.f6667i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo24350w()) {
            int size = this.f6674p.mo24172b().size();
            int i = 0;
            while (i < size) {
                C2122g gVar = this.f6674p.mo24172b().get(i);
                this.f6659a.set((Path) this.f6674p.mo24171a().get(i).mo24148h());
                this.f6659a.transform(matrix);
                int i2 = C2142b.f6686b[gVar.mo24274a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !gVar.mo24277d()) {
                        this.f6659a.computeBounds(this.f6669k, false);
                        if (i == 0) {
                            this.f6667i.set(this.f6669k);
                        } else {
                            RectF rectF2 = this.f6667i;
                            rectF2.set(Math.min(rectF2.left, this.f6669k.left), Math.min(this.f6667i.top, this.f6669k.top), Math.max(this.f6667i.right, this.f6669k.right), Math.max(this.f6667i.bottom, this.f6669k.bottom));
                        }
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f6667i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: z */
    private void m8843z(RectF rectF, Matrix matrix) {
        if (mo24351x() && this.f6673o.mo24357f() != C2146d.C2148b.INVERT) {
            this.f6668j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6676r.mo24127e(this.f6668j, matrix, true);
            if (!rectF.intersect(this.f6668j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: C */
    public void mo24341C(C2068a<?, ?> aVar) {
        this.f6679u.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo24342D(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo24343E(@Nullable C2140a aVar) {
        this.f6676r = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo24344F(boolean z) {
        if (z && this.f6683y == null) {
            this.f6683y = new C2044a();
        }
        this.f6682x = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo24345G(@Nullable C2140a aVar) {
        this.f6677s = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo24346H(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f6680v.mo24194j(f);
        if (this.f6674p != null) {
            for (int i = 0; i < this.f6674p.mo24171a().size(); i++) {
                this.f6674p.mo24171a().get(i).mo24153m(f);
            }
        }
        if (this.f6673o.mo24371t() != 0.0f) {
            f /= this.f6673o.mo24371t();
        }
        C2076c cVar = this.f6675q;
        if (cVar != null) {
            cVar.mo24153m(f / this.f6673o.mo24371t());
        }
        C2140a aVar = this.f6676r;
        if (aVar != null) {
            this.f6676r.mo24346H(aVar.f6673o.mo24371t() * f);
        }
        for (int i2 = 0; i2 < this.f6679u.size(); i2++) {
            this.f6679u.get(i2).mo24153m(f);
        }
    }

    /* renamed from: a */
    public void mo24123a() {
        m8825A();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
    }

    @CallSuper
    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        this.f6680v.mo24188c(t, cVar);
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        C2140a aVar = this.f6676r;
        if (aVar != null) {
            C2097e a = eVar2.mo24213a(aVar.getName());
            if (eVar.mo24214c(this.f6676r.getName(), i)) {
                list.add(a.mo24219i(this.f6676r));
            }
            if (eVar.mo24218h(getName(), i)) {
                this.f6676r.mo24342D(eVar, eVar.mo24216e(this.f6676r.getName(), i) + i, list, a);
            }
        }
        if (eVar.mo24217g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo24213a(getName());
                if (eVar.mo24214c(getName(), i)) {
                    list.add(eVar2.mo24219i(this));
                }
            }
            if (eVar.mo24218h(getName(), i)) {
                mo24342D(eVar, i + eVar.mo24216e(getName(), i), list, eVar2);
            }
        }
    }

    @CallSuper
    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        this.f6666h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m8839r();
        this.f6671m.set(matrix);
        if (z) {
            List<C2140a> list = this.f6678t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f6671m.preConcat(this.f6678t.get(size).f6680v.mo24190f());
                }
            } else {
                C2140a aVar = this.f6677s;
                if (aVar != null) {
                    this.f6671m.preConcat(aVar.f6680v.mo24190f());
                }
            }
        }
        this.f6671m.preConcat(this.f6680v.mo24190f());
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        C1461c.m735a(this.f6670l);
        if (!this.f6681w || this.f6673o.mo24374v()) {
            C1461c.m736b(this.f6670l);
            return;
        }
        m8839r();
        C1461c.m735a("Layer#parentMatrix");
        this.f6660b.reset();
        this.f6660b.set(matrix);
        for (int size = this.f6678t.size() - 1; size >= 0; size--) {
            this.f6660b.preConcat(this.f6678t.get(size).f6680v.mo24190f());
        }
        C1461c.m736b("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f6680v.mo24192h() == null ? 100 : this.f6680v.mo24192h().mo24148h().intValue()))) / 100.0f) * 255.0f);
        if (mo24351x() || mo24350w()) {
            C1461c.m735a("Layer#computeBounds");
            mo24127e(this.f6666h, this.f6660b, false);
            m8843z(this.f6666h, matrix);
            this.f6660b.preConcat(this.f6680v.mo24190f());
            m8842y(this.f6666h, this.f6660b);
            if (!this.f6666h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f6666h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C1461c.m736b("Layer#computeBounds");
            if (this.f6666h.width() >= 1.0f && this.f6666h.height() >= 1.0f) {
                C1461c.m735a("Layer#saveLayer");
                this.f6661c.setAlpha(255);
                C0010h.m83m(canvas, this.f6666h, this.f6661c);
                C1461c.m736b("Layer#saveLayer");
                m8840s(canvas);
                C1461c.m735a("Layer#drawLayer");
                mo24348t(canvas, this.f6660b, intValue);
                C1461c.m736b("Layer#drawLayer");
                if (mo24350w()) {
                    m8836o(canvas, this.f6660b);
                }
                if (mo24351x()) {
                    C1461c.m735a("Layer#drawMatte");
                    C1461c.m735a("Layer#saveLayer");
                    C0010h.m84n(canvas, this.f6666h, this.f6664f, 19);
                    C1461c.m736b("Layer#saveLayer");
                    m8840s(canvas);
                    this.f6676r.mo24128g(canvas, matrix, intValue);
                    C1461c.m735a("Layer#restoreLayer");
                    canvas.restore();
                    C1461c.m736b("Layer#restoreLayer");
                    C1461c.m736b("Layer#drawMatte");
                }
                C1461c.m735a("Layer#restoreLayer");
                canvas.restore();
                C1461c.m736b("Layer#restoreLayer");
            }
            if (this.f6682x && (paint = this.f6683y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f6683y.setColor(-251901);
                this.f6683y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f6666h, this.f6683y);
                this.f6683y.setStyle(Paint.Style.FILL);
                this.f6683y.setColor(1357638635);
                canvas.drawRect(this.f6666h, this.f6683y);
            }
            m8826B(C1461c.m736b(this.f6670l));
            return;
        }
        this.f6660b.preConcat(this.f6680v.mo24190f());
        C1461c.m735a("Layer#drawLayer");
        mo24348t(canvas, this.f6660b, intValue);
        C1461c.m736b("Layer#drawLayer");
        m8826B(C1461c.m736b(this.f6670l));
    }

    public String getName() {
        return this.f6673o.mo24358g();
    }

    /* renamed from: i */
    public void mo24347i(@Nullable C2068a<?, ?> aVar) {
        if (aVar != null) {
            this.f6679u.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo24348t(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C2146d mo24349v() {
        return this.f6673o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo24350w() {
        C2080g gVar = this.f6674p;
        return gVar != null && !gVar.mo24171a().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo24351x() {
        return this.f6676r != null;
    }
}
