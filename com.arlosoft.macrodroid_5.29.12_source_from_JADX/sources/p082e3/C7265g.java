package p082e3;

import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.ItemKeyedDataSource;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13706o;
import p058a3.C2229c;
import p199z2.C10434a;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p448z9.C17070a;

/* renamed from: e3.g */
/* compiled from: pluginCommentsDataSource.kt */
public final class C7265g extends ItemKeyedDataSource<Long, Comment> {

    /* renamed from: a */
    private final C10434a f17696a;

    /* renamed from: b */
    private final C17070a f17697b;

    /* renamed from: c */
    private final int f17698c;

    /* renamed from: d */
    private MutableLiveData<C2229c> f17699d = new MutableLiveData<>();

    public C7265g(C10434a aVar, C17070a aVar2, int i) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        this.f17696a = aVar;
        this.f17697b = aVar2;
        this.f17698c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C15737b m29994i(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12141f.f58432a);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C15737b m29995j(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(3, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m29996k(ItemKeyedDataSource.LoadCallback loadCallback, List list) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87928e(list, "commentList");
        loadCallback.onResult(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C15737b m29997l(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12140e.f58431a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15737b m29998m(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(3, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m29999n(ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, C7265g gVar, List list) {
        C13706o.m87929f(loadInitialCallback, "$callback");
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87928e(list, "commentList");
        loadInitialCallback.onResult(list);
        if (list.isEmpty()) {
            gVar.m30000o(C2229c.EMPTY);
        } else {
            gVar.m30000o(C2229c.HAS_DATA);
        }
    }

    /* renamed from: o */
    private final void m30000o(C2229c cVar) {
        this.f17699d.postValue(cVar);
    }

    /* renamed from: g */
    public Long getKey(Comment comment) {
        C13706o.m87929f(comment, "item");
        return Long.valueOf(comment.getTimestamp());
    }

    /* renamed from: h */
    public final MutableLiveData<C2229c> mo37135h() {
        return this.f17699d;
    }

    public void loadAfter(ItemKeyedDataSource.LoadParams<Long> loadParams, ItemKeyedDataSource.LoadCallback<Comment> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.f17697b.mo62358a(this.f17696a.mo41159c(this.f17698c, ((Number) loadParams.key).longValue(), loadParams.requestedLoadSize).mo79727m(C12139d.f58430a).mo79728n(new C12136a(loadCallback)));
    }

    public void loadBefore(ItemKeyedDataSource.LoadParams<Long> loadParams, ItemKeyedDataSource.LoadCallback<Comment> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
    }

    public void loadInitial(ItemKeyedDataSource.LoadInitialParams<Long> loadInitialParams, ItemKeyedDataSource.LoadInitialCallback<Comment> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        m30000o(C2229c.LOADING);
        this.f17697b.mo62358a(this.f17696a.mo41159c(this.f17698c, LocationRequestCompat.PASSIVE_INTERVAL, loadInitialParams.requestedLoadSize).mo79727m(C12138c.f58429a).mo79728n(new C12137b(loadInitialCallback, this)));
    }
}
