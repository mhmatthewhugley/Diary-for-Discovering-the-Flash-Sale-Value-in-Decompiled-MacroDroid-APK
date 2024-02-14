package splitties.init;

import android.content.Context;
import androidx.annotation.CallSuper;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p480wf.C17504a;
import splitties.initprovider.InitProvider;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017¨\u0006\u0005"}, mo71668d2 = {"Lsplitties/init/AppCtxInitProvider;", "Lsplitties/initprovider/InitProvider;", "()V", "onCreate", "", "appctx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: AppCtxInitProvider.kt */
public class AppCtxInitProvider extends InitProvider {
    @CallSuper
    public boolean onCreate() {
        Context context = getContext();
        C13706o.m87926c(context);
        C13706o.m87928e(context, "context!!");
        C17504a.m101264b(context);
        return true;
    }
}
