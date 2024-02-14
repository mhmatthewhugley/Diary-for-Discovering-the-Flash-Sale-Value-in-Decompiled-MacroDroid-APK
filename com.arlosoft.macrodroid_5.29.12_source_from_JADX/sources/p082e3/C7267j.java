package p082e3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.templatestore.model.Comment;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13710s;
import p058a3.C2229c;
import p199z2.C10434a;
import p433xa.C16880i;
import p448z9.C17070a;

/* renamed from: e3.j */
/* compiled from: commentsViewModelForPlugin.kt */
public class C7267j extends ViewModel {

    /* renamed from: a */
    private LiveData<PagedList<Comment>> f17704a;

    /* renamed from: b */
    private final C17070a f17705b;

    /* renamed from: c */
    private final C7266h f17706c;

    /* renamed from: e3.j$a */
    /* compiled from: commentsViewModelForPlugin.kt */
    /* synthetic */ class C7268a extends C13710s {

        /* renamed from: a */
        public static final C7268a f17707a = new C7268a();

        C7268a() {
            super(C7265g.class, "loadState", "getLoadState()Landroidx/lifecycle/MutableLiveData;", 0);
        }

        public Object get(Object obj) {
            return ((C7265g) obj).mo37135h();
        }
    }

    public C7267j(C10434a aVar, int i) {
        C13706o.m87929f(aVar, "api");
        C17070a aVar2 = new C17070a();
        this.f17705b = aVar2;
        C7266h hVar = new C7266h(aVar, aVar2, i);
        this.f17706c = hVar;
        this.f17704a = new LivePagedListBuilder(hVar, new PagedList.Config.Builder().setPageSize(10).setInitialLoadSizeHint(20).setEnablePlaceholders(false).build()).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final LiveData m30005i(C16880i iVar, C7265g gVar) {
        C13706o.m87929f(iVar, "$tmp0");
        return (LiveData) iVar.invoke(gVar);
    }

    /* renamed from: g */
    public final LiveData<PagedList<Comment>> mo37137g() {
        return this.f17704a;
    }

    /* renamed from: h */
    public final LiveData<C2229c> mo37138h() {
        LiveData<C2229c> switchMap = Transformations.switchMap(this.f17706c.mo37136a(), new C12142i(C7268a.f17707a));
        C13706o.m87928e(switchMap, "switchMap<CommentsDataSo…ntsDataSource::loadState)");
        return switchMap;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f17705b.dispose();
    }
}
