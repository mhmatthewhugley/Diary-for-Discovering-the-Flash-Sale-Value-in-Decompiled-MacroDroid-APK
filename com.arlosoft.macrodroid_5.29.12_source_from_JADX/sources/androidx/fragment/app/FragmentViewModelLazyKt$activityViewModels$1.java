package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, mo71668d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt$activityViewModels$1 extends C13708q implements C16254a<ViewModelStore> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        C13706o.m87928e(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
