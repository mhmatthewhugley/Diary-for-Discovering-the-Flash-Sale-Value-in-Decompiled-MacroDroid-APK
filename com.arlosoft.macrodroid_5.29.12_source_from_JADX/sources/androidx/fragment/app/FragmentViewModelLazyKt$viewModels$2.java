package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, mo71668d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt$viewModels$2 extends C13708q implements C16254a<ViewModelStore> {
    final /* synthetic */ C16254a<ViewModelStoreOwner> $ownerProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(C16254a<? extends ViewModelStoreOwner> aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = this.$ownerProducer.invoke().getViewModelStore();
        C13706o.m87928e(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
