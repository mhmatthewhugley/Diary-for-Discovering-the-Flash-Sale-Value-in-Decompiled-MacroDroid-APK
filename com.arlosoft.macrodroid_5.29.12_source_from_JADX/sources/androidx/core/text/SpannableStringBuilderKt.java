package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a?\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a.\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a.\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a,\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u001a$\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0018"}, mo71668d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lja/u;", "builderAction", "Landroid/text/SpannedString;", "buildSpannedString", "", "", "spans", "inSpans", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lqa/l;)Landroid/text/SpannableStringBuilder;", "span", "bold", "italic", "underline", "", "color", "backgroundColor", "strikeThrough", "", "proportion", "scale", "superscript", "subscript", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: SpannableStringBuilder.kt */
public final class SpannableStringBuilderKt {
    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, @ColorInt int i, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString buildSpannedString(C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(lVar, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, @ColorInt int i, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(objArr, "spans");
        C13706o.m87929f(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(lVar, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, C16265l<? super SpannableStringBuilder, C13339u> lVar) {
        C13706o.m87929f(spannableStringBuilder, "<this>");
        C13706o.m87929f(obj, "span");
        C13706o.m87929f(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
