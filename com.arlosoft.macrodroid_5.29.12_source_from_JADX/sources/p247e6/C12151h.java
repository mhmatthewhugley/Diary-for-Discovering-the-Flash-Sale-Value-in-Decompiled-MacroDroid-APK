package p247e6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import p258f6.C12238b;

/* renamed from: e6.h */
/* compiled from: DraggingItemDecorator */
class C12151h extends C12143a {

    /* renamed from: A */
    private float f58460A = 0.0f;

    /* renamed from: B */
    private float f58461B = 1.0f;

    /* renamed from: C */
    private float f58462C;

    /* renamed from: D */
    private float f58463D;

    /* renamed from: E */
    private Interpolator f58464E = null;

    /* renamed from: F */
    private Interpolator f58465F = null;

    /* renamed from: G */
    private Interpolator f58466G = null;

    /* renamed from: H */
    private float f58467H;

    /* renamed from: I */
    private float f58468I;

    /* renamed from: J */
    private float f58469J;

    /* renamed from: K */
    private float f58470K;

    /* renamed from: f */
    private int f58471f;

    /* renamed from: g */
    private int f58472g;

    /* renamed from: h */
    private Bitmap f58473h;

    /* renamed from: i */
    private int f58474i;

    /* renamed from: j */
    private int f58475j;

    /* renamed from: k */
    private int f58476k;

    /* renamed from: l */
    private int f58477l;

    /* renamed from: m */
    private int f58478m;

    /* renamed from: n */
    private int f58479n;

    /* renamed from: o */
    private NinePatchDrawable f58480o;

    /* renamed from: p */
    private final Rect f58481p = new Rect();

    /* renamed from: q */
    private boolean f58482q;

    /* renamed from: r */
    private boolean f58483r;

    /* renamed from: s */
    private C12154k f58484s;

    /* renamed from: t */
    private int f58485t;

    /* renamed from: u */
    private int f58486u;

    /* renamed from: v */
    private C12153j f58487v;

    /* renamed from: w */
    private Paint f58488w;

    /* renamed from: x */
    private long f58489x;

    /* renamed from: y */
    private long f58490y = 0;

    /* renamed from: z */
    private float f58491z = 1.0f;

    public C12151h(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, C12154k kVar) {
        super(recyclerView, viewHolder);
        this.f58484s = kVar;
        this.f58488w = new Paint();
    }

    /* renamed from: G */
    private void m82682G(float f, int i) {
        RecyclerView.ViewHolder viewHolder = this.f58438e;
        if (viewHolder != null) {
            C12143a.m82636d(this.f58437d, viewHolder, f - ((float) viewHolder.itemView.getLeft()), (float) (i - this.f58438e.itemView.getTop()));
        }
    }

    /* renamed from: I */
    private void m82683I() {
        RecyclerView recyclerView = this.f58437d;
        if (recyclerView.getChildCount() > 0) {
            this.f58474i = 0;
            this.f58475j = recyclerView.getWidth() - this.f58487v.f58499a;
            this.f58476k = 0;
            int height = recyclerView.getHeight();
            int i = this.f58487v.f58500b;
            this.f58477l = height - i;
            int i2 = this.f58485t;
            if (i2 == 0) {
                this.f58476k += recyclerView.getPaddingTop();
                this.f58477l -= recyclerView.getPaddingBottom();
                this.f58474i = -this.f58487v.f58499a;
                this.f58475j = recyclerView.getWidth();
            } else if (i2 == 1) {
                this.f58476k = -i;
                this.f58477l = recyclerView.getHeight();
                this.f58474i += recyclerView.getPaddingLeft();
                this.f58475j -= recyclerView.getPaddingRight();
            }
            this.f58475j = Math.max(this.f58474i, this.f58475j);
            this.f58477l = Math.max(this.f58476k, this.f58477l);
            if (!this.f58483r) {
                int e = C12238b.m82885e(recyclerView, true);
                int h = C12238b.m82888h(recyclerView, true);
                View i3 = m82686i(recyclerView, this.f58484s, e, h);
                View j = m82687j(recyclerView, this.f58484s, e, h);
                int i4 = this.f58485t;
                if (i4 == 0) {
                    if (i3 != null) {
                        this.f58474i = Math.min(this.f58474i, i3.getLeft());
                    }
                    if (j != null) {
                        this.f58475j = Math.min(this.f58475j, Math.max(0, j.getRight() - this.f58487v.f58499a));
                    }
                } else if (i4 == 1) {
                    if (i3 != null) {
                        this.f58476k = Math.min(this.f58477l, i3.getTop());
                    }
                    if (j != null) {
                        this.f58477l = Math.min(this.f58477l, Math.max(0, j.getBottom() - this.f58487v.f58500b));
                    }
                }
            }
        } else {
            int paddingLeft = recyclerView.getPaddingLeft();
            this.f58474i = paddingLeft;
            this.f58475j = paddingLeft;
            int paddingTop = recyclerView.getPaddingTop();
            this.f58476k = paddingTop;
            this.f58477l = paddingTop;
        }
        int i5 = this.f58478m;
        C12153j jVar = this.f58487v;
        this.f58471f = i5 - jVar.f58504f;
        this.f58472g = this.f58479n - jVar.f58505g;
        if (C12238b.m82901u(this.f58486u)) {
            this.f58471f = m82684g(this.f58471f, this.f58474i, this.f58475j);
            this.f58472g = m82684g(this.f58472g, this.f58476k, this.f58477l);
        }
    }

    /* renamed from: g */
    private static int m82684g(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: h */
    private Bitmap m82685h(View view, NinePatchDrawable ninePatchDrawable) {
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth();
        int height = view.getHeight();
        Rect rect = this.f58481p;
        int i = rect.left + width + rect.right;
        int i2 = rect.top + height + rect.bottom;
        view.measure(View.MeasureSpec.makeMeasureSpec(width, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(height, BasicMeasure.EXACTLY));
        view.layout(left, top, width + left, height + top);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds(0, 0, i, i2);
            ninePatchDrawable.draw(canvas);
        }
        int save = canvas.save();
        Rect rect2 = this.f58481p;
        canvas.clipRect(rect2.left, rect2.top, i - rect2.right, i2 - rect2.bottom);
        Rect rect3 = this.f58481p;
        canvas.translate((float) rect3.left, (float) rect3.top);
        view.draw(canvas);
        canvas.restoreToCount(save);
        return createBitmap;
    }

    /* renamed from: i */
    private static View m82686i(RecyclerView recyclerView, C12154k kVar, int i, int i2) {
        int layoutPosition;
        if (i == -1 || i2 == -1) {
            return null;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder != null && (layoutPosition = childViewHolder.getLayoutPosition()) >= i && layoutPosition <= i2 && kVar.mo68395a(layoutPosition)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static View m82687j(RecyclerView recyclerView, C12154k kVar, int i, int i2) {
        int layoutPosition;
        if (i == -1 || i2 == -1) {
            return null;
        }
        for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = recyclerView.getChildAt(childCount);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            if (childViewHolder != null && (layoutPosition = childViewHolder.getLayoutPosition()) >= i && layoutPosition <= i2 && kVar.mo68395a(layoutPosition)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: p */
    private static float m82688p(Interpolator interpolator, float f) {
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* renamed from: A */
    public void mo68373A(RecyclerView.ViewHolder viewHolder) {
        if (this.f58438e == null) {
            this.f58438e = viewHolder;
            viewHolder.itemView.setVisibility(4);
            return;
        }
        throw new IllegalStateException("A new view holder is attempt to be assigned before invalidating the older one");
    }

    /* renamed from: B */
    public void mo68374B(boolean z) {
        if (this.f58483r != z) {
            this.f58483r = z;
        }
    }

    /* renamed from: C */
    public void mo68375C(NinePatchDrawable ninePatchDrawable) {
        this.f58480o = ninePatchDrawable;
        if (ninePatchDrawable != null) {
            ninePatchDrawable.getPadding(this.f58481p);
        }
    }

    /* renamed from: D */
    public void mo68376D(C12152i iVar) {
        this.f58490y = (long) iVar.f58492a;
        this.f58491z = iVar.f58493b;
        this.f58464E = iVar.f58496e;
        this.f58460A = iVar.f58494c;
        this.f58465F = iVar.f58497f;
        this.f58461B = iVar.f58495d;
        this.f58466G = iVar.f58498g;
    }

    /* renamed from: E */
    public void mo68377E(C12153j jVar, int i, int i2) {
        if (!this.f58482q) {
            View view = this.f58438e.itemView;
            this.f58487v = jVar;
            this.f58473h = m82685h(view, this.f58480o);
            this.f58474i = this.f58437d.getPaddingLeft();
            this.f58476k = this.f58437d.getPaddingTop();
            this.f58485t = C12238b.m82898r(this.f58437d);
            this.f58486u = C12238b.m82896p(this.f58437d);
            this.f58462C = view.getScaleX();
            this.f58463D = view.getScaleY();
            this.f58467H = 1.0f;
            this.f58468I = 1.0f;
            this.f58469J = 0.0f;
            this.f58470K = 1.0f;
            view.setVisibility(4);
            mo68378F(i, i2, true);
            this.f58437d.addItemDecoration(this);
            this.f58489x = System.currentTimeMillis();
            this.f58482q = true;
        }
    }

    /* renamed from: F */
    public boolean mo68378F(int i, int i2, boolean z) {
        this.f58478m = i;
        this.f58479n = i2;
        return mo68394z(z);
    }

    /* renamed from: H */
    public void mo68379H(C12153j jVar, RecyclerView.ViewHolder viewHolder) {
        if (this.f58482q) {
            if (this.f58438e != viewHolder) {
                mo68389u();
                this.f58438e = viewHolder;
            }
            this.f58473h = m82685h(viewHolder.itemView, this.f58480o);
            this.f58487v = jVar;
            mo68394z(true);
        }
    }

    /* renamed from: k */
    public void mo68380k(boolean z) {
        if (this.f58482q) {
            this.f58437d.removeItemDecoration(this);
        }
        RecyclerView.ItemAnimator itemAnimator = this.f58437d.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        this.f58437d.stopScroll();
        m82682G((float) this.f58471f, this.f58472g);
        RecyclerView.ViewHolder viewHolder = this.f58438e;
        if (viewHolder != null) {
            mo68349b(viewHolder.itemView, this.f58467H, this.f58468I, this.f58469J, this.f58470K, z);
        }
        RecyclerView.ViewHolder viewHolder2 = this.f58438e;
        if (viewHolder2 != null) {
            viewHolder2.itemView.setVisibility(0);
        }
        this.f58438e = null;
        Bitmap bitmap = this.f58473h;
        if (bitmap != null) {
            bitmap.recycle();
            this.f58473h = null;
        }
        this.f58484s = null;
        this.f58471f = 0;
        this.f58472g = 0;
        this.f58474i = 0;
        this.f58475j = 0;
        this.f58476k = 0;
        this.f58477l = 0;
        this.f58478m = 0;
        this.f58479n = 0;
        this.f58482q = false;
    }

    /* renamed from: l */
    public int mo68381l() {
        return this.f58471f - this.f58487v.f58502d;
    }

    /* renamed from: m */
    public int mo68382m() {
        return this.f58472g - this.f58487v.f58503e;
    }

    /* renamed from: n */
    public int mo68383n() {
        return this.f58471f;
    }

    /* renamed from: o */
    public int mo68384o() {
        return this.f58472g;
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (this.f58473h != null) {
            int min = (int) Math.min(System.currentTimeMillis() - this.f58489x, this.f58490y);
            long j = this.f58490y;
            float f = j > 0 ? ((float) min) / ((float) j) : 1.0f;
            float p = m82688p(this.f58464E, f);
            float f2 = this.f58491z;
            float f3 = this.f58462C;
            float f4 = ((f2 - f3) * p) + f3;
            float f5 = this.f58463D;
            float f6 = (p * (f2 - f5)) + f5;
            float p2 = (m82688p(this.f58466G, f) * (this.f58461B - 1.0f)) + 1.0f;
            float p3 = m82688p(this.f58465F, f) * this.f58460A;
            if (f4 > 0.0f && f6 > 0.0f && p2 > 0.0f) {
                this.f58488w.setAlpha((int) (255.0f * p2));
                int save = canvas.save();
                int i = this.f58471f;
                C12153j jVar = this.f58487v;
                canvas.translate((float) (i + jVar.f58504f), (float) (this.f58472g + jVar.f58505g));
                canvas.scale(f4, f6);
                canvas.rotate(p3);
                Rect rect = this.f58481p;
                int i2 = rect.left;
                C12153j jVar2 = this.f58487v;
                canvas.translate((float) (-(i2 + jVar2.f58504f)), (float) (-(rect.top + jVar2.f58505g)));
                canvas.drawBitmap(this.f58473h, 0.0f, 0.0f, this.f58488w);
                canvas.restoreToCount(save);
            }
            if (f < 1.0f) {
                ViewCompat.postInvalidateOnAnimation(this.f58437d);
            }
            this.f58467H = f4;
            this.f58468I = f6;
            this.f58469J = p3;
            this.f58470K = p2;
        }
    }

    /* renamed from: q */
    public int mo68385q() {
        return this.f58472g + this.f58487v.f58500b;
    }

    /* renamed from: r */
    public int mo68386r() {
        return this.f58471f;
    }

    /* renamed from: s */
    public int mo68387s() {
        return this.f58471f + this.f58487v.f58499a;
    }

    /* renamed from: t */
    public int mo68388t() {
        return this.f58472g;
    }

    /* renamed from: u */
    public void mo68389u() {
        RecyclerView.ViewHolder viewHolder = this.f58438e;
        if (viewHolder != null) {
            viewHolder.itemView.setTranslationX(0.0f);
            this.f58438e.itemView.setTranslationY(0.0f);
            this.f58438e.itemView.setVisibility(0);
        }
        this.f58438e = null;
    }

    /* renamed from: v */
    public boolean mo68390v() {
        return this.f58472g == this.f58477l;
    }

    /* renamed from: w */
    public boolean mo68391w() {
        return this.f58471f == this.f58474i;
    }

    /* renamed from: x */
    public boolean mo68392x() {
        return this.f58471f == this.f58475j;
    }

    /* renamed from: y */
    public boolean mo68393y() {
        return this.f58472g == this.f58476k;
    }

    /* renamed from: z */
    public boolean mo68394z(boolean z) {
        int i = this.f58471f;
        int i2 = this.f58472g;
        m82683I();
        int i3 = this.f58471f;
        boolean z2 = (i == i3 && i2 == this.f58472g) ? false : true;
        if (z2 || z) {
            m82682G((float) i3, this.f58472g);
            ViewCompat.postInvalidateOnAnimation(this.f58437d);
        }
        return z2;
    }
}
