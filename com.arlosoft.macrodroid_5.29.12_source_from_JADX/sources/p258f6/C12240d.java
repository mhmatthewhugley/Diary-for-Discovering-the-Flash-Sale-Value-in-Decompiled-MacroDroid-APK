package p258f6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p237d6.C11954a;
import p237d6.C11955b;
import p237d6.C11960f;
import p237d6.C11962h;

/* renamed from: f6.d */
/* compiled from: WrapperAdapterUtils */
public class C12240d {
    /* renamed from: a */
    public static <T> T m82906a(@Nullable RecyclerView.Adapter adapter, @NonNull Class<T> cls, int i) {
        C11954a aVar = new C11954a();
        if (m82908c(adapter, (RecyclerView.Adapter) null, (Object) null, i, aVar) == -1) {
            return null;
        }
        for (C11955b next : aVar.mo67349f()) {
            if (cls.isInstance(next.f58144a)) {
                return cls.cast(next.f58144a);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static int m82907b(@NonNull RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2, Object obj, int i) {
        return m82908c(adapter, adapter2, obj, i, (C11954a) null);
    }

    /* renamed from: c */
    public static int m82908c(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2, @Nullable Object obj, int i, @Nullable C11954a aVar) {
        C11960f fVar = new C11960f();
        if (aVar != null) {
            aVar.mo67347d();
        }
        if (adapter == null) {
            return -1;
        }
        Object obj2 = null;
        if (aVar != null) {
            aVar.mo67345b(new C11955b(adapter, (Object) null));
        }
        while (true) {
            if (i != -1 && adapter != adapter2) {
                if (adapter instanceof C11962h) {
                    fVar.mo67370a();
                    ((C11962h) adapter).mo67366n(fVar, i);
                    i = fVar.f58154c;
                    obj2 = fVar.f58153b;
                    if (fVar.mo67371b() && aVar != null) {
                        aVar.mo67346c(fVar);
                    }
                    adapter = fVar.f58152a;
                    if (adapter == null) {
                        break;
                    }
                } else if (adapter2 != null) {
                    i = -1;
                }
            } else {
                break;
            }
        }
        if (!(adapter2 == null || adapter == adapter2)) {
            i = -1;
        }
        if (!(obj == null || obj2 == obj)) {
            i = -1;
        }
        if (i == -1 && aVar != null) {
            aVar.mo67347d();
        }
        return i;
    }

    /* renamed from: d */
    public static int m82909d(@NonNull C11954a aVar, int i, int i2, int i3) {
        List<C11955b> f = aVar.mo67349f();
        while (i > i2) {
            i3 = ((C11962h) f.get(i - 1).f58144a).mo67367r(f.get(i), i3);
            if (i3 == -1) {
                break;
            }
            i--;
        }
        return i3;
    }

    /* renamed from: e */
    public static int m82910e(@NonNull C11954a aVar, @Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2, int i) {
        List<C11955b> f = aVar.mo67349f();
        int size = f.size();
        int i2 = adapter == null ? size - 1 : -1;
        int i3 = adapter2 == null ? 0 : -1;
        if (!(adapter == null && adapter2 == null)) {
            for (int i4 = 0; i4 < size; i4++) {
                C11955b bVar = f.get(i4);
                if (adapter != null && bVar.f58144a == adapter) {
                    i2 = i4;
                }
                if (adapter2 != null && bVar.f58144a == adapter2) {
                    i3 = i4;
                }
            }
        }
        if (i2 == -1 || i3 == -1 || i3 > i2) {
            return -1;
        }
        return m82909d(aVar, i2, i3, i);
    }
}
