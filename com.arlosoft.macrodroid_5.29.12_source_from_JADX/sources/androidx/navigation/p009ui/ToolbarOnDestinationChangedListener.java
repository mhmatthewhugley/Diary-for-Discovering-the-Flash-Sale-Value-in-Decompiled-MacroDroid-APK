package androidx.navigation.p009ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.navigation.ui.ToolbarOnDestinationChangedListener */
class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final WeakReference<Toolbar> mToolbarWeakReference;

    ToolbarOnDestinationChangedListener(@NonNull Toolbar toolbar, @NonNull AppBarConfiguration appBarConfiguration) {
        super(toolbar.getContext(), appBarConfiguration);
        this.mToolbarWeakReference = new WeakReference<>(toolbar);
    }

    public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
        if (((Toolbar) this.mToolbarWeakReference.get()) == null) {
            navController.removeOnDestinationChangedListener(this);
        } else {
            super.onDestinationChanged(navController, navDestination, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void setNavigationIcon(Drawable drawable, @StringRes int i) {
        Toolbar toolbar = (Toolbar) this.mToolbarWeakReference.get();
        if (toolbar != null) {
            boolean z = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                TransitionManager.beginDelayedTransition(toolbar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setTitle(CharSequence charSequence) {
        ((Toolbar) this.mToolbarWeakReference.get()).setTitle(charSequence);
    }
}
