package com.arlosoft.macrodroid.homescreen.quickrun;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.InvokedByQuickRunTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8029u;
import p247e6.C12156m;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: QuickRunMacroDialogActivity.kt */
public final class QuickRunMacroDialogActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    private View f11961o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8029u f11962p;

    /* renamed from: s */
    public Map<Integer, View> f11963s = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity$a */
    /* compiled from: QuickRunMacroDialogActivity.kt */
    static final class C4768a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ QuickRunMacroDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4768a(QuickRunMacroDialogActivity quickRunMacroDialogActivity, C13635d<? super C4768a> dVar) {
            super(3, dVar);
            this.this$0 = quickRunMacroDialogActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4768a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m18493U1();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity$b */
    /* compiled from: QuickRunMacroDialogActivity.kt */
    public static final class C4769b implements C4773a {

        /* renamed from: a */
        final /* synthetic */ QuickRunMacroDialogActivity f11964a;

        /* renamed from: b */
        final /* synthetic */ C4784l f11965b;

        /* renamed from: c */
        final /* synthetic */ List<Macro> f11966c;

        /* renamed from: d */
        final /* synthetic */ C4934n f11967d;

        C4769b(QuickRunMacroDialogActivity quickRunMacroDialogActivity, C4784l lVar, List<Macro> list, C4934n nVar) {
            this.f11964a = quickRunMacroDialogActivity;
            this.f11965b = lVar;
            this.f11966c = list;
            this.f11967d = nVar;
        }

        /* renamed from: a */
        public void mo29305a(Macro macro) {
            C13706o.m87929f(macro, "macro");
            macro.setTriggerThatInvoked(InvokedByQuickRunTrigger.m22505g3());
            macro.invokeActions(new TriggerContextInfo(QuickRunMacroDialogActivity.class.getSimpleName()), true);
            this.f11964a.finish();
        }

        /* renamed from: b */
        public void mo29306b(Macro macro) {
            C13706o.m87929f(macro, "macro");
            List<Long> u1 = C5163j2.m20272u1(this.f11964a);
            u1.remove(Long.valueOf(macro.getGUID()));
            C5163j2.m20180i5(this.f11964a, u1);
            C13706o.m87928e(u1, "macroGuidList");
            C4934n nVar = this.f11967d;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(u1, 10));
            for (Long l : u1) {
                C13706o.m87928e(l, "it");
                arrayList.add(nVar.mo29682Q(l.longValue()));
            }
            this.f11965b.mo29324H(macro);
            this.f11964a.m18496X1(arrayList, this.f11966c.isEmpty());
            C8029u S1 = this.f11964a.f11962p;
            if (S1 == null) {
                C13706o.m87945v("binding");
                S1 = null;
            }
            ImageView imageView = S1.f19464b;
            C13706o.m87928e(imageView, "binding.addButton");
            int size = this.f11967d.mo29710z().size();
            int size2 = arrayList.size();
            int i = 0;
            if (!(size > size2)) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity$c */
    /* compiled from: QuickRunMacroDialogActivity.kt */
    static final class C4770c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ QuickRunMacroDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4770c(QuickRunMacroDialogActivity quickRunMacroDialogActivity, C13635d<? super C4770c> dVar) {
            super(3, dVar);
            this.this$0 = quickRunMacroDialogActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4770c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.startActivity(new Intent(this.this$0, QuickRunAddMacrosActivity.class));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity$d */
    /* compiled from: QuickRunMacroDialogActivity.kt */
    public static final class C4771d implements C12156m.C12162f {

        /* renamed from: a */
        final /* synthetic */ QuickRunMacroDialogActivity f11968a;

        /* renamed from: b */
        final /* synthetic */ C4784l f11969b;

        C4771d(QuickRunMacroDialogActivity quickRunMacroDialogActivity, C4784l lVar) {
            this.f11968a = quickRunMacroDialogActivity;
            this.f11969b = lVar;
        }

        /* renamed from: a */
        public void mo29260a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo29261b(int i) {
        }

        /* renamed from: c */
        public void mo29262c(int i, int i2, boolean z) {
            QuickRunMacroDialogActivity quickRunMacroDialogActivity = this.f11968a;
            List<Macro> B = this.f11969b.mo29318B();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(B, 10));
            for (Macro guid : B) {
                arrayList.add(Long.valueOf(guid.getGUID()));
            }
            C5163j2.m20180i5(quickRunMacroDialogActivity, arrayList);
        }

        /* renamed from: d */
        public void mo29263d(int i, int i2) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunMacroDialogActivity$e */
    /* compiled from: QuickRunMacroDialogActivity.kt */
    static final class C4772e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4784l $macroAdapter;
        int label;
        final /* synthetic */ QuickRunMacroDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4772e(QuickRunMacroDialogActivity quickRunMacroDialogActivity, C4784l lVar, C13635d<? super C4772e> dVar) {
            super(3, dVar);
            this.this$0 = quickRunMacroDialogActivity;
            this.$macroAdapter = lVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4772e(this.this$0, this.$macroAdapter, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C8029u S1 = this.this$0.f11962p;
                if (S1 == null) {
                    C13706o.m87945v("binding");
                    S1 = null;
                }
                S1.f19465c.setImageResource(this.$macroAdapter.mo29319C() ? C17530R$drawable.ic_mode_edit_white_24dp : C17530R$drawable.ic_pencil_off);
                C4784l lVar = this.$macroAdapter;
                lVar.mo29326J(!lVar.mo29319C());
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public final void m18493U1() {
        C8029u uVar = this.f11962p;
        C8029u uVar2 = null;
        if (uVar == null) {
            C13706o.m87945v("binding");
            uVar = null;
        }
        uVar.f19471i.animate().alpha(0.0f).setDuration(100);
        C8029u uVar3 = this.f11962p;
        if (uVar3 == null) {
            C13706o.m87945v("binding");
            uVar3 = null;
        }
        uVar3.f19466d.animate().alpha(0.0f).setDuration(100);
        C8029u uVar4 = this.f11962p;
        if (uVar4 == null) {
            C13706o.m87945v("binding");
            uVar4 = null;
        }
        uVar4.f19468f.animate().alpha(0.0f).setDuration(100);
        C8029u uVar5 = this.f11962p;
        if (uVar5 == null) {
            C13706o.m87945v("binding");
            uVar5 = null;
        }
        uVar5.f19464b.animate().alpha(0.0f).setDuration(100);
        C8029u uVar6 = this.f11962p;
        if (uVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            uVar2 = uVar6;
        }
        uVar2.f19465c.animate().alpha(0.0f).setDuration(100);
        new Handler().postDelayed(new C4785m(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m18494V1(QuickRunMacroDialogActivity quickRunMacroDialogActivity) {
        C13706o.m87929f(quickRunMacroDialogActivity, "this$0");
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    /* renamed from: W1 */
    private final void m18495W1() {
        C8029u uVar = this.f11962p;
        if (uVar == null) {
            C13706o.m87945v("binding");
            uVar = null;
        }
        FrameLayout frameLayout = uVar.f19469g;
        C13706o.m87928e(frameLayout, "binding.mainContainer");
        C4666m.m18147o(frameLayout, (C13640g) null, new C4768a(this, (C13635d<? super C4768a>) null), 1, (Object) null);
        C8029u uVar2 = this.f11962p;
        if (uVar2 == null) {
            C13706o.m87945v("binding");
            uVar2 = null;
        }
        uVar2.f19468f.setLayoutManager(new GridLayoutManager(this, 2));
        C4934n M = C4934n.m18998M();
        List<Macro> z = M.mo29710z();
        List<Long> u1 = C5163j2.m20272u1(this);
        C13706o.m87928e(u1, "getQuickRunMacroGuids(this)");
        ArrayList<Long> arrayList = new ArrayList<>();
        for (T next : u1) {
            Long l = (Long) next;
            C13706o.m87928e(z, "allMacros");
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(z, 10));
            for (Macro guid : z) {
                arrayList2.add(Long.valueOf(guid.getGUID()));
            }
            if (arrayList2.contains(l)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (Long l2 : arrayList) {
            C13706o.m87928e(l2, "it");
            arrayList3.add(M.mo29682Q(l2.longValue()));
        }
        C4784l lVar = new C4784l(C13566b0.m87405I0(arrayList3));
        lVar.mo29325I(new C4769b(this, lVar, z, M));
        C8029u uVar3 = this.f11962p;
        if (uVar3 == null) {
            C13706o.m87945v("binding");
            uVar3 = null;
        }
        ImageView imageView = uVar3.f19464b;
        C13706o.m87928e(imageView, "binding.addButton");
        imageView.setVisibility(M.mo29710z().size() > arrayList3.size() ? 0 : 8);
        m18496X1(arrayList3, z.isEmpty());
        C8029u uVar4 = this.f11962p;
        if (uVar4 == null) {
            C13706o.m87945v("binding");
            uVar4 = null;
        }
        ImageView imageView2 = uVar4.f19464b;
        C13706o.m87928e(imageView2, "binding.addButton");
        C4666m.m18147o(imageView2, (C13640g) null, new C4770c(this, (C13635d<? super C4770c>) null), 1, (Object) null);
        C12156m mVar = new C12156m();
        RecyclerView.Adapter i = mVar.mo68422i(lVar);
        C13706o.m87928e(i, "dragDropManager.createWrappedAdapter(macroAdapter)");
        C8029u uVar5 = this.f11962p;
        if (uVar5 == null) {
            C13706o.m87945v("binding");
            uVar5 = null;
        }
        uVar5.f19468f.setAdapter(i);
        C8029u uVar6 = this.f11962p;
        if (uVar6 == null) {
            C13706o.m87945v("binding");
            uVar6 = null;
        }
        uVar6.f19471i.animate().alpha(1.0f).setDuration(500);
        C8029u uVar7 = this.f11962p;
        if (uVar7 == null) {
            C13706o.m87945v("binding");
            uVar7 = null;
        }
        uVar7.f19466d.animate().alpha(1.0f).setDuration(500);
        C8029u uVar8 = this.f11962p;
        if (uVar8 == null) {
            C13706o.m87945v("binding");
            uVar8 = null;
        }
        uVar8.f19468f.animate().alpha(1.0f).setDuration(500);
        C8029u uVar9 = this.f11962p;
        if (uVar9 == null) {
            C13706o.m87945v("binding");
            uVar9 = null;
        }
        uVar9.f19464b.animate().alpha(1.0f).setDuration(500);
        C8029u uVar10 = this.f11962p;
        if (uVar10 == null) {
            C13706o.m87945v("binding");
            uVar10 = null;
        }
        uVar10.f19465c.animate().alpha(1.0f).setDuration(500);
        C8029u uVar11 = this.f11962p;
        if (uVar11 == null) {
            C13706o.m87945v("binding");
            uVar11 = null;
        }
        RecyclerView.ItemAnimator itemAnimator = uVar11.f19468f.getItemAnimator();
        C13706o.m87927d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        mVar.mo68417c0(false);
        mVar.mo68415b0(true);
        mVar.mo68414a0(1.0f);
        C8029u uVar12 = this.f11962p;
        if (uVar12 == null) {
            C13706o.m87945v("binding");
            uVar12 = null;
        }
        mVar.mo68413a(uVar12.f19468f);
        mVar.mo68420e0(new C4771d(this, lVar));
        C8029u uVar13 = this.f11962p;
        if (uVar13 == null) {
            C13706o.m87945v("binding");
            uVar13 = null;
        }
        uVar13.f19465c.setImageResource(lVar.mo29319C() ? C17530R$drawable.ic_pencil_off : C17530R$drawable.ic_mode_edit_white_24dp);
        C8029u uVar14 = this.f11962p;
        if (uVar14 == null) {
            C13706o.m87945v("binding");
            uVar14 = null;
        }
        ImageView imageView3 = uVar14.f19465c;
        C13706o.m87928e(imageView3, "binding.editButton");
        C4666m.m18147o(imageView3, (C13640g) null, new C4772e(this, lVar, (C13635d<? super C4772e>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m18496X1(List<? extends Macro> list, boolean z) {
        int i = 4;
        int i2 = 8;
        C8029u uVar = null;
        if (z) {
            C8029u uVar2 = this.f11962p;
            if (uVar2 == null) {
                C13706o.m87945v("binding");
                uVar2 = null;
            }
            TextView textView = uVar2.f19466d;
            C13706o.m87928e(textView, "binding.emptyText");
            textView.setVisibility(0);
            C8029u uVar3 = this.f11962p;
            if (uVar3 == null) {
                C13706o.m87945v("binding");
                uVar3 = null;
            }
            uVar3.f19468f.setVisibility(4);
            C8029u uVar4 = this.f11962p;
            if (uVar4 == null) {
                C13706o.m87945v("binding");
            } else {
                uVar = uVar4;
            }
            ImageView imageView = uVar.f19465c;
            C13706o.m87928e(imageView, "binding.editButton");
            imageView.setVisibility(8);
            return;
        }
        C8029u uVar5 = this.f11962p;
        if (uVar5 == null) {
            C13706o.m87945v("binding");
            uVar5 = null;
        }
        TextView textView2 = uVar5.f19466d;
        C13706o.m87928e(textView2, "binding.emptyText");
        textView2.setVisibility(list.isEmpty() ? 0 : 8);
        C8029u uVar6 = this.f11962p;
        if (uVar6 == null) {
            C13706o.m87945v("binding");
            uVar6 = null;
        }
        RecyclerView recyclerView = uVar6.f19468f;
        if (!list.isEmpty()) {
            i = 0;
        }
        recyclerView.setVisibility(i);
        C8029u uVar7 = this.f11962p;
        if (uVar7 == null) {
            C13706o.m87945v("binding");
        } else {
            uVar = uVar7;
        }
        ImageView imageView2 = uVar.f19465c;
        C13706o.m87928e(imageView2, "binding.editButton");
        if (!list.isEmpty()) {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
    }

    public void onBackPressed() {
        m18493U1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8029u c = C8029u.m33424c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f11962p = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        m18495W1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f11961o != null) {
            m18495W1();
        }
        View view = this.f11961o;
        if (view != null) {
            view.invalidate();
        }
        m18495W1();
    }
}
