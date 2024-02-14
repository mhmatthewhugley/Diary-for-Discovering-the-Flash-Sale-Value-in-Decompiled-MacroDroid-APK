package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13321g;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\b"}, mo71668d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lja/g;", "viewModels", "activity-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: ActivityViewModelLazy.kt */
public final class ActivityViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> C13321g<VM> viewModels(ComponentActivity componentActivity, C16254a<? extends ViewModelProvider.Factory> aVar) {
        C13706o.m87929f(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        C13706o.m87933j(4, "VM");
        return new ViewModelLazy(C13687e0.m87868b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar);
    }

    public static /* synthetic */ C13321g viewModels$default(ComponentActivity componentActivity, C16254a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        C13706o.m87929f(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        C13706o.m87933j(4, "VM");
        return new ViewModelLazy(C13687e0.m87868b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar);
    }
}
