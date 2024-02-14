package p146p4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p090f5.C7315j;
import p102h4.C7380e;
import p102h4.C7384g;
import p108i4.C7401d;

/* renamed from: p4.n */
/* compiled from: ModelLoader */
public interface C8105n<Model, Data> {

    /* renamed from: p4.n$a */
    /* compiled from: ModelLoader */
    public static class C8106a<Data> {

        /* renamed from: a */
        public final C7380e f19707a;

        /* renamed from: b */
        public final List<C7380e> f19708b;

        /* renamed from: c */
        public final C7401d<Data> f19709c;

        public C8106a(@NonNull C7380e eVar, @NonNull C7401d<Data> dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public C8106a(@NonNull C7380e eVar, @NonNull List<C7380e> list, @NonNull C7401d<Data> dVar) {
            this.f19707a = (C7380e) C7315j.m30204d(eVar);
            this.f19708b = (List) C7315j.m30204d(list);
            this.f19709c = (C7401d) C7315j.m30204d(dVar);
        }
    }

    /* renamed from: a */
    boolean mo38073a(@NonNull Model model);

    @Nullable
    /* renamed from: b */
    C8106a<Data> mo38074b(@NonNull Model model, int i, int i2, @NonNull C7384g gVar);
}
