package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p361pa.C16147a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR,\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006)"}, mo71668d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "build", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "targetPackage", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "action", "getAction", "setAction", "Landroid/net/Uri;", "data", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern", "Lxa/d;", "Landroid/app/Activity;", "activityClass", "Lxa/d;", "getActivityClass", "()Lxa/d;", "setActivityClass", "(Lxa/d;)V", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "navigation-runtime-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: ActivityNavigatorDestinationBuilder.kt */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private C16875d<? extends Activity> activityClass;
    private final Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator activityNavigator, @IdRes int i) {
        super(activityNavigator, i);
        C13706o.m87930g(activityNavigator, "navigator");
        Context context2 = activityNavigator.getContext();
        C13706o.m87925b(context2, "navigator.context");
        this.context = context2;
    }

    public final String getAction() {
        return this.action;
    }

    public final C16875d<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    public final Uri getData() {
        return this.data;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityClass(C16875d<? extends Activity> dVar) {
        this.activityClass = dVar;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        C16875d<? extends Activity> dVar = this.activityClass;
        if (dVar != null) {
            destination.setComponentName(new ComponentName(this.context, C16147a.m96968b(dVar)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }
}
