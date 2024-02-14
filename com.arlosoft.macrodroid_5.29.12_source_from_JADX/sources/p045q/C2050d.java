package p045q;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1472f;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0010h;
import p012b0.C1399c;
import p043p.C2044a;
import p046r.C2068a;
import p046r.C2088o;
import p048t.C2097e;
import p048t.C2098f;
import p049u.C2113l;
import p050v.C2117b;
import p050v.C2132n;
import p051w.C2140a;

/* renamed from: q.d */
/* compiled from: ContentGroup */
public class C2050d implements C2051e, C2060m, C2068a.C2070b, C2098f {

    /* renamed from: a */
    private Paint f6305a;

    /* renamed from: b */
    private RectF f6306b;

    /* renamed from: c */
    private final Matrix f6307c;

    /* renamed from: d */
    private final Path f6308d;

    /* renamed from: e */
    private final RectF f6309e;

    /* renamed from: f */
    private final String f6310f;

    /* renamed from: g */
    private final boolean f6311g;

    /* renamed from: h */
    private final List<C2049c> f6312h;

    /* renamed from: i */
    private final C1472f f6313i;
    @Nullable

    /* renamed from: j */
    private List<C2060m> f6314j;
    @Nullable

    /* renamed from: k */
    private C2088o f6315k;

    public C2050d(C1472f fVar, C2140a aVar, C2132n nVar) {
        this(fVar, aVar, nVar.mo24315c(), nVar.mo24316d(), m8467f(fVar, aVar, nVar.mo24314b()), m8468h(nVar.mo24314b()));
    }

    /* renamed from: f */
    private static List<C2049c> m8467f(C1472f fVar, C2140a aVar, List<C2117b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C2049c a = list.get(i).mo24233a(fVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: h */
    static C2113l m8468h(List<C2117b> list) {
        for (int i = 0; i < list.size(); i++) {
            C2117b bVar = list.get(i);
            if (bVar instanceof C2113l) {
                return (C2113l) bVar;
            }
        }
        return null;
    }

    /* renamed from: k */
    private boolean m8469k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f6312h.size(); i2++) {
            if ((this.f6312h.get(i2) instanceof C2051e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24123a() {
        this.f6313i.invalidateSelf();
    }

    /* renamed from: b */
    public void mo24124b(List<C2049c> list, List<C2049c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f6312h.size());
        arrayList.addAll(list);
        for (int size = this.f6312h.size() - 1; size >= 0; size--) {
            C2049c cVar = this.f6312h.get(size);
            cVar.mo24124b(arrayList, this.f6312h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        C2088o oVar = this.f6315k;
        if (oVar != null) {
            oVar.mo24188c(t, cVar);
        }
    }

    /* renamed from: d */
    public void mo24126d(C2097e eVar, int i, List<C2097e> list, C2097e eVar2) {
        if (eVar.mo24217g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo24213a(getName());
                if (eVar.mo24214c(getName(), i)) {
                    list.add(eVar2.mo24219i(this));
                }
            }
            if (eVar.mo24218h(getName(), i)) {
                int e = i + eVar.mo24216e(getName(), i);
                for (int i2 = 0; i2 < this.f6312h.size(); i2++) {
                    C2049c cVar = this.f6312h.get(i2);
                    if (cVar instanceof C2098f) {
                        ((C2098f) cVar).mo24126d(eVar, e, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        this.f6307c.set(matrix);
        C2088o oVar = this.f6315k;
        if (oVar != null) {
            this.f6307c.preConcat(oVar.mo24190f());
        }
        this.f6309e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f6312h.size() - 1; size >= 0; size--) {
            C2049c cVar = this.f6312h.get(size);
            if (cVar instanceof C2051e) {
                ((C2051e) cVar).mo24127e(this.f6309e, this.f6307c, z);
                rectF.union(this.f6309e);
            }
        }
    }

    /* renamed from: g */
    public void mo24128g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f6311g) {
            this.f6307c.set(matrix);
            C2088o oVar = this.f6315k;
            if (oVar != null) {
                this.f6307c.preConcat(oVar.mo24190f());
                i = (int) ((((((float) (this.f6315k.mo24192h() == null ? 100 : this.f6315k.mo24192h().mo24148h().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.f6313i.mo17094I() && m8469k() && i != 255;
            if (z) {
                this.f6306b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo24127e(this.f6306b, this.f6307c, true);
                this.f6305a.setAlpha(i);
                C0010h.m83m(canvas, this.f6306b, this.f6305a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f6312h.size() - 1; size >= 0; size--) {
                C2049c cVar = this.f6312h.get(size);
                if (cVar instanceof C2051e) {
                    ((C2051e) cVar).mo24128g(canvas, this.f6307c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public String getName() {
        return this.f6310f;
    }

    public Path getPath() {
        this.f6307c.reset();
        C2088o oVar = this.f6315k;
        if (oVar != null) {
            this.f6307c.set(oVar.mo24190f());
        }
        this.f6308d.reset();
        if (this.f6311g) {
            return this.f6308d;
        }
        for (int size = this.f6312h.size() - 1; size >= 0; size--) {
            C2049c cVar = this.f6312h.get(size);
            if (cVar instanceof C2060m) {
                this.f6308d.addPath(((C2060m) cVar).getPath(), this.f6307c);
            }
        }
        return this.f6308d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List<C2060m> mo24133i() {
        if (this.f6314j == null) {
            this.f6314j = new ArrayList();
            for (int i = 0; i < this.f6312h.size(); i++) {
                C2049c cVar = this.f6312h.get(i);
                if (cVar instanceof C2060m) {
                    this.f6314j.add((C2060m) cVar);
                }
            }
        }
        return this.f6314j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Matrix mo24134j() {
        C2088o oVar = this.f6315k;
        if (oVar != null) {
            return oVar.mo24190f();
        }
        this.f6307c.reset();
        return this.f6307c;
    }

    C2050d(C1472f fVar, C2140a aVar, String str, boolean z, List<C2049c> list, @Nullable C2113l lVar) {
        this.f6305a = new C2044a();
        this.f6306b = new RectF();
        this.f6307c = new Matrix();
        this.f6308d = new Path();
        this.f6309e = new RectF();
        this.f6310f = str;
        this.f6313i = fVar;
        this.f6311g = z;
        this.f6312h = list;
        if (lVar != null) {
            C2088o b = lVar.mo24234b();
            this.f6315k = b;
            b.mo24186a(aVar);
            this.f6315k.mo24187b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C2049c cVar = list.get(size);
            if (cVar instanceof C2056j) {
                arrayList.add((C2056j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C2056j) arrayList.get(size2)).mo24135f(list.listIterator(list.size()));
        }
    }
}
