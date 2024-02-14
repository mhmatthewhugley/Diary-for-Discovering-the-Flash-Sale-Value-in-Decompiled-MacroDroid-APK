package com.arlosoft.macrodroid.templatestore.p071ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewpager.widget.ViewPager;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.TemplateCategory;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.ProfileActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.search.TemplateSearchActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.C5359i;
import com.arlosoft.macrodroid.templatestore.p071ui.subscription.MySubscriptionsActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5412c;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5472t;
import com.arlosoft.macrodroid.templatestore.p071ui.upload.TemplateUploadActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.templatestore.p071ui.userlist.C5560c;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.user.signin.C6353g;
import com.google.android.material.snackbar.SnackbarAnimate;
import com.google.android.material.tabs.TabLayout;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import net.cachapa.expandablelayout.ExpandableLayout;
import p078d3.C7245d;
import p148q0.C8151a;
import p154r0.C8184d;
import p176v0.C10312a;
import p200z3.C10435a;
import p277h9.C12408a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment */
/* compiled from: TemplateStoreFragment.kt */
public final class TemplateStoreFragment extends C8184d implements C5275b {

    /* renamed from: H */
    public static final C5258a f13086H = new C5258a((C13695i) null);

    /* renamed from: I */
    private static final List<String> f13087I = C13614t.m87751m("en", "es", "jp");
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C5259b f13088A;

    /* renamed from: B */
    private String f13089B = "";
    /* access modifiers changed from: private */

    /* renamed from: C */
    public MenuItem f13090C;

    /* renamed from: D */
    private final ArrayList<C5274a> f13091D = new ArrayList<>();

    /* renamed from: E */
    private C17070a f13092E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f13093F = true;

    /* renamed from: G */
    public Map<Integer, View> f13094G = new LinkedHashMap();

    /* renamed from: d */
    public C5412c f13095d;

    /* renamed from: f */
    public C5527g f13096f;

    /* renamed from: g */
    public C10312a f13097g;

    /* renamed from: o */
    public C6353g f13098o;

    /* renamed from: p */
    public C5070a f13099p;

    /* renamed from: s */
    public C4083b f13100s;

    /* renamed from: z */
    public C7245d f13101z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$a */
    /* compiled from: TemplateStoreFragment.kt */
    public static final class C5258a {
        private C5258a() {
        }

        public /* synthetic */ C5258a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$b */
    /* compiled from: TemplateStoreFragment.kt */
    public final class C5259b extends FragmentPagerAdapter {

        /* renamed from: a */
        private final boolean f13102a;

        /* renamed from: b */
        private final boolean f13103b;

        /* renamed from: c */
        private C5314g f13104c;

        /* renamed from: d */
        final /* synthetic */ TemplateStoreFragment f13105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5259b(TemplateStoreFragment templateStoreFragment, FragmentManager fragmentManager, boolean z, boolean z2) {
            super(fragmentManager);
            C13706o.m87929f(fragmentManager, "fm");
            this.f13105d = templateStoreFragment;
            this.f13102a = z;
            this.f13103b = z2;
        }

        /* renamed from: a */
        public final C5314g mo30420a() {
            return this.f13104c;
        }

        public int getCount() {
            return (this.f13102a ? 1 : 0) + true + (this.f13103b ? 1 : 0);
        }

        public Fragment getItem(int i) {
            boolean z = this.f13103b;
            if (z && i == 0) {
                return C5359i.f13222s.mo30547a();
            }
            if (i == z) {
                return C5472t.C5473a.m21072b(C5472t.f13410K, 2, 0, false, this.f13102a, false, 22, (Object) null);
            }
            if (i == (z ? 1 : 0) + true) {
                return C5472t.C5473a.m21072b(C5472t.f13410K, 0, 0, false, this.f13102a, false, 22, (Object) null);
            }
            if (i == z + true) {
                return C5472t.C5473a.m21072b(C5472t.f13410K, 1, 0, false, this.f13102a, false, 22, (Object) null);
            }
            if (i == z + true) {
                return C5560c.f13524z.mo30831a();
            }
            if (i == z + true) {
                return C5472t.C5473a.m21072b(C5472t.f13410K, 3, 0, false, true, true, 6, (Object) null);
            }
            return C5560c.f13524z.mo30831a();
        }

        public CharSequence getPageTitle(int i) {
            boolean z = this.f13103b;
            if (z && i == 0) {
                return this.f13105d.getString(C17541R$string.template_store_updates);
            }
            if (i == z) {
                return this.f13105d.getString(C17541R$string.template_store_top_new);
            }
            if (i == (z ? 1 : 0) + true) {
                return this.f13105d.getString(C17541R$string.template_store_top_rated);
            }
            if (i == z + true) {
                return this.f13105d.getString(C17541R$string.template_store_latest);
            }
            if (i == z + true) {
                return this.f13105d.getString(C17541R$string.template_store_top_users);
            }
            return i == z + true ? this.f13105d.getString(C17541R$string.template_store_most_reported) : "????";
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            C13706o.m87929f(viewGroup, "container");
            C13706o.m87929f(obj, "item");
            if (this.f13104c != obj) {
                this.f13104c = (C5314g) obj;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$c */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5260c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $language;
        final /* synthetic */ MenuItem $menuItem;
        int label;
        final /* synthetic */ TemplateStoreFragment this$0;

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$c$a */
        /* compiled from: TemplateStoreFragment.kt */
        static final class C5261a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ String $language;
            final /* synthetic */ MenuItem $menuItem;
            int label;
            final /* synthetic */ TemplateStoreFragment this$0;

            /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$c$a$a */
            /* compiled from: TemplateStoreFragment.kt */
            static final class C5262a extends C13708q implements C16254a<C13339u> {
                final /* synthetic */ String $language;
                final /* synthetic */ MenuItem $menuItem;
                final /* synthetic */ TemplateStoreFragment this$0;

                /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$c$a$a$a */
                /* compiled from: TemplateStoreFragment.kt */
                static final class C5263a extends C13708q implements C16265l<Boolean, C13339u> {
                    final /* synthetic */ String $language;
                    final /* synthetic */ MenuItem $menuItem;
                    final /* synthetic */ TemplateStoreFragment this$0;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C5263a(TemplateStoreFragment templateStoreFragment, String str, MenuItem menuItem) {
                        super(1);
                        this.this$0 = templateStoreFragment;
                        this.$language = str;
                        this.$menuItem = menuItem;
                    }

                    /* renamed from: a */
                    public final void mo30423a(boolean z) {
                        FrameLayout frameLayout = (FrameLayout) this.this$0.mo30410X(C17532R$id.loadingBlocker);
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        if (z) {
                            C5163j2.m20102Y5(MacroDroidApplication.f9883I.mo27303b(), this.$language);
                            if (this.this$0.isAdded() && this.this$0.getContext() != null) {
                                MenuItem menuItem = this.$menuItem;
                                if (menuItem != null) {
                                    menuItem.setChecked(true);
                                }
                                this.this$0.m20454H0();
                                return;
                            }
                            return;
                        }
                        Context context = this.this$0.getContext();
                        if (context != null) {
                            C15626c.m94876a(context, context.getString(C17541R$string.error), 1).show();
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo30423a(((Boolean) obj).booleanValue());
                        return C13339u.f61331a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C5262a(TemplateStoreFragment templateStoreFragment, String str, MenuItem menuItem) {
                    super(0);
                    this.this$0 = templateStoreFragment;
                    this.$language = str;
                    this.$menuItem = menuItem;
                }

                public final void invoke() {
                    FrameLayout frameLayout = (FrameLayout) this.this$0.mo30410X(C17532R$id.loadingBlocker);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    C7245d y0 = this.this$0.mo30418y0();
                    String str = this.$language;
                    C13706o.m87928e(str, "language");
                    y0.mo37113g(str, new C5263a(this.this$0, this.$language, this.$menuItem));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5261a(TemplateStoreFragment templateStoreFragment, String str, MenuItem menuItem, C13635d<? super C5261a> dVar) {
                super(2, dVar);
                this.this$0 = templateStoreFragment;
                this.$language = str;
                this.$menuItem = menuItem;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C5261a(this.this$0, this.$language, this.$menuItem, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C5261a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C7245d y0 = this.this$0.mo30418y0();
                    FragmentActivity requireActivity = this.this$0.requireActivity();
                    C13706o.m87928e(requireActivity, "requireActivity()");
                    String displayLanguage = Locale.getDefault().getDisplayLanguage();
                    C13706o.m87928e(displayLanguage, "getDefault().displayLanguage");
                    y0.mo37112e(requireActivity, displayLanguage, new C5262a(this.this$0, this.$language, this.$menuItem));
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$c$b */
        /* compiled from: TemplateStoreFragment.kt */
        static final class C5264b extends C13708q implements C16265l<Boolean, C13339u> {
            final /* synthetic */ String $language;
            final /* synthetic */ MenuItem $menuItem;
            final /* synthetic */ TemplateStoreFragment this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5264b(MenuItem menuItem, TemplateStoreFragment templateStoreFragment, String str) {
                super(1);
                this.$menuItem = menuItem;
                this.this$0 = templateStoreFragment;
                this.$language = str;
            }

            /* renamed from: a */
            public final void mo30424a(boolean z) {
                if (z) {
                    MenuItem menuItem = this.$menuItem;
                    if (menuItem != null) {
                        menuItem.setChecked(true);
                    }
                    C5163j2.m20102Y5(this.this$0.requireContext(), this.$language);
                    this.this$0.m20454H0();
                    return;
                }
                Context context = this.this$0.getContext();
                if (context != null) {
                    C15626c.m94876a(context, context.getString(C17541R$string.error), 1).show();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo30424a(((Boolean) obj).booleanValue());
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5260c(TemplateStoreFragment templateStoreFragment, String str, MenuItem menuItem, C13635d<? super C5260c> dVar) {
            super(2, dVar);
            this.this$0 = templateStoreFragment;
            this.$language = str;
            this.$menuItem = menuItem;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5260c(this.this$0, this.$language, this.$menuItem, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5260c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C7245d y0 = this.this$0.mo30418y0();
                String str = this.$language;
                C13706o.m87928e(str, "language");
                this.label = 1;
                obj = y0.mo37114j(str, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2) {
                C13332o.m85685b(obj);
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                C15423h2 c2 = C15186a1.m93731c();
                C5261a aVar = new C5261a(this.this$0, this.$language, this.$menuItem, (C13635d<? super C5261a>) null);
                this.label = 2;
                if (C15414h.m94298g(c2, aVar, this) == c) {
                    return c;
                }
            } else {
                C7245d y02 = this.this$0.mo30418y0();
                String str2 = this.$language;
                C13706o.m87928e(str2, "language");
                y02.mo37113g(str2, new C5264b(this.$menuItem, this.this$0, this.$language));
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$d */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5265d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5265d(TemplateStoreFragment templateStoreFragment) {
            super(0);
            this.this$0 = templateStoreFragment;
        }

        public final void invoke() {
            this.this$0.mo30416u0().mo40935j();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$e */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5266e extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5266e(TemplateStoreFragment templateStoreFragment) {
            super(0);
            this.this$0 = templateStoreFragment;
        }

        public final void invoke() {
            this.this$0.mo30409N0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$f */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5267f extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ List<TemplateCategory> $categories;
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5267f(TemplateStoreFragment templateStoreFragment, List<TemplateCategory> list) {
            super(1);
            this.this$0 = templateStoreFragment;
            this.$categories = list;
        }

        /* renamed from: a */
        public final void mo30425a(int i) {
            if (this.this$0.f13093F) {
                this.this$0.f13093F = false;
                return;
            }
            this.this$0.mo30413q0().mo30615f(Integer.valueOf(this.$categories.get(i).getId()));
            this.this$0.m20453G0(this.$categories.get(i).getId());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30425a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$g */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5268g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5268g(TemplateStoreFragment templateStoreFragment, C13635d<? super C5268g> dVar) {
            super(3, dVar);
            this.this$0 = templateStoreFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5268g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.startActivity(new Intent(this.this$0.requireActivity(), TemplateSearchActivity.class));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$h */
    /* compiled from: TemplateStoreFragment.kt */
    public static final class C5269h extends OnBackPressedCallback {

        /* renamed from: a */
        final /* synthetic */ TemplateStoreFragment f13106a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5269h(TemplateStoreFragment templateStoreFragment) {
            super(true);
            this.f13106a = templateStoreFragment;
        }

        public void handleOnBackPressed() {
            FragmentKt.findNavController(this.f13106a).popBackStack(C17532R$id.navigation_home, false);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$i */
    /* compiled from: TemplateStoreFragment.kt */
    public static final class C5270i implements C6353g.C6355b {

        /* renamed from: a */
        final /* synthetic */ TemplateStoreFragment f13107a;

        C5270i(TemplateStoreFragment templateStoreFragment) {
            this.f13107a = templateStoreFragment;
        }

        /* renamed from: a */
        public void mo27362a() {
        }

        /* renamed from: b */
        public void mo27363b(User user) {
            C13706o.m87929f(user, "user");
            this.f13107a.m20451E0(user);
        }

        /* renamed from: c */
        public void mo27364c() {
            FrameLayout frameLayout = (FrameLayout) this.f13107a.mo30410X(C17532R$id.loadingBlocker);
            C13706o.m87928e(frameLayout, "loadingBlocker");
            frameLayout.setVisibility(0);
        }

        /* renamed from: d */
        public void mo27365d() {
            this.f13107a.m20458L0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$j */
    /* compiled from: TemplateStoreFragment.kt */
    public static final class C5271j implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ TemplateStoreFragment f13108a;

        C5271j(TemplateStoreFragment templateStoreFragment) {
            this.f13108a = templateStoreFragment;
        }

        /* renamed from: a */
        public void mo30427a(TabLayout.Tab tab) {
        }

        /* renamed from: b */
        public void mo30428b(TabLayout.Tab tab) {
        }

        /* renamed from: c */
        public void mo30429c(TabLayout.Tab tab) {
            C5259b f0 = this.f13108a.f13088A;
            if (f0 == null) {
                C13706o.m87945v("vpAdapter");
                f0 = null;
            }
            C5314g a = f0.mo30420a();
            if (a != null) {
                a.mo30501R();
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$k */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5272k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5272k(TemplateStoreFragment templateStoreFragment, C13635d<? super C5272k> dVar) {
            super(3, dVar);
            this.this$0 = templateStoreFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5272k(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ((ExpandableLayout) this.this$0.mo30410X(C17532R$id.infoBar)).mo75513c();
                C5163j2.m20260s5(this.this$0.requireContext(), false);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$l */
    /* compiled from: TemplateStoreFragment.kt */
    static final class C5273l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ TemplateStoreFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5273l(TemplateStoreFragment templateStoreFragment, C13635d<? super C5273l> dVar) {
            super(3, dVar);
            this.this$0 = templateStoreFragment;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5273l(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                TemplateStoreFragment templateStoreFragment = this.this$0;
                templateStoreFragment.m20473p0(templateStoreFragment.f13090C);
                ((ExpandableLayout) this.this$0.mo30410X(C17532R$id.infoBar)).mo75513c();
                C5163j2.m20260s5(this.this$0.requireContext(), false);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: B0 */
    private final void m20448B0() {
        ProfileActivity.C5315a aVar = ProfileActivity.f13156G;
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        startActivity(aVar.mo30512a(requireActivity, false, "", true));
    }

    /* renamed from: C0 */
    private final void m20449C0() {
        MySubscriptionsActivity.C5347a aVar = MySubscriptionsActivity.f13200A;
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        aVar.mo30537a(requireActivity);
    }

    /* renamed from: D0 */
    private final void m20450D0() {
        if (!mo30414r0().mo28009e().mo28008a()) {
            if (mo30415s0().mo29986m()) {
                C12408a.C12409a.m83286b().mo68758c(-1).mo68757a();
                Toast q = C12408a.m83283q(requireActivity(), getString(C17541R$string.sorry_pro_users_only_upload_templates), C17530R$drawable.ic_error_outline_white_24dp, ViewCompat.MEASURED_STATE_MASK, 1, true, true);
                q.setGravity(17, 0, 0);
                q.show();
                UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
                FragmentActivity requireActivity = requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                aVar.mo32326a(requireActivity);
                return;
            }
            String string = getString(C17541R$string.sorry_pro_users_only_upload_templates);
            C13706o.m87928e(string, "getString(R.string.sorry…rs_only_upload_templates)");
            String string2 = getString(C17541R$string.upgrade);
            C13706o.m87928e(string2, "getString(R.string.upgrade)");
            m20455I0(string, string2, new C5265d(this));
        } else if (mo30408A0().mo30790b().isGuest()) {
            String string3 = getString(C17541R$string.please_sign_in_template_store);
            C13706o.m87928e(string3, "getString(R.string.please_sign_in_template_store)");
            String string4 = getString(C17541R$string.sign_in);
            C13706o.m87928e(string4, "getString(R.string.sign_in)");
            m20455I0(string3, string4, new C5266e(this));
        } else {
            startActivity(new Intent(requireActivity(), TemplateUploadActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public final void m20451E0(User user) {
        m20471n0();
        try {
            String string = getString(C17541R$string.templates_signed_in_popup, user.getUsername());
            C13706o.m87928e(string, "getString(R.string.templ…_in_popup, user.username)");
            C15626c.m94876a(requireContext(), string, 1).show();
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
    }

    /* renamed from: F0 */
    private final void m20452F0() {
        TemplateCategory.C5224a aVar = TemplateCategory.Companion;
        Context requireContext = requireContext();
        C13706o.m87928e(requireContext, "requireContext()");
        List<TemplateCategory> b = TemplateCategory.C5224a.m20398b(aVar, requireContext, false, 2, (Object) null);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(b, 10));
        for (TemplateCategory name : b) {
            arrayList.add(name.getName());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), C17535R$layout.simple_spinner_item_title_white_text, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        int i = C17532R$id.categoriesSpinner;
        ((Spinner) mo30410X(i)).setAdapter(arrayAdapter);
        if (mo30413q0().mo30612c() != null) {
            Integer c = mo30413q0().mo30612c();
            if (c != null) {
                int intValue = c.intValue();
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(b, 10));
                for (TemplateCategory id : b) {
                    arrayList2.add(Integer.valueOf(id.getId()));
                }
                ((Spinner) mo30410X(C17532R$id.categoriesSpinner)).setSelection(arrayList2.indexOf(Integer.valueOf(intValue)));
            }
        } else {
            ((Spinner) mo30410X(i)).setSelection(arrayList.indexOf(getString(C17541R$string.all_categories)));
        }
        Spinner spinner = (Spinner) mo30410X(C17532R$id.categoriesSpinner);
        C13706o.m87928e(spinner, "categoriesSpinner");
        C4666m.m18145m(spinner, new C5267f(this, b));
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public final void m20453G0(int i) {
        mo30413q0().mo30614e(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public final void m20454H0() {
        boolean z = !mo30408A0().mo30790b().isGuest();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C13706o.m87928e(childFragmentManager, "this.childFragmentManager");
        this.f13088A = new C5259b(this, childFragmentManager, mo30408A0().mo30790b().isModerator(), z);
        int i = C17532R$id.viewPager;
        ViewPager viewPager = (ViewPager) mo30410X(i);
        C5259b bVar = this.f13088A;
        if (bVar == null) {
            C13706o.m87945v("vpAdapter");
            bVar = null;
        }
        viewPager.setAdapter(bVar);
        ((ViewPager) mo30410X(i)).setOffscreenPageLimit(4);
        ((ViewPager) mo30410X(i)).setPageTransformer(true, new C10435a());
        int i2 = C17532R$id.tabBar;
        ((TabLayout) mo30410X(i2)).setupWithViewPager((ViewPager) mo30410X(i));
        if (z) {
            ((ViewPager) mo30410X(i)).setCurrentItem(1, false);
        }
        if (C5163j2.m20182j(requireContext()) < 2) {
            ((ViewPager) mo30410X(i)).setCurrentItem(1);
        }
        ((TabLayout) mo30410X(i2)).mo58998d(new C5271j(this));
    }

    /* renamed from: I0 */
    private final void m20455I0(String str, String str2, C16254a<C13339u> aVar) {
        SnackbarAnimate i = SnackbarAnimate.m69574i((CoordinatorLayout) mo30410X(C17532R$id.coordinator_layout), str, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY);
        C13706o.m87928e(i, "make(coordinator_layout, errorMessage, 5000)");
        i.mo58921e().setBackgroundResource(2131100690);
        View findViewById = i.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        View findViewById2 = i.mo58921e().findViewById(2131363814);
        C13706o.m87927d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(-1);
        i.mo58927m(str2, new C5311d(aVar));
        i.mo58932r();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m20456J0(C16254a aVar, View view) {
        C13706o.m87929f(aVar, "$action");
        aVar.invoke();
    }

    /* renamed from: K0 */
    private final void m20457K0() {
        if (!f13087I.contains(Locale.getDefault().getLanguage()) && C5163j2.m19956E1(requireContext())) {
            ((ExpandableLayout) mo30410X(C17532R$id.infoBar)).mo75515e();
            ImageView imageView = (ImageView) mo30410X(C17532R$id.infoBarDismissButton);
            C13706o.m87928e(imageView, "infoBarDismissButton");
            C4666m.m18147o(imageView, (C13640g) null, new C5272k(this, (C13635d<? super C5272k>) null), 1, (Object) null);
            Button button = (Button) mo30410X(C17532R$id.infoBarButton);
            C13706o.m87928e(button, "infoBarButton");
            C4666m.m18147o(button, (C13640g) null, new C5273l(this, (C13635d<? super C5273l>) null), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public final void m20458L0() {
        FrameLayout frameLayout = (FrameLayout) mo30410X(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        View view = getView();
        C13706o.m87926c(view);
        SnackbarAnimate h = SnackbarAnimate.m69573h(view, C17541R$string.could_not_sign_in, 0);
        C13706o.m87928e(h, "make(view!!, R.string.co…ckbarAnimate.LENGTH_LONG)");
        h.mo58921e().setBackgroundResource(C17528R$color.snack_bar_error);
        View findViewById = h.mo58921e().findViewById(2131363815);
        C13706o.m87927d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(-1);
        h.mo58932r();
    }

    /* renamed from: O0 */
    private final void m20459O0(MenuItem menuItem) {
        if (C5163j2.m20177i2(requireContext()) != null) {
            C5163j2.m20102Y5(requireContext(), (String) null);
            menuItem.setChecked(false);
            m20454H0();
            return;
        }
        m20473p0(menuItem);
    }

    /* renamed from: n0 */
    private final void m20471n0() {
        int i = C17532R$id.toolbar;
        MenuItem findItem = ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.menu_upload);
        MenuItem findItem2 = ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.menu_my_profile);
        MenuItem findItem3 = ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.menu_sign_in);
        MenuItem findItem4 = ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.menu_my_subscriptions);
        Spinner spinner = (Spinner) mo30410X(C17532R$id.categoriesSpinner);
        C13706o.m87928e(spinner, "categoriesSpinner");
        boolean z = true;
        boolean z2 = spinner.getVisibility() == 0;
        findItem.setVisible(z2);
        findItem2.setVisible(z2 && !mo30408A0().mo30790b().isGuest());
        findItem3.setVisible(!findItem2.isVisible());
        if (!z2 || mo30408A0().mo30790b().isGuest()) {
            z = false;
        }
        findItem4.setVisible(z);
        ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.menu_compact_mode).setChecked(C5163j2.m20185j2(requireContext()));
        this.f13090C = ((Toolbar) mo30410X(i)).getMenu().findItem(C17532R$id.auto_translate);
        if (f13087I.contains(Locale.getDefault().getLanguage())) {
            MenuItem menuItem = this.f13090C;
            C13706o.m87926c(menuItem);
            menuItem.setVisible(false);
        } else {
            String language = Locale.getDefault().getLanguage();
            MenuItem menuItem2 = this.f13090C;
            C13706o.m87926c(menuItem2);
            menuItem2.setChecked(C13706o.m87924a(C5163j2.m20177i2(requireContext()), language));
        }
        ((Toolbar) mo30410X(i)).setOnMenuItemClickListener(new C5312e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final boolean m20472o0(TemplateStoreFragment templateStoreFragment, MenuItem menuItem) {
        C13706o.m87929f(templateStoreFragment, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 2131363247) {
            templateStoreFragment.m20448B0();
        } else if (valueOf != null && valueOf.intValue() == 2131363248) {
            templateStoreFragment.m20449C0();
        } else if (valueOf != null && valueOf.intValue() == 2131363278) {
            templateStoreFragment.m20450D0();
        } else if (valueOf != null && valueOf.intValue() == 2131363270) {
            templateStoreFragment.mo30409N0();
        } else if (valueOf != null && valueOf.intValue() == 2131363217) {
            menuItem.setChecked(!menuItem.isChecked());
            C5163j2.m20109Z5(templateStoreFragment.requireContext(), menuItem.isChecked());
            templateStoreFragment.m20454H0();
        } else if (valueOf != null && valueOf.intValue() == 2131362022) {
            C13706o.m87928e(menuItem, "it");
            templateStoreFragment.m20459O0(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public final void m20473p0(MenuItem menuItem) {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5260c(this, Locale.getDefault().getLanguage(), menuItem, (C13635d<? super C5260c>) null), 2, (Object) null);
    }

    /* renamed from: A0 */
    public final C5527g mo30408A0() {
        C5527g gVar = this.f13096f;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("userProvider");
        return null;
    }

    /* renamed from: N0 */
    public final void mo30409N0() {
        mo30417v0().mo32406t(this);
    }

    /* renamed from: U */
    public void mo26239U() {
        this.f13094G.clear();
    }

    /* renamed from: X */
    public View mo30410X(int i) {
        View findViewById;
        Map<Integer, View> map = this.f13094G;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: Y */
    public void mo30411Y(C5274a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13091D.add(aVar);
    }

    /* renamed from: b0 */
    public void mo30412b0(C5274a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13091D.remove(aVar);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        C13706o.m87928e(requireActivity, "requireActivity()");
        C8151a.m33856E(requireActivity, "TemplateStoreFragment");
        Integer c = mo30413q0().mo30612c();
        if (c != null) {
            mo30413q0().mo30614e(c.intValue());
        }
        m20454H0();
        m20452F0();
        ImageView imageView = (ImageView) mo30410X(C17532R$id.searchButton);
        C13706o.m87928e(imageView, "searchButton");
        C4666m.m18147o(imageView, (C13640g) null, new C5268g(this, (C13635d<? super C5268g>) null), 1, (Object) null);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new C5269h(this));
        ((Toolbar) mo30410X(C17532R$id.toolbar)).inflateMenu(C17536R$menu.templates_menu);
        m20457K0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: z9.a} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.viewpager.widget.PagerAdapter] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            com.firebase.ui.auth.IdpResponse r1 = com.firebase.p073ui.auth.IdpResponse.m25763g(r10)
            r10 = 222(0xde, float:3.11E-43)
            r0 = -1
            r2 = 0
            if (r8 == r10) goto L_0x0055
            r10 = 9729(0x2601, float:1.3633E-41)
            if (r8 == r10) goto L_0x0012
            goto L_0x0065
        L_0x0012:
            if (r9 != r0) goto L_0x0030
            com.arlosoft.macrodroid.user.signin.g r0 = r7.mo30417v0()
            z9.a r8 = r7.f13092E
            if (r8 != 0) goto L_0x0022
            java.lang.String r8 = "compositeDisposable"
            kotlin.jvm.internal.C13706o.m87945v(r8)
            goto L_0x0023
        L_0x0022:
            r2 = r8
        L_0x0023:
            com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$i r3 = new com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$i
            r3.<init>(r7)
            r4 = 0
            r5 = 8
            r6 = 0
            com.arlosoft.macrodroid.user.signin.C6353g.m24557j(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0065
        L_0x0030:
            if (r1 == 0) goto L_0x0065
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Sign in error: "
            r8.append(r9)
            com.firebase.ui.auth.FirebaseUiException r9 = r1.mo34092j()
            if (r9 == 0) goto L_0x004a
            int r9 = r9.mo34082a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L_0x004a:
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r8)
            goto L_0x0065
        L_0x0055:
            if (r9 != r0) goto L_0x0065
            com.arlosoft.macrodroid.templatestore.ui.TemplateStoreFragment$b r8 = r7.f13088A
            if (r8 != 0) goto L_0x0061
            java.lang.String r8 = "vpAdapter"
            kotlin.jvm.internal.C13706o.m87945v(r8)
            goto L_0x0062
        L_0x0061:
            r2 = r8
        L_0x0062:
            r2.notifyDataSetChanged()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.p071ui.TemplateStoreFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13092E = new C17070a();
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13706o.m87929f(layoutInflater, "inflater");
        return layoutInflater.inflate(C17535R$layout.fragment_template_store, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C17070a aVar = this.f13092E;
        if (aVar == null) {
            C13706o.m87945v("compositeDisposable");
            aVar = null;
        }
        aVar.mo80337d();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo26239U();
    }

    public void onResume() {
        super.onResume();
        FrameLayout frameLayout = (FrameLayout) mo30410X(C17532R$id.loadingBlocker);
        C13706o.m87928e(frameLayout, "loadingBlocker");
        frameLayout.setVisibility(8);
        m20471n0();
    }

    /* renamed from: q0 */
    public final C5412c mo30413q0() {
        C5412c cVar = this.f13095d;
        if (cVar != null) {
            return cVar;
        }
        C13706o.m87945v("categoryManager");
        return null;
    }

    /* renamed from: r0 */
    public final C4083b mo30414r0() {
        C4083b bVar = this.f13100s;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: s0 */
    public final C5070a mo30415s0() {
        C5070a aVar = this.f13099p;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("remoteConfig");
        return null;
    }

    /* renamed from: u0 */
    public final C10312a mo30416u0() {
        C10312a aVar = this.f13097g;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("screenLoader");
        return null;
    }

    /* renamed from: v0 */
    public final C6353g mo30417v0() {
        C6353g gVar = this.f13098o;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("signInHelper");
        return null;
    }

    /* renamed from: y0 */
    public final C7245d mo30418y0() {
        C7245d dVar = this.f13101z;
        if (dVar != null) {
            return dVar;
        }
        C13706o.m87945v("translationHelper");
        return null;
    }

    /* renamed from: z */
    public String mo30419z() {
        return this.f13089B;
    }
}
