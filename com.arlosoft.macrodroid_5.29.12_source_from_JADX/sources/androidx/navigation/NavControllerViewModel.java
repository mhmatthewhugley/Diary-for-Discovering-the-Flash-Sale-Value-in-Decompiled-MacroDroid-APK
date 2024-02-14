package androidx.navigation;

import androidx.annotation.NonNull;
import androidx.lifecycle.C0740e;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

class NavControllerViewModel extends ViewModel {
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() {
        @NonNull
        public <T extends ViewModel> T create(@NonNull Class<T> cls) {
            return new NavControllerViewModel();
        }

        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return C0740e.m548b(this, cls, creationExtras);
        }
    };
    private final HashMap<UUID, ViewModelStore> mViewModelStores = new HashMap<>();

    NavControllerViewModel() {
    }

    @NonNull
    static NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
        return (NavControllerViewModel) new ViewModelProvider(viewModelStore, FACTORY).get(NavControllerViewModel.class);
    }

    /* access modifiers changed from: package-private */
    public void clear(@NonNull UUID uuid) {
        ViewModelStore remove = this.mViewModelStores.remove(uuid);
        if (remove != null) {
            remove.clear();
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public ViewModelStore getViewModelStore(@NonNull UUID uuid) {
        ViewModelStore viewModelStore = this.mViewModelStores.get(uuid);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.mViewModelStores.put(uuid, viewModelStore2);
        return viewModelStore2;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        for (ViewModelStore clear : this.mViewModelStores.values()) {
            clear.clear();
        }
        this.mViewModelStores.clear();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.mViewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
