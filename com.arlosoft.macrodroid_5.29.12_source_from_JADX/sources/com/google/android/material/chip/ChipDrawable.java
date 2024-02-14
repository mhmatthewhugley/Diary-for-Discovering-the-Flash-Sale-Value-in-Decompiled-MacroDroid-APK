package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: a1 */
    private static final int[] f48991a1 = {16842910};

    /* renamed from: b1 */
    private static final ShapeDrawable f48992b1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private final Paint.FontMetrics f48993A0 = new Paint.FontMetrics();

    /* renamed from: B0 */
    private final RectF f48994B0 = new RectF();

    /* renamed from: C0 */
    private final PointF f48995C0 = new PointF();

    /* renamed from: D0 */
    private final Path f48996D0 = new Path();
    @NonNull

    /* renamed from: E0 */
    private final TextDrawableHelper f48997E0;
    @ColorInt

    /* renamed from: F0 */
    private int f48998F0;
    @ColorInt

    /* renamed from: G0 */
    private int f48999G0;
    @ColorInt

    /* renamed from: H0 */
    private int f49000H0;
    @ColorInt

    /* renamed from: I0 */
    private int f49001I0;
    @ColorInt

    /* renamed from: J0 */
    private int f49002J0;
    @ColorInt

    /* renamed from: K0 */
    private int f49003K0;

    /* renamed from: L0 */
    private boolean f49004L0;
    @ColorInt

    /* renamed from: M0 */
    private int f49005M0;

    /* renamed from: N0 */
    private int f49006N0 = 255;
    @Nullable

    /* renamed from: O0 */
    private ColorFilter f49007O0;
    @Nullable

    /* renamed from: P0 */
    private PorterDuffColorFilter f49008P0;
    @Nullable

    /* renamed from: Q */
    private ColorStateList f49009Q;
    @Nullable

    /* renamed from: Q0 */
    private ColorStateList f49010Q0;
    @Nullable

    /* renamed from: R */
    private ColorStateList f49011R;
    @Nullable

    /* renamed from: R0 */
    private PorterDuff.Mode f49012R0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: S */
    private float f49013S;

    /* renamed from: S0 */
    private int[] f49014S0;

    /* renamed from: T */
    private float f49015T = -1.0f;

    /* renamed from: T0 */
    private boolean f49016T0;
    @Nullable

    /* renamed from: U */
    private ColorStateList f49017U;
    @Nullable

    /* renamed from: U0 */
    private ColorStateList f49018U0;

    /* renamed from: V */
    private float f49019V;
    @NonNull

    /* renamed from: V0 */
    private WeakReference<Delegate> f49020V0 = new WeakReference<>((Object) null);
    @Nullable

    /* renamed from: W */
    private ColorStateList f49021W;

    /* renamed from: W0 */
    private TextUtils.TruncateAt f49022W0;
    @Nullable

    /* renamed from: X */
    private CharSequence f49023X;

    /* renamed from: X0 */
    private boolean f49024X0;

    /* renamed from: Y */
    private boolean f49025Y;

    /* renamed from: Y0 */
    private int f49026Y0;
    @Nullable

    /* renamed from: Z */
    private Drawable f49027Z;

    /* renamed from: Z0 */
    private boolean f49028Z0;
    @Nullable

    /* renamed from: a0 */
    private ColorStateList f49029a0;

    /* renamed from: b0 */
    private float f49030b0;

    /* renamed from: c0 */
    private boolean f49031c0;

    /* renamed from: d0 */
    private boolean f49032d0;
    @Nullable

    /* renamed from: e0 */
    private Drawable f49033e0;
    @Nullable

    /* renamed from: f0 */
    private Drawable f49034f0;
    @Nullable

    /* renamed from: g0 */
    private ColorStateList f49035g0;

    /* renamed from: h0 */
    private float f49036h0;
    @Nullable

    /* renamed from: i0 */
    private CharSequence f49037i0;

    /* renamed from: j0 */
    private boolean f49038j0;

    /* renamed from: k0 */
    private boolean f49039k0;
    @Nullable

    /* renamed from: l0 */
    private Drawable f49040l0;
    @Nullable

    /* renamed from: m0 */
    private ColorStateList f49041m0;
    @Nullable

    /* renamed from: n0 */
    private MotionSpec f49042n0;
    @Nullable

    /* renamed from: o0 */
    private MotionSpec f49043o0;

    /* renamed from: p0 */
    private float f49044p0;

    /* renamed from: q0 */
    private float f49045q0;

    /* renamed from: r0 */
    private float f49046r0;

    /* renamed from: s0 */
    private float f49047s0;

    /* renamed from: t0 */
    private float f49048t0;

    /* renamed from: u0 */
    private float f49049u0;

    /* renamed from: v0 */
    private float f49050v0;

    /* renamed from: w0 */
    private float f49051w0;
    @NonNull

    /* renamed from: x0 */
    private final Context f49052x0;

    /* renamed from: y0 */
    private final Paint f49053y0 = new Paint(1);
    @Nullable

    /* renamed from: z0 */
    private final Paint f49054z0;

    public interface Delegate {
        /* renamed from: a */
        void mo57184a();
    }

    private ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        mo58649P(context);
        this.f49052x0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f48997E0 = textDrawableHelper;
        this.f49023X = "";
        textDrawableHelper.mo58218e().density = context.getResources().getDisplayMetrics().density;
        this.f49054z0 = null;
        int[] iArr = f48991a1;
        setState(iArr);
        mo57427s2(iArr);
        this.f49024X0 = true;
        if (RippleUtils.f49933a) {
            f48992b1.setTint(-1);
        }
    }

    /* renamed from: A1 */
    private static boolean m67882A1(@Nullable TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.mo58603i() == null || !textAppearance.mo58603i().isStateful()) ? false : true;
    }

    /* renamed from: B0 */
    private boolean m67883B0() {
        return this.f49039k0 && this.f49040l0 != null && this.f49038j0;
    }

    /* renamed from: B1 */
    private void m67884B1(@Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray h = ThemeEnforcement.m68822h(this.f49052x0, attributeSet, C10462R.styleable.Chip, i, i2, new int[0]);
        this.f49028Z0 = h.hasValue(C10462R.styleable.Chip_shapeAppearance);
        m67904i2(MaterialResources.m69121a(this.f49052x0, h, C10462R.styleable.Chip_chipSurfaceColor));
        mo57349M1(MaterialResources.m69121a(this.f49052x0, h, C10462R.styleable.Chip_chipBackgroundColor));
        mo57384a2(h.getDimension(C10462R.styleable.Chip_chipMinHeight, 0.0f));
        int i3 = C10462R.styleable.Chip_chipCornerRadius;
        if (h.hasValue(i3)) {
            mo57355O1(h.getDimension(i3, 0.0f));
        }
        mo57393e2(MaterialResources.m69121a(this.f49052x0, h, C10462R.styleable.Chip_chipStrokeColor));
        mo57396g2(h.getDimension(C10462R.styleable.Chip_chipStrokeWidth, 0.0f));
        mo57335F2(MaterialResources.m69121a(this.f49052x0, h, C10462R.styleable.Chip_rippleColor));
        mo57345K2(h.getText(C10462R.styleable.Chip_android_text));
        TextAppearance f = MaterialResources.m69126f(this.f49052x0, h, C10462R.styleable.Chip_android_textAppearance);
        f.mo58606l(h.getDimension(C10462R.styleable.Chip_android_textSize, f.mo58604j()));
        mo57347L2(f);
        int i4 = h.getInt(C10462R.styleable.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            mo57443x2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo57443x2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo57443x2(TextUtils.TruncateAt.END);
        }
        mo57382Z1(h.getBoolean(C10462R.styleable.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo57382Z1(h.getBoolean(C10462R.styleable.Chip_chipIconEnabled, false));
        }
        mo57367S1(MaterialResources.m69124d(this.f49052x0, h, C10462R.styleable.Chip_chipIcon));
        int i5 = C10462R.styleable.Chip_chipIconTint;
        if (h.hasValue(i5)) {
            mo57376W1(MaterialResources.m69121a(this.f49052x0, h, i5));
        }
        mo57372U1(h.getDimension(C10462R.styleable.Chip_chipIconSize, -1.0f));
        mo57438v2(h.getBoolean(C10462R.styleable.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo57438v2(h.getBoolean(C10462R.styleable.Chip_closeIconEnabled, false));
        }
        mo57408j2(MaterialResources.m69124d(this.f49052x0, h, C10462R.styleable.Chip_closeIcon));
        mo57434t2(MaterialResources.m69121a(this.f49052x0, h, C10462R.styleable.Chip_closeIconTint));
        mo57418o2(h.getDimension(C10462R.styleable.Chip_closeIconSize, 0.0f));
        mo57332E1(h.getBoolean(C10462R.styleable.Chip_android_checkable, false));
        mo57346L1(h.getBoolean(C10462R.styleable.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo57346L1(h.getBoolean(C10462R.styleable.Chip_checkedIconEnabled, false));
        }
        mo57336G1(MaterialResources.m69124d(this.f49052x0, h, C10462R.styleable.Chip_checkedIcon));
        int i6 = C10462R.styleable.Chip_checkedIconTint;
        if (h.hasValue(i6)) {
            mo57340I1(MaterialResources.m69121a(this.f49052x0, h, i6));
        }
        mo57341I2(MotionSpec.m67235c(this.f49052x0, h, C10462R.styleable.Chip_showMotionSpec));
        mo57444y2(MotionSpec.m67235c(this.f49052x0, h, C10462R.styleable.Chip_hideMotionSpec));
        mo57388c2(h.getDimension(C10462R.styleable.Chip_chipStartPadding, 0.0f));
        mo57330C2(h.getDimension(C10462R.styleable.Chip_iconStartPadding, 0.0f));
        mo57327A2(h.getDimension(C10462R.styleable.Chip_iconEndPadding, 0.0f));
        mo57359P2(h.getDimension(C10462R.styleable.Chip_textStartPadding, 0.0f));
        mo57353N2(h.getDimension(C10462R.styleable.Chip_textEndPadding, 0.0f));
        mo57424q2(h.getDimension(C10462R.styleable.Chip_closeIconStartPadding, 0.0f));
        mo57412l2(h.getDimension(C10462R.styleable.Chip_closeIconEndPadding, 0.0f));
        mo57361Q1(h.getDimension(C10462R.styleable.Chip_chipEndPadding, 0.0f));
        mo57333E2(h.getDimensionPixelSize(C10462R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        h.recycle();
    }

    @NonNull
    /* renamed from: C0 */
    public static ChipDrawable m67885C0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.m67884B1(attributeSet, i, i2);
        return chipDrawable;
    }

    /* renamed from: D0 */
    private void m67886D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m67896T2()) {
            m67906s0(rect, this.f48994B0);
            RectF rectF = this.f48994B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49040l0.setBounds(0, 0, (int) this.f48994B0.width(), (int) this.f48994B0.height());
            this.f49040l0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0156  */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m67887D1(@androidx.annotation.NonNull int[] r7, @androidx.annotation.NonNull int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f49009Q
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f48998F0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.mo58672l(r1)
            int r3 = r6.f48998F0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f48998F0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.f49011R
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f48999G0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.mo58672l(r3)
            int r5 = r6.f48999G0
            if (r5 == r3) goto L_0x0034
            r6.f48999G0 = r3
            r0 = 1
        L_0x0034:
            int r1 = com.google.android.material.color.MaterialColors.m68107g(r1, r3)
            int r3 = r6.f49000H0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.mo58684x()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f49000H0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo58656a0(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.f49017U
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f49001I0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f49001I0
            if (r3 == r1) goto L_0x0068
            r6.f49001I0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.f49018U0
            if (r1 == 0) goto L_0x007b
            boolean r1 = com.google.android.material.ripple.RippleUtils.m69156e(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.f49018U0
            int r3 = r6.f49002J0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f49002J0
            if (r3 == r1) goto L_0x0087
            r6.f49002J0 = r1
            boolean r1 = r6.f49016T0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.TextDrawableHelper r1 = r6.f48997E0
            com.google.android.material.resources.TextAppearance r1 = r1.mo58217d()
            if (r1 == 0) goto L_0x00ac
            com.google.android.material.internal.TextDrawableHelper r1 = r6.f48997E0
            com.google.android.material.resources.TextAppearance r1 = r1.mo58217d()
            android.content.res.ColorStateList r1 = r1.mo58603i()
            if (r1 == 0) goto L_0x00ac
            com.google.android.material.internal.TextDrawableHelper r1 = r6.f48997E0
            com.google.android.material.resources.TextAppearance r1 = r1.mo58217d()
            android.content.res.ColorStateList r1 = r1.mo58603i()
            int r3 = r6.f49003K0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            int r3 = r6.f49003K0
            if (r3 == r1) goto L_0x00b4
            r6.f49003K0 = r1
            r0 = 1
        L_0x00b4:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m67909u1(r1, r3)
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r6.f49038j0
            if (r1 == 0) goto L_0x00c7
            r1 = 1
            goto L_0x00c8
        L_0x00c7:
            r1 = 0
        L_0x00c8:
            boolean r3 = r6.f49004L0
            if (r3 == r1) goto L_0x00e2
            android.graphics.drawable.Drawable r3 = r6.f49040l0
            if (r3 == 0) goto L_0x00e2
            float r0 = r6.mo57432t0()
            r6.f49004L0 = r1
            float r1 = r6.mo57432t0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            r1 = 1
            goto L_0x00e3
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            android.content.res.ColorStateList r3 = r6.f49010Q0
            if (r3 == 0) goto L_0x00ee
            int r5 = r6.f49005M0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            int r5 = r6.f49005M0
            if (r5 == r3) goto L_0x0100
            r6.f49005M0 = r3
            android.content.res.ColorStateList r0 = r6.f49010Q0
            android.graphics.PorterDuff$Mode r3 = r6.f49012R0
            android.graphics.PorterDuffColorFilter r0 = com.google.android.material.drawable.DrawableUtils.m68381b(r6, r0, r3)
            r6.f49008P0 = r0
            goto L_0x0101
        L_0x0100:
            r4 = r0
        L_0x0101:
            android.graphics.drawable.Drawable r0 = r6.f49027Z
            boolean r0 = m67915z1(r0)
            if (r0 == 0) goto L_0x0110
            android.graphics.drawable.Drawable r0 = r6.f49027Z
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r6.f49040l0
            boolean r0 = m67915z1(r0)
            if (r0 == 0) goto L_0x011f
            android.graphics.drawable.Drawable r0 = r6.f49040l0
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011f:
            android.graphics.drawable.Drawable r0 = r6.f49033e0
            boolean r0 = m67915z1(r0)
            if (r0 == 0) goto L_0x013c
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f49033e0
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x013c:
            boolean r7 = com.google.android.material.ripple.RippleUtils.f49933a
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.f49034f0
            boolean r7 = m67915z1(r7)
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.f49034f0
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014f:
            if (r4 == 0) goto L_0x0154
            r6.invalidateSelf()
        L_0x0154:
            if (r1 == 0) goto L_0x0159
            r6.mo57329C1()
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.m67887D1(int[], int[]):boolean");
    }

    /* renamed from: E0 */
    private void m67888E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.f49028Z0) {
            this.f49053y0.setColor(this.f48999G0);
            this.f49053y0.setStyle(Paint.Style.FILL);
            this.f49053y0.setColorFilter(m67907s1());
            this.f48994B0.set(rect);
            canvas.drawRoundRect(this.f48994B0, mo57357P0(), mo57357P0(), this.f49053y0);
        }
    }

    /* renamed from: F0 */
    private void m67889F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m67897U2()) {
            m67906s0(rect, this.f48994B0);
            RectF rectF = this.f48994B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49027Z.setBounds(0, 0, (int) this.f48994B0.width(), (int) this.f48994B0.height());
            this.f49027Z.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: G0 */
    private void m67890G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f49019V > 0.0f && !this.f49028Z0) {
            this.f49053y0.setColor(this.f49001I0);
            this.f49053y0.setStyle(Paint.Style.STROKE);
            if (!this.f49028Z0) {
                this.f49053y0.setColorFilter(m67907s1());
            }
            RectF rectF = this.f48994B0;
            float f = this.f49019V;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f49015T - (this.f49019V / 2.0f);
            canvas.drawRoundRect(this.f48994B0, f2, f2, this.f49053y0);
        }
    }

    /* renamed from: H0 */
    private void m67891H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.f49028Z0) {
            this.f49053y0.setColor(this.f48998F0);
            this.f49053y0.setStyle(Paint.Style.FILL);
            this.f48994B0.set(rect);
            canvas.drawRoundRect(this.f48994B0, mo57357P0(), mo57357P0(), this.f49053y0);
        }
    }

    /* renamed from: I0 */
    private void m67892I0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m67898V2()) {
            m67910v0(rect, this.f48994B0);
            RectF rectF = this.f48994B0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f49033e0.setBounds(0, 0, (int) this.f48994B0.width(), (int) this.f48994B0.height());
            if (RippleUtils.f49933a) {
                this.f49034f0.setBounds(this.f49033e0.getBounds());
                this.f49034f0.jumpToCurrentState();
                this.f49034f0.draw(canvas);
            } else {
                this.f49033e0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: J0 */
    private void m67893J0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f49053y0.setColor(this.f49002J0);
        this.f49053y0.setStyle(Paint.Style.FILL);
        this.f48994B0.set(rect);
        if (!this.f49028Z0) {
            canvas.drawRoundRect(this.f48994B0, mo57357P0(), mo57357P0(), this.f49053y0);
            return;
        }
        mo58666h(new RectF(rect), this.f48996D0);
        super.mo58678p(canvas, this.f49053y0, this.f48996D0, mo58682u());
    }

    /* renamed from: K0 */
    private void m67894K0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Paint paint = this.f49054z0;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.f49054z0);
            if (m67897U2() || m67896T2()) {
                m67906s0(rect, this.f48994B0);
                canvas.drawRect(this.f48994B0, this.f49054z0);
            }
            if (this.f49023X != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f49054z0);
            }
            if (m67898V2()) {
                m67910v0(rect, this.f48994B0);
                canvas.drawRect(this.f48994B0, this.f49054z0);
            }
            this.f49054z0.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, 127));
            m67908u0(rect, this.f48994B0);
            canvas.drawRect(this.f48994B0, this.f49054z0);
            this.f49054z0.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            m67911w0(rect, this.f48994B0);
            canvas.drawRect(this.f48994B0, this.f49054z0);
        }
    }

    /* renamed from: L0 */
    private void m67895L0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f49023X != null) {
            Paint.Align A0 = mo57326A0(rect, this.f48995C0);
            m67912y0(rect, this.f48994B0);
            if (this.f48997E0.mo58217d() != null) {
                this.f48997E0.mo58218e().drawableState = getState();
                this.f48997E0.mo58223j(this.f49052x0);
            }
            this.f48997E0.mo58218e().setTextAlign(A0);
            int i = 0;
            boolean z = Math.round(this.f48997E0.mo58219f(mo57417o1().toString())) > Math.round(this.f48994B0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f48994B0);
            }
            CharSequence charSequence = this.f49023X;
            if (z && this.f49022W0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f48997E0.mo58218e(), this.f48994B0.width(), this.f49022W0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f48995C0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f48997E0.mo58218e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: T2 */
    private boolean m67896T2() {
        return this.f49039k0 && this.f49040l0 != null && this.f49004L0;
    }

    /* renamed from: U2 */
    private boolean m67897U2() {
        return this.f49025Y && this.f49027Z != null;
    }

    /* renamed from: V2 */
    private boolean m67898V2() {
        return this.f49032d0 && this.f49033e0 != null;
    }

    /* renamed from: W2 */
    private void m67899W2(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: X2 */
    private void m67900X2() {
        this.f49018U0 = this.f49016T0 ? RippleUtils.m69155d(this.f49021W) : null;
    }

    /* renamed from: Y2 */
    private void m67901Y2() {
        this.f49034f0 = new RippleDrawable(RippleUtils.m69155d(mo57413m1()), this.f49033e0, f48992b1);
    }

    /* renamed from: g1 */
    private float m67902g1() {
        Drawable drawable = this.f49004L0 ? this.f49040l0 : this.f49027Z;
        float f = this.f49030b0;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) ViewUtils.m68837d(this.f49052x0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: h1 */
    private float m67903h1() {
        Drawable drawable = this.f49004L0 ? this.f49040l0 : this.f49027Z;
        float f = this.f49030b0;
        return (f > 0.0f || drawable == null) ? f : (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: i2 */
    private void m67904i2(@Nullable ColorStateList colorStateList) {
        if (this.f49009Q != colorStateList) {
            this.f49009Q = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: r0 */
    private void m67905r0(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f49033e0) {
                if (drawable.isStateful()) {
                    drawable.setState(mo57389d1());
                }
                DrawableCompat.setTintList(drawable, this.f49035g0);
                return;
            }
            Drawable drawable2 = this.f49027Z;
            if (drawable == drawable2 && this.f49031c0) {
                DrawableCompat.setTintList(drawable2, this.f49029a0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: s0 */
    private void m67906s0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m67897U2() || m67896T2()) {
            float f = this.f49044p0 + this.f49045q0;
            float h1 = m67903h1();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + h1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - h1;
            }
            float g1 = m67902g1();
            float exactCenterY = rect.exactCenterY() - (g1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + g1;
        }
    }

    @Nullable
    /* renamed from: s1 */
    private ColorFilter m67907s1() {
        ColorFilter colorFilter = this.f49007O0;
        return colorFilter != null ? colorFilter : this.f49008P0;
    }

    /* renamed from: u0 */
    private void m67908u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (m67898V2()) {
            float f = this.f49051w0 + this.f49050v0 + this.f49036h0 + this.f49049u0 + this.f49048t0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: u1 */
    private static boolean m67909u1(@Nullable int[] iArr, @AttrRes int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    private void m67910v0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m67898V2()) {
            float f = this.f49051w0 + this.f49050v0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f49036h0;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f49036h0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f49036h0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: w0 */
    private void m67911w0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m67898V2()) {
            float f = this.f49051w0 + this.f49050v0 + this.f49036h0 + this.f49049u0 + this.f49048t0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: y0 */
    private void m67912y0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.f49023X != null) {
            float t0 = this.f49044p0 + mo57432t0() + this.f49047s0;
            float x0 = this.f49051w0 + mo57441x0() + this.f49048t0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = ((float) rect.left) + t0;
                rectF.right = ((float) rect.right) - x0;
            } else {
                rectF.left = ((float) rect.left) + x0;
                rectF.right = ((float) rect.right) - t0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: y1 */
    private static boolean m67913y1(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: z0 */
    private float m67914z0() {
        this.f48997E0.mo58218e().getFontMetrics(this.f48993A0);
        Paint.FontMetrics fontMetrics = this.f48993A0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: z1 */
    private static boolean m67915z1(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: A0 */
    public Paint.Align mo57326A0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f49023X != null) {
            float t0 = this.f49044p0 + mo57432t0() + this.f49047s0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = ((float) rect.left) + t0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - t0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m67914z0();
        }
        return align;
    }

    /* renamed from: A2 */
    public void mo57327A2(float f) {
        if (this.f49046r0 != f) {
            float t0 = mo57432t0();
            this.f49046r0 = f;
            float t02 = mo57432t0();
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: B2 */
    public void mo57328B2(@DimenRes int i) {
        mo57327A2(this.f49052x0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo57329C1() {
        Delegate delegate = (Delegate) this.f49020V0.get();
        if (delegate != null) {
            delegate.mo57184a();
        }
    }

    /* renamed from: C2 */
    public void mo57330C2(float f) {
        if (this.f49045q0 != f) {
            float t0 = mo57432t0();
            this.f49045q0 = f;
            float t02 = mo57432t0();
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: D2 */
    public void mo57331D2(@DimenRes int i) {
        mo57330C2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: E1 */
    public void mo57332E1(boolean z) {
        if (this.f49038j0 != z) {
            this.f49038j0 = z;
            float t0 = mo57432t0();
            if (!z && this.f49004L0) {
                this.f49004L0 = false;
            }
            float t02 = mo57432t0();
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: E2 */
    public void mo57333E2(@C0144Px int i) {
        this.f49026Y0 = i;
    }

    /* renamed from: F1 */
    public void mo57334F1(@BoolRes int i) {
        mo57332E1(this.f49052x0.getResources().getBoolean(i));
    }

    /* renamed from: F2 */
    public void mo57335F2(@Nullable ColorStateList colorStateList) {
        if (this.f49021W != colorStateList) {
            this.f49021W = colorStateList;
            m67900X2();
            onStateChange(getState());
        }
    }

    /* renamed from: G1 */
    public void mo57336G1(@Nullable Drawable drawable) {
        if (this.f49040l0 != drawable) {
            float t0 = mo57432t0();
            this.f49040l0 = drawable;
            float t02 = mo57432t0();
            m67899W2(this.f49040l0);
            m67905r0(this.f49040l0);
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: G2 */
    public void mo57337G2(@ColorRes int i) {
        mo57335F2(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    /* renamed from: H1 */
    public void mo57338H1(@DrawableRes int i) {
        mo57336G1(AppCompatResources.getDrawable(this.f49052x0, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void mo57339H2(boolean z) {
        this.f49024X0 = z;
    }

    /* renamed from: I1 */
    public void mo57340I1(@Nullable ColorStateList colorStateList) {
        if (this.f49041m0 != colorStateList) {
            this.f49041m0 = colorStateList;
            if (m67883B0()) {
                DrawableCompat.setTintList(this.f49040l0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: I2 */
    public void mo57341I2(@Nullable MotionSpec motionSpec) {
        this.f49042n0 = motionSpec;
    }

    /* renamed from: J1 */
    public void mo57342J1(@ColorRes int i) {
        mo57340I1(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    /* renamed from: J2 */
    public void mo57343J2(@AnimatorRes int i) {
        mo57341I2(MotionSpec.m67236d(this.f49052x0, i));
    }

    /* renamed from: K1 */
    public void mo57344K1(@BoolRes int i) {
        mo57346L1(this.f49052x0.getResources().getBoolean(i));
    }

    /* renamed from: K2 */
    public void mo57345K2(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f49023X, charSequence)) {
            this.f49023X = charSequence;
            this.f48997E0.mo58222i(true);
            invalidateSelf();
            mo57329C1();
        }
    }

    /* renamed from: L1 */
    public void mo57346L1(boolean z) {
        if (this.f49039k0 != z) {
            boolean T2 = m67896T2();
            this.f49039k0 = z;
            boolean T22 = m67896T2();
            if (T2 != T22) {
                if (T22) {
                    m67905r0(this.f49040l0);
                } else {
                    m67899W2(this.f49040l0);
                }
                invalidateSelf();
                mo57329C1();
            }
        }
    }

    /* renamed from: L2 */
    public void mo57347L2(@Nullable TextAppearance textAppearance) {
        this.f48997E0.mo58221h(textAppearance, this.f49052x0);
    }

    @Nullable
    /* renamed from: M0 */
    public Drawable mo57348M0() {
        return this.f49040l0;
    }

    /* renamed from: M1 */
    public void mo57349M1(@Nullable ColorStateList colorStateList) {
        if (this.f49011R != colorStateList) {
            this.f49011R = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: M2 */
    public void mo57350M2(@StyleRes int i) {
        mo57347L2(new TextAppearance(this.f49052x0, i));
    }

    @Nullable
    /* renamed from: N0 */
    public ColorStateList mo57351N0() {
        return this.f49041m0;
    }

    /* renamed from: N1 */
    public void mo57352N1(@ColorRes int i) {
        mo57349M1(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    /* renamed from: N2 */
    public void mo57353N2(float f) {
        if (this.f49048t0 != f) {
            this.f49048t0 = f;
            invalidateSelf();
            mo57329C1();
        }
    }

    @Nullable
    /* renamed from: O0 */
    public ColorStateList mo57354O0() {
        return this.f49011R;
    }

    @Deprecated
    /* renamed from: O1 */
    public void mo57355O1(float f) {
        if (this.f49015T != f) {
            this.f49015T = f;
            setShapeAppearanceModel(getShapeAppearanceModel().mo58708w(f));
        }
    }

    /* renamed from: O2 */
    public void mo57356O2(@DimenRes int i) {
        mo57353N2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: P0 */
    public float mo57357P0() {
        return this.f49028Z0 ? mo58645I() : this.f49015T;
    }

    @Deprecated
    /* renamed from: P1 */
    public void mo57358P1(@DimenRes int i) {
        mo57355O1(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: P2 */
    public void mo57359P2(float f) {
        if (this.f49047s0 != f) {
            this.f49047s0 = f;
            invalidateSelf();
            mo57329C1();
        }
    }

    /* renamed from: Q0 */
    public float mo57360Q0() {
        return this.f49051w0;
    }

    /* renamed from: Q1 */
    public void mo57361Q1(float f) {
        if (this.f49051w0 != f) {
            this.f49051w0 = f;
            invalidateSelf();
            mo57329C1();
        }
    }

    /* renamed from: Q2 */
    public void mo57362Q2(@DimenRes int i) {
        mo57359P2(this.f49052x0.getResources().getDimension(i));
    }

    @Nullable
    /* renamed from: R0 */
    public Drawable mo57363R0() {
        Drawable drawable = this.f49027Z;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    /* renamed from: R1 */
    public void mo57364R1(@DimenRes int i) {
        mo57361Q1(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: R2 */
    public void mo57365R2(boolean z) {
        if (this.f49016T0 != z) {
            this.f49016T0 = z;
            m67900X2();
            onStateChange(getState());
        }
    }

    /* renamed from: S0 */
    public float mo57366S0() {
        return this.f49030b0;
    }

    /* renamed from: S1 */
    public void mo57367S1(@Nullable Drawable drawable) {
        Drawable R0 = mo57363R0();
        if (R0 != drawable) {
            float t0 = mo57432t0();
            this.f49027Z = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float t02 = mo57432t0();
            m67899W2(R0);
            if (m67897U2()) {
                m67905r0(this.f49027Z);
            }
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S2 */
    public boolean mo57368S2() {
        return this.f49024X0;
    }

    @Nullable
    /* renamed from: T0 */
    public ColorStateList mo57369T0() {
        return this.f49029a0;
    }

    /* renamed from: T1 */
    public void mo57370T1(@DrawableRes int i) {
        mo57367S1(AppCompatResources.getDrawable(this.f49052x0, i));
    }

    /* renamed from: U0 */
    public float mo57371U0() {
        return this.f49013S;
    }

    /* renamed from: U1 */
    public void mo57372U1(float f) {
        if (this.f49030b0 != f) {
            float t0 = mo57432t0();
            this.f49030b0 = f;
            float t02 = mo57432t0();
            invalidateSelf();
            if (t0 != t02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: V0 */
    public float mo57373V0() {
        return this.f49044p0;
    }

    /* renamed from: V1 */
    public void mo57374V1(@DimenRes int i) {
        mo57372U1(this.f49052x0.getResources().getDimension(i));
    }

    @Nullable
    /* renamed from: W0 */
    public ColorStateList mo57375W0() {
        return this.f49017U;
    }

    /* renamed from: W1 */
    public void mo57376W1(@Nullable ColorStateList colorStateList) {
        this.f49031c0 = true;
        if (this.f49029a0 != colorStateList) {
            this.f49029a0 = colorStateList;
            if (m67897U2()) {
                DrawableCompat.setTintList(this.f49027Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X0 */
    public float mo57377X0() {
        return this.f49019V;
    }

    /* renamed from: X1 */
    public void mo57378X1(@ColorRes int i) {
        mo57376W1(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    @Nullable
    /* renamed from: Y0 */
    public Drawable mo57379Y0() {
        Drawable drawable = this.f49033e0;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    /* renamed from: Y1 */
    public void mo57380Y1(@BoolRes int i) {
        mo57382Z1(this.f49052x0.getResources().getBoolean(i));
    }

    @Nullable
    /* renamed from: Z0 */
    public CharSequence mo57381Z0() {
        return this.f49037i0;
    }

    /* renamed from: Z1 */
    public void mo57382Z1(boolean z) {
        if (this.f49025Y != z) {
            boolean U2 = m67897U2();
            this.f49025Y = z;
            boolean U22 = m67897U2();
            if (U2 != U22) {
                if (U22) {
                    m67905r0(this.f49027Z);
                } else {
                    m67899W2(this.f49027Z);
                }
                invalidateSelf();
                mo57329C1();
            }
        }
    }

    /* renamed from: a */
    public void mo56809a() {
        mo57329C1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float mo57383a1() {
        return this.f49050v0;
    }

    /* renamed from: a2 */
    public void mo57384a2(float f) {
        if (this.f49013S != f) {
            this.f49013S = f;
            invalidateSelf();
            mo57329C1();
        }
    }

    /* renamed from: b1 */
    public float mo57385b1() {
        return this.f49036h0;
    }

    /* renamed from: b2 */
    public void mo57386b2(@DimenRes int i) {
        mo57384a2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: c1 */
    public float mo57387c1() {
        return this.f49049u0;
    }

    /* renamed from: c2 */
    public void mo57388c2(float f) {
        if (this.f49044p0 != f) {
            this.f49044p0 = f;
            invalidateSelf();
            mo57329C1();
        }
    }

    @NonNull
    /* renamed from: d1 */
    public int[] mo57389d1() {
        return this.f49014S0;
    }

    /* renamed from: d2 */
    public void mo57390d2(@DimenRes int i) {
        mo57388c2(this.f49052x0.getResources().getDimension(i));
    }

    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f49006N0;
            if (i2 < 255) {
                i = CanvasCompat.m67789a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m67891H0(canvas, bounds);
            m67888E0(canvas, bounds);
            if (this.f49028Z0) {
                super.draw(canvas);
            }
            m67890G0(canvas, bounds);
            m67893J0(canvas, bounds);
            m67889F0(canvas, bounds);
            m67886D0(canvas, bounds);
            if (this.f49024X0) {
                m67895L0(canvas, bounds);
            }
            m67892I0(canvas, bounds);
            m67894K0(canvas, bounds);
            if (this.f49006N0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Nullable
    /* renamed from: e1 */
    public ColorStateList mo57392e1() {
        return this.f49035g0;
    }

    /* renamed from: e2 */
    public void mo57393e2(@Nullable ColorStateList colorStateList) {
        if (this.f49017U != colorStateList) {
            this.f49017U = colorStateList;
            if (this.f49028Z0) {
                mo58674m0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f1 */
    public void mo57394f1(@NonNull RectF rectF) {
        m67911w0(getBounds(), rectF);
    }

    /* renamed from: f2 */
    public void mo57395f2(@ColorRes int i) {
        mo57393e2(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    /* renamed from: g2 */
    public void mo57396g2(float f) {
        if (this.f49019V != f) {
            this.f49019V = f;
            this.f49053y0.setStrokeWidth(f);
            if (this.f49028Z0) {
                super.mo58676n0(f);
            }
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f49006N0;
    }

    @Nullable
    public ColorFilter getColorFilter() {
        return this.f49007O0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f49013S;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f49044p0 + mo57432t0() + this.f49047s0 + this.f48997E0.mo58219f(mo57417o1().toString()) + this.f49048t0 + mo57441x0() + this.f49051w0), this.f49026Y0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(@NonNull Outline outline) {
        if (this.f49028Z0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f49015T);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f49015T);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h2 */
    public void mo57403h2(@DimenRes int i) {
        mo57396g2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: i1 */
    public TextUtils.TruncateAt mo57404i1() {
        return this.f49022W0;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m67913y1(this.f49009Q) || m67913y1(this.f49011R) || m67913y1(this.f49017U) || (this.f49016T0 && m67913y1(this.f49018U0)) || m67882A1(this.f48997E0.mo58217d()) || m67883B0() || m67915z1(this.f49027Z) || m67915z1(this.f49040l0) || m67913y1(this.f49010Q0);
    }

    @Nullable
    /* renamed from: j1 */
    public MotionSpec mo57407j1() {
        return this.f49043o0;
    }

    /* renamed from: j2 */
    public void mo57408j2(@Nullable Drawable drawable) {
        Drawable Y0 = mo57379Y0();
        if (Y0 != drawable) {
            float x0 = mo57441x0();
            this.f49033e0 = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            if (RippleUtils.f49933a) {
                m67901Y2();
            }
            float x02 = mo57441x0();
            m67899W2(Y0);
            if (m67898V2()) {
                m67905r0(this.f49033e0);
            }
            invalidateSelf();
            if (x0 != x02) {
                mo57329C1();
            }
        }
    }

    /* renamed from: k1 */
    public float mo57409k1() {
        return this.f49046r0;
    }

    /* renamed from: k2 */
    public void mo57410k2(@Nullable CharSequence charSequence) {
        if (this.f49037i0 != charSequence) {
            this.f49037i0 = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: l1 */
    public float mo57411l1() {
        return this.f49045q0;
    }

    /* renamed from: l2 */
    public void mo57412l2(float f) {
        if (this.f49050v0 != f) {
            this.f49050v0 = f;
            invalidateSelf();
            if (m67898V2()) {
                mo57329C1();
            }
        }
    }

    @Nullable
    /* renamed from: m1 */
    public ColorStateList mo57413m1() {
        return this.f49021W;
    }

    /* renamed from: m2 */
    public void mo57414m2(@DimenRes int i) {
        mo57412l2(this.f49052x0.getResources().getDimension(i));
    }

    @Nullable
    /* renamed from: n1 */
    public MotionSpec mo57415n1() {
        return this.f49042n0;
    }

    /* renamed from: n2 */
    public void mo57416n2(@DrawableRes int i) {
        mo57408j2(AppCompatResources.getDrawable(this.f49052x0, i));
    }

    @Nullable
    /* renamed from: o1 */
    public CharSequence mo57417o1() {
        return this.f49023X;
    }

    /* renamed from: o2 */
    public void mo57418o2(float f) {
        if (this.f49036h0 != f) {
            this.f49036h0 = f;
            invalidateSelf();
            if (m67898V2()) {
                mo57329C1();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m67897U2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49027Z, i);
        }
        if (m67896T2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49040l0, i);
        }
        if (m67898V2()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f49033e0, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m67897U2()) {
            onLevelChange |= this.f49027Z.setLevel(i);
        }
        if (m67896T2()) {
            onLevelChange |= this.f49040l0.setLevel(i);
        }
        if (m67898V2()) {
            onLevelChange |= this.f49033e0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f49028Z0) {
            super.onStateChange(iArr);
        }
        return m67887D1(iArr, mo57389d1());
    }

    @Nullable
    /* renamed from: p1 */
    public TextAppearance mo57421p1() {
        return this.f48997E0.mo58217d();
    }

    /* renamed from: p2 */
    public void mo57422p2(@DimenRes int i) {
        mo57418o2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: q1 */
    public float mo57423q1() {
        return this.f49048t0;
    }

    /* renamed from: q2 */
    public void mo57424q2(float f) {
        if (this.f49049u0 != f) {
            this.f49049u0 = f;
            invalidateSelf();
            if (m67898V2()) {
                mo57329C1();
            }
        }
    }

    /* renamed from: r1 */
    public float mo57425r1() {
        return this.f49047s0;
    }

    /* renamed from: r2 */
    public void mo57426r2(@DimenRes int i) {
        mo57424q2(this.f49052x0.getResources().getDimension(i));
    }

    /* renamed from: s2 */
    public boolean mo57427s2(@NonNull int[] iArr) {
        if (Arrays.equals(this.f49014S0, iArr)) {
            return false;
        }
        this.f49014S0 = iArr;
        if (m67898V2()) {
            return m67887D1(getState(), iArr);
        }
        return false;
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f49006N0 != i) {
            this.f49006N0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f49007O0 != colorFilter) {
            this.f49007O0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f49010Q0 != colorStateList) {
            this.f49010Q0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f49012R0 != mode) {
            this.f49012R0 = mode;
            this.f49008P0 = DrawableUtils.m68381b(this, this.f49010Q0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m67897U2()) {
            visible |= this.f49027Z.setVisible(z, z2);
        }
        if (m67896T2()) {
            visible |= this.f49040l0.setVisible(z, z2);
        }
        if (m67898V2()) {
            visible |= this.f49033e0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public float mo57432t0() {
        if (m67897U2() || m67896T2()) {
            return this.f49045q0 + m67903h1() + this.f49046r0;
        }
        return 0.0f;
    }

    /* renamed from: t1 */
    public boolean mo57433t1() {
        return this.f49016T0;
    }

    /* renamed from: t2 */
    public void mo57434t2(@Nullable ColorStateList colorStateList) {
        if (this.f49035g0 != colorStateList) {
            this.f49035g0 = colorStateList;
            if (m67898V2()) {
                DrawableCompat.setTintList(this.f49033e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: u2 */
    public void mo57435u2(@ColorRes int i) {
        mo57434t2(AppCompatResources.getColorStateList(this.f49052x0, i));
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public boolean mo57437v1() {
        return this.f49038j0;
    }

    /* renamed from: v2 */
    public void mo57438v2(boolean z) {
        if (this.f49032d0 != z) {
            boolean V2 = m67898V2();
            this.f49032d0 = z;
            boolean V22 = m67898V2();
            if (V2 != V22) {
                if (V22) {
                    m67905r0(this.f49033e0);
                } else {
                    m67899W2(this.f49033e0);
                }
                invalidateSelf();
                mo57329C1();
            }
        }
    }

    /* renamed from: w1 */
    public boolean mo57439w1() {
        return m67915z1(this.f49033e0);
    }

    /* renamed from: w2 */
    public void mo57440w2(@Nullable Delegate delegate) {
        this.f49020V0 = new WeakReference<>(delegate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public float mo57441x0() {
        if (m67898V2()) {
            return this.f49049u0 + this.f49036h0 + this.f49050v0;
        }
        return 0.0f;
    }

    /* renamed from: x1 */
    public boolean mo57442x1() {
        return this.f49032d0;
    }

    /* renamed from: x2 */
    public void mo57443x2(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f49022W0 = truncateAt;
    }

    /* renamed from: y2 */
    public void mo57444y2(@Nullable MotionSpec motionSpec) {
        this.f49043o0 = motionSpec;
    }

    /* renamed from: z2 */
    public void mo57445z2(@AnimatorRes int i) {
        mo57444y2(MotionSpec.m67236d(this.f49052x0, i));
    }
}
