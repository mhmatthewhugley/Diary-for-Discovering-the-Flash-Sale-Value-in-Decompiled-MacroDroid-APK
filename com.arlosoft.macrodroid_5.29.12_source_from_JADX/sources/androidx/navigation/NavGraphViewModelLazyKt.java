package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13321g;
import p370qa.C16254a;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\b¨\u0006\n"}, mo71668d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "", "navGraphId", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lja/g;", "navGraphViewModels", "navigation-fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: NavGraphViewModelLazy.kt */
public final class NavGraphViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> C13321g<VM> navGraphViewModels(Fragment fragment, @IdRes int i, C16254a<? extends ViewModelProvider.Factory> aVar) {
        C13706o.m87930g(fragment, "$this$navGraphViewModels");
        C13321g b = C13323i.m85669b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(b, (C16887m) null);
        C13706o.m87933j(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, C13687e0.m87868b(ViewModel.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, b, (C16887m) null));
    }

    public static /* synthetic */ C13321g navGraphViewModels$default(Fragment fragment, int i, C16254a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        C13706o.m87930g(fragment, "$this$navGraphViewModels");
        C13321g b = C13323i.m85669b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(b, (C16887m) null);
        C13706o.m87933j(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, C13687e0.m87868b(ViewModel.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, b, (C16887m) null));
    }
}
