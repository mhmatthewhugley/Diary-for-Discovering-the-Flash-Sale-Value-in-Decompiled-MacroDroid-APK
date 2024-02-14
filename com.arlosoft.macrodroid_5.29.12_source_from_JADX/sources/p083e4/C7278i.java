package p083e4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p063b5.C2250c;
import p063b5.C2252e;
import p063b5.C2253f;
import p067c5.C2278h;
import p090f5.C7316k;
import p120k4.C7580a;
import p185w4.C10336c;
import p196y4.C10410c;
import p196y4.C10412d;
import p196y4.C10417h;
import p196y4.C10418i;
import p196y4.C10425m;
import p196y4.C10426n;
import p196y4.C10429p;

/* renamed from: e4.i */
/* compiled from: RequestManager */
public class C7278i implements C10418i {

    /* renamed from: l */
    private static final C2253f f17774l = ((C2253f) C2253f.m9244s0(Bitmap.class).mo24484R());

    /* renamed from: m */
    private static final C2253f f17775m = ((C2253f) C2253f.m9244s0(C10336c.class).mo24484R());

    /* renamed from: n */
    private static final C2253f f17776n = ((C2253f) ((C2253f) C2253f.m9245t0(C7580a.f18490c).mo24492a0(C7275g.LOW)).mo24506j0(true));

    /* renamed from: a */
    protected final C7271c f17777a;

    /* renamed from: b */
    protected final Context f17778b;

    /* renamed from: c */
    final C10417h f17779c;
    @GuardedBy("this")

    /* renamed from: d */
    private final C10426n f17780d;
    @GuardedBy("this")

    /* renamed from: e */
    private final C10425m f17781e;
    @GuardedBy("this")

    /* renamed from: f */
    private final C10429p f17782f;

    /* renamed from: g */
    private final Runnable f17783g;

    /* renamed from: h */
    private final Handler f17784h;

    /* renamed from: i */
    private final C10410c f17785i;

    /* renamed from: j */
    private final CopyOnWriteArrayList<C2252e<Object>> f17786j;
    @GuardedBy("this")

    /* renamed from: k */
    private C2253f f17787k;

    /* renamed from: e4.i$a */
    /* compiled from: RequestManager */
    class C7279a implements Runnable {
        C7279a() {
        }

        public void run() {
            C7278i iVar = C7278i.this;
            iVar.f17779c.mo41104a(iVar);
        }
    }

    /* renamed from: e4.i$b */
    /* compiled from: RequestManager */
    private class C7280b implements C10410c.C10411a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a */
        private final C10426n f17789a;

        C7280b(@NonNull C10426n nVar) {
            this.f17789a = nVar;
        }

        /* renamed from: a */
        public void mo37198a(boolean z) {
            if (z) {
                synchronized (C7278i.this) {
                    this.f17789a.mo41134e();
                }
            }
        }
    }

    public C7278i(@NonNull C7271c cVar, @NonNull C10417h hVar, @NonNull C10425m mVar, @NonNull Context context) {
        this(cVar, hVar, mVar, new C10426n(), cVar.mo37144g(), context);
    }

    /* renamed from: z */
    private void m30065z(@NonNull C2278h<?> hVar) {
        if (!mo37196y(hVar) && !this.f17777a.mo37153p(hVar) && hVar.mo24583c() != null) {
            C2250c c = hVar.mo24583c();
            hVar.mo24585g((C2250c) null);
            c.clear();
        }
    }

    /* renamed from: N */
    public synchronized void mo24581N() {
        mo37192u();
        this.f17782f.mo24581N();
    }

    @CheckResult
    @NonNull
    /* renamed from: i */
    public <ResourceType> C7276h<ResourceType> mo37179i(@NonNull Class<ResourceType> cls) {
        return new C7276h<>(this.f17777a, this, cls, this.f17778b);
    }

    @CheckResult
    @NonNull
    /* renamed from: j */
    public C7276h<Bitmap> mo37180j() {
        return mo37179i(Bitmap.class).mo24491a(f17774l);
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public C7276h<Drawable> mo37181k() {
        return mo37179i(Drawable.class);
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public C7276h<C10336c> mo37182l() {
        return mo37179i(C10336c.class).mo24491a(f17775m);
    }

    /* renamed from: m */
    public synchronized void mo37183m(@Nullable C2278h<?> hVar) {
        if (hVar != null) {
            m30065z(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<C2252e<Object>> mo37184n() {
        return this.f17786j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized C2253f mo37185o() {
        return this.f17787k;
    }

    public synchronized void onDestroy() {
        this.f17782f.onDestroy();
        for (C2278h<?> m : this.f17782f.mo41145j()) {
            mo37183m(m);
        }
        this.f17782f.mo41144i();
        this.f17780d.mo41132c();
        this.f17779c.mo41105b(this);
        this.f17779c.mo41105b(this.f17785i);
        this.f17784h.removeCallbacks(this.f17783g);
        this.f17777a.mo37155s(this);
    }

    public synchronized void onStart() {
        mo37193v();
        this.f17782f.onStart();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: p */
    public <T> C7281j<?, T> mo37186p(Class<T> cls) {
        return this.f17777a.mo37146i().mo37162e(cls);
    }

    @CheckResult
    @NonNull
    /* renamed from: q */
    public C7276h<Drawable> mo37187q(@Nullable Bitmap bitmap) {
        return mo37181k().mo37170I0(bitmap);
    }

    @CheckResult
    @NonNull
    /* renamed from: r */
    public C7276h<Drawable> mo37188r(@Nullable Uri uri) {
        return mo37181k().mo37171J0(uri);
    }

    @CheckResult
    @NonNull
    /* renamed from: s */
    public C7276h<Drawable> mo37189s(@Nullable File file) {
        return mo37181k().mo37172K0(file);
    }

    @CheckResult
    @NonNull
    /* renamed from: t */
    public C7276h<Drawable> mo37190t(@Nullable String str) {
        return mo37181k().mo37175N0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f17780d + ", treeNode=" + this.f17781e + "}";
    }

    /* renamed from: u */
    public synchronized void mo37192u() {
        this.f17780d.mo41133d();
    }

    /* renamed from: v */
    public synchronized void mo37193v() {
        this.f17780d.mo41135f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public synchronized void mo37194w(@NonNull C2253f fVar) {
        this.f17787k = (C2253f) ((C2253f) fVar.clone()).mo24493b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized void mo37195x(@NonNull C2278h<?> hVar, @NonNull C2250c cVar) {
        this.f17782f.mo41146k(hVar);
        this.f17780d.mo41136g(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized boolean mo37196y(@NonNull C2278h<?> hVar) {
        C2250c c = hVar.mo24583c();
        if (c == null) {
            return true;
        }
        if (!this.f17780d.mo41131b(c)) {
            return false;
        }
        this.f17782f.mo41147l(hVar);
        hVar.mo24585g((C2250c) null);
        return true;
    }

    C7278i(C7271c cVar, C10417h hVar, C10425m mVar, C10426n nVar, C10412d dVar, Context context) {
        this.f17782f = new C10429p();
        C7279a aVar = new C7279a();
        this.f17783g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f17784h = handler;
        this.f17777a = cVar;
        this.f17779c = hVar;
        this.f17781e = mVar;
        this.f17780d = nVar;
        this.f17778b = context;
        C10410c a = dVar.mo41109a(context.getApplicationContext(), new C7280b(nVar));
        this.f17785i = a;
        if (C7316k.m30220o()) {
            handler.post(aVar);
        } else {
            hVar.mo41104a(this);
        }
        hVar.mo41104a(a);
        this.f17786j = new CopyOnWriteArrayList<>(cVar.mo37146i().mo37160c());
        mo37194w(cVar.mo37146i().mo37161d());
        cVar.mo37149o(this);
    }
}
