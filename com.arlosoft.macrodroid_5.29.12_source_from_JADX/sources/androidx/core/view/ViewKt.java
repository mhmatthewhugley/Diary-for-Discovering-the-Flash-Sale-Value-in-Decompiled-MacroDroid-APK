package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0144Px;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a5\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\nH\b\u001a5\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\n2\b\b\u0003\u0010\u000e\u001a\u00020\nH\b\u001a\u0017\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\nH\b\u001a(\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\bø\u0001\u0000\u001a\"\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0007\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u001a$\u0010!\u001a\u00020\u0002*\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a7\u0010!\u001a\u00020\u0002\"\n\b\u0000\u0010\"\u0018\u0001*\u00020\u001f*\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\"*\u0010'\u001a\u00020%*\u00020\u00002\u0006\u0010&\u001a\u00020%8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\"*\u0010+\u001a\u00020%*\u00020\u00002\u0006\u0010&\u001a\u00020%8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*\"*\u0010-\u001a\u00020%*\u00020\u00002\u0006\u0010&\u001a\u00020%8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*\"\u0016\u00101\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0016\u00103\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b2\u00100\"\u0016\u00105\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b4\u00100\"\u0016\u00107\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00100\"\u0016\u00109\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00100\"\u0016\u0010;\u001a\u00020\n*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b:\u00100\"\u001b\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00000<*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bA\u0010?\u0002\u0007\n\u0005\b20\u0001¨\u0006C"}, mo71668d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lja/u;", "action", "doOnNextLayout", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "left", "right", "updatePadding", "size", "setPadding", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "Landroid/view/ViewGroup$LayoutParams;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "(Landroid/view/View;Lqa/l;)V", "", "value", "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Lkotlin/sequences/h;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/h;", "ancestors", "getAllViews", "allViews", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: View.kt */
public final class ViewKt {
    public static final void doOnAttach(View view, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnAttach$1(view, lVar));
        }
    }

    public static final void doOnDetach(View view, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "action");
        if (!ViewCompat.isAttachedToWindow(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnDetach$1(view, lVar));
        }
    }

    public static final void doOnLayout(View view, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewKt$doOnLayout$$inlined$doOnNextLayout$1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "action");
        view.addOnLayoutChangeListener(new ViewKt$doOnNextLayout$1(lVar));
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, C16265l<? super View, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new ViewKt$doOnPreDraw$1(lVar, view));
        C13706o.m87928e(add, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(config, "config");
        if (ViewCompat.isLaidOut(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            C13706o.m87928e(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final C15118h<View> getAllViews(View view) {
        C13706o.m87929f(view, "<this>");
        return C15122l.m93467b(new ViewKt$allViews$1(view, (C13635d<? super ViewKt$allViews$1>) null));
    }

    public static final C15118h<ViewParent> getAncestors(View view) {
        C13706o.m87929f(view, "<this>");
        return C15125n.m93473h(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        C13706o.m87929f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        C13706o.m87929f(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        C13706o.m87929f(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        C13706o.m87929f(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j, C16254a<C13339u> aVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(aVar, "action");
        ViewKt$postDelayed$runnable$1 viewKt$postDelayed$runnable$1 = new ViewKt$postDelayed$runnable$1(aVar);
        view.postDelayed(viewKt$postDelayed$runnable$1, j);
        return viewKt$postDelayed$runnable$1;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j, C16254a<C13339u> aVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(aVar, "action");
        C0503i iVar = new C0503i(aVar);
        Api16Impl.postOnAnimationDelayed(view, iVar, j);
        return iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: postOnAnimationDelayed$lambda-1  reason: not valid java name */
    public static final void m101273postOnAnimationDelayed$lambda1(C16254a aVar) {
        C13706o.m87929f(aVar, "$action");
        aVar.invoke();
    }

    public static final void setGone(View view, boolean z) {
        C13706o.m87929f(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z) {
        C13706o.m87929f(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void setPadding(View view, @C0144Px int i) {
        C13706o.m87929f(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(View view, boolean z) {
        C13706o.m87929f(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, C16265l<? super ViewGroup.LayoutParams, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, C16265l<? super T, C13339u> lVar) {
        C13706o.m87929f(view, "<this>");
        C13706o.m87929f(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C13706o.m87933j(1, ExifInterface.GPS_DIRECTION_TRUE);
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(View view, @C0144Px int i, @C0144Px int i2, @C0144Px int i3, @C0144Px int i4) {
        C13706o.m87929f(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C13706o.m87929f(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(View view, @C0144Px int i, @C0144Px int i2, @C0144Px int i3, @C0144Px int i4) {
        C13706o.m87929f(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C13706o.m87929f(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
