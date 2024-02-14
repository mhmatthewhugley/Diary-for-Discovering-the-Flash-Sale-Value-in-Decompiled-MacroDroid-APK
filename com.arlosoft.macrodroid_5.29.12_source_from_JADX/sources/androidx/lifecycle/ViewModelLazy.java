package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13321g;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, mo71668d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lja/g;", "", "isInitialized", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "Lxa/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lxa/d;Lqa/a;Lqa/a;Lqa/a;)V", "lifecycle-viewmodel_release"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* compiled from: ViewModelLazy.kt */
public final class ViewModelLazy<VM extends ViewModel> implements C13321g<VM> {
    private VM cached;
    private final C16254a<CreationExtras> extrasProducer;
    private final C16254a<ViewModelProvider.Factory> factoryProducer;
    private final C16254a<ViewModelStore> storeProducer;
    private final C16875d<VM> viewModelClass;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(C16875d<VM> dVar, C16254a<? extends ViewModelStore> aVar, C16254a<? extends ViewModelProvider.Factory> aVar2) {
        this(dVar, aVar, aVar2, (C16254a) null, 8, (C13695i) null);
        C13706o.m87929f(dVar, "viewModelClass");
        C13706o.m87929f(aVar, "storeProducer");
        C13706o.m87929f(aVar2, "factoryProducer");
    }

    public ViewModelLazy(C16875d<VM> dVar, C16254a<? extends ViewModelStore> aVar, C16254a<? extends ViewModelProvider.Factory> aVar2, C16254a<? extends CreationExtras> aVar3) {
        C13706o.m87929f(dVar, "viewModelClass");
        C13706o.m87929f(aVar, "storeProducer");
        C13706o.m87929f(aVar2, "factoryProducer");
        C13706o.m87929f(aVar3, "extrasProducer");
        this.viewModelClass = dVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(C16147a.m96968b(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelLazy(C16875d dVar, C16254a aVar, C16254a aVar2, C16254a aVar3, int i, C13695i iVar) {
        this(dVar, aVar, aVar2, (i & 8) != 0 ? C07331.INSTANCE : aVar3);
    }
}
