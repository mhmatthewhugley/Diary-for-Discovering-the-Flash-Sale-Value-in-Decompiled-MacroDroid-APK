package p239d8;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.List;
import p249e8.C12172a;
import p249e8.C12173b;
import p249e8.C12174c;
import p260f8.C12247a;
import p260f8.C12248b;
import p268g8.C12315a;
import p268g8.C12316b;

/* renamed from: d8.b */
/* compiled from: ExpandableRecyclerViewAdapter */
public abstract class C11965b<GVH extends C12316b, CVH extends C12315a> extends RecyclerView.Adapter implements C12172a, C12174c {

    /* renamed from: a */
    protected C12247a f58157a;

    /* renamed from: c */
    private C11964a f58158c;

    /* renamed from: d */
    private C12174c f58159d;

    /* renamed from: f */
    private C12173b f58160f;

    public C11965b(List<? extends ExpandableGroup> list) {
        C12247a aVar = new C12247a(list);
        this.f58157a = aVar;
        this.f58158c = new C11964a(aVar, this);
    }

    /* renamed from: B */
    public List<? extends ExpandableGroup> mo67375B() {
        return this.f58157a.f58756a;
    }

    /* renamed from: C */
    public abstract void mo41025C(CVH cvh, int i, ExpandableGroup expandableGroup, int i2);

    /* renamed from: D */
    public abstract void mo41026D(GVH gvh, int i, ExpandableGroup expandableGroup);

    /* renamed from: E */
    public abstract CVH mo41027E(ViewGroup viewGroup, int i);

    /* renamed from: F */
    public abstract GVH mo41028F(ViewGroup viewGroup, int i);

    public int getItemCount() {
        return this.f58157a.mo68567d();
    }

    public int getItemViewType(int i) {
        return this.f58157a.mo68566c(i).f58762d;
    }

    /* renamed from: o */
    public boolean mo67376o(int i) {
        C12174c cVar = this.f58159d;
        if (cVar != null) {
            cVar.mo67376o(i);
        }
        return this.f58158c.mo67374c(i);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C12248b c = this.f58157a.mo68566c(i);
        ExpandableGroup a = this.f58157a.mo68564a(c);
        int i2 = c.f58762d;
        if (i2 == 1) {
            mo41025C((C12315a) viewHolder, i, a, c.f58760b);
        } else if (i2 == 2) {
            mo41026D((C12316b) viewHolder, i, a);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return mo41027E(viewGroup, i);
        }
        if (i == 2) {
            C12316b F = mo41028F(viewGroup, i);
            F.mo68639v(this);
            return F;
        }
        throw new IllegalArgumentException("viewType is not valid");
    }

    /* renamed from: u */
    public void mo67377u(int i, int i2) {
        if (i2 > 0) {
            notifyItemRangeRemoved(i, i2);
            if (this.f58160f != null) {
                this.f58160f.mo68454a((ExpandableGroup) mo67375B().get(this.f58157a.mo68566c(i - 1).f58759a));
            }
        }
    }

    /* renamed from: w */
    public void mo67378w(int i, int i2) {
        if (i2 > 0) {
            notifyItemRangeInserted(i, i2);
            if (this.f58160f != null) {
                this.f58160f.mo68455b((ExpandableGroup) mo67375B().get(this.f58157a.mo68566c(i).f58759a));
            }
        }
    }
}
