package p124l2;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import kotlin.jvm.internal.C13706o;
import p118k2.C7471b;
import p448z9.C17070a;

/* renamed from: l2.h */
/* compiled from: PluginCommentsDataSourceFactory.kt */
public final class C7664h extends DataSource.Factory<Long, Comment> {

    /* renamed from: a */
    private final C7471b f18577a;

    /* renamed from: b */
    private final C17070a f18578b;

    /* renamed from: c */
    private final int f18579c;

    /* renamed from: d */
    private final MutableLiveData<C7663g> f18580d = new MutableLiveData<>();

    public C7664h(C7471b bVar, C17070a aVar, int i) {
        C13706o.m87929f(bVar, "api");
        C13706o.m87929f(aVar, "compositeDisposable");
        this.f18577a = bVar;
        this.f18578b = aVar;
        this.f18579c = i;
    }

    /* renamed from: a */
    public final MutableLiveData<C7663g> mo37676a() {
        return this.f18580d;
    }

    /* renamed from: b */
    public final void mo37677b() {
        C7663g value = this.f18580d.getValue();
        if (value != null) {
            value.invalidate();
        }
    }

    public DataSource<Long, Comment> create() {
        C7663g gVar = new C7663g(this.f18577a, this.f18578b, this.f18579c);
        this.f18580d.postValue(gVar);
        return gVar;
    }
}
