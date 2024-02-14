package p094g3;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.arlosoft.macrodroid.templatestore.model.User;
import kotlin.jvm.internal.C13706o;
import p199z2.C10434a;
import p448z9.C17070a;

/* renamed from: g3.j */
/* compiled from: UserDataSourceFactory.kt */
public final class C7331j extends DataSource.Factory<Integer, User> {

    /* renamed from: a */
    private final C10434a f17937a;

    /* renamed from: b */
    private final C17070a f17938b;

    /* renamed from: c */
    private final String f17939c;

    /* renamed from: d */
    private final MutableLiveData<C7330i> f17940d = new MutableLiveData<>();

    public C7331j(C10434a aVar, C17070a aVar2, String str) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        C13706o.m87929f(str, "searchTerm");
        this.f17937a = aVar;
        this.f17938b = aVar2;
        this.f17939c = str;
    }

    public DataSource<Integer, User> create() {
        C7330i iVar = new C7330i(this.f17937a, this.f17938b, this.f17939c);
        this.f17940d.postValue(iVar);
        return iVar;
    }
}
