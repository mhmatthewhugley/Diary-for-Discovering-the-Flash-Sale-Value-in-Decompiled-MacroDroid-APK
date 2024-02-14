package p306k9;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k9.a */
/* compiled from: ItemTouchHelperCallback */
public class C13420a extends ItemTouchHelper.Callback {

    /* renamed from: a */
    protected C13421a f61493a;

    /* renamed from: b */
    protected boolean f61494b = false;

    /* renamed from: c */
    protected boolean f61495c = false;

    /* renamed from: d */
    protected boolean f61496d = false;

    /* renamed from: e */
    protected long f61497e = 300;

    /* renamed from: f */
    protected long f61498f = 400;

    /* renamed from: g */
    protected float f61499g = 0.5f;

    /* renamed from: h */
    protected float f61500h = 0.5f;

    /* renamed from: i */
    protected int f61501i = -1;

    /* renamed from: k9.a$a */
    /* compiled from: ItemTouchHelperCallback */
    public interface C13421a {
        /* renamed from: a */
        void mo68878a(RecyclerView.ViewHolder viewHolder, int i);

        /* renamed from: d */
        boolean mo68883d(int i, int i2);

        /* renamed from: f */
        void mo68887f(int i, int i2);

        /* renamed from: z */
        boolean mo68910z(int i, int i2);
    }

    /* renamed from: k9.a$b */
    /* compiled from: ItemTouchHelperCallback */
    public interface C13422b {
        /* renamed from: a */
        boolean mo70868a();

        /* renamed from: b */
        boolean mo70869b();

        /* renamed from: d */
        View mo70870d();

        /* renamed from: f */
        void mo70871f(int i, int i2);

        /* renamed from: o */
        View mo70872o();

        /* renamed from: p */
        View mo70873p();

        /* renamed from: s */
        void mo70874s(int i);
    }

    public C13420a(C13421a aVar) {
        this.f61493a = aVar;
    }

    /* renamed from: b */
    private static void m85857b(C13422b bVar, int i) {
        int i2 = 0;
        if (bVar.mo70870d() != null) {
            bVar.mo70870d().setVisibility(i == 4 ? 0 : 8);
        }
        if (bVar.mo70872o() != null) {
            View o = bVar.mo70872o();
            if (i != 8) {
                i2 = 8;
            }
            o.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public boolean mo70867a() {
        return this.f61495c;
    }

    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return true;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.setAlpha(1.0f);
        if (viewHolder instanceof C13422b) {
            C13422b bVar = (C13422b) viewHolder;
            ItemTouchHelper.Callback.getDefaultUIUtil().clearView(bVar.mo70873p());
            m85857b(bVar, 0);
            bVar.mo70874s(viewHolder.getAdapterPosition());
        }
    }

    public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
        return i == 8 ? this.f61498f : this.f61497e;
    }

    public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f61500h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r7.mo70868a() == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.RecyclerView.ViewHolder r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r6.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            r2 = 12
            r3 = 3
            r4 = 0
            if (r1 != 0) goto L_0x0025
            boolean r0 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            int r6 = p325m9.C15705a.m94972c(r6)
            if (r6 != 0) goto L_0x001d
            int r6 = r5.f61501i
            if (r6 <= 0) goto L_0x0028
            r3 = r6
            goto L_0x0028
        L_0x001d:
            int r6 = r5.f61501i
            if (r6 <= 0) goto L_0x0022
            r2 = r6
        L_0x0022:
            r3 = r2
            r2 = 3
            goto L_0x0028
        L_0x0025:
            r2 = 15
            r3 = 0
        L_0x0028:
            boolean r6 = r7 instanceof p306k9.C13420a.C13422b
            if (r6 == 0) goto L_0x003c
            k9.a$b r7 = (p306k9.C13420a.C13422b) r7
            boolean r6 = r7.mo70869b()
            if (r6 != 0) goto L_0x0035
            r2 = 0
        L_0x0035:
            boolean r6 = r7.mo70868a()
            if (r6 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r4 = r3
        L_0x003d:
            int r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.makeMovementFlags(r2, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p306k9.C13420a.getMovementFlags(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder):int");
    }

    public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f61499g;
    }

    public boolean isItemViewSwipeEnabled() {
        return this.f61496d;
    }

    public boolean isLongPressDragEnabled() {
        return this.f61494b;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        if (i != 1 || !(viewHolder instanceof C13422b)) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            return;
        }
        C13422b bVar = (C13422b) viewHolder;
        View p = bVar.mo70873p();
        float f3 = f2 != 0.0f ? f2 : f;
        int i2 = 0;
        if (f3 > 0.0f) {
            i2 = 8;
        } else if (f3 < 0.0f) {
            i2 = 4;
        }
        m85857b(bVar, i2);
        ItemTouchHelper.Callback.getDefaultUIUtil().onDraw(canvas, recyclerView, p, f, f2, i, z);
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (!this.f61493a.mo68910z(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition())) {
            return false;
        }
        this.f61493a.mo68883d(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        return true;
    }

    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        this.f61493a.mo68878a(viewHolder, i);
        if (i == 0) {
            super.onSelectedChanged(viewHolder, i);
        } else if (viewHolder instanceof C13422b) {
            C13422b bVar = (C13422b) viewHolder;
            bVar.mo70871f(viewHolder.getAdapterPosition(), i);
            if (i == 1) {
                ItemTouchHelper.Callback.getDefaultUIUtil().onSelected(bVar.mo70873p());
            }
        }
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        if ((viewHolder instanceof C13422b) && ((C13422b) viewHolder).mo70873p().getTranslationX() != 0.0f) {
            this.f61493a.mo68887f(viewHolder.getAdapterPosition(), i);
        }
    }
}
