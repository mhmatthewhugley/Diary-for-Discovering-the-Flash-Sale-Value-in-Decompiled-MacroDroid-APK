package p237d6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: d6.c */
/* compiled from: BridgeAdapterDataObserver */
public class C11956c extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private final WeakReference<C11957a> f58146a;

    /* renamed from: b */
    private final WeakReference<RecyclerView.Adapter> f58147b;

    /* renamed from: c */
    private final Object f58148c;

    /* renamed from: d6.c$a */
    /* compiled from: BridgeAdapterDataObserver */
    public interface C11957a {
        /* renamed from: A */
        void mo67350A(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2);

        /* renamed from: e */
        void mo67351e(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2, @Nullable Object obj2);

        /* renamed from: g */
        void mo67352g(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj);

        /* renamed from: i */
        void mo67353i(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2, int i3);

        /* renamed from: k */
        void mo67354k(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2);

        /* renamed from: v */
        void mo67355v(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2);
    }

    public C11956c(@NonNull C11957a aVar, @NonNull RecyclerView.Adapter adapter, @Nullable Object obj) {
        this.f58146a = new WeakReference<>(aVar);
        this.f58147b = new WeakReference<>(adapter);
        this.f58148c = obj;
    }

    public void onChanged() {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67352g(adapter, this.f58148c);
        }
    }

    public void onItemRangeChanged(int i, int i2) {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67354k(adapter, this.f58148c, i, i2);
        }
    }

    public void onItemRangeInserted(int i, int i2) {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67355v(adapter, this.f58148c, i, i2);
        }
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67353i(adapter, this.f58148c, i, i2, i3);
        }
    }

    public void onItemRangeRemoved(int i, int i2) {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67350A(adapter, this.f58148c, i, i2);
        }
    }

    public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
        C11957a aVar = (C11957a) this.f58146a.get();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.f58147b.get();
        if (aVar != null && adapter != null) {
            aVar.mo67351e(adapter, this.f58148c, i, i2, obj);
        }
    }
}
