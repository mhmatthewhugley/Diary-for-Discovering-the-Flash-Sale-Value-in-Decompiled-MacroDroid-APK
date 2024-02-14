package p094g3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.templatestore.model.User;
import kotlin.jvm.internal.C13706o;
import p199z2.C10434a;
import p448z9.C17070a;

/* renamed from: g3.k */
/* compiled from: UserViewModel.kt */
public final class C7332k extends ViewModel {

    /* renamed from: a */
    private LiveData<PagedList<User>> f17941a;

    /* renamed from: b */
    private final C17070a f17942b;

    /* renamed from: c */
    private final C7331j f17943c;

    public C7332k(C10434a aVar, String str) {
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(str, "searchTerm");
        C17070a aVar2 = new C17070a();
        this.f17942b = aVar2;
        C7331j jVar = new C7331j(aVar, aVar2, str);
        this.f17943c = jVar;
        this.f17941a = new LivePagedListBuilder(jVar, new PagedList.Config.Builder().setPageSize(20).setInitialLoadSizeHint(40).setEnablePlaceholders(false).build()).build();
    }

    /* renamed from: f */
    public final LiveData<PagedList<User>> mo37296f() {
        return this.f17941a;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f17942b.dispose();
    }
}
