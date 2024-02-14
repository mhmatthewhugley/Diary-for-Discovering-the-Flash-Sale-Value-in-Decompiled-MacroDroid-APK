package p296j9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p286i9.C12454b;
import p325m9.C15705a;

/* renamed from: j9.a */
/* compiled from: FlexibleItemDecoration */
public class C13309a extends RecyclerView.ItemDecoration {

    /* renamed from: p */
    protected static final int[] f61290p = {16843284};

    /* renamed from: a */
    private Context f61291a;

    /* renamed from: b */
    private SparseArray<C13310a> f61292b;

    /* renamed from: c */
    private List<Integer> f61293c;

    /* renamed from: d */
    private final C13310a f61294d = new C13310a();

    /* renamed from: e */
    private int f61295e;

    /* renamed from: f */
    private int f61296f;

    /* renamed from: g */
    private int f61297g = 1;

    /* renamed from: h */
    private int f61298h = 1;

    /* renamed from: i */
    private boolean f61299i;

    /* renamed from: j */
    private boolean f61300j;

    /* renamed from: k */
    private boolean f61301k;

    /* renamed from: l */
    private boolean f61302l;

    /* renamed from: m */
    protected Drawable f61303m;

    /* renamed from: n */
    protected final Rect f61304n = new Rect();

    /* renamed from: o */
    protected boolean f61305o;

    /* renamed from: j9.a$a */
    /* compiled from: FlexibleItemDecoration */
    private static class C13310a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f61306a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f61307b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f61308c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f61309d;

        C13310a() {
            this(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo70144e() {
            return this.f61307b >= 0 || this.f61306a >= 0 || this.f61308c >= 0 || this.f61309d >= 0;
        }

        C13310a(int i) {
            this(i, i, i, i);
        }

        C13310a(int i, int i2, int i3, int i4) {
            this.f61306a = i;
            this.f61307b = i2;
            this.f61308c = i3;
            this.f61309d = i4;
        }
    }

    public C13309a(@NonNull Context context) {
        this.f61291a = context;
    }

    /* renamed from: b */
    private void m85644b(Rect rect, RecyclerView.Adapter adapter, int i, int i2) {
        if (this.f61296f > 0 && (adapter instanceof C12454b)) {
            C12454b bVar = (C12454b) adapter;
            if (bVar.mo68848C1(bVar.mo68886e1(i + 1))) {
                if (i2 == 1) {
                    rect.bottom += this.f61296f;
                } else {
                    rect.right += this.f61296f;
                }
            }
            if (i < adapter.getItemCount() - this.f61298h) {
                return;
            }
            if (i2 == 1) {
                rect.bottom += this.f61296f;
            } else {
                rect.right += this.f61296f;
            }
        }
    }

    @NonNull
    /* renamed from: d */
    private C13310a m85645d(int i) {
        SparseArray<C13310a> sparseArray = this.f61292b;
        C13310a aVar = sparseArray != null ? sparseArray.get(i) : null;
        return aVar == null ? this.f61294d : aVar;
    }

    /* renamed from: e */
    private boolean m85646e(int i, RecyclerView.Adapter adapter, int i2, int i3) {
        int i4 = i > 0 ? i - 1 : -1;
        int i5 = i > i2 ? i - (i2 + 1) : -1;
        if (i == 0 || i4 == -1 || i3 != adapter.getItemViewType(i4) || i5 == -1 || i3 != adapter.getItemViewType(i5)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m85647f(int i, RecyclerView.Adapter adapter, int i2, int i3, int i4, int i5) {
        int itemCount = adapter.getItemCount();
        int i6 = itemCount - 1;
        int i7 = i < i6 ? i + 1 : -1;
        int i8 = (i3 / i4) - i2;
        int i9 = i < itemCount - i8 ? i8 + i : -1;
        return i == i6 || i7 == -1 || i5 != adapter.getItemViewType(i7) || i9 == -1 || i5 != adapter.getItemViewType(i9);
    }

    /* renamed from: a */
    public C13309a mo70136a(@LayoutRes int i, int i2, int i3, int i4, int i5) {
        if (this.f61292b == null) {
            this.f61292b = new SparseArray<>();
        }
        this.f61292b.put(i, new C13310a((int) (this.f61291a.getResources().getDisplayMetrics().density * ((float) i2)), (int) (this.f61291a.getResources().getDisplayMetrics().density * ((float) i3)), (int) (this.f61291a.getResources().getDisplayMetrics().density * ((float) i4)), (int) (this.f61291a.getResources().getDisplayMetrics().density * ((float) i5))));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70137c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() != null) {
            if (C15705a.m94972c(recyclerView) == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount - this.f61297g; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (mo70140g(recyclerView.getChildViewHolder(childAt))) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f61304n);
                int round = this.f61304n.right + Math.round(childAt.getTranslationX());
                this.f61303m.setBounds(round - this.f61303m.getIntrinsicWidth(), i2, round, i);
                this.f61303m.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount - this.f61297g; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (mo70140g(recyclerView.getChildViewHolder(childAt))) {
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.f61304n);
                int round = this.f61304n.bottom + Math.round(childAt.getTranslationY());
                this.f61303m.setBounds(i2, round - this.f61303m.getIntrinsicHeight(), i, round);
                this.f61303m.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70140g(RecyclerView.ViewHolder viewHolder) {
        List<Integer> list = this.f61293c;
        return list == null || list.isEmpty() || this.f61293c.contains(Integer.valueOf(viewHolder.getItemViewType()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getItemOffsets(android.graphics.Rect r20, android.view.View r21, androidx.recyclerview.widget.RecyclerView r22, androidx.recyclerview.widget.RecyclerView.State r23) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = r21
            r1 = r22
            int r9 = r1.getChildAdapterPosition(r0)
            androidx.recyclerview.widget.RecyclerView$Adapter r10 = r22.getAdapter()
            r11 = 0
            r2 = -1
            if (r9 == r2) goto L_0x001a
            int r2 = r10.getItemViewType(r9)
            r6 = r2
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            j9.a$a r2 = r7.m85645d(r6)
            boolean r3 = r2.mo70144e()
            if (r3 != 0) goto L_0x002c
            j9.a$a r2 = new j9.a$a
            int r3 = r7.f61295e
            r2.<init>(r3)
        L_0x002c:
            r12 = r2
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r22.getLayoutManager()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            r13 = 1
            if (r2 == 0) goto L_0x0058
            android.view.ViewGroup$LayoutParams r0 = r21.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            int r2 = r0.getSpanIndex()
            int r0 = r0.getSpanSize()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r22.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1
            int r3 = r1.getSpanCount()
            int r1 = r1.getOrientation()
        L_0x0052:
            r14 = r0
            r15 = r1
            r5 = r2
            r16 = r3
            goto L_0x0087
        L_0x0058:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r22.getLayoutManager()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L_0x0082
            android.view.ViewGroup$LayoutParams r0 = r21.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            int r2 = r0.getSpanIndex()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r22.getLayoutManager()
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            int r3 = r1.getSpanCount()
            boolean r0 = r0.isFullSpan()
            if (r0 == 0) goto L_0x007c
            r0 = r3
            goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            int r1 = r1.getOrientation()
            goto L_0x0052
        L_0x0082:
            r5 = 0
            r14 = 1
            r15 = 1
            r16 = 1
        L_0x0087:
            boolean r17 = r7.m85646e(r9, r10, r5, r6)
            r0 = r19
            r1 = r9
            r2 = r10
            r3 = r5
            r4 = r16
            r18 = r5
            r5 = r14
            boolean r0 = r0.m85647f(r1, r2, r3, r4, r5, r6)
            if (r15 != r13) goto L_0x00df
            boolean r1 = r7.f61299i
            if (r1 == 0) goto L_0x00a2
            int r5 = r16 - r18
            goto L_0x00a4
        L_0x00a2:
            r5 = r18
        L_0x00a4:
            int r1 = r12.f61306a
            int r1 = r1 * r5
            int r1 = r1 / r16
            int r5 = r18 + r14
            int r2 = r5 + -1
            int r2 = r16 - r2
            int r2 = r2 - r13
            boolean r3 = r7.f61301k
            if (r3 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r5 = r2
        L_0x00b9:
            int r2 = r12.f61308c
            int r2 = r2 * r5
            int r2 = r2 / r16
            if (r17 == 0) goto L_0x00cc
            boolean r3 = r7.f61300j
            if (r3 == 0) goto L_0x00cc
            int r3 = r12.f61307b
            goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r7.f61302l
            if (r0 == 0) goto L_0x00dc
            int r11 = r12.f61309d
            goto L_0x00dc
        L_0x00d8:
            int r11 = r12.f61309d
        L_0x00dc:
            r0 = r11
            r11 = r2
            goto L_0x0122
        L_0x00df:
            boolean r1 = r7.f61300j
            if (r1 == 0) goto L_0x00e6
            int r5 = r16 - r18
            goto L_0x00e8
        L_0x00e6:
            r5 = r18
        L_0x00e8:
            int r1 = r12.f61307b
            int r1 = r1 * r5
            int r3 = r1 / r16
            int r5 = r18 + r14
            int r1 = r5 + -1
            int r1 = r16 - r1
            int r1 = r1 - r13
            boolean r2 = r7.f61302l
            if (r2 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            int r1 = r12.f61309d
            int r1 = r1 * r5
            int r1 = r1 / r16
            if (r17 == 0) goto L_0x0110
            boolean r2 = r7.f61299i
            if (r2 == 0) goto L_0x0110
            int r2 = r12.f61306a
            goto L_0x0111
        L_0x0110:
            r2 = 0
        L_0x0111:
            if (r0 == 0) goto L_0x011c
            boolean r0 = r7.f61301k
            if (r0 == 0) goto L_0x0120
            int r11 = r12.f61308c
            goto L_0x0120
        L_0x011c:
            int r11 = r12.f61308c
        L_0x0120:
            r0 = r1
            r1 = r2
        L_0x0122:
            r8.set(r1, r3, r11, r0)
            r7.m85644b(r8, r10, r9, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p296j9.C13309a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: h */
    public C13309a mo70141h(boolean z) {
        this.f61302l = z;
        return this;
    }

    /* renamed from: i */
    public C13309a mo70142i(boolean z) {
        this.f61302l = z;
        this.f61301k = z;
        this.f61300j = z;
        this.f61299i = z;
        return this;
    }

    /* renamed from: j */
    public C13309a mo70143j(@IntRange(from = 0) int i) {
        this.f61296f = (int) (this.f61291a.getResources().getDisplayMetrics().density * ((float) i));
        return this;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f61303m != null && !this.f61305o) {
            mo70137c(canvas, recyclerView);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f61303m != null && this.f61305o) {
            mo70137c(canvas, recyclerView);
        }
    }
}
