package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a2\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0006*\u00020\u00012\u0014\b\b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0000H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, mo71668d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "Lja/u;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "lifecycle-viewmodel_release"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* compiled from: InitializerViewModelFactory.kt */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, C16265l<? super CreationExtras, ? extends VM> lVar) {
        C13706o.m87929f(initializerViewModelFactoryBuilder, "<this>");
        C13706o.m87929f(lVar, "initializer");
        C13706o.m87933j(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(C13687e0.m87868b(ViewModel.class), lVar);
    }

    public static final ViewModelProvider.Factory viewModelFactory(C16265l<? super InitializerViewModelFactoryBuilder, C13339u> lVar) {
        C13706o.m87929f(lVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        lVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
