package p088f3;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.arlosoft.macrodroid.database.room.C4382a;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.settings.C5116a;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p099h1.C7361a;
import p199z2.C10434a;
import p448z9.C17070a;

/* renamed from: f3.a */
/* compiled from: TemplateDataSourceFactory.kt */
public final class C7289a extends DataSource.Factory<Integer, MacroTemplate> {

    /* renamed from: a */
    private final Gson f17797a;

    /* renamed from: b */
    private final C10434a f17798b;

    /* renamed from: c */
    private final C17070a f17799c;

    /* renamed from: d */
    private final int f17800d;

    /* renamed from: e */
    private final int f17801e;

    /* renamed from: f */
    private final int f17802f;

    /* renamed from: g */
    private final int f17803g;

    /* renamed from: h */
    private final String f17804h;

    /* renamed from: i */
    private final C5116a f17805i;

    /* renamed from: j */
    private final C7361a f17806j;

    /* renamed from: k */
    private final String f17807k;

    /* renamed from: l */
    private final List<C4391d> f17808l;

    /* renamed from: m */
    private final List<C4382a> f17809m;

    /* renamed from: n */
    private final MutableLiveData<C7292l> f17810n = new MutableLiveData<>();

    public C7289a(Gson gson, C10434a aVar, C17070a aVar2, int i, int i2, int i3, int i4, String str, C5116a aVar3, C7361a aVar4, String str2, List<C4391d> list, List<C4382a> list2) {
        C13706o.m87929f(gson, "gson");
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        C13706o.m87929f(str, "searchTerm");
        C13706o.m87929f(aVar3, "appPreferences");
        C13706o.m87929f(aVar4, "categoriesHelper");
        C13706o.m87929f(str2, "language");
        C13706o.m87929f(list, "blockedUsers");
        C13706o.m87929f(list2, "blockedMacros");
        this.f17797a = gson;
        this.f17798b = aVar;
        this.f17799c = aVar2;
        this.f17800d = i;
        this.f17801e = i2;
        this.f17802f = i3;
        this.f17803g = i4;
        this.f17804h = str;
        this.f17805i = aVar3;
        this.f17806j = aVar4;
        this.f17807k = str2;
        this.f17808l = list;
        this.f17809m = list2;
    }

    /* renamed from: a */
    public final MutableLiveData<C7292l> mo37204a() {
        return this.f17810n;
    }

    public DataSource<Integer, MacroTemplate> create() {
        C7292l lVar = new C7292l(this.f17797a, this.f17798b, this.f17799c, this.f17800d, this.f17801e, this.f17802f, this.f17803g, this.f17804h, this.f17805i, this.f17806j, this.f17807k, this.f17808l, this.f17809m);
        this.f17810n.postValue(lVar);
        return lVar;
    }
}
