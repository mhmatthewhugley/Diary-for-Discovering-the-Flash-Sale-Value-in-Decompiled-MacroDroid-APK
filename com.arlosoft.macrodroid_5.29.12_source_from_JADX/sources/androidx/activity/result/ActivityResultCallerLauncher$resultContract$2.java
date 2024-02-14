package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n"}, mo71668d2 = {"I", "O", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: ActivityResultCaller.kt */
final class ActivityResultCallerLauncher$resultContract$2 extends C13708q implements C16254a<C01391> {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    public final C01391 invoke() {
        final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
        return new ActivityResultContract<C13339u, O>() {
            public O parseResult(int i, Intent intent) {
                return activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
            }

            public Intent createIntent(Context context, C13339u uVar) {
                C13706o.m87929f(context, "context");
                C13706o.m87929f(uVar, "input");
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }
        };
    }
}
