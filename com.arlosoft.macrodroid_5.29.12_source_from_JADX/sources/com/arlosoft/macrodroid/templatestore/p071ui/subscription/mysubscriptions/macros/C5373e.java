package com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.templatestore.p071ui.C5314g;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.C5350c;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.viewmodel.MyMacroSubscriptionsViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p139o1.C7994c0;
import p154r0.C8184d;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.e */
/* compiled from: MyMacroSubscriptionsFragment.kt */
public final class C5373e extends C8184d implements C5314g {

    /* renamed from: s */
    public static final C5374a f13237s = new C5374a((C13695i) null);

    /* renamed from: d */
    public MyMacroSubscriptionsViewModel f13238d;

    /* renamed from: f */
    public C5331h f13239f;

    /* renamed from: g */
    private C7994c0 f13240g;

    /* renamed from: o */
    private C5366a f13241o;

    /* renamed from: p */
    public Map<Integer, View> f13242p = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.e$a */
    /* compiled from: MyMacroSubscriptionsFragment.kt */
    public static final class C5374a {
        private C5374a() {
        }

        public /* synthetic */ C5374a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C5373e mo30559a() {
            return new C5373e();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.e$b */
    /* compiled from: MyMacroSubscriptionsFragment.kt */
    static final class C5375b extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ C5373e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5375b(C5373e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final void mo30560a(int i) {
            this.this$0.mo30558g0().mo30562k(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30560a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.e$c */
    /* compiled from: MyMacroSubscriptionsFragment.kt */
    static final class C5376c extends C13708q implements C16269p<C4407l, Boolean, C13339u> {
        final /* synthetic */ C5373e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5376c(C5373e eVar) {
            super(2);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final void mo30561a(C4407l lVar, boolean z) {
            C13706o.m87929f(lVar, "updateItem");
            if (z) {
                this.this$0.m20779h0(lVar);
            } else {
                this.this$0.mo30558g0().mo30565o(lVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo30561a((C4407l) obj, ((Boolean) obj2).booleanValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: a0 */
    private final void m20776a0() {
        mo30558g0().mo30563l().observe(getViewLifecycleOwner(), new C5372d(this));
        mo30558g0().mo30564m().observe(getViewLifecycleOwner(), new C5371c(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: o1.c0} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20777e0(com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.C5373e r7, java.util.List r8) {
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
            o1.c0 r8 = r7.f13240g
            if (r8 != 0) goto L_0x001d
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r8 = r6
        L_0x001d:
            android.widget.LinearLayout r8 = r8.f19235c
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)
            r8.setVisibility(r3)
            o1.c0 r7 = r7.f13240g
            if (r7 != 0) goto L_0x002d
            kotlin.jvm.internal.C13706o.m87945v(r5)
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f19237e
            kotlin.jvm.internal.C13706o.m87928e(r7, r4)
            r7.setVisibility(r1)
            goto L_0x006a
        L_0x0037:
            o1.c0 r0 = r7.f13240g
            if (r0 != 0) goto L_0x003f
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r0 = r6
        L_0x003f:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f19237e
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)
            r0.setVisibility(r3)
            o1.c0 r0 = r7.f13240g
            if (r0 != 0) goto L_0x004f
            kotlin.jvm.internal.C13706o.m87945v(r5)
            r0 = r6
        L_0x004f:
            android.widget.LinearLayout r0 = r0.f19235c
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r0.setVisibility(r1)
            com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.a r7 = r7.f13241o
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "adapter"
            kotlin.jvm.internal.C13706o.m87945v(r7)
            goto L_0x0062
        L_0x0061:
            r6 = r7
        L_0x0062:
            java.lang.String r7 = "it"
            kotlin.jvm.internal.C13706o.m87928e(r8, r7)
            r6.mo30553D(r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.subscription.mysubscriptions.macros.C5373e.m20777e0(com.arlosoft.macrodroid.templatestore.ui.subscription.mysubscriptions.macros.e, java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m20778f0(C5373e eVar, Boolean bool) {
        C13706o.m87929f(eVar, "this$0");
        C7994c0 c0Var = eVar.f13240g;
        if (c0Var == null) {
            C13706o.m87945v("binding");
            c0Var = null;
        }
        LottieAnimationView lottieAnimationView = c0Var.f19236d;
        C13706o.m87928e(lottieAnimationView, "binding.loadingView");
        C13706o.m87928e(bool, "it");
        lottieAnimationView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m20779h0(C4407l lVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((CharSequence) lVar.mo28737b());
        builder.setMessage((int) C17541R$string.template_store_macro_unsubscribe_question);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5370b(this, lVar));
        builder.setNeutralButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m20780i0(C5373e eVar, C4407l lVar, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(eVar, "this$0");
        C13706o.m87929f(lVar, "$macroSubscription");
        eVar.mo30558g0().mo30566p(lVar);
    }

    /* renamed from: R */
    public void mo30501R() {
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f13242p.clear();
    }

    /* renamed from: g0 */
    public final MyMacroSubscriptionsViewModel mo30558g0() {
        MyMacroSubscriptionsViewModel myMacroSubscriptionsViewModel = this.f13238d;
        if (myMacroSubscriptionsViewModel != null) {
            return myMacroSubscriptionsViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        C7994c0 c = C7994c0.m33304c(layoutInflater, viewGroup, false);
        C13706o.m87928e(c, "inflate(inflater, container, false)");
        this.f13240g = c;
        getLifecycle().addObserver(mo30558g0());
        m20776a0();
        Drawable drawable = ContextCompat.getDrawable(requireContext(), C17530R$drawable.ic_baseline_delete_36);
        C13706o.m87926c(drawable);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C5350c(drawable, 8, new C5375b(this)));
        C7994c0 c0Var = this.f13240g;
        C7994c0 c0Var2 = null;
        if (c0Var == null) {
            C13706o.m87945v("binding");
            c0Var = null;
        }
        itemTouchHelper.attachToRecyclerView(c0Var.f19237e);
        this.f13241o = new C5366a(C13614t.m87748j(), new C5376c(this));
        C7994c0 c0Var3 = this.f13240g;
        if (c0Var3 == null) {
            C13706o.m87945v("binding");
            c0Var3 = null;
        }
        RecyclerView recyclerView = c0Var3.f19237e;
        C5366a aVar = this.f13241o;
        if (aVar == null) {
            C13706o.m87945v("adapter");
            aVar = null;
        }
        recyclerView.setAdapter(aVar);
        C7994c0 c0Var4 = this.f13240g;
        if (c0Var4 == null) {
            C13706o.m87945v("binding");
        } else {
            c0Var2 = c0Var4;
        }
        FrameLayout b = c0Var2.getRoot();
        C13706o.m87928e(b, "binding.root");
        return b;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }
}
