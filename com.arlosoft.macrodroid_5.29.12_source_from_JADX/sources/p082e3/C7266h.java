package p082e3;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import kotlin.jvm.internal.C13706o;
import p199z2.C10434a;
import p448z9.C17070a;

/* renamed from: e3.h */
/* compiled from: CommentsDataSourceFactory.kt */
public final class C7266h extends DataSource.Factory<Long, Comment> {

    /* renamed from: a */
    private final C10434a f17700a;

    /* renamed from: b */
    private final C17070a f17701b;

    /* renamed from: c */
    private final int f17702c;

    /* renamed from: d */
    private final MutableLiveData<C7265g> f17703d = new MutableLiveData<>();

    public C7266h(C10434a aVar, C17070a aVar2, int i) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        this.f17700a = aVar;
        this.f17701b = aVar2;
        this.f17702c = i;
    }

    /* renamed from: a */
    public final MutableLiveData<C7265g> mo37136a() {
        return this.f17703d;
    }

    public DataSource<Long, Comment> create() {
        C7265g gVar = new C7265g(this.f17700a, this.f17701b, this.f17702c);
        this.f17703d.postValue(gVar);
        return gVar;
    }
}
