package p076d1;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.C13706o;
import p076d1.C7232g;

/* renamed from: d1.i */
/* compiled from: BubbleShowCaseBuilder.kt */
public final class C7237i {

    /* renamed from: a */
    private WeakReference<Activity> f17647a;

    /* renamed from: b */
    private Drawable f17648b;

    /* renamed from: c */
    private String f17649c;

    /* renamed from: d */
    private String f17650d;

    /* renamed from: e */
    private Drawable f17651e;

    /* renamed from: f */
    private Integer f17652f;

    /* renamed from: g */
    private Integer f17653g;

    /* renamed from: h */
    private Integer f17654h;

    /* renamed from: i */
    private Integer f17655i;

    /* renamed from: j */
    private C7232g.C7234b f17656j;

    /* renamed from: k */
    private boolean f17657k;

    /* renamed from: l */
    private boolean f17658l;

    /* renamed from: m */
    private String f17659m;

    /* renamed from: n */
    private Boolean f17660n;

    /* renamed from: o */
    private Boolean f17661o;

    /* renamed from: p */
    private final ArrayList<C7232g.C7233a> f17662p = new ArrayList<>();

    /* renamed from: q */
    private WeakReference<View> f17663q;

    /* renamed from: r */
    private C7238j f17664r;

    /* renamed from: s */
    private C7243n f17665s;

    /* renamed from: t */
    private ViewTreeObserver.OnGlobalLayoutListener f17666t;

    public C7237i(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f17647a = new WeakReference<>(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m29905C(C7232g gVar, View view, C7237i iVar) {
        C13706o.m87929f(gVar, "$bubbleShowCase");
        C13706o.m87929f(iVar, "this$0");
        gVar.mo37066E();
        view.getViewTreeObserver().removeOnGlobalLayoutListener(iVar.f17666t);
    }

    /* renamed from: c */
    private final C7232g m29907c() {
        if (this.f17660n == null) {
            this.f17660n = Boolean.TRUE;
        }
        if (this.f17661o == null) {
            this.f17661o = Boolean.TRUE;
        }
        return new C7232g(this);
    }

    /* renamed from: A */
    public final C7237i mo37071A(C7243n nVar) {
        C13706o.m87929f(nVar, "sequenceShowCaseListener");
        this.f17665s = nVar;
        return this;
    }

    /* renamed from: B */
    public final C7232g mo37072B() {
        C7232g c = m29907c();
        WeakReference<View> weakReference = this.f17663q;
        if (weakReference != null) {
            C13706o.m87926c(weakReference);
            View view = (View) weakReference.get();
            C13706o.m87926c(view);
            if (view.getHeight() == 0 || view.getWidth() == 0) {
                this.f17666t = new C11932h(c, view, this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f17666t);
            } else {
                c.mo37066E();
            }
        } else {
            c.mo37066E();
        }
        return c;
    }

    /* renamed from: D */
    public final C7237i mo37073D(View view) {
        C13706o.m87929f(view, "targetView");
        this.f17663q = new WeakReference<>(view);
        return this;
    }

    /* renamed from: E */
    public final C7237i mo37074E(String str) {
        C13706o.m87929f(str, "title");
        this.f17649c = str;
        return this;
    }

    /* renamed from: b */
    public final C7237i mo37075b(int i) {
        this.f17652f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final C7237i mo37076d(String str) {
        C13706o.m87929f(str, "subtitle");
        this.f17650d = str;
        return this;
    }

    /* renamed from: e */
    public final WeakReference<Activity> mo37077e() {
        return this.f17647a;
    }

    /* renamed from: f */
    public final ArrayList<C7232g.C7233a> mo37078f() {
        return this.f17662p;
    }

    /* renamed from: g */
    public final Integer mo37079g() {
        return this.f17652f;
    }

    /* renamed from: h */
    public final C7238j mo37080h() {
        return this.f17664r;
    }

    /* renamed from: i */
    public final Drawable mo37081i() {
        return this.f17651e;
    }

    /* renamed from: j */
    public final boolean mo37082j() {
        return this.f17658l;
    }

    /* renamed from: k */
    public final boolean mo37083k() {
        return this.f17657k;
    }

    /* renamed from: l */
    public final C7232g.C7234b mo37084l() {
        return this.f17656j;
    }

    /* renamed from: m */
    public final Drawable mo37085m() {
        return this.f17648b;
    }

    /* renamed from: n */
    public final Boolean mo37086n() {
        return this.f17660n;
    }

    /* renamed from: o */
    public final Boolean mo37087o() {
        return this.f17661o;
    }

    /* renamed from: p */
    public final C7243n mo37088p() {
        return this.f17665s;
    }

    /* renamed from: q */
    public final String mo37089q() {
        return this.f17659m;
    }

    /* renamed from: r */
    public final String mo37090r() {
        return this.f17650d;
    }

    /* renamed from: s */
    public final Integer mo37091s() {
        return this.f17655i;
    }

    /* renamed from: t */
    public final WeakReference<View> mo37092t() {
        return this.f17663q;
    }

    /* renamed from: u */
    public final Integer mo37093u() {
        return this.f17653g;
    }

    /* renamed from: v */
    public final String mo37094v() {
        return this.f17649c;
    }

    /* renamed from: w */
    public final Integer mo37095w() {
        return this.f17654h;
    }

    /* renamed from: x */
    public final C7237i mo37096x(boolean z) {
        this.f17660n = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: y */
    public final C7237i mo37097y(boolean z) {
        this.f17661o = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: z */
    public final C7237i mo37098z(C7238j jVar) {
        C13706o.m87929f(jVar, "bubbleShowCaseListener");
        this.f17664r = jVar;
        return this;
    }
}
