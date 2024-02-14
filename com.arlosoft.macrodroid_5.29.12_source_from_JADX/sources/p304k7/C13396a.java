package p304k7;

import java.util.ArrayList;

/* renamed from: k7.a */
/* compiled from: Animator */
public abstract class C13396a implements Cloneable {

    /* renamed from: a */
    ArrayList<C13397a> f61430a = null;

    /* renamed from: k7.a$a */
    /* compiled from: Animator */
    public interface C13397a {
        /* renamed from: a */
        void mo70808a(C13396a aVar);

        /* renamed from: b */
        void mo70809b(C13396a aVar);

        /* renamed from: c */
        void mo70810c(C13396a aVar);

        /* renamed from: e */
        void mo70811e(C13396a aVar);
    }

    /* renamed from: a */
    public void mo70804a(C13397a aVar) {
        if (this.f61430a == null) {
            this.f61430a = new ArrayList<>();
        }
        this.f61430a.add(aVar);
    }

    /* renamed from: b */
    public C13396a clone() {
        try {
            C13396a aVar = (C13396a) super.clone();
            ArrayList<C13397a> arrayList = this.f61430a;
            if (arrayList != null) {
                aVar.f61430a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aVar.f61430a.add(arrayList.get(i));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public void cancel() {
    }
}
