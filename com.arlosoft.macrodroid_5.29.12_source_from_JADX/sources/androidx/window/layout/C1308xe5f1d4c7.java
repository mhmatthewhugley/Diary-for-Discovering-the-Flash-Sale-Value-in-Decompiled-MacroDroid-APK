package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.window.layout.ExtensionInterfaceCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo71668d2 = {"androidx/window/layout/SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lja/u;", "onConfigurationChanged", "onLowMemory", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 */
/* compiled from: SidecarCompat.kt */
public final class C1308xe5f1d4c7 implements ComponentCallbacks {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ SidecarCompat this$0;

    C1308xe5f1d4c7(SidecarCompat sidecarCompat, Activity activity) {
        this.this$0 = sidecarCompat;
        this.$activity = activity;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C13706o.m87929f(configuration, "newConfig");
        ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = this.this$0.extensionCallback;
        if (access$getExtensionCallback$p != null) {
            Activity activity = this.$activity;
            access$getExtensionCallback$p.onWindowLayoutChanged(activity, this.this$0.getWindowLayoutInfo(activity));
        }
    }

    public void onLowMemory() {
    }
}
