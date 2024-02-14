package p247e6;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e6.b */
/* compiled from: BaseEdgeEffectDecorator */
abstract class C12145b extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private RecyclerView f58441a;

    /* renamed from: b */
    private EdgeEffect f58442b;

    /* renamed from: c */
    private EdgeEffect f58443c;

    /* renamed from: d */
    private boolean f58444d;

    /* renamed from: e */
    private int f58445e;

    /* renamed from: f */
    private int f58446f;

    public C12145b(@NonNull RecyclerView recyclerView) {
        this.f58441a = recyclerView;
    }

    /* renamed from: a */
    private static boolean m82641a(Canvas canvas, RecyclerView recyclerView, int i, EdgeEffect edgeEffect) {
        if (edgeEffect.isFinished()) {
            return false;
        }
        int save = canvas.save();
        boolean d = m82644d(recyclerView);
        if (i == 0) {
            canvas.rotate(-90.0f);
            if (d) {
                canvas.translate((float) ((-recyclerView.getHeight()) + recyclerView.getPaddingTop()), (float) recyclerView.getPaddingLeft());
            } else {
                canvas.translate((float) (-recyclerView.getHeight()), 0.0f);
            }
        } else if (i != 1) {
            if (i == 2) {
                canvas.rotate(90.0f);
                if (d) {
                    canvas.translate((float) recyclerView.getPaddingTop(), (float) ((-recyclerView.getWidth()) + recyclerView.getPaddingRight()));
                } else {
                    canvas.translate(0.0f, (float) (-recyclerView.getWidth()));
                }
            } else if (i == 3) {
                canvas.rotate(180.0f);
                if (d) {
                    canvas.translate((float) ((-recyclerView.getWidth()) + recyclerView.getPaddingRight()), (float) ((-recyclerView.getHeight()) + recyclerView.getPaddingBottom()));
                } else {
                    canvas.translate((float) (-recyclerView.getWidth()), (float) (-recyclerView.getHeight()));
                }
            }
        } else if (d) {
            canvas.translate((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop());
        }
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: b */
    private void m82642b(RecyclerView recyclerView) {
        if (this.f58442b == null) {
            this.f58442b = new EdgeEffect(recyclerView.getContext());
        }
        m82645k(recyclerView, this.f58442b, this.f58445e);
    }

    /* renamed from: c */
    private void m82643c(RecyclerView recyclerView) {
        if (this.f58443c == null) {
            this.f58443c = new EdgeEffect(recyclerView.getContext());
        }
        m82645k(recyclerView, this.f58443c, this.f58446f);
    }

    /* renamed from: d */
    private static boolean m82644d(RecyclerView recyclerView) {
        return recyclerView.getLayoutManager().getClipToPadding();
    }

    /* renamed from: k */
    private static void m82645k(RecyclerView recyclerView, EdgeEffect edgeEffect, int i) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (m82644d(recyclerView)) {
            measuredWidth -= recyclerView.getPaddingLeft() + recyclerView.getPaddingRight();
            measuredHeight -= recyclerView.getPaddingTop() + recyclerView.getPaddingBottom();
        }
        int max = Math.max(0, measuredWidth);
        int max2 = Math.max(0, measuredHeight);
        if (i == 0 || i == 2) {
            int i2 = max;
            max = max2;
            max2 = i2;
        }
        edgeEffect.setSize(max, max2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo68352e(int i);

    /* renamed from: f */
    public void mo68353f(float f) {
        m82642b(this.f58441a);
        EdgeEffectCompat.onPull(this.f58442b, f, 0.5f);
        ViewCompat.postInvalidateOnAnimation(this.f58441a);
    }

    /* renamed from: g */
    public void mo68354g(float f) {
        m82643c(this.f58441a);
        EdgeEffectCompat.onPull(this.f58443c, f, 0.5f);
        ViewCompat.postInvalidateOnAnimation(this.f58441a);
    }

    /* renamed from: h */
    public void mo68355h() {
        EdgeEffect edgeEffect = this.f58442b;
        boolean z = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = false | this.f58442b.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f58443c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f58443c.isFinished();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this.f58441a);
        }
    }

    /* renamed from: i */
    public void mo68356i() {
        if (this.f58444d) {
            this.f58441a.removeItemDecoration(this);
            this.f58441a.addItemDecoration(this);
        }
    }

    /* renamed from: j */
    public void mo68357j() {
        if (!this.f58444d) {
            this.f58445e = mo68352e(0);
            this.f58446f = mo68352e(1);
            this.f58441a.addItemDecoration(this);
            this.f58444d = true;
        }
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        EdgeEffect edgeEffect = this.f58442b;
        boolean z = false;
        if (edgeEffect != null) {
            z = false | m82641a(canvas, recyclerView, this.f58445e, edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.f58443c;
        if (edgeEffect2 != null) {
            z |= m82641a(canvas, recyclerView, this.f58446f, edgeEffect2);
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(recyclerView);
        }
    }
}
