package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedstate_release"}, mo71669k = 1, mo71670mv = {1, 6, 0}, mo71672xi = 48)
/* compiled from: SavedStateRegistryOwner.kt */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    SavedStateRegistry getSavedStateRegistry();
}
