package p130m2;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.rest.BaseError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p058a3.C2229c;
import p118k2.C7471b;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p448z9.C17070a;

/* renamed from: m2.k */
/* compiled from: PluginDataSource.kt */
public final class C7901k extends PageKeyedDataSource<Integer, PluginDetail> {

    /* renamed from: a */
    private final C7471b f18979a;

    /* renamed from: b */
    private final C17070a f18980b;

    /* renamed from: c */
    private final int f18981c;

    /* renamed from: d */
    private final int f18982d;

    /* renamed from: e */
    private final String f18983e;

    /* renamed from: f */
    private MutableLiveData<C2229c> f18984f = new MutableLiveData<>();

    public C7901k(C7471b bVar, C17070a aVar, int i, int i2, String str) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(aVar, "compositeDisposable");
        C13706o.m87929f(str, "language");
        this.f18979a = bVar;
        this.f18980b = aVar;
        this.f18981c = i;
        this.f18982d = i2;
        this.f18983e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C15737b m33068j(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C15692j.f64980a);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C15737b m33069k(Throwable th) {
        C13706o.m87929f(th, "error");
        if (new BaseError(th, (BaseError.C5076d) null, 2, (C13695i) null).mo29992b()) {
            return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
        }
        return C16732f.m99314f(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C15737b m33070l(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C15691i.f64979a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15737b m33071m(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m33072n(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, List list) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        C13706o.m87928e(list, "pluginList");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!C13706o.m87924a(((PluginDetail) next).getPackageName(), "com.arlosoft.macrodroid")) {
                arrayList.add(next);
            }
        }
        loadCallback.onResult(arrayList, Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m33073o(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, Throwable th) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        loadCallback.onResult(C13614t.m87748j(), Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m33074p(PageKeyedDataSource.LoadInitialCallback loadInitialCallback, C7901k kVar, List list) {
        C13706o.m87929f(loadInitialCallback, "$callback");
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87928e(list, "pluginList");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!C13706o.m87924a(((PluginDetail) next).getPackageName(), "com.arlosoft.macrodroid")) {
                arrayList.add(next);
            }
        }
        loadInitialCallback.onResult(arrayList, -1, 2);
        if (list.isEmpty()) {
            kVar.m33076r(C2229c.EMPTY);
        } else {
            kVar.m33076r(C2229c.HAS_DATA);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m33075q(C7901k kVar, Throwable th) {
        C13706o.m87929f(kVar, "this$0");
        kVar.m33076r(C2229c.ERROR);
    }

    /* renamed from: r */
    private final void m33076r(C2229c cVar) {
        this.f18984f.postValue(cVar);
    }

    /* renamed from: i */
    public final MutableLiveData<C2229c> mo37792i() {
        return this.f18984f;
    }

    public void loadAfter(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, PluginDetail> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.f18980b.mo62358a(this.f18979a.mo37634i(this.f18981c, loadParams.requestedLoadSize * ((Number) loadParams.key).intValue(), loadParams.requestedLoadSize, this.f18982d, this.f18983e).mo79727m(C15689g.f64977a).mo79727m(C15690h.f64978a).mo79729o(new C15686d(loadCallback, loadParams), new C15685c(loadCallback, loadParams)));
    }

    public void loadBefore(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, PluginDetail> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
    }

    public void loadInitial(PageKeyedDataSource.LoadInitialParams<Integer> loadInitialParams, PageKeyedDataSource.LoadInitialCallback<Integer, PluginDetail> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        this.f18980b.mo62358a(this.f18979a.mo37634i(this.f18981c, 0, loadInitialParams.requestedLoadSize, this.f18982d, this.f18983e).mo79729o(new C15687e(loadInitialCallback, this), new C15688f(this)));
    }
}
