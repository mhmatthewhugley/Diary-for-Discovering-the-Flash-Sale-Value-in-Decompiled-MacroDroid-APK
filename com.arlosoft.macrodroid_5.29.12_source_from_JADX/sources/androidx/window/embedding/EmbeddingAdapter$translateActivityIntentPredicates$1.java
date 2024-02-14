package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16269p;

@Metadata(mo71667d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"<anonymous>", "", "first", "Landroid/app/Activity;", "second", "Landroid/content/Intent;", "invoke", "(Landroid/app/Activity;Landroid/content/Intent;)Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: EmbeddingAdapter.kt */
final class EmbeddingAdapter$translateActivityIntentPredicates$1 extends C13708q implements C16269p<Activity, Intent, Boolean> {
    final /* synthetic */ Set<SplitPairFilter> $splitPairFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EmbeddingAdapter$translateActivityIntentPredicates$1(Set<SplitPairFilter> set) {
        super(2);
        this.$splitPairFilters = set;
    }

    public final Boolean invoke(Activity activity, Intent intent) {
        C13706o.m87929f(activity, "first");
        C13706o.m87929f(intent, "second");
        Set<SplitPairFilter> set = this.$splitPairFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
