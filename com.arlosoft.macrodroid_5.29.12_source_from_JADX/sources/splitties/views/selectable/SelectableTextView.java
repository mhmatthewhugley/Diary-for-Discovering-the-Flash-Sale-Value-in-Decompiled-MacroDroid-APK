package splitties.views.selectable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p487zf.C17520a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0015J(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0015J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0015J\b\u0010\r\u001a\u00020\u0002H\u0017J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0015J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0017R.\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo71668d2 = {"Lsplitties/views/selectable/SelectableTextView;", "Landroid/widget/TextView;", "Lja/u;", "drawableStateChanged", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "jumpDrawablesToCurrentState", "Landroid/graphics/drawable/Drawable;", "who", "", "verifyDrawable", "", "x", "y", "dispatchDrawableHotspotChanged", "value", "a", "Landroid/graphics/drawable/Drawable;", "getForegroundSelector", "()Landroid/graphics/drawable/Drawable;", "setForegroundSelector", "(Landroid/graphics/drawable/Drawable;)V", "foregroundSelector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views-selectable_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SelectableTextView.kt */
public class SelectableTextView extends TextView {

    /* renamed from: a */
    private Drawable f69223a;

    public SelectableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C13695i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectableTextView(Context context, AttributeSet attributeSet, int i, int i2, C13695i iVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @RequiresApi(21)
    @CallSuper
    public void dispatchDrawableHotspotChanged(float f, float f2) {
        super.dispatchDrawableHotspotChanged(f, f2);
        Drawable drawable = this.f69223a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f69223a;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    public final Drawable getForegroundSelector() {
        return this.f69223a;
    }

    @CallSuper
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f69223a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onDraw(Canvas canvas) {
        C13706o.m87929f(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f69223a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f69223a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void setForegroundSelector(Drawable drawable) {
        Drawable drawable2 = this.f69223a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f69223a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        setWillNotDraw(drawable == null);
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public boolean verifyDrawable(Drawable drawable) {
        C13706o.m87929f(drawable, "who");
        return drawable == this.f69223a || super.verifyDrawable(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
        Context context2 = getContext();
        C13706o.m87928e(context2, "context");
        setForegroundSelector(C17520a.m101268b(context2, 16843534));
    }
}
