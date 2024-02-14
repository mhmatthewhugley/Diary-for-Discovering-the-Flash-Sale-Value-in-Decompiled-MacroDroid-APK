package dev.skomlach.biometric.compat.utils;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import dev.skomlach.common.misc.C12120d;
import kotlin.Metadata;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/TruncatedTextFix;", "", "", "s", "Landroid/widget/TextView;", "tv", "Lkotlin/Function1;", "", "Lja/u;", "callback", "", "truncateFromEnd", "getMaxStringForCurrentConfig", "textView", "", "isTextTruncated", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "Ldev/skomlach/biometric/compat/utils/TruncatedTextFix$OnTruncateChecked;", "onTruncateChecked", "recalculateTexts", "TITLE_SHIFT", "I", "SUBTITLE_SHIFT", "DESCRIPTION_SHIFT", "FINALIZED_STRING", "Ljava/lang/String;", "<init>", "()V", "OnTruncateChecked", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: TruncatedTextFix.kt */
public final class TruncatedTextFix {
    private static int DESCRIPTION_SHIFT;
    /* access modifiers changed from: private */
    public static final String FINALIZED_STRING = "..";
    public static final TruncatedTextFix INSTANCE = new TruncatedTextFix();
    private static int SUBTITLE_SHIFT = 1;
    private static int TITLE_SHIFT;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/TruncatedTextFix$OnTruncateChecked;", "", "Lja/u;", "onDone", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: TruncatedTextFix.kt */
    public interface OnTruncateChecked {
        void onDone();
    }

    static {
        TITLE_SHIFT = 7;
        DESCRIPTION_SHIFT = 2;
        if (C12120d.f58384a.mo68316c()) {
            TITLE_SHIFT = 1;
            DESCRIPTION_SHIFT = 0;
        }
    }

    private TruncatedTextFix() {
    }

    private final void getMaxStringForCurrentConfig(CharSequence charSequence, TextView textView, C16265l<? super String, C13339u> lVar, int i) {
        C13339u uVar;
        CharSequence charSequence2 = charSequence;
        TextView textView2 = textView;
        C16265l<? super String, C13339u> lVar2 = lVar;
        String str = null;
        if (textView2 == null) {
            if (charSequence2 != null) {
                str = charSequence.toString();
            }
            lVar2.invoke(str);
            return;
        }
        if (charSequence2 != null) {
            C13680b0 b0Var = new C13680b0();
            C13680b0 b0Var2 = new C13680b0();
            b0Var2.element = charSequence.length() - 1;
            C13680b0 b0Var3 = new C13680b0();
            b0Var3.element = (b0Var.element + b0Var2.element) / 2;
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            C13706o.m87928e(viewTreeObserver, "tv.viewTreeObserver");
            viewTreeObserver.addOnGlobalLayoutListener(new TruncatedTextFix$getMaxStringForCurrentConfig$1$1(textView, charSequence, lVar, charSequence, viewTreeObserver, b0Var3, b0Var, b0Var2, i));
            textView2.setText(charSequence2);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            if (charSequence2 != null) {
                str = charSequence.toString();
            }
            lVar2.invoke(str);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isTextTruncated(TextView textView) {
        Layout layout;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        C13706o.m87928e(layout, "layout");
        int lineCount = layout.getLineCount();
        if (lineCount <= 0) {
            return false;
        }
        if (layout.getEllipsisCount(lineCount - 1) > 0 || lineCount > 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void recalculateTexts(dev.skomlach.biometric.compat.BiometricPromptCompat.Builder r8, dev.skomlach.biometric.compat.utils.TruncatedTextFix.OnTruncateChecked r9) {
        /*
            r7 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "onTruncateChecked"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            androidx.fragment.app.FragmentActivity r0 = r8.getContext()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.fragment.app.FragmentActivity r1 = r8.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = dev.skomlach.biometric.compat.C12021R.C12026layout.biometric_prompt_dialog_content
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r2 = 4
            r1.setVisibility(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r2.<init>(r4, r4)
            r4 = 1325400064(0x4f000000, float:2.14748365E9)
            r1.setX(r4)
            r1.setY(r4)
            ja.u r4 = p297ja.C13339u.f61331a
            r0.addView(r1, r2)
            int r2 = dev.skomlach.biometric.compat.C12021R.C12024id.dialogContent
            android.view.View r2 = r1.findViewById(r2)
            if (r2 == 0) goto L_0x0053
            int r4 = dev.skomlach.biometric.compat.C12021R.C12024id.title
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L_0x0054
        L_0x0053:
            r4 = r3
        L_0x0054:
            if (r2 == 0) goto L_0x005f
            int r5 = dev.skomlach.biometric.compat.C12021R.C12024id.subtitle
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            if (r2 == 0) goto L_0x006b
            int r3 = dev.skomlach.biometric.compat.C12021R.C12024id.description
            android.view.View r2 = r2.findViewById(r3)
            r3 = r2
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x006b:
            dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$action$1 r2 = new dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$action$1
            r2.<init>(r0, r1, r9)
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 3
            r9.<init>(r0)
            java.lang.CharSequence r0 = r8.getTitle()
            dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$1 r1 = new dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$1
            r1.<init>(r8, r9, r2)
            int r6 = TITLE_SHIFT
            r7.getMaxStringForCurrentConfig(r0, r4, r1, r6)
            java.lang.CharSequence r0 = r8.getSubtitle()
            dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$2 r1 = new dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$2
            r1.<init>(r8, r9, r2)
            int r4 = SUBTITLE_SHIFT
            r7.getMaxStringForCurrentConfig(r0, r5, r1, r4)
            java.lang.CharSequence r0 = r8.getDescription()
            dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$3 r1 = new dev.skomlach.biometric.compat.utils.TruncatedTextFix$recalculateTexts$3
            r1.<init>(r8, r9, r2)
            int r8 = DESCRIPTION_SHIFT
            r7.getMaxStringForCurrentConfig(r0, r3, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.TruncatedTextFix.recalculateTexts(dev.skomlach.biometric.compat.BiometricPromptCompat$Builder, dev.skomlach.biometric.compat.utils.TruncatedTextFix$OnTruncateChecked):void");
    }
}
