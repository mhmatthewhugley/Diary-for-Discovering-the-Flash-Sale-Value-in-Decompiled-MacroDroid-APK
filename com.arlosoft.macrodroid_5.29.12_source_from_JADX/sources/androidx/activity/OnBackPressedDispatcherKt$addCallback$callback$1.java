package androidx.activity;

import kotlin.Metadata;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"androidx/activity/OnBackPressedDispatcherKt$addCallback$callback$1", "Landroidx/activity/OnBackPressedCallback;", "Lja/u;", "handleOnBackPressed", "activity-ktx_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: OnBackPressedDispatcher.kt */
public final class OnBackPressedDispatcherKt$addCallback$callback$1 extends OnBackPressedCallback {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C16265l<OnBackPressedCallback, C13339u> $onBackPressed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OnBackPressedDispatcherKt$addCallback$callback$1(C16265l<? super OnBackPressedCallback, C13339u> lVar, boolean z) {
        super(z);
        this.$onBackPressed = lVar;
        this.$enabled = z;
    }

    public void handleOnBackPressed() {
        this.$onBackPressed.invoke(this);
    }
}
