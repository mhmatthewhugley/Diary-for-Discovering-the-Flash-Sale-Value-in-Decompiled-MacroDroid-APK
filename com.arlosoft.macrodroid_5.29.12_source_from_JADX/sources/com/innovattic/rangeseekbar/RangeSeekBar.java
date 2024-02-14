package com.innovattic.rangeseekbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00012\u00020\u0001:\u0002\u0015\u001dB.\b\u0007\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\t\b\u0002\u0010\u0001\u001a\u00020\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0003J&\u0010\u0015\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J<\u0010\u001d\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u001eH\u0002J\u0018\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0014J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u00104\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0002J\u0006\u00107\u001a\u00020\u0002J\u000e\u00108\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0002J\u0006\u00109\u001a\u00020\u0002R\u0014\u0010;\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010=R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010?R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010?R\"\u0010E\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010?\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010?\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010N\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010?\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\"\u0010R\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010?\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010DR\"\u0010Y\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010a\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010?\u001a\u0004\b_\u0010B\"\u0004\b`\u0010DR\"\u0010h\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u0010s\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010n\u001a\u0004\bu\u0010p\"\u0004\bv\u0010rR*\u0010{\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\bx\u0010?\u001a\u0004\by\u0010B\"\u0004\bz\u0010DR*\u0010~\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b?\u0010?\u001a\u0004\b|\u0010B\"\u0004\b}\u0010DR\u0017\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010?R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo71668d2 = {"Lcom/innovattic/rangeseekbar/RangeSeekBar;", "Landroid/view/View;", "", "base", "Lja/u;", "t", "Landroid/view/MotionEvent;", "event", "cx", "cy", "radius", "", "s", "measureSpec", "u", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "position", "Landroid/graphics/Point;", "offset", "a", "", "left", "right", "thickness", "Landroid/graphics/Paint;", "paint", "round", "b", "Landroid/content/res/TypedArray;", "defaultValue", "e", "i", "o", "m", "q", "r", "l", "k", "n", "p", "h", "g", "d", "c", "j", "f", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "onTouchEvent", "value", "setMinThumbValue", "getMinThumbValue", "setMaxThumbValue", "getMaxThumbValue", "Landroid/graphics/Paint;", "trackPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "helperRectF", "I", "selectedThumb", "getTrackThickness", "()I", "setTrackThickness", "(I)V", "trackThickness", "getTrackSelectedThickness", "setTrackSelectedThickness", "trackSelectedThickness", "getTrackColor", "setTrackColor", "trackColor", "getTrackSelectedColor", "setTrackSelectedColor", "trackSelectedColor", "z", "getTouchRadius", "setTouchRadius", "touchRadius", "A", "Landroid/graphics/drawable/Drawable;", "getMinThumbDrawable", "()Landroid/graphics/drawable/Drawable;", "setMinThumbDrawable", "(Landroid/graphics/drawable/Drawable;)V", "minThumbDrawable", "B", "getMaxThumbDrawable", "setMaxThumbDrawable", "maxThumbDrawable", "C", "getSidePadding", "setSidePadding", "sidePadding", "D", "Z", "getTrackRoundedCaps", "()Z", "setTrackRoundedCaps", "(Z)V", "trackRoundedCaps", "E", "getTrackSelectedRoundedCaps", "setTrackSelectedRoundedCaps", "trackSelectedRoundedCaps", "F", "Landroid/graphics/Point;", "getMinThumbOffset", "()Landroid/graphics/Point;", "setMinThumbOffset", "(Landroid/graphics/Point;)V", "minThumbOffset", "G", "getMaxThumbOffset", "setMaxThumbOffset", "maxThumbOffset", "H", "getMinRange", "setMinRange", "minRange", "getMax", "setMax", "max", "J", "minThumbValue", "K", "maxThumbValue", "L", "lastMinThumbValue", "M", "lastMaxThumbValue", "Lcom/innovattic/rangeseekbar/RangeSeekBar$b;", "N", "Lcom/innovattic/rangeseekbar/RangeSeekBar$b;", "getSeekBarChangeListener", "()Lcom/innovattic/rangeseekbar/RangeSeekBar$b;", "setSeekBarChangeListener", "(Lcom/innovattic/rangeseekbar/RangeSeekBar$b;)V", "seekBarChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "O", "rangeseekbar_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RangeSeekBar.kt */
public class RangeSeekBar extends View {

    /* renamed from: O */
    public static final C11667a f57328O = new C11667a((C13695i) null);

    /* renamed from: A */
    private Drawable f57329A;

    /* renamed from: B */
    private Drawable f57330B;

    /* renamed from: C */
    private int f57331C;

    /* renamed from: D */
    private boolean f57332D;

    /* renamed from: E */
    private boolean f57333E;

    /* renamed from: F */
    private Point f57334F;

    /* renamed from: G */
    private Point f57335G;

    /* renamed from: H */
    private int f57336H;

    /* renamed from: I */
    private int f57337I;

    /* renamed from: J */
    private int f57338J;

    /* renamed from: K */
    private int f57339K;

    /* renamed from: L */
    private int f57340L;

    /* renamed from: M */
    private int f57341M;

    /* renamed from: N */
    private C11668b f57342N;

    /* renamed from: a */
    private final Paint f57343a;

    /* renamed from: c */
    private final RectF f57344c;

    /* renamed from: d */
    private int f57345d;

    /* renamed from: f */
    private int f57346f;

    /* renamed from: g */
    private int f57347g;

    /* renamed from: o */
    private int f57348o;

    /* renamed from: p */
    private int f57349p;

    /* renamed from: s */
    private int f57350s;

    /* renamed from: z */
    private int f57351z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo71668d2 = {"Lcom/innovattic/rangeseekbar/RangeSeekBar$a;", "", "", "THUMB_MAX", "I", "THUMB_MIN", "THUMB_NONE", "<init>", "()V", "rangeseekbar_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: com.innovattic.rangeseekbar.RangeSeekBar$a */
    /* compiled from: RangeSeekBar.kt */
    public static final class C11667a {
        private C11667a() {
        }

        public /* synthetic */ C11667a(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, mo71668d2 = {"Lcom/innovattic/rangeseekbar/RangeSeekBar$b;", "", "Lja/u;", "a", "b", "", "minThumbValue", "maxThumbValue", "c", "rangeseekbar_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: com.innovattic.rangeseekbar.RangeSeekBar$b */
    /* compiled from: RangeSeekBar.kt */
    public interface C11668b {
        /* renamed from: a */
        void mo31503a();

        /* renamed from: b */
        void mo31504b();

        /* renamed from: c */
        void mo31505c(int i, int i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C13695i) null);
        C13706o.m87929f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RangeSeekBar(Context context, AttributeSet attributeSet, int i, int i2, C13695i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final void m81727a(Drawable drawable, Canvas canvas, int i, Point point) {
        int i2 = i + point.x;
        int height = ((getHeight() - drawable.getIntrinsicHeight()) / 2) + point.y;
        drawable.setBounds(i2, height, drawable.getIntrinsicWidth() + i2, drawable.getIntrinsicHeight() + height);
        drawable.draw(canvas);
    }

    /* renamed from: b */
    private final void m81728b(Canvas canvas, float f, float f2, float f3, float f4, Paint paint, boolean z) {
        float f5 = f4 / ((float) 2);
        float f6 = f3 - f5;
        float f7 = f3 + f5;
        if (z) {
            canvas.drawRoundRect(f - f5, f6, f2 + f5, f7, f4, f4, paint);
            return;
        }
        canvas.drawRect(f, f6, f2, f7, paint);
    }

    /* renamed from: c */
    private final int m81729c(TypedArray typedArray) {
        return typedArray.getInteger(R$styleable.RangeSeekBar_rsb_initialMaxThumbValue, -1);
    }

    /* renamed from: d */
    private final int m81730d(TypedArray typedArray) {
        return typedArray.getInteger(R$styleable.RangeSeekBar_rsb_initialMinThumbValue, -1);
    }

    /* renamed from: e */
    private final Drawable m81731e(TypedArray typedArray, Drawable drawable) {
        Drawable drawable2 = typedArray.getDrawable(R$styleable.RangeSeekBar_rsb_maxThumbDrawable);
        return drawable2 == null ? drawable : drawable2;
    }

    /* renamed from: f */
    private final Point m81732f(TypedArray typedArray) {
        return new Point(typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_maxThumbOffsetHorizontal, 0), typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_maxThumbOffsetVertical, 0));
    }

    /* renamed from: g */
    private final int m81733g(TypedArray typedArray) {
        return typedArray.getInteger(R$styleable.RangeSeekBar_rsb_max, 100);
    }

    /* renamed from: h */
    private final int m81734h(TypedArray typedArray) {
        return typedArray.getInteger(R$styleable.RangeSeekBar_rsb_minRange, 1);
    }

    /* renamed from: i */
    private final Drawable m81735i(TypedArray typedArray, Drawable drawable) {
        Drawable drawable2 = typedArray.getDrawable(R$styleable.RangeSeekBar_rsb_minThumbDrawable);
        return drawable2 == null ? drawable : drawable2;
    }

    /* renamed from: j */
    private final Point m81736j(TypedArray typedArray) {
        return new Point(typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_minThumbOffsetHorizontal, 0), typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_minThumbOffsetVertical, 0));
    }

    /* renamed from: k */
    private final int m81737k(TypedArray typedArray, int i) {
        return typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_sidePadding, i);
    }

    /* renamed from: l */
    private final int m81738l(TypedArray typedArray, int i) {
        return typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_touchRadius, i);
    }

    /* renamed from: m */
    private final int m81739m(TypedArray typedArray, int i) {
        return typedArray.getColor(R$styleable.RangeSeekBar_rsb_trackColor, i);
    }

    /* renamed from: n */
    private final boolean m81740n(TypedArray typedArray) {
        return typedArray.getBoolean(R$styleable.RangeSeekBar_rsb_trackRoundedCaps, false);
    }

    /* renamed from: o */
    private final int m81741o(TypedArray typedArray, int i) {
        return typedArray.getColor(R$styleable.RangeSeekBar_rsb_trackSelectedColor, i);
    }

    /* renamed from: p */
    private final boolean m81742p(TypedArray typedArray) {
        return typedArray.getBoolean(R$styleable.RangeSeekBar_rsb_trackSelectedRoundedCaps, false);
    }

    /* renamed from: q */
    private final int m81743q(TypedArray typedArray, int i) {
        return typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_trackSelectedThickness, i);
    }

    /* renamed from: r */
    private final int m81744r(TypedArray typedArray, int i) {
        return typedArray.getDimensionPixelSize(R$styleable.RangeSeekBar_rsb_trackThickness, i);
    }

    /* renamed from: s */
    private final boolean m81745s(MotionEvent motionEvent, int i, int i2, int i3) {
        float x = motionEvent.getX() - ((float) i);
        float y = motionEvent.getY() - ((float) i2);
        return (x * x) + (y * y) < ((float) (i3 * i3));
    }

    /* renamed from: t */
    private final void m81746t(int i) {
        if (i == 1) {
            int i2 = this.f57338J;
            int i3 = this.f57339K;
            int i4 = this.f57336H;
            if (i2 > i3 - i4) {
                this.f57339K = i2 + i4;
            }
        } else if (i == 2) {
            int i5 = this.f57339K;
            int i6 = this.f57338J;
            int i7 = this.f57336H;
            if (i5 <= i6 + i7) {
                this.f57338J = i5 - i7;
            }
        }
    }

    /* renamed from: u */
    private final int m81747u(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : this.f57331C + Math.max(this.f57329A.getIntrinsicHeight(), this.f57330B.getIntrinsicHeight());
    }

    public final int getMax() {
        return this.f57337I;
    }

    public final Drawable getMaxThumbDrawable() {
        return this.f57330B;
    }

    public final Point getMaxThumbOffset() {
        return this.f57335G;
    }

    public final int getMaxThumbValue() {
        return this.f57339K;
    }

    public final int getMinRange() {
        return this.f57336H;
    }

    public final Drawable getMinThumbDrawable() {
        return this.f57329A;
    }

    public final Point getMinThumbOffset() {
        return this.f57334F;
    }

    public final int getMinThumbValue() {
        return this.f57338J;
    }

    public final C11668b getSeekBarChangeListener() {
        return this.f57342N;
    }

    public final int getSidePadding() {
        return this.f57331C;
    }

    public final int getTouchRadius() {
        return this.f57351z;
    }

    public final int getTrackColor() {
        return this.f57349p;
    }

    public final boolean getTrackRoundedCaps() {
        return this.f57332D;
    }

    public final int getTrackSelectedColor() {
        return this.f57350s;
    }

    public final boolean getTrackSelectedRoundedCaps() {
        return this.f57333E;
    }

    public final int getTrackSelectedThickness() {
        return this.f57348o;
    }

    public final int getTrackThickness() {
        return this.f57347g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C13706o.m87929f(canvas, "canvas");
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft() + this.f57331C;
        int width = (getWidth() - paddingLeft) - (getPaddingRight() + this.f57331C);
        float f = (float) paddingLeft;
        int i = this.f57337I;
        float f2 = (float) width;
        float f3 = ((((float) this.f57338J) / ((float) i)) * f2) + f;
        float f4 = f + ((((float) this.f57339K) / ((float) i)) * f2);
        this.f57343a.setColor(this.f57349p);
        Canvas canvas2 = canvas;
        float height = ((float) getHeight()) / 2.0f;
        m81728b(canvas2, f + 0.0f, f + f2, height, (float) this.f57347g, this.f57343a, this.f57332D);
        this.f57343a.setColor(this.f57350s);
        m81728b(canvas2, f3, f4, height, (float) this.f57348o, this.f57343a, this.f57333E);
        m81727a(this.f57329A, canvas, (int) f3, this.f57334F);
        Drawable drawable = this.f57330B;
        m81727a(drawable, canvas, ((int) f4) - drawable.getIntrinsicWidth(), this.f57335G);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), m81747u(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            boolean r0 = r8.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            int r0 = r8.getPaddingLeft()
            int r2 = r8.f57331C
            int r0 = r0 + r2
            int r2 = r8.getPaddingRight()
            int r3 = r8.f57331C
            int r2 = r2 + r3
            int r3 = r8.getWidth()
            int r3 = r3 - r0
            int r3 = r3 - r2
            float r4 = r9.getX()
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x002c
            r2 = 0
            goto L_0x0052
        L_0x002c:
            float r4 = r9.getX()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0050
            float r4 = r9.getX()
            int r5 = r8.getWidth()
            int r5 = r5 - r2
            float r2 = (float) r5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            float r2 = r9.getX()
            float r2 = r2 - r0
            float r4 = (float) r3
            float r2 = r2 / r4
            int r4 = r8.f57337I
            float r4 = (float) r4
            float r2 = r2 * r4
            int r2 = (int) r2
            goto L_0x0052
        L_0x0050:
            int r2 = r8.f57337I
        L_0x0052:
            int r4 = r8.f57338J
            float r4 = (float) r4
            int r5 = r8.f57337I
            float r6 = (float) r5
            float r4 = r4 / r6
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r0
            int r4 = (int) r4
            int r6 = r8.f57339K
            float r6 = (float) r6
            float r5 = (float) r5
            float r6 = r6 / r5
            float r6 = r6 * r3
            float r0 = r0 + r6
            int r0 = (int) r0
            int r3 = r9.getAction()
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00b0
            if (r3 == r6) goto L_0x00a2
            if (r3 == r5) goto L_0x0075
            goto L_0x00fe
        L_0x0075:
            int r9 = r8.f57345d
            if (r9 != r6) goto L_0x008e
            int r9 = r8.f57346f
            int r2 = r2 - r9
            int r9 = r8.f57337I
            int r0 = r8.f57336H
            int r9 = r9 - r0
            int r9 = java.lang.Math.min(r2, r9)
            int r9 = java.lang.Math.max(r9, r1)
            r8.f57338J = r9
        L_0x008b:
            r9 = 1
            goto L_0x00ff
        L_0x008e:
            if (r9 != r5) goto L_0x00fe
            int r9 = r8.f57346f
            int r2 = r2 + r9
            int r9 = r8.f57336H
            int r9 = java.lang.Math.max(r2, r9)
            int r0 = r8.f57337I
            int r9 = java.lang.Math.min(r9, r0)
            r8.f57339K = r9
            goto L_0x008b
        L_0x00a2:
            r8.f57345d = r1
            com.innovattic.rangeseekbar.RangeSeekBar$b r9 = r8.f57342N
            if (r9 != 0) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            r9.mo31504b()
        L_0x00ac:
            r8.setPressed(r1)
            goto L_0x00fe
        L_0x00b0:
            int r3 = r8.getHeight()
            int r3 = r3 / r5
            int r7 = r8.f57351z
            boolean r3 = r8.m81745s(r9, r4, r3, r7)
            if (r3 == 0) goto L_0x00d7
            r8.f57345d = r6
            int r9 = r8.f57338J
            int r2 = r2 - r9
            r8.f57346f = r2
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r6)
            com.innovattic.rangeseekbar.RangeSeekBar$b r9 = r8.f57342N
            if (r9 != 0) goto L_0x00d0
            goto L_0x00d3
        L_0x00d0:
            r9.mo31503a()
        L_0x00d3:
            r8.setPressed(r6)
            goto L_0x008b
        L_0x00d7:
            int r3 = r8.getHeight()
            int r3 = r3 / r5
            int r4 = r8.f57351z
            boolean r9 = r8.m81745s(r9, r0, r3, r4)
            if (r9 == 0) goto L_0x00fe
            r8.f57345d = r5
            int r9 = r8.f57339K
            int r9 = r9 - r2
            r8.f57346f = r9
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r6)
            com.innovattic.rangeseekbar.RangeSeekBar$b r9 = r8.f57342N
            if (r9 != 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            r9.mo31503a()
        L_0x00fa:
            r8.setPressed(r6)
            goto L_0x008b
        L_0x00fe:
            r9 = 0
        L_0x00ff:
            int r0 = r8.f57345d
            r8.m81746t(r0)
            if (r9 != 0) goto L_0x0107
            return r1
        L_0x0107:
            r8.invalidate()
            int r9 = r8.f57340L
            int r0 = r8.f57338J
            if (r9 != r0) goto L_0x0116
            int r9 = r8.f57341M
            int r1 = r8.f57339K
            if (r9 == r1) goto L_0x0124
        L_0x0116:
            r8.f57340L = r0
            int r9 = r8.f57339K
            r8.f57341M = r9
            com.innovattic.rangeseekbar.RangeSeekBar$b r1 = r8.f57342N
            if (r1 != 0) goto L_0x0121
            goto L_0x0124
        L_0x0121:
            r1.mo31505c(r0, r9)
        L_0x0124:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.innovattic.rangeseekbar.RangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMax(int i) {
        this.f57337I = i;
        this.f57338J = 0;
        this.f57339K = i;
    }

    public final void setMaxThumbDrawable(Drawable drawable) {
        C13706o.m87929f(drawable, "<set-?>");
        this.f57330B = drawable;
    }

    public final void setMaxThumbOffset(Point point) {
        C13706o.m87929f(point, "<set-?>");
        this.f57335G = point;
    }

    public final void setMaxThumbValue(int i) {
        this.f57339K = Math.min(i, this.f57337I);
        m81746t(2);
        invalidate();
    }

    public final void setMinRange(int i) {
        this.f57336H = Math.max(i, 1);
    }

    public final void setMinThumbDrawable(Drawable drawable) {
        C13706o.m87929f(drawable, "<set-?>");
        this.f57329A = drawable;
    }

    public final void setMinThumbOffset(Point point) {
        C13706o.m87929f(point, "<set-?>");
        this.f57334F = point;
    }

    public final void setMinThumbValue(int i) {
        this.f57338J = Math.max(i, 0);
        m81746t(1);
        invalidate();
    }

    public final void setSeekBarChangeListener(C11668b bVar) {
        this.f57342N = bVar;
    }

    public final void setSidePadding(int i) {
        this.f57331C = i;
    }

    public final void setTouchRadius(int i) {
        this.f57351z = i;
    }

    public final void setTrackColor(int i) {
        this.f57349p = i;
    }

    public final void setTrackRoundedCaps(boolean z) {
        this.f57332D = z;
    }

    public final void setTrackSelectedColor(int i) {
        this.f57350s = i;
    }

    public final void setTrackSelectedRoundedCaps(boolean z) {
        this.f57333E = z;
    }

    public final void setTrackSelectedThickness(int i) {
        this.f57348o = i;
    }

    public final void setTrackThickness(int i) {
        this.f57347g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13706o.m87929f(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        C13339u uVar = C13339u.f61331a;
        this.f57343a = paint;
        this.f57344c = new RectF();
        this.f57336H = 1;
        this.f57337I = 100;
        this.f57340L = this.f57338J;
        this.f57341M = this.f57339K;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.rsb_trackDefaultThickness);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.rsb_defaultSidePadding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.rsb_touchRadius);
        int color = ContextCompat.getColor(context, R$color.rsb_trackDefaultColor);
        int color2 = ContextCompat.getColor(context, R$color.rsb_trackSelectedDefaultColor);
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.rsb_bracket_min);
        C13706o.m87926c(drawable);
        C13706o.m87928e(drawable, "getDrawable(context, R.drawable.rsb_bracket_min)!!");
        Drawable drawable2 = ContextCompat.getDrawable(context, R$drawable.rsb_bracket_max);
        C13706o.m87926c(drawable2);
        C13706o.m87928e(drawable2, "getDrawable(context, R.drawable.rsb_bracket_max)!!");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RangeSeekBar, 0, 0);
        C13706o.m87928e(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.RangeSeekBar, 0, 0)");
        try {
            setMax(m81733g(obtainStyledAttributes));
            setMinRange(m81734h(obtainStyledAttributes));
            this.f57331C = m81737k(obtainStyledAttributes, dimensionPixelSize2);
            this.f57351z = m81738l(obtainStyledAttributes, dimensionPixelSize3);
            this.f57347g = m81744r(obtainStyledAttributes, dimensionPixelSize);
            this.f57348o = m81743q(obtainStyledAttributes, dimensionPixelSize);
            this.f57349p = m81739m(obtainStyledAttributes, color);
            this.f57350s = m81741o(obtainStyledAttributes, color2);
            this.f57329A = m81735i(obtainStyledAttributes, drawable);
            this.f57330B = m81731e(obtainStyledAttributes, drawable2);
            this.f57334F = m81736j(obtainStyledAttributes);
            this.f57335G = m81732f(obtainStyledAttributes);
            this.f57332D = m81740n(obtainStyledAttributes);
            this.f57333E = m81742p(obtainStyledAttributes);
            int d = m81730d(obtainStyledAttributes);
            int c = m81729c(obtainStyledAttributes);
            if (d != -1) {
                this.f57338J = Math.max(0, d);
                m81746t(1);
            }
            if (c != -1) {
                this.f57339K = Math.min(this.f57337I, c);
                m81746t(2);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
