package com.arlosoft.macrodroid.plugins.pluginlist;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13710s;
import p058a3.C2229c;
import p118k2.C7471b;
import p130m2.C7899a;
import p130m2.C7901k;
import p130m2.C7902l;
import p148q0.C8151a;
import p176v0.C10312a;
import p270ga.C12318a;
import p433xa.C16880i;
import p440y9.C16971a;
import p448z9.C17070a;

/* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q */
/* compiled from: PluginListViewModel.kt */
public final class C5048q extends ViewModel {

    /* renamed from: k */
    public static final C5049a f12648k = new C5049a((C13695i) null);

    /* renamed from: a */
    private final C7471b f12649a;

    /* renamed from: b */
    private final C5527g f12650b;

    /* renamed from: c */
    private final C10312a f12651c;

    /* renamed from: d */
    private final C7899a f12652d;

    /* renamed from: e */
    private final Context f12653e;

    /* renamed from: f */
    private final C6388h1<C5050b> f12654f = new C6388h1<>();

    /* renamed from: g */
    public LiveData<PagedList<PluginDetail>> f12655g;

    /* renamed from: h */
    private final C6388h1<PluginDetail> f12656h = new C6388h1<>();

    /* renamed from: i */
    private C7902l f12657i;

    /* renamed from: j */
    private final C17070a f12658j = new C17070a();

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$a */
    /* compiled from: PluginListViewModel.kt */
    public static final class C5049a {
        private C5049a() {
        }

        public /* synthetic */ C5049a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b */
    /* compiled from: PluginListViewModel.kt */
    public static abstract class C5050b {

        /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b$a */
        /* compiled from: PluginListViewModel.kt */
        public static final class C5051a extends C5050b {

            /* renamed from: a */
            public static final C5051a f12659a = new C5051a();

            private C5051a() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b$b */
        /* compiled from: PluginListViewModel.kt */
        public static final class C5052b extends C5050b {

            /* renamed from: a */
            public static final C5052b f12660a = new C5052b();

            private C5052b() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b$c */
        /* compiled from: PluginListViewModel.kt */
        public static final class C5053c extends C5050b {

            /* renamed from: a */
            public static final C5053c f12661a = new C5053c();

            private C5053c() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b$d */
        /* compiled from: PluginListViewModel.kt */
        public static final class C5054d extends C5050b {

            /* renamed from: a */
            private final PluginDetail f12662a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5054d(PluginDetail pluginDetail) {
                super((C13695i) null);
                C13706o.m87929f(pluginDetail, "pluginDetail");
                this.f12662a = pluginDetail;
            }

            /* renamed from: a */
            public final PluginDetail mo29927a() {
                return this.f12662a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$b$e */
        /* compiled from: PluginListViewModel.kt */
        public static final class C5055e extends C5050b {

            /* renamed from: a */
            public static final C5055e f12663a = new C5055e();

            private C5055e() {
                super((C13695i) null);
            }
        }

        private C5050b() {
        }

        public /* synthetic */ C5050b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.q$c */
    /* compiled from: PluginListViewModel.kt */
    /* synthetic */ class C5056c extends C13710s {

        /* renamed from: a */
        public static final C5056c f12664a = new C5056c();

        C5056c() {
            super(C7901k.class, "loadState", "getLoadState()Landroidx/lifecycle/MutableLiveData;", 0);
        }

        public Object get(Object obj) {
            return ((C7901k) obj).mo37792i();
        }
    }

    public C5048q(C7471b bVar, C5527g gVar, C10312a aVar, C7899a aVar2, Context context) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar, "screenLoader");
        C13706o.m87929f(aVar2, "pluginListOverrideStore");
        C13706o.m87929f(context, "context");
        this.f12649a = bVar;
        this.f12650b = gVar;
        this.f12651c = aVar;
        this.f12652d = aVar2;
        this.f12653e = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m19473A() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m19474B(C5048q qVar, PluginDetail pluginDetail, PluginDetail pluginDetail2, Throwable th) {
        C13706o.m87929f(qVar, "this$0");
        C13706o.m87929f(pluginDetail, "$overridenPluginDetail");
        C13706o.m87929f(pluginDetail2, "$pluginDetail");
        qVar.f12652d.mo37789a(pluginDetail.getId(), pluginDetail2);
        qVar.f12654f.postValue(C5050b.C5051a.f12659a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final LiveData m19480m(C16880i iVar, C7901k kVar) {
        C13706o.m87929f(iVar, "$tmp0");
        return (LiveData) iVar.invoke(kVar);
    }

    /* renamed from: v */
    private final void m19481v(PluginDetail pluginDetail, int i) {
        if (C5163j2.m20184j1(this.f12653e).contains(String.valueOf(pluginDetail.getId()))) {
            this.f12654f.postValue(C5050b.C5053c.f12661a);
        } else {
            this.f12658j.mo62358a(this.f12649a.mo37633h(pluginDetail.getId(), pluginDetail.getName(), i).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C5044m(this, pluginDetail), new C5046o(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m19482w(C5048q qVar, PluginDetail pluginDetail) {
        C13706o.m87929f(qVar, "this$0");
        C13706o.m87929f(pluginDetail, "$pluginDetail");
        Set<String> j1 = C5163j2.m20184j1(qVar.f12653e);
        j1.add(String.valueOf(pluginDetail.getId()));
        C5163j2.m20094X4(qVar.f12653e, j1);
        qVar.f12654f.postValue(C5050b.C5053c.f12661a);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m19483x(C5048q qVar, Throwable th) {
        C13706o.m87929f(qVar, "this$0");
        qVar.f12654f.postValue(C5050b.C5052b.f12660a);
    }

    /* renamed from: k */
    public final C6388h1<PluginDetail> mo29915k() {
        return this.f12656h;
    }

    /* renamed from: l */
    public final LiveData<C2229c> mo29916l() {
        C7902l lVar = this.f12657i;
        if (lVar == null) {
            C13706o.m87945v("sourceFactory");
            lVar = null;
        }
        LiveData<C2229c> switchMap = Transformations.switchMap(lVar.mo37793a(), new C5043l(C5056c.f12664a));
        C13706o.m87928e(switchMap, "switchMap<PluginDataSour…ginDataSource::loadState)");
        return switchMap;
    }

    /* renamed from: n */
    public final LiveData<PagedList<PluginDetail>> mo29917n() {
        LiveData<PagedList<PluginDetail>> liveData = this.f12655g;
        if (liveData != null) {
            return liveData;
        }
        C13706o.m87945v("pagedList");
        return null;
    }

    /* renamed from: o */
    public final C6388h1<C5050b> mo29918o() {
        return this.f12654f;
    }

    /* renamed from: p */
    public final void mo29919p(int i) {
        this.f12657i = new C7902l(this.f12649a, this.f12658j, this.f12650b.mo30790b().getUserId(), i, "en");
        PagedList.Config build = new PagedList.Config.Builder().setPageSize(50).setInitialLoadSizeHint(100).setEnablePlaceholders(false).build();
        C7902l lVar = this.f12657i;
        if (lVar == null) {
            C13706o.m87945v("sourceFactory");
            lVar = null;
        }
        mo29925y(new LivePagedListBuilder(lVar, build).build());
    }

    /* renamed from: q */
    public final void mo29920q() {
        PagingSource pagingSource;
        try {
            PagedList value = mo29917n().getValue();
            if (value != null && (pagingSource = value.getPagingSource()) != null) {
                pagingSource.invalidate();
            }
        } catch (IllegalStateException e) {
            C8151a.m33873n(e);
        }
    }

    /* renamed from: r */
    public final void mo29921r(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "plugin");
        this.f12656h.postValue(pluginDetail);
    }

    /* renamed from: s */
    public final void mo29922s(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "plugin");
        this.f12654f.postValue(new C5050b.C5054d(pluginDetail));
    }

    /* renamed from: t */
    public final void mo29923t(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "pluginDetail");
        m19481v(pluginDetail, 0);
    }

    /* renamed from: u */
    public final void mo29924u(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "pluginDetail");
        m19481v(pluginDetail, 1);
    }

    /* renamed from: y */
    public final void mo29925y(LiveData<PagedList<PluginDetail>> liveData) {
        C13706o.m87929f(liveData, "<set-?>");
        this.f12655g = liveData;
    }

    /* renamed from: z */
    public final void mo29926z(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "pluginDetail");
        int userId = this.f12650b.mo30790b().getUserId();
        if (userId == 0) {
            this.f12654f.postValue(C5050b.C5055e.f12663a);
            return;
        }
        PluginDetail b = this.f12652d.mo37790b(pluginDetail.getId());
        if (b == null) {
            b = pluginDetail;
        }
        boolean z = !b.getStarred();
        this.f12652d.mo37789a(b.getId(), b.updateStarRating(z));
        this.f12658j.mo62358a(this.f12649a.mo37629d(C4660g.m18129g(pluginDetail.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + userId), b.getId(), userId, z).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(C5045n.f12643a, new C5047p(this, b, pluginDetail)));
    }
}
