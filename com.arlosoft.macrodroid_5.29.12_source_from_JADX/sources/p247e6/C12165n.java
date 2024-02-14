package p247e6;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.RecyclerView;
import p258f6.C12238b;

/* renamed from: e6.n */
/* compiled from: SwapTargetItemOperator */
class C12165n extends C12143a {

    /* renamed from: r */
    private static final ViewPropertyAnimatorListener f58594r = new C12166a();

    /* renamed from: f */
    private RecyclerView.ViewHolder f58595f;

    /* renamed from: g */
    private Interpolator f58596g;

    /* renamed from: h */
    private int f58597h;

    /* renamed from: i */
    private int f58598i;

    /* renamed from: j */
    private final Rect f58599j = new Rect();

    /* renamed from: k */
    private final Rect f58600k = new Rect();

    /* renamed from: l */
    private final Rect f58601l;

    /* renamed from: m */
    private boolean f58602m;

    /* renamed from: n */
    private float f58603n;

    /* renamed from: o */
    private float f58604o;

    /* renamed from: p */
    private C12153j f58605p;

    /* renamed from: q */
    private boolean f58606q;

    /* renamed from: e6.n$a */
    /* compiled from: SwapTargetItemOperator */
    static class C12166a implements ViewPropertyAnimatorListener {
        C12166a() {
        }

        public void onAnimationCancel(View view) {
        }

        public void onAnimationEnd(View view) {
            ViewCompat.animate(view).setListener((ViewPropertyAnimatorListener) null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public void onAnimationStart(View view) {
        }
    }

    public C12165n(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, C12153j jVar) {
        super(recyclerView, viewHolder);
        Rect rect = new Rect();
        this.f58601l = rect;
        this.f58605p = jVar;
        C12238b.m82892l(this.f58437d.getLayoutManager(), this.f58438e.itemView, rect);
    }

    /* renamed from: g */
    private static float m82798g(float f, float f2) {
        float f3 = (f * 0.7f) + (0.3f * f2);
        return Math.abs(f3 - f2) < 0.01f ? f2 : f3;
    }

    /* renamed from: h */
    private float m82799h(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        View view = viewHolder2.itemView;
        int layoutPosition = viewHolder.getLayoutPosition();
        int layoutPosition2 = viewHolder2.getLayoutPosition();
        C12238b.m82892l(this.f58437d.getLayoutManager(), view, this.f58599j);
        C12238b.m82894n(view, this.f58600k);
        Rect rect = this.f58600k;
        Rect rect2 = this.f58599j;
        int height = view.getHeight() + rect.top + rect.bottom + rect2.top + rect2.bottom;
        int width = view.getWidth() + rect.left + rect.right + rect2.left + rect2.right;
        float left = width != 0 ? ((float) (viewHolder.itemView.getLeft() - this.f58597h)) / ((float) width) : 0.0f;
        float top = height != 0 ? ((float) (viewHolder.itemView.getTop() - this.f58598i)) / ((float) height) : 0.0f;
        int r = C12238b.m82898r(this.f58437d);
        if (r == 1) {
            left = layoutPosition > layoutPosition2 ? top : top + 1.0f;
        } else if (r != 0) {
            left = 0.0f;
        } else if (layoutPosition <= layoutPosition2) {
            left += 1.0f;
        }
        return Math.min(Math.max(left, 0.0f), 1.0f);
    }

    /* renamed from: o */
    private void m82800o(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, float f) {
        View view = viewHolder2.itemView;
        int layoutPosition = viewHolder.getLayoutPosition();
        int layoutPosition2 = viewHolder2.getLayoutPosition();
        C12153j jVar = this.f58605p;
        Rect rect = jVar.f58506h;
        Rect rect2 = this.f58601l;
        int i = jVar.f58500b + rect.top + rect.bottom + rect2.top + rect2.bottom;
        int i2 = jVar.f58499a + rect.left + rect.right + rect2.left + rect2.right;
        Interpolator interpolator = this.f58596g;
        if (interpolator != null) {
            f = interpolator.getInterpolation(f);
        }
        int r = C12238b.m82898r(this.f58437d);
        if (r != 0) {
            if (r == 1) {
                if (layoutPosition > layoutPosition2) {
                    view.setTranslationY(f * ((float) i));
                } else {
                    view.setTranslationY((f - 1.0f) * ((float) i));
                }
            }
        } else if (layoutPosition > layoutPosition2) {
            view.setTranslationX(f * ((float) i2));
        } else {
            view.setTranslationX((f - 1.0f) * ((float) i2));
        }
    }

    /* renamed from: i */
    public void mo68440i(boolean z) {
        if (this.f58602m) {
            this.f58437d.removeItemDecoration(this);
        }
        RecyclerView.ItemAnimator itemAnimator = this.f58437d.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        this.f58437d.stopScroll();
        RecyclerView.ViewHolder viewHolder = this.f58595f;
        if (viewHolder != null) {
            m82800o(this.f58438e, viewHolder, this.f58604o);
            mo68349b(this.f58595f.itemView, 1.0f, 1.0f, 0.0f, 1.0f, z);
            this.f58595f = null;
        }
        this.f58438e = null;
        this.f58597h = 0;
        this.f58598i = 0;
        this.f58604o = 0.0f;
        this.f58603n = 0.0f;
        this.f58602m = false;
        this.f58605p = null;
    }

    /* renamed from: j */
    public void mo68441j(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == this.f58595f) {
            mo68442k((RecyclerView.ViewHolder) null);
        }
    }

    /* renamed from: k */
    public void mo68442k(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = this.f58595f;
        if (viewHolder2 != viewHolder) {
            if (viewHolder2 != null) {
                ViewPropertyAnimatorCompat animate = ViewCompat.animate(viewHolder2.itemView);
                animate.cancel();
                animate.setDuration(10).translationX(0.0f).translationY(0.0f).setListener(f58594r).start();
            }
            this.f58595f = viewHolder;
            if (viewHolder != null) {
                ViewCompat.animate(viewHolder.itemView).cancel();
            }
            this.f58606q = true;
        }
    }

    /* renamed from: l */
    public void mo68443l(Interpolator interpolator) {
        this.f58596g = interpolator;
    }

    /* renamed from: m */
    public void mo68444m() {
        if (!this.f58602m) {
            this.f58437d.addItemDecoration(this, 0);
            this.f58602m = true;
        }
    }

    /* renamed from: n */
    public void mo68445n(int i, int i2) {
        this.f58597h = i;
        this.f58598i = i2;
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        RecyclerView.ViewHolder viewHolder = this.f58438e;
        RecyclerView.ViewHolder viewHolder2 = this.f58595f;
        if (viewHolder != null && viewHolder2 != null && viewHolder.getItemId() == this.f58605p.f58501c) {
            float h = m82799h(viewHolder, viewHolder2);
            this.f58603n = h;
            if (this.f58606q) {
                this.f58606q = false;
                this.f58604o = h;
            } else {
                this.f58604o = m82798g(this.f58604o, h);
            }
            m82800o(viewHolder, viewHolder2, this.f58604o);
        }
    }
}
