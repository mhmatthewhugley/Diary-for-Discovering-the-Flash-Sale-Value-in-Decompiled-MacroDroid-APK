package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import com.android.p023dx.rop.code.RegisterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15239r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0010\r\u001a\u00020\f2\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\n"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "v", "", "l", "t", "r", "b", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$layoutChangeListener$1 */
/* compiled from: PipHintTracker.kt */
final class C0125xcb0293e3 implements View.OnLayoutChangeListener {
    final /* synthetic */ C15239r<Rect> $$this$callbackFlow;

    C0125xcb0293e3(C15239r<? super Rect> rVar) {
        this.$$this$callbackFlow = rVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            C15239r<Rect> rVar = this.$$this$callbackFlow;
            C13706o.m87928e(view, RegisterSpec.PREFIX);
            rVar.offer(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
        }
    }
}
