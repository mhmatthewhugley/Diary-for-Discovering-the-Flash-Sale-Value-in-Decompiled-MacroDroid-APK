package dev.skomlach.biometric.compat.utils;

import android.view.View;
import android.view.ViewGroup;
import dev.skomlach.biometric.compat.utils.TruncatedTextFix;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "invoke", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* compiled from: TruncatedTextFix.kt */
final class TruncatedTextFix$recalculateTexts$action$1 extends C13708q implements C16254a<C13339u> {
    final /* synthetic */ View $layout;
    final /* synthetic */ TruncatedTextFix.OnTruncateChecked $onTruncateChecked;
    final /* synthetic */ ViewGroup $windowView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TruncatedTextFix$recalculateTexts$action$1(ViewGroup viewGroup, View view, TruncatedTextFix.OnTruncateChecked onTruncateChecked) {
        super(0);
        this.$windowView = viewGroup;
        this.$layout = view;
        this.$onTruncateChecked = onTruncateChecked;
    }

    public final void invoke() {
        this.$windowView.removeView(this.$layout);
        this.$onTruncateChecked.onDone();
    }
}
