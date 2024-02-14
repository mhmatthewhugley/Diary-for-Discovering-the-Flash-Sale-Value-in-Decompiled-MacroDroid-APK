package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {

    /* renamed from: O */
    private static final String f49983O = MaterialShapeDrawable.class.getSimpleName();

    /* renamed from: P */
    private static final Paint f49984P;

    /* renamed from: A */
    private final RectF f49985A;

    /* renamed from: B */
    private final Region f49986B;

    /* renamed from: C */
    private final Region f49987C;

    /* renamed from: D */
    private ShapeAppearanceModel f49988D;

    /* renamed from: E */
    private final Paint f49989E;

    /* renamed from: F */
    private final Paint f49990F;

    /* renamed from: G */
    private final ShadowRenderer f49991G;
    @NonNull

    /* renamed from: H */
    private final ShapeAppearancePathProvider.PathListener f49992H;

    /* renamed from: I */
    private final ShapeAppearancePathProvider f49993I;
    @Nullable

    /* renamed from: J */
    private PorterDuffColorFilter f49994J;
    @Nullable

    /* renamed from: K */
    private PorterDuffColorFilter f49995K;

    /* renamed from: L */
    private int f49996L;
    @NonNull

    /* renamed from: M */
    private final RectF f49997M;

    /* renamed from: N */
    private boolean f49998N;

    /* renamed from: a */
    private MaterialShapeDrawableState f49999a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ShapePath.ShadowCompatOperation[] f50000c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ShapePath.ShadowCompatOperation[] f50001d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BitSet f50002f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f50003g;

    /* renamed from: o */
    private final Matrix f50004o;

    /* renamed from: p */
    private final Path f50005p;

    /* renamed from: s */
    private final Path f50006s;

    /* renamed from: z */
    private final RectF f50007z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    static {
        Paint paint = new Paint(1);
        f49984P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: F */
    private float m69179F() {
        if (m69182O()) {
            return this.f49990F.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: M */
    private boolean m69180M() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        int i = materialShapeDrawableState.f50027q;
        if (i == 1 || materialShapeDrawableState.f50028r <= 0 || (i != 2 && !mo58652W())) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m69181N() {
        Paint.Style style = this.f49999a.f50032v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: O */
    private boolean m69182O() {
        Paint.Style style = this.f49999a.f50032v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f49990F.getStrokeWidth() > 0.0f;
    }

    /* renamed from: Q */
    private void m69183Q() {
        super.invalidateSelf();
    }

    /* renamed from: T */
    private void m69184T(@NonNull Canvas canvas) {
        if (m69180M()) {
            canvas.save();
            m69186V(canvas);
            if (!this.f49998N) {
                m69197n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f49997M.width() - ((float) getBounds().width()));
            int height = (int) (this.f49997M.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f49997M.width()) + (this.f49999a.f50028r * 2) + width, ((int) this.f49997M.height()) + (this.f49999a.f50028r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f49999a.f50028r) - width);
            float f2 = (float) ((getBounds().top - this.f49999a.f50028r) - height);
            canvas2.translate(-f, -f2);
            m69197n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: U */
    private static int m69185U(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: V */
    private void m69186V(@NonNull Canvas canvas) {
        canvas.translate((float) mo58639B(), (float) mo58640C());
    }

    @Nullable
    /* renamed from: f */
    private PorterDuffColorFilter m69191f(@NonNull Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = mo58672l(color);
        this.f49996L = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: g */
    private void m69192g(@NonNull RectF rectF, @NonNull Path path) {
        mo58666h(rectF, path);
        if (this.f49999a.f50020j != 1.0f) {
            this.f50004o.reset();
            Matrix matrix = this.f50004o;
            float f = this.f49999a.f50020j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f50004o);
        }
        path.computeBounds(this.f49997M, true);
    }

    /* renamed from: i */
    private void m69193i() {
        final float f = -m69179F();
        ShapeAppearanceModel y = getShapeAppearanceModel().mo58710y(new ShapeAppearanceModel.CornerSizeUnaryOperator() {
            @NonNull
            /* renamed from: a */
            public CornerSize mo58689a(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(f, cornerSize);
            }
        });
        this.f49988D = y;
        this.f49993I.mo58734d(y, this.f49999a.f50021k, m69203v(), this.f50006s);
    }

    @NonNull
    /* renamed from: j */
    private PorterDuffColorFilter m69194j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo58672l(colorForState);
        }
        this.f49996L = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    /* renamed from: k */
    private PorterDuffColorFilter m69195k(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m69191f(paint, z);
        }
        return m69194j(colorStateList, mode, z);
    }

    @NonNull
    /* renamed from: m */
    public static MaterialShapeDrawable m69196m(Context context, float f) {
        int c = MaterialColors.m68103c(context, C10462R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.mo58649P(context);
        materialShapeDrawable.mo58656a0(ColorStateList.valueOf(c));
        materialShapeDrawable.mo58655Z(f);
        return materialShapeDrawable;
    }

    /* renamed from: n */
    private void m69197n(@NonNull Canvas canvas) {
        if (this.f50002f.cardinality() > 0) {
            Log.w(f49983O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f49999a.f50029s != 0) {
            canvas.drawPath(this.f50005p, this.f49991G.mo58625c());
        }
        for (int i = 0; i < 4; i++) {
            this.f50000c[i].mo58750b(this.f49991G, this.f49999a.f50028r, canvas);
            this.f50001d[i].mo58750b(this.f49991G, this.f49999a.f50028r, canvas);
        }
        if (this.f49998N) {
            int B = mo58639B();
            int C = mo58640C();
            canvas.translate((float) (-B), (float) (-C));
            canvas.drawPath(this.f50005p, f49984P);
            canvas.translate((float) B, (float) C);
        }
    }

    /* renamed from: o */
    private void m69198o(@NonNull Canvas canvas) {
        m69201q(canvas, this.f49989E, this.f50005p, this.f49999a.f50011a, mo58682u());
    }

    /* renamed from: o0 */
    private boolean m69199o0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f49999a.f50014d == null || (color2 = this.f49989E.getColor()) == (colorForState2 = this.f49999a.f50014d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f49989E.setColor(colorForState2);
            z = true;
        }
        if (this.f49999a.f50015e == null || (color = this.f49990F.getColor()) == (colorForState = this.f49999a.f50015e.getColorForState(iArr, color))) {
            return z;
        }
        this.f49990F.setColor(colorForState);
        return true;
    }

    /* renamed from: p0 */
    private boolean m69200p0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f49994J;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f49995K;
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        this.f49994J = m69195k(materialShapeDrawableState.f50017g, materialShapeDrawableState.f50018h, this.f49989E, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f49999a;
        this.f49995K = m69195k(materialShapeDrawableState2.f50016f, materialShapeDrawableState2.f50018h, this.f49990F, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f49999a;
        if (materialShapeDrawableState3.f50031u) {
            this.f49991G.mo58626d(materialShapeDrawableState3.f50017g.getColorForState(getState(), 0));
        }
        if (!ObjectsCompat.equals(porterDuffColorFilter, this.f49994J) || !ObjectsCompat.equals(porterDuffColorFilter2, this.f49995K)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private void m69201q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
        if (shapeAppearanceModel.mo58706u(rectF)) {
            float a = shapeAppearanceModel.mo58705t().mo58627a(rectF) * this.f49999a.f50021k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: q0 */
    private void m69202q0() {
        float L = mo58648L();
        this.f49999a.f50028r = (int) Math.ceil((double) (0.75f * L));
        this.f49999a.f50029s = (int) Math.ceil((double) (L * 0.25f));
        m69200p0();
        m69183Q();
    }

    @NonNull
    /* renamed from: v */
    private RectF m69203v() {
        this.f49985A.set(mo58682u());
        float F = m69179F();
        this.f49985A.inset(F, F);
        return this.f49985A;
    }

    @ColorInt
    /* renamed from: A */
    public int mo58638A() {
        return this.f49996L;
    }

    /* renamed from: B */
    public int mo58639B() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        return (int) (((double) materialShapeDrawableState.f50029s) * Math.sin(Math.toRadians((double) materialShapeDrawableState.f50030t)));
    }

    /* renamed from: C */
    public int mo58640C() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        return (int) (((double) materialShapeDrawableState.f50029s) * Math.cos(Math.toRadians((double) materialShapeDrawableState.f50030t)));
    }

    /* renamed from: D */
    public int mo58641D() {
        return this.f49999a.f50028r;
    }

    @Nullable
    /* renamed from: E */
    public ColorStateList mo58642E() {
        return this.f49999a.f50015e;
    }

    /* renamed from: G */
    public float mo58643G() {
        return this.f49999a.f50022l;
    }

    @Nullable
    /* renamed from: H */
    public ColorStateList mo58644H() {
        return this.f49999a.f50017g;
    }

    /* renamed from: I */
    public float mo58645I() {
        return this.f49999a.f50011a.mo58703r().mo58627a(mo58682u());
    }

    /* renamed from: J */
    public float mo58646J() {
        return this.f49999a.f50011a.mo58705t().mo58627a(mo58682u());
    }

    /* renamed from: K */
    public float mo58647K() {
        return this.f49999a.f50026p;
    }

    /* renamed from: L */
    public float mo58648L() {
        return mo58683w() + mo58647K();
    }

    /* renamed from: P */
    public void mo58649P(Context context) {
        this.f49999a.f50012b = new ElevationOverlayProvider(context);
        m69202q0();
    }

    /* renamed from: R */
    public boolean mo58650R() {
        ElevationOverlayProvider elevationOverlayProvider = this.f49999a.f50012b;
        return elevationOverlayProvider != null && elevationOverlayProvider.mo57762e();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: S */
    public boolean mo58651S() {
        return this.f49999a.f50011a.mo58706u(mo58682u());
    }

    /* renamed from: W */
    public boolean mo58652W() {
        return !mo58651S() && !this.f50005p.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: X */
    public void mo58653X(float f) {
        setShapeAppearanceModel(this.f49999a.f50011a.mo58708w(f));
    }

    /* renamed from: Y */
    public void mo58654Y(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.f49999a.f50011a.mo58709x(cornerSize));
    }

    /* renamed from: Z */
    public void mo58655Z(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50025o != f) {
            materialShapeDrawableState.f50025o = f;
            m69202q0();
        }
    }

    /* renamed from: a0 */
    public void mo58656a0(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50014d != colorStateList) {
            materialShapeDrawableState.f50014d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo58657b0(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50021k != f) {
            materialShapeDrawableState.f50021k = f;
            this.f50003g = true;
            invalidateSelf();
        }
    }

    /* renamed from: c0 */
    public void mo58658c0(int i, int i2, int i3, int i4) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50019i == null) {
            materialShapeDrawableState.f50019i = new Rect();
        }
        this.f49999a.f50019i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: d0 */
    public void mo58659d0(Paint.Style style) {
        this.f49999a.f50032v = style;
        m69183Q();
    }

    public void draw(@NonNull Canvas canvas) {
        this.f49989E.setColorFilter(this.f49994J);
        int alpha = this.f49989E.getAlpha();
        this.f49989E.setAlpha(m69185U(alpha, this.f49999a.f50023m));
        this.f49990F.setColorFilter(this.f49995K);
        this.f49990F.setStrokeWidth(this.f49999a.f50022l);
        int alpha2 = this.f49990F.getAlpha();
        this.f49990F.setAlpha(m69185U(alpha2, this.f49999a.f50023m));
        if (this.f50003g) {
            m69193i();
            m69192g(mo58682u(), this.f50005p);
            this.f50003g = false;
        }
        m69184T(canvas);
        if (m69181N()) {
            m69198o(canvas);
        }
        if (m69182O()) {
            mo58679r(canvas);
        }
        this.f49989E.setAlpha(alpha);
        this.f49990F.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo58660e0(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50024n != f) {
            materialShapeDrawableState.f50024n = f;
            m69202q0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f0 */
    public void mo58661f0(boolean z) {
        this.f49998N = z;
    }

    /* renamed from: g0 */
    public void mo58662g0(int i) {
        this.f49991G.mo58626d(i);
        this.f49999a.f50031u = false;
        m69183Q();
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f49999a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(@NonNull Outline outline) {
        if (this.f49999a.f50027q != 2) {
            if (mo58651S()) {
                outline.setRoundRect(getBounds(), mo58645I() * this.f49999a.f50021k);
                return;
            }
            m69192g(mo58682u(), this.f50005p);
            if (this.f50005p.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f50005p);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f49999a.f50019i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49999a.f50011a;
    }

    public Region getTransparentRegion() {
        this.f49986B.set(getBounds());
        m69192g(mo58682u(), this.f50005p);
        this.f49987C.setPath(this.f50005p, this.f49986B);
        this.f49986B.op(this.f49987C, Region.Op.DIFFERENCE);
        return this.f49986B;
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public final void mo58666h(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f49993I;
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawableState.f50011a;
        float f = materialShapeDrawableState.f50021k;
        shapeAppearancePathProvider.mo58735e(shapeAppearanceModel, f, rectF, this.f49992H, path);
    }

    /* renamed from: h0 */
    public void mo58667h0(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50030t != i) {
            materialShapeDrawableState.f50030t = i;
            m69183Q();
        }
    }

    /* renamed from: i0 */
    public void mo58668i0(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50027q != i) {
            materialShapeDrawableState.f50027q = i;
            m69183Q();
        }
    }

    public void invalidateSelf() {
        this.f50003g = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f49999a.f50015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f49999a.f50014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f49999a.f50017g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f49999a.f50016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.f49999a
            android.content.res.ColorStateList r0 = r0.f50017g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.f49999a
            android.content.res.ColorStateList r0 = r0.f50016f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.f49999a
            android.content.res.ColorStateList r0 = r0.f50015e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r0 = r1.f49999a
            android.content.res.ColorStateList r0 = r0.f50014d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.MaterialShapeDrawable.isStateful():boolean");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j0 */
    public void mo58670j0(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50029s != i) {
            materialShapeDrawableState.f50029s = i;
            m69183Q();
        }
    }

    /* renamed from: k0 */
    public void mo58671k0(float f, @ColorInt int i) {
        mo58676n0(f);
        mo58674m0(ColorStateList.valueOf(i));
    }

    /* access modifiers changed from: protected */
    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public int mo58672l(@ColorInt int i) {
        float L = mo58648L() + mo58686z();
        ElevationOverlayProvider elevationOverlayProvider = this.f49999a.f50012b;
        return elevationOverlayProvider != null ? elevationOverlayProvider.mo57760c(i, L) : i;
    }

    /* renamed from: l0 */
    public void mo58673l0(float f, @Nullable ColorStateList colorStateList) {
        mo58676n0(f);
        mo58674m0(colorStateList);
    }

    /* renamed from: m0 */
    public void mo58674m0(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50015e != colorStateList) {
            materialShapeDrawableState.f50015e = colorStateList;
            onStateChange(getState());
        }
    }

    @NonNull
    public Drawable mutate() {
        this.f49999a = new MaterialShapeDrawableState(this.f49999a);
        return this;
    }

    /* renamed from: n0 */
    public void mo58676n0(float f) {
        this.f49999a.f50022l = f;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f50003g = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m69199o0(iArr) || m69200p0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public void mo58678p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        m69201q(canvas, paint, path, this.f49999a.f50011a, rectF);
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo58679r(@NonNull Canvas canvas) {
        m69201q(canvas, this.f49990F, this.f50006s, this.f49988D, m69203v());
    }

    /* renamed from: s */
    public float mo58680s() {
        return this.f49999a.f50011a.mo58696j().mo58627a(mo58682u());
    }

    public void setAlpha(@IntRange(from = 0, mo610to = 255) int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50023m != i) {
            materialShapeDrawableState.f50023m = i;
            m69183Q();
        }
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f49999a.f50013c = colorFilter;
        m69183Q();
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f49999a.f50011a = shapeAppearanceModel;
        invalidateSelf();
    }

    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f49999a.f50017g = colorStateList;
        m69200p0();
        m69183Q();
    }

    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f49999a;
        if (materialShapeDrawableState.f50018h != mode) {
            materialShapeDrawableState.f50018h = mode;
            m69200p0();
            m69183Q();
        }
    }

    /* renamed from: t */
    public float mo58681t() {
        return this.f49999a.f50011a.mo58698l().mo58627a(mo58682u());
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: u */
    public RectF mo58682u() {
        this.f50007z.set(getBounds());
        return this.f50007z;
    }

    /* renamed from: w */
    public float mo58683w() {
        return this.f49999a.f50025o;
    }

    @Nullable
    /* renamed from: x */
    public ColorStateList mo58684x() {
        return this.f49999a.f50014d;
    }

    /* renamed from: y */
    public float mo58685y() {
        return this.f49999a.f50021k;
    }

    /* renamed from: z */
    public float mo58686z() {
        return this.f49999a.f50024n;
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(ShapeAppearanceModel.m69264e(context, attributeSet, i, i2).mo58721m());
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, (ElevationOverlayProvider) null));
    }

    private MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        this.f50000c = new ShapePath.ShadowCompatOperation[4];
        this.f50001d = new ShapePath.ShadowCompatOperation[4];
        this.f50002f = new BitSet(8);
        this.f50004o = new Matrix();
        this.f50005p = new Path();
        this.f50006s = new Path();
        this.f50007z = new RectF();
        this.f49985A = new RectF();
        this.f49986B = new Region();
        this.f49987C = new Region();
        Paint paint = new Paint(1);
        this.f49989E = paint;
        Paint paint2 = new Paint(1);
        this.f49990F = paint2;
        this.f49991G = new ShadowRenderer();
        this.f49993I = Looper.getMainLooper().getThread() == Thread.currentThread() ? ShapeAppearancePathProvider.m69330k() : new ShapeAppearancePathProvider();
        this.f49997M = new RectF();
        this.f49998N = true;
        this.f49999a = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m69200p0();
        m69199o0(getState());
        this.f49992H = new ShapeAppearancePathProvider.PathListener() {
            /* renamed from: a */
            public void mo58687a(@NonNull ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f50002f.set(i, shapePath.mo58738e());
                MaterialShapeDrawable.this.f50000c[i] = shapePath.mo58739f(matrix);
            }

            /* renamed from: b */
            public void mo58688b(@NonNull ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable.this.f50002f.set(i + 4, shapePath.mo58738e());
                MaterialShapeDrawable.this.f50001d[i] = shapePath.mo58739f(matrix);
            }
        };
    }

    static final class MaterialShapeDrawableState extends Drawable.ConstantState {
        @NonNull

        /* renamed from: a */
        public ShapeAppearanceModel f50011a;
        @Nullable

        /* renamed from: b */
        public ElevationOverlayProvider f50012b;
        @Nullable

        /* renamed from: c */
        public ColorFilter f50013c;
        @Nullable

        /* renamed from: d */
        public ColorStateList f50014d = null;
        @Nullable

        /* renamed from: e */
        public ColorStateList f50015e = null;
        @Nullable

        /* renamed from: f */
        public ColorStateList f50016f = null;
        @Nullable

        /* renamed from: g */
        public ColorStateList f50017g = null;
        @Nullable

        /* renamed from: h */
        public PorterDuff.Mode f50018h = PorterDuff.Mode.SRC_IN;
        @Nullable

        /* renamed from: i */
        public Rect f50019i = null;

        /* renamed from: j */
        public float f50020j = 1.0f;

        /* renamed from: k */
        public float f50021k = 1.0f;

        /* renamed from: l */
        public float f50022l;

        /* renamed from: m */
        public int f50023m = 255;

        /* renamed from: n */
        public float f50024n = 0.0f;

        /* renamed from: o */
        public float f50025o = 0.0f;

        /* renamed from: p */
        public float f50026p = 0.0f;

        /* renamed from: q */
        public int f50027q = 0;

        /* renamed from: r */
        public int f50028r = 0;

        /* renamed from: s */
        public int f50029s = 0;

        /* renamed from: t */
        public int f50030t = 0;

        /* renamed from: u */
        public boolean f50031u = false;

        /* renamed from: v */
        public Paint.Style f50032v = Paint.Style.FILL_AND_STROKE;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
            this.f50011a = shapeAppearanceModel;
            this.f50012b = elevationOverlayProvider;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            boolean unused = materialShapeDrawable.f50003g = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.f50011a = materialShapeDrawableState.f50011a;
            this.f50012b = materialShapeDrawableState.f50012b;
            this.f50022l = materialShapeDrawableState.f50022l;
            this.f50013c = materialShapeDrawableState.f50013c;
            this.f50014d = materialShapeDrawableState.f50014d;
            this.f50015e = materialShapeDrawableState.f50015e;
            this.f50018h = materialShapeDrawableState.f50018h;
            this.f50017g = materialShapeDrawableState.f50017g;
            this.f50023m = materialShapeDrawableState.f50023m;
            this.f50020j = materialShapeDrawableState.f50020j;
            this.f50029s = materialShapeDrawableState.f50029s;
            this.f50027q = materialShapeDrawableState.f50027q;
            this.f50031u = materialShapeDrawableState.f50031u;
            this.f50021k = materialShapeDrawableState.f50021k;
            this.f50024n = materialShapeDrawableState.f50024n;
            this.f50025o = materialShapeDrawableState.f50025o;
            this.f50026p = materialShapeDrawableState.f50026p;
            this.f50028r = materialShapeDrawableState.f50028r;
            this.f50030t = materialShapeDrawableState.f50030t;
            this.f50016f = materialShapeDrawableState.f50016f;
            this.f50032v = materialShapeDrawableState.f50032v;
            if (materialShapeDrawableState.f50019i != null) {
                this.f50019i = new Rect(materialShapeDrawableState.f50019i);
            }
        }
    }
}
