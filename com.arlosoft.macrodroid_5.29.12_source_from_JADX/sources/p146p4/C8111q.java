package p146p4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p083e4.C7275g;
import p090f5.C7315j;
import p102h4.C7376a;
import p102h4.C7380e;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.q */
/* compiled from: MultiModelLoader */
class C8111q<Model, Data> implements C8105n<Model, Data> {

    /* renamed from: a */
    private final List<C8105n<Model, Data>> f19714a;

    /* renamed from: b */
    private final Pools.Pool<List<Throwable>> f19715b;

    /* renamed from: p4.q$a */
    /* compiled from: MultiModelLoader */
    static class C8112a<Data> implements C7401d<Data>, C7401d.C7402a<Data> {

        /* renamed from: a */
        private final List<C7401d<Data>> f19716a;

        /* renamed from: c */
        private final Pools.Pool<List<Throwable>> f19717c;

        /* renamed from: d */
        private int f19718d = 0;

        /* renamed from: f */
        private C7275g f19719f;

        /* renamed from: g */
        private C7401d.C7402a<? super Data> f19720g;
        @Nullable

        /* renamed from: o */
        private List<Throwable> f19721o;

        /* renamed from: p */
        private boolean f19722p;

        C8112a(@NonNull List<C7401d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f19717c = pool;
            C7315j.m30203c(list);
            this.f19716a = list;
        }

        /* renamed from: g */
        private void m33733g() {
            if (!this.f19722p) {
                if (this.f19718d < this.f19716a.size() - 1) {
                    this.f19718d++;
                    mo37440f(this.f19719f, this.f19720g);
                    return;
                }
                C7315j.m30204d(this.f19721o);
                this.f19720g.mo33006c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f19721o)));
            }
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo37430a() {
            return this.f19716a.get(0).mo37430a();
        }

        /* renamed from: b */
        public void mo37435b() {
            List<Throwable> list = this.f19721o;
            if (list != null) {
                this.f19717c.release(list);
            }
            this.f19721o = null;
            for (C7401d<Data> b : this.f19716a) {
                b.mo37435b();
            }
        }

        /* renamed from: c */
        public void mo33006c(@NonNull Exception exc) {
            ((List) C7315j.m30204d(this.f19721o)).add(exc);
            m33733g();
        }

        public void cancel() {
            this.f19722p = true;
            for (C7401d<Data> cancel : this.f19716a) {
                cancel.cancel();
            }
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return this.f19716a.get(0).mo37438d();
        }

        /* renamed from: e */
        public void mo33008e(@Nullable Data data) {
            if (data != null) {
                this.f19720g.mo33008e(data);
            } else {
                m33733g();
            }
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super Data> aVar) {
            this.f19719f = gVar;
            this.f19720g = aVar;
            this.f19721o = this.f19717c.acquire();
            this.f19716a.get(this.f19718d).mo37440f(gVar, this);
            if (this.f19722p) {
                cancel();
            }
        }
    }

    C8111q(@NonNull List<C8105n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f19714a = list;
        this.f19715b = pool;
    }

    /* renamed from: a */
    public boolean mo38073a(@NonNull Model model) {
        for (C8105n<Model, Data> a : this.f19714a) {
            if (a.mo38073a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C8105n.C8106a<Data> mo38074b(@NonNull Model model, int i, int i2, @NonNull C7384g gVar) {
        C8105n.C8106a b;
        int size = this.f19714a.size();
        ArrayList arrayList = new ArrayList(size);
        C7380e eVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C8105n nVar = this.f19714a.get(i3);
            if (nVar.mo38073a(model) && (b = nVar.mo38074b(model, i, i2, gVar)) != null) {
                eVar = b.f19707a;
                arrayList.add(b.f19709c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new C8105n.C8106a<>(eVar, new C8112a(arrayList, this.f19715b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f19714a.toArray()) + '}';
    }
}
