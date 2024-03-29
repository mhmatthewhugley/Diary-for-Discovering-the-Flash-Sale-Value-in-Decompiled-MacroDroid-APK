package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "Landroid/os/Bundle;", "Args", "Landroidx/navigation/NavArgs;", "invoke"}, mo71669k = 3, mo71670mv = {1, 1, 16})
/* compiled from: ActivityNavArgsLazy.kt */
public final class ActivityNavArgsLazyKt$navArgs$1 extends C13708q implements C16254a<Bundle> {
    final /* synthetic */ Activity $this_navArgs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityNavArgsLazyKt$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    public final Bundle invoke() {
        Intent intent = this.$this_navArgs.getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + this.$this_navArgs + " has null extras in " + intent);
        }
        throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
    }
}
