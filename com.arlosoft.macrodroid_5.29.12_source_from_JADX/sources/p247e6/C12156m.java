package p247e6;

import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import p237d6.C11954a;
import p237d6.C11958d;
import p258f6.C12238b;
import p258f6.C12240d;

/* renamed from: e6.m */
/* compiled from: RecyclerViewDragDropManager */
public class C12156m {

    /* renamed from: g0 */
    public static final Interpolator f58510g0 = new C12146c();

    /* renamed from: h0 */
    public static final Interpolator f58511h0 = new DecelerateInterpolator();

    /* renamed from: A */
    private C12150g f58512A;

    /* renamed from: B */
    RecyclerView.ViewHolder f58513B;

    /* renamed from: C */
    private C12153j f58514C;

    /* renamed from: D */
    private C12151h f58515D;

    /* renamed from: E */
    private C12165n f58516E;

    /* renamed from: F */
    private NestedScrollView f58517F;

    /* renamed from: G */
    private int f58518G;

    /* renamed from: H */
    private int f58519H;

    /* renamed from: I */
    private int f58520I;

    /* renamed from: J */
    private int f58521J;

    /* renamed from: K */
    private int f58522K;

    /* renamed from: L */
    private int f58523L;

    /* renamed from: M */
    private int f58524M;

    /* renamed from: N */
    private int f58525N;

    /* renamed from: O */
    private int f58526O;

    /* renamed from: P */
    private int f58527P;

    /* renamed from: Q */
    private int f58528Q;

    /* renamed from: R */
    private int f58529R;

    /* renamed from: S */
    private int f58530S = 0;

    /* renamed from: T */
    private int f58531T;

    /* renamed from: U */
    private C12154k f58532U;

    /* renamed from: V */
    private C12154k f58533V;

    /* renamed from: W */
    private C12161e f58534W;

    /* renamed from: X */
    private C12162f f58535X;

    /* renamed from: Y */
    private boolean f58536Y;

    /* renamed from: Z */
    private boolean f58537Z;

    /* renamed from: a */
    private RecyclerView f58538a;

    /* renamed from: a0 */
    private float f58539a0 = 1.0f;

    /* renamed from: b */
    private Interpolator f58540b = f58510g0;

    /* renamed from: b0 */
    private int f58541b0 = 0;

    /* renamed from: c */
    private C12163g f58542c = new C12163g(this);

    /* renamed from: c0 */
    private Object f58543c0;

    /* renamed from: d */
    private RecyclerView.OnItemTouchListener f58544d = new C12157a();

    /* renamed from: d0 */
    private C12164h f58545d0 = new C12164h();

    /* renamed from: e */
    private RecyclerView.OnScrollListener f58546e = new C12158b();

    /* renamed from: e0 */
    private C12160d f58547e0 = new C12160d();

    /* renamed from: f */
    private C12145b f58548f;

    /* renamed from: f0 */
    private final Runnable f58549f0 = new C12159c();

    /* renamed from: g */
    private NinePatchDrawable f58550g;

    /* renamed from: h */
    private float f58551h;

    /* renamed from: i */
    private int f58552i;

    /* renamed from: j */
    private int f58553j;

    /* renamed from: k */
    private int f58554k;

    /* renamed from: l */
    private int f58555l;

    /* renamed from: m */
    private long f58556m = -1;

    /* renamed from: n */
    private boolean f58557n;

    /* renamed from: o */
    private boolean f58558o;

    /* renamed from: p */
    private boolean f58559p = true;

    /* renamed from: q */
    private int f58560q = ViewConfiguration.getLongPressTimeout();

    /* renamed from: r */
    private boolean f58561r;

    /* renamed from: s */
    private boolean f58562s;

    /* renamed from: t */
    private int f58563t;

    /* renamed from: u */
    private int f58564u;

    /* renamed from: v */
    private final Rect f58565v = new Rect();

    /* renamed from: w */
    private int f58566w = 200;

    /* renamed from: x */
    private Interpolator f58567x = f58511h0;

    /* renamed from: y */
    private int f58568y = 0;

    /* renamed from: z */
    private C12152i f58569z = new C12152i();

    /* renamed from: e6.m$a */
    /* compiled from: RecyclerViewDragDropManager */
    class C12157a implements RecyclerView.OnItemTouchListener {
        C12157a() {
        }

        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return C12156m.this.mo68405K(recyclerView, motionEvent);
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            C12156m.this.mo68408O(z);
        }

        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            C12156m.this.mo68411R(recyclerView, motionEvent);
        }
    }

    /* renamed from: e6.m$b */
    /* compiled from: RecyclerViewDragDropManager */
    class C12158b extends RecyclerView.OnScrollListener {
        C12158b() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            C12156m.this.mo68409P(recyclerView, i);
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            C12156m.this.mo68410Q(recyclerView, i, i2);
        }
    }

    /* renamed from: e6.m$c */
    /* compiled from: RecyclerViewDragDropManager */
    class C12159c implements Runnable {
        C12159c() {
        }

        public void run() {
            C12156m mVar = C12156m.this;
            if (mVar.f58513B != null) {
                mVar.mo68421f(mVar.mo68424v());
            }
        }
    }

    /* renamed from: e6.m$d */
    /* compiled from: RecyclerViewDragDropManager */
    static class C12160d {

        /* renamed from: a */
        public RecyclerView f58573a;

        /* renamed from: b */
        public C12153j f58574b;

        /* renamed from: c */
        public RecyclerView.ViewHolder f58575c;

        /* renamed from: d */
        public int f58576d;

        /* renamed from: e */
        public int f58577e;

        /* renamed from: f */
        public int f58578f;

        /* renamed from: g */
        public int f58579g;

        /* renamed from: h */
        public int f58580h;

        /* renamed from: i */
        public int f58581i;

        /* renamed from: j */
        public int f58582j;

        /* renamed from: k */
        public boolean f58583k;

        /* renamed from: l */
        public C12154k f58584l;

        /* renamed from: m */
        public C12154k f58585m;

        /* renamed from: n */
        public boolean f58586n;

        C12160d() {
        }

        /* renamed from: a */
        public void mo68426a() {
            this.f58573a = null;
            this.f58574b = null;
            this.f58575c = null;
        }

        /* renamed from: b */
        public void mo68427b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, C12153j jVar, int i, int i2, C12154k kVar, C12154k kVar2, boolean z) {
            this.f58573a = recyclerView;
            this.f58574b = jVar;
            this.f58575c = viewHolder;
            this.f58576d = i;
            this.f58577e = i2;
            this.f58584l = kVar;
            this.f58585m = kVar2;
            this.f58586n = z;
            int p = C12238b.m82896p(recyclerView);
            this.f58582j = p;
            boolean z2 = true;
            if (C12238b.m82881a(p) != 1) {
                z2 = false;
            }
            this.f58583k = z2;
            int i3 = i - jVar.f58504f;
            this.f58580h = i3;
            this.f58578f = i3;
            int i4 = i2 - jVar.f58505g;
            this.f58581i = i4;
            this.f58579g = i4;
            if (z2) {
                int max = Math.max(i3, recyclerView.getPaddingLeft());
                this.f58578f = max;
                this.f58578f = Math.min(max, Math.max(0, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f58574b.f58499a));
                return;
            }
            int max2 = Math.max(i4, recyclerView.getPaddingTop());
            this.f58579g = max2;
            this.f58579g = Math.min(max2, Math.max(0, (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - this.f58574b.f58500b));
        }
    }

    /* renamed from: e6.m$e */
    /* compiled from: RecyclerViewDragDropManager */
    private static class C12161e extends Handler {

        /* renamed from: a */
        private C12156m f58587a;

        /* renamed from: b */
        private MotionEvent f58588b;

        public C12161e(C12156m mVar) {
            this.f58587a = mVar;
        }

        /* renamed from: a */
        public void mo68428a() {
            removeMessages(1);
            MotionEvent motionEvent = this.f58588b;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.f58588b = null;
            }
        }

        /* renamed from: b */
        public boolean mo68429b() {
            return hasMessages(2);
        }

        /* renamed from: c */
        public void mo68430c() {
            removeMessages(2);
        }

        /* renamed from: d */
        public void mo68431d() {
            removeMessages(3);
        }

        /* renamed from: e */
        public void mo68432e() {
            if (!mo68429b()) {
                sendEmptyMessage(2);
            }
        }

        /* renamed from: f */
        public void mo68433f() {
            sendEmptyMessage(3);
        }

        /* renamed from: g */
        public void mo68434g(MotionEvent motionEvent, int i) {
            mo68428a();
            this.f58588b = MotionEvent.obtain(motionEvent);
            sendEmptyMessageAtTime(1, motionEvent.getDownTime() + ((long) i));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                this.f58587a.mo68401C(this.f58588b);
            } else if (i == 2) {
                this.f58587a.mo68418d(true);
            } else if (i == 3) {
                this.f58587a.mo68400B();
            }
        }
    }

    /* renamed from: e6.m$f */
    /* compiled from: RecyclerViewDragDropManager */
    public interface C12162f {
        /* renamed from: a */
        void mo29260a(int i, int i2);

        /* renamed from: b */
        void mo29261b(int i);

        /* renamed from: c */
        void mo29262c(int i, int i2, boolean z);

        /* renamed from: d */
        void mo29263d(int i, int i2);
    }

    /* renamed from: e6.m$g */
    /* compiled from: RecyclerViewDragDropManager */
    private static class C12163g implements Runnable {

        /* renamed from: a */
        private final WeakReference<C12156m> f58589a;

        /* renamed from: c */
        private boolean f58590c;

        public C12163g(C12156m mVar) {
            this.f58589a = new WeakReference<>(mVar);
        }

        /* renamed from: a */
        public void mo68436a() {
            C12156m mVar;
            RecyclerView v;
            if (!this.f58590c && (mVar = (C12156m) this.f58589a.get()) != null && (v = mVar.mo68424v()) != null) {
                ViewCompat.postOnAnimation(v, this);
                this.f58590c = true;
            }
        }

        /* renamed from: b */
        public void mo68437b() {
            if (this.f58590c) {
                this.f58590c = false;
            }
        }

        public void run() {
            C12156m mVar = (C12156m) this.f58589a.get();
            if (mVar != null && this.f58590c) {
                mVar.mo68402D();
                RecyclerView v = mVar.mo68424v();
                if (v == null || !this.f58590c) {
                    this.f58590c = false;
                } else {
                    ViewCompat.postOnAnimation(v, this);
                }
            }
        }
    }

    /* renamed from: e6.m$h */
    /* compiled from: RecyclerViewDragDropManager */
    static class C12164h {

        /* renamed from: a */
        public RecyclerView.ViewHolder f58591a;

        /* renamed from: b */
        public int f58592b;

        /* renamed from: c */
        public boolean f58593c;

        C12164h() {
        }

        /* renamed from: a */
        public void mo68439a() {
            this.f58591a = null;
            this.f58592b = -1;
            this.f58593c = false;
        }
    }

    /* renamed from: A */
    private boolean m82717A(int i, boolean z) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        boolean G = mo68403G();
        C12161e eVar = this.f58534W;
        if (eVar != null) {
            eVar.mo68428a();
        }
        this.f58554k = 0;
        this.f58555l = 0;
        this.f58520I = 0;
        this.f58521J = 0;
        this.f58522K = 0;
        this.f58523L = 0;
        this.f58524M = 0;
        this.f58525N = 0;
        this.f58526O = 0;
        this.f58527P = 0;
        this.f58528Q = 0;
        this.f58529R = 0;
        this.f58556m = -1;
        this.f58536Y = false;
        this.f58537Z = false;
        if (z && mo68403G()) {
            m82749q(z2);
        }
        return G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        if (((r9 ? 8 : 2) & r4) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (((r9 ? 4 : 1) & r4) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m82718E(androidx.recyclerview.widget.RecyclerView r8, boolean r9) {
        /*
            r7 = this;
            androidx.core.widget.NestedScrollView r0 = r7.f58517F
            int r1 = r0.getScrollX()
            int r2 = r0.getScrollY()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r4 = r7.m82751t()
            r3.right = r4
            r3.left = r4
            int r4 = r7.m82752u()
            r3.bottom = r4
            r3.top = r4
            androidx.recyclerview.widget.RecyclerView r4 = r7.f58538a
            m82720I(r4, r0, r3)
            int r4 = r3.left
            int r4 = r4 - r1
            int r1 = r3.top
            int r1 = r1 - r2
            if (r9 == 0) goto L_0x0031
            int r2 = r0.getWidth()
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getHeight()
        L_0x0035:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            if (r9 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r4 = r1
        L_0x003d:
            float r1 = (float) r4
            float r1 = r1 * r3
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 - r2
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r5 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r2 - r3
            float r5 = r5 - r3
            float r3 = java.lang.Math.max(r4, r5)
            r4 = 1079334229(0x40555555, float:3.3333333)
            float r3 = r3 * r4
            int r4 = r7.f58530S
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r5 = 1103626240(0x41c80000, float:25.0)
            float r6 = r7.f58539a0
            float r6 = r6 * r5
            float r5 = r7.f58551h
            float r6 = r6 * r5
            float r6 = r6 * r3
            float r6 = r6 + r2
            int r2 = (int) r6
            int r1 = r1 * r2
            r2 = 0
            if (r1 <= 0) goto L_0x007c
            if (r9 == 0) goto L_0x0076
            r3 = 8
            goto L_0x0077
        L_0x0076:
            r3 = 2
        L_0x0077:
            r3 = r3 & r4
            if (r3 != 0) goto L_0x0087
        L_0x007a:
            r1 = 0
            goto L_0x0087
        L_0x007c:
            if (r1 >= 0) goto L_0x0087
            if (r9 == 0) goto L_0x0082
            r3 = 4
            goto L_0x0083
        L_0x0082:
            r3 = 1
        L_0x0083:
            r3 = r3 & r4
            if (r3 != 0) goto L_0x0087
            goto L_0x007a
        L_0x0087:
            if (r1 == 0) goto L_0x0095
            r7.m82726V(r8)
            if (r9 == 0) goto L_0x0092
            r0.scrollBy(r1, r2)
            goto L_0x0095
        L_0x0092:
            r0.scrollBy(r2, r1)
        L_0x0095:
            e6.h r9 = r7.f58515D
            int r0 = r7.m82751t()
            int r1 = r7.m82752u()
            boolean r9 = r9.mo68378F(r0, r1, r2)
            if (r9 == 0) goto L_0x00be
            e6.n r9 = r7.f58516E
            if (r9 == 0) goto L_0x00b8
            e6.h r0 = r7.f58515D
            int r0 = r0.mo68383n()
            e6.h r1 = r7.f58515D
            int r1 = r1.mo68384o()
            r9.mo68445n(r0, r1)
        L_0x00b8:
            r7.mo68421f(r8)
            r7.m82722L()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p247e6.C12156m.m82718E(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if ((r7 & (r19 ? 8 : 2)) == 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        if ((r7 & (r19 ? 4 : 1)) == 0) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m82719F(androidx.recyclerview.widget.RecyclerView r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            if (r19 == 0) goto L_0x0009
            int r1 = r18.getWidth()
            goto L_0x000d
        L_0x0009:
            int r1 = r18.getHeight()
        L_0x000d:
            if (r1 != 0) goto L_0x0010
            return
        L_0x0010:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = (float) r1
            float r2 = r2 / r3
            if (r19 == 0) goto L_0x001b
            int r3 = r17.m82751t()
            goto L_0x001f
        L_0x001b:
            int r3 = r17.m82752u()
        L_0x001f:
            float r3 = (float) r3
            float r3 = r3 * r2
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r4
            float r5 = java.lang.Math.abs(r3)
            r6 = 1050253722(0x3e99999a, float:0.3)
            float r5 = r4 - r5
            float r6 = r6 - r5
            r5 = 0
            float r6 = java.lang.Math.max(r5, r6)
            r7 = 1079334229(0x40555555, float:3.3333333)
            float r6 = r6 * r7
            int r7 = r0.f58530S
            e6.h r8 = r0.f58515D
            float r3 = java.lang.Math.signum(r3)
            int r3 = (int) r3
            r9 = 1103626240(0x41c80000, float:25.0)
            float r10 = r0.f58539a0
            float r10 = r10 * r9
            float r9 = r0.f58551h
            float r10 = r10 * r9
            float r10 = r10 * r6
            float r10 = r10 + r4
            int r6 = (int) r10
            int r3 = r3 * r6
            e6.k r6 = r0.f58533V
            androidx.recyclerview.widget.RecyclerView r9 = r0.f58538a
            int r9 = p258f6.C12238b.m82884d(r9)
            androidx.recyclerview.widget.RecyclerView r10 = r0.f58538a
            int r10 = p258f6.C12238b.m82887g(r10)
            r11 = -1
            r12 = 0
            r13 = 1
            if (r9 == r11) goto L_0x0077
            int r14 = r6.mo68398d()
            if (r9 > r14) goto L_0x006d
            r14 = 1
            goto L_0x006e
        L_0x006d:
            r14 = 0
        L_0x006e:
            int r15 = r6.mo68398d()
            int r15 = r15 - r13
            if (r9 > r15) goto L_0x0078
            r15 = 1
            goto L_0x0079
        L_0x0077:
            r14 = 0
        L_0x0078:
            r15 = 0
        L_0x0079:
            if (r10 == r11) goto L_0x008f
            int r11 = r6.mo68397c()
            if (r10 < r11) goto L_0x0083
            r11 = 1
            goto L_0x0084
        L_0x0083:
            r11 = 0
        L_0x0084:
            int r6 = r6.mo68397c()
            int r6 = r6 + r13
            if (r10 < r6) goto L_0x008d
            r6 = 1
            goto L_0x0091
        L_0x008d:
            r6 = 0
            goto L_0x0091
        L_0x008f:
            r6 = 0
            r11 = 0
        L_0x0091:
            r5 = 2
            if (r3 <= 0) goto L_0x00a1
            if (r19 == 0) goto L_0x0099
            r16 = 8
            goto L_0x009b
        L_0x0099:
            r16 = 2
        L_0x009b:
            r7 = r7 & r16
            if (r7 != 0) goto L_0x00af
        L_0x009f:
            r3 = 0
            goto L_0x00af
        L_0x00a1:
            if (r3 >= 0) goto L_0x00af
            if (r19 == 0) goto L_0x00a8
            r16 = 4
            goto L_0x00aa
        L_0x00a8:
            r16 = 1
        L_0x00aa:
            r7 = r7 & r16
            if (r7 != 0) goto L_0x00af
            goto L_0x009f
        L_0x00af:
            if (r15 != 0) goto L_0x00b3
            if (r3 < 0) goto L_0x00b7
        L_0x00b3:
            if (r6 != 0) goto L_0x00e5
            if (r3 <= 0) goto L_0x00e5
        L_0x00b7:
            r17.m82726V(r18)
            if (r19 == 0) goto L_0x00c1
            int r6 = r0.m82728X(r3)
            goto L_0x00c5
        L_0x00c1:
            int r6 = r0.m82729Y(r3)
        L_0x00c5:
            if (r3 >= 0) goto L_0x00cd
            r7 = r14 ^ 1
            r8.mo68374B(r7)
            goto L_0x00d2
        L_0x00cd:
            r7 = r11 ^ 1
            r8.mo68374B(r7)
        L_0x00d2:
            r8.mo68394z(r13)
            e6.n r7 = r0.f58516E
            if (r7 == 0) goto L_0x00e9
            int r11 = r8.mo68383n()
            int r14 = r8.mo68384o()
            r7.mo68445n(r11, r14)
            goto L_0x00e9
        L_0x00e5:
            r8.mo68374B(r12)
            r6 = 0
        L_0x00e9:
            e6.b r7 = r0.f58548f
            if (r7 == 0) goto L_0x0160
            int r7 = r0.f58531T
            if (r7 == r5) goto L_0x015b
            if (r6 == 0) goto L_0x00f4
            r12 = 1
        L_0x00f4:
            if (r19 == 0) goto L_0x00fb
            int r7 = r8.mo68386r()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r8.mo68388t()
        L_0x00ff:
            if (r19 == 0) goto L_0x0106
            int r11 = r8.mo68387s()
            goto L_0x010a
        L_0x0106:
            int r11 = r8.mo68385q()
        L_0x010a:
            int r13 = r7 + r11
            int r13 = r13 / r5
            if (r9 != 0) goto L_0x0116
            if (r10 != 0) goto L_0x0116
            if (r3 >= 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r7 = r11
            goto L_0x0119
        L_0x0116:
            int r1 = r1 / r5
            if (r13 >= r1) goto L_0x0114
        L_0x0119:
            float r1 = (float) r7
            float r1 = r1 * r2
            float r1 = r1 - r4
            float r2 = java.lang.Math.abs(r1)
            r4 = 1053609165(0x3ecccccd, float:0.4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x015b
            if (r3 == 0) goto L_0x015b
            if (r12 != 0) goto L_0x015b
            r2 = 1000593162(0x3ba3d70a, float:0.005)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0147
            if (r19 == 0) goto L_0x013d
            boolean r1 = r8.mo68391w()
            if (r1 == 0) goto L_0x015c
            goto L_0x0143
        L_0x013d:
            boolean r1 = r8.mo68393y()
            if (r1 == 0) goto L_0x015c
        L_0x0143:
            float r1 = r0.f58551h
            float r1 = -r1
            goto L_0x0158
        L_0x0147:
            if (r19 == 0) goto L_0x0150
            boolean r1 = r8.mo68392x()
            if (r1 == 0) goto L_0x015c
            goto L_0x0156
        L_0x0150:
            boolean r1 = r8.mo68390v()
            if (r1 == 0) goto L_0x015c
        L_0x0156:
            float r1 = r0.f58551h
        L_0x0158:
            float r5 = r1 * r2
            goto L_0x015d
        L_0x015b:
            r3 = 0
        L_0x015c:
            r5 = 0
        L_0x015d:
            r0.m82743l0(r5)
        L_0x0160:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f58538a
            java.lang.Runnable r2 = r0.f58549f0
            androidx.core.view.ViewCompat.postOnAnimation(r1, r2)
            if (r6 == 0) goto L_0x0179
            if (r19 == 0) goto L_0x0171
            int r1 = r0.f58528Q
            int r1 = r1 + r6
            r0.f58528Q = r1
            goto L_0x0176
        L_0x0171:
            int r1 = r0.f58529R
            int r1 = r1 + r6
            r0.f58529R = r1
        L_0x0176:
            r17.m82722L()
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p247e6.C12156m.m82719F(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    /* renamed from: I */
    private static boolean m82720I(View view, View view2, Rect rect) {
        ViewParent parent;
        do {
            parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ((ViewGroup) parent).offsetDescendantRectToMyCoords(view, rect);
            view = (View) parent;
        } while (parent != view2);
        return true;
    }

    /* renamed from: J */
    private void m82721J() {
        Log.i("ARVDragDropManager", "a view holder object which is bound to currently dragging item is recycled");
        this.f58513B = null;
        this.f58515D.mo68389u();
    }

    /* renamed from: L */
    private void m82722L() {
        if (this.f58535X != null) {
            this.f58535X.mo29260a(this.f58528Q + this.f58515D.mo68381l(), this.f58529R + this.f58515D.mo68382m());
        }
    }

    /* renamed from: S */
    private void m82723S(RecyclerView recyclerView, @Nullable RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2, Rect rect, int i, int i2) {
        int i3;
        int i4;
        C12162f fVar = this.f58535X;
        if (fVar != null) {
            fVar.mo29263d(i, i2);
        }
        RecyclerView.LayoutManager layoutManager = this.f58538a.getLayoutManager();
        int p = C12238b.m82896p(this.f58538a);
        boolean z = true;
        if (C12238b.m82881a(p) != 1) {
            z = false;
        }
        int e = C12238b.m82885e(this.f58538a, false);
        View view = viewHolder != null ? viewHolder.itemView : null;
        View view2 = viewHolder2.itemView;
        View k = C12238b.m82891k(layoutManager, e);
        int layoutPosition = viewHolder != null ? viewHolder.getLayoutPosition() : -1;
        int layoutPosition2 = viewHolder2.getLayoutPosition();
        Integer s = m82750s(view, z);
        Integer s2 = m82750s(view2, z);
        Integer s3 = m82750s(k, z);
        this.f58512A.mo68369R(i, i2, p);
        if (e == layoutPosition && s3 != null && s2 != null) {
            m82727W(recyclerView, -(s2.intValue() - s3.intValue()), z);
            m82725U(recyclerView);
        } else if (e == layoutPosition2 && view != null && s != null && !s.equals(s2)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (z) {
                i3 = layoutManager.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin;
                i4 = marginLayoutParams.bottomMargin;
            } else {
                i3 = layoutManager.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin;
                i4 = marginLayoutParams.rightMargin;
            }
            m82727W(recyclerView, -(i3 + i4), z);
            m82725U(recyclerView);
        }
    }

    /* renamed from: T */
    private static void m82724T(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ItemAnimator itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            itemAnimator.endAnimation(viewHolder);
        }
    }

    /* renamed from: U */
    private static void m82725U(RecyclerView recyclerView) {
        RecyclerView.ItemAnimator itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
    }

    /* renamed from: V */
    private void m82726V(RecyclerView recyclerView) {
        if (this.f58516E != null) {
            m82725U(recyclerView);
        }
    }

    /* renamed from: W */
    private static void m82727W(RecyclerView recyclerView, int i, boolean z) {
        if (z) {
            recyclerView.scrollBy(0, i);
        } else {
            recyclerView.scrollBy(i, 0);
        }
    }

    /* renamed from: X */
    private int m82728X(int i) {
        this.f58563t = 0;
        this.f58562s = true;
        this.f58538a.scrollBy(i, 0);
        this.f58562s = false;
        return this.f58563t;
    }

    /* renamed from: Y */
    private int m82729Y(int i) {
        this.f58564u = 0;
        this.f58562s = true;
        this.f58538a.scrollBy(0, i);
        this.f58562s = false;
        return this.f58564u;
    }

    /* renamed from: b */
    private boolean m82730b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int b = C12240d.m82907b(this.f58538a.getAdapter(), this.f58512A, (Object) null, adapterPosition);
        if (b == -1) {
            return false;
        }
        View view = viewHolder.itemView;
        int translationY = (int) (view.getTranslationY() + 0.5f);
        int left = view.getLeft();
        int top = i2 - (view.getTop() + translationY);
        if (!this.f58512A.mo68364K(viewHolder, b, i - (left + ((int) (view.getTranslationX() + 0.5f))), top) || viewHolder.getAdapterPosition() != adapterPosition) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m82731e(RecyclerView recyclerView, MotionEvent motionEvent, boolean z) {
        RecyclerView.ViewHolder b;
        if (this.f58514C != null) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        this.f58520I = x;
        this.f58521J = y;
        if (this.f58556m == -1) {
            return false;
        }
        if ((z && ((!this.f58536Y || Math.abs(x - this.f58554k) <= this.f58552i) && (!this.f58537Z || Math.abs(y - this.f58555l) <= this.f58552i))) || (b = C12238b.m82882b(recyclerView, (float) this.f58554k, (float) this.f58555l)) == null || !m82730b(b, x, y)) {
            return false;
        }
        RecyclerView.Adapter adapter = this.f58538a.getAdapter();
        C11954a aVar = new C11954a();
        int c = C12240d.m82908c(adapter, this.f58512A, (Object) null, b.getAdapterPosition(), aVar);
        C12154k P = this.f58512A.mo68367P(b, c);
        if (P == null) {
            P = new C12154k(0, Math.max(0, this.f58512A.getItemCount() - 1));
        }
        C12154k kVar = P;
        m82745m0(kVar, c);
        m82732f0(recyclerView, motionEvent, b, kVar, aVar, c, aVar.mo67348e().f58145b);
        return true;
    }

    /* renamed from: f0 */
    private void m82732f0(RecyclerView recyclerView, MotionEvent motionEvent, RecyclerView.ViewHolder viewHolder, C12154k kVar, C11954a aVar, int i, Object obj) {
        m82724T(recyclerView, viewHolder);
        this.f58534W.mo68428a();
        this.f58514C = new C12153j(recyclerView, viewHolder, this.f58520I, this.f58521J);
        this.f58513B = viewHolder;
        this.f58532U = kVar;
        this.f58533V = m82735h(aVar, kVar);
        NestedScrollView j = m82738j(this.f58538a);
        if (j == null || this.f58538a.isNestedScrollingEnabled()) {
            this.f58517F = null;
        } else {
            this.f58517F = j;
        }
        this.f58531T = recyclerView.getOverScrollMode();
        recyclerView.setOverScrollMode(2);
        this.f58520I = (int) (motionEvent.getX() + 0.5f);
        this.f58521J = (int) (motionEvent.getY() + 0.5f);
        NestedScrollView nestedScrollView = this.f58517F;
        this.f58518G = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
        NestedScrollView nestedScrollView2 = this.f58517F;
        this.f58519H = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
        int i2 = this.f58521J;
        this.f58527P = i2;
        this.f58525N = i2;
        this.f58523L = i2;
        int i3 = this.f58520I;
        this.f58526O = i3;
        this.f58524M = i3;
        this.f58522K = i3;
        this.f58530S = 0;
        this.f58541b0 = this.f58568y;
        this.f58543c0 = obj;
        this.f58538a.getParent().requestDisallowInterceptTouchEvent(true);
        m82734g0();
        this.f58512A.mo68372W(this.f58514C, viewHolder, this.f58532U, i, this.f58541b0);
        this.f58512A.onBindViewHolder(viewHolder, i);
        C12151h hVar = new C12151h(this.f58538a, viewHolder, this.f58533V);
        this.f58515D = hVar;
        hVar.mo68375C(this.f58550g);
        this.f58515D.mo68376D(this.f58569z);
        this.f58515D.mo68377E(this.f58514C, this.f58520I, this.f58521J);
        int p = C12238b.m82896p(this.f58538a);
        if (!this.f58561r && C12238b.m82901u(p)) {
            C12165n nVar = new C12165n(this.f58538a, viewHolder, this.f58514C);
            this.f58516E = nVar;
            nVar.mo68443l(this.f58540b);
            this.f58516E.mo68444m();
            this.f58516E.mo68445n(this.f58515D.mo68383n(), this.f58515D.mo68384o());
        }
        C12145b bVar = this.f58548f;
        if (bVar != null) {
            bVar.mo68356i();
        }
        this.f58512A.mo68371T();
        C12162f fVar = this.f58535X;
        if (fVar != null) {
            fVar.mo29261b(this.f58512A.mo68366O());
            this.f58535X.mo29260a(0, 0);
        }
    }

    /* renamed from: g */
    private boolean m82733g(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof C12149f)) {
            return false;
        }
        int w = m82753w(viewHolder);
        C12150g gVar = this.f58512A;
        if (w < 0 || w >= gVar.getItemCount()) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    private void m82734g0() {
        this.f58542c.mo68436a();
    }

    /* renamed from: h */
    private C12154k m82735h(C11954a aVar, C12154k kVar) {
        RecyclerView.Adapter adapter = this.f58538a.getAdapter();
        return new C12154k(C12240d.m82910e(aVar, this.f58512A, adapter, kVar.mo68398d()), C12240d.m82910e(aVar, this.f58512A, adapter, kVar.mo68397c()));
    }

    /* renamed from: h0 */
    private void m82736h0() {
        C12163g gVar = this.f58542c;
        if (gVar != null) {
            gVar.mo68437b();
        }
    }

    /* renamed from: i0 */
    private static boolean m82737i0() {
        return true;
    }

    /* renamed from: j */
    private static NestedScrollView m82738j(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof NestedScrollView) {
                return (NestedScrollView) parent;
            }
        }
        return null;
    }

    /* renamed from: j0 */
    private void m82739j0(RecyclerView recyclerView, int i, @Nullable RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        int i2 = i;
        RecyclerView.ViewHolder viewHolder3 = viewHolder;
        RecyclerView.ViewHolder viewHolder4 = viewHolder2;
        Rect n = C12238b.m82894n(viewHolder4.itemView, this.f58565v);
        int w = m82753w(viewHolder4);
        int abs = Math.abs(i2 - w);
        if (i2 != -1 && w != -1 && C11958d.m82305a(this.f58512A.getItemId(i2)) == C11958d.m82305a(this.f58514C.f58501c)) {
            boolean z = false;
            boolean z2 = C12238b.m82901u(C12238b.m82896p(recyclerView)) && !this.f58561r;
            if (abs != 0) {
                if (abs == 1 && viewHolder3 != null && z2) {
                    View view = viewHolder3.itemView;
                    View view2 = viewHolder4.itemView;
                    Rect rect = this.f58514C.f58506h;
                    if (this.f58536Y) {
                        int min = Math.min(view.getLeft() - rect.left, view2.getLeft() - n.left);
                        float max = ((float) min) + (((float) (Math.max(view.getRight() + rect.right, view2.getRight() + n.right) - min)) * 0.5f);
                        int t = m82751t();
                        C12153j jVar = this.f58514C;
                        float f = ((float) (t - jVar.f58504f)) + (((float) jVar.f58499a) * 0.5f);
                        if (w >= i2 ? f > max : f < max) {
                            z = true;
                        }
                    }
                    if (!z && this.f58537Z) {
                        int min2 = Math.min(view.getTop() - rect.top, view2.getTop() - n.top);
                        float max2 = ((float) min2) + (((float) (Math.max(view.getBottom() + rect.bottom, view2.getBottom() + n.bottom) - min2)) * 0.5f);
                        int u = m82752u();
                        C12153j jVar2 = this.f58514C;
                        float f2 = ((float) (u - jVar2.f58505g)) + (((float) jVar2.f58500b) * 0.5f);
                        if (w >= i2) {
                        }
                    }
                }
                z = true;
            }
            if (z) {
                m82723S(recyclerView, viewHolder, viewHolder2, n, i, w);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p247e6.C12156m.C12164h m82740k(p247e6.C12156m.C12164h r9, p247e6.C12156m.C12160d r10, boolean r11) {
        /*
            r8 = this;
            r9.mo68439a()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r10.f58575c
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r8.m82753w(r0)
            if (r0 == r1) goto L_0x0030
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r10.f58575c
            long r4 = r0.getItemId()
            e6.j r0 = r10.f58574b
            long r6 = r0.f58501c
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
        L_0x001e:
            int r0 = r10.f58582j
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x003c
            r4 = 2
            if (r0 == r4) goto L_0x0037
            r4 = 3
            if (r0 == r4) goto L_0x0037
            r4 = 4
            if (r0 == r4) goto L_0x0032
            r4 = 5
            if (r0 == r4) goto L_0x0032
        L_0x0030:
            r11 = r3
            goto L_0x0040
        L_0x0032:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = m82748p(r10, r11)
            goto L_0x0040
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = m82742l(r10, r11)
            goto L_0x0040
        L_0x003c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = m82747o(r10, r11)
        L_0x0040:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r10.f58575c
            if (r11 != r0) goto L_0x0047
            r9.f58593c = r2
            r11 = r3
        L_0x0047:
            int r0 = r8.m82753w(r11)
            if (r11 == 0) goto L_0x0058
            e6.k r10 = r10.f58584l
            if (r10 == 0) goto L_0x0058
            boolean r10 = r10.mo68395a(r0)
            if (r10 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = r11
        L_0x0059:
            r9.f58591a = r3
            if (r3 == 0) goto L_0x005e
            r1 = r0
        L_0x005e:
            r9.f58592b = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p247e6.C12156m.m82740k(e6.m$h, e6.m$d, boolean):e6.m$h");
    }

    /* renamed from: k0 */
    private void m82741k0() {
        int r = C12238b.m82898r(this.f58538a);
        if (r == 0) {
            int t = m82751t();
            int i = this.f58522K;
            int i2 = this.f58524M;
            int i3 = i - i2;
            int i4 = this.f58553j;
            if (i3 > i4 || this.f58526O - t > i4) {
                this.f58530S |= 4;
            }
            if (this.f58526O - i > i4 || t - i2 > i4) {
                this.f58530S |= 8;
            }
        } else if (r == 1) {
            int u = m82752u();
            int i5 = this.f58523L;
            int i6 = this.f58525N;
            int i7 = i5 - i6;
            int i8 = this.f58553j;
            if (i7 > i8 || this.f58527P - u > i8) {
                this.f58530S = 1 | this.f58530S;
            }
            if (this.f58527P - i5 > i8 || u - i6 > i8) {
                this.f58530S |= 2;
            }
        }
    }

    /* renamed from: l */
    private static RecyclerView.ViewHolder m82742l(C12160d dVar, boolean z) {
        if (z) {
            return null;
        }
        RecyclerView.ViewHolder m = m82744m(dVar);
        return m == null ? m82746n(dVar) : m;
    }

    /* renamed from: l0 */
    private void m82743l0(float f) {
        if (f == 0.0f) {
            this.f58548f.mo68355h();
        } else if (f < 0.0f) {
            this.f58548f.mo68353f(f);
        } else {
            this.f58548f.mo68354g(f);
        }
    }

    /* renamed from: m */
    private static RecyclerView.ViewHolder m82744m(C12160d dVar) {
        return C12238b.m82882b(dVar.f58573a, (float) dVar.f58576d, (float) dVar.f58577e);
    }

    /* renamed from: m0 */
    private void m82745m0(C12154k kVar, int i) {
        int max = Math.max(0, this.f58512A.getItemCount() - 1);
        if (kVar.mo68398d() > kVar.mo68397c()) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- start > wrappedAdapterRange (wrappedAdapterRange = " + kVar + ")");
        } else if (kVar.mo68398d() < 0) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- start < 0 (wrappedAdapterRange = " + kVar + ")");
        } else if (kVar.mo68397c() > max) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- end >= count (wrappedAdapterRange = " + kVar + ")");
        } else if (!kVar.mo68395a(i)) {
            throw new IllegalStateException("Invalid wrappedAdapterRange specified --- does not contain drag target item (wrappedAdapterRange = " + kVar + ", position = " + i + ")");
        }
    }

    /* renamed from: n */
    private static RecyclerView.ViewHolder m82746n(C12160d dVar) {
        float f;
        float f2;
        int s = C12238b.m82899s(dVar.f58573a);
        int height = dVar.f58573a.getHeight();
        int width = dVar.f58573a.getWidth();
        int paddingLeft = dVar.f58583k ? dVar.f58573a.getPaddingLeft() : 0;
        int paddingTop = !dVar.f58583k ? dVar.f58573a.getPaddingTop() : 0;
        int paddingRight = ((width - paddingLeft) - (dVar.f58583k ? dVar.f58573a.getPaddingRight() : 0)) / s;
        int paddingBottom = ((height - paddingTop) - (!dVar.f58583k ? dVar.f58573a.getPaddingBottom() : 0)) / s;
        int i = dVar.f58576d;
        int i2 = dVar.f58577e;
        int d = dVar.f58585m.mo68398d();
        int c = dVar.f58585m.mo68397c();
        if (dVar.f58583k) {
            f2 = (float) (i - paddingLeft);
            f = (float) paddingRight;
        } else {
            f2 = (float) (i2 - paddingTop);
            f = (float) paddingBottom;
        }
        for (int min = Math.min(Math.max((int) (f2 / f), 0), s - 1); min >= 0; min--) {
            boolean z = dVar.f58583k;
            RecyclerView.ViewHolder b = C12238b.m82882b(dVar.f58573a, (float) (z ? (paddingRight * min) + paddingLeft + (paddingRight / 2) : i), (float) (!z ? (paddingBottom * min) + paddingTop + (paddingBottom / 2) : i2));
            if (b != null) {
                int adapterPosition = b.getAdapterPosition();
                if (adapterPosition == -1 || adapterPosition < d || adapterPosition > c) {
                    return null;
                }
                return b;
            }
        }
        return null;
    }

    /* renamed from: o */
    private static RecyclerView.ViewHolder m82747o(C12160d dVar, boolean z) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        RecyclerView.ViewHolder viewHolder = dVar.f58575c;
        if (viewHolder == null) {
            return null;
        }
        if (dVar.f58586n || z) {
            float f = viewHolder.itemView.getResources().getDisplayMetrics().density * 8.0f;
            float min = Math.min(((float) dVar.f58574b.f58499a) * 0.2f, f);
            float min2 = Math.min(((float) dVar.f58574b.f58500b) * 0.2f, f);
            C12153j jVar = dVar.f58574b;
            float f2 = ((float) dVar.f58578f) + (((float) jVar.f58499a) * 0.5f);
            float f3 = ((float) dVar.f58579g) + (((float) jVar.f58500b) * 0.5f);
            RecyclerView.ViewHolder b = C12238b.m82882b(dVar.f58573a, f2 - min, f3 - min2);
            if (b == C12238b.m82882b(dVar.f58573a, f2 + min, f3 + min2)) {
                return b;
            }
            return null;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int top = dVar.f58583k ? dVar.f58575c.itemView.getTop() : dVar.f58575c.itemView.getLeft();
        int i = dVar.f58583k ? dVar.f58579g : dVar.f58578f;
        if (i < top) {
            if (adapterPosition <= 0) {
                return null;
            }
            findViewHolderForAdapterPosition = dVar.f58573a.findViewHolderForAdapterPosition(adapterPosition - 1);
        } else if (i <= top || adapterPosition >= dVar.f58573a.getAdapter().getItemCount() - 1) {
            return null;
        } else {
            findViewHolderForAdapterPosition = dVar.f58573a.findViewHolderForAdapterPosition(adapterPosition + 1);
        }
        return findViewHolderForAdapterPosition;
    }

    /* renamed from: p */
    private static RecyclerView.ViewHolder m82748p(C12160d dVar, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        RecyclerView.ViewHolder viewHolder2;
        RecyclerView.ViewHolder viewHolder3;
        if (z || dVar.f58575c == null) {
            return null;
        }
        int i = dVar.f58578f;
        int i2 = i + 1;
        C12153j jVar = dVar.f58574b;
        int i3 = jVar.f58499a;
        int i4 = ((i3 / 2) + i) - 1;
        int i5 = (i + i3) - 2;
        int i6 = dVar.f58579g;
        int i7 = i6 + 1;
        int i8 = jVar.f58500b;
        int i9 = ((i8 / 2) + i6) - 1;
        int i10 = (i6 + i8) - 2;
        if (dVar.f58583k) {
            float f = (float) i9;
            viewHolder3 = C12238b.m82882b(dVar.f58573a, (float) i2, f);
            viewHolder = C12238b.m82882b(dVar.f58573a, (float) i5, f);
            viewHolder2 = C12238b.m82882b(dVar.f58573a, (float) i4, f);
        } else {
            float f2 = (float) i4;
            RecyclerView.ViewHolder b = C12238b.m82882b(dVar.f58573a, f2, (float) i7);
            RecyclerView.ViewHolder b2 = C12238b.m82882b(dVar.f58573a, f2, (float) i9);
            RecyclerView.ViewHolder b3 = C12238b.m82882b(dVar.f58573a, f2, (float) i10);
            viewHolder3 = b;
            viewHolder = b2;
            viewHolder2 = b3;
        }
        if (viewHolder2 == dVar.f58575c) {
            return null;
        }
        if (viewHolder2 == viewHolder3 || viewHolder2 == viewHolder) {
            return viewHolder2;
        }
        return null;
    }

    /* renamed from: q */
    private void m82749q(boolean z) {
        int i;
        if (mo68403G()) {
            C12161e eVar = this.f58534W;
            if (eVar != null) {
                eVar.mo68430c();
                this.f58534W.mo68431d();
            }
            RecyclerView recyclerView = this.f58538a;
            if (!(recyclerView == null || this.f58513B == null)) {
                recyclerView.setOverScrollMode(this.f58531T);
            }
            C12151h hVar = this.f58515D;
            if (hVar != null) {
                hVar.mo68350e(this.f58566w);
                this.f58515D.mo68351f(this.f58567x);
                this.f58515D.mo68380k(true);
            }
            C12165n nVar = this.f58516E;
            if (nVar != null) {
                nVar.mo68350e(this.f58566w);
                this.f58515D.mo68351f(this.f58567x);
                this.f58516E.mo68440i(true);
            }
            C12145b bVar = this.f58548f;
            if (bVar != null) {
                bVar.mo68355h();
            }
            m82736h0();
            RecyclerView recyclerView2 = this.f58538a;
            if (!(recyclerView2 == null || recyclerView2.getParent() == null)) {
                this.f58538a.getParent().requestDisallowInterceptTouchEvent(false);
            }
            RecyclerView recyclerView3 = this.f58538a;
            if (recyclerView3 != null) {
                recyclerView3.invalidate();
            }
            this.f58532U = null;
            this.f58533V = null;
            this.f58515D = null;
            this.f58516E = null;
            this.f58513B = null;
            this.f58514C = null;
            this.f58543c0 = null;
            this.f58517F = null;
            this.f58520I = 0;
            this.f58521J = 0;
            this.f58518G = 0;
            this.f58519H = 0;
            this.f58522K = 0;
            this.f58523L = 0;
            this.f58524M = 0;
            this.f58525N = 0;
            this.f58526O = 0;
            this.f58527P = 0;
            this.f58528Q = 0;
            this.f58529R = 0;
            this.f58536Y = false;
            this.f58537Z = false;
            C12150g gVar = this.f58512A;
            int i2 = -1;
            if (gVar != null) {
                i2 = gVar.mo68366O();
                i = this.f58512A.mo68365N();
                this.f58512A.mo68370S(i2, i, z);
            } else {
                i = -1;
            }
            C12162f fVar = this.f58535X;
            if (fVar != null) {
                fVar.mo29262c(i2, i, z);
            }
        }
    }

    /* renamed from: s */
    private static Integer m82750s(View view, boolean z) {
        if (view == null) {
            return null;
        }
        return Integer.valueOf(z ? view.getTop() : view.getLeft());
    }

    /* renamed from: t */
    private int m82751t() {
        int i = this.f58520I;
        NestedScrollView nestedScrollView = this.f58517F;
        return nestedScrollView != null ? i + (nestedScrollView.getScrollX() - this.f58518G) : i;
    }

    /* renamed from: u */
    private int m82752u() {
        int i = this.f58521J;
        NestedScrollView nestedScrollView = this.f58517F;
        return nestedScrollView != null ? i + (nestedScrollView.getScrollY() - this.f58519H) : i;
    }

    /* renamed from: w */
    private int m82753w(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return -1;
        }
        return C12240d.m82907b(this.f58538a.getAdapter(), this.f58512A, this.f58543c0, viewHolder.getAdapterPosition());
    }

    /* renamed from: x */
    private boolean m82754x(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder b = C12238b.m82882b(recyclerView, motionEvent.getX(), motionEvent.getY());
        if (!m82733g(recyclerView, b)) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        if (!m82730b(b, x, y)) {
            return false;
        }
        int r = C12238b.m82898r(this.f58538a);
        int s = C12238b.m82899s(this.f58538a);
        this.f58520I = x;
        this.f58554k = x;
        this.f58521J = y;
        this.f58555l = y;
        this.f58556m = b.getItemId();
        boolean z = true;
        this.f58536Y = r == 0 || (r == 1 && s > 1);
        if (r != 1 && (r != 0 || s <= 1)) {
            z = false;
        }
        this.f58537Z = z;
        if (this.f58558o) {
            return m82731e(recyclerView, motionEvent, false);
        }
        if (!this.f58557n) {
            return false;
        }
        this.f58534W.mo68434g(motionEvent, this.f58560q);
        return false;
    }

    /* renamed from: y */
    private void m82755y(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f58520I = (int) (motionEvent.getX() + 0.5f);
        this.f58521J = (int) (motionEvent.getY() + 0.5f);
        NestedScrollView nestedScrollView = this.f58517F;
        this.f58518G = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
        NestedScrollView nestedScrollView2 = this.f58517F;
        this.f58519H = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
        this.f58524M = Math.min(this.f58524M, this.f58520I);
        this.f58525N = Math.min(this.f58525N, this.f58521J);
        this.f58526O = Math.max(this.f58526O, this.f58520I);
        this.f58527P = Math.max(this.f58527P, this.f58521J);
        m82741k0();
        if (this.f58515D.mo68378F(m82751t(), m82752u(), false)) {
            C12165n nVar = this.f58516E;
            if (nVar != null) {
                nVar.mo68445n(this.f58515D.mo68383n(), this.f58515D.mo68384o());
            }
            mo68421f(recyclerView);
            m82722L();
        }
    }

    /* renamed from: z */
    private boolean m82756z(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f58559p) {
            return m82731e(recyclerView, motionEvent, true);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo68400B() {
        RecyclerView.ViewHolder findViewHolderForItemId = this.f58538a.findViewHolderForItemId(this.f58514C.f58501c);
        if (findViewHolderForItemId != null) {
            int width = findViewHolderForItemId.itemView.getWidth();
            int height = findViewHolderForItemId.itemView.getHeight();
            C12153j jVar = this.f58514C;
            if (width != jVar.f58499a || height != jVar.f58500b) {
                C12153j a = C12153j.m82711a(jVar, findViewHolderForItemId);
                this.f58514C = a;
                this.f58515D.mo68379H(a, findViewHolderForItemId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo68401C(MotionEvent motionEvent) {
        if (this.f58557n) {
            m82731e(this.f58538a, motionEvent, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo68402D() {
        RecyclerView recyclerView = this.f58538a;
        int r = C12238b.m82898r(recyclerView);
        boolean z = true;
        if (r != 0) {
            if (r == 1) {
                z = false;
            } else {
                return;
            }
        }
        if (this.f58517F != null) {
            m82718E(recyclerView, z);
        } else {
            m82719F(recyclerView, z);
        }
    }

    /* renamed from: G */
    public boolean mo68403G() {
        return this.f58514C != null && !this.f58534W.mo68429b();
    }

    /* renamed from: H */
    public boolean mo68404H() {
        return this.f58544d == null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 != 3) goto L_0x0031;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo68405K(androidx.recyclerview.widget.RecyclerView r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r0 = r5.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r1) goto L_0x0021
            r2 = 2
            if (r0 == r2) goto L_0x0010
            r4 = 3
            if (r0 == r4) goto L_0x0021
            goto L_0x0031
        L_0x0010:
            boolean r0 = r3.mo68403G()
            if (r0 == 0) goto L_0x001a
            r3.m82755y(r4, r5)
            goto L_0x0032
        L_0x001a:
            boolean r4 = r3.m82756z(r4, r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0021:
            boolean r1 = r3.m82717A(r0, r1)
            goto L_0x0032
        L_0x0026:
            boolean r0 = r3.mo68403G()
            if (r0 != 0) goto L_0x0031
            boolean r1 = r3.m82754x(r4, r5)
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p247e6.C12156m.mo68405K(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo68406M(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == this.f58513B) {
            m82721J();
            return;
        }
        C12165n nVar = this.f58516E;
        if (nVar != null) {
            nVar.mo68441j(viewHolder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo68407N(RecyclerView.ViewHolder viewHolder) {
        if (this.f58513B != null) {
            m82721J();
        }
        this.f58513B = viewHolder;
        this.f58515D.mo68373A(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo68408O(boolean z) {
        if (z) {
            mo68418d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo68409P(RecyclerView recyclerView, int i) {
        if (i == 1) {
            mo68418d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo68410Q(RecyclerView recyclerView, int i, int i2) {
        if (this.f58562s) {
            this.f58563t = i;
            this.f58564u = i2;
        } else if (mo68403G()) {
            ViewCompat.postOnAnimationDelayed(this.f58538a, this.f58549f0, 500);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo68411R(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (mo68403G()) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    m82755y(recyclerView, motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            m82717A(actionMasked, true);
        }
    }

    /* renamed from: Z */
    public void mo68412Z(boolean z) {
        this.f58561r = z;
    }

    /* renamed from: a */
    public void mo68413a(@NonNull RecyclerView recyclerView) {
        if (mo68404H()) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.f58538a == null) {
            this.f58538a = recyclerView;
            recyclerView.addOnScrollListener(this.f58546e);
            this.f58538a.addOnItemTouchListener(this.f58544d);
            this.f58551h = this.f58538a.getResources().getDisplayMetrics().density;
            int scaledTouchSlop = ViewConfiguration.get(this.f58538a.getContext()).getScaledTouchSlop();
            this.f58552i = scaledTouchSlop;
            this.f58553j = (int) ((((float) scaledTouchSlop) * 1.5f) + 0.5f);
            this.f58534W = new C12161e(this);
            if (m82737i0()) {
                int r = C12238b.m82898r(this.f58538a);
                if (r == 0) {
                    this.f58548f = new C12155l(this.f58538a);
                } else if (r == 1) {
                    this.f58548f = new C12167o(this.f58538a);
                }
                C12145b bVar = this.f58548f;
                if (bVar != null) {
                    bVar.mo68357j();
                }
            }
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    /* renamed from: a0 */
    public void mo68414a0(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f58569z.f58495d = f;
    }

    /* renamed from: b0 */
    public void mo68415b0(boolean z) {
        this.f58557n = z;
    }

    /* renamed from: c */
    public void mo68416c() {
        mo68418d(false);
    }

    /* renamed from: c0 */
    public void mo68417c0(boolean z) {
        this.f58559p = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo68418d(boolean z) {
        m82717A(3, false);
        if (z) {
            m82749q(false);
        } else if (mo68403G()) {
            this.f58534W.mo68432e();
        }
    }

    /* renamed from: d0 */
    public void mo68419d0(boolean z) {
        this.f58558o = z;
    }

    /* renamed from: e0 */
    public void mo68420e0(@Nullable C12162f fVar) {
        this.f58535X = fVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        r2 = m82740k(r11.f58545d0, r10, true);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68421f(androidx.recyclerview.widget.RecyclerView r12) {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r11.f58513B
            e6.m$d r10 = r11.f58547e0
            e6.j r3 = r11.f58514C
            int r4 = r11.m82751t()
            int r5 = r11.m82752u()
            e6.k r6 = r11.f58532U
            e6.k r7 = r11.f58533V
            boolean r8 = r11.f58561r
            r0 = r10
            r1 = r12
            r2 = r9
            r0.mo68427b(r1, r2, r3, r4, r5, r6, r7, r8)
            e6.g r0 = r11.f58512A
            int r0 = r0.mo68366O()
            e6.g r1 = r11.f58512A
            int r1 = r1.mo68365N()
            e6.m$h r2 = r11.f58545d0
            r3 = 0
            e6.m$h r2 = r11.m82740k(r2, r10, r3)
            int r4 = r2.f58592b
            r5 = -1
            if (r4 == r5) goto L_0x0050
            boolean r3 = r11.f58561r
            r6 = 1
            r3 = r3 ^ r6
            if (r3 != 0) goto L_0x003e
            e6.g r3 = r11.f58512A
            boolean r3 = r3.mo68363J(r0, r4)
        L_0x003e:
            if (r3 != 0) goto L_0x0050
            e6.m$h r2 = r11.f58545d0
            e6.m$h r2 = r11.m82740k(r2, r10, r6)
            int r4 = r2.f58592b
            if (r4 == r5) goto L_0x0050
            e6.g r3 = r11.f58512A
            boolean r3 = r3.mo68363J(r0, r4)
        L_0x0050:
            if (r3 == 0) goto L_0x005f
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.f58591a
            if (r0 == 0) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "bug check"
            r12.<init>(r0)
            throw r12
        L_0x005f:
            if (r3 == 0) goto L_0x0066
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.f58591a
            r11.m82739j0(r12, r1, r9, r0)
        L_0x0066:
            e6.n r12 = r11.f58516E
            if (r12 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.f58591a
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r12.mo68442k(r0)
        L_0x0073:
            if (r3 == 0) goto L_0x007a
            e6.m$e r12 = r11.f58534W
            r12.mo68433f()
        L_0x007a:
            r2.mo68439a()
            r10.mo68426a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p247e6.C12156m.mo68421f(androidx.recyclerview.widget.RecyclerView):void");
    }

    @NonNull
    /* renamed from: i */
    public RecyclerView.Adapter mo68422i(@NonNull RecyclerView.Adapter adapter) {
        if (!adapter.hasStableIds()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (this.f58512A == null) {
            C12150g gVar = new C12150g(this, adapter);
            this.f58512A = gVar;
            return gVar;
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public RecyclerView.ViewHolder mo68423r() {
        return this.f58513B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public RecyclerView mo68424v() {
        return this.f58538a;
    }
}
