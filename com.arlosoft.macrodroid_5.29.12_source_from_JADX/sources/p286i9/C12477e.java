package p286i9;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import p256eu.davidea.fastscroller.FastScroller;
import p296j9.C13311b;
import p296j9.C13312c;
import p325m9.C15705a;
import p325m9.C15706b;
import p325m9.C15707c;
import p334n9.C15763c;

/* renamed from: i9.e */
/* compiled from: SelectableAdapter */
public abstract class C12477e extends RecyclerView.Adapter implements FastScroller.C12192d, FastScroller.C12194f {

    /* renamed from: A */
    protected boolean f59369A = false;

    /* renamed from: a */
    C15707c f59370a;

    /* renamed from: c */
    private final Set<Integer> f59371c;

    /* renamed from: d */
    private final Set<C15763c> f59372d;

    /* renamed from: f */
    private int f59373f;

    /* renamed from: g */
    private C13312c f59374g;

    /* renamed from: o */
    protected RecyclerView f59375o;

    /* renamed from: p */
    protected FastScroller.C12193e f59376p;

    /* renamed from: s */
    protected boolean f59377s = false;

    /* renamed from: z */
    protected boolean f59378z = false;

    public C12477e() {
        if (C15706b.f65013d == null) {
            C15706b.m94981i("FlexibleAdapter");
        }
        C15707c cVar = new C15707c(C15706b.f65013d);
        this.f59370a = cVar;
        cVar.mo75142c("Running version %s", "5.1.0");
        this.f59371c = Collections.synchronizedSet(new TreeSet());
        this.f59372d = new HashSet();
        this.f59373f = 0;
        this.f59376p = new FastScroller.C12193e();
    }

    /* renamed from: N */
    private void m83545N(int i, int i2) {
        if (i2 > 0) {
            for (C15763c z : this.f59372d) {
                z.mo75414z();
            }
            if (this.f59372d.isEmpty()) {
                notifyItemRangeChanged(i, i2, C12476d.SELECTION);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo68937B(int i) {
        return this.f59371c.add(Integer.valueOf(i));
    }

    /* renamed from: C */
    public final boolean mo68938C(int i) {
        return mo68859L(i) && this.f59371c.add(Integer.valueOf(i));
    }

    /* renamed from: D */
    public void mo68849D() {
        synchronized (this.f59371c) {
            int i = 0;
            this.f59370a.mo75140a("clearSelection %s", this.f59371c);
            Iterator<Integer> it = this.f59371c.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                it.remove();
                if (i + i2 == intValue) {
                    i2++;
                } else {
                    m83545N(i, i2);
                    i = intValue;
                    i2 = 1;
                }
            }
            m83545N(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo68939E() {
        this.f59372d.clear();
    }

    /* renamed from: F */
    public Set<C15763c> mo68940F() {
        return Collections.unmodifiableSet(this.f59372d);
    }

    /* renamed from: G */
    public C13312c mo68941G() {
        if (this.f59374g == null) {
            RecyclerView.LayoutManager layoutManager = this.f59375o.getLayoutManager();
            if (layoutManager instanceof C13312c) {
                this.f59374g = (C13312c) layoutManager;
            } else if (layoutManager != null) {
                this.f59374g = new C13311b(this.f59375o);
            }
        }
        return this.f59374g;
    }

    /* renamed from: H */
    public int mo68942H() {
        return this.f59373f;
    }

    /* renamed from: I */
    public RecyclerView mo68943I() {
        return this.f59375o;
    }

    /* renamed from: J */
    public int mo68944J() {
        return this.f59371c.size();
    }

    /* renamed from: K */
    public List<Integer> mo68945K() {
        return new ArrayList(this.f59371c);
    }

    /* renamed from: L */
    public abstract boolean mo68859L(int i);

    /* renamed from: M */
    public boolean mo68946M(int i) {
        return this.f59371c.contains(Integer.valueOf(i));
    }

    /* renamed from: O */
    public final boolean mo68947O(int i) {
        return this.f59371c.remove(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo68948P(int i, int i2) {
        if (mo68946M(i) && !mo68946M(i2)) {
            mo68947O(i);
            mo68938C(i2);
        } else if (!mo68946M(i) && mo68946M(i2)) {
            mo68947O(i2);
            mo68938C(i);
        }
    }

    /* renamed from: Q */
    public void mo68863Q(int i) {
        if (i >= 0) {
            if (this.f59373f == 1) {
                mo68849D();
            }
            boolean contains = this.f59371c.contains(Integer.valueOf(i));
            if (contains) {
                mo68947O(i);
            } else {
                mo68938C(i);
            }
            C15707c cVar = this.f59370a;
            Object[] objArr = new Object[3];
            objArr[0] = contains ? "removed" : "added";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = this.f59371c;
            cVar.mo75143d("toggleSelection %s on position %s, current %s", objArr);
        }
    }

    /* renamed from: l */
    public void mo68495l(boolean z) {
        this.f59377s = z;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        FastScroller.C12193e eVar = this.f59376p;
        if (eVar != null) {
            eVar.mo68493a(recyclerView);
        }
        this.f59375o = recyclerView;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        if (viewHolder instanceof C15763c) {
            C15763c cVar = (C15763c) viewHolder;
            cVar.mo75399t().setActivated(mo68946M(i));
            if (cVar.mo75399t().isActivated() && cVar.mo75410v() > 0.0f) {
                ViewCompat.setElevation(cVar.mo75399t(), cVar.mo75410v());
            } else if (cVar.mo75410v() > 0.0f) {
                ViewCompat.setElevation(cVar.mo75399t(), 0.0f);
            }
            if (cVar.isRecyclable()) {
                this.f59372d.add(cVar);
                this.f59370a.mo75143d("onViewBound    viewSize=%s %s %s", Integer.valueOf(this.f59372d.size()), C15705a.m94970a(viewHolder), viewHolder);
                return;
            }
            this.f59370a.mo75143d("onViewBound    recyclable=%s %s %s", Boolean.valueOf(viewHolder.isRecyclable()), C15705a.m94970a(viewHolder), viewHolder);
            return;
        }
        viewHolder.itemView.setActivated(mo68946M(i));
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        FastScroller.C12193e eVar = this.f59376p;
        if (eVar != null) {
            eVar.mo68494b(recyclerView);
        }
        this.f59375o = null;
        this.f59374g = null;
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15763c) {
            boolean remove = this.f59372d.remove(viewHolder);
            this.f59370a.mo75143d("onViewRecycled viewSize=%s %s %s recycled=%s", Integer.valueOf(this.f59372d.size()), C15705a.m94970a(viewHolder), viewHolder, Boolean.valueOf(remove));
        }
    }

    /* renamed from: p */
    public String mo68492p(int i) {
        return String.valueOf(i + 1);
    }
}
