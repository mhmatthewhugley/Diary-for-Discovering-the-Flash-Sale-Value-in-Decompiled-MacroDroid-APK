package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13321g;
import p370qa.C16254a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\bø\u0001\u0000\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\bø\u0001\u0000\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0010"}, mo71668d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lja/g;", "viewModels", "activityViewModels", "Lxa/d;", "viewModelClass", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "createViewModelLazy", "fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> C13321g<VM> activityViewModels(Fragment fragment, C16254a<? extends ViewModelProvider.Factory> aVar) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87933j(4, "VM");
        C16875d b = C13687e0.m87868b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$activityViewModels$1, aVar);
    }

    public static /* synthetic */ C13321g activityViewModels$default(Fragment fragment, C16254a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87933j(4, "VM");
        C16875d b = C13687e0.m87868b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$activityViewModels$1, aVar);
    }

    @MainThread
    public static final <VM extends ViewModel> C13321g<VM> createViewModelLazy(Fragment fragment, C16875d<VM> dVar, C16254a<? extends ViewModelStore> aVar, C16254a<? extends ViewModelProvider.Factory> aVar2) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(dVar, "viewModelClass");
        C13706o.m87929f(aVar, "storeProducer");
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(dVar, aVar, aVar2);
    }

    public static /* synthetic */ C13321g createViewModelLazy$default(Fragment fragment, C16875d dVar, C16254a aVar, C16254a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, dVar, aVar, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> C13321g<VM> viewModels(Fragment fragment, C16254a<? extends ViewModelStoreOwner> aVar, C16254a<? extends ViewModelProvider.Factory> aVar2) {
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(aVar, "ownerProducer");
        C13706o.m87933j(4, "VM");
        C16875d b = C13687e0.m87868b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(aVar);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$3(aVar, fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$viewModels$2, aVar2);
    }

    public static /* synthetic */ C13321g viewModels$default(Fragment fragment, C16254a aVar, C16254a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        C13706o.m87929f(fragment, "<this>");
        C13706o.m87929f(aVar, "ownerProducer");
        C13706o.m87933j(4, "VM");
        C16875d b = C13687e0.m87868b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(aVar);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$3(aVar, fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$viewModels$2, aVar2);
    }
}
