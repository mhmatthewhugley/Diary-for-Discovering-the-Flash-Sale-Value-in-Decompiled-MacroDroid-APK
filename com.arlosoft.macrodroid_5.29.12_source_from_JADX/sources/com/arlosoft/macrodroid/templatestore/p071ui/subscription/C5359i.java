package com.arlosoft.macrodroid.templatestore.p071ui.subscription;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.database.room.C4419p;
import com.arlosoft.macrodroid.templatestore.p071ui.C5314g;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel.C5408a;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.viewmodel.TemplateUpdatesViewModel;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p139o1.C7992b0;
import p154r0.C8184d;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i */
/* compiled from: TemplateUpdatesFragment.kt */
public final class C5359i extends C8184d implements C5314g {

    /* renamed from: s */
    public static final C5360a f13222s = new C5360a((C13695i) null);

    /* renamed from: d */
    public TemplateUpdatesViewModel f13223d;

    /* renamed from: f */
    public C5331h f13224f;

    /* renamed from: g */
    private C7992b0 f13225g;

    /* renamed from: o */
    private C5352e f13226o;

    /* renamed from: p */
    public Map<Integer, View> f13227p = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i$a */
    /* compiled from: TemplateUpdatesFragment.kt */
    public static final class C5360a {
        private C5360a() {
        }

        public /* synthetic */ C5360a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C5359i mo30547a() {
            return new C5359i();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i$b */
    /* compiled from: TemplateUpdatesFragment.kt */
    public /* synthetic */ class C5361b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13228a;

        static {
            int[] iArr = new int[C5408a.values().length];
            iArr[C5408a.MACRO_NOT_AVAILABLE.ordinal()] = 1;
            iArr[C5408a.UNKOWN_ERROR.ordinal()] = 2;
            f13228a = iArr;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i$c */
    /* compiled from: TemplateUpdatesFragment.kt */
    static final class C5362c extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ C5359i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5362c(C5359i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final void mo30548a(int i) {
            this.this$0.mo30546h0().mo30591m(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30548a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i$d */
    /* compiled from: TemplateUpdatesFragment.kt */
    static final class C5363d extends C13708q implements C16265l<C4419p, C13339u> {
        final /* synthetic */ C5359i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5363d(C5359i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final void mo30549a(C4419p pVar) {
            C13706o.m87929f(pVar, "updateItem");
            this.this$0.mo30546h0().mo30597s(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30549a((C4419p) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.i$e */
    /* compiled from: TemplateUpdatesFragment.kt */
    static final class C5364e extends C13708q implements C16265l<C4419p, C13339u> {
        final /* synthetic */ C5359i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5364e(C5359i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final void mo30550a(C4419p pVar) {
            C13706o.m87929f(pVar, "updateItem");
            this.this$0.mo30546h0().mo30598t(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30550a((C4419p) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: Z */
    private final void m20751Z() {
        mo30546h0().mo30593o().observe(getViewLifecycleOwner(), new C5358h(this));
        mo30546h0().mo30596p().observe(getViewLifecycleOwner(), new C5357g(this));
        C6388h1<C5408a> n = mo30546h0().mo30592n();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C13706o.m87928e(viewLifecycleOwner, "viewLifecycleOwner");
        n.observe(viewLifecycleOwner, new C5356f(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.arlosoft.macrodroid.templatestore.ui.subscription.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: o1.b0} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20752a0(com.arlosoft.macrodroid.templatestore.p071ui.subscription.C5359i r7, java.util.List r8) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            boolean r0 = r8.isEmpty()
            r1 = 8
            java.lang.String r2 = "binding.emptyView"
            r3 = 0
            java.lang.String r4 = "binding.updatesList"
            java.lang.String r5 = "binding"
            r6 = 0
            if (r0 == 0) goto L_0x0037
            o1.b0 r8 = r7.f13225g
            if (r8 != 0) goto L_0x001d
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r8 = r6
        L_0x001d:
            android.widget.LinearLayout r8 = r8.f19224b
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)
            r8.setVisibility(r3)
            o1.b0 r7 = r7.f13225g
            if (r7 != 0) goto L_0x002d
            kotlin.jvm.internal.C13706o.m87945v(r5)
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f19226d
            kotlin.jvm.internal.C13706o.m87928e(r7, r4)
            r7.setVisibility(r1)
            goto L_0x006a
        L_0x0037:
            o1.b0 r0 = r7.f13225g
            if (r0 != 0) goto L_0x003f
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r0 = r6
        L_0x003f:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f19226d
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)
            r0.setVisibility(r3)
            o1.b0 r0 = r7.f13225g
            if (r0 != 0) goto L_0x004f
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r0 = r6
        L_0x004f:
            android.widget.LinearLayout r0 = r0.f19224b
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r0.setVisibility(r1)
            com.arlosoft.macrodroid.templatestore.ui.subscription.e r7 = r7.f13226o
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "adapter"
            kotlin.jvm.internal.C13706o.m87945v(r7)
            goto L_0x0062
        L_0x0061:
            r6 = r7
        L_0x0062:
            java.lang.String r7 = "it"
            kotlin.jvm.internal.C13706o.m87928e(r8, r7)
            r6.mo30542D(r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.subscription.C5359i.m20752a0(com.arlosoft.macrodroid.templatestore.ui.subscription.i, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m20753e0(C5359i iVar, Boolean bool) {
        C13706o.m87929f(iVar, "this$0");
        C7992b0 b0Var = iVar.f13225g;
        if (b0Var == null) {
            C13706o.m87945v("binding");
            b0Var = null;
        }
        LottieAnimationView lottieAnimationView = b0Var.f19225c;
        C13706o.m87928e(lottieAnimationView, "binding.loadingView");
        C13706o.m87928e(bool, "it");
        lottieAnimationView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m20754f0(C5359i iVar, C5408a aVar) {
        int i;
        C13706o.m87929f(iVar, "this$0");
        int i2 = aVar == null ? -1 : C5361b.f13228a[aVar.ordinal()];
        if (i2 == 1) {
            i = C17541R$string.macro_not_found;
        } else if (i2 == 2) {
            i = C17541R$string.error;
        } else {
            throw new IllegalArgumentException();
        }
        C15626c.makeText(iVar.requireContext(), i, 0).show();
    }

    /* renamed from: R */
    public void mo30501R() {
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f13227p.clear();
    }

    /* renamed from: g0 */
    public final C5331h mo30545g0() {
        C5331h hVar = this.f13224f;
        if (hVar != null) {
            return hVar;
        }
        C13706o.m87945v("profileImageProvider");
        return null;
    }

    /* renamed from: h0 */
    public final TemplateUpdatesViewModel mo30546h0() {
        TemplateUpdatesViewModel templateUpdatesViewModel = this.f13223d;
        if (templateUpdatesViewModel != null) {
            return templateUpdatesViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C7992b0 c = C7992b0.m33297c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f13225g = c;
        getLifecycle().addObserver(mo30546h0());
        m20751Z();
        Drawable drawable = ContextCompat.getDrawable(requireContext(), C17530R$drawable.ic_baseline_delete_36);
        C13706o.m87926c(drawable);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C5350c(drawable, 8, new C5362c(this)));
        C7992b0 b0Var = this.f13225g;
        C7992b0 b0Var2 = null;
        if (b0Var == null) {
            C13706o.m87945v("binding");
            b0Var = null;
        }
        itemTouchHelper.attachToRecyclerView(b0Var.f19226d);
        this.f13226o = new C5352e(C13614t.m87748j(), mo30545g0(), new C5363d(this), new C5364e(this));
        C7992b0 b0Var3 = this.f13225g;
        if (b0Var3 == null) {
            C13706o.m87945v("binding");
            b0Var3 = null;
        }
        RecyclerView recyclerView = b0Var3.f19226d;
        C5352e eVar = this.f13226o;
        if (eVar == null) {
            C13706o.m87945v("adapter");
            eVar = null;
        }
        recyclerView.setAdapter(eVar);
        C7992b0 b0Var4 = this.f13225g;
        if (b0Var4 == null) {
            C13706o.m87945v("binding");
        } else {
            b0Var2 = b0Var4;
        }
        FrameLayout b = b0Var2.getRoot();
        C13706o.m87928e(b, "binding.root");
        return b;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
