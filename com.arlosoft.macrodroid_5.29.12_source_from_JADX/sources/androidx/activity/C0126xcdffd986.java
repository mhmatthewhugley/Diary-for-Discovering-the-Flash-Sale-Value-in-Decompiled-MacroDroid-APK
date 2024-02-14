package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlinx.coroutines.channels.C15239r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo71668d2 = {"Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1 */
/* compiled from: PipHintTracker.kt */
final class C0126xcdffd986 implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ C15239r<Rect> $$this$callbackFlow;
    final /* synthetic */ View $view;

    C0126xcdffd986(C15239r<? super Rect> rVar, View view) {
        this.$$this$callbackFlow = rVar;
        this.$view = view;
    }

    public final void onScrollChanged() {
        this.$$this$callbackFlow.offer(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
    }
}
