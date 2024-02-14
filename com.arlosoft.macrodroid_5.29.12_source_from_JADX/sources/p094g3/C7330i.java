package p094g3;

import androidx.paging.PageKeyedDataSource;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.rest.BaseError;
import com.arlosoft.macrodroid.templatestore.model.User;
import com.arlosoft.macrodroid.utils.C6380f1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p199z2.C10434a;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p448z9.C17070a;
import retrofit2.C17300s;
import retrofit2.HttpException;

/* renamed from: g3.i */
/* compiled from: UserDataSource.kt */
public final class C7330i extends PageKeyedDataSource<Integer, User> {

    /* renamed from: a */
    private final C10434a f17933a;

    /* renamed from: b */
    private final C17070a f17934b;

    /* renamed from: c */
    private final String f17935c;

    /* renamed from: d */
    private final String f17936d = C6380f1.f14971a.mo32421a(MacroDroidApplication.f9883I.mo27303b());

    public C7330i(C10434a aVar, C17070a aVar2, String str) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        C13706o.m87929f(str, "searchTerm");
        this.f17933a = aVar;
        this.f17934b = aVar2;
        this.f17935c = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C15737b m30279i(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12305h.f58975a);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C15737b m30280j(Throwable th) {
        C13706o.m87929f(th, "error");
        if (new BaseError(th, (BaseError.C5076d) null, 2, (C13695i) null).mo29992b()) {
            return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
        }
        return C16732f.m99314f(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C15737b m30281k(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12304g.f58974a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C15737b m30282l(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m30283m(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, List list) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        C13706o.m87928e(list, "userList");
        loadCallback.onResult(list, Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m30284n(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, Throwable th) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        loadCallback.onResult(C13614t.m87748j(), Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m30285o(PageKeyedDataSource.LoadInitialCallback loadInitialCallback, List list) {
        C13706o.m87929f(loadInitialCallback, "$callback");
        C13706o.m87928e(list, "userList");
        loadInitialCallback.onResult(list, -1, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m30286p(PageKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th) {
        C13706o.m87929f(loadInitialCallback, "$callback");
        if (th instanceof HttpException) {
            C17300s<?> c = ((HttpException) th).mo80528c();
            boolean z = false;
            if (c != null && c.mo80593b() == 401) {
                z = true;
            }
            if (z) {
                loadInitialCallback.onResult(C13612s.m87736e(User.Companion.mo30363b()), -1, -1);
                return;
            }
        }
        loadInitialCallback.onResult(C13612s.m87736e(User.Companion.mo30362a()), -1, -1);
    }

    public void loadAfter(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, User> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.f17934b.mo62358a(this.f17933a.mo41164h(C4660g.m18129g("adb97ac6-f780-4a41-8475-ce661b574999" + this.f17936d), loadParams.requestedLoadSize * ((Number) loadParams.key).intValue(), loadParams.requestedLoadSize).mo79727m(C12302e.f58972a).mo79727m(C12303f.f58973a).mo79729o(new C12299b(loadCallback, loadParams), new C12298a(loadCallback, loadParams)));
    }

    public void loadBefore(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, User> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
    }

    public void loadInitial(PageKeyedDataSource.LoadInitialParams<Integer> loadInitialParams, PageKeyedDataSource.LoadInitialCallback<Integer, User> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        this.f17934b.mo62358a(this.f17933a.mo41164h(C4660g.m18129g("adb97ac6-f780-4a41-8475-ce661b574999" + this.f17936d), 0, loadInitialParams.requestedLoadSize).mo79729o(new C12301d(loadInitialCallback), new C12300c(loadInitialCallback)));
    }
}
