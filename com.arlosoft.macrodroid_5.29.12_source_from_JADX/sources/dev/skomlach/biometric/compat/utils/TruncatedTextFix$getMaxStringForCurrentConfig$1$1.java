package dev.skomlach.biometric.compat.utils;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo71668d2 = {"dev/skomlach/biometric/compat/utils/TruncatedTextFix$getMaxStringForCurrentConfig$1$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lja/u;", "onGlobalLayout", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: TruncatedTextFix.kt */
public final class TruncatedTextFix$getMaxStringForCurrentConfig$1$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ C16265l<String, C13339u> $callback;
    final /* synthetic */ C13680b0 $high;
    final /* synthetic */ CharSequence $it;
    final /* synthetic */ C13680b0 $low;
    final /* synthetic */ C13680b0 $mid;

    /* renamed from: $s */
    final /* synthetic */ CharSequence f58327$s;
    final /* synthetic */ int $truncateFromEnd;
    final /* synthetic */ TextView $tv;
    final /* synthetic */ ViewTreeObserver $vto;

    TruncatedTextFix$getMaxStringForCurrentConfig$1$1(TextView textView, CharSequence charSequence, C16265l<? super String, C13339u> lVar, CharSequence charSequence2, ViewTreeObserver viewTreeObserver, C13680b0 b0Var, C13680b0 b0Var2, C13680b0 b0Var3, int i) {
        this.$tv = textView;
        this.$it = charSequence;
        this.$callback = lVar;
        this.f58327$s = charSequence2;
        this.$vto = viewTreeObserver;
        this.$mid = b0Var;
        this.$low = b0Var2;
        this.$high = b0Var3;
        this.$truncateFromEnd = i;
    }

    public void onGlobalLayout() {
        try {
            if (this.$tv.getLayout() != null) {
                if (C13706o.m87924a(this.$tv.getText(), this.$it)) {
                    if (!TruncatedTextFix.INSTANCE.isTextTruncated(this.$tv)) {
                        this.$callback.invoke(this.f58327$s.toString());
                        if (this.$vto.isAlive()) {
                            this.$vto.removeOnGlobalLayoutListener(this);
                            return;
                        }
                        return;
                    }
                    this.$tv.setText(this.$it.subSequence(0, this.$mid.element).toString());
                } else if (this.$low.element <= this.$high.element) {
                    if (TruncatedTextFix.INSTANCE.isTextTruncated(this.$tv)) {
                        this.$high.element = this.$mid.element - 1;
                    } else {
                        this.$low.element = this.$mid.element + 1;
                    }
                    C13680b0 b0Var = this.$mid;
                    int i = (this.$low.element + this.$high.element) / 2;
                    b0Var.element = i;
                    this.$tv.setText(this.$it.subSequence(0, i).toString());
                } else {
                    String obj = this.$it.subSequence(0, (this.$mid.element - TruncatedTextFix.FINALIZED_STRING.length()) - this.$truncateFromEnd).toString();
                    String access$getFINALIZED_STRING$p = TruncatedTextFix.FINALIZED_STRING;
                    this.$callback.invoke(obj + access$getFINALIZED_STRING$p);
                    if (this.$vto.isAlive()) {
                        this.$vto.removeOnGlobalLayoutListener(this);
                    }
                }
            }
        } catch (Throwable th) {
            this.$callback.invoke(this.f58327$s.toString());
            if (this.$vto.isAlive()) {
                this.$vto.removeOnGlobalLayoutListener(this);
            }
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }
}
