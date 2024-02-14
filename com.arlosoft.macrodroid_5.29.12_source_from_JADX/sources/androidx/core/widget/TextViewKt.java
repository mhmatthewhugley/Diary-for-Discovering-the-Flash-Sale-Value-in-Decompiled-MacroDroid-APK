package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0007\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\bø\u0001\u0000\u001a:\u0010\b\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\bø\u0001\u0000\u001a(\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0016\b\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\tH\bø\u0001\u0000\u001a|\u0010\u000f\u001a\u00020\u0006*\u00020\u00002(\b\u0006\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012(\b\u0006\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0016\b\u0006\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0010"}, mo71668d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "", "Lja/u;", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: TextView.kt */
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, C16271r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C13339u> rVar, C16271r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C13339u> rVar2, C16265l<? super Editable, C13339u> lVar) {
        C13706o.m87929f(textView, "<this>");
        C13706o.m87929f(rVar, "beforeTextChanged");
        C13706o.m87929f(rVar2, "onTextChanged");
        C13706o.m87929f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, C16271r rVar, C16271r rVar2, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = TextViewKt$addTextChangedListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            rVar2 = TextViewKt$addTextChangedListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            lVar = TextViewKt$addTextChangedListener$3.INSTANCE;
        }
        C13706o.m87929f(textView, "<this>");
        C13706o.m87929f(rVar, "beforeTextChanged");
        C13706o.m87929f(rVar2, "onTextChanged");
        C13706o.m87929f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, C16265l<? super Editable, C13339u> lVar) {
        C13706o.m87929f(textView, "<this>");
        C13706o.m87929f(lVar, "action");
        C0511xbb2cb19c textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 = new C0511xbb2cb19c(lVar);
        textView.addTextChangedListener(textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, C16271r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C13339u> rVar) {
        C13706o.m87929f(textView, "<this>");
        C13706o.m87929f(rVar, "action");
        C0512x44bcd5b1 textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1 = new C0512x44bcd5b1(rVar);
        textView.addTextChangedListener(textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, C16271r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C13339u> rVar) {
        C13706o.m87929f(textView, "<this>");
        C13706o.m87929f(rVar, "action");
        C0513x3fe43951 textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1 = new C0513x3fe43951(rVar);
        textView.addTextChangedListener(textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1);
        return textViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1;
    }
}
