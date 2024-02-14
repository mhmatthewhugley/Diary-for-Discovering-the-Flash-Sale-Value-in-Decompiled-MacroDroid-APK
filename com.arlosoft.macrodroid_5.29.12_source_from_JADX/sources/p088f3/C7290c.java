package p088f3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.arlosoft.macrodroid.database.room.C4382a;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.settings.C5116a;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13710s;
import p058a3.C2229c;
import p099h1.C7361a;
import p199z2.C10434a;
import p433xa.C16880i;
import p448z9.C17070a;

/* renamed from: f3.c */
/* compiled from: TemplateViewModel.kt */
public final class C7290c extends ViewModel {

    /* renamed from: a */
    private LiveData<PagedList<MacroTemplate>> f17811a;

    /* renamed from: b */
    private final C17070a f17812b;

    /* renamed from: c */
    private final C7289a f17813c;

    /* renamed from: f3.c$a */
    /* compiled from: TemplateViewModel.kt */
    /* synthetic */ class C7291a extends C13710s {

        /* renamed from: a */
        public static final C7291a f17814a = new C7291a();

        C7291a() {
            super(C7292l.class, "loadState", "getLoadState()Landroidx/lifecycle/MutableLiveData;", 0);
        }

        public Object get(Object obj) {
            return ((C7292l) obj).mo37207i();
        }
    }

    public C7290c(Gson gson, C10434a aVar, int i, int i2, int i3, int i4, String str, C5116a aVar2, C7361a aVar3, String str2, List<C4391d> list, List<C4382a> list2) {
        Gson gson2 = gson;
        C13706o.m87929f(gson2, "gson");
        C10434a aVar4 = aVar;
        C13706o.m87929f(aVar4, "api");
        String str3 = str;
        C13706o.m87929f(str3, "searchTerm");
        C5116a aVar5 = aVar2;
        C13706o.m87929f(aVar5, "appPreferences");
        C7361a aVar6 = aVar3;
        C13706o.m87929f(aVar6, "categoriesHelper");
        String str4 = str2;
        C13706o.m87929f(str4, "language");
        List<C4391d> list3 = list;
        C13706o.m87929f(list3, "blockedUsers");
        List<C4382a> list4 = list2;
        C13706o.m87929f(list4, "blockedMacros");
        C17070a aVar7 = new C17070a();
        this.f17812b = aVar7;
        C7289a aVar8 = new C7289a(gson2, aVar4, aVar7, i, i2, i3, i4, str3, aVar5, aVar6, str4, list3, list4);
        this.f17813c = aVar8;
        this.f17811a = new LivePagedListBuilder(aVar8, new PagedList.Config.Builder().setPageSize(10).setInitialLoadSizeHint(20).setEnablePlaceholders(false).build()).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final LiveData m30100h(C16880i iVar, C7292l lVar) {
        C13706o.m87929f(iVar, "$tmp0");
        return (LiveData) iVar.invoke(lVar);
    }

    /* renamed from: g */
    public final LiveData<C2229c> mo37205g() {
        LiveData<C2229c> switchMap = Transformations.switchMap(this.f17813c.mo37204a(), new C12228b(C7291a.f17814a));
        C13706o.m87928e(switchMap, "switchMap<TemplatesDataS…tesDataSource::loadState)");
        return switchMap;
    }

    /* renamed from: i */
    public final LiveData<PagedList<MacroTemplate>> mo37206i() {
        return this.f17811a;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f17812b.dispose();
    }
}
