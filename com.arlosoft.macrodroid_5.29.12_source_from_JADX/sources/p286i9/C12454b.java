package p286i9;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p306k9.C13420a;
import p306k9.C13423b;
import p316l9.C15606e;
import p316l9.C15607f;
import p316l9.C15608g;
import p316l9.C15609h;
import p316l9.C15610i;
import p325m9.C15705a;
import p325m9.C15707c;
import p334n9.C15763c;

/* renamed from: i9.b */
/* compiled from: FlexibleAdapter */
public class C12454b<T extends C15608g> extends C12448a implements C13420a.C13421a {

    /* renamed from: Z0 */
    private static final String f59265Z0;

    /* renamed from: a1 */
    private static final String f59266a1;

    /* renamed from: b1 */
    private static final String f59267b1;

    /* renamed from: c1 */
    private static final String f59268c1;

    /* renamed from: d1 */
    private static final String f59269d1;

    /* renamed from: e1 */
    private static final String f59270e1;

    /* renamed from: f1 */
    private static int f59271f1 = 1000;

    /* renamed from: A0 */
    private int f59272A0 = 0;

    /* renamed from: B0 */
    private int f59273B0 = -1;

    /* renamed from: C0 */
    private boolean f59274C0 = false;

    /* renamed from: D0 */
    private boolean f59275D0 = false;

    /* renamed from: E0 */
    private boolean f59276E0 = false;

    /* renamed from: F0 */
    private boolean f59277F0 = false;

    /* renamed from: G0 */
    private boolean f59278G0 = false;

    /* renamed from: H0 */
    private C13420a f59279H0;

    /* renamed from: I0 */
    private ItemTouchHelper f59280I0;

    /* renamed from: J0 */
    private int f59281J0 = 1;

    /* renamed from: K0 */
    private int f59282K0 = 0;

    /* renamed from: L0 */
    private int f59283L0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public boolean f59284M0 = false;

    /* renamed from: N0 */
    private boolean f59285N0 = false;

    /* renamed from: O0 */
    private boolean f59286O0 = false;

    /* renamed from: P0 */
    private T f59287P0;

    /* renamed from: Q */
    private List<T> f59288Q;

    /* renamed from: Q0 */
    public C12468m f59289Q0;

    /* renamed from: R */
    private List<T> f59290R;

    /* renamed from: R0 */
    public C12469n f59291R0;

    /* renamed from: S */
    private List<T> f59292S;

    /* renamed from: S0 */
    protected C12473r f59293S0;

    /* renamed from: T */
    private Set<T> f59294T;

    /* renamed from: T0 */
    protected C12467l f59295T0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public List<C12464i> f59296U;

    /* renamed from: U0 */
    protected C12470o f59297U0;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C12454b<T>.g f59298V;

    /* renamed from: V0 */
    protected C12471p f59299V0;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public long f59300W;

    /* renamed from: W0 */
    protected C12461f f59301W0;

    /* renamed from: X */
    private long f59302X;

    /* renamed from: X0 */
    protected C12466k f59303X0;

    /* renamed from: Y */
    private boolean f59304Y = false;

    /* renamed from: Y0 */
    protected C12472q f59305Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public DiffUtil.DiffResult f59306Z;

    /* renamed from: a0 */
    private C12460e f59307a0;

    /* renamed from: b0 */
    protected final int f59308b0 = 1;

    /* renamed from: c0 */
    protected final int f59309c0 = 2;

    /* renamed from: d0 */
    protected final int f59310d0 = 8;

    /* renamed from: e0 */
    protected Handler f59311e0 = new Handler(Looper.getMainLooper(), new C12463h());

    /* renamed from: f0 */
    private List<C12454b<T>.s> f59312f0;

    /* renamed from: g0 */
    private List<Integer> f59313g0;

    /* renamed from: h0 */
    private boolean f59314h0 = false;

    /* renamed from: i0 */
    private boolean f59315i0 = false;

    /* renamed from: j0 */
    private boolean f59316j0 = false;

    /* renamed from: k0 */
    private boolean f59317k0 = true;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public boolean f59318l0 = true;

    /* renamed from: m0 */
    private List<T> f59319m0;

    /* renamed from: n0 */
    private List<T> f59320n0;

    /* renamed from: o0 */
    private boolean f59321o0 = false;

    /* renamed from: p0 */
    private boolean f59322p0 = false;

    /* renamed from: q0 */
    protected LayoutInflater f59323q0;

    /* renamed from: r0 */
    private HashMap<Integer, T> f59324r0 = new HashMap<>();

    /* renamed from: s0 */
    private boolean f59325s0 = false;

    /* renamed from: t0 */
    private Serializable f59326t0 = null;

    /* renamed from: u0 */
    private Serializable f59327u0 = "";

    /* renamed from: v0 */
    private Set<C15606e> f59328v0;

    /* renamed from: w0 */
    private boolean f59329w0 = true;

    /* renamed from: x0 */
    private boolean f59330x0 = false;

    /* renamed from: y0 */
    private boolean f59331y0 = false;

    /* renamed from: z0 */
    private int f59332z0 = f59271f1;

    /* renamed from: i9.b$a */
    /* compiled from: FlexibleAdapter */
    class C12455a implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ int f59333a;

        /* renamed from: c */
        final /* synthetic */ int f59334c;

        C12455a(int i, int i2) {
            this.f59333a = i;
            this.f59334c = i2;
        }

        public boolean handleMessage(Message message) {
            C12454b bVar = C12454b.this;
            if (bVar.f59375o == null) {
                return false;
            }
            int findFirstCompletelyVisibleItemPosition = bVar.mo68941G().findFirstCompletelyVisibleItemPosition();
            int findLastCompletelyVisibleItemPosition = C12454b.this.mo68941G().findLastCompletelyVisibleItemPosition();
            int i = this.f59333a;
            int i2 = this.f59334c;
            if ((i + i2) - findLastCompletelyVisibleItemPosition > 0) {
                int min = Math.min(i - findFirstCompletelyVisibleItemPosition, Math.max(0, (i + i2) - findLastCompletelyVisibleItemPosition));
                int spanCount = C12454b.this.mo68941G().getSpanCount();
                if (spanCount > 1) {
                    min = (min % spanCount) + spanCount;
                }
                C12454b.this.m83414O1(findFirstCompletelyVisibleItemPosition + min);
            } else if (i < findFirstCompletelyVisibleItemPosition) {
                C12454b.this.m83414O1(i);
            }
            return true;
        }
    }

    /* renamed from: i9.b$b */
    /* compiled from: FlexibleAdapter */
    class C12456b implements Comparator<Integer> {
        C12456b() {
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }
    }

    /* renamed from: i9.b$c */
    /* compiled from: FlexibleAdapter */
    class C12457c implements Runnable {
        C12457c() {
        }

        public void run() {
            C12454b.this.m83429c2();
            C12454b bVar = C12454b.this;
            if (bVar.f59301W0 != null) {
                bVar.f59370a.mo75140a("onLoadMore     invoked!", new Object[0]);
                C12454b bVar2 = C12454b.this;
                bVar2.f59301W0.mo68919a(bVar2.mo68890g1(), C12454b.this.mo68874X0());
            }
        }
    }

    /* renamed from: i9.b$d */
    /* compiled from: FlexibleAdapter */
    private class C12458d extends RecyclerView.AdapterDataObserver {

        /* renamed from: i9.b$d$a */
        /* compiled from: FlexibleAdapter */
        class C12459a implements Runnable {
            C12459a() {
            }

            public void run() {
                if (C12454b.this.mo68908y0()) {
                    C13423b unused = Objects.requireNonNull(C12454b.this);
                    throw null;
                }
            }
        }

        private C12458d() {
        }

        /* renamed from: a */
        private void m83529a(int i, int i2) {
            if (C12454b.this.f59318l0) {
                C12454b.this.m83444r0(i, i2);
            }
            boolean unused = C12454b.this.f59318l0 = true;
        }

        /* renamed from: b */
        private void m83530b(int i) {
            int k1 = C12454b.this.mo68897k1();
            if (k1 >= 0 && k1 == i) {
                C12454b.this.f59370a.mo75140a("updateStickyHeader position=%s", Integer.valueOf(k1));
                C12454b.this.f59375o.postDelayed(new C12459a(), 100);
            }
        }

        public void onChanged() {
            m83530b(C12454b.this.mo68897k1());
        }

        public void onItemRangeChanged(int i, int i2) {
            m83530b(i);
        }

        public void onItemRangeInserted(int i, int i2) {
            m83529a(i, i2);
        }

        public void onItemRangeRemoved(int i, int i2) {
            m83530b(i);
            m83529a(i, -i2);
        }

        /* synthetic */ C12458d(C12454b bVar, C12475c cVar) {
            this();
        }
    }

    /* renamed from: i9.b$e */
    /* compiled from: FlexibleAdapter */
    public static class C12460e<T extends C15608g> extends DiffUtil.Callback {

        /* renamed from: a */
        protected List<T> f59340a;

        /* renamed from: b */
        protected List<T> f59341b;

        /* renamed from: a */
        public final List<T> mo68917a() {
            return this.f59341b;
        }

        public boolean areContentsTheSame(int i, int i2) {
            return !((C15608g) this.f59340a.get(i)).mo74953h((C15608g) this.f59341b.get(i2));
        }

        public boolean areItemsTheSame(int i, int i2) {
            return ((C15608g) this.f59340a.get(i)).equals((C15608g) this.f59341b.get(i2));
        }

        /* renamed from: b */
        public final void mo68918b(List<T> list, List<T> list2) {
            this.f59340a = list;
            this.f59341b = list2;
        }

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return C12476d.CHANGE;
        }

        public final int getNewListSize() {
            return this.f59341b.size();
        }

        public final int getOldListSize() {
            return this.f59340a.size();
        }
    }

    /* renamed from: i9.b$f */
    /* compiled from: FlexibleAdapter */
    public interface C12461f {
        /* renamed from: a */
        void mo68919a(int i, int i2);
    }

    /* renamed from: i9.b$g */
    /* compiled from: FlexibleAdapter */
    private class C12462g extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final List<T> f59342a;

        /* renamed from: b */
        private final int f59343b;

        C12462g(int i, @Nullable List<T> list) {
            ArrayList arrayList;
            this.f59343b = i;
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            this.f59342a = arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            long unused = C12454b.this.f59300W = System.currentTimeMillis();
            int i = this.f59343b;
            if (i == 1) {
                C12454b.this.f59370a.mo75140a("doInBackground - started UPDATE", new Object[0]);
                C12454b.this.m83415P1(this.f59342a);
                C12454b.this.m83446s0(this.f59342a, C12476d.CHANGE);
                C12454b.this.f59370a.mo75140a("doInBackground - ended UPDATE", new Object[0]);
                return null;
            } else if (i != 2) {
                return null;
            } else {
                C12454b.this.f59370a.mo75140a("doInBackground - started FILTER", new Object[0]);
                C12454b.this.m83416Q0(this.f59342a);
                C12454b.this.f59370a.mo75140a("doInBackground - ended FILTER", new Object[0]);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            if (!(C12454b.this.f59306Z == null && C12454b.this.f59296U == null)) {
                int i = this.f59343b;
                if (i == 1) {
                    C12454b.this.m83407I0(C12476d.CHANGE);
                    C12454b.this.mo68860L1();
                } else if (i == 2) {
                    C12454b.this.m83407I0(C12476d.FILTER);
                    C12454b.this.mo29732K1();
                }
            }
            C12462g unused = C12454b.this.f59298V = null;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            C12454b.this.f59370a.mo75142c("FilterAsyncTask cancelled!", new Object[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C12454b.this.f59284M0) {
                C12454b.this.f59370a.mo75144e("Cannot filter while endlessLoading", new Object[0]);
                cancel(true);
            }
            if (C12454b.this.mo68853F1()) {
                C12454b.this.f59370a.mo75140a("Removing all deleted items before filtering/updating", new Object[0]);
                this.f59342a.removeAll(C12454b.this.mo68873W0());
                C12466k kVar = C12454b.this.f59303X0;
                if (kVar != null) {
                    kVar.mo68929a(3);
                }
            }
        }
    }

    /* renamed from: i9.b$h */
    /* compiled from: FlexibleAdapter */
    public class C12463h implements Handler.Callback {
        public C12463h() {
        }

        @CallSuper
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                if (C12454b.this.f59298V != null) {
                    C12454b.this.f59298V.cancel(true);
                }
                C12462g unused = C12454b.this.f59298V = new C12462g(message.what, (List) message.obj);
                C12454b.this.f59298V.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return true;
            } else if (i != 8) {
                return false;
            } else {
                C12454b.this.m83451u1();
                return true;
            }
        }
    }

    /* renamed from: i9.b$j */
    /* compiled from: FlexibleAdapter */
    public interface C12465j {
        /* renamed from: a */
        void mo68928a(RecyclerView.ViewHolder viewHolder, int i);
    }

    /* renamed from: i9.b$k */
    /* compiled from: FlexibleAdapter */
    public interface C12466k {
        /* renamed from: a */
        void mo68929a(int i);
    }

    /* renamed from: i9.b$l */
    /* compiled from: FlexibleAdapter */
    public interface C12467l {
        /* renamed from: a */
        void mo68930a(int i);
    }

    /* renamed from: i9.b$m */
    /* compiled from: FlexibleAdapter */
    public interface C12468m {
        /* renamed from: a */
        boolean mo29315a(View view, int i);
    }

    /* renamed from: i9.b$n */
    /* compiled from: FlexibleAdapter */
    public interface C12469n {
        /* renamed from: a */
        void mo68931a(int i);
    }

    /* renamed from: i9.b$o */
    /* compiled from: FlexibleAdapter */
    public interface C12470o extends C12465j {
        /* renamed from: d */
        void mo68932d(int i, int i2);

        /* renamed from: e */
        boolean mo68933e(int i, int i2);
    }

    /* renamed from: i9.b$p */
    /* compiled from: FlexibleAdapter */
    public interface C12471p extends C12465j {
        /* renamed from: b */
        void mo68934b(int i, int i2);
    }

    /* renamed from: i9.b$q */
    /* compiled from: FlexibleAdapter */
    public interface C12472q {
    }

    /* renamed from: i9.b$r */
    /* compiled from: FlexibleAdapter */
    public interface C12473r {
        /* renamed from: a */
        void mo68935a(int i);
    }

    /* renamed from: i9.b$s */
    /* compiled from: FlexibleAdapter */
    private class C12474s {

        /* renamed from: a */
        int f59349a;

        /* renamed from: b */
        int f59350b;

        /* renamed from: c */
        T f59351c;

        /* renamed from: d */
        T f59352d;

        public C12474s(C12454b bVar, T t, T t2) {
            this(t, t2, -1);
        }

        public String toString() {
            return "RestoreInfo[item=" + this.f59352d + ", refItem=" + this.f59351c + "]";
        }

        public C12474s(T t, T t2, int i) {
            this.f59349a = -1;
            this.f59351c = t;
            this.f59352d = t2;
            this.f59350b = i;
        }
    }

    static {
        String simpleName = C12454b.class.getSimpleName();
        f59265Z0 = simpleName + "_parentSelected";
        f59266a1 = simpleName + "_childSelected";
        f59267b1 = simpleName + "_headersShown";
        f59268c1 = simpleName + "_stickyHeaders";
        f59269d1 = simpleName + "_selectedLevel";
        f59270e1 = simpleName + "_filter";
    }

    public C12454b(@Nullable List<T> list, @Nullable Object obj, boolean z) {
        super(z);
        if (list == null) {
            this.f59288Q = new ArrayList();
        } else {
            this.f59288Q = new ArrayList(list);
        }
        this.f59319m0 = new ArrayList();
        this.f59320n0 = new ArrayList();
        this.f59312f0 = new ArrayList();
        this.f59313g0 = new ArrayList();
        if (obj != null) {
            mo68900o0(obj);
        }
        registerAdapterDataObserver(new C12458d(this, (C12475c) null));
    }

    /* renamed from: E0 */
    private boolean m83403E0(List<T> list, C15606e eVar) {
        return list.contains(eVar) && list.removeAll(eVar.mo74946n());
    }

    /* renamed from: F0 */
    private void m83404F0(int i, T t) {
        C15606e Z0;
        if (mo68911z1(t)) {
            mo68843A0(i);
        }
        C15608g e1 = mo68886e1(i - 1);
        if (!(e1 == null || (Z0 = mo68876Z0(e1)) == null)) {
            e1 = Z0;
        }
        this.f59312f0.add(new C12474s(this, e1, t));
        C15707c cVar = this.f59370a;
        List<C12454b<T>.s> list = this.f59312f0;
        cVar.mo75143d("Recycled Item %s on position=%s", list.get(list.size() - 1), Integer.valueOf(i));
    }

    /* renamed from: G0 */
    private void m83405G0(C15606e eVar, T t) {
        this.f59312f0.add(new C12474s(eVar, t, m83423Y0(eVar, false).indexOf(t)));
        C15707c cVar = this.f59370a;
        List<C12454b<T>.s> list = this.f59312f0;
        cVar.mo75143d("Recycled SubItem %s with Parent position=%s", list.get(list.size() - 1), Integer.valueOf(mo68881b1(eVar)));
    }

    /* renamed from: H1 */
    private void m83406H1(T t, C15609h hVar, @Nullable Object obj) {
        if (t == null || !(t instanceof C15610i)) {
            notifyItemChanged(mo68881b1(hVar), obj);
            return;
        }
        C15610i iVar = (C15610i) t;
        if (iVar.mo74962k() != null && !iVar.mo74962k().equals(hVar)) {
            m83432e2(iVar, C12476d.UNLINK);
        }
        if (iVar.mo74962k() == null && hVar != null) {
            this.f59370a.mo75143d("Link header %s to %s", hVar, iVar);
            iVar.mo74963q(hVar);
            if (obj != null) {
                if (!hVar.mo74951d()) {
                    notifyItemChanged(mo68881b1(hVar), obj);
                }
                if (!t.mo74951d()) {
                    notifyItemChanged(mo68881b1(t), obj);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public synchronized void m83407I0(C12476d dVar) {
        if (this.f59306Z != null) {
            this.f59370a.mo75142c("Dispatching notifications", new Object[0]);
            this.f59288Q = this.f59307a0.mo68917a();
            this.f59306Z.dispatchUpdatesTo((RecyclerView.Adapter) this);
            this.f59306Z = null;
        } else {
            this.f59370a.mo75142c("Performing %s notifications", Integer.valueOf(this.f59296U.size()));
            this.f59288Q = this.f59290R;
            mo68835W(false);
            for (C12464i next : this.f59296U) {
                int i = next.f59348c;
                if (i == 1) {
                    notifyItemInserted(next.f59347b);
                } else if (i == 2) {
                    notifyItemChanged(next.f59347b, dVar);
                } else if (i == 3) {
                    notifyItemRemoved(next.f59347b);
                } else if (i != 4) {
                    this.f59370a.mo75144e("notifyDataSetChanged!", new Object[0]);
                    notifyDataSetChanged();
                } else {
                    notifyItemMoved(next.f59346a, next.f59347b);
                }
            }
            this.f59290R = null;
            this.f59296U = null;
            mo68835W(true);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f59300W;
        this.f59302X = currentTimeMillis;
        this.f59370a.mo75142c("Animate changes DONE in %sms", Long.valueOf(currentTimeMillis));
    }

    /* renamed from: I1 */
    private void m83408I1(@NonNull T t) {
        if (!this.f59324r0.containsKey(Integer.valueOf(t.mo74959t()))) {
            this.f59324r0.put(Integer.valueOf(t.mo74959t()), t);
            this.f59370a.mo75142c("Mapped viewType %s from %s", Integer.valueOf(t.mo74959t()), C15705a.m94970a(t));
        }
    }

    /* renamed from: L0 */
    private int m83409L0(int i, boolean z, boolean z2, boolean z3) {
        C15608g e1 = mo68886e1(i);
        if (!mo68907x1(e1)) {
            return 0;
        }
        C15606e eVar = (C15606e) e1;
        if (!mo68905q1(eVar)) {
            eVar.mo74945i(false);
            this.f59370a.mo75144e("No subItems to Expand on position %s expanded %s", Integer.valueOf(i), Boolean.valueOf(eVar.mo74943c()));
            return 0;
        }
        if (!z2 && !z) {
            this.f59370a.mo75143d("Request to Expand on position=%s expanded=%s anyParentSelected=%s", Integer.valueOf(i), Boolean.valueOf(eVar.mo74943c()), Boolean.valueOf(this.f59278G0));
        }
        if (!z2) {
            if (eVar.mo74943c()) {
                return 0;
            }
            if (this.f59278G0 && eVar.mo74944e() > this.f59273B0) {
                return 0;
            }
        }
        if (this.f59275D0 && !z && mo68850D0(this.f59272A0) > 0) {
            i = mo68881b1(e1);
        }
        List<C15608g> Y0 = m83423Y0(eVar, true);
        int i2 = i + 1;
        this.f59288Q.addAll(i2, Y0);
        int size = Y0.size();
        eVar.mo74945i(true);
        if (!z2 && this.f59274C0 && !z) {
            m83456z0(i, size);
        }
        if (z3) {
            notifyItemChanged(i, C12476d.EXPANDED);
        }
        notifyItemRangeInserted(i2, size);
        if (!z2 && this.f59321o0) {
            int i3 = 0;
            for (C15608g b2 : Y0) {
                i3++;
                if (m83427b2(i + i3, b2, false)) {
                    i3++;
                }
            }
        }
        if (!m83411N0(this.f59319m0, eVar)) {
            m83411N0(this.f59320n0, eVar);
        }
        C15707c cVar = this.f59370a;
        Object[] objArr = new Object[3];
        objArr[0] = z2 ? "Initially expanded" : "Expanded";
        objArr[1] = Integer.valueOf(size);
        objArr[2] = Integer.valueOf(i);
        cVar.mo75143d("%s %s subItems on position=%s", objArr);
        return size;
    }

    /* renamed from: M1 */
    private void m83410M1(int i, List<T> list, boolean z) {
        int itemCount = getItemCount();
        if (i < itemCount) {
            this.f59288Q.addAll(i, list);
        } else {
            this.f59288Q.addAll(list);
            i = itemCount;
        }
        if (z) {
            this.f59370a.mo75140a("addItems on position=%s itemCount=%s", Integer.valueOf(i), Integer.valueOf(list.size()));
            notifyItemRangeInserted(i, list.size());
        }
    }

    /* renamed from: N0 */
    private boolean m83411N0(List<T> list, C15606e eVar) {
        int indexOf = list.indexOf(eVar);
        if (indexOf < 0) {
            return false;
        }
        int i = indexOf + 1;
        if (i < list.size()) {
            return list.addAll(i, eVar.mo74946n());
        }
        return list.addAll(eVar.mo74946n());
    }

    /* renamed from: N1 */
    private void m83412N1(T t, boolean z) {
        boolean z2 = this.f59317k0;
        if (z) {
            this.f59317k0 = true;
        }
        mo68865R1(mo68881b1(t));
        this.f59317k0 = z2;
    }

    /* renamed from: O0 */
    private boolean m83413O0(T t, List<T> list) {
        boolean z = false;
        if (mo68907x1(t)) {
            C15606e eVar = (C15606e) t;
            if (eVar.mo74943c()) {
                if (this.f59328v0 == null) {
                    this.f59328v0 = new HashSet();
                }
                this.f59328v0.add(eVar);
            }
            for (C15608g gVar : mo68867T0(eVar)) {
                if (!(gVar instanceof C15606e) || !m83418S0(gVar, list)) {
                    gVar.mo74956o(!mo68864R0(gVar, mo68879a1(Serializable.class)));
                    if (!gVar.mo74951d()) {
                        list.add(gVar);
                    }
                }
                z = true;
            }
            eVar.mo74945i(z);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m83414O1(int i) {
        RecyclerView recyclerView = this.f59375o;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(Math.min(Math.max(0, i), getItemCount() - 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public void m83415P1(List<T> list) {
        if (this.f59329w0) {
            mo68939E();
        }
        m83421X1(list);
        C15609h hVar = null;
        int i = 0;
        while (i < list.size()) {
            C15608g gVar = (C15608g) list.get(i);
            if (mo68911z1(gVar)) {
                C15606e eVar = (C15606e) gVar;
                eVar.mo74945i(true);
                List Y0 = m83423Y0(eVar, false);
                if (i < list.size()) {
                    list.addAll(i + 1, Y0);
                } else {
                    list.addAll(Y0);
                }
            }
            if (!this.f59321o0 && mo68848C1(gVar) && !gVar.mo74951d()) {
                this.f59321o0 = true;
            }
            C15609h d1 = mo68884d1(gVar);
            if (d1 != null && !d1.equals(hVar) && !mo68907x1(d1)) {
                d1.mo74956o(false);
                list.add(i, d1);
                i++;
                hVar = d1;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m83416Q0(@androidx.annotation.NonNull java.util.List<T> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            m9.c r0 = r6.f59370a     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "filterItems with filterEntity=\"%s\""
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0073 }
            java.io.Serializable r4 = r6.f59326t0     // Catch:{ all -> 0x0073 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0073 }
            r0.mo75140a(r1, r3)     // Catch:{ all -> 0x0073 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0073 }
            r0.<init>()     // Catch:{ all -> 0x0073 }
            r6.f59330x0 = r2     // Catch:{ all -> 0x0073 }
            boolean r1 = r6.mo68898m1()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0045
            java.io.Serializable r1 = r6.f59326t0     // Catch:{ all -> 0x0073 }
            boolean r1 = r6.mo68901o1(r1)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0045
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0073 }
        L_0x0029:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0073 }
            l9.g r1 = (p316l9.C15608g) r1     // Catch:{ all -> 0x0073 }
            i9.b<T>$g r2 = r6.f59298V     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x0041
            boolean r2 = r2.isCancelled()     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x0041
            monitor-exit(r6)
            return
        L_0x0041:
            r6.m83418S0(r1, r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0029
        L_0x0045:
            java.io.Serializable r1 = r6.f59326t0     // Catch:{ all -> 0x0073 }
            boolean r1 = r6.mo68901o1(r1)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x005d
            r6.m83419W1(r7)     // Catch:{ all -> 0x0073 }
            r0 = 0
            r6.f59328v0 = r0     // Catch:{ all -> 0x0073 }
            java.util.List<T> r1 = r6.f59292S     // Catch:{ all -> 0x0073 }
            if (r1 != 0) goto L_0x005a
            r6.m83421X1(r7)     // Catch:{ all -> 0x0073 }
        L_0x005a:
            r6.f59292S = r0     // Catch:{ all -> 0x0073 }
            goto L_0x005e
        L_0x005d:
            r7 = r0
        L_0x005e:
            java.io.Serializable r0 = r6.f59326t0     // Catch:{ all -> 0x0073 }
            boolean r0 = r6.mo68901o1(r0)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006f
            java.io.Serializable r0 = r6.f59326t0     // Catch:{ all -> 0x0073 }
            r6.f59327u0 = r0     // Catch:{ all -> 0x0073 }
            i9.d r0 = p286i9.C12476d.FILTER     // Catch:{ all -> 0x0073 }
            r6.m83446s0(r7, r0)     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r6.f59330x0 = r5     // Catch:{ all -> 0x0073 }
            monitor-exit(r6)
            return
        L_0x0073:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p286i9.C12454b.m83416Q0(java.util.List):void");
    }

    /* renamed from: Q1 */
    private int m83417Q1(int i, List<T> list, int i2) {
        int i3 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            C15608g gVar = (C15608g) list.get(size);
            if (mo68911z1(gVar) && ((C15606e) gVar).mo74944e() >= i2 && mo68845B0(i + size, true) > 0) {
                i3++;
            }
        }
        return i3;
    }

    /* renamed from: S0 */
    private boolean m83418S0(T t, List<T> list) {
        C12454b<T>.g gVar = this.f59298V;
        if (gVar != null && gVar.isCancelled()) {
            return false;
        }
        if (this.f59292S != null && (mo68854G1(t) || list.contains(t))) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        boolean O0 = m83413O0(t, arrayList);
        if (!O0) {
            O0 = mo68864R0(t, mo68879a1(Serializable.class));
        }
        if (O0) {
            C15609h d1 = mo68884d1(t);
            if (this.f59321o0 && mo68899n1(t) && !list.contains(d1)) {
                d1.mo74956o(false);
                list.add(d1);
            }
            list.addAll(arrayList);
        }
        t.mo74956o(!O0);
        return O0;
    }

    /* renamed from: W1 */
    private void m83419W1(List<T> list) {
        C15609h d1;
        if (list != null) {
            C15609h hVar = null;
            int i = 0;
            while (i < list.size()) {
                C15608g gVar = (C15608g) list.get(i);
                gVar.mo74956o(false);
                if (mo68907x1(gVar)) {
                    C15606e eVar = (C15606e) gVar;
                    Set<C15606e> set = this.f59328v0;
                    eVar.mo74945i(set != null && set.contains(eVar));
                    if (mo68905q1(eVar)) {
                        List<C15608g> n = eVar.mo74946n();
                        for (C15608g gVar2 : n) {
                            gVar2.mo74956o(false);
                            if (gVar2 instanceof C15606e) {
                                C15606e eVar2 = (C15606e) gVar2;
                                eVar2.mo74945i(false);
                                m83419W1(eVar2.mo74946n());
                            }
                        }
                        if (eVar.mo74943c() && this.f59292S == null) {
                            if (i < list.size()) {
                                list.addAll(i + 1, n);
                            } else {
                                list.addAll(n);
                            }
                            i += n.size();
                        }
                    }
                }
                if (this.f59321o0 && this.f59292S == null && (d1 = mo68884d1(gVar)) != null && !d1.equals(hVar) && !mo68907x1(d1)) {
                    d1.mo74956o(false);
                    list.add(i, d1);
                    i++;
                    hVar = d1;
                }
                i++;
            }
        }
    }

    /* renamed from: X1 */
    private void m83421X1(List<T> list) {
        for (T t : this.f59319m0) {
            if (list.size() > 0) {
                list.add(0, t);
            } else {
                list.add(t);
            }
        }
        list.addAll(this.f59320n0);
    }

    @NonNull
    /* renamed from: Y0 */
    private List<T> m83423Y0(C15606e eVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null && mo68905q1(eVar)) {
            for (C15608g gVar : eVar.mo74946n()) {
                if (!gVar.mo74951d()) {
                    arrayList.add(gVar);
                    if (z && mo68911z1(gVar)) {
                        C15606e eVar2 = (C15606e) gVar;
                        if (eVar2.mo74946n().size() > 0) {
                            arrayList.addAll(m83423Y0(eVar2, true));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b2 */
    private boolean m83427b2(int i, T t, boolean z) {
        C15609h d1 = mo68884d1(t);
        if (d1 == null || m83436h1(t) != null || !d1.mo74951d()) {
            return false;
        }
        this.f59370a.mo75143d("Showing header position=%s header=%s", Integer.valueOf(i), d1);
        d1.mo74956o(false);
        m83410M1(i, Collections.singletonList(d1), !z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m83429c2() {
        this.f59311e0.removeMessages(8);
        this.f59370a.mo75143d("onLoadMore     show progressItem", new Object[0]);
        if (this.f59286O0) {
            mo68904q0(this.f59287P0);
        } else {
            mo68902p0(this.f59287P0);
        }
    }

    /* renamed from: e2 */
    private void m83432e2(T t, @Nullable Object obj) {
        if (mo68899n1(t)) {
            C15610i iVar = (C15610i) t;
            C15609h k = iVar.mo74962k();
            this.f59370a.mo75143d("Unlink header %s from %s", k, iVar);
            iVar.mo74963q(null);
            if (obj != null) {
                if (!k.mo74951d()) {
                    notifyItemChanged(mo68881b1(k), obj);
                }
                if (!t.mo74951d()) {
                    notifyItemChanged(mo68881b1(t), obj);
                }
            }
        }
    }

    /* renamed from: h1 */
    private C12454b<T>.s m83436h1(T t) {
        for (C12454b<T>.s next : this.f59312f0) {
            if (next.f59352d.equals(t) && next.f59349a < 0) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: l1 */
    private T m83441l1(int i) {
        return (C15608g) this.f59324r0.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m83444r0(int i, int i2) {
        String str;
        List<Integer> K = mo68945K();
        if (i2 > 0) {
            Collections.sort(K, new C12456b());
            str = "+";
        } else {
            str = "";
        }
        boolean z = false;
        for (Integer next : K) {
            if (next.intValue() >= i) {
                mo68947O(next.intValue());
                mo68937B(Math.max(next.intValue() + i2, i));
                z = true;
            }
        }
        if (z) {
            C15707c cVar = this.f59370a;
            cVar.mo75143d("AdjustedSelected(%s)=%s", str + i2, mo68945K());
        }
    }

    /* renamed from: r1 */
    private boolean m83445r1(int i, List<T> list) {
        for (T t : list) {
            i++;
            if (mo68946M(i) || (mo68911z1(t) && m83445r1(i, m83423Y0((C15606e) t, false)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public synchronized void m83446s0(@Nullable List<T> list, C12476d dVar) {
        if (this.f59304Y) {
            C15707c cVar = this.f59370a;
            cVar.mo75143d("Animate changes with DiffUtils! oldSize=" + getItemCount() + " newSize=" + list.size(), new Object[0]);
            if (this.f59307a0 == null) {
                this.f59307a0 = new C12460e();
            }
            this.f59307a0.mo68918b(this.f59288Q, list);
            this.f59306Z = DiffUtil.calculateDiff(this.f59307a0, this.f59331y0);
        } else {
            m83448t0(list, dVar);
        }
    }

    /* renamed from: s1 */
    private void m83447s1(int i, C15609h hVar) {
        if (i >= 0) {
            this.f59370a.mo75143d("Hiding header position=%s header=$s", Integer.valueOf(i), hVar);
            hVar.mo74956o(true);
            this.f59288Q.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* renamed from: t0 */
    private synchronized void m83448t0(@Nullable List<T> list, C12476d dVar) {
        this.f59296U = new ArrayList();
        if (list == null || list.size() > this.f59332z0) {
            C15707c cVar = this.f59370a;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(getItemCount());
            objArr[1] = list != null ? Integer.valueOf(list.size()) : "0";
            objArr[2] = Integer.valueOf(this.f59332z0);
            cVar.mo75140a("NotifyDataSetChanged! oldSize=%s newSize=%s limit=%s", objArr);
            this.f59290R = list;
            this.f59296U.add(new C12464i(-1, 0));
        } else {
            this.f59370a.mo75140a("Animate changes! oldSize=%s newSize=%s limit=%s", Integer.valueOf(getItemCount()), Integer.valueOf(list.size()), Integer.valueOf(this.f59332z0));
            ArrayList arrayList = new ArrayList(this.f59288Q);
            this.f59290R = arrayList;
            m83454w0(arrayList, list);
            m83450u0(this.f59290R, list);
            if (this.f59331y0) {
                m83452v0(this.f59290R, list);
            }
        }
        if (this.f59298V == null) {
            m83407I0(dVar);
        }
    }

    /* renamed from: t1 */
    private void m83449t1(T t) {
        C15609h d1 = mo68884d1(t);
        if (d1 != null && !d1.mo74951d()) {
            m83447s1(mo68881b1(d1), d1);
        }
    }

    /* renamed from: u0 */
    private void m83450u0(List<T> list, List<T> list2) {
        this.f59294T = new HashSet(list);
        int i = 0;
        int i2 = 0;
        while (i < list2.size()) {
            C12454b<T>.g gVar = this.f59298V;
            if (gVar == null || !gVar.isCancelled()) {
                C15608g gVar2 = (C15608g) list2.get(i);
                if (!this.f59294T.contains(gVar2)) {
                    this.f59370a.mo75143d("calculateAdditions add position=%s item=%s", Integer.valueOf(i), gVar2);
                    if (this.f59331y0) {
                        list.add(gVar2);
                        this.f59296U.add(new C12464i(list.size(), 1));
                    } else {
                        if (i < list.size()) {
                            list.add(i, gVar2);
                        } else {
                            list.add(gVar2);
                        }
                        this.f59296U.add(new C12464i(i, 1));
                    }
                    i2++;
                }
                i++;
            } else {
                return;
            }
        }
        this.f59294T = null;
        this.f59370a.mo75140a("calculateAdditions total new=%s", Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public void m83451u1() {
        if (mo68881b1(this.f59287P0) >= 0) {
            this.f59370a.mo75143d("onLoadMore     remove progressItem", new Object[0]);
            if (this.f59286O0) {
                mo68872V1(this.f59287P0);
            } else {
                mo68870U1(this.f59287P0);
            }
        }
    }

    /* renamed from: v0 */
    private void m83452v0(List<T> list, List<T> list2) {
        int size = list2.size() - 1;
        int i = 0;
        while (size >= 0) {
            C12454b<T>.g gVar = this.f59298V;
            if (gVar == null || !gVar.isCancelled()) {
                int indexOf = list.indexOf((C15608g) list2.get(size));
                if (indexOf >= 0 && indexOf != size) {
                    this.f59370a.mo75143d("calculateMovedItems fromPosition=%s toPosition=%s", Integer.valueOf(indexOf), Integer.valueOf(size));
                    C15608g gVar2 = (C15608g) list.remove(indexOf);
                    if (size < list.size()) {
                        list.add(size, gVar2);
                    } else {
                        list.add(gVar2);
                    }
                    this.f59296U.add(new C12464i(indexOf, size, 4));
                    i++;
                }
                size--;
            } else {
                return;
            }
        }
        this.f59370a.mo75140a("calculateMovedItems total move=%s", Integer.valueOf(i));
    }

    /* renamed from: v1 */
    private void m83453v1() {
        if (this.f59280I0 != null) {
            return;
        }
        if (this.f59375o != null) {
            if (this.f59279H0 == null) {
                this.f59279H0 = new C13420a(this);
                this.f59370a.mo75142c("Initialized default ItemTouchHelperCallback", new Object[0]);
            }
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(this.f59279H0);
            this.f59280I0 = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(this.f59375o);
            return;
        }
        throw new IllegalStateException("RecyclerView cannot be null. Enabling LongPressDrag or Swipe must be done after the Adapter has been attached to the RecyclerView.");
    }

    /* renamed from: w0 */
    private void m83454w0(List<T> list, List<T> list2) {
        Map<T, Integer> x0 = m83455x0(list, list2);
        this.f59294T = new HashSet(list2);
        int size = list.size() - 1;
        int i = 0;
        int i2 = 0;
        while (size >= 0) {
            C12454b<T>.g gVar = this.f59298V;
            if (gVar == null || !gVar.isCancelled()) {
                C15608g gVar2 = (C15608g) list.get(size);
                if (!this.f59294T.contains(gVar2)) {
                    this.f59370a.mo75143d("calculateRemovals remove position=%s item=%s", Integer.valueOf(size), gVar2);
                    list.remove(size);
                    this.f59296U.add(new C12464i(size, 3));
                    i2++;
                } else if (this.f59329w0) {
                    C15608g gVar3 = (C15608g) list2.get(x0.get(gVar2).intValue());
                    if (mo68844A1() || gVar2.mo74953h(gVar3)) {
                        list.set(size, gVar3);
                        this.f59296U.add(new C12464i(size, 2));
                        i++;
                    }
                }
                size--;
            } else {
                return;
            }
        }
        this.f59294T = null;
        this.f59370a.mo75140a("calculateModifications total mod=%s", Integer.valueOf(i));
        this.f59370a.mo75140a("calculateRemovals total out=%s", Integer.valueOf(i2));
    }

    @Nullable
    /* renamed from: x0 */
    private Map<T, Integer> m83455x0(List<T> list, List<T> list2) {
        if (!this.f59329w0) {
            return null;
        }
        this.f59294T = new HashSet(list);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list2.size() && ((r1 = this.f59298V) == null || !r1.isCancelled()); i++) {
            C15608g gVar = (C15608g) list2.get(i);
            if (this.f59294T.contains(gVar)) {
                hashMap.put(gVar, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    /* renamed from: z0 */
    private void m83456z0(int i, int i2) {
        new Handler(Looper.getMainLooper(), new C12455a(i, i2)).sendMessageDelayed(Message.obtain(this.f59311e0), 150);
    }

    /* renamed from: A0 */
    public int mo68843A0(@IntRange(from = 0) int i) {
        return mo68845B0(i, false);
    }

    /* renamed from: A1 */
    public boolean mo68844A1() {
        return this.f59330x0;
    }

    /* renamed from: B0 */
    public int mo68845B0(@IntRange(from = 0) int i, boolean z) {
        C15608g e1 = mo68886e1(i);
        if (!mo68907x1(e1)) {
            return 0;
        }
        C15606e eVar = (C15606e) e1;
        List<C15608g> Y0 = m83423Y0(eVar, true);
        int size = Y0.size();
        this.f59370a.mo75143d("Request to Collapse on position=%s expanded=%s hasSubItemsSelected=%s", Integer.valueOf(i), Boolean.valueOf(eVar.mo74943c()), Boolean.valueOf(m83445r1(i, Y0)));
        if (eVar.mo74943c() && size > 0 && (!m83445r1(i, Y0) || m83436h1(e1) != null)) {
            if (this.f59276E0) {
                m83417Q1(i + 1, Y0, eVar.mo74944e());
            }
            this.f59288Q.removeAll(Y0);
            size = Y0.size();
            eVar.mo74945i(false);
            if (z) {
                notifyItemChanged(i, C12476d.COLLAPSED);
            }
            notifyItemRangeRemoved(i + 1, size);
            if (this.f59321o0 && !mo68848C1(e1)) {
                for (C15608g t1 : Y0) {
                    m83449t1(t1);
                }
            }
            if (!m83403E0(this.f59319m0, eVar)) {
                m83403E0(this.f59320n0, eVar);
            }
            this.f59370a.mo75143d("Collapsed %s subItems on position %s", Integer.valueOf(size), Integer.valueOf(i));
        }
        return size;
    }

    /* renamed from: B1 */
    public final boolean mo68846B1() {
        C13420a aVar = this.f59279H0;
        return aVar != null && aVar.mo70867a();
    }

    /* renamed from: C0 */
    public int mo68847C0() {
        return mo68850D0(this.f59272A0);
    }

    /* renamed from: C1 */
    public boolean mo68848C1(T t) {
        return t != null && (t instanceof C15609h);
    }

    @CallSuper
    /* renamed from: D */
    public void mo68849D() {
        this.f59277F0 = false;
        this.f59278G0 = false;
        super.mo68849D();
    }

    /* renamed from: D0 */
    public int mo68850D0(int i) {
        return m83417Q1(0, this.f59288Q, i);
    }

    /* renamed from: D1 */
    public boolean mo68851D1(int i) {
        C15608g e1 = mo68886e1(i);
        return e1 != null && e1.isEnabled();
    }

    /* renamed from: E1 */
    public final boolean mo68852E1() {
        C13420a aVar = this.f59279H0;
        return aVar != null && aVar.isLongPressDragEnabled();
    }

    /* renamed from: F1 */
    public final synchronized boolean mo68853F1() {
        List<C12454b<T>.s> list;
        list = this.f59312f0;
        return list != null && !list.isEmpty();
    }

    /* renamed from: G1 */
    public final boolean mo68854G1(T t) {
        return (t != null && this.f59319m0.contains(t)) || this.f59320n0.contains(t);
    }

    /* renamed from: H0 */
    public final void mo68855H0() {
        if (mo68908y0()) {
            throw null;
        }
    }

    /* renamed from: J0 */
    public int mo68856J0(@IntRange(from = 0) int i) {
        return mo68858K0(i, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[ADDED_TO_REGION] */
    /* renamed from: J1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68857J1(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo68906w1()
            if (r0 == 0) goto L_0x009d
            boolean r0 = r5.f59284M0
            if (r0 != 0) goto L_0x009d
            l9.g r0 = r5.mo68886e1(r6)
            T r1 = r5.f59287P0
            if (r0 != r1) goto L_0x0014
            goto L_0x009d
        L_0x0014:
            boolean r0 = r5.f59286O0
            r1 = 0
            if (r0 == 0) goto L_0x0029
            int r0 = r5.f59281J0
            boolean r2 = r5.mo68898m1()
            if (r2 == 0) goto L_0x0022
            goto L_0x0036
        L_0x0022:
            java.util.List<T> r2 = r5.f59319m0
            int r2 = r2.size()
            goto L_0x003e
        L_0x0029:
            int r0 = r5.getItemCount()
            int r2 = r5.f59281J0
            int r0 = r0 - r2
            boolean r2 = r5.mo68898m1()
            if (r2 == 0) goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x003e
        L_0x0038:
            java.util.List<T> r2 = r5.f59320n0
            int r2 = r2.size()
        L_0x003e:
            int r0 = r0 - r2
            boolean r2 = r5.f59286O0
            if (r2 != 0) goto L_0x004d
            T r2 = r5.f59287P0
            int r2 = r5.mo68881b1(r2)
            if (r6 == r2) goto L_0x0055
            if (r6 < r0) goto L_0x0055
        L_0x004d:
            boolean r2 = r5.f59286O0
            if (r2 == 0) goto L_0x0056
            if (r6 <= 0) goto L_0x0056
            if (r6 <= r0) goto L_0x0056
        L_0x0055:
            return
        L_0x0056:
            m9.c r3 = r5.f59370a
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r1] = r2
            boolean r1 = r5.f59284M0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r4[r2] = r1
            r1 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r1] = r6
            r6 = 3
            int r1 = r5.getItemCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r6] = r1
            r6 = 4
            int r1 = r5.f59281J0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r6] = r1
            r6 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r6] = r0
            java.lang.String r6 = "onLoadMore     topEndless=%s, loading=%s, position=%s, itemCount=%s threshold=%s, currentThreshold=%s"
            r3.mo75143d(r6, r4)
            r5.f59284M0 = r2
            android.os.Handler r6 = r5.f59311e0
            i9.b$c r0 = new i9.b$c
            r0.<init>()
            r6.post(r0)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p286i9.C12454b.mo68857J1(int):void");
    }

    /* renamed from: K0 */
    public int mo68858K0(@IntRange(from = 0) int i, boolean z) {
        return m83409L0(i, false, false, z);
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: K1 */
    public void mo29732K1() {
        C12467l lVar = this.f59295T0;
        if (lVar != null) {
            lVar.mo68930a(mo68890g1());
        }
    }

    /* renamed from: L */
    public boolean mo68859L(int i) {
        C15608g e1 = mo68886e1(i);
        return e1 != null && e1.mo74958r();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: L1 */
    public void mo68860L1() {
        C12473r rVar = this.f59293S0;
        if (rVar != null) {
            rVar.mo68935a(mo68890g1());
        }
    }

    /* renamed from: M0 */
    public int mo68861M0(T t) {
        return m83409L0(mo68881b1(t), false, false, true);
    }

    /* renamed from: P0 */
    public void mo68862P0(@NonNull List<T> list) {
        this.f59311e0.removeMessages(2);
        Handler handler = this.f59311e0;
        handler.sendMessage(Message.obtain(handler, 2, list));
    }

    /* renamed from: Q */
    public void mo68863Q(@IntRange(from = 0) int i) {
        C15608g e1 = mo68886e1(i);
        if (e1 != null && e1.mo74958r()) {
            C15606e Z0 = mo68876Z0(e1);
            boolean z = Z0 != null;
            if ((mo68907x1(e1) || !z) && !this.f59277F0) {
                this.f59278G0 = true;
                if (z) {
                    this.f59273B0 = Z0.mo74944e();
                }
                super.mo68863Q(i);
            } else if (z && (this.f59273B0 == -1 || (!this.f59278G0 && Z0.mo74944e() + 1 == this.f59273B0))) {
                this.f59277F0 = true;
                this.f59273B0 = Z0.mo74944e() + 1;
                super.mo68863Q(i);
            }
        }
        if (super.mo68944J() == 0) {
            this.f59273B0 = -1;
            this.f59277F0 = false;
            this.f59278G0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public boolean mo68864R0(T t, Serializable serializable) {
        return (t instanceof C15607f) && ((C15607f) t).mo29747j(serializable);
    }

    /* renamed from: R1 */
    public void mo68865R1(@IntRange(from = 0) int i) {
        mo68866S1(i, C12476d.CHANGE);
    }

    /* renamed from: S1 */
    public void mo68866S1(@IntRange(from = 0) int i, @Nullable Object obj) {
        mo68843A0(i);
        this.f59370a.mo75143d("removeItem delegates removal to removeRange", new Object[0]);
        mo68868T1(i, 1, obj);
    }

    @NonNull
    /* renamed from: T0 */
    public final List<T> mo68867T0(@Nullable C15606e eVar) {
        if (eVar == null || !mo68905q1(eVar)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(eVar.mo74946n());
        if (!this.f59312f0.isEmpty()) {
            arrayList.removeAll(mo68871V0(eVar));
        }
        return arrayList;
    }

    /* renamed from: T1 */
    public void mo68868T1(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @Nullable Object obj) {
        int i3;
        List<T> list;
        int itemCount = getItemCount();
        this.f59370a.mo75140a("removeRange positionStart=%s itemCount=%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 0 || (i3 = i + i2) > itemCount) {
            this.f59370a.mo75141b("Cannot removeRange with positionStart OutOfBounds!", new Object[0]);
        } else if (i2 == 0 || itemCount == 0) {
            this.f59370a.mo75144e("removeRange Nothing to delete!", new Object[0]);
        } else {
            C15608g gVar = null;
            C15606e eVar = null;
            for (int i4 = i; i4 < i3; i4++) {
                gVar = mo68886e1(i);
                if (gVar != null) {
                    if (!this.f59317k0) {
                        if (eVar == null) {
                            eVar = mo68876Z0(gVar);
                        }
                        if (eVar == null) {
                            m83404F0(i, gVar);
                        } else {
                            m83405G0(eVar, gVar);
                        }
                    }
                    gVar.mo74956o(true);
                    if (this.f59316j0 && mo68848C1(gVar)) {
                        for (C15610i next : mo68895j1((C15609h) gVar)) {
                            next.mo74963q(null);
                            if (obj != null) {
                                notifyItemChanged(mo68881b1(next), C12476d.UNLINK);
                            }
                        }
                    }
                    this.f59288Q.remove(i);
                    if (this.f59317k0 && (list = this.f59292S) != null) {
                        list.remove(gVar);
                    }
                    mo68947O(i4);
                }
            }
            notifyItemRangeRemoved(i, i2);
            int b1 = mo68881b1(mo68884d1(gVar));
            if (b1 >= 0) {
                notifyItemChanged(b1, obj);
            }
            int b12 = mo68881b1(eVar);
            if (b12 >= 0 && b12 != b1) {
                notifyItemChanged(b12, obj);
            }
            if (this.f59293S0 != null && !this.f59315i0 && itemCount > 0 && getItemCount() == 0) {
                this.f59293S0.mo68935a(mo68890g1());
            }
        }
    }

    @NonNull
    /* renamed from: U0 */
    public final List<T> mo68869U0() {
        return Collections.unmodifiableList(this.f59288Q);
    }

    /* renamed from: U1 */
    public final void mo68870U1(@NonNull T t) {
        if (this.f59320n0.remove(t)) {
            this.f59370a.mo75140a("Remove scrollable footer %s", C15705a.m94970a(t));
            m83412N1(t, true);
        }
    }

    /* renamed from: V */
    public final boolean mo68834V(int i) {
        return mo68854G1(mo68886e1(i));
    }

    @NonNull
    /* renamed from: V0 */
    public final List<T> mo68871V0(C15606e eVar) {
        ArrayList arrayList = new ArrayList();
        for (C12474s next : this.f59312f0) {
            T t = next.f59351c;
            if (t != null && t.equals(eVar) && next.f59350b >= 0) {
                arrayList.add(next.f59352d);
            }
        }
        return arrayList;
    }

    /* renamed from: V1 */
    public final void mo68872V1(@NonNull T t) {
        if (this.f59319m0.remove(t)) {
            this.f59370a.mo75140a("Remove scrollable header %s", C15705a.m94970a(t));
            m83412N1(t, true);
        }
    }

    @NonNull
    /* renamed from: W0 */
    public List<T> mo68873W0() {
        ArrayList arrayList = new ArrayList();
        for (C12454b<T>.s sVar : this.f59312f0) {
            arrayList.add(sVar.f59352d);
        }
        return arrayList;
    }

    /* renamed from: X0 */
    public int mo68874X0() {
        if (this.f59283L0 > 0) {
            return (int) Math.ceil(((double) mo68890g1()) / ((double) this.f59283L0));
        }
        return 0;
    }

    /* renamed from: Y1 */
    public C12454b<T> mo68875Y1(int i) {
        this.f59370a.mo75142c("Set animateToLimit=%s", Integer.valueOf(i));
        this.f59332z0 = i;
        return this;
    }

    @Nullable
    /* renamed from: Z0 */
    public C15606e mo68876Z0(T t) {
        for (T t2 : this.f59288Q) {
            if (mo68907x1(t2)) {
                C15606e eVar = (C15606e) t2;
                if (eVar.mo74943c() && mo68905q1(eVar)) {
                    for (C15608g gVar : eVar.mo74946n()) {
                        if (!gVar.mo74951d() && gVar.equals(t)) {
                            return eVar;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: Z1 */
    public C12454b<T> mo68877Z1(boolean z) {
        this.f59370a.mo75142c("Set setAutoScrollOnExpand=%s", Boolean.valueOf(z));
        this.f59274C0 = z;
        return this;
    }

    /* renamed from: a */
    public void mo68878a(RecyclerView.ViewHolder viewHolder, int i) {
        C12470o oVar = this.f59297U0;
        if (oVar != null) {
            oVar.mo68928a(viewHolder, i);
            return;
        }
        C12471p pVar = this.f59299V0;
        if (pVar != null) {
            pVar.mo68928a(viewHolder, i);
        }
    }

    @Nullable
    /* renamed from: a1 */
    public <F extends Serializable> F mo68879a1(Class<F> cls) {
        return (Serializable) cls.cast(this.f59326t0);
    }

    /* renamed from: a2 */
    public void mo68880a2(@Nullable Serializable serializable) {
        if (serializable instanceof String) {
            serializable = ((String) serializable).trim().toLowerCase(Locale.getDefault());
        }
        this.f59326t0 = serializable;
    }

    /* renamed from: b1 */
    public final int mo68881b1(C15608g gVar) {
        if (gVar != null) {
            return this.f59288Q.indexOf(gVar);
        }
        return -1;
    }

    @NonNull
    /* renamed from: c1 */
    public List<C15609h> mo68882c1() {
        ArrayList arrayList = new ArrayList();
        for (T t : this.f59288Q) {
            if (mo68848C1(t)) {
                arrayList.add((C15609h) t);
            }
        }
        return arrayList;
    }

    @CallSuper
    /* renamed from: d */
    public boolean mo68883d(int i, int i2) {
        mo68885d2(this.f59288Q, i, i2);
        C12470o oVar = this.f59297U0;
        if (oVar == null) {
            return true;
        }
        oVar.mo68932d(i, i2);
        return true;
    }

    @Nullable
    /* renamed from: d1 */
    public C15609h mo68884d1(T t) {
        if (t == null || !(t instanceof C15610i)) {
            return null;
        }
        return ((C15610i) t).mo74962k();
    }

    /* renamed from: d2 */
    public void mo68885d2(List<T> list, int i, int i2) {
        if (i >= 0 && i < getItemCount() && i2 >= 0 && i2 < getItemCount()) {
            this.f59370a.mo75143d("swapItems from=%s [selected? %s] to=%s [selected? %s]", Integer.valueOf(i), Boolean.valueOf(mo68946M(i)), Integer.valueOf(i2), Boolean.valueOf(mo68946M(i2)));
            if (i < i2 && mo68907x1(mo68886e1(i)) && mo68909y1(i2)) {
                mo68843A0(i2);
            }
            if (i < i2) {
                int i3 = i;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    this.f59370a.mo75143d("swapItems from=%s to=%s", Integer.valueOf(i3), Integer.valueOf(i4));
                    Collections.swap(list, i3, i4);
                    mo68948P(i3, i4);
                    i3 = i4;
                }
            } else {
                for (int i5 = i; i5 > i2; i5--) {
                    int i6 = i5 - 1;
                    this.f59370a.mo75143d("swapItems from=%s to=%s", Integer.valueOf(i5), Integer.valueOf(i6));
                    Collections.swap(list, i5, i6);
                    mo68948P(i5, i6);
                }
            }
            notifyItemMoved(i, i2);
            if (this.f59321o0) {
                C15608g e1 = mo68886e1(i2);
                C15608g e12 = mo68886e1(i);
                boolean z = e12 instanceof C15609h;
                if (!z || !(e1 instanceof C15609h)) {
                    if (z) {
                        int i7 = i < i2 ? i2 + 1 : i2;
                        if (i >= i2) {
                            i2 = i + 1;
                        }
                        C15608g e13 = mo68886e1(i7);
                        C15609h i1 = mo68893i1(i7);
                        C12476d dVar = C12476d.LINK;
                        m83406H1(e13, i1, dVar);
                        m83406H1(mo68886e1(i2), (C15609h) e12, dVar);
                    } else if (e1 instanceof C15609h) {
                        int i8 = i < i2 ? i : i + 1;
                        if (i < i2) {
                            i = i2 + 1;
                        }
                        C15608g e14 = mo68886e1(i8);
                        C15609h i12 = mo68893i1(i8);
                        C12476d dVar2 = C12476d.LINK;
                        m83406H1(e14, i12, dVar2);
                        m83406H1(mo68886e1(i), (C15609h) e1, dVar2);
                    } else {
                        int i9 = i < i2 ? i2 : i;
                        if (i >= i2) {
                            i = i2;
                        }
                        C15608g e15 = mo68886e1(i9);
                        C15609h d1 = mo68884d1(e15);
                        if (d1 != null) {
                            C15609h i13 = mo68893i1(i9);
                            if (i13 != null && !i13.equals(d1)) {
                                m83406H1(e15, i13, C12476d.LINK);
                            }
                            m83406H1(mo68886e1(i), d1, C12476d.LINK);
                        }
                    }
                } else if (i < i2) {
                    C15609h hVar = (C15609h) e1;
                    for (C15610i H1 : mo68895j1(hVar)) {
                        m83406H1(H1, hVar, C12476d.LINK);
                    }
                } else {
                    C15609h hVar2 = (C15609h) e12;
                    for (C15610i H12 : mo68895j1(hVar2)) {
                        m83406H1(H12, hVar2, C12476d.LINK);
                    }
                }
            }
        }
    }

    @Nullable
    /* renamed from: e1 */
    public T mo68886e1(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (C15608g) this.f59288Q.get(i);
    }

    @CallSuper
    /* renamed from: f */
    public void mo68887f(int i, int i2) {
        C12471p pVar = this.f59299V0;
        if (pVar != null) {
            pVar.mo68934b(i, i2);
        }
    }

    /* renamed from: f1 */
    public final ItemTouchHelper mo68888f1() {
        m83453v1();
        return this.f59280I0;
    }

    @CallSuper
    /* renamed from: f2 */
    public void mo68889f2(@Nullable List<T> list) {
        mo68891g2(list, false);
    }

    /* renamed from: g1 */
    public final int mo68890g1() {
        return mo68898m1() ? getItemCount() : (getItemCount() - this.f59319m0.size()) - this.f59320n0.size();
    }

    @CallSuper
    /* renamed from: g2 */
    public void mo68891g2(@Nullable List<T> list, boolean z) {
        this.f59292S = null;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (z) {
            this.f59311e0.removeMessages(1);
            Handler handler = this.f59311e0;
            handler.sendMessage(Message.obtain(handler, 1, list));
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        m83415P1(arrayList);
        this.f59288Q = arrayList;
        this.f59370a.mo75144e("updateDataSet with notifyDataSetChanged!", new Object[0]);
        notifyDataSetChanged();
        mo68860L1();
    }

    public int getItemCount() {
        return this.f59288Q.size();
    }

    public long getItemId(int i) {
        C15608g e1 = mo68886e1(i);
        if (e1 != null) {
            return (long) e1.hashCode();
        }
        return -1;
    }

    public int getItemViewType(int i) {
        C15608g e1 = mo68886e1(i);
        if (e1 == null) {
            this.f59370a.mo75141b("Item for ViewType not found! position=%s, items=%s", Integer.valueOf(i), Integer.valueOf(getItemCount()));
            return 0;
        }
        m83408I1(e1);
        this.f59325s0 = true;
        return e1.mo74959t();
    }

    /* renamed from: h2 */
    public void mo68892h2(@IntRange(from = 0) int i, @NonNull T t, @Nullable Object obj) {
        if (t == null) {
            this.f59370a.mo75141b("updateItem No Item to update!", new Object[0]);
            return;
        }
        int itemCount = getItemCount();
        if (i < 0 || i >= itemCount) {
            this.f59370a.mo75141b("Cannot updateItem on position out of OutOfBounds!", new Object[0]);
            return;
        }
        this.f59288Q.set(i, t);
        C15707c cVar = this.f59370a;
        cVar.mo75140a("updateItem notifyItemChanged on position " + i, new Object[0]);
        notifyItemChanged(i, obj);
    }

    /* renamed from: i1 */
    public C15609h mo68893i1(@IntRange(from = 0) int i) {
        if (!this.f59321o0) {
            return null;
        }
        while (i >= 0) {
            C15608g e1 = mo68886e1(i);
            if (mo68848C1(e1)) {
                return (C15609h) e1;
            }
            i--;
        }
        return null;
    }

    /* renamed from: i2 */
    public void mo68894i2(@NonNull T t) {
        mo68896j2(t, (Object) null);
    }

    @NonNull
    /* renamed from: j1 */
    public List<C15610i> mo68895j1(@NonNull C15609h hVar) {
        ArrayList arrayList = new ArrayList();
        int b1 = mo68881b1(hVar) + 1;
        C15608g e1 = mo68886e1(b1);
        while (mo68903p1(e1, hVar)) {
            arrayList.add((C15610i) e1);
            b1++;
            e1 = mo68886e1(b1);
        }
        return arrayList;
    }

    /* renamed from: j2 */
    public void mo68896j2(@NonNull T t, @Nullable Object obj) {
        mo68892h2(mo68881b1(t), t, obj);
    }

    /* renamed from: k1 */
    public final int mo68897k1() {
        if (!mo68908y0()) {
            return -1;
        }
        throw null;
    }

    /* renamed from: m1 */
    public boolean mo68898m1() {
        Serializable serializable = this.f59326t0;
        if (serializable instanceof String) {
            return !((String) mo68879a1(String.class)).isEmpty();
        }
        if (serializable != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public boolean mo68899n1(T t) {
        return mo68884d1(t) != null;
    }

    @CallSuper
    /* renamed from: o0 */
    public C12454b<T> mo68900o0(Object obj) {
        if (obj == null) {
            this.f59370a.mo75141b("Invalid listener class: null", new Object[0]);
            return this;
        }
        this.f59370a.mo75142c("Adding listener class %s as:", C15705a.m94970a(obj));
        if (obj instanceof C12468m) {
            this.f59370a.mo75142c("- OnItemClickListener", new Object[0]);
            this.f59289Q0 = (C12468m) obj;
            for (C15763c next : mo68940F()) {
                next.mo75399t().setOnClickListener(next);
            }
        }
        if (obj instanceof C12469n) {
            this.f59370a.mo75142c("- OnItemLongClickListener", new Object[0]);
            this.f59291R0 = (C12469n) obj;
            for (C15763c next2 : mo68940F()) {
                next2.mo75399t().setOnLongClickListener(next2);
            }
        }
        if (obj instanceof C12470o) {
            this.f59370a.mo75142c("- OnItemMoveListener", new Object[0]);
            this.f59297U0 = (C12470o) obj;
        }
        if (obj instanceof C12471p) {
            this.f59370a.mo75142c("- OnItemSwipeListener", new Object[0]);
            this.f59299V0 = (C12471p) obj;
        }
        if (obj instanceof C12466k) {
            this.f59370a.mo75142c("- OnDeleteCompleteListener", new Object[0]);
            this.f59303X0 = (C12466k) obj;
        }
        if (obj instanceof C12472q) {
            this.f59370a.mo75142c("- OnStickyHeaderChangeListener", new Object[0]);
            this.f59305Y0 = (C12472q) obj;
        }
        if (obj instanceof C12473r) {
            this.f59370a.mo75142c("- OnUpdateListener", new Object[0]);
            C12473r rVar = (C12473r) obj;
            this.f59293S0 = rVar;
            rVar.mo68935a(mo68890g1());
        }
        if (obj instanceof C12467l) {
            this.f59370a.mo75142c("- OnFilterListener", new Object[0]);
            this.f59295T0 = (C12467l) obj;
        }
        return this;
    }

    /* renamed from: o1 */
    public boolean mo68901o1(Serializable serializable) {
        if (serializable instanceof String) {
            Serializable serializable2 = this.f59327u0;
            if (serializable2 instanceof String) {
                return !((String) serializable2).equalsIgnoreCase((String) serializable);
            }
        }
        Serializable serializable3 = this.f59327u0;
        if (serializable3 == null || !serializable3.equals(serializable)) {
            return true;
        }
        return false;
    }

    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f59370a.mo75143d("Attached Adapter to RecyclerView", new Object[0]);
        if (this.f59321o0 && mo68908y0()) {
            throw null;
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, i, Collections.unmodifiableList(new ArrayList()));
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        C15608g l1 = m83441l1(i);
        if (l1 == null || !this.f59325s0) {
            throw new IllegalStateException(String.format("ViewType instance not found for viewType %s. You should implement the AutoMap properly.", new Object[]{Integer.valueOf(i)}));
        }
        if (this.f59323q0 == null) {
            this.f59323q0 = LayoutInflater.from(viewGroup.getContext());
        }
        return l1.mo29472s(this.f59323q0.inflate(l1.mo29471l(), viewGroup, false), this);
    }

    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (!mo68908y0()) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f59370a.mo75143d("Detached Adapter from RecyclerView", new Object[0]);
            return;
        }
        throw null;
    }

    @CallSuper
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        int adapterPosition = viewHolder.getAdapterPosition();
        C15608g e1 = mo68886e1(adapterPosition);
        if (e1 != null) {
            e1.mo74955m(this, viewHolder, adapterPosition);
        }
    }

    @CallSuper
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        int adapterPosition = viewHolder.getAdapterPosition();
        C15608g e1 = mo68886e1(adapterPosition);
        if (e1 != null) {
            e1.mo74952f(this, viewHolder, adapterPosition);
        }
    }

    @CallSuper
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (mo68908y0()) {
            viewHolder.itemView.setVisibility(0);
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        C15608g e1 = mo68886e1(adapterPosition);
        if (e1 != null) {
            e1.mo74961v(this, viewHolder, adapterPosition);
        }
    }

    /* renamed from: p0 */
    public final boolean mo68902p0(@NonNull T t) {
        if (!this.f59320n0.contains(t)) {
            this.f59370a.mo75140a("Add scrollable footer %s", C15705a.m94970a(t));
            t.mo74960u(false);
            t.mo74957p(false);
            int size = t == this.f59287P0 ? this.f59320n0.size() : 0;
            if (size <= 0 || this.f59320n0.size() <= 0) {
                this.f59320n0.add(t);
            } else {
                this.f59320n0.add(0, t);
            }
            m83410M1(getItemCount() - size, Collections.singletonList(t), true);
            return true;
        }
        this.f59370a.mo75144e("Scrollable footer %s already added", C15705a.m94970a(t));
        return false;
    }

    /* renamed from: p1 */
    public boolean mo68903p1(T t, C15609h hVar) {
        C15609h d1 = mo68884d1(t);
        return (d1 == null || hVar == null || !d1.equals(hVar)) ? false : true;
    }

    /* renamed from: q0 */
    public final boolean mo68904q0(@NonNull T t) {
        this.f59370a.mo75140a("Add scrollable header %s", C15705a.m94970a(t));
        if (!this.f59319m0.contains(t)) {
            t.mo74960u(false);
            t.mo74957p(false);
            int size = t == this.f59287P0 ? this.f59319m0.size() : 0;
            this.f59319m0.add(t);
            mo68835W(true);
            m83410M1(size, Collections.singletonList(t), true);
            mo68835W(false);
            return true;
        }
        this.f59370a.mo75144e("Scrollable header %s already added", C15705a.m94970a(t));
        return false;
    }

    /* renamed from: q1 */
    public boolean mo68905q1(C15606e eVar) {
        return (eVar == null || eVar.mo74946n() == null || eVar.mo74946n().size() <= 0) ? false : true;
    }

    /* renamed from: w1 */
    public boolean mo68906w1() {
        return this.f59285N0;
    }

    /* renamed from: x1 */
    public boolean mo68907x1(@Nullable T t) {
        return t instanceof C15606e;
    }

    /* renamed from: y0 */
    public boolean mo68908y0() {
        return false;
    }

    /* renamed from: y1 */
    public boolean mo68909y1(@IntRange(from = 0) int i) {
        return mo68911z1(mo68886e1(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = r2.f59297U0;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo68910z(int r3, int r4) {
        /*
            r2 = this;
            l9.g r0 = r2.mo68886e1(r4)
            java.util.List<T> r1 = r2.f59319m0
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0020
            java.util.List<T> r1 = r2.f59320n0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0020
            i9.b$o r0 = r2.f59297U0
            if (r0 == 0) goto L_0x001e
            boolean r3 = r0.mo68933e(r3, r4)
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p286i9.C12454b.mo68910z(int, int):boolean");
    }

    /* renamed from: z1 */
    public boolean mo68911z1(@Nullable T t) {
        return mo68907x1(t) && ((C15606e) t).mo74943c();
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        if (this.f59325s0) {
            super.onBindViewHolder(viewHolder, i, list);
            C15608g e1 = mo68886e1(i);
            if (e1 != null) {
                viewHolder.itemView.setEnabled(e1.isEnabled());
                e1.mo29469g(this, viewHolder, i, list);
                if (mo68908y0() && mo68848C1(e1) && !this.f59377s) {
                    throw null;
                }
            }
            mo68857J1(i);
            mo68833S(viewHolder, i);
            return;
        }
        throw new IllegalStateException("AutoMap is not active, this method cannot be called. You should implement the AutoMap properly.");
    }

    /* renamed from: i9.b$i */
    /* compiled from: FlexibleAdapter */
    private static class C12464i {

        /* renamed from: a */
        int f59346a;

        /* renamed from: b */
        int f59347b;

        /* renamed from: c */
        int f59348c;

        public C12464i(int i, int i2) {
            this.f59347b = i;
            this.f59348c = i2;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Notification{operation=");
            sb.append(this.f59348c);
            if (this.f59348c == 4) {
                str = ", fromPosition=" + this.f59346a;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(", position=");
            sb.append(this.f59347b);
            sb.append('}');
            return sb.toString();
        }

        public C12464i(int i, int i2, int i3) {
            this(i2, i3);
            this.f59346a = i;
        }
    }
}
