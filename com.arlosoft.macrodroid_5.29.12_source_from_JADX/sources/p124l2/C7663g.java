package p124l2;

import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.ItemKeyedDataSource;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13706o;
import p058a3.C2229c;
import p118k2.C7471b;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p448z9.C17070a;

/* renamed from: l2.g */
/* compiled from: PluginCommentsDataSource.kt */
public final class C7663g extends ItemKeyedDataSource<Long, Comment> {

    /* renamed from: a */
    private final C7471b f18573a;

    /* renamed from: b */
    private final C17070a f18574b;

    /* renamed from: c */
    private final int f18575c;

    /* renamed from: d */
    private final MutableLiveData<C2229c> f18576d = new MutableLiveData<>();

    public C7663g(C7471b bVar, C17070a aVar, int i) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(aVar, "compositeDisposable");
        this.f18573a = bVar;
        this.f18574b = aVar;
        this.f18575c = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C15737b m31938i(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C15582e.f64822a);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C15737b m31939j(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(3, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m31940k(ItemKeyedDataSource.LoadCallback loadCallback, List list) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87928e(list, "commentList");
        loadCallback.onResult(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C15737b m31941l(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C15583f.f64823a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15737b m31942m(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(3, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m31943n(ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, C7663g gVar, List list) {
        C13706o.m87929f(loadInitialCallback, "$callback");
        C13706o.m87929f(gVar, "this$0");
        C13706o.m87928e(list, "commentList");
        loadInitialCallback.onResult(list);
        if (list.isEmpty()) {
            gVar.m31944o(C2229c.EMPTY);
        } else {
            gVar.m31944o(C2229c.HAS_DATA);
        }
    }

    /* renamed from: o */
    private final void m31944o(C2229c cVar) {
        this.f18576d.postValue(cVar);
    }

    /* renamed from: g */
    public Long getKey(Comment comment) {
        C13706o.m87929f(comment, "item");
        return Long.valueOf(comment.getTimestamp());
    }

    /* renamed from: h */
    public final MutableLiveData<C2229c> mo37675h() {
        return this.f18576d;
    }

    public void loadAfter(ItemKeyedDataSource.LoadParams<Long> loadParams, ItemKeyedDataSource.LoadCallback<Comment> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.f18574b.mo62358a(this.f18573a.mo37628c(this.f18575c, ((Number) loadParams.key).longValue(), loadParams.requestedLoadSize).mo79727m(C15580c.f64820a).mo79728n(new C15578a(loadCallback)));
    }

    public void loadBefore(ItemKeyedDataSource.LoadParams<Long> loadParams, ItemKeyedDataSource.LoadCallback<Comment> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
    }

    public void loadInitial(ItemKeyedDataSource.LoadInitialParams<Long> loadInitialParams, ItemKeyedDataSource.LoadInitialCallback<Comment> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        m31944o(C2229c.LOADING);
        this.f18574b.mo62358a(this.f18573a.mo37628c(this.f18575c, LocationRequestCompat.PASSIVE_INTERVAL, loadInitialParams.requestedLoadSize).mo79727m(C15581d.f64821a).mo79728n(new C15579b(loadInitialCallback, this)));
    }
}
