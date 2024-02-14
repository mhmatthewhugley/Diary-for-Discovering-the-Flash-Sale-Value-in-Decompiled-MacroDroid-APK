package p247e6;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e6.a */
/* compiled from: BaseDraggableItemDecorator */
abstract class C12143a extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f58434a = 200;

    /* renamed from: b */
    private final int f58435b;

    /* renamed from: c */
    private Interpolator f58436c;

    /* renamed from: d */
    protected final RecyclerView f58437d;

    /* renamed from: e */
    protected RecyclerView.ViewHolder f58438e;

    /* renamed from: e6.a$a */
    /* compiled from: BaseDraggableItemDecorator */
    class C12144a implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        final /* synthetic */ float f58439a;

        C12144a(float f) {
            this.f58439a = f;
        }

        public void onAnimationCancel(View view) {
        }

        public void onAnimationEnd(View view) {
            ViewCompat.animate(view).setListener((ViewPropertyAnimatorListener) null);
            C12143a.m82635c(view, this.f58439a);
            if (view.getParent() instanceof RecyclerView) {
                ViewCompat.postInvalidateOnAnimation((RecyclerView) view.getParent());
            }
        }

        public void onAnimationStart(View view) {
        }
    }

    public C12143a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        this.f58437d = recyclerView;
        this.f58438e = viewHolder;
        this.f58435b = (int) ((recyclerView.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
    }

    /* renamed from: c */
    protected static void m82635c(View view, float f) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ViewCompat.setTranslationZ(view, f);
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* renamed from: d */
    protected static void m82636d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2) {
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.endAnimation(viewHolder);
        }
        viewHolder.itemView.setTranslationX(f);
        viewHolder.itemView.setTranslationY(f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo68348a(View view, float f, float f2, float f3, float f4) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float abs = width > 0 ? Math.abs(translationX / ((float) width)) : 0.0f;
        float abs2 = height > 0 ? Math.abs(translationY / ((float) height)) : 0.0f;
        return Math.min(Math.max(Math.max(Math.max(Math.max(Math.max(0.0f, abs), abs2), Math.abs(Math.max(f, f2) - 1.0f)), Math.abs(f3 * 0.033333335f)), Math.abs(f4 - 1.0f)), 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo68349b(View view, float f, float f2, float f3, float f4, boolean z) {
        float translationZ = ViewCompat.getTranslationZ(view);
        int a = (int) (((float) this.f58434a) * mo68348a(view, f, f2, f3, f4));
        if (!z || a <= 20) {
            m82635c(view, translationZ);
            return;
        }
        ViewPropertyAnimatorCompat animate = ViewCompat.animate(view);
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setRotation(f3);
        view.setAlpha(f4);
        ViewCompat.setTranslationZ(view, translationZ + 1.0f);
        animate.cancel();
        animate.setDuration((long) a);
        animate.setInterpolator(this.f58436c);
        animate.translationX(0.0f);
        animate.translationY(0.0f);
        animate.translationZ(translationZ);
        animate.alpha(1.0f);
        animate.rotation(0.0f);
        animate.scaleX(1.0f);
        animate.scaleY(1.0f);
        animate.setListener(new C12144a(translationZ));
        animate.start();
    }

    /* renamed from: e */
    public void mo68350e(int i) {
        this.f58434a = i;
    }

    /* renamed from: f */
    public void mo68351f(Interpolator interpolator) {
        this.f58436c = interpolator;
    }
}
