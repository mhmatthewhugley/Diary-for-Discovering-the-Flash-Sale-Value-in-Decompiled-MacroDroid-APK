package p237d6;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Collections;
import java.util.List;
import p237d6.C11956c;
import p258f6.C12239c;

/* renamed from: d6.e */
/* compiled from: SimpleWrapperAdapter */
public class C11959e<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements C11962h<VH>, C11956c.C11957a {

    /* renamed from: d */
    protected static final List<Object> f58149d = Collections.emptyList();

    /* renamed from: a */
    private RecyclerView.Adapter<VH> f58150a;

    /* renamed from: c */
    private C11956c f58151c;

    public C11959e(@NonNull RecyclerView.Adapter<VH> adapter) {
        this.f58150a = adapter;
        C11956c cVar = new C11956c(this, adapter, (Object) null);
        this.f58151c = cVar;
        this.f58150a.registerAdapterDataObserver(cVar);
        super.setHasStableIds(this.f58150a.hasStableIds());
    }

    /* renamed from: A */
    public final void mo67350A(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2) {
        mo67362H(i, i2);
    }

    @Nullable
    /* renamed from: B */
    public RecyclerView.Adapter<VH> mo67356B() {
        return this.f58150a;
    }

    /* renamed from: C */
    public boolean mo67357C() {
        return this.f58150a != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo67358D() {
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo67359E(int i, int i2) {
        notifyItemRangeChanged(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo67360F(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo67361G(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo67362H(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo67363I(int i, int i2, int i3) {
        if (i3 == 1) {
            notifyItemMoved(i, i2);
            return;
        }
        throw new IllegalStateException("itemCount should be always 1  (actual: " + i3 + ")");
    }

    /* renamed from: e */
    public final void mo67351e(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2, Object obj2) {
        mo67360F(i, i2, obj2);
    }

    /* renamed from: g */
    public final void mo67352g(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj) {
        mo67358D();
    }

    public int getItemCount() {
        if (mo67357C()) {
            return this.f58150a.getItemCount();
        }
        return 0;
    }

    public long getItemId(int i) {
        return this.f58150a.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f58150a.getItemViewType(i);
    }

    /* renamed from: i */
    public final void mo67353i(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2, int i3) {
        mo67363I(i, i2, i3);
    }

    /* renamed from: j */
    public void mo67364j(@NonNull VH vh, int i) {
        if (mo67357C()) {
            C12239c.m82905d(this.f58150a, vh, i);
        }
    }

    /* renamed from: k */
    public final void mo67354k(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2) {
        mo67359E(i, i2);
    }

    /* renamed from: m */
    public boolean mo67365m(@NonNull VH vh, int i) {
        if (mo67357C() ? C12239c.m82902a(this.f58150a, vh, i) : false) {
            return true;
        }
        return super.onFailedToRecycleView(vh);
    }

    /* renamed from: n */
    public void mo67366n(@NonNull C11960f fVar, int i) {
        fVar.f58152a = mo67356B();
        fVar.f58154c = i;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (mo67357C()) {
            this.f58150a.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void onBindViewHolder(@NonNull VH vh, int i) {
        onBindViewHolder(vh, i, f58149d);
    }

    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return this.f58150a.onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (mo67357C()) {
            this.f58150a.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean onFailedToRecycleView(@NonNull VH vh) {
        return mo67365m(vh, vh.getItemViewType());
    }

    public void onViewAttachedToWindow(@NonNull VH vh) {
        mo67369y(vh, vh.getItemViewType());
    }

    public void onViewDetachedFromWindow(@NonNull VH vh) {
        mo67368t(vh, vh.getItemViewType());
    }

    public void onViewRecycled(@NonNull VH vh) {
        mo67364j(vh, vh.getItemViewType());
    }

    /* renamed from: r */
    public int mo67367r(@NonNull C11955b bVar, int i) {
        if (bVar.f58144a == mo67356B()) {
            return i;
        }
        return -1;
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        if (mo67357C()) {
            this.f58150a.setHasStableIds(z);
        }
    }

    /* renamed from: t */
    public void mo67368t(@NonNull VH vh, int i) {
        if (mo67357C()) {
            C12239c.m82904c(this.f58150a, vh, i);
        }
    }

    /* renamed from: v */
    public final void mo67355v(@NonNull RecyclerView.Adapter adapter, @Nullable Object obj, int i, int i2) {
        mo67361G(i, i2);
    }

    /* renamed from: y */
    public void mo67369y(@NonNull VH vh, int i) {
        if (mo67357C()) {
            C12239c.m82903b(this.f58150a, vh, i);
        }
    }

    public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
        if (mo67357C()) {
            this.f58150a.onBindViewHolder(vh, i, list);
        }
    }
}
