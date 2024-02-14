package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p370qa.C16254a;
import p433xa.C16887m;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, mo71669k = 3, mo71670mv = {1, 1, 16})
/* compiled from: NavGraphViewModelLazy.kt */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends C13708q implements C16254a<ViewModelStore> {
    final /* synthetic */ C13321g $backStackEntry;
    final /* synthetic */ C16887m $backStackEntry$metadata;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(C13321g gVar, C16887m mVar) {
        super(0);
        this.$backStackEntry = gVar;
        this.$backStackEntry$metadata = mVar;
    }

    public final ViewModelStore invoke() {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
        C13706o.m87925b(navBackStackEntry, "backStackEntry");
        ViewModelStore viewModelStore = navBackStackEntry.getViewModelStore();
        C13706o.m87925b(viewModelStore, "backStackEntry.viewModelStore");
        return viewModelStore;
    }
}
