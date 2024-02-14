package com.arlosoft.macrodroid.homescreen.favourites;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6409o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p081e1.C7264a;
import p139o1.C8025s;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: FavouritesDialogActivity.kt */
public final class FavouritesDialogActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    private C8025s f11936o;

    /* renamed from: p */
    public Map<Integer, View> f11937p = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.homescreen.favourites.FavouritesDialogActivity$a */
    /* compiled from: FavouritesDialogActivity.kt */
    static final class C4751a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ FavouritesDialogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4751a(FavouritesDialogActivity favouritesDialogActivity, C13635d<? super C4751a> dVar) {
            super(3, dVar);
            this.this$0 = favouritesDialogActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4751a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m18416S1();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.favourites.FavouritesDialogActivity$b */
    /* compiled from: FavouritesDialogActivity.kt */
    public static final class C4752b implements C4758d {

        /* renamed from: a */
        final /* synthetic */ FavouritesDialogActivity f11938a;

        /* renamed from: com.arlosoft.macrodroid.homescreen.favourites.FavouritesDialogActivity$b$a */
        /* compiled from: FavouritesDialogActivity.kt */
        public static final class C4753a implements C6409o.C6412c {

            /* renamed from: a */
            final /* synthetic */ FavouritesDialogActivity f11939a;

            /* renamed from: b */
            final /* synthetic */ Macro f11940b;

            C4753a(FavouritesDialogActivity favouritesDialogActivity, Macro macro) {
                this.f11939a = favouritesDialogActivity;
                this.f11940b = macro;
            }

            /* renamed from: a */
            public void mo24616a() {
            }

            /* renamed from: b */
            public void mo24617b() {
                Intent intent = new Intent(this.f11939a, EditMacroActivity.class);
                intent.putExtra("MacroId", this.f11940b.getId());
                this.f11939a.startActivity(intent);
                this.f11939a.finish();
            }
        }

        C4752b(FavouritesDialogActivity favouritesDialogActivity) {
            this.f11938a = favouritesDialogActivity;
        }

        /* renamed from: a */
        public void mo29291a(Macro macro) {
            Class<EditMacroActivity> cls = EditMacroActivity.class;
            C13706o.m87929f(macro, "macro");
            String category = macro.getCategory();
            C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE);
            CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
            if (categoryList != null) {
                C13706o.m87928e(category, "categoryName");
                Category categoryByName = categoryList.getCategoryByName(category);
                if (categoryByName == null || !categoryByName.isLocked()) {
                    Intent intent = new Intent(this.f11938a, cls);
                    intent.putExtra("MacroId", macro.getId());
                    this.f11938a.startActivity(intent);
                    this.f11938a.finish();
                    return;
                }
                C6409o oVar = new C6409o(q, (C6409o.C6411b) null);
                FavouritesDialogActivity favouritesDialogActivity = this.f11938a;
                oVar.mo32449u(favouritesDialogActivity, favouritesDialogActivity.getString(C17541R$string.enter_category_lock_password), category, C5163j2.m19992J0(this.f11938a), C17542R$style.Theme_App_Dialog, new C4753a(this.f11938a, macro));
                return;
            }
            Intent intent2 = new Intent(this.f11938a, cls);
            intent2.putExtra("MacroId", macro.getId());
            this.f11938a.startActivity(intent2);
            this.f11938a.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m18416S1() {
        C8025s sVar = this.f11936o;
        C8025s sVar2 = null;
        if (sVar == null) {
            C13706o.m87945v("binding");
            sVar = null;
        }
        sVar.f19439g.animate().alpha(0.0f).setDuration(100);
        C8025s sVar3 = this.f11936o;
        if (sVar3 == null) {
            C13706o.m87945v("binding");
            sVar3 = null;
        }
        sVar3.f19434b.animate().alpha(0.0f).setDuration(100);
        C8025s sVar4 = this.f11936o;
        if (sVar4 == null) {
            C13706o.m87945v("binding");
        } else {
            sVar2 = sVar4;
        }
        sVar2.f19436d.animate().alpha(0.0f).setDuration(100);
        new Handler().postDelayed(new C4755b(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m18417T1(FavouritesDialogActivity favouritesDialogActivity) {
        C13706o.m87929f(favouritesDialogActivity, "this$0");
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    /* renamed from: U1 */
    private final void m18418U1() {
        C8025s sVar = this.f11936o;
        C8025s sVar2 = null;
        if (sVar == null) {
            C13706o.m87945v("binding");
            sVar = null;
        }
        FrameLayout frameLayout = sVar.f19437e;
        C13706o.m87928e(frameLayout, "binding.mainContainer");
        C4666m.m18147o(frameLayout, (C13640g) null, new C4751a(this, (C13635d<? super C4751a>) null), 1, (Object) null);
        C8025s sVar3 = this.f11936o;
        if (sVar3 == null) {
            C13706o.m87945v("binding");
            sVar3 = null;
        }
        sVar3.f19436d.setLayoutManager(new GridLayoutManager(this, 2));
        List<Macro> L = C4934n.m18998M().mo29681L();
        C13706o.m87928e(L, "macros");
        C4754a aVar = new C4754a(C13566b0.m87405I0(L));
        aVar.mo29296F(new C4752b(this));
        m18419V1(L, L.isEmpty());
        C8025s sVar4 = this.f11936o;
        if (sVar4 == null) {
            C13706o.m87945v("binding");
            sVar4 = null;
        }
        sVar4.f19436d.setAdapter(aVar);
        C8025s sVar5 = this.f11936o;
        if (sVar5 == null) {
            C13706o.m87945v("binding");
            sVar5 = null;
        }
        sVar5.f19439g.animate().alpha(1.0f).setDuration(500);
        C8025s sVar6 = this.f11936o;
        if (sVar6 == null) {
            C13706o.m87945v("binding");
            sVar6 = null;
        }
        sVar6.f19434b.animate().alpha(1.0f).setDuration(500);
        C8025s sVar7 = this.f11936o;
        if (sVar7 == null) {
            C13706o.m87945v("binding");
            sVar7 = null;
        }
        sVar7.f19436d.animate().alpha(1.0f).setDuration(500);
        C8025s sVar8 = this.f11936o;
        if (sVar8 == null) {
            C13706o.m87945v("binding");
        } else {
            sVar2 = sVar8;
        }
        RecyclerView.ItemAnimator itemAnimator = sVar2.f19436d.getItemAnimator();
        C13706o.m87927d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
    }

    /* renamed from: V1 */
    private final void m18419V1(List<? extends Macro> list, boolean z) {
        int i = 4;
        C8025s sVar = null;
        if (z) {
            C8025s sVar2 = this.f11936o;
            if (sVar2 == null) {
                C13706o.m87945v("binding");
                sVar2 = null;
            }
            TextView textView = sVar2.f19434b;
            C13706o.m87928e(textView, "binding.emptyText");
            textView.setVisibility(0);
            C8025s sVar3 = this.f11936o;
            if (sVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                sVar = sVar3;
            }
            sVar.f19436d.setVisibility(4);
            return;
        }
        C8025s sVar4 = this.f11936o;
        if (sVar4 == null) {
            C13706o.m87945v("binding");
            sVar4 = null;
        }
        TextView textView2 = sVar4.f19434b;
        C13706o.m87928e(textView2, "binding.emptyText");
        textView2.setVisibility(list.isEmpty() ? 0 : 8);
        C8025s sVar5 = this.f11936o;
        if (sVar5 == null) {
            C13706o.m87945v("binding");
        } else {
            sVar = sVar5;
        }
        RecyclerView recyclerView = sVar.f19436d;
        if (!list.isEmpty()) {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    public void onBackPressed() {
        m18416S1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8025s c = C8025s.m33410c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f11936o = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        m18418U1();
    }
}
