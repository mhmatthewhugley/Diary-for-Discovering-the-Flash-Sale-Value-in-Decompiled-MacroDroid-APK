package androidx.activity.result;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n"}, mo71668d2 = {"I", "O", "kotlin.jvm.PlatformType", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* renamed from: androidx.activity.result.ActivityResultCallerKt$registerForActivityResult$resultLauncher$1 */
/* compiled from: ActivityResultCaller.kt */
final class C0137xec7aa640<O> implements ActivityResultCallback {
    final /* synthetic */ C16265l<O, C13339u> $callback;

    C0137xec7aa640(C16265l<? super O, C13339u> lVar) {
        this.$callback = lVar;
    }

    public final void onActivityResult(O o) {
        this.$callback.invoke(o);
    }
}
