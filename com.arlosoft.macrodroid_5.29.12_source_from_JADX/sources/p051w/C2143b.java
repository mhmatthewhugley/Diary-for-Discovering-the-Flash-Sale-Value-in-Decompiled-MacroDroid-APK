package p051w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1463d;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0010h;
import p012b0.C1399c;
import p046r.C2068a;
import p046r.C2089p;
import p048t.C2097e;
import p049u.C2103b;

/* renamed from: w.b */
/* compiled from: CompositionLayer */
public class C2143b extends C2140a {

    /* renamed from: A */
    private final List<C2140a> f6687A = new ArrayList();

    /* renamed from: B */
    private final RectF f6688B = new RectF();

    /* renamed from: C */
    private final RectF f6689C = new RectF();

    /* renamed from: D */
    private Paint f6690D = new Paint();
    @Nullable

    /* renamed from: z */
    private C2068a<Float, Float> f6691z;

    /* renamed from: w.b$a */
    /* compiled from: CompositionLayer */
    static /* synthetic */ class C2144a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6692a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                w.d$b[] r0 = p051w.C2146d.C2148b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6692a = r0
                w.d$b r1 = p051w.C2146d.C2148b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6692a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.d$b r1 = p051w.C2146d.C2148b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051w.C2143b.C2144a.<clinit>():void");
        }
    }

    public C2143b(C1472f fVar, C2146d dVar, List<C2146d> list, C1463d dVar2) {
        super(fVar, dVar);
        int i;
        C2140a aVar;
        C2103b s = dVar.mo24370s();
        if (s != null) {
            C2068a<Float, Float> a = s.mo24228a();
            this.f6691z = a;
            mo24347i(a);
            this.f6691z.mo24142a(this);
        } else {
            this.f6691z = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(dVar2.mo17061j().size());
        int size = list.size() - 1;
        C2140a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C2146d dVar3 = list.get(size);
            C2140a u = C2140a.m8841u(dVar3, fVar, dVar2);
            if (u != null) {
                longSparseArray.put(u.mo24349v().mo24353b(), u);
                if (aVar2 != null) {
                    aVar2.mo24343E(u);
                    aVar2 = null;
                } else {
                    this.f6687A.add(0, u);
                    int i2 = C2144a.f6692a[dVar3.mo24357f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = u;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            C2140a aVar3 = (C2140a) longSparseArray.get(longSparseArray.keyAt(i));
            if (!(aVar3 == null || (aVar = (C2140a) longSparseArray.get(aVar3.mo24349v().mo24359h())) == null)) {
                aVar3.mo24345G(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo24342D(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        for (int i2 = 0; i2 < this.f6687A.size(); i2++) {
            this.f6687A.get(i2).mo24126d(eVar, i, list, eVar2);
        }
    }

    /* renamed from: F */
    public void mo24344F(boolean z) {
        super.mo24344F(z);
        for (C2140a F : this.f6687A) {
            F.mo24344F(z);
        }
    }

    /* renamed from: H */
    public void mo24346H(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        super.mo24346H(f);
        if (this.f6691z != null) {
            f = ((this.f6691z.mo24148h().floatValue() * this.f6673o.mo24352a().mo17059h()) - this.f6673o.mo24352a().mo17066o()) / (this.f6672n.mo17139p().mo17056e() + 0.01f);
        }
        if (this.f6691z == null) {
            f -= this.f6673o.mo24367p();
        }
        if (this.f6673o.mo24371t() != 0.0f) {
            f /= this.f6673o.mo24371t();
        }
        for (int size = this.f6687A.size() - 1; size >= 0; size--) {
            this.f6687A.get(size).mo24346H(f);
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t != C1492k.f982C) {
            return;
        }
        if (cVar == null) {
            C2068a<Float, Float> aVar = this.f6691z;
            if (aVar != null) {
                aVar.mo24154n((C1399c<Float>) null);
                return;
            }
            return;
        }
        C2089p pVar = new C2089p(cVar);
        this.f6691z = pVar;
        pVar.mo24142a(this);
        mo24347i(this.f6691z);
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        super.mo24127e(rectF, matrix, z);
        for (int size = this.f6687A.size() - 1; size >= 0; size--) {
            this.f6688B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6687A.get(size).mo24127e(this.f6688B, this.f6671m, true);
            rectF.union(this.f6688B);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24348t(Canvas canvas, Matrix matrix, int i) {
        C1461c.m735a("CompositionLayer#draw");
        this.f6689C.set(0.0f, 0.0f, (float) this.f6673o.mo24361j(), (float) this.f6673o.mo24360i());
        matrix.mapRect(this.f6689C);
        boolean z = this.f6672n.mo17094I() && this.f6687A.size() > 1 && i != 255;
        if (z) {
            this.f6690D.setAlpha(i);
            C0010h.m83m(canvas, this.f6689C, this.f6690D);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f6687A.size() - 1; size >= 0; size--) {
            if (!this.f6689C.isEmpty() ? canvas.clipRect(this.f6689C) : true) {
                this.f6687A.get(size).mo24128g(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1461c.m736b("CompositionLayer#draw");
    }
}
