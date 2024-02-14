package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo71668d2 = {"<anonymous>", "Landroidx/activity/OnBackPressedDispatcherOwner;", "it", "Landroid/view/View;", "invoke"}, mo71669k = 3, mo71670mv = {1, 6, 0}, mo71672xi = 48)
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
final class C0130x8c7c000b extends C13708q implements C16265l<View, OnBackPressedDispatcherOwner> {
    public static final C0130x8c7c000b INSTANCE = new C0130x8c7c000b();

    C0130x8c7c000b() {
        super(1);
    }

    public final OnBackPressedDispatcherOwner invoke(View view) {
        C13706o.m87929f(view, "it");
        Object tag = view.getTag(C0127R.C0128id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
