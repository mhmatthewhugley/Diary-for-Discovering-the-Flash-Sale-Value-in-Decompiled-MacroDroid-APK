package p076d1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.bubbleshowcase.BubbleMessageView;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: d1.g */
/* compiled from: BubbleShowCase.kt */
public final class C7232g {

    /* renamed from: A */
    private BubbleMessageView.C3878a f17610A;

    /* renamed from: a */
    private final String f17611a = "BubbleShowCasePrefs";

    /* renamed from: b */
    private final int f17612b = 731;

    /* renamed from: c */
    private final int f17613c = 200;

    /* renamed from: d */
    private final int f17614d;

    /* renamed from: e */
    private final int f17615e = TypedValues.Transition.TYPE_DURATION;

    /* renamed from: f */
    private final int f17616f = 420;

    /* renamed from: g */
    private final WeakReference<Activity> f17617g;

    /* renamed from: h */
    private final Drawable f17618h;

    /* renamed from: i */
    private final String f17619i;

    /* renamed from: j */
    private final String f17620j;

    /* renamed from: k */
    private final Drawable f17621k;

    /* renamed from: l */
    private final Integer f17622l;

    /* renamed from: m */
    private final Integer f17623m;

    /* renamed from: n */
    private final Integer f17624n;

    /* renamed from: o */
    private final Integer f17625o;

    /* renamed from: p */
    private final String f17626p;

    /* renamed from: q */
    private final boolean f17627q;

    /* renamed from: r */
    private final boolean f17628r;

    /* renamed from: s */
    private final C7234b f17629s;

    /* renamed from: t */
    private final List<C7233a> f17630t;

    /* renamed from: u */
    private final WeakReference<View> f17631u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C7238j f17632v;

    /* renamed from: w */
    private final C7243n f17633w;

    /* renamed from: x */
    private final boolean f17634x;

    /* renamed from: y */
    private final boolean f17635y;

    /* renamed from: z */
    private RelativeLayout f17636z;

    /* renamed from: d1.g$a */
    /* compiled from: BubbleShowCase.kt */
    public enum C7233a {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    /* renamed from: d1.g$b */
    /* compiled from: BubbleShowCase.kt */
    public enum C7234b {
        VIEW_LAYOUT,
        VIEW_SURFACE
    }

    /* renamed from: d1.g$c */
    /* compiled from: BubbleShowCase.kt */
    public /* synthetic */ class C7235c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17645a;

        static {
            int[] iArr = new int[C7233a.values().length];
            iArr[C7233a.LEFT.ordinal()] = 1;
            iArr[C7233a.RIGHT.ordinal()] = 2;
            iArr[C7233a.TOP.ordinal()] = 3;
            iArr[C7233a.BOTTOM.ordinal()] = 4;
            f17645a = iArr;
        }
    }

    /* renamed from: d1.g$d */
    /* compiled from: BubbleShowCase.kt */
    public static final class C7236d implements C7241l {

        /* renamed from: a */
        final /* synthetic */ C7232g f17646a;

        C7236d(C7232g gVar) {
            this.f17646a = gVar;
        }

        /* renamed from: a */
        public void mo37069a() {
            this.f17646a.mo37067j();
            C7238j d = this.f17646a.f17632v;
            if (d != null) {
                d.mo30523d(this.f17646a);
            }
        }

        /* renamed from: b */
        public void mo37070b() {
            C7238j d = this.f17646a.f17632v;
            if (d != null) {
                d.mo30521b(this.f17646a);
            }
        }
    }

    public C7232g(C7237i iVar) {
        C13706o.m87929f(iVar, "builder");
        WeakReference<Activity> e = iVar.mo37077e();
        C13706o.m87926c(e);
        this.f17617g = e;
        this.f17618h = iVar.mo37085m();
        this.f17619i = iVar.mo37094v();
        this.f17620j = iVar.mo37090r();
        this.f17621k = iVar.mo37081i();
        this.f17622l = iVar.mo37079g();
        this.f17623m = iVar.mo37093u();
        this.f17624n = iVar.mo37095w();
        this.f17625o = iVar.mo37091s();
        this.f17626p = iVar.mo37089q();
        this.f17627q = iVar.mo37083k();
        this.f17628r = iVar.mo37082j();
        this.f17629s = iVar.mo37084l();
        this.f17630t = iVar.mo37078f();
        this.f17631u = iVar.mo37092t();
        this.f17632v = iVar.mo37080h();
        this.f17633w = iVar.mo37088p();
        Boolean n = iVar.mo37086n();
        C13706o.m87926c(n);
        this.f17634x = n.booleanValue();
        Boolean o = iVar.mo37087o();
        C13706o.m87926c(o);
        this.f17635y = o.booleanValue();
    }

    /* renamed from: A */
    private final void m29866A(String str) {
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        SharedPreferences sharedPreferences = ((Activity) obj).getSharedPreferences(this.f17611a, 0);
        C13706o.m87928e(sharedPreferences, "mPrefs");
        m29869D(sharedPreferences, str, str);
    }

    /* renamed from: B */
    private final void m29867B(RelativeLayout relativeLayout) {
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C11929d(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m29868C(C7232g gVar, View view) {
        C13706o.m87929f(gVar, "this$0");
        C7238j jVar = gVar.f17632v;
        if (jVar != null) {
            jVar.mo30520a(gVar);
        }
    }

    /* renamed from: D */
    private final void m29869D(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m29870F(C7232g gVar) {
        C7233a aVar;
        List<C7233a> list;
        C13706o.m87929f(gVar, "this$0");
        Object obj = gVar.f17631u.get();
        C13706o.m87926c(obj);
        View view = (View) obj;
        if (gVar.f17630t.isEmpty()) {
            C7242m mVar = C7242m.f17670a;
            Object obj2 = gVar.f17617g.get();
            C13706o.m87926c(obj2);
            if (mVar.mo37109h((Activity) obj2, view)) {
                list = gVar.f17630t;
                aVar = C7233a.TOP;
            } else {
                list = gVar.f17630t;
                aVar = C7233a.BOTTOM;
            }
            list.add(aVar);
            gVar.f17610A = gVar.m29884m();
        }
        if (gVar.m29896y(view)) {
            gVar.m29880g(view, gVar.f17636z);
            BubbleMessageView.C3878a aVar2 = gVar.f17610A;
            C13706o.m87926c(aVar2);
            gVar.m29878e(view, aVar2, gVar.f17636z);
            return;
        }
        gVar.mo37067j();
    }

    /* renamed from: G */
    private final Bitmap m29871G(View view, C7234b bVar) {
        if (bVar == null || bVar == C7234b.VIEW_LAYOUT) {
            return m29872H(view);
        }
        return m29873I(view);
    }

    /* renamed from: H */
    private final Bitmap m29872H(View view) {
        if (!(view.getWidth() == 0 || view.getHeight() == 0)) {
            Object obj = this.f17617g.get();
            C13706o.m87926c(obj);
            View childAt = m29891t((Activity) obj).getChildAt(0);
            childAt.buildDrawingCache();
            try {
                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache(), m29892u(view), m29893v(view), view.getWidth(), view.getHeight());
                childAt.setDrawingCacheEnabled(false);
                childAt.destroyDrawingCache();
                return createBitmap;
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: I */
    private final Bitmap m29873I(View view) {
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        C13706o.m87928e(createBitmap, "createBitmap(targetView.drawingCache)");
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: e */
    private final void m29878e(View view, BubbleMessageView.C3878a aVar, RelativeLayout relativeLayout) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int i7 = C7235c.f17645a[aVar.mo27459g().get(0).ordinal()];
            if (i7 == 1) {
                layoutParams.addRule(9);
                C7242m mVar = C7242m.f17670a;
                Object obj = this.f17617g.get();
                C13706o.m87926c(obj);
                if (mVar.mo37109h((Activity) obj, view)) {
                    int u = m29892u(view) + view.getWidth();
                    int v = m29893v(view);
                    if (m29895x()) {
                        Object obj2 = this.f17617g.get();
                        C13706o.m87926c(obj2);
                        int r = m29889r((Context) obj2) - (m29892u(view) + view.getWidth());
                        Object obj3 = this.f17617g.get();
                        C13706o.m87926c(obj3);
                        i2 = r - m29885n(m29889r((Context) obj3) - (m29892u(view) + view.getWidth()));
                    } else {
                        i2 = 0;
                    }
                    layoutParams.setMargins(u, v, i2, 0);
                    layoutParams.addRule(10);
                } else {
                    int u2 = m29892u(view) + view.getWidth();
                    if (m29895x()) {
                        Object obj4 = this.f17617g.get();
                        C13706o.m87926c(obj4);
                        int r2 = m29889r((Context) obj4) - (m29892u(view) + view.getWidth());
                        Object obj5 = this.f17617g.get();
                        C13706o.m87926c(obj5);
                        i = r2 - m29885n(m29889r((Context) obj5) - (m29892u(view) + view.getWidth()));
                    } else {
                        i = 0;
                    }
                    Object obj6 = this.f17617g.get();
                    C13706o.m87926c(obj6);
                    layoutParams.setMargins(u2, 0, i, (m29886o((Context) obj6) - m29893v(view)) - view.getHeight());
                    layoutParams.addRule(12);
                }
            } else if (i7 == 2) {
                layoutParams.addRule(11);
                C7242m mVar2 = C7242m.f17670a;
                Object obj7 = this.f17617g.get();
                C13706o.m87926c(obj7);
                if (mVar2.mo37109h((Activity) obj7, view)) {
                    int u3 = m29895x() ? m29892u(view) - m29885n(m29892u(view)) : 0;
                    int v2 = m29893v(view);
                    Object obj8 = this.f17617g.get();
                    C13706o.m87926c(obj8);
                    layoutParams.setMargins(u3, v2, m29889r((Context) obj8) - m29892u(view), 0);
                    layoutParams.addRule(10);
                } else {
                    int u4 = m29895x() ? m29892u(view) - m29885n(m29892u(view)) : 0;
                    Object obj9 = this.f17617g.get();
                    C13706o.m87926c(obj9);
                    int r3 = m29889r((Context) obj9) - m29892u(view);
                    Object obj10 = this.f17617g.get();
                    C13706o.m87926c(obj10);
                    layoutParams.setMargins(u4, 0, r3, (m29886o((Context) obj10) - m29893v(view)) - view.getHeight());
                    layoutParams.addRule(12);
                }
            } else if (i7 == 3) {
                layoutParams.addRule(10);
                C7242m mVar3 = C7242m.f17670a;
                Object obj11 = this.f17617g.get();
                C13706o.m87926c(obj11);
                if (mVar3.mo37108g((Activity) obj11, view)) {
                    int u5 = m29895x() ? m29892u(view) : 0;
                    int v3 = m29893v(view) + view.getHeight();
                    if (m29895x()) {
                        Object obj12 = this.f17617g.get();
                        C13706o.m87926c(obj12);
                        int r4 = m29889r((Context) obj12) - m29892u(view);
                        Object obj13 = this.f17617g.get();
                        C13706o.m87926c(obj13);
                        i4 = r4 - m29885n(m29889r((Context) obj13) - m29892u(view));
                    } else {
                        i4 = 0;
                    }
                    layoutParams.setMargins(u5, v3, i4, 0);
                } else {
                    int u6 = m29895x() ? (m29892u(view) + view.getWidth()) - m29885n(m29892u(view)) : 0;
                    int v4 = m29893v(view) + view.getHeight();
                    if (m29895x()) {
                        Object obj14 = this.f17617g.get();
                        C13706o.m87926c(obj14);
                        i3 = (m29889r((Context) obj14) - m29892u(view)) - view.getWidth();
                    } else {
                        i3 = 0;
                    }
                    layoutParams.setMargins(u6, v4, i3, 0);
                }
            } else if (i7 == 4) {
                layoutParams.addRule(12);
                C7242m mVar4 = C7242m.f17670a;
                Object obj15 = this.f17617g.get();
                C13706o.m87926c(obj15);
                if (mVar4.mo37108g((Activity) obj15, view)) {
                    int u7 = m29895x() ? m29892u(view) : 0;
                    if (m29895x()) {
                        Object obj16 = this.f17617g.get();
                        C13706o.m87926c(obj16);
                        int r5 = m29889r((Context) obj16) - m29892u(view);
                        Object obj17 = this.f17617g.get();
                        C13706o.m87926c(obj17);
                        i6 = r5 - m29885n(m29889r((Context) obj17) - m29892u(view));
                    } else {
                        i6 = 0;
                    }
                    Object obj18 = this.f17617g.get();
                    C13706o.m87926c(obj18);
                    layoutParams.setMargins(u7, 0, i6, m29886o((Context) obj18) - m29893v(view));
                } else {
                    int u8 = m29895x() ? (m29892u(view) + view.getWidth()) - m29885n(m29892u(view)) : 0;
                    if (m29895x()) {
                        Object obj19 = this.f17617g.get();
                        C13706o.m87926c(obj19);
                        i5 = (m29889r((Context) obj19) - m29892u(view)) - view.getWidth();
                    } else {
                        i5 = 0;
                    }
                    Object obj20 = this.f17617g.get();
                    C13706o.m87926c(obj20);
                    layoutParams.setMargins(u8, 0, i5, m29886o((Context) obj20) - m29893v(view));
                }
            }
            BubbleMessageView c = aVar.mo27477y(new RectF((float) m29892u(view), (float) m29893v(view), ((float) m29892u(view)) + ((float) view.getWidth()), ((float) m29893v(view)) + ((float) view.getHeight()))).mo27455c();
            c.setId(m29882i());
            C7231a aVar2 = C7231a.f17609a;
            Animation b = aVar2.mo37064b(0, this.f17613c);
            if (relativeLayout != null) {
                relativeLayout.addView(aVar2.mo37065c(c, b), layoutParams);
            }
        }
    }

    /* renamed from: f */
    private final void m29879f(BubbleMessageView.C3878a aVar, RelativeLayout relativeLayout) {
        int i;
        int i2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        BubbleMessageView c = aVar.mo27455c();
        c.setId(m29882i());
        if (m29895x()) {
            if (m29895x()) {
                Object obj = this.f17617g.get();
                C13706o.m87926c(obj);
                i = (m29889r((Context) obj) / 2) - (C7242m.f17670a.mo37102a(this.f17616f) / 2);
            } else {
                i = 0;
            }
            if (m29895x()) {
                Object obj2 = this.f17617g.get();
                C13706o.m87926c(obj2);
                i2 = (m29889r((Context) obj2) / 2) - (C7242m.f17670a.mo37102a(this.f17616f) / 2);
            } else {
                i2 = 0;
            }
            layoutParams.setMargins(i, 0, i2, 0);
        }
        C7231a aVar2 = C7231a.f17609a;
        Animation b = aVar2.mo37064b(0, this.f17613c);
        if (relativeLayout != null) {
            relativeLayout.addView(aVar2.mo37065c(c, b), layoutParams);
        }
    }

    /* renamed from: g */
    private final void m29880g(View view, RelativeLayout relativeLayout) {
        if (view != null) {
            Bitmap G = m29871G(view, this.f17629s);
            Object obj = this.f17617g.get();
            C13706o.m87926c(obj);
            ImageView imageView = new ImageView((Context) obj);
            imageView.setImageBitmap(G);
            imageView.setOnClickListener(new C11930e(this));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int u = m29892u(view);
            int v = m29893v(view);
            Object obj2 = this.f17617g.get();
            C13706o.m87926c(obj2);
            layoutParams.setMargins(u, v, m29889r((Context) obj2) - (m29892u(view) + view.getWidth()), 0);
            if (relativeLayout != null) {
                relativeLayout.addView(imageView, layoutParams);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m29881h(C7232g gVar, View view) {
        C13706o.m87929f(gVar, "this$0");
        if (!gVar.f17627q) {
            gVar.mo37067j();
        }
        C7238j jVar = gVar.f17632v;
        if (jVar != null) {
            jVar.mo30522c(gVar);
        }
    }

    /* renamed from: i */
    private final int m29882i() {
        return View.generateViewId();
    }

    /* renamed from: l */
    private final RelativeLayout m29883l() {
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        if (((Activity) obj).findViewById(this.f17612b) != null) {
            Object obj2 = this.f17617g.get();
            C13706o.m87926c(obj2);
            View findViewById = ((Activity) obj2).findViewById(this.f17612b);
            C13706o.m87928e(findViewById, "mActivity.get()!!.findVi…yId(FOREGROUND_LAYOUT_ID)");
            return (RelativeLayout) findViewById;
        }
        Object obj3 = this.f17617g.get();
        C13706o.m87926c(obj3);
        RelativeLayout relativeLayout = new RelativeLayout((Context) obj3);
        relativeLayout.setId(this.f17612b);
        relativeLayout.setFitsSystemWindows(false);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Object obj4 = this.f17617g.get();
        C13706o.m87926c(obj4);
        relativeLayout.setBackgroundColor(ContextCompat.getColor((Context) obj4, C17528R$color.black_slight_transparent));
        relativeLayout.setClickable(true);
        return relativeLayout;
    }

    /* renamed from: m */
    private final BubbleMessageView.C3878a m29884m() {
        BubbleMessageView.C3878a aVar = new BubbleMessageView.C3878a();
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        return aVar.mo27458f((Context) obj).mo27453a(this.f17630t).mo27454b(this.f17622l).mo27478z(this.f17623m).mo27452B(this.f17624n).mo27476x(this.f17625o).mo27451A(this.f17619i).mo27475w(this.f17620j).mo27472t(this.f17618h).mo27456d(this.f17621k).mo27457e(this.f17628r).mo27473u(new C7236d(this));
    }

    /* renamed from: n */
    private final int m29885n(int i) {
        C7242m mVar = C7242m.f17670a;
        return i > mVar.mo37102a(this.f17616f) ? mVar.mo37102a(this.f17616f) : i;
    }

    /* renamed from: o */
    private final int m29886o(Context context) {
        return C7242m.f17670a.mo37105d(context) - m29888q();
    }

    /* renamed from: p */
    private final int m29887p() {
        RelativeLayout relativeLayout = this.f17636z;
        if (relativeLayout == null) {
            return 0;
        }
        C7242m mVar = C7242m.f17670a;
        C13706o.m87926c(relativeLayout);
        return mVar.mo37103b(relativeLayout);
    }

    /* renamed from: q */
    private final int m29888q() {
        RelativeLayout relativeLayout = this.f17636z;
        if (relativeLayout == null) {
            return 0;
        }
        C7242m mVar = C7242m.f17670a;
        C13706o.m87926c(relativeLayout);
        return mVar.mo37104c(relativeLayout);
    }

    /* renamed from: r */
    private final int m29889r(Context context) {
        return C7242m.f17670a.mo37106e(context) - m29887p();
    }

    /* renamed from: s */
    private final String m29890s(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    /* renamed from: t */
    private final ViewGroup m29891t(Activity activity) {
        ViewParent parent = ((ViewGroup) activity.findViewById(16908290)).getParent().getParent();
        C13706o.m87927d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) parent;
    }

    /* renamed from: u */
    private final int m29892u(View view) {
        return C7242m.f17670a.mo37103b(view) - m29887p();
    }

    /* renamed from: v */
    private final int m29893v(View view) {
        return C7242m.f17670a.mo37104c(view) - m29888q();
    }

    /* renamed from: w */
    private final boolean m29894w(String str) {
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        SharedPreferences sharedPreferences = ((Activity) obj).getSharedPreferences(this.f17611a, 0);
        C13706o.m87928e(sharedPreferences, "mPrefs");
        if (m29890s(sharedPreferences, str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private final boolean m29895x() {
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        return ((Activity) obj).getResources().getBoolean(C17527R$bool.is_tablet);
    }

    /* renamed from: y */
    private final boolean m29896y(View view) {
        if (view == null || m29892u(view) < 0 || m29893v(view) < 0) {
            return false;
        }
        if (m29892u(view) == 0 && m29893v(view) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private final void m29897z() {
        C7243n nVar = this.f17633w;
        if (nVar != null) {
            nVar.onDismiss();
        }
    }

    /* renamed from: E */
    public final void mo37066E() {
        try {
            String str = this.f17626p;
            if (str != null) {
                if (m29894w(str)) {
                    m29897z();
                    return;
                }
                m29866A(this.f17626p);
            }
            Object obj = this.f17617g.get();
            C13706o.m87926c(obj);
            ViewGroup t = m29891t((Activity) obj);
            RelativeLayout l = m29883l();
            this.f17636z = l;
            m29867B(l);
            this.f17610A = m29884m();
            if (this.f17631u == null || this.f17630t.size() > 1) {
                BubbleMessageView.C3878a aVar = this.f17610A;
                C13706o.m87926c(aVar);
                m29879f(aVar, this.f17636z);
            } else {
                new Handler().postDelayed(new C11931f(this), (long) this.f17614d);
            }
            if (this.f17634x) {
                C7231a aVar2 = C7231a.f17609a;
                Animation a = aVar2.mo37063a(0, this.f17614d);
                RelativeLayout relativeLayout = this.f17636z;
                if (relativeLayout != null) {
                    C13706o.m87926c(relativeLayout);
                    t.addView(aVar2.mo37065c(relativeLayout, a));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public final void mo37067j() {
        RelativeLayout relativeLayout = this.f17636z;
        if (relativeLayout != null && this.f17635y) {
            mo37068k();
        } else if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        m29897z();
    }

    /* renamed from: k */
    public final void mo37068k() {
        Object obj = this.f17617g.get();
        C13706o.m87926c(obj);
        m29891t((Activity) obj).removeView(this.f17636z);
        this.f17636z = null;
    }
}
