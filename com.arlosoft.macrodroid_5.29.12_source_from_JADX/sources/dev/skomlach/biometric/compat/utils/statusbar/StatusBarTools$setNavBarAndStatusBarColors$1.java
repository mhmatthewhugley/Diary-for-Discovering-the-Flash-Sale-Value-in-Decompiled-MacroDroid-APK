package dev.skomlach.biometric.compat.utils.statusbar;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/statusbar/StatusBarTools$setNavBarAndStatusBarColors$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lja/u;", "onGlobalLayout", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: StatusBarTools.kt */
public final class StatusBarTools$setNavBarAndStatusBarColors$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Runnable $runnable;
    final /* synthetic */ View $view;

    StatusBarTools$setNavBarAndStatusBarColors$1(View view, Runnable runnable) {
        this.$view = view;
        this.$runnable = runnable;
    }

    public void onGlobalLayout() {
        if (HelperTool.INSTANCE.isVisible(this.$view, 100) && this.$view.getViewTreeObserver().isAlive()) {
            this.$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.$view.post(this.$runnable);
        }
    }
}
