package p256eu.davidea.fastscroller;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p256eu.davidea.flexibleadapter.R$drawable;
import p256eu.davidea.flexibleadapter.R$styleable;
import p325m9.C15706b;

/* renamed from: eu.davidea.fastscroller.FastScroller */
public class FastScroller extends FrameLayout {

    /* renamed from: A */
    protected int f58618A;

    /* renamed from: B */
    protected long f58619B;

    /* renamed from: C */
    protected boolean f58620C;

    /* renamed from: D */
    protected boolean f58621D;

    /* renamed from: E */
    protected boolean f58622E;

    /* renamed from: F */
    protected boolean f58623F;

    /* renamed from: G */
    protected boolean f58624G;

    /* renamed from: H */
    protected int f58625H;

    /* renamed from: I */
    protected RecyclerView.OnScrollListener f58626I;

    /* renamed from: a */
    protected TextView f58627a;

    /* renamed from: c */
    protected ImageView f58628c;

    /* renamed from: d */
    protected int f58629d;

    /* renamed from: f */
    protected int f58630f;

    /* renamed from: g */
    protected int f58631g;

    /* renamed from: o */
    protected RecyclerView f58632o;

    /* renamed from: p */
    protected RecyclerView.LayoutManager f58633p;

    /* renamed from: s */
    protected C12192d f58634s;

    /* renamed from: z */
    protected List<C12194f> f58635z;

    /* renamed from: eu.davidea.fastscroller.FastScroller$a */
    class C12189a extends RecyclerView.OnScrollListener {
        C12189a() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (FastScroller.this.isEnabled()) {
                FastScroller fastScroller = FastScroller.this;
                if (fastScroller.f58627a != null && !fastScroller.f58628c.isSelected()) {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                    FastScroller fastScroller2 = FastScroller.this;
                    int i3 = fastScroller2.f58629d;
                    fastScroller2.setBubbleAndHandlePosition(((float) i3) * (((float) computeVerticalScrollOffset) / ((float) (computeVerticalScrollRange - i3))));
                    if (!(FastScroller.this.f58631g == 0 || i2 == 0)) {
                        int abs = Math.abs(i2);
                        FastScroller fastScroller3 = FastScroller.this;
                        if (abs <= fastScroller3.f58631g) {
                            Objects.requireNonNull(fastScroller3);
                            throw null;
                        }
                    }
                    FastScroller.this.mo68473l();
                    FastScroller.this.m82859d();
                }
            }
        }
    }

    /* renamed from: eu.davidea.fastscroller.FastScroller$b */
    class C12190b implements View.OnLayoutChangeListener {
        C12190b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            FastScroller fastScroller = FastScroller.this;
            fastScroller.f58633p = fastScroller.f58632o.getLayoutManager();
        }
    }

    /* renamed from: eu.davidea.fastscroller.FastScroller$c */
    class C12191c implements ViewTreeObserver.OnPreDrawListener {
        C12191c() {
        }

        public boolean onPreDraw() {
            FastScroller.this.f58632o.getViewTreeObserver().removeOnPreDrawListener(this);
            FastScroller fastScroller = FastScroller.this;
            if (fastScroller.f58627a != null && !fastScroller.f58628c.isSelected()) {
                int computeVerticalScrollOffset = FastScroller.this.f58632o.computeVerticalScrollOffset();
                int b = FastScroller.this.computeVerticalScrollRange();
                FastScroller fastScroller2 = FastScroller.this;
                int i = fastScroller2.f58629d;
                fastScroller2.setBubbleAndHandlePosition(((float) i) * (((float) computeVerticalScrollOffset) / ((float) (b - i))));
            }
            return true;
        }
    }

    /* renamed from: eu.davidea.fastscroller.FastScroller$d */
    public interface C12192d {
        /* renamed from: p */
        String mo68492p(int i);
    }

    /* renamed from: eu.davidea.fastscroller.FastScroller$e */
    public static class C12193e {

        /* renamed from: a */
        private RecyclerView f58639a;

        /* renamed from: b */
        private FastScroller f58640b;

        /* renamed from: a */
        public void mo68493a(RecyclerView recyclerView) {
            this.f58639a = recyclerView;
        }

        /* renamed from: b */
        public void mo68494b(RecyclerView recyclerView) {
            this.f58640b = null;
            this.f58639a = null;
        }
    }

    /* renamed from: eu.davidea.fastscroller.FastScroller$f */
    public interface C12194f {
        /* renamed from: l */
        void mo68495l(boolean z);
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m82859d() {
        if (this.f58621D) {
            mo68469h();
        }
    }

    /* renamed from: f */
    protected static int m82860f(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: c */
    public void mo68465c(C12194f fVar) {
        if (fVar != null && !this.f58635z.contains(fVar)) {
            this.f58635z.add(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo68466e(float f) {
        int itemCount = this.f58632o.getAdapter().getItemCount();
        float f2 = 0.0f;
        if (this.f58628c.getY() != 0.0f) {
            float y = this.f58628c.getY() + ((float) this.f58628c.getHeight());
            int i = this.f58629d;
            f2 = y >= ((float) (i + -5)) ? 1.0f : f / ((float) i);
        }
        return m82860f(0, itemCount - 1, (int) (f2 * ((float) itemCount)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo68467g() {
        throw null;
    }

    public long getAutoHideDelayInMillis() {
        return this.f58619B;
    }

    /* renamed from: h */
    public void mo68469h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo68470i() {
        if (!this.f58620C) {
            this.f58620C = true;
            setClipChildren(false);
            this.f58626I = new C12189a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo68471j(boolean z) {
        for (C12194f l : this.f58635z) {
            l.mo68495l(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo68472k() {
        if (this.f58622E) {
            throw null;
        }
    }

    /* renamed from: l */
    public void mo68473l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo68474m(int i) {
        if (this.f58627a != null && this.f58622E) {
            String p = this.f58634s.mo68492p(i);
            if (p != null) {
                this.f58627a.setVisibility(0);
                this.f58627a.setText(p);
                return;
            }
            this.f58627a.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = this.f58632o;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.f58626I);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = this.f58632o;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f58626I);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f58629d = i2;
        this.f58630f = i;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (this.f58632o.computeVerticalScrollRange() <= this.f58632o.computeVerticalScrollExtent()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.f58628c.setSelected(false);
            mo68471j(false);
            mo68467g();
            m82859d();
            return true;
        } else if (motionEvent.getX() < this.f58628c.getX() - ((float) ViewCompat.getPaddingStart(this.f58628c))) {
            return false;
        } else {
            if (this.f58623F && (motionEvent.getY() < this.f58628c.getY() || motionEvent.getY() > this.f58628c.getY() + ((float) this.f58628c.getHeight()))) {
                return false;
            }
            this.f58628c.setSelected(true);
            mo68471j(true);
            mo68472k();
            mo68473l();
        }
        float y = motionEvent.getY();
        setBubbleAndHandlePosition(y);
        setRecyclerViewPosition(y);
        return true;
    }

    public void setAutoHideDelayInMillis(@IntRange(from = 0) long j) {
        this.f58619B = j;
    }

    public void setAutoHideEnabled(boolean z) {
        this.f58621D = z;
    }

    public void setBubbleAndHandleColor(@ColorInt int i) {
        this.f58618A = i;
        if (this.f58627a != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R$drawable.fast_scroller_bubble, (Resources.Theme) null);
            gradientDrawable.setColor(i);
            this.f58627a.setBackground(gradientDrawable);
        }
        if (this.f58628c != null) {
            try {
                StateListDrawable stateListDrawable = (StateListDrawable) getResources().getDrawable(R$drawable.fast_scroller_handle, (Resources.Theme) null);
                ((GradientDrawable) StateListDrawable.class.getMethod("getStateDrawable", new Class[]{Integer.TYPE}).invoke(stateListDrawable, new Object[]{0})).setColor(i);
                this.f58628c.setImageDrawable(stateListDrawable);
            } catch (Exception e) {
                C15706b.m94984l(e, "Exception while setting Bubble and Handle Color", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setBubbleAndHandlePosition(float f) {
        if (this.f58629d != 0) {
            int height = this.f58628c.getHeight();
            int i = this.f58629d;
            float f2 = f - ((((float) height) * f) / ((float) i));
            this.f58628c.setY((float) m82860f(0, i - height, (int) f2));
            TextView textView = this.f58627a;
            if (textView != null) {
                int height2 = textView.getHeight();
                if (this.f58625H == 0) {
                    this.f58627a.setY((float) m82860f(0, (this.f58629d - height2) - (height / 2), (int) (f2 - (((float) height2) / 1.5f))));
                    return;
                }
                TextView textView2 = this.f58627a;
                textView2.setY((float) Math.max(0, (this.f58629d - textView2.getHeight()) / 2));
                TextView textView3 = this.f58627a;
                textView3.setX((float) Math.max(0, (this.f58630f - textView3.getWidth()) / 2));
            }
        }
    }

    public void setBubbleTextCreator(C12192d dVar) {
        this.f58634s = dVar;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            mo68473l();
            m82859d();
            return;
        }
        mo68469h();
    }

    public void setHandleAlwaysVisible(boolean z) {
        this.f58623F = z;
    }

    public void setIgnoreTouchesOutsideHandle(boolean z) {
        this.f58623F = z;
    }

    public void setMinimumScrollThreshold(@IntRange(from = 0) int i) {
        this.f58631g = i;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f58632o = recyclerView;
        RecyclerView.OnScrollListener onScrollListener = this.f58626I;
        if (onScrollListener != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.f58632o.addOnScrollListener(this.f58626I);
        this.f58632o.addOnLayoutChangeListener(new C12190b());
        if (recyclerView.getAdapter() instanceof C12192d) {
            setBubbleTextCreator((C12192d) recyclerView.getAdapter());
        }
        if (recyclerView.getAdapter() instanceof C12194f) {
            mo68465c((C12194f) recyclerView.getAdapter());
        }
        this.f58632o.getViewTreeObserver().addOnPreDrawListener(new C12191c());
    }

    /* access modifiers changed from: protected */
    public void setRecyclerViewPosition(float f) {
        if (this.f58632o != null) {
            int e = mo68466e(f);
            RecyclerView.LayoutManager layoutManager = this.f58633p;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(e, 0);
            } else {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(e, 0);
            }
            mo68474m(e);
        }
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58635z = new ArrayList();
        this.f58618A = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FastScroller, 0, 0);
        try {
            this.f58621D = obtainStyledAttributes.getBoolean(R$styleable.FastScroller_fastScrollerAutoHideEnabled, true);
            this.f58619B = (long) obtainStyledAttributes.getInteger(R$styleable.FastScroller_fastScrollerAutoHideDelayInMillis, 1000);
            this.f58622E = obtainStyledAttributes.getBoolean(R$styleable.FastScroller_fastScrollerBubbleEnabled, true);
            this.f58625H = obtainStyledAttributes.getInteger(R$styleable.FastScroller_fastScrollerBubblePosition, 0);
            this.f58623F = obtainStyledAttributes.getBoolean(R$styleable.FastScroller_fastScrollerIgnoreTouchesOutsideHandle, false);
            this.f58624G = obtainStyledAttributes.getBoolean(R$styleable.FastScroller_fastScrollerHandleAlwaysVisible, false);
            obtainStyledAttributes.recycle();
            mo68470i();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
