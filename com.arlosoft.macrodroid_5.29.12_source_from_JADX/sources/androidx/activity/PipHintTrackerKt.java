package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Lja/u;", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: PipHintTracker.kt */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(Activity activity, View view, C13635d<? super C13339u> dVar) {
        Object collect = C15290h.m94119e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, (C13635d<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1>) null)).collect(new PipHintTrackerKt$trackPipAnimationHintView$$inlined$collect$1(activity), dVar);
        if (collect == C13652d.m87832c()) {
            return collect;
        }
        return C13339u.f61331a;
    }

    /* access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
