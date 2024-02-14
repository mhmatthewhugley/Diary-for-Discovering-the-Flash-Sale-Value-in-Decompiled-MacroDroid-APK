package p286i9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.EnumSet;
import p325m9.C15707c;
import p334n9.C15763c;

/* renamed from: i9.a */
/* compiled from: AnimatorAdapter */
public abstract class C12448a extends C12477e {

    /* renamed from: P */
    private static long f59237P = 300;

    /* renamed from: B */
    private Interpolator f59238B = new LinearInterpolator();

    /* renamed from: C */
    private C12450b f59239C;

    /* renamed from: D */
    private boolean f59240D = true;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final SparseArray<Animator> f59241E = new SparseArray<>();

    /* renamed from: F */
    private int f59242F = -1;

    /* renamed from: G */
    private int f59243G = -1;

    /* renamed from: H */
    private EnumSet<C12452c> f59244H = EnumSet.noneOf(C12452c.class);

    /* renamed from: I */
    private boolean f59245I = false;

    /* renamed from: J */
    private boolean f59246J = false;

    /* renamed from: K */
    private boolean f59247K = false;

    /* renamed from: L */
    private boolean f59248L = false;

    /* renamed from: M */
    private long f59249M = 0;

    /* renamed from: N */
    private long f59250N = 100;

    /* renamed from: O */
    private long f59251O = f59237P;

    /* renamed from: i9.a$b */
    /* compiled from: AnimatorAdapter */
    private class C12450b extends RecyclerView.AdapterDataObserver {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f59252a;

        /* renamed from: b */
        private Handler f59253b;

        /* renamed from: i9.a$b$a */
        /* compiled from: AnimatorAdapter */
        class C12451a implements Handler.Callback {
            C12451a() {
            }

            public boolean handleMessage(Message message) {
                boolean unused = C12450b.this.f59252a = false;
                return true;
            }
        }

        private C12450b() {
            this.f59253b = new Handler(Looper.getMainLooper(), new C12451a());
        }

        /* renamed from: d */
        private void m83400d() {
            this.f59252a = true;
        }

        /* renamed from: b */
        public void mo68836b() {
            if (this.f59252a) {
                this.f59253b.removeCallbacksAndMessages((Object) null);
                Handler handler = this.f59253b;
                handler.sendMessageDelayed(Message.obtain(handler), 200);
            }
        }

        /* renamed from: c */
        public boolean mo68837c() {
            return this.f59252a;
        }

        public void onChanged() {
            m83400d();
        }

        public void onItemRangeChanged(int i, int i2) {
            m83400d();
        }

        public void onItemRangeInserted(int i, int i2) {
            m83400d();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            m83400d();
        }

        public void onItemRangeRemoved(int i, int i2) {
            m83400d();
        }
    }

    /* renamed from: i9.a$c */
    /* compiled from: AnimatorAdapter */
    private enum C12452c {
        ALPHA,
        SLIDE_IN_LEFT,
        SLIDE_IN_RIGHT,
        SLIDE_IN_BOTTOM,
        SLIDE_IN_TOP,
        SCALE
    }

    /* renamed from: i9.a$d */
    /* compiled from: AnimatorAdapter */
    private class C12453d implements Animator.AnimatorListener {

        /* renamed from: a */
        int f59263a;

        C12453d(int i) {
            this.f59263a = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C12448a.this.f59241E.remove(this.f59263a);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    C12448a(boolean z) {
        setHasStableIds(z);
        C15707c cVar = this.f59370a;
        cVar.mo75142c("Initialized with StableIds=" + z, new Object[0]);
        C12450b bVar = new C12450b();
        this.f59239C = bVar;
        registerAdapterDataObserver(bVar);
    }

    /* renamed from: T */
    private long m83394T(RecyclerView.ViewHolder viewHolder, int i) {
        int findFirstCompletelyVisibleItemPosition = mo68941G().findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = mo68941G().findLastCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition < 0 && i >= 0) {
            findFirstCompletelyVisibleItemPosition = i - 1;
        }
        int i2 = i - 1;
        if (i2 > findLastCompletelyVisibleItemPosition) {
            findLastCompletelyVisibleItemPosition = i2;
        }
        int i3 = findLastCompletelyVisibleItemPosition - findFirstCompletelyVisibleItemPosition;
        int i4 = this.f59243G;
        if (i4 != 0 && i3 >= i2 && ((findFirstCompletelyVisibleItemPosition <= 1 || findFirstCompletelyVisibleItemPosition > i4) && (i <= i4 || findFirstCompletelyVisibleItemPosition != -1 || this.f59375o.getChildCount() != 0))) {
            return this.f59249M + (((long) i) * this.f59250N);
        }
        long j = this.f59250N;
        if (i3 <= 1) {
            j += this.f59249M;
        } else {
            this.f59249M = 0;
        }
        int spanCount = mo68941G().getSpanCount();
        return spanCount > 1 ? this.f59249M + (this.f59250N * ((long) (i % spanCount))) : j;
    }

    /* renamed from: U */
    private void m83395U(int i) {
        Animator animator = this.f59241E.get(i);
        if (animator != null) {
            animator.end();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo68833S(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView recyclerView = this.f59375o;
        if (recyclerView != null) {
            if (this.f59243G < recyclerView.getChildCount()) {
                this.f59243G = this.f59375o.getChildCount();
            }
            boolean z = false;
            if (this.f59247K && this.f59242F >= this.f59243G) {
                this.f59246J = false;
            }
            int findLastVisibleItemPosition = mo68941G().findLastVisibleItemPosition();
            if ((this.f59246J || this.f59245I) && !this.f59377s && (viewHolder instanceof C15763c) && ((!this.f59239C.mo68837c() || mo68834V(i)) && (mo68834V(i) || ((this.f59246J && i > findLastVisibleItemPosition) || ((this.f59245I && i < findLastVisibleItemPosition) || (i == 0 && this.f59243G == 0)))))) {
                int hashCode = viewHolder.itemView.hashCode();
                m83395U(hashCode);
                ArrayList<Animator> arrayList = new ArrayList<>();
                C15763c cVar = (C15763c) viewHolder;
                if (i >= findLastVisibleItemPosition) {
                    z = true;
                }
                cVar.mo75411w(arrayList, i, z);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(this.f59238B);
                long j = this.f59251O;
                for (Animator animator : arrayList) {
                    if (animator.getDuration() != f59237P) {
                        j = animator.getDuration();
                    }
                }
                animatorSet.setDuration(j);
                animatorSet.addListener(new C12453d(hashCode));
                if (this.f59240D) {
                    animatorSet.setStartDelay(m83394T(viewHolder, i));
                }
                animatorSet.start();
                this.f59241E.put(hashCode, animatorSet);
            }
            this.f59239C.mo68836b();
            this.f59242F = i;
        }
    }

    /* renamed from: V */
    public abstract boolean mo68834V(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo68835W(boolean z) {
        this.f59248L = z;
    }
}
