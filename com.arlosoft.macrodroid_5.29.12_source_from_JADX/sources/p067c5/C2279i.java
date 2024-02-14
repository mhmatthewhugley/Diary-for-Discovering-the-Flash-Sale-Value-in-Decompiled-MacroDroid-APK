package p067c5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p063b5.C2250c;
import p090f5.C7315j;

@Deprecated
/* renamed from: c5.i */
/* compiled from: ViewTarget */
public abstract class C2279i<T extends View, Z> extends C2271a<Z> {

    /* renamed from: g */
    private static boolean f6982g;
    @Nullable

    /* renamed from: h */
    private static Integer f6983h;

    /* renamed from: b */
    protected final T f6984b;

    /* renamed from: c */
    private final C2280a f6985c;
    @Nullable

    /* renamed from: d */
    private View.OnAttachStateChangeListener f6986d;

    /* renamed from: e */
    private boolean f6987e;

    /* renamed from: f */
    private boolean f6988f;

    @VisibleForTesting
    /* renamed from: c5.i$a */
    /* compiled from: ViewTarget */
    static final class C2280a {
        @VisibleForTesting
        @Nullable

        /* renamed from: e */
        static Integer f6989e;

        /* renamed from: a */
        private final View f6990a;

        /* renamed from: b */
        private final List<C2277g> f6991b = new ArrayList();

        /* renamed from: c */
        boolean f6992c;
        @Nullable

        /* renamed from: d */
        private C2281a f6993d;

        /* renamed from: c5.i$a$a */
        /* compiled from: ViewTarget */
        private static final class C2281a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            private final WeakReference<C2280a> f6994a;

            C2281a(@NonNull C2280a aVar) {
                this.f6994a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C2280a aVar = (C2280a) this.f6994a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo24598a();
                return true;
            }
        }

        C2280a(@NonNull View view) {
            this.f6990a = view;
        }

        /* renamed from: c */
        private static int m9383c(@NonNull Context context) {
            if (f6989e == null) {
                Display defaultDisplay = ((WindowManager) C7315j.m30204d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f6989e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f6989e.intValue();
        }

        /* renamed from: e */
        private int m9384e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f6992c && this.f6990a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f6990a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m9383c(this.f6990a.getContext());
        }

        /* renamed from: f */
        private int m9385f() {
            int paddingTop = this.f6990a.getPaddingTop() + this.f6990a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f6990a.getLayoutParams();
            return m9384e(this.f6990a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m9386g() {
            int paddingLeft = this.f6990a.getPaddingLeft() + this.f6990a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f6990a.getLayoutParams();
            return m9384e(this.f6990a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m9387h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m9388i(int i, int i2) {
            return m9387h(i) && m9387h(i2);
        }

        /* renamed from: j */
        private void m9389j(int i, int i2) {
            Iterator it = new ArrayList(this.f6991b).iterator();
            while (it.hasNext()) {
                ((C2277g) it.next()).mo24546d(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24598a() {
            if (!this.f6991b.isEmpty()) {
                int g = m9386g();
                int f = m9385f();
                if (m9388i(g, f)) {
                    m9389j(g, f);
                    mo24599b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24599b() {
            ViewTreeObserver viewTreeObserver = this.f6990a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f6993d);
            }
            this.f6993d = null;
            this.f6991b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24600d(@NonNull C2277g gVar) {
            int g = m9386g();
            int f = m9385f();
            if (m9388i(g, f)) {
                gVar.mo24546d(g, f);
                return;
            }
            if (!this.f6991b.contains(gVar)) {
                this.f6991b.add(gVar);
            }
            if (this.f6993d == null) {
                ViewTreeObserver viewTreeObserver = this.f6990a.getViewTreeObserver();
                C2281a aVar = new C2281a(this);
                this.f6993d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo24601k(@NonNull C2277g gVar) {
            this.f6991b.remove(gVar);
        }
    }

    public C2279i(@NonNull T t) {
        this.f6984b = (View) C7315j.m30204d(t);
        this.f6985c = new C2280a(t);
    }

    @Nullable
    /* renamed from: i */
    private Object m9373i() {
        Integer num = f6983h;
        if (num == null) {
            return this.f6984b.getTag();
        }
        return this.f6984b.getTag(num.intValue());
    }

    /* renamed from: j */
    private void m9374j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f6986d;
        if (onAttachStateChangeListener != null && !this.f6988f) {
            this.f6984b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f6988f = true;
        }
    }

    /* renamed from: k */
    private void m9375k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f6986d;
        if (onAttachStateChangeListener != null && this.f6988f) {
            this.f6984b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f6988f = false;
        }
    }

    /* renamed from: l */
    private void m9376l(@Nullable Object obj) {
        Integer num = f6983h;
        if (num == null) {
            f6982g = true;
            this.f6984b.setTag(obj);
            return;
        }
        this.f6984b.setTag(num.intValue(), obj);
    }

    @CallSuper
    /* renamed from: a */
    public void mo24595a(@NonNull C2277g gVar) {
        this.f6985c.mo24600d(gVar);
    }

    @CallSuper
    /* renamed from: b */
    public void mo24582b(@Nullable Drawable drawable) {
        super.mo24582b(drawable);
        m9374j();
    }

    @Nullable
    /* renamed from: c */
    public C2250c mo24583c() {
        Object i = m9373i();
        if (i == null) {
            return null;
        }
        if (i instanceof C2250c) {
            return (C2250c) i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @CallSuper
    /* renamed from: d */
    public void mo24584d(@Nullable Drawable drawable) {
        super.mo24584d(drawable);
        this.f6985c.mo24599b();
        if (!this.f6987e) {
            m9375k();
        }
    }

    @CallSuper
    /* renamed from: f */
    public void mo24596f(@NonNull C2277g gVar) {
        this.f6985c.mo24601k(gVar);
    }

    /* renamed from: g */
    public void mo24585g(@Nullable C2250c cVar) {
        m9376l(cVar);
    }

    public String toString() {
        return "Target for: " + this.f6984b;
    }
}
