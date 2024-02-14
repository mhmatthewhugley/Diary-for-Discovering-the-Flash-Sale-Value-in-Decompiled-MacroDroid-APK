package com.varunest.sparkbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.varunest.sparkbutton.helpers.CircleView;
import com.varunest.sparkbutton.helpers.DotsView;
import p346o8.C15819a;
import p359p8.C16104a;

public class SparkButton2 extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final DecelerateInterpolator f57895I = new DecelerateInterpolator();

    /* renamed from: J */
    private static final AccelerateDecelerateInterpolator f57896J = new AccelerateDecelerateInterpolator();

    /* renamed from: K */
    private static final OvershootInterpolator f57897K = new OvershootInterpolator(4.0f);

    /* renamed from: A */
    DotsView f57898A;

    /* renamed from: B */
    CircleView f57899B;

    /* renamed from: C */
    ImageView f57900C;

    /* renamed from: D */
    boolean f57901D = true;

    /* renamed from: E */
    float f57902E = 1.0f;

    /* renamed from: F */
    boolean f57903F = false;

    /* renamed from: G */
    private AnimatorSet f57904G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C15819a f57905H;

    /* renamed from: a */
    int f57906a = -1;

    /* renamed from: c */
    int f57907c = -1;

    /* renamed from: d */
    int f57908d;

    /* renamed from: f */
    int f57909f;

    /* renamed from: g */
    int f57910g;

    /* renamed from: o */
    int f57911o;

    /* renamed from: p */
    int f57912p;

    /* renamed from: s */
    int f57913s;

    /* renamed from: z */
    int f57914z;

    /* renamed from: com.varunest.sparkbutton.SparkButton2$a */
    class C11900a extends AnimatorListenerAdapter {
        C11900a() {
        }

        public void onAnimationCancel(Animator animator) {
            SparkButton2.this.f57899B.setInnerCircleRadiusProgress(0.0f);
            SparkButton2.this.f57899B.setOuterCircleRadiusProgress(0.0f);
            SparkButton2.this.f57898A.setCurrentProgress(0.0f);
            SparkButton2.this.f57900C.setScaleX(1.0f);
            SparkButton2.this.f57900C.setScaleY(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (SparkButton2.this.f57905H != null) {
                C15819a a = SparkButton2.this.f57905H;
                SparkButton2 sparkButton2 = SparkButton2.this;
                a.mo29735c(sparkButton2.f57900C, sparkButton2.f57903F);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationEnd(animator);
            if (SparkButton2.this.f57905H != null) {
                C15819a a = SparkButton2.this.f57905H;
                SparkButton2 sparkButton2 = SparkButton2.this;
                a.mo29734b(sparkButton2.f57900C, sparkButton2.f57903F);
            }
        }
    }

    /* renamed from: com.varunest.sparkbutton.SparkButton2$b */
    class C11901b implements View.OnTouchListener {
        C11901b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                SparkButton2.this.f57900C.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).setInterpolator(SparkButton2.f57895I);
                SparkButton2.this.setPressed(true);
            } else if (action == 1) {
                SparkButton2.this.f57900C.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(SparkButton2.f57895I);
                if (SparkButton2.this.isPressed()) {
                    SparkButton2.this.performClick();
                    SparkButton2.this.setPressed(false);
                }
            } else if (action == 3) {
                SparkButton2.this.f57900C.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(SparkButton2.f57895I);
            }
            return true;
        }
    }

    public SparkButton2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82140d(attributeSet);
        mo67154f();
    }

    /* renamed from: d */
    private void m82140d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.sparkbutton);
        this.f57908d = obtainStyledAttributes.getDimensionPixelOffset(3, C16104a.m96729c(getContext(), 50));
        this.f57906a = obtainStyledAttributes.getResourceId(0, -1);
        this.f57907c = obtainStyledAttributes.getResourceId(4, -1);
        this.f57912p = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(7, 2131101008));
        this.f57911o = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(8, 2131101009));
        this.f57913s = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(1, 2131101007));
        this.f57914z = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(5, 2131101007));
        this.f57901D = obtainStyledAttributes.getBoolean(6, true);
        this.f57902E = obtainStyledAttributes.getFloat(2, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: p */
    private void m82141p() {
        if (this.f57901D) {
            setOnTouchListener(new C11901b());
        } else {
            setOnTouchListener((View.OnTouchListener) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo67154f() {
        int i = this.f57908d;
        this.f57910g = (int) (((float) i) * 1.4f);
        this.f57909f = (int) (((float) i) * 3.0f);
        LayoutInflater.from(getContext()).inflate(2131558811, this, true);
        CircleView circleView = (CircleView) findViewById(2131364195);
        this.f57899B = circleView;
        circleView.mo67166b(this.f57911o, this.f57912p);
        this.f57899B.getLayoutParams().height = this.f57910g;
        this.f57899B.getLayoutParams().width = this.f57910g;
        DotsView dotsView = (DotsView) findViewById(2131364196);
        this.f57898A = dotsView;
        dotsView.getLayoutParams().width = this.f57909f;
        this.f57898A.getLayoutParams().height = this.f57909f;
        this.f57898A.mo67181d(this.f57911o, this.f57912p);
        this.f57898A.setMaxDotSize((int) (((float) this.f57908d) * 0.08f));
        ImageView imageView = (ImageView) findViewById(2131362997);
        this.f57900C = imageView;
        imageView.getLayoutParams().height = this.f57908d;
        this.f57900C.getLayoutParams().width = this.f57908d;
        int i2 = this.f57907c;
        if (i2 != -1) {
            this.f57900C.setImageResource(i2);
            this.f57900C.setColorFilter(this.f57914z, PorterDuff.Mode.SRC_ATOP);
        } else {
            int i3 = this.f57906a;
            if (i3 != -1) {
                this.f57900C.setImageResource(i3);
                this.f57900C.setColorFilter(this.f57913s, PorterDuff.Mode.SRC_ATOP);
            } else {
                throw new IllegalArgumentException("One of Inactive/Active Image Resources are required!!");
            }
        }
        m82141p();
        setOnClickListener(this);
    }

    /* renamed from: o */
    public void mo67155o() {
        AnimatorSet animatorSet = this.f57904G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f57900C.animate().cancel();
        this.f57900C.setScaleX(0.0f);
        this.f57900C.setScaleY(0.0f);
        this.f57899B.setInnerCircleRadiusProgress(0.0f);
        this.f57899B.setOuterCircleRadiusProgress(0.0f);
        this.f57898A.setCurrentProgress(0.0f);
        this.f57904G = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f57899B, CircleView.f57918C, new float[]{0.1f, 1.0f});
        ofFloat.setDuration((long) (250.0f / this.f57902E));
        DecelerateInterpolator decelerateInterpolator = f57895I;
        ofFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f57899B, CircleView.f57917B, new float[]{0.1f, 1.0f});
        ofFloat2.setDuration((long) (200.0f / this.f57902E));
        ofFloat2.setStartDelay((long) (200.0f / this.f57902E));
        ofFloat2.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f57900C, ImageView.SCALE_Y, new float[]{0.2f, 1.0f});
        ofFloat3.setDuration((long) (350.0f / this.f57902E));
        ofFloat3.setStartDelay((long) (250.0f / this.f57902E));
        OvershootInterpolator overshootInterpolator = f57897K;
        ofFloat3.setInterpolator(overshootInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f57900C, ImageView.SCALE_X, new float[]{0.2f, 1.0f});
        ofFloat4.setDuration((long) (350.0f / this.f57902E));
        ofFloat4.setStartDelay((long) (250.0f / this.f57902E));
        ofFloat4.setInterpolator(overshootInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f57898A, DotsView.f57929H, new float[]{0.0f, 1.0f});
        ofFloat5.setDuration((long) (900.0f / this.f57902E));
        ofFloat5.setStartDelay((long) (50.0f / this.f57902E));
        ofFloat5.setInterpolator(f57896J);
        this.f57904G.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.f57899B.setVisibility(8);
        this.f57904G.addListener(new C11900a());
        this.f57904G.start();
    }

    public void onClick(View view) {
        int i = this.f57907c;
        if (i != -1) {
            boolean z = !this.f57903F;
            this.f57903F = z;
            ImageView imageView = this.f57900C;
            if (z) {
                i = this.f57906a;
            }
            imageView.setImageResource(i);
            this.f57900C.setColorFilter(this.f57903F ? this.f57913s : this.f57914z, PorterDuff.Mode.SRC_ATOP);
            AnimatorSet animatorSet = this.f57904G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (this.f57903F) {
                this.f57899B.setVisibility(0);
                this.f57898A.setVisibility(0);
                mo67155o();
            } else {
                this.f57898A.setVisibility(4);
                this.f57899B.setVisibility(8);
            }
        } else {
            mo67155o();
        }
        C15819a aVar = this.f57905H;
        if (aVar != null) {
            aVar.mo29733a(this.f57900C, this.f57903F);
        }
    }

    public void setActiveImage(int i) {
        this.f57906a = i;
        ImageView imageView = this.f57900C;
        if (!this.f57903F) {
            i = this.f57907c;
        }
        imageView.setImageResource(i);
    }

    public void setAnimationSpeed(float f) {
        this.f57902E = f;
    }

    public void setChecked(boolean z) {
        this.f57903F = z;
        this.f57900C.setImageResource(z ? this.f57906a : this.f57907c);
        this.f57900C.setColorFilter(this.f57903F ? this.f57913s : this.f57914z, PorterDuff.Mode.SRC_ATOP);
    }

    public void setEventListener(C15819a aVar) {
        this.f57905H = aVar;
    }

    public void setInactiveImage(int i) {
        this.f57907c = i;
        ImageView imageView = this.f57900C;
        if (this.f57903F) {
            i = this.f57906a;
        }
        imageView.setImageResource(i);
    }

    public SparkButton2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82140d(attributeSet);
        mo67154f();
    }
}
