package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {

    /* renamed from: l0 */
    private static final boolean f49496l0 = false;
    @NonNull

    /* renamed from: m0 */
    private static final Paint f49497m0 = null;

    /* renamed from: A */
    private CancelableFontCallback f49498A;

    /* renamed from: B */
    private CancelableFontCallback f49499B;
    @Nullable

    /* renamed from: C */
    private CharSequence f49500C;
    @Nullable

    /* renamed from: D */
    private CharSequence f49501D;

    /* renamed from: E */
    private boolean f49502E;

    /* renamed from: F */
    private boolean f49503F = true;

    /* renamed from: G */
    private boolean f49504G;
    @Nullable

    /* renamed from: H */
    private Bitmap f49505H;

    /* renamed from: I */
    private Paint f49506I;

    /* renamed from: J */
    private float f49507J;

    /* renamed from: K */
    private float f49508K;

    /* renamed from: L */
    private int[] f49509L;

    /* renamed from: M */
    private boolean f49510M;
    @NonNull

    /* renamed from: N */
    private final TextPaint f49511N;
    @NonNull

    /* renamed from: O */
    private final TextPaint f49512O;

    /* renamed from: P */
    private TimeInterpolator f49513P;

    /* renamed from: Q */
    private TimeInterpolator f49514Q;

    /* renamed from: R */
    private float f49515R;

    /* renamed from: S */
    private float f49516S;

    /* renamed from: T */
    private float f49517T;

    /* renamed from: U */
    private ColorStateList f49518U;

    /* renamed from: V */
    private float f49519V;

    /* renamed from: W */
    private float f49520W;

    /* renamed from: X */
    private float f49521X;

    /* renamed from: Y */
    private ColorStateList f49522Y;

    /* renamed from: Z */
    private float f49523Z;

    /* renamed from: a */
    private final View f49524a;

    /* renamed from: a0 */
    private float f49525a0;

    /* renamed from: b */
    private boolean f49526b;

    /* renamed from: b0 */
    private StaticLayout f49527b0;

    /* renamed from: c */
    private float f49528c;

    /* renamed from: c0 */
    private float f49529c0;

    /* renamed from: d */
    private boolean f49530d;

    /* renamed from: d0 */
    private float f49531d0;

    /* renamed from: e */
    private float f49532e;

    /* renamed from: e0 */
    private float f49533e0;

    /* renamed from: f */
    private float f49534f;

    /* renamed from: f0 */
    private float f49535f0;

    /* renamed from: g */
    private int f49536g;

    /* renamed from: g0 */
    private CharSequence f49537g0;
    @NonNull

    /* renamed from: h */
    private final Rect f49538h;

    /* renamed from: h0 */
    private int f49539h0 = 1;
    @NonNull

    /* renamed from: i */
    private final Rect f49540i;

    /* renamed from: i0 */
    private float f49541i0 = 0.0f;
    @NonNull

    /* renamed from: j */
    private final RectF f49542j;

    /* renamed from: j0 */
    private float f49543j0 = 1.0f;

    /* renamed from: k */
    private int f49544k = 16;

    /* renamed from: k0 */
    private int f49545k0 = StaticLayoutBuilderCompat.f49638n;

    /* renamed from: l */
    private int f49546l = 16;

    /* renamed from: m */
    private float f49547m = 15.0f;

    /* renamed from: n */
    private float f49548n = 15.0f;

    /* renamed from: o */
    private ColorStateList f49549o;

    /* renamed from: p */
    private ColorStateList f49550p;

    /* renamed from: q */
    private int f49551q;

    /* renamed from: r */
    private float f49552r;

    /* renamed from: s */
    private float f49553s;

    /* renamed from: t */
    private float f49554t;

    /* renamed from: u */
    private float f49555u;

    /* renamed from: v */
    private float f49556v;

    /* renamed from: w */
    private float f49557w;

    /* renamed from: x */
    private Typeface f49558x;

    /* renamed from: y */
    private Typeface f49559y;

    /* renamed from: z */
    private Typeface f49560z;

    public CollapsingTextHelper(View view) {
        this.f49524a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f49511N = textPaint;
        this.f49512O = new TextPaint(textPaint);
        this.f49540i = new Rect();
        this.f49538h = new Rect();
        this.f49542j = new RectF();
        this.f49534f = m68640e();
    }

    /* renamed from: E0 */
    private boolean m68626E0() {
        return this.f49539h0 > 1 && (!this.f49502E || this.f49530d) && !this.f49504G;
    }

    /* renamed from: M */
    private void m68627M(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f49548n);
        textPaint.setTypeface(this.f49558x);
        textPaint.setLetterSpacing(this.f49523Z);
    }

    /* renamed from: N */
    private void m68628N(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f49547m);
        textPaint.setTypeface(this.f49559y);
        textPaint.setLetterSpacing(this.f49525a0);
    }

    /* renamed from: O */
    private void m68629O(float f) {
        if (this.f49530d) {
            this.f49542j.set(f < this.f49534f ? this.f49538h : this.f49540i);
            return;
        }
        this.f49542j.left = m68633T((float) this.f49538h.left, (float) this.f49540i.left, f, this.f49513P);
        this.f49542j.top = m68633T(this.f49552r, this.f49553s, f, this.f49513P);
        this.f49542j.right = m68633T((float) this.f49538h.right, (float) this.f49540i.right, f, this.f49513P);
        this.f49542j.bottom = m68633T((float) this.f49538h.bottom, (float) this.f49540i.bottom, f, this.f49513P);
    }

    /* renamed from: P */
    private static boolean m68630P(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: Q */
    private boolean m68631Q() {
        return ViewCompat.getLayoutDirection(this.f49524a) == 1;
    }

    /* renamed from: S */
    private boolean m68632S(@NonNull CharSequence charSequence, boolean z) {
        return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: T */
    private static float m68633T(float f, float f2, float f3, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.m67220a(f, f2, f3);
    }

    /* renamed from: X */
    private static boolean m68634X(@NonNull Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    private static int m68635a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: b */
    private void m68636b(boolean z) {
        StaticLayout staticLayout;
        float f = this.f49508K;
        m68645i(this.f49548n, z);
        CharSequence charSequence = this.f49501D;
        if (!(charSequence == null || (staticLayout = this.f49527b0) == null)) {
            this.f49537g0 = TextUtils.ellipsize(charSequence, this.f49511N, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        float f2 = 0.0f;
        if (this.f49537g0 != null) {
            TextPaint textPaint = new TextPaint(this.f49511N);
            textPaint.setLetterSpacing(this.f49523Z);
            CharSequence charSequence2 = this.f49537g0;
            this.f49529c0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f49529c0 = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f49546l, this.f49502E ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f49553s = (float) this.f49540i.top;
        } else if (i != 80) {
            this.f49553s = ((float) this.f49540i.centerY()) - ((this.f49511N.descent() - this.f49511N.ascent()) / 2.0f);
        } else {
            this.f49553s = ((float) this.f49540i.bottom) + this.f49511N.ascent();
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.f49555u = ((float) this.f49540i.centerX()) - (this.f49529c0 / 2.0f);
        } else if (i2 != 5) {
            this.f49555u = (float) this.f49540i.left;
        } else {
            this.f49555u = ((float) this.f49540i.right) - this.f49529c0;
        }
        m68645i(this.f49547m, z);
        StaticLayout staticLayout2 = this.f49527b0;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f49527b0;
        this.f49551q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        CharSequence charSequence3 = this.f49501D;
        float measureText = charSequence3 != null ? this.f49511N.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout4 = this.f49527b0;
        if (staticLayout4 != null && this.f49539h0 > 1) {
            measureText = (float) staticLayout4.getWidth();
        }
        StaticLayout staticLayout5 = this.f49527b0;
        if (staticLayout5 != null) {
            f2 = this.f49539h0 > 1 ? (float) staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0);
        }
        this.f49535f0 = f2;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f49544k, this.f49502E ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f49552r = (float) this.f49538h.top;
        } else if (i3 != 80) {
            this.f49552r = ((float) this.f49538h.centerY()) - (height / 2.0f);
        } else {
            this.f49552r = (((float) this.f49538h.bottom) - height) + this.f49511N.descent();
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.f49554t = ((float) this.f49538h.centerX()) - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f49554t = (float) this.f49538h.left;
        } else {
            this.f49554t = ((float) this.f49538h.right) - measureText;
        }
        m68646j();
        m68654u0(f);
    }

    /* renamed from: b0 */
    private void m68637b0(float f) {
        this.f49531d0 = f;
        ViewCompat.postInvalidateOnAnimation(this.f49524a);
    }

    /* renamed from: c */
    private void m68638c() {
        m68643g(this.f49528c);
    }

    /* renamed from: d */
    private float m68639d(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        float f2 = this.f49534f;
        if (f <= f2) {
            return AnimationUtils.m67221b(1.0f, 0.0f, this.f49532e, f2, f);
        }
        return AnimationUtils.m67221b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    private float m68640e() {
        float f = this.f49532e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: f */
    private boolean m68641f(@NonNull CharSequence charSequence) {
        boolean Q = m68631Q();
        return this.f49503F ? m68632S(charSequence, Q) : Q;
    }

    /* renamed from: f0 */
    private boolean m68642f0(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f49499B;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.mo58598c();
        }
        if (this.f49558x == typeface) {
            return false;
        }
        this.f49558x = typeface;
        return true;
    }

    /* renamed from: g */
    private void m68643g(float f) {
        float f2;
        m68629O(f);
        if (!this.f49530d) {
            this.f49556v = m68633T(this.f49554t, this.f49555u, f, this.f49513P);
            this.f49557w = m68633T(this.f49552r, this.f49553s, f, this.f49513P);
            m68654u0(m68633T(this.f49547m, this.f49548n, f, this.f49514Q));
            f2 = f;
        } else if (f < this.f49534f) {
            this.f49556v = this.f49554t;
            this.f49557w = this.f49552r;
            m68654u0(this.f49547m);
            f2 = 0.0f;
        } else {
            this.f49556v = this.f49555u;
            this.f49557w = this.f49553s - ((float) Math.max(0, this.f49536g));
            m68654u0(this.f49548n);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.f48522b;
        m68637b0(1.0f - m68633T(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m68648k0(m68633T(1.0f, 0.0f, f, timeInterpolator));
        if (this.f49550p != this.f49549o) {
            this.f49511N.setColor(m68635a(m68656x(), mo58092v(), f2));
        } else {
            this.f49511N.setColor(mo58092v());
        }
        float f3 = this.f49523Z;
        float f4 = this.f49525a0;
        if (f3 != f4) {
            this.f49511N.setLetterSpacing(m68633T(f4, f3, f, timeInterpolator));
        } else {
            this.f49511N.setLetterSpacing(f3);
        }
        this.f49511N.setShadowLayer(m68633T(this.f49519V, this.f49515R, f, (TimeInterpolator) null), m68633T(this.f49520W, this.f49516S, f, (TimeInterpolator) null), m68633T(this.f49521X, this.f49517T, f, (TimeInterpolator) null), m68635a(m68655w(this.f49522Y), m68655w(this.f49518U), f));
        if (this.f49530d) {
            int alpha = this.f49511N.getAlpha();
            this.f49511N.setAlpha((int) (m68639d(f) * ((float) alpha)));
        }
        ViewCompat.postInvalidateOnAnimation(this.f49524a);
    }

    /* renamed from: h */
    private void m68644h(float f) {
        m68645i(f, false);
    }

    /* renamed from: i */
    private void m68645i(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.f49500C != null) {
            float width = (float) this.f49540i.width();
            float width2 = (float) this.f49538h.width();
            boolean z4 = false;
            int i = 1;
            if (m68630P(f, this.f49548n)) {
                f2 = this.f49548n;
                this.f49507J = 1.0f;
                Typeface typeface = this.f49560z;
                Typeface typeface2 = this.f49558x;
                if (typeface != typeface2) {
                    this.f49560z = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f49547m;
                Typeface typeface3 = this.f49560z;
                Typeface typeface4 = this.f49559y;
                if (typeface3 != typeface4) {
                    this.f49560z = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (m68630P(f, f3)) {
                    this.f49507J = 1.0f;
                } else {
                    this.f49507J = f / this.f49547m;
                }
                float f4 = this.f49548n / this.f49547m;
                float f5 = width2 * f4;
                if (!z && f5 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
                f2 = f3;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.f49508K != f2 || this.f49510M || z2;
                this.f49508K = f2;
                this.f49510M = false;
            }
            if (this.f49501D == null || z2) {
                this.f49511N.setTextSize(this.f49508K);
                this.f49511N.setTypeface(this.f49560z);
                TextPaint textPaint = this.f49511N;
                if (this.f49507J != 1.0f) {
                    z4 = true;
                }
                textPaint.setLinearText(z4);
                this.f49502E = m68641f(this.f49500C);
                if (m68626E0()) {
                    i = this.f49539h0;
                }
                StaticLayout k = m68647k(i, width, this.f49502E);
                this.f49527b0 = k;
                this.f49501D = k.getText();
            }
        }
    }

    /* renamed from: j */
    private void m68646j() {
        Bitmap bitmap = this.f49505H;
        if (bitmap != null) {
            bitmap.recycle();
            this.f49505H = null;
        }
    }

    /* renamed from: k */
    private StaticLayout m68647k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = StaticLayoutBuilderCompat.m68793c(this.f49500C, this.f49511N, (int) f).mo58211e(TextUtils.TruncateAt.END).mo58214h(z).mo58210d(Layout.Alignment.ALIGN_NORMAL).mo58213g(false).mo58216j(i).mo58215i(this.f49541i0, this.f49543j0).mo58212f(this.f49545k0).mo58209a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayout);
    }

    /* renamed from: k0 */
    private void m68648k0(float f) {
        this.f49533e0 = f;
        ViewCompat.postInvalidateOnAnimation(this.f49524a);
    }

    /* renamed from: m */
    private void m68649m(@NonNull Canvas canvas, float f, float f2) {
        int alpha = this.f49511N.getAlpha();
        canvas.translate(f, f2);
        float f3 = (float) alpha;
        this.f49511N.setAlpha((int) (this.f49533e0 * f3));
        this.f49527b0.draw(canvas);
        this.f49511N.setAlpha((int) (this.f49531d0 * f3));
        int lineBaseline = this.f49527b0.getLineBaseline(0);
        CharSequence charSequence = this.f49537g0;
        float f4 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f49511N);
        if (!this.f49530d) {
            String trim = this.f49537g0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f49511N.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f49527b0.getLineEnd(0), str.length()), 0.0f, f4, this.f49511N);
        }
    }

    /* renamed from: n */
    private void m68650n() {
        if (this.f49505H == null && !this.f49538h.isEmpty() && !TextUtils.isEmpty(this.f49501D)) {
            m68643g(0.0f);
            int width = this.f49527b0.getWidth();
            int height = this.f49527b0.getHeight();
            if (width > 0 && height > 0) {
                this.f49505H = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f49527b0.draw(new Canvas(this.f49505H));
                if (this.f49506I == null) {
                    this.f49506I = new Paint(3);
                }
            }
        }
    }

    /* renamed from: p0 */
    private boolean m68651p0(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f49498A;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.mo58598c();
        }
        if (this.f49559y == typeface) {
            return false;
        }
        this.f49559y = typeface;
        return true;
    }

    /* renamed from: s */
    private float m68652s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (this.f49529c0 / 2.0f);
        }
        return ((i2 & GravityCompat.END) == 8388613 || (i2 & 5) == 5) ? this.f49502E ? (float) this.f49540i.left : ((float) this.f49540i.right) - this.f49529c0 : this.f49502E ? ((float) this.f49540i.right) - this.f49529c0 : (float) this.f49540i.left;
    }

    /* renamed from: t */
    private float m68653t(@NonNull RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (this.f49529c0 / 2.0f);
        }
        return ((i2 & GravityCompat.END) == 8388613 || (i2 & 5) == 5) ? this.f49502E ? rectF.left + this.f49529c0 : (float) this.f49540i.right : this.f49502E ? (float) this.f49540i.right : rectF.left + this.f49529c0;
    }

    /* renamed from: u0 */
    private void m68654u0(float f) {
        m68644h(f);
        boolean z = f49496l0 && this.f49507J != 1.0f;
        this.f49504G = z;
        if (z) {
            m68650n();
        }
        ViewCompat.postInvalidateOnAnimation(this.f49524a);
    }

    @ColorInt
    /* renamed from: w */
    private int m68655w(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f49509L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    @ColorInt
    /* renamed from: x */
    private int m68656x() {
        return m68655w(this.f49549o);
    }

    /* renamed from: A */
    public int mo58048A() {
        return this.f49544k;
    }

    /* renamed from: A0 */
    public final boolean mo58049A0(int[] iArr) {
        this.f49509L = iArr;
        if (!mo58064R()) {
            return false;
        }
        mo58066V();
        return true;
    }

    /* renamed from: B */
    public float mo58050B() {
        m68628N(this.f49512O);
        return -this.f49512O.ascent();
    }

    /* renamed from: B0 */
    public void mo58051B0(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f49500C, charSequence)) {
            this.f49500C = charSequence;
            this.f49501D = null;
            m68646j();
            mo58066V();
        }
    }

    /* renamed from: C */
    public Typeface mo58052C() {
        Typeface typeface = this.f49559y;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void mo58053C0(TimeInterpolator timeInterpolator) {
        this.f49514Q = timeInterpolator;
        mo58066V();
    }

    /* renamed from: D */
    public float mo58054D() {
        return this.f49528c;
    }

    /* renamed from: D0 */
    public void mo58055D0(Typeface typeface) {
        boolean f0 = m68642f0(typeface);
        boolean p0 = m68651p0(typeface);
        if (f0 || p0) {
            mo58066V();
        }
    }

    /* renamed from: E */
    public float mo58056E() {
        return this.f49534f;
    }

    @RequiresApi(23)
    /* renamed from: F */
    public int mo58057F() {
        return this.f49545k0;
    }

    /* renamed from: G */
    public int mo58058G() {
        StaticLayout staticLayout = this.f49527b0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    /* renamed from: H */
    public float mo58059H() {
        return this.f49527b0.getSpacingAdd();
    }

    @RequiresApi(23)
    /* renamed from: I */
    public float mo58060I() {
        return this.f49527b0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int mo58061J() {
        return this.f49539h0;
    }

    @Nullable
    /* renamed from: K */
    public TimeInterpolator mo58062K() {
        return this.f49513P;
    }

    @Nullable
    /* renamed from: L */
    public CharSequence mo58063L() {
        return this.f49500C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f49549o;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58064R() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f49550p
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f49549o
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CollapsingTextHelper.mo58064R():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo58065U() {
        this.f49526b = this.f49540i.width() > 0 && this.f49540i.height() > 0 && this.f49538h.width() > 0 && this.f49538h.height() > 0;
    }

    /* renamed from: V */
    public void mo58066V() {
        mo58067W(false);
    }

    /* renamed from: W */
    public void mo58067W(boolean z) {
        if ((this.f49524a.getHeight() > 0 && this.f49524a.getWidth() > 0) || z) {
            m68636b(z);
            m68638c();
        }
    }

    /* renamed from: Y */
    public void mo58068Y(int i, int i2, int i3, int i4) {
        if (!m68634X(this.f49540i, i, i2, i3, i4)) {
            this.f49540i.set(i, i2, i3, i4);
            this.f49510M = true;
            mo58065U();
        }
    }

    /* renamed from: Z */
    public void mo58069Z(@NonNull Rect rect) {
        mo58068Y(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a0 */
    public void mo58070a0(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f49524a.getContext(), i);
        if (textAppearance.mo58603i() != null) {
            this.f49550p = textAppearance.mo58603i();
        }
        if (textAppearance.mo58604j() != 0.0f) {
            this.f49548n = textAppearance.mo58604j();
        }
        ColorStateList colorStateList = textAppearance.f49909c;
        if (colorStateList != null) {
            this.f49518U = colorStateList;
        }
        this.f49516S = textAppearance.f49914h;
        this.f49517T = textAppearance.f49915i;
        this.f49515R = textAppearance.f49916j;
        this.f49523Z = textAppearance.f49918l;
        CancelableFontCallback cancelableFontCallback = this.f49499B;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.mo58598c();
        }
        this.f49499B = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() {
            /* renamed from: a */
            public void mo58100a(Typeface typeface) {
                CollapsingTextHelper.this.mo58073e0(typeface);
            }
        }, textAppearance.mo58599e());
        textAppearance.mo58602h(this.f49524a.getContext(), this.f49499B);
        mo58066V();
    }

    /* renamed from: c0 */
    public void mo58071c0(ColorStateList colorStateList) {
        if (this.f49550p != colorStateList) {
            this.f49550p = colorStateList;
            mo58066V();
        }
    }

    /* renamed from: d0 */
    public void mo58072d0(int i) {
        if (this.f49546l != i) {
            this.f49546l = i;
            mo58066V();
        }
    }

    /* renamed from: e0 */
    public void mo58073e0(Typeface typeface) {
        if (m68642f0(typeface)) {
            mo58066V();
        }
    }

    /* renamed from: g0 */
    public void mo58074g0(int i) {
        this.f49536g = i;
    }

    /* renamed from: h0 */
    public void mo58075h0(int i, int i2, int i3, int i4) {
        if (!m68634X(this.f49538h, i, i2, i3, i4)) {
            this.f49538h.set(i, i2, i3, i4);
            this.f49510M = true;
            mo58065U();
        }
    }

    /* renamed from: i0 */
    public void mo58076i0(@NonNull Rect rect) {
        mo58075h0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: j0 */
    public void mo58077j0(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f49524a.getContext(), i);
        if (textAppearance.mo58603i() != null) {
            this.f49549o = textAppearance.mo58603i();
        }
        if (textAppearance.mo58604j() != 0.0f) {
            this.f49547m = textAppearance.mo58604j();
        }
        ColorStateList colorStateList = textAppearance.f49909c;
        if (colorStateList != null) {
            this.f49522Y = colorStateList;
        }
        this.f49520W = textAppearance.f49914h;
        this.f49521X = textAppearance.f49915i;
        this.f49519V = textAppearance.f49916j;
        this.f49525a0 = textAppearance.f49918l;
        CancelableFontCallback cancelableFontCallback = this.f49498A;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.mo58598c();
        }
        this.f49498A = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() {
            /* renamed from: a */
            public void mo58100a(Typeface typeface) {
                CollapsingTextHelper.this.mo58083o0(typeface);
            }
        }, textAppearance.mo58599e());
        textAppearance.mo58602h(this.f49524a.getContext(), this.f49498A);
        mo58066V();
    }

    /* renamed from: l */
    public void mo58078l(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (this.f49501D != null && this.f49526b) {
            boolean z = true;
            float lineStart = (this.f49556v + (this.f49539h0 > 1 ? (float) this.f49527b0.getLineStart(0) : this.f49527b0.getLineLeft(0))) - (this.f49535f0 * 2.0f);
            this.f49511N.setTextSize(this.f49508K);
            float f = this.f49556v;
            float f2 = this.f49557w;
            if (!this.f49504G || this.f49505H == null) {
                z = false;
            }
            float f3 = this.f49507J;
            if (f3 != 1.0f && !this.f49530d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f49505H, f, f2, this.f49506I);
                canvas.restoreToCount(save);
                return;
            }
            if (!m68626E0() || (this.f49530d && this.f49528c <= this.f49534f)) {
                canvas.translate(f, f2);
                this.f49527b0.draw(canvas);
            } else {
                m68649m(canvas, lineStart, f2);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l0 */
    public void mo58079l0(ColorStateList colorStateList) {
        if (this.f49549o != colorStateList) {
            this.f49549o = colorStateList;
            mo58066V();
        }
    }

    /* renamed from: m0 */
    public void mo58080m0(int i) {
        if (this.f49544k != i) {
            this.f49544k = i;
            mo58066V();
        }
    }

    /* renamed from: n0 */
    public void mo58081n0(float f) {
        if (this.f49547m != f) {
            this.f49547m = f;
            mo58066V();
        }
    }

    /* renamed from: o */
    public void mo58082o(@NonNull RectF rectF, int i, int i2) {
        this.f49502E = m68641f(this.f49500C);
        rectF.left = m68652s(i, i2);
        rectF.top = (float) this.f49540i.top;
        rectF.right = m68653t(rectF, i, i2);
        rectF.bottom = ((float) this.f49540i.top) + mo58087r();
    }

    /* renamed from: o0 */
    public void mo58083o0(Typeface typeface) {
        if (m68651p0(typeface)) {
            mo58066V();
        }
    }

    /* renamed from: p */
    public ColorStateList mo58084p() {
        return this.f49550p;
    }

    /* renamed from: q */
    public int mo58085q() {
        return this.f49546l;
    }

    /* renamed from: q0 */
    public void mo58086q0(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.f49528c) {
            this.f49528c = clamp;
            m68638c();
        }
    }

    /* renamed from: r */
    public float mo58087r() {
        m68627M(this.f49512O);
        return -this.f49512O.ascent();
    }

    /* renamed from: r0 */
    public void mo58088r0(boolean z) {
        this.f49530d = z;
    }

    /* renamed from: s0 */
    public void mo58089s0(float f) {
        this.f49532e = f;
        this.f49534f = m68640e();
    }

    @RequiresApi(23)
    /* renamed from: t0 */
    public void mo58090t0(int i) {
        this.f49545k0 = i;
    }

    /* renamed from: u */
    public Typeface mo58091u() {
        Typeface typeface = this.f49558x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    /* renamed from: v */
    public int mo58092v() {
        return m68655w(this.f49550p);
    }

    @RequiresApi(23)
    /* renamed from: v0 */
    public void mo58093v0(float f) {
        this.f49541i0 = f;
    }

    @RequiresApi(23)
    /* renamed from: w0 */
    public void mo58094w0(@FloatRange(from = 0.0d) float f) {
        this.f49543j0 = f;
    }

    /* renamed from: x0 */
    public void mo58095x0(int i) {
        if (i != this.f49539h0) {
            this.f49539h0 = i;
            m68646j();
            mo58066V();
        }
    }

    /* renamed from: y */
    public int mo58096y() {
        return this.f49551q;
    }

    /* renamed from: y0 */
    public void mo58097y0(TimeInterpolator timeInterpolator) {
        this.f49513P = timeInterpolator;
        mo58066V();
    }

    /* renamed from: z */
    public float mo58098z() {
        m68628N(this.f49512O);
        return (-this.f49512O.ascent()) + this.f49512O.descent();
    }

    /* renamed from: z0 */
    public void mo58099z0(boolean z) {
        this.f49503F = z;
    }
}
