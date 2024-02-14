package p237d6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d6.a */
/* compiled from: AdapterPath */
public class C11954a {
    @NonNull

    /* renamed from: a */
    private final List<C11955b> f58143a = new ArrayList();

    @NonNull
    /* renamed from: a */
    public C11954a mo67344a(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj) {
        return mo67345b(new C11955b(adapter, obj));
    }

    @NonNull
    /* renamed from: b */
    public C11954a mo67345b(@NonNull C11955b bVar) {
        this.f58143a.add(bVar);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C11954a mo67346c(@NonNull C11960f fVar) {
        return mo67344a(fVar.f58152a, fVar.f58153b);
    }

    @NonNull
    /* renamed from: d */
    public C11954a mo67347d() {
        this.f58143a.clear();
        return this;
    }

    @Nullable
    /* renamed from: e */
    public C11955b mo67348e() {
        if (this.f58143a.isEmpty()) {
            return null;
        }
        List<C11955b> list = this.f58143a;
        return list.get(list.size() - 1);
    }

    @NonNull
    /* renamed from: f */
    public List<C11955b> mo67349f() {
        return this.f58143a;
    }
}
