package androidx.window.embedding;

import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"<anonymous>", "", "intent", "Landroid/content/Intent;", "invoke", "(Landroid/content/Intent;)Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: EmbeddingAdapter.kt */
final class EmbeddingAdapter$translateIntentPredicates$1 extends C13708q implements C16265l<Intent, Boolean> {
    final /* synthetic */ Set<ActivityFilter> $activityFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EmbeddingAdapter$translateIntentPredicates$1(Set<ActivityFilter> set) {
        super(1);
        this.$activityFilters = set;
    }

    public final Boolean invoke(Intent intent) {
        C13706o.m87929f(intent, "intent");
        Set<ActivityFilter> set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ActivityFilter) it.next()).matchesIntent(intent)) {
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
