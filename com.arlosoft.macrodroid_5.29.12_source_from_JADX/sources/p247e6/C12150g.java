package p247e6;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import p237d6.C11959e;
import p258f6.C12238b;
import p258f6.C12240d;

/* renamed from: e6.g */
/* compiled from: DraggableItemWrapperAdapter */
class C12150g<VH extends RecyclerView.ViewHolder> extends C11959e<VH> {

    /* renamed from: A */
    private int f58451A = -1;

    /* renamed from: B */
    private int f58452B;

    /* renamed from: C */
    private boolean f58453C;

    /* renamed from: f */
    private C12156m f58454f;

    /* renamed from: g */
    private C12147d f58455g;

    /* renamed from: o */
    private RecyclerView.ViewHolder f58456o;

    /* renamed from: p */
    private C12153j f58457p;

    /* renamed from: s */
    private C12154k f58458s;

    /* renamed from: z */
    private int f58459z = -1;

    public C12150g(C12156m mVar, RecyclerView.Adapter<VH> adapter) {
        super(adapter);
        if (mVar != null) {
            this.f58454f = mVar;
            return;
        }
        throw new IllegalArgumentException("manager cannot be null");
    }

    /* renamed from: L */
    private void m82662L() {
        C12156m mVar = this.f58454f;
        if (mVar != null) {
            mVar.mo68416c();
        }
    }

    /* renamed from: M */
    protected static int m82663M(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i3 < 0) {
            return i;
        }
        if (i4 == 0) {
            return i2 != i3 ? (i >= i2 || i >= i3) ? (i <= i2 || i <= i3) ? i3 < i2 ? i == i3 ? i2 : i - 1 : i == i3 ? i2 : i + 1 : i : i : i;
        }
        if (i4 == 1) {
            return i == i3 ? i2 : i == i2 ? i3 : i;
        }
        throw new IllegalStateException("unexpected state");
    }

    /* renamed from: U */
    private static void m82664U(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C12149f) {
            C12149f fVar = (C12149f) viewHolder;
            int q = fVar.mo68361q();
            if (q == -1 || ((q ^ i) & Integer.MAX_VALUE) != 0) {
                i |= Integer.MIN_VALUE;
            }
            fVar.mo68362r(i);
        }
    }

    /* renamed from: V */
    private boolean m82665V() {
        return mo68368Q() && !this.f58453C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo67358D() {
        if (m82665V()) {
            m82662L();
        } else {
            super.mo67358D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo67359E(int i, int i2) {
        if (m82665V()) {
            m82662L();
        } else {
            super.mo67359E(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo67361G(int i, int i2) {
        if (m82665V()) {
            m82662L();
        } else {
            super.mo67361G(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo67362H(int i, int i2) {
        if (m82665V()) {
            m82662L();
        } else {
            super.mo67362H(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo67363I(int i, int i2, int i3) {
        if (m82665V()) {
            m82662L();
        } else {
            super.mo67363I(i, i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo68363J(int i, int i2) {
        return this.f58455g.mo29072q(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo68364K(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        C12147d dVar = (C12147d) C12240d.m82906a(this, C12147d.class, i);
        if (dVar == null) {
            return false;
        }
        return dVar.mo29074x(viewHolder, i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public int mo68365N() {
        return this.f58451A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public int mo68366O() {
        return this.f58459z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public C12154k mo68367P(RecyclerView.ViewHolder viewHolder, int i) {
        C12147d dVar = (C12147d) C12240d.m82906a(this, C12147d.class, i);
        if (dVar == null) {
            return null;
        }
        return dVar.mo29073s(viewHolder, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public boolean mo68368Q() {
        return this.f58457p != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo68369R(int i, int i2, int i3) {
        int M = m82663M(i, this.f58459z, this.f58451A, this.f58452B);
        if (M == this.f58459z) {
            this.f58451A = i2;
            if (this.f58452B != 0 || !C12238b.m82901u(i3)) {
                notifyDataSetChanged();
            } else {
                notifyItemMoved(i, i2);
            }
        } else {
            throw new IllegalStateException("onMoveItem() - may be a bug or has duplicate IDs  --- mDraggingItemInitialPosition = " + this.f58459z + ", mDraggingItemCurrentPosition = " + this.f58451A + ", origFromPosition = " + M + ", fromPosition = " + i + ", toPosition = " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo68370S(int i, int i2, boolean z) {
        C12147d dVar = this.f58455g;
        this.f58459z = -1;
        this.f58451A = -1;
        this.f58458s = null;
        this.f58457p = null;
        this.f58456o = null;
        this.f58455g = null;
        if (z && i2 != i) {
            dVar.mo29071h(i, i2);
        }
        dVar.mo29070c(i, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo68371T() {
        this.f58453C = true;
        this.f58455g.mo29069b(mo68366O());
        this.f58453C = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo68372W(C12153j jVar, RecyclerView.ViewHolder viewHolder, C12154k kVar, int i, int i2) {
        if (viewHolder.getItemId() != -1) {
            C12147d dVar = (C12147d) C12240d.m82906a(this, C12147d.class, i);
            this.f58455g = dVar;
            if (dVar != null) {
                this.f58451A = i;
                this.f58459z = i;
                this.f58457p = jVar;
                this.f58456o = viewHolder;
                this.f58458s = kVar;
                this.f58452B = i2;
                return;
            }
            throw new IllegalStateException("DraggableItemAdapter not found!");
        }
        throw new IllegalStateException("dragging target must provides valid ID");
    }

    public long getItemId(int i) {
        if (mo68368Q()) {
            return super.getItemId(m82663M(i, this.f58459z, this.f58451A, this.f58452B));
        }
        return super.getItemId(i);
    }

    public int getItemViewType(int i) {
        if (mo68368Q()) {
            return super.getItemViewType(m82663M(i, this.f58459z, this.f58451A, this.f58452B));
        }
        return super.getItemViewType(i);
    }

    /* renamed from: j */
    public void mo67364j(@NonNull VH vh, int i) {
        if (mo68368Q()) {
            this.f58454f.mo68406M(vh);
            this.f58456o = this.f58454f.mo68423r();
        }
        super.mo67364j(vh, i);
    }

    public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
        if (mo68368Q()) {
            long j = this.f58457p.f58501c;
            long itemId = vh.getItemId();
            int M = m82663M(i, this.f58459z, this.f58451A, this.f58452B);
            int i2 = (itemId > j ? 1 : (itemId == j ? 0 : -1));
            if (i2 == 0 && vh != this.f58456o) {
                Log.i("ARVDraggableWrapper", "a new view holder object for the currently dragging item is assigned");
                this.f58456o = vh;
                this.f58454f.mo68407N(vh);
            }
            int i3 = 1;
            if (i2 == 0) {
                i3 = 3;
            }
            if (this.f58458s.mo68395a(i)) {
                i3 |= 4;
            }
            m82664U(vh, i3);
            super.onBindViewHolder(vh, M, list);
            return;
        }
        m82664U(vh, 0);
        super.onBindViewHolder(vh, i, list);
    }

    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        VH onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        if (onCreateViewHolder instanceof C12149f) {
            ((C12149f) onCreateViewHolder).mo68362r(-1);
        }
        return onCreateViewHolder;
    }
}
