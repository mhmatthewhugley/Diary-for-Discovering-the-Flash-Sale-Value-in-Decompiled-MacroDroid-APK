package com.arlosoft.macrodroid.plugins.comments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import com.arlosoft.macrodroid.templatestore.model.PluginPostCommentBody;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13716y;
import org.apache.http.cookie.ClientCookie;
import p058a3.C2229c;
import p118k2.C7471b;
import p124l2.C7663g;
import p124l2.C7664h;
import p130m2.C7899a;
import p270ga.C12318a;
import p414v9.C16728b;
import p414v9.C16730d;
import p433xa.C16885l;
import p440y9.C16971a;
import p448z9.C17070a;
import retrofit2.HttpException;

/* renamed from: com.arlosoft.macrodroid.plugins.comments.m */
/* compiled from: PluginCommentsViewModel.kt */
public final class C4999m extends ViewModel {

    /* renamed from: a */
    private final C7471b f12576a;

    /* renamed from: b */
    private final C5527g f12577b;

    /* renamed from: c */
    private final C7899a f12578c;

    /* renamed from: d */
    public LiveData<PagedList<Comment>> f12579d;

    /* renamed from: e */
    private final C6388h1<C5000a> f12580e = new C6388h1<>();

    /* renamed from: f */
    private final C17070a f12581f = new C17070a();

    /* renamed from: g */
    private C7664h f12582g;

    /* renamed from: h */
    private PluginDetail f12583h;

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a */
    /* compiled from: PluginCommentsViewModel.kt */
    public static abstract class C5000a {

        /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a$a */
        /* compiled from: PluginCommentsViewModel.kt */
        public static final class C5001a extends C5000a {

            /* renamed from: a */
            private final boolean f12584a;

            public C5001a(boolean z) {
                super((C13695i) null);
                this.f12584a = z;
            }

            /* renamed from: a */
            public final boolean mo29816a() {
                return this.f12584a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a$b */
        /* compiled from: PluginCommentsViewModel.kt */
        public static final class C5002b extends C5000a {

            /* renamed from: a */
            public static final C5002b f12585a = new C5002b();

            private C5002b() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a$c */
        /* compiled from: PluginCommentsViewModel.kt */
        public static final class C5003c extends C5000a {

            /* renamed from: a */
            private final boolean f12586a;

            public C5003c(boolean z) {
                super((C13695i) null);
                this.f12586a = z;
            }

            /* renamed from: a */
            public final boolean mo29817a() {
                return this.f12586a;
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a$d */
        /* compiled from: PluginCommentsViewModel.kt */
        public static final class C5004d extends C5000a {

            /* renamed from: a */
            public static final C5004d f12587a = new C5004d();

            private C5004d() {
                super((C13695i) null);
            }
        }

        /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$a$e */
        /* compiled from: PluginCommentsViewModel.kt */
        public static final class C5005e extends C5000a {

            /* renamed from: a */
            public static final C5005e f12588a = new C5005e();

            private C5005e() {
                super((C13695i) null);
            }
        }

        private C5000a() {
        }

        public /* synthetic */ C5000a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.plugins.comments.m$b */
    /* compiled from: PluginCommentsViewModel.kt */
    /* synthetic */ class C5006b extends C13716y {

        /* renamed from: a */
        public static final C5006b f12589a = new C5006b();

        C5006b() {
            super(C7663g.class, "loadState", "getLoadState()Landroidx/lifecycle/MutableLiveData;", 0);
        }

        public Object get(Object obj) {
            return ((C7663g) obj).mo37675h();
        }
    }

    public C4999m(C7471b bVar, C5527g gVar, C7899a aVar) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar, "pluginListOverrideStore");
        this.f12576a = bVar;
        this.f12577b = gVar;
        this.f12578c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m19372A(C4999m mVar, Throwable th) {
        C13706o.m87929f(mVar, "this$0");
        mVar.f12580e.postValue(new C5000a.C5001a((th instanceof HttpException) && ((HttpException) th).mo80527a() == 403));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m19380n(C4999m mVar) {
        C13706o.m87929f(mVar, "this$0");
        mVar.f12580e.postValue(C5000a.C5002b.f12585a);
        PluginDetail pluginDetail = mVar.f12583h;
        PluginDetail pluginDetail2 = null;
        if (pluginDetail == null) {
            C13706o.m87945v("pluginDetail");
            pluginDetail = null;
        }
        PluginDetail updateCommentCount = pluginDetail.updateCommentCount(false);
        mVar.f12583h = updateCommentCount;
        C7899a aVar = mVar.f12578c;
        if (updateCommentCount == null) {
            C13706o.m87945v("pluginDetail");
            updateCommentCount = null;
        }
        int id = updateCommentCount.getId();
        PluginDetail pluginDetail3 = mVar.f12583h;
        if (pluginDetail3 == null) {
            C13706o.m87945v("pluginDetail");
        } else {
            pluginDetail2 = pluginDetail3;
        }
        aVar.mo37789a(id, pluginDetail2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m19381o(C4999m mVar, Throwable th) {
        C13706o.m87929f(mVar, "this$0");
        mVar.f12580e.postValue(C5000a.C5005e.f12588a);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final LiveData m19382r(C16885l lVar, C7663g gVar) {
        C13706o.m87929f(lVar, "$tmp0");
        return (LiveData) lVar.invoke(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m19383v(C4999m mVar) {
        C13706o.m87929f(mVar, "this$0");
        C7664h hVar = mVar.f12582g;
        PluginDetail pluginDetail = null;
        if (hVar == null) {
            C13706o.m87945v("sourceFactory");
            hVar = null;
        }
        hVar.mo37677b();
        mVar.f12580e.postValue(C5000a.C5004d.f12587a);
        PluginDetail pluginDetail2 = mVar.f12583h;
        if (pluginDetail2 == null) {
            C13706o.m87945v("pluginDetail");
            pluginDetail2 = null;
        }
        PluginDetail updateCommentCount = pluginDetail2.updateCommentCount(true);
        mVar.f12583h = updateCommentCount;
        C7899a aVar = mVar.f12578c;
        if (updateCommentCount == null) {
            C13706o.m87945v("pluginDetail");
            updateCommentCount = null;
        }
        int id = updateCommentCount.getId();
        PluginDetail pluginDetail3 = mVar.f12583h;
        if (pluginDetail3 == null) {
            C13706o.m87945v("pluginDetail");
        } else {
            pluginDetail = pluginDetail3;
        }
        aVar.mo37789a(id, pluginDetail);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m19384w(C4999m mVar, Throwable th) {
        C13706o.m87929f(mVar, "this$0");
        mVar.f12580e.postValue(new C5000a.C5003c((th instanceof HttpException) && ((HttpException) th).mo80527a() == 403));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m19385z(C4999m mVar) {
        C13706o.m87929f(mVar, "this$0");
        mVar.f12580e.postValue(C5000a.C5002b.f12585a);
    }

    /* renamed from: m */
    public final void mo29808m(Comment comment) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        this.f12581f.mo62358a(this.f12576a.mo37626a(C4660g.m18129g(comment.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + comment.getPluginId()), comment.getId(), comment.getPluginId()).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C4993g(this), new C4996j(this)));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f12581f.dispose();
    }

    /* renamed from: p */
    public final LiveData<PagedList<Comment>> mo29809p() {
        LiveData<PagedList<Comment>> liveData = this.f12579d;
        if (liveData != null) {
            return liveData;
        }
        C13706o.m87945v("commentsList");
        return null;
    }

    /* renamed from: q */
    public final LiveData<C2229c> mo29810q() {
        C7664h hVar = this.f12582g;
        if (hVar == null) {
            C13706o.m87945v("sourceFactory");
            hVar = null;
        }
        LiveData<C2229c> switchMap = Transformations.switchMap(hVar.mo37676a(), new C4992f(C5006b.f12589a));
        C13706o.m87928e(switchMap, "switchMap<PluginComments…ntsDataSource::loadState)");
        return switchMap;
    }

    /* renamed from: s */
    public final C6388h1<C5000a> mo29811s() {
        return this.f12580e;
    }

    /* renamed from: t */
    public final void mo29812t(PluginDetail pluginDetail) {
        C13706o.m87929f(pluginDetail, "pluginDetail");
        this.f12583h = pluginDetail;
        this.f12582g = new C7664h(this.f12576a, this.f12581f, pluginDetail.getId());
        PagedList.Config build = new PagedList.Config.Builder().setPageSize(10).setInitialLoadSizeHint(20).setEnablePlaceholders(false).build();
        C7664h hVar = this.f12582g;
        if (hVar == null) {
            C13706o.m87945v("sourceFactory");
            hVar = null;
        }
        mo29814x(new LivePagedListBuilder(hVar, build).build());
    }

    /* renamed from: u */
    public final void mo29813u(String str) {
        C13706o.m87929f(str, "commentText");
        if (!(str.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            PluginDetail pluginDetail = this.f12583h;
            PluginDetail pluginDetail2 = null;
            if (pluginDetail == null) {
                C13706o.m87945v("pluginDetail");
                pluginDetail = null;
            }
            sb.append(pluginDetail.getId());
            sb.append("adb97ac6-f780-4a41-8475-ce661b574999");
            sb.append(this.f12577b.mo30790b().getUserId());
            sb.append(str);
            String g = C4660g.m18129g(sb.toString());
            C17070a aVar = this.f12581f;
            C16730d[] dVarArr = new C16730d[2];
            dVarArr[0] = C16728b.m99298n(2, TimeUnit.SECONDS);
            C7471b bVar = this.f12576a;
            int userId = this.f12577b.mo30790b().getUserId();
            PluginDetail pluginDetail3 = this.f12583h;
            if (pluginDetail3 == null) {
                C13706o.m87945v("pluginDetail");
            } else {
                pluginDetail2 = pluginDetail3;
            }
            dVarArr[1] = bVar.mo37630e(g, new PluginPostCommentBody(userId, pluginDetail2.getId(), str));
            aVar.mo62358a(C16728b.m99297h(dVarArr).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C4994h(this), new C4998l(this)));
        }
    }

    /* renamed from: x */
    public final void mo29814x(LiveData<PagedList<Comment>> liveData) {
        C13706o.m87929f(liveData, "<set-?>");
        this.f12579d = liveData;
    }

    /* renamed from: y */
    public final void mo29815y(Comment comment, String str) {
        C13706o.m87929f(comment, ClientCookie.COMMENT_ATTR);
        C13706o.m87929f(str, "newCommentText");
        if (!C13706o.m87924a(comment.getText(), str)) {
            if (!(str.length() == 0)) {
                this.f12581f.mo62358a(C16728b.m99297h(C16728b.m99298n(2, TimeUnit.SECONDS), this.f12576a.mo37627b(C4660g.m18129g(comment.getId() + "adb97ac6-f780-4a41-8475-ce661b574999" + str), this.f12577b.mo30790b().getUserId(), comment.getId(), str)).mo79658m(C12318a.m83030b()).mo79655i(C16971a.m100210a()).mo79657k(new C4995i(this), new C4997k(this)));
            }
        }
    }
}
