package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u000f"}, mo71668d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Lja/u;", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "Landroid/app/Activity;", "activity", "", "isActivityEmbedded", "EmbeddingCallbackInterface", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
@ExperimentalWindowApi
/* compiled from: EmbeddingInterfaceCompat.kt */
public interface EmbeddingInterfaceCompat {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, mo71668d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Lja/u;", "onSplitInfoChanged", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: EmbeddingInterfaceCompat.kt */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    boolean isActivityEmbedded(Activity activity);

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(Set<? extends EmbeddingRule> set);
}
