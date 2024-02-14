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

public class SparkButton extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final DecelerateInterpolator f57873I = new DecelerateInterpolator();

    /* renamed from: J */
    private static final AccelerateDecelerateInterpolator f57874J = new AccelerateDecelerateInterpolator();

    /* renamed from: K */
    private static final OvershootInterpolator f57875K = new OvershootInterpolator(4.0f);

    /* renamed from: A */
    DotsView f57876A;

    /* renamed from: B */
    CircleView f57877B;

    /* renamed from: C */
    ImageView f57878C;

    /* renamed from: D */
    boolean f57879D = true;

    /* renamed from: E */
    float f57880E = 1.0f;

    /* renamed from: F */
    boolean f57881F = false;

    /* renamed from: G */
    private AnimatorSet f57882G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C15819a f57883H;

    /* renamed from: a */
    int f57884a = -1;

    /* renamed from: c */
    int f57885c = -1;

    /* renamed from: d */
    int f57886d;

    /* renamed from: f */
    int f57887f;

    /* renamed from: g */
    int f57888g;

    /* renamed from: o */
    int f57889o;

    /* renamed from: p */
    int f57890p;

    /* renamed from: s */
    int f57891s;

    /* renamed from: z */
    int f57892z;

    /* renamed from: com.varunest.sparkbutton.SparkButton$a */
    class C11898a extends AnimatorListenerAdapter {
        C11898a() {
        }

        public void onAnimationCancel(Animator animator) {
            SparkButton.this.f57877B.setInnerCircleRadiusProgress(0.0f);
            SparkButton.this.f57877B.setOuterCircleRadiusProgress(0.0f);
            SparkButton.this.f57876A.setCurrentProgress(0.0f);
            SparkButton.this.f57878C.setScaleX(1.0f);
            SparkButton.this.f57878C.setScaleY(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (SparkButton.this.f57883H != null) {
                C15819a a = SparkButton.this.f57883H;
                SparkButton sparkButton = SparkButton.this;
                a.mo29735c(sparkButton.f57878C, sparkButton.f57881F);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationEnd(animator);
            if (SparkButton.this.f57883H != null) {
                C15819a a = SparkButton.this.f57883H;
                SparkButton sparkButton = SparkButton.this;
                a.mo29734b(sparkButton.f57878C, sparkButton.f57881F);
            }
        }
    }

    /* renamed from: com.varunest.sparkbutton.SparkButton$b */
    class C11899b implements View.OnTouchListener {
        C11899b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                SparkButton.this.f57878C.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).setInterpolator(SparkButton.f57873I);
                SparkButton.this.setPressed(true);
            } else if (action == 1) {
                SparkButton.this.f57878C.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(SparkButton.f57873I);
                if (SparkButton.this.isPressed()) {
                    SparkButton.this.performClick();
                    SparkButton.this.setPressed(false);
                }
            } else if (action == 3) {
                SparkButton.this.f57878C.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(SparkButton.f57873I);
            }
            return true;
        }
    }

    public SparkButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82134d(attributeSet);
        mo67142f();
    }

    /* renamed from: d */
    private void m82134d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.sparkbutton);
        this.f57886d = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.sparkbutton_sparkbutton_iconSize, C16104a.m96729c(getContext(), 50));
        this.f57884a = obtainStyledAttributes.getResourceId(R$styleable.sparkbutton_sparkbutton_activeImage, -1);
        this.f57885c = obtainStyledAttributes.getResourceId(R$styleable.sparkbutton_sparkbutton_inActiveImage, -1);
        this.f57890p = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(R$styleable.sparkbutton_sparkbutton_primaryColor, R$color.spark_primary_color));
        this.f57889o = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(R$styleable.sparkbutton_sparkbutton_secondaryColor, R$color.spark_secondary_color));
        Context context = getContext();
        int i = R$styleable.sparkbutton_sparkbutton_activeImageTint;
        int i2 = R$color.spark_image_tint;
        this.f57891s = ContextCompat.getColor(context, obtainStyledAttributes.getResourceId(i, i2));
        this.f57892z = ContextCompat.getColor(getContext(), obtainStyledAttributes.getResourceId(R$styleable.sparkbutton_sparkbutton_inActiveImageTint, i2));
        this.f57879D = obtainStyledAttributes.getBoolean(R$styleable.sparkbutton_sparkbutton_pressOnTouch, true);
        this.f57880E = obtainStyledAttributes.getFloat(R$styleable.sparkbutton_sparkbutton_animationSpeed, 1.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: p */
    private void m82135p() {
        if (this.f57879D) {
            setOnTouchListener(new C11899b());
        } else {
            setOnTouchListener((View.OnTouchListener) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo67142f() {
        int i = this.f57886d;
        this.f57888g = (int) (((float) i) * 1.4f);
        this.f57887f = (int) (((float) i) * 3.0f);
        LayoutInflater.from(getContext()).inflate(R$layout.layout_spark_button, this, true);
        CircleView circleView = (CircleView) findViewById(R$id.vCircle);
        this.f57877B = circleView;
        circleView.mo67166b(this.f57889o, this.f57890p);
        this.f57877B.getLayoutParams().height = this.f57888g;
        this.f57877B.getLayoutParams().width = this.f57888g;
        DotsView dotsView = (DotsView) findViewById(R$id.vDotsView);
        this.f57876A = dotsView;
        dotsView.getLayoutParams().width = this.f57887f;
        this.f57876A.getLayoutParams().height = this.f57887f;
        this.f57876A.mo67181d(this.f57889o, this.f57890p);
        this.f57876A.setMaxDotSize((int) (((float) this.f57886d) * 0.08f));
        ImageView imageView = (ImageView) findViewById(R$id.ivImage);
        this.f57878C = imageView;
        imageView.getLayoutParams().height = this.f57886d;
        this.f57878C.getLayoutParams().width = this.f57886d;
        int i2 = this.f57885c;
        if (i2 != -1) {
            this.f57878C.setImageResource(i2);
            this.f57878C.setColorFilter(this.f57892z, PorterDuff.Mode.SRC_ATOP);
        } else {
            int i3 = this.f57884a;
            if (i3 != -1) {
                this.f57878C.setImageResource(i3);
                this.f57878C.setColorFilter(this.f57891s, PorterDuff.Mode.SRC_ATOP);
            } else {
                throw new IllegalArgumentException("One of Inactive/Active Image Resources are required!!");
            }
        }
        m82135p();
        setOnClickListener(this);
    }

    /* renamed from: o */
    public void mo67143o() {
        AnimatorSet animatorSet = this.f57882G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f57878C.animate().cancel();
        this.f57878C.setScaleX(0.0f);
        this.f57878C.setScaleY(0.0f);
        this.f57877B.setInnerCircleRadiusProgress(0.0f);
        this.f57877B.setOuterCircleRadiusProgress(0.0f);
        this.f57876A.setCurrentProgress(0.0f);
        this.f57882G = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f57877B, CircleView.f57918C, new float[]{0.1f, 1.0f});
        ofFloat.setDuration((long) (250.0f / this.f57880E));
        DecelerateInterpolator decelerateInterpolator = f57873I;
        ofFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f57877B, CircleView.f57917B, new float[]{0.1f, 1.0f});
        ofFloat2.setDuration((long) (200.0f / this.f57880E));
        ofFloat2.setStartDelay((long) (200.0f / this.f57880E));
        ofFloat2.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f57878C, ImageView.SCALE_Y, new float[]{0.2f, 1.0f});
        ofFloat3.setDuration((long) (350.0f / this.f57880E));
        ofFloat3.setStartDelay((long) (250.0f / this.f57880E));
        OvershootInterpolator overshootInterpolator = f57875K;
        ofFloat3.setInterpolator(overshootInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f57878C, ImageView.SCALE_X, new float[]{0.2f, 1.0f});
        ofFloat4.setDuration((long) (350.0f / this.f57880E));
        ofFloat4.setStartDelay((long) (250.0f / this.f57880E));
        ofFloat4.setInterpolator(overshootInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f57876A, DotsView.f57929H, new float[]{0.0f, 1.0f});
        ofFloat5.setDuration((long) (900.0f / this.f57880E));
        ofFloat5.setStartDelay((long) (50.0f / this.f57880E));
        ofFloat5.setInterpolator(f57874J);
        this.f57882G.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.f57882G.addListener(new C11898a());
        this.f57882G.start();
    }

    public void onClick(View view) {
        int i = this.f57885c;
        if (i != -1) {
            boolean z = !this.f57881F;
            this.f57881F = z;
            ImageView imageView = this.f57878C;
            if (z) {
                i = this.f57884a;
            }
            imageView.setImageResource(i);
            this.f57878C.setColorFilter(this.f57881F ? this.f57891s : this.f57892z, PorterDuff.Mode.SRC_ATOP);
            AnimatorSet animatorSet = this.f57882G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (this.f57881F) {
                this.f57877B.setVisibility(0);
                this.f57876A.setVisibility(0);
                mo67143o();
            } else {
                this.f57876A.setVisibility(4);
                this.f57877B.setVisibility(8);
            }
        } else {
            mo67143o();
        }
        C15819a aVar = this.f57883H;
        if (aVar != null) {
            aVar.mo29733a(this.f57878C, this.f57881F);
        }
    }

    public void setActiveImage(int i) {
        this.f57884a = i;
        ImageView imageView = this.f57878C;
        if (!this.f57881F) {
            i = this.f57885c;
        }
        imageView.setImageResource(i);
    }

    public void setAnimationSpeed(float f) {
        this.f57880E = f;
    }

    public void setChecked(boolean z) {
        this.f57881F = z;
        this.f57878C.setImageResource(z ? this.f57884a : this.f57885c);
        this.f57878C.setColorFilter(this.f57881F ? this.f57891s : this.f57892z, PorterDuff.Mode.SRC_ATOP);
    }

    public void setEventListener(C15819a aVar) {
        this.f57883H = aVar;
    }

    public void setInactiveImage(int i) {
        this.f57885c = i;
        ImageView imageView = this.f57878C;
        if (this.f57881F) {
            i = this.f57884a;
        }
        imageView.setImageResource(i);
    }

    public SparkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82134d(attributeSet);
        mo67142f();
    }
}
