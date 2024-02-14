package p088f3;

import android.content.Context;
import android.content.pm.Signature;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.database.room.C4382a;
import com.arlosoft.macrodroid.database.room.C4391d;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.rest.BaseError;
import com.arlosoft.macrodroid.settings.C5116a;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.utils.C6380f1;
import com.google.gson.Gson;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p058a3.C2229c;
import p099h1.C7361a;
import p199z2.C10434a;
import p329me.C15737b;
import p414v9.C16727a;
import p414v9.C16732f;
import p414v9.C16735i;
import p448z9.C17070a;
import retrofit2.C17300s;
import retrofit2.HttpException;

/* renamed from: f3.l */
/* compiled from: TemplateDataSource.kt */
public final class C7292l extends PageKeyedDataSource<Integer, MacroTemplate> {

    /* renamed from: a */
    private final Gson f17815a;

    /* renamed from: b */
    private final C10434a f17816b;

    /* renamed from: c */
    private final C17070a f17817c;

    /* renamed from: d */
    private final int f17818d;

    /* renamed from: e */
    private final int f17819e;

    /* renamed from: f */
    private final int f17820f;

    /* renamed from: g */
    private final int f17821g;

    /* renamed from: h */
    private final String f17822h;

    /* renamed from: i */
    private final C5116a f17823i;

    /* renamed from: j */
    private final C7361a f17824j;

    /* renamed from: k */
    private final String f17825k;

    /* renamed from: l */
    private List<C4391d> f17826l;

    /* renamed from: m */
    private List<C4382a> f17827m;

    /* renamed from: n */
    private final String[] f17828n = {"308201dd30820146020101300d06092a864886f70d010105050030373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b3009060355040613025553301e170d3138303331383036333030365a170d3438303331303036333030365a30373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b300906035504061302555330819f300d06092a864886f70d010101050003818d003081890281810086912f222f6b68d99c49efd92ece90934d8f371720a9152f81668d5a9ff7aa72e35d026dadecc529023a946cf3f01231250ab272bd7f94f863efd3df697b80db143f42a01f9d27899e4d893fd63ff8db65232e44152dd96cf70369fd8cd1de83e3b505328248b57b47ef6dcaa9892a6c4367728c1b1f09526858dd628a5c6cbd0203010001300d06092a864886f70d0101050500038181000496ccc7b1517cc0dbaf6d95b939d9eefe63e4f8edc3792f72f906401456eba658d8f229ad8107dc4636b43eb8e549d727bde2eef0e75ad0f7d73945d4b03b41c697047a9bfd7786d7a2ddd7c63e2755efad4f38b1526ff5cf56f06bc636b2a18ab34416aab560d484fa8cf600834c6643eaf98fca26d46e15008c00411043ce", "308201e53082014ea00302010202044f173620300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3132303131383231313430385a170d3432303131303231313430385a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d0030818902818100b0270c96325dcb34ce75c5f27e58a6e39750d3fb81baa35e920ad1410f7471386b7f3a546e15a6d16069544c0af8cb3c6ad267d67c15c3b979329d782c54e6fa4ada9d47155c934f95bcf744f87f1a917971d401540c7fd5d29540bace27d494d2b2ec92170510544c0219ad444ce5561b7cc7ecd1a654b5ae5340b18ba6b9c90203010001300d06092a864886f70d01010505000381810099f61c4c0f7b738b8ee284dbe794f316d0621f5573fdf1252aad4f601fa2a88452a9a3666d8d9932b67d19188f8dcf0e9c6a85c80c5a410891f56b692b20db6c521b852ca90b76f77a9bb568743b3e16bd4927b65d6f6ff01aaff584d829a165a51e100613f3e0efe54618eef4ee484e8428f8008563dab9e2ce2ea5abf04dbe", "308201e53082014ea003020102020451dc007d300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3133303730393132323232315a170d3433303730323132323232315a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d0030818902818100850e2bc667b811cf3b4aad9ab181aeb761507f0110fb345089ce452651c98580d8fcb0da8af6cf2d51d245c4ebd509cf832b42ee084e10ff8706714ee0def21fcf936b4ff9a14a3c99b944f69158a150718f5c32d66665b7c287742ccba2c7b266250fddcdf5b8f7b3c20e5b4a0c0721143143a2763c54802de3ef5d949701750203010001300d06092a864886f70d010105050003818100498928c82f0ec0cfce4ae49ce76ba65127066880a2780e3617ed7a3258c5e9d3dcc789441afde78a4a62e50c8c46c3043c7260774522f3bdb8226c83ec2964477b93451a3434c03b989c2259e886aa1517d64e1fe9b32785d74d3ac9b8e39993b18f75186c7cd26cf22b2228e0e4d9d650bbae4fcefcbe2abb89ef6ffb00d71a", "308201dd30820146020101300d06092a864886f70d010105050030373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b3009060355040613025553301e170d3136303932333230333735305a170d3436303931363230333735305a30373116301406035504030c0d416e64726f69642044656275673110300e060355040a0c07416e64726f6964310b300906035504061302555330819f300d06092a864886f70d010101050003818d00308189028181008a2ee13707155166313e78ccc314621c061d717a2f11dd2a2505c7c903ed9e89ccfc4769d953a866039ef1212a6cd923dcb5d77d5b43920cf6f84505c68a2e8de9e76647b7b4771c1f9e01468228e42deac8d4676c12f792e708f9452e205267fed553ba65a93abe48a019bf20f5b35f875dc26bbb87575a533f30d74d7e8cad0203010001300d06092a864886f70d010105050003818100470bd7e3b5b40e639326b241c9005fb3d24cc4180e2e04cc34b54db42b737b401847a5d499cd822e3d85360baa320d16d1ac97f4dc9b86eeab9ae62f019dec13dc707ea41ff11e47e2e2a71e05d7be65235d11574e50cbb165db568466abb5d00a60370b29dd59b47ac6140a12957f85c8eb087adf53c54560300f598545db19"};

    /* renamed from: o */
    private final String[] f17829o = {"3082035a30820242a00302010202044e8aeb6d300d06092a864886f70d0101050500306e310b300906035504061302554b3110300e06035504081307556e6b6e6f776e3110300e06035504071307556e6b6e6f776e3111300f060355040a130841726c6f736f66743110300e060355040b1307556e6b6e6f776e311630140603550403130d4a616d69652048696767696e733020170d3131313030343131313830355a180f32323835303731393131313830355a306e310b300906035504061302554b3110300e06035504081307556e6b6e6f776e3110300e06035504071307556e6b6e6f776e3111300f060355040a130841726c6f736f66743110300e060355040b1307556e6b6e6f776e311630140603550403130d4a616d69652048696767696e7330820122300d06092a864886f70d01010105000382010f003082010a0282010100b3bf1433e9b0aa40caff86c949de86bff550e6a787b36bbe88e2695d9baf1ed6c69e07b335ef8d74ec059a78b9c47289511ab916ca9010a67d61585a84cdb449bb49d223b9f638d57245d49253a92a56082bae5cbf7461ed36040ccfe2e1889d6a7a756433fdb8199ff066e66e09b45d6a2a3096678e03b1e00f7f5769f9923388eb94479f77e225cf9ca0bd0d4c04390c639fdcd0f32fc19117067d6b5ede4d4ddb3466fc73fde545a8e73714f976d5747784a1fd9441b7d8e514924f3ce458e54851721d99b75e229dc4fb75c245fb3e6170f95314fb342a9402a412752efc273d00ad658c92bc957109df7855926fc7e9c4871fc9904c562da00045da47110203010001300d06092a864886f70d0101050500038201010047286c6988858644d6549f99af2ae3cd8393bcf5fcca83551a8d46154ab3953026767181292573515c6b9ea7d69d5e236bda06da67c40f8ee2d82d6ebbff9c40cf94f8b19996c8a9ac8b08c7bd4f11494325ef08e2f7a04824b1bf2aa0827ed02158f399d245d5d47ad34dcecc27bf505068cf2430784a6c9f2669d0d1d0921b632c32a84a397f7096ef1ecbac8d703a886dff922a085239386c41ba7450d7e03ba03d60aa4c79c4994358a6f41f89ff87b9f6a073b55589f3b55a636bbabc65777691142940d5367dbb1f3629eff7c6d00abc44392d79264c834525b261f7c958712171ff6c94dce6df90b24bf810cc28e4d8939b5988cbcbd92174f9202f8e"};

    /* renamed from: p */
    private MutableLiveData<C2229c> f17830p = new MutableLiveData<>();

    /* renamed from: q */
    private final String f17831q = C6380f1.f14971a.mo32421a(MacroDroidApplication.f9883I.mo27303b());

    public C7292l(Gson gson, C10434a aVar, C17070a aVar2, int i, int i2, int i3, int i4, String str, C5116a aVar3, C7361a aVar4, String str2, List<C4391d> list, List<C4382a> list2) {
        C13706o.m87929f(gson, "gson");
        C13706o.m87929f(aVar, "api");
        C13706o.m87929f(aVar2, "compositeDisposable");
        C13706o.m87929f(str, "searchTerm");
        C13706o.m87929f(aVar3, "appPreferences");
        C13706o.m87929f(aVar4, "categoryHelper");
        C13706o.m87929f(str2, "language");
        C13706o.m87929f(list, "blockedUsers");
        C13706o.m87929f(list2, "blockedMacros");
        this.f17815a = gson;
        this.f17816b = aVar;
        this.f17817c = aVar2;
        this.f17818d = i;
        this.f17819e = i2;
        this.f17820f = i3;
        this.f17821g = i4;
        this.f17822h = str;
        this.f17823i = aVar3;
        this.f17824j = aVar4;
        this.f17825k = str2;
        this.f17826l = list;
        this.f17827m = list2;
    }

    /* renamed from: j */
    private final boolean m30111j(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                String charsString = signatureArr[0].toCharsString();
                for (String a : this.f17828n) {
                    if (C13706o.m87924a(a, charsString)) {
                        return false;
                    }
                }
                for (String a2 : this.f17829o) {
                    if (C13706o.m87924a(a2, charsString)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m30112k(C7292l lVar, PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, List list) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        ArrayList arrayList = new ArrayList();
        try {
            List<C4391d> list2 = lVar.f17826l;
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
            for (C4391d a : list2) {
                arrayList2.add(Integer.valueOf(a.mo28713a()));
            }
            List<C4382a> list3 = lVar.f17827m;
            ArrayList arrayList3 = new ArrayList(C13616u.m87774u(list3, 10));
            for (C4382a a2 : list3) {
                arrayList3.add(Integer.valueOf(a2.mo28701a()));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MacroTemplate macroTemplate = (MacroTemplate) it.next();
                if (!arrayList2.contains(Integer.valueOf(macroTemplate.getUserId())) && !arrayList3.contains(Integer.valueOf(macroTemplate.getId()))) {
                    Macro macro = (Macro) lVar.f17815a.mo63976j(URLDecoder.decode(macroTemplate.getJson(), "utf-8"), Macro.class);
                    macro.setDescription(macroTemplate.getDescription());
                    macro.setName(macroTemplate.getName());
                    macro.setCategory(lVar.f17824j.mo37339d(macroTemplate.getCategoryId()));
                    macroTemplate.setMacro(macro);
                    macroTemplate.setUseTranslatedText(lVar.f17823i.mo30101a());
                    arrayList.add(macroTemplate);
                }
            }
        } catch (Exception unused) {
        }
        loadCallback.onResult(arrayList, Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m30113l(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams, Throwable th) {
        C13706o.m87929f(loadCallback, "$callback");
        C13706o.m87929f(loadParams, "$params");
        loadCallback.onResult(C13614t.m87748j(), Integer.valueOf(((Number) loadParams.key).intValue() + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C15737b m30114m(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12235j.f58730a);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C15737b m30115n(Throwable th) {
        C13706o.m87929f(th, "error");
        if (new BaseError(th, (BaseError.C5076d) null, 2, (C13695i) null).mo29992b()) {
            return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
        }
        return C16732f.m99314f(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final C15737b m30116o(C16732f fVar) {
        C13706o.m87929f(fVar, "errors");
        return fVar.mo79661h(C12236k.f58731a);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C15737b m30117p(Throwable th) {
        C13706o.m87929f(th, "it");
        return C16735i.m99346b0(2, TimeUnit.SECONDS).mo79699d0(C16727a.DROP);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m30118q(C7292l lVar, PageKeyedDataSource.LoadInitialCallback loadInitialCallback, List list) {
        C13706o.m87929f(lVar, "this$0");
        C13706o.m87929f(loadInitialCallback, "$callback");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MacroTemplate macroTemplate = (MacroTemplate) it.next();
            try {
                List<C4391d> list2 = lVar.f17826l;
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
                for (C4391d a : list2) {
                    arrayList2.add(Integer.valueOf(a.mo28713a()));
                }
                List<C4382a> list3 = lVar.f17827m;
                ArrayList arrayList3 = new ArrayList(C13616u.m87774u(list3, 10));
                for (C4382a a2 : list3) {
                    arrayList3.add(Integer.valueOf(a2.mo28701a()));
                }
                if (!arrayList2.contains(Integer.valueOf(macroTemplate.getUserId())) && !arrayList3.contains(Integer.valueOf(macroTemplate.getId()))) {
                    Macro macro = (Macro) lVar.f17815a.mo63976j(URLDecoder.decode(macroTemplate.getJson(), "utf-8"), Macro.class);
                    macro.setDescription(macroTemplate.getDescription());
                    macro.setName(macroTemplate.getName());
                    macro.setCategory(lVar.f17824j.mo37339d(macroTemplate.getCategoryId()));
                    macroTemplate.setMacro(macro);
                    macroTemplate.setUseTranslatedText(lVar.f17823i.mo30101a());
                    arrayList.add(macroTemplate);
                }
            } catch (Exception unused) {
            }
        }
        loadInitialCallback.onResult(arrayList, -1, 2);
        if (arrayList.isEmpty()) {
            lVar.m30120s(C2229c.EMPTY);
        } else {
            lVar.m30120s(C2229c.HAS_DATA);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m30119r(C7292l lVar, Throwable th) {
        C13706o.m87929f(lVar, "this$0");
        if (th instanceof HttpException) {
            C17300s<?> c = ((HttpException) th).mo80528c();
            boolean z = false;
            if (c != null && c.mo80593b() == 401) {
                z = true;
            }
            if (z) {
                lVar.m30120s(C2229c.PIRATE_VERSION);
                return;
            }
        }
        lVar.m30120s(C2229c.ERROR);
    }

    /* renamed from: s */
    private final void m30120s(C2229c cVar) {
        this.f17830p.postValue(cVar);
    }

    /* renamed from: i */
    public final MutableLiveData<C2229c> mo37207i() {
        return this.f17830p;
    }

    public void loadAfter(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, MacroTemplate> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
        this.f17817c.mo62358a(this.f17816b.mo41160d(C4660g.m18129g(this.f17819e + "adb97ac6-f780-4a41-8475-ce661b574999" + this.f17831q + this.f17820f), this.f17818d, this.f17819e, this.f17820f, loadParams.requestedLoadSize * ((Number) loadParams.key).intValue(), loadParams.requestedLoadSize, this.f17821g, this.f17822h, this.f17825k).mo79727m(C12233h.f58728a).mo79727m(C12234i.f58729a).mo79729o(new C12231f(this, loadCallback, loadParams), new C12229d(loadCallback, loadParams)));
    }

    public void loadBefore(PageKeyedDataSource.LoadParams<Integer> loadParams, PageKeyedDataSource.LoadCallback<Integer, MacroTemplate> loadCallback) {
        C13706o.m87929f(loadParams, "params");
        C13706o.m87929f(loadCallback, "callback");
    }

    public void loadInitial(PageKeyedDataSource.LoadInitialParams<Integer> loadInitialParams, PageKeyedDataSource.LoadInitialCallback<Integer, MacroTemplate> loadInitialCallback) {
        C13706o.m87929f(loadInitialParams, "params");
        C13706o.m87929f(loadInitialCallback, "callback");
        m30120s(C2229c.LOADING);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17819e);
        sb.append("adb97ac6-f780-4a41-8475-ce661b574999");
        sb.append(this.f17831q);
        sb.append(m30111j(MacroDroidApplication.f9883I.mo27303b()) ? "1" : "");
        sb.append(this.f17820f);
        this.f17817c.mo62358a(this.f17816b.mo41160d(C4660g.m18129g(sb.toString()), this.f17818d, this.f17819e, this.f17820f, 0, loadInitialParams.requestedLoadSize, this.f17821g, this.f17822h, this.f17825k).mo79729o(new C12232g(this, loadInitialCallback), new C12230e(this)));
    }
}
