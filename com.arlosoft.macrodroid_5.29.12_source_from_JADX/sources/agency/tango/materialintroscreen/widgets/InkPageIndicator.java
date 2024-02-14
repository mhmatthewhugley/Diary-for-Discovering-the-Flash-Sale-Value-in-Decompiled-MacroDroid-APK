package agency.tango.materialintroscreen.widgets;

import agency.tango.materialintroscreen.R$styleable;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;

public class InkPageIndicator extends View implements ViewPager.OnPageChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: A */
    float f94A;

    /* renamed from: B */
    float f95B;

    /* renamed from: C */
    float f96C;

    /* renamed from: D */
    float f97D;

    /* renamed from: E */
    float f98E;

    /* renamed from: F */
    private int f99F;

    /* renamed from: G */
    private int f100G;

    /* renamed from: H */
    private long f101H;

    /* renamed from: I */
    private int f102I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public float f103J;

    /* renamed from: K */
    private float f104K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public long f105L;

    /* renamed from: M */
    private float f106M;

    /* renamed from: N */
    private float f107N;

    /* renamed from: O */
    private float f108O;

    /* renamed from: P */
    private SwipeableViewPager f109P;

    /* renamed from: Q */
    private int f110Q;

    /* renamed from: R */
    private int f111R;

    /* renamed from: S */
    private int f112S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public float f113T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f114U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public float[] f115V;

    /* renamed from: W */
    private float[] f116W;

    /* renamed from: a */
    private final Paint f117a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public float f118a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public float f119b0;

    /* renamed from: c */
    private final Path f120c;

    /* renamed from: c0 */
    private float[] f121c0;

    /* renamed from: d */
    private final Path f122d;

    /* renamed from: d0 */
    private boolean f123d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f124e0;

    /* renamed from: f */
    private final Path f125f;

    /* renamed from: f0 */
    private Paint f126f0;

    /* renamed from: g */
    private final RectF f127g;

    /* renamed from: g0 */
    private Path f128g0;

    /* renamed from: h0 */
    private ValueAnimator f129h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C0037f f130i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C0041g[] f131j0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Interpolator f132o;

    /* renamed from: p */
    float f133p;

    /* renamed from: s */
    float f134s;

    /* renamed from: z */
    float f135z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0031a();

        /* renamed from: a */
        int f136a;

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$SavedState$a */
        class C0031a implements Parcelable.Creator<SavedState> {
            C0031a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C0032a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C0032a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f136a);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f136a = parcel.readInt();
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$a */
    class C0032a extends DataSetObserver {
        C0032a() {
        }

        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.getCount());
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$b */
    class C0033b extends AnimatorListenerAdapter {
        C0033b() {
        }

        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.m130C();
            boolean unused = InkPageIndicator.this.f124e0 = false;
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$c */
    class C0034c implements ValueAnimator.AnimatorUpdateListener {
        C0034c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = InkPageIndicator.this.f113T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f130i0.mo139a(InkPageIndicator.this.f113T);
            ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$d */
    class C0035d extends AnimatorListenerAdapter {
        C0035d() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = InkPageIndicator.this.f114U = true;
        }

        public void onAnimationStart(Animator animator) {
            boolean unused = InkPageIndicator.this.f114U = false;
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$e */
    public class C0036e extends C0046j {
        C0036e(float f) {
            super(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo132a(float f) {
            return f < this.f162a;
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$f */
    public class C0037f extends C0044h {

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$f$a */
        class C0038a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ InkPageIndicator f143a;

            C0038a(InkPageIndicator inkPageIndicator) {
                this.f143a = inkPageIndicator;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = InkPageIndicator.this.f118a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
                for (C0041g a : InkPageIndicator.this.f131j0) {
                    a.mo139a(InkPageIndicator.this.f118a0);
                }
            }
        }

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$f$b */
        class C0039b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ InkPageIndicator f145a;

            C0039b(InkPageIndicator inkPageIndicator) {
                this.f145a = inkPageIndicator;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = InkPageIndicator.this.f119b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
                for (C0041g a : InkPageIndicator.this.f131j0) {
                    a.mo139a(InkPageIndicator.this.f119b0);
                }
            }
        }

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$f$c */
        class C0040c extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ InkPageIndicator f147a;

            /* renamed from: b */
            final /* synthetic */ int[] f148b;

            /* renamed from: c */
            final /* synthetic */ float f149c;

            /* renamed from: d */
            final /* synthetic */ float f150d;

            C0040c(InkPageIndicator inkPageIndicator, int[] iArr, float f, float f2) {
                this.f147a = inkPageIndicator;
                this.f148b = iArr;
                this.f149c = f;
                this.f150d = f2;
            }

            public void onAnimationEnd(Animator animator) {
                float unused = InkPageIndicator.this.f118a0 = -1.0f;
                float unused2 = InkPageIndicator.this.f119b0 = -1.0f;
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
            }

            public void onAnimationStart(Animator animator) {
                InkPageIndicator.this.mo121u();
                for (int k : this.f148b) {
                    InkPageIndicator.this.m132E(k, 1.0E-5f);
                }
                float unused = InkPageIndicator.this.f118a0 = this.f149c;
                float unused2 = InkPageIndicator.this.f119b0 = this.f150d;
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
            }
        }

        C0037f(int i, int i2, int i3, C0046j jVar) {
            super(jVar);
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            setDuration(InkPageIndicator.this.f105L);
            setInterpolator(InkPageIndicator.this.f132o);
            if (i2 > i) {
                f = Math.min(InkPageIndicator.this.f115V[i], InkPageIndicator.this.f113T);
                f2 = InkPageIndicator.this.f103J;
            } else {
                f = InkPageIndicator.this.f115V[i2];
                f2 = InkPageIndicator.this.f103J;
            }
            float f9 = f - f2;
            if (i2 > i) {
                f3 = InkPageIndicator.this.f115V[i2];
                f4 = InkPageIndicator.this.f103J;
            } else {
                f3 = InkPageIndicator.this.f115V[i2];
                f4 = InkPageIndicator.this.f103J;
            }
            float f10 = f3 - f4;
            if (i2 > i) {
                f6 = InkPageIndicator.this.f115V[i2];
                f5 = InkPageIndicator.this.f103J;
            } else {
                f6 = Math.max(InkPageIndicator.this.f115V[i], InkPageIndicator.this.f113T);
                f5 = InkPageIndicator.this.f103J;
            }
            float f11 = f6 + f5;
            if (i2 > i) {
                f7 = InkPageIndicator.this.f115V[i2];
                f8 = InkPageIndicator.this.f103J;
            } else {
                f7 = InkPageIndicator.this.f115V[i2];
                f8 = InkPageIndicator.this.f103J;
            }
            float f12 = f7 + f8;
            C0041g[] unused = InkPageIndicator.this.f131j0 = new C0041g[i3];
            int[] iArr = new int[i3];
            int i4 = 0;
            if (f9 != f10) {
                setFloatValues(new float[]{f9, f10});
                while (i4 < i3) {
                    int i5 = i + i4;
                    InkPageIndicator.this.f131j0[i4] = new C0041g(i5, new C0045i(InkPageIndicator.this.f115V[i5]));
                    iArr[i4] = i5;
                    i4++;
                }
                addUpdateListener(new C0038a(InkPageIndicator.this));
            } else {
                setFloatValues(new float[]{f11, f12});
                while (i4 < i3) {
                    int i6 = i - i4;
                    InkPageIndicator.this.f131j0[i4] = new C0041g(i6, new C0036e(InkPageIndicator.this.f115V[i6]));
                    iArr[i4] = i6;
                    i4++;
                }
                addUpdateListener(new C0039b(InkPageIndicator.this));
            }
            addListener(new C0040c(InkPageIndicator.this, iArr, f9, f11));
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$g */
    public class C0041g extends C0044h {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f152f;

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$g$a */
        class C0042a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ InkPageIndicator f154a;

            C0042a(InkPageIndicator inkPageIndicator) {
                this.f154a = inkPageIndicator;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0041g gVar = C0041g.this;
                InkPageIndicator.this.m132E(gVar.f152f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$g$b */
        class C0043b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ InkPageIndicator f156a;

            C0043b(InkPageIndicator inkPageIndicator) {
                this.f156a = inkPageIndicator;
            }

            public void onAnimationEnd(Animator animator) {
                C0041g gVar = C0041g.this;
                InkPageIndicator.this.m132E(gVar.f152f, 0.0f);
                ViewCompat.postInvalidateOnAnimation(InkPageIndicator.this);
            }
        }

        C0041g(int i, C0046j jVar) {
            super(jVar);
            setFloatValues(new float[]{1.0E-5f, 1.0f});
            this.f152f = i;
            setDuration(InkPageIndicator.this.f105L);
            setInterpolator(InkPageIndicator.this.f132o);
            addUpdateListener(new C0042a(InkPageIndicator.this));
            addListener(new C0043b(InkPageIndicator.this));
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$h */
    public abstract class C0044h extends ValueAnimator {

        /* renamed from: a */
        boolean f158a = false;

        /* renamed from: c */
        C0046j f159c;

        C0044h(C0046j jVar) {
            this.f159c = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo139a(float f) {
            if (!this.f158a && this.f159c.mo132a(f)) {
                start();
                this.f158a = true;
            }
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$i */
    public class C0045i extends C0046j {
        C0045i(float f) {
            super(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo132a(float f) {
            return f > this.f162a;
        }
    }

    /* renamed from: agency.tango.materialintroscreen.widgets.InkPageIndicator$j */
    public abstract class C0046j {

        /* renamed from: a */
        float f162a;

        C0046j(float f) {
            this.f162a = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo132a(float f);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private boolean m128A(float f) {
        return f > 0.0f && f <= 0.5f && this.f118a0 == -1.0f;
    }

    /* renamed from: B */
    private boolean m129B(int i, float f, float f2) {
        return (f == 0.0f || f == -1.0f) && f2 == 0.0f && (i != this.f111R || !this.f114U);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m130C() {
        float[] fArr = new float[(this.f110Q - 1)];
        this.f116W = fArr;
        Arrays.fill(fArr, 0.0f);
        float[] fArr2 = new float[this.f110Q];
        this.f121c0 = fArr2;
        Arrays.fill(fArr2, 0.0f);
        this.f118a0 = -1.0f;
        this.f119b0 = -1.0f;
        this.f114U = true;
    }

    /* renamed from: D */
    private void m131D() {
        SwipeableViewPager swipeableViewPager = this.f109P;
        if (swipeableViewPager != null) {
            this.f111R = swipeableViewPager.getCurrentItem();
        } else {
            this.f111R = 0;
        }
        if (m158z()) {
            this.f113T = this.f115V[this.f111R];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m132E(int i, float f) {
        float[] fArr = this.f121c0;
        if (i < fArr.length) {
            fArr[i] = f;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* renamed from: F */
    private void m133F(int i, float f) {
        float[] fArr = this.f116W;
        if (fArr != null && i < fArr.length) {
            fArr[i] = f;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* access modifiers changed from: private */
    public int getCount() {
        return this.f109P.getAdapter().mo16807g();
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f99F + getPaddingBottom();
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        int i = this.f110Q;
        return (this.f99F * i) + ((i - 1) * this.f100G);
    }

    private Path getRetreatingJoinPath() {
        this.f120c.rewind();
        this.f127g.set(this.f118a0, this.f106M, this.f119b0, this.f108O);
        Path path = this.f120c;
        RectF rectF = this.f127g;
        float f = this.f103J;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f120c;
    }

    /* access modifiers changed from: private */
    public void setPageCount(int i) {
        if (i > 0) {
            this.f110Q = i;
            m130C();
            requestLayout();
        }
    }

    private void setSelectedPage(int i) {
        int i2 = this.f111R;
        if (i != i2) {
            this.f124e0 = true;
            this.f112S = i2;
            this.f111R = i;
            int abs = Math.abs(i - i2);
            if (abs > 1) {
                if (i > this.f112S) {
                    for (int i3 = 0; i3 < abs; i3++) {
                        m133F(this.f112S + i3, 1.0f);
                    }
                } else {
                    for (int i4 = -1; i4 > (-abs); i4--) {
                        m133F(this.f112S + i4, 1.0f);
                    }
                }
            }
            float[] fArr = this.f115V;
            if (fArr != null) {
                ValueAnimator v = m154v(fArr[i], this.f112S, i, abs);
                this.f129h0 = v;
                v.start();
            }
        }
    }

    /* renamed from: t */
    private void m153t(int i) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float paddingRight = ((float) (paddingLeft + ((((i - getPaddingRight()) - paddingLeft) - getRequiredWidth()) / 2))) + this.f103J;
        this.f115V = new float[this.f110Q];
        for (int i2 = 0; i2 < this.f110Q; i2++) {
            this.f115V[i2] = ((float) ((this.f99F + this.f100G) * i2)) + paddingRight;
        }
        float f = (float) paddingTop;
        this.f106M = f;
        this.f107N = f + this.f103J;
        this.f108O = (float) (paddingTop + this.f99F);
        m131D();
    }

    /* renamed from: v */
    private ValueAnimator m154v(float f, int i, int i2, int i3) {
        C0046j jVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f113T, f});
        if (i2 > i) {
            jVar = new C0045i(f - ((f - this.f113T) * 0.25f));
        } else {
            jVar = new C0036e(f + ((this.f113T - f) * 0.25f));
        }
        C0037f fVar = new C0037f(i, i2, i3, jVar);
        this.f130i0 = fVar;
        fVar.addListener(new C0033b());
        ofFloat.addUpdateListener(new C0034c());
        ofFloat.addListener(new C0035d());
        ofFloat.setStartDelay(this.f114U ? this.f101H / 4 : 0);
        ofFloat.setDuration((this.f101H * 3) / 4);
        ofFloat.setInterpolator(this.f132o);
        return ofFloat;
    }

    /* renamed from: w */
    private void m155w(Canvas canvas) {
        canvas.drawCircle(this.f113T, this.f107N, this.f103J, this.f117a);
    }

    /* renamed from: x */
    private void m156x(Canvas canvas) {
        float f;
        this.f128g0.rewind();
        int i = 0;
        while (true) {
            int i2 = this.f110Q;
            if (i >= i2) {
                break;
            }
            int i3 = i == i2 + -1 ? i : i + 1;
            float[] fArr = this.f115V;
            float f2 = fArr[i];
            float f3 = fArr[i3];
            if (i == i2 - 1) {
                f = -1.0f;
            } else {
                f = this.f116W[i];
            }
            Path y = m157y(i, f2, f3, f, this.f121c0[i]);
            y.addPath(this.f128g0);
            this.f128g0.addPath(y);
            i++;
        }
        if (this.f118a0 != -1.0f) {
            this.f128g0.addPath(getRetreatingJoinPath());
        }
        canvas.drawPath(this.f128g0, this.f126f0);
    }

    /* renamed from: y */
    private Path m157y(int i, float f, float f2, float f3, float f4) {
        int i2 = i;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        this.f120c.rewind();
        if (m129B(i2, f7, f8)) {
            this.f120c.addCircle(this.f115V[i2], this.f107N, this.f103J, Path.Direction.CW);
        }
        if (m128A(f7)) {
            this.f122d.rewind();
            this.f122d.moveTo(f5, this.f108O);
            RectF rectF = this.f127g;
            float f9 = this.f103J;
            rectF.set(f5 - f9, this.f106M, f9 + f5, this.f108O);
            this.f122d.arcTo(this.f127g, 90.0f, 180.0f, true);
            float f10 = this.f103J + f5 + (((float) this.f100G) * f7);
            this.f133p = f10;
            float f11 = this.f107N;
            this.f134s = f11;
            float f12 = this.f104K;
            float f13 = f5 + f12;
            this.f95B = f13;
            float f14 = this.f106M;
            this.f96C = f14;
            this.f97D = f10;
            float f15 = f11 - f12;
            this.f98E = f15;
            this.f122d.cubicTo(f13, f14, f10, f15, f10, f11);
            this.f135z = f5;
            float f16 = this.f108O;
            this.f94A = f16;
            float f17 = this.f133p;
            this.f95B = f17;
            float f18 = this.f134s;
            float f19 = this.f104K;
            float f20 = f18 + f19;
            this.f96C = f20;
            float f21 = f5 + f19;
            this.f97D = f21;
            this.f98E = f16;
            this.f122d.cubicTo(f17, f20, f21, f16, f, f16);
            this.f120c.addPath(this.f122d);
            this.f125f.rewind();
            this.f125f.moveTo(f6, this.f108O);
            RectF rectF2 = this.f127g;
            float f22 = this.f103J;
            rectF2.set(f6 - f22, this.f106M, f22 + f6, this.f108O);
            this.f125f.arcTo(this.f127g, 90.0f, -180.0f, true);
            float f23 = (f6 - this.f103J) - (((float) this.f100G) * f7);
            this.f133p = f23;
            float f24 = this.f107N;
            this.f134s = f24;
            float f25 = this.f104K;
            float f26 = f6 - f25;
            this.f95B = f26;
            float f27 = this.f106M;
            this.f96C = f27;
            this.f97D = f23;
            float f28 = f24 - f25;
            this.f98E = f28;
            this.f125f.cubicTo(f26, f27, f23, f28, f23, f24);
            this.f135z = f6;
            float f29 = this.f108O;
            this.f94A = f29;
            float f30 = this.f133p;
            this.f95B = f30;
            float f31 = this.f134s;
            float f32 = this.f104K;
            float f33 = f31 + f32;
            this.f96C = f33;
            float f34 = f6 - f32;
            this.f97D = f34;
            this.f98E = f29;
            this.f125f.cubicTo(f30, f33, f34, f29, f2, f29);
            this.f120c.addPath(this.f125f);
        }
        if (f7 > 0.5f && f7 < 1.0f && this.f118a0 == -1.0f) {
            float f35 = (f7 - 0.2f) * 1.25f;
            this.f120c.moveTo(f5, this.f108O);
            RectF rectF3 = this.f127g;
            float f36 = this.f103J;
            rectF3.set(f5 - f36, this.f106M, f36 + f5, this.f108O);
            this.f120c.arcTo(this.f127g, 90.0f, 180.0f, true);
            float f37 = this.f103J;
            float f38 = f5 + f37 + ((float) (this.f100G / 2));
            this.f133p = f38;
            float f39 = this.f107N - (f35 * f37);
            this.f134s = f39;
            float f40 = f38 - (f35 * f37);
            this.f95B = f40;
            float f41 = this.f106M;
            this.f96C = f41;
            float f42 = 1.0f - f35;
            float f43 = f38 - (f37 * f42);
            this.f97D = f43;
            this.f98E = f39;
            this.f120c.cubicTo(f40, f41, f43, f39, f38, f39);
            this.f135z = f6;
            float f44 = this.f106M;
            this.f94A = f44;
            float f45 = this.f133p;
            float f46 = this.f103J;
            float f47 = (f42 * f46) + f45;
            this.f95B = f47;
            float f48 = this.f134s;
            this.f96C = f48;
            float f49 = f45 + (f46 * f35);
            this.f97D = f49;
            this.f98E = f44;
            this.f120c.cubicTo(f47, f48, f49, f44, f2, f44);
            RectF rectF4 = this.f127g;
            float f50 = this.f103J;
            rectF4.set(f6 - f50, this.f106M, f50 + f6, this.f108O);
            this.f120c.arcTo(this.f127g, 270.0f, 180.0f, true);
            float f51 = this.f107N;
            float f52 = this.f103J;
            float f53 = f51 + (f35 * f52);
            this.f134s = f53;
            float f54 = this.f133p;
            float f55 = (f35 * f52) + f54;
            this.f95B = f55;
            float f56 = this.f108O;
            this.f96C = f56;
            float f57 = (f52 * f42) + f54;
            this.f97D = f57;
            this.f98E = f53;
            this.f120c.cubicTo(f55, f56, f57, f53, f54, f53);
            this.f135z = f5;
            float f58 = this.f108O;
            this.f94A = f58;
            float f59 = this.f133p;
            float f60 = this.f103J;
            float f61 = f59 - (f42 * f60);
            this.f95B = f61;
            float f62 = this.f134s;
            this.f96C = f62;
            float f63 = f59 - (f35 * f60);
            this.f97D = f63;
            this.f98E = f58;
            this.f120c.cubicTo(f61, f62, f63, f58, f, f58);
        }
        if (f7 == 1.0f && this.f118a0 == -1.0f) {
            RectF rectF5 = this.f127g;
            float f64 = this.f103J;
            rectF5.set(f5 - f64, this.f106M, f64 + f6, this.f108O);
            Path path = this.f120c;
            RectF rectF6 = this.f127g;
            float f65 = this.f103J;
            path.addRoundRect(rectF6, f65, f65, Path.Direction.CW);
        }
        if (f8 > 1.0E-5f) {
            this.f120c.addCircle(f5, this.f107N, this.f103J * f8, Path.Direction.CW);
        }
        return this.f120c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r0 = r1.f129h0;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m158z() {
        /*
            r1 = this;
            float[] r0 = r1.f115V
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0013
            android.animation.ValueAnimator r0 = r1.f129h0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: agency.tango.materialintroscreen.widgets.InkPageIndicator.m158z():boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f109P != null && this.f110Q != 0) {
            m156x(canvas);
            m155w(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
        m153t(desiredWidth);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f123d0) {
            int i3 = this.f124e0 ? this.f112S : this.f111R;
            if (i3 != i) {
                f = 1.0f - f;
                if (f == 1.0f) {
                    i = Math.min(i3, i);
                }
            }
            m133F(i, f);
        }
    }

    public void onPageSelected(int i) {
        if (i >= this.f110Q) {
            return;
        }
        if (this.f123d0) {
            setSelectedPage(i);
        } else {
            m131D();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f111R = savedState.f136a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f136a = this.f111R;
        return savedState;
    }

    public void onViewAttachedToWindow(View view) {
        this.f123d0 = true;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f123d0 = false;
    }

    public void setPageIndicatorColor(int i) {
        this.f102I = i;
        Paint paint = new Paint(1);
        this.f126f0 = paint;
        paint.setColor(this.f102I);
    }

    public void setViewPager(SwipeableViewPager swipeableViewPager) {
        this.f109P = swipeableViewPager;
        swipeableViewPager.addOnPageChangeListener(this);
        setPageCount(getCount());
        swipeableViewPager.getAdapter().registerDataSetObserver(new C0032a());
        m131D();
    }

    /* renamed from: u */
    public void mo121u() {
        Arrays.fill(this.f116W, 0.0f);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.InkPageIndicator, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InkPageIndicator_dotDiameter, i2 * 8);
        this.f99F = dimensionPixelSize;
        float f = (float) (dimensionPixelSize / 2);
        this.f103J = f;
        this.f104K = f / 2.0f;
        this.f100G = obtainStyledAttributes.getDimensionPixelSize(R$styleable.InkPageIndicator_dotGap, i2 * 12);
        long integer = (long) obtainStyledAttributes.getInteger(R$styleable.InkPageIndicator_animationDuration, 400);
        this.f101H = integer;
        this.f105L = integer / 2;
        this.f102I = obtainStyledAttributes.getColor(R$styleable.InkPageIndicator_pageIndicatorColor, -2130706433);
        int color = obtainStyledAttributes.getColor(R$styleable.InkPageIndicator_currentPageIndicatorColor, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f126f0 = paint;
        paint.setColor(this.f102I);
        Paint paint2 = new Paint(1);
        this.f117a = paint2;
        paint2.setColor(color);
        this.f132o = new FastOutSlowInInterpolator();
        this.f128g0 = new Path();
        this.f120c = new Path();
        this.f122d = new Path();
        this.f125f = new Path();
        this.f127g = new RectF();
        addOnAttachStateChangeListener(this);
    }
}
