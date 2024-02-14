package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0144Px;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\b\u001a$\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\rH\bø\u0001\u0000\u001a*\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0010H\bø\u0001\u0000\u001a\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u0000H\u0002\u001a\u0017\u0010\u0016\u001a\u00020\b*\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0001H\b\u001a5\u0010\u001b\u001a\u00020\b*\u00020\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u00012\b\b\u0003\u0010\u0018\u001a\u00020\u00012\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u0001H\b\u001a5\u0010\u001e\u001a\u00020\b*\u00020\u00142\b\b\u0003\u0010\u001c\u001a\u00020\u00012\b\b\u0003\u0010\u0018\u001a\u00020\u00012\b\b\u0003\u0010\u001d\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u0001H\b\"\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0016\u0010$\u001a\u00020!*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030%*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030%*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b)\u0010'\u0002\u0007\n\u0005\b20\u0001¨\u0006+"}, mo71668d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "get", "view", "", "contains", "Lja/u;", "plusAssign", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "setMargins", "left", "top", "right", "bottom", "updateMargins", "start", "end", "updateMarginsRelative", "getSize", "(Landroid/view/ViewGroup;)I", "Lwa/e;", "getIndices", "(Landroid/view/ViewGroup;)Lwa/e;", "indices", "Lkotlin/sequences/h;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/h;", "children", "getDescendants", "descendants", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: ViewGroup.kt */
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        C13706o.m87929f(viewGroup, "<this>");
        C13706o.m87929f(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(viewGroup, "<this>");
        C13706o.m87929f(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C13706o.m87928e(childAt, "getChildAt(index)");
            lVar.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, C16269p<? super Integer, ? super View, C13339u> pVar) {
        C13706o.m87929f(viewGroup, "<this>");
        C13706o.m87929f(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            C13706o.m87928e(childAt, "getChildAt(index)");
            pVar.invoke(valueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final C15118h<View> getChildren(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static final C15118h<View> getDescendants(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return C15122l.m93467b(new ViewGroupKt$descendants$1(viewGroup, (C13635d<? super ViewGroupKt$descendants$1>) null));
    }

    public static final C16788e getIndices(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return C16792h.m99549k(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        C13706o.m87929f(viewGroup, "<this>");
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        C13706o.m87929f(viewGroup, "<this>");
        C13706o.m87929f(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        C13706o.m87929f(viewGroup, "<this>");
        C13706o.m87929f(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0144Px int i) {
        C13706o.m87929f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0144Px int i, @C0144Px int i2, @C0144Px int i3, @C0144Px int i4) {
        C13706o.m87929f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C13706o.m87929f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @C0144Px int i, @C0144Px int i2, @C0144Px int i3, @C0144Px int i4) {
        C13706o.m87929f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C13706o.m87929f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
