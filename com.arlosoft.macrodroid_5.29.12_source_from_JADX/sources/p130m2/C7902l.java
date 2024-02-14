package p130m2;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import kotlin.jvm.internal.C13706o;
import p118k2.C7471b;
import p448z9.C17070a;

/* renamed from: m2.l */
/* compiled from: PluginDataSourceFactory.kt */
public final class C7902l extends DataSource.Factory<Integer, PluginDetail> {

    /* renamed from: a */
    private final C7471b f18985a;

    /* renamed from: b */
    private final C17070a f18986b;

    /* renamed from: c */
    private final int f18987c;

    /* renamed from: d */
    private final int f18988d;

    /* renamed from: e */
    private final String f18989e;

    /* renamed from: f */
    private final MutableLiveData<C7901k> f18990f = new MutableLiveData<>();

    public C7902l(C7471b bVar, C17070a aVar, int i, int i2, String str) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(aVar, "compositeDisposable");
        C13706o.m87929f(str, "language");
        this.f18985a = bVar;
        this.f18986b = aVar;
        this.f18987c = i;
        this.f18988d = i2;
        this.f18989e = str;
    }

    /* renamed from: a */
    public final MutableLiveData<C7901k> mo37793a() {
        return this.f18990f;
    }

    public DataSource<Integer, PluginDetail> create() {
        C7901k kVar = new C7901k(this.f18985a, this.f18986b, this.f18987c, this.f18988d, this.f18989e);
        this.f18990f.postValue(kVar);
        return kVar;
    }
}
