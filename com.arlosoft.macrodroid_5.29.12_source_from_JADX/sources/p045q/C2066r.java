package p045q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import p012b0.C1399c;
import p046r.C2068a;
import p046r.C2075b;
import p046r.C2089p;
import p050v.C2134p;
import p051w.C2140a;

/* renamed from: q.r */
/* compiled from: StrokeContent */
public class C2066r extends C2045a {

    /* renamed from: o */
    private final C2140a f6412o;

    /* renamed from: p */
    private final String f6413p;

    /* renamed from: q */
    private final boolean f6414q;

    /* renamed from: r */
    private final C2068a<Integer, Integer> f6415r;
    @Nullable

    /* renamed from: s */
    private C2068a<ColorFilter, ColorFilter> f6416s;

    public C2066r(C1472f fVar, C2140a aVar, C2134p pVar) {
        super(fVar, aVar, pVar.mo24322b().mo24332b(), pVar.mo24325e().mo24333b(), pVar.mo24327g(), pVar.mo24329i(), pVar.mo24330j(), pVar.mo24326f(), pVar.mo24324d());
        this.f6412o = aVar;
        this.f6413p = pVar.mo24328h();
        this.f6414q = pVar.mo24331k();
        C2068a<Integer, Integer> a = pVar.mo24323c().mo24228a();
        this.f6415r = a;
        a.mo24142a(this);
        aVar.mo24347i(a);
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t == C1492k.f987b) {
            this.f6415r.mo24154n(cVar);
        } else if (t == C1492k.f984E) {
            C2068a<ColorFilter, ColorFilter> aVar = this.f6416s;
            if (aVar != null) {
                this.f6412o.mo24341C(aVar);
            }
            if (cVar == null) {
                this.f6416s = null;
                return;
            }
            C2089p pVar = new C2089p(cVar);
            this.f6416s = pVar;
            pVar.mo24142a(this);
            this.f6412o.mo24347i(this.f6415r);
        }
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f6414q) {
            this.f6296i.setColor(((C2075b) this.f6415r).mo24161p());
            C2068a<ColorFilter, ColorFilter> aVar = this.f6416s;
            if (aVar != null) {
                this.f6296i.setColorFilter(aVar.mo24148h());
            }
            super.mo24128g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f6413p;
    }
}
