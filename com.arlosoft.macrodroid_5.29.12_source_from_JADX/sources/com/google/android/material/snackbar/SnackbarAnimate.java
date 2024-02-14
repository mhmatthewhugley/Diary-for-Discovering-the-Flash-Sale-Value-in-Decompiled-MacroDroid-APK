package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.R$styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SnackbarAnimate {

    /* renamed from: h */
    static final Handler f50256h = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((SnackbarAnimate) message.obj).mo58933s();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((SnackbarAnimate) message.obj).mo58922f(message.arg1);
                return true;
            }
        }
    });

    /* renamed from: a */
    private final ViewGroup f50257a;

    /* renamed from: b */
    private final Context f50258b;

    /* renamed from: c */
    final SnackbarLayout f50259c;

    /* renamed from: d */
    private int f50260d;

    /* renamed from: e */
    private Callback f50261e;

    /* renamed from: f */
    private final AccessibilityManager f50262f;

    /* renamed from: g */
    final SnackbarManager.Callback f50263g = new SnackbarManager.Callback() {
        /* renamed from: a */
        public void mo58879a(int i) {
            Handler handler = SnackbarAnimate.f50256h;
            handler.sendMessage(handler.obtainMessage(1, i, 0, SnackbarAnimate.this));
        }

        public void show() {
            Handler handler = SnackbarAnimate.f50256h;
            handler.sendMessage(handler.obtainMessage(0, SnackbarAnimate.this));
        }
    };

    final class Behavior extends SwipeDismissBehavior<SnackbarLayout> {
        Behavior() {
        }

        /* renamed from: a */
        public boolean mo56849a(View view) {
            return view instanceof SnackbarLayout;
        }

        /* renamed from: k */
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
            if (coordinatorLayout.isPointInChildBounds(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    SnackbarManager.m69609c().mo58965j(SnackbarAnimate.this.f50263g);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    SnackbarManager.m69609c().mo58966k(SnackbarAnimate.this.f50263g);
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, snackbarLayout, motionEvent);
        }
    }

    public static abstract class Callback {

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        /* renamed from: a */
        public void mo58941a(SnackbarAnimate snackbarAnimate, int i) {
        }

        /* renamed from: b */
        public void mo58942b(SnackbarAnimate snackbarAnimate) {
        }
    }

    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    public static class SnackbarLayout extends LinearLayout {

        /* renamed from: a */
        private TextView f50275a;

        /* renamed from: c */
        private Button f50276c;

        /* renamed from: d */
        private int f50277d;

        /* renamed from: f */
        private int f50278f;

        /* renamed from: g */
        private OnLayoutChangeListener f50279g;

        /* renamed from: o */
        private OnAttachStateChangeListener f50280o;

        interface OnAttachStateChangeListener {
            void onViewAttachedToWindow(View view);

            void onViewDetachedFromWindow(View view);
        }

        interface OnLayoutChangeListener {
            /* renamed from: a */
            void mo58939a(View view, int i, int i2, int i3, int i4);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
            this.f50277d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f50278f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            if (obtainStyledAttributes.hasValue(6)) {
                ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(2131558531, this);
            ViewCompat.setAccessibilityLiveRegion(this, 1);
            ViewCompat.setImportantForAccessibility(this, 1);
            ViewCompat.setFitsSystemWindows(this, true);
            ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
        }

        /* renamed from: c */
        private static void m69598c(View view, int i, int i2) {
            if (ViewCompat.isPaddingRelative(view)) {
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
            } else {
                view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
            }
        }

        /* renamed from: d */
        private boolean m69599d(int i, int i2, int i3) {
            boolean z;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            } else {
                z = false;
            }
            if (this.f50275a.getPaddingTop() == i2 && this.f50275a.getPaddingBottom() == i3) {
                return z;
            }
            m69598c(this.f50275a, i2, i3);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo58943a(int i, int i2) {
            ViewCompat.setAlpha(this.f50275a, 0.0f);
            long j = (long) i2;
            long j2 = (long) i;
            ViewCompat.animate(this.f50275a).alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            if (this.f50276c.getVisibility() == 0) {
                ViewCompat.setAlpha(this.f50276c, 0.0f);
                ViewCompat.animate(this.f50276c).alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo58944b(int i, int i2) {
            ViewCompat.setAlpha(this.f50275a, 1.0f);
            long j = (long) i2;
            long j2 = (long) i;
            ViewCompat.animate(this.f50275a).alpha(0.0f).setDuration(j).setStartDelay(j2).start();
            if (this.f50276c.getVisibility() == 0) {
                ViewCompat.setAlpha(this.f50276c, 1.0f);
                ViewCompat.animate(this.f50276c).alpha(0.0f).setDuration(j).setStartDelay(j2).start();
            }
        }

        /* access modifiers changed from: package-private */
        public Button getActionView() {
            return this.f50276c;
        }

        /* access modifiers changed from: package-private */
        public TextView getMessageView() {
            return this.f50275a;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f50280o;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f50280o;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            this.f50275a = (TextView) findViewById(2131363815);
            this.f50276c = (Button) findViewById(2131363814);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            OnLayoutChangeListener onLayoutChangeListener = this.f50279g;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.mo58939a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            if (m69599d(1, r0, r0 - r1) != false) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            if (m69599d(0, r0, r0) != false) goto L_0x0062;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                super.onMeasure(r8, r9)
                int r0 = r7.f50277d
                if (r0 <= 0) goto L_0x0018
                int r0 = r7.getMeasuredWidth()
                int r1 = r7.f50277d
                if (r0 <= r1) goto L_0x0018
                r8 = 1073741824(0x40000000, float:2.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
                super.onMeasure(r8, r9)
            L_0x0018:
                android.content.res.Resources r0 = r7.getResources()
                r1 = 2131165351(0x7f0700a7, float:1.7944917E38)
                int r0 = r0.getDimensionPixelSize(r1)
                android.content.res.Resources r1 = r7.getResources()
                r2 = 2131165350(0x7f0700a6, float:1.7944915E38)
                int r1 = r1.getDimensionPixelSize(r2)
                android.widget.TextView r2 = r7.f50275a
                android.text.Layout r2 = r2.getLayout()
                int r2 = r2.getLineCount()
                r3 = 0
                r4 = 1
                if (r2 <= r4) goto L_0x003e
                r2 = 1
                goto L_0x003f
            L_0x003e:
                r2 = 0
            L_0x003f:
                if (r2 == 0) goto L_0x0058
                int r5 = r7.f50278f
                if (r5 <= 0) goto L_0x0058
                android.widget.Button r5 = r7.f50276c
                int r5 = r5.getMeasuredWidth()
                int r6 = r7.f50278f
                if (r5 <= r6) goto L_0x0058
                int r1 = r0 - r1
                boolean r0 = r7.m69599d(r4, r0, r1)
                if (r0 == 0) goto L_0x0063
                goto L_0x0062
            L_0x0058:
                if (r2 == 0) goto L_0x005b
                goto L_0x005c
            L_0x005b:
                r0 = r1
            L_0x005c:
                boolean r0 = r7.m69599d(r3, r0, r0)
                if (r0 == 0) goto L_0x0063
            L_0x0062:
                r3 = 1
            L_0x0063:
                if (r3 == 0) goto L_0x0068
                super.onMeasure(r8, r9)
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarAnimate.SnackbarLayout.onMeasure(int, int):void");
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f50280o = onAttachStateChangeListener;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
            this.f50279g = onLayoutChangeListener;
        }
    }

    private SnackbarAnimate(ViewGroup viewGroup) {
        this.f50257a = viewGroup;
        Context context = viewGroup.getContext();
        this.f50258b = context;
        this.f50259c = (SnackbarLayout) LayoutInflater.from(context).inflate(C17535R$layout.snackbar_animate, viewGroup, false);
        this.f50262f = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* renamed from: b */
    private void m69571b(final int i) {
        ViewCompat.animate(this.f50259c).translationY((float) this.f50259c.getHeight()).setInterpolator(new FastOutSlowInInterpolator()).setDuration(250).setListener(new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(View view) {
                SnackbarAnimate.this.mo58924j(i);
            }

            public void onAnimationStart(View view) {
                SnackbarAnimate.this.f50259c.mo58944b(0, 180);
            }
        }).start();
    }

    /* renamed from: d */
    private static ViewGroup m69572d(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @NonNull
    /* renamed from: h */
    public static SnackbarAnimate m69573h(@NonNull View view, @StringRes int i, int i2) {
        return m69574i(view, view.getResources().getText(i), i2);
    }

    @NonNull
    /* renamed from: i */
    public static SnackbarAnimate m69574i(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        SnackbarAnimate snackbarAnimate = new SnackbarAnimate(m69572d(view));
        snackbarAnimate.mo58930p(charSequence);
        snackbarAnimate.mo58929o(i);
        return snackbarAnimate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo58919a() {
        SnackbarLayout snackbarLayout = this.f50259c;
        ViewCompat.setTranslationY(snackbarLayout, (float) snackbarLayout.getHeight());
        ViewCompat.animate(this.f50259c).translationY(0.0f).setInterpolator(new FastOutSlowInInterpolator()).setDuration(250).setListener(new ViewPropertyAnimatorListenerAdapter() {
            public void onAnimationEnd(View view) {
                SnackbarAnimate.this.mo58925k();
            }

            public void onAnimationStart(View view) {
                SnackbarAnimate.this.f50259c.mo58943a(70, 180);
            }
        }).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58920c(int i) {
        SnackbarManager.m69609c().mo58960b(this.f50263g, i);
    }

    @NonNull
    /* renamed from: e */
    public View mo58921e() {
        return this.f50259c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo58922f(int i) {
        if (!mo58931q() || this.f50259c.getVisibility() != 0) {
            mo58924j(i);
        } else {
            m69571b(i);
        }
    }

    /* renamed from: g */
    public boolean mo58923g() {
        return SnackbarManager.m69609c().mo58962e(this.f50263g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo58924j(int i) {
        SnackbarManager.m69609c().mo58963h(this.f50263g);
        Callback callback = this.f50261e;
        if (callback != null) {
            callback.mo58941a(this, i);
        }
        ViewParent parent = this.f50259c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f50259c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo58925k() {
        SnackbarManager.m69609c().mo58964i(this.f50263g);
        Callback callback = this.f50261e;
        if (callback != null) {
            callback.mo58942b(this);
        }
    }

    @NonNull
    /* renamed from: l */
    public SnackbarAnimate mo58926l(@StringRes int i, View.OnClickListener onClickListener) {
        return mo58927m(this.f50258b.getText(i), onClickListener);
    }

    @NonNull
    /* renamed from: m */
    public SnackbarAnimate mo58927m(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button actionView = this.f50259c.getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
        } else {
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    SnackbarAnimate.this.mo58920c(1);
                }
            });
        }
        return this;
    }

    @NonNull
    /* renamed from: n */
    public SnackbarAnimate mo58928n(@ColorInt int i) {
        this.f50259c.getActionView().setTextColor(i);
        return this;
    }

    @NonNull
    /* renamed from: o */
    public SnackbarAnimate mo58929o(int i) {
        this.f50260d = i;
        return this;
    }

    @NonNull
    /* renamed from: p */
    public SnackbarAnimate mo58930p(@NonNull CharSequence charSequence) {
        this.f50259c.getMessageView().setText(charSequence);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo58931q() {
        return true;
    }

    /* renamed from: r */
    public void mo58932r() {
        SnackbarManager.m69609c().mo58967m(this.f50260d, this.f50263g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo58933s() {
        if (this.f50259c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f50259c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                Behavior behavior = new Behavior();
                behavior.mo56852h(0.1f);
                behavior.mo56850f(0.6f);
                behavior.mo56853i(0);
                behavior.mo56851g(new SwipeDismissBehavior.OnDismissListener() {
                    /* renamed from: a */
                    public void mo56854a(View view) {
                        view.setVisibility(8);
                        SnackbarAnimate.this.mo58920c(0);
                    }

                    /* renamed from: b */
                    public void mo56855b(int i) {
                        if (i == 0) {
                            SnackbarManager.m69609c().mo58966k(SnackbarAnimate.this.f50263g);
                        } else if (i == 1 || i == 2) {
                            SnackbarManager.m69609c().mo58965j(SnackbarAnimate.this.f50263g);
                        }
                    }
                });
                layoutParams2.setBehavior(behavior);
                layoutParams2.insetEdge = 80;
            }
            this.f50257a.addView(this.f50259c);
        }
        this.f50259c.setOnAttachStateChangeListener(new SnackbarLayout.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (SnackbarAnimate.this.mo58923g()) {
                    SnackbarAnimate.f50256h.post(new Runnable() {
                        public void run() {
                            SnackbarAnimate.this.mo58924j(3);
                        }
                    });
                }
            }
        });
        if (!ViewCompat.isLaidOut(this.f50259c)) {
            this.f50259c.setOnLayoutChangeListener(new SnackbarLayout.OnLayoutChangeListener() {
                /* renamed from: a */
                public void mo58939a(View view, int i, int i2, int i3, int i4) {
                    SnackbarAnimate.this.f50259c.setOnLayoutChangeListener((SnackbarLayout.OnLayoutChangeListener) null);
                    if (SnackbarAnimate.this.mo58931q()) {
                        SnackbarAnimate.this.mo58919a();
                    } else {
                        SnackbarAnimate.this.mo58925k();
                    }
                }
            });
        } else if (mo58931q()) {
            mo58919a();
        } else {
            mo58925k();
        }
    }
}
