package com.arlosoft.macrodroid.bubbleshowcase;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import p076d1.C11927b;
import p076d1.C11928c;
import p076d1.C7232g;
import p076d1.C7241l;
import p076d1.C7242m;

/* compiled from: BubbleMessageView.kt */
public final class BubbleMessageView extends ConstraintLayout {

    /* renamed from: A */
    private ArrayList<C7232g.C7233a> f10040A;

    /* renamed from: B */
    private Paint f10041B;

    /* renamed from: C */
    public Map<Integer, View> f10042C = new LinkedHashMap();

    /* renamed from: a */
    private final int f10043a;

    /* renamed from: c */
    private View f10044c;

    /* renamed from: d */
    private ImageView f10045d;

    /* renamed from: f */
    private TextView f10046f;

    /* renamed from: g */
    private TextView f10047g;

    /* renamed from: o */
    private ImageView f10048o;

    /* renamed from: p */
    private ConstraintLayout f10049p;

    /* renamed from: s */
    private RectF f10050s;

    /* renamed from: z */
    private int f10051z;

    /* renamed from: com.arlosoft.macrodroid.bubbleshowcase.BubbleMessageView$a */
    /* compiled from: BubbleMessageView.kt */
    public static final class C3878a {

        /* renamed from: a */
        public WeakReference<Context> f10052a;

        /* renamed from: b */
        private RectF f10053b;

        /* renamed from: c */
        private Drawable f10054c;

        /* renamed from: d */
        private Boolean f10055d;

        /* renamed from: e */
        private String f10056e;

        /* renamed from: f */
        private String f10057f;

        /* renamed from: g */
        private Drawable f10058g;

        /* renamed from: h */
        private Integer f10059h;

        /* renamed from: i */
        private Integer f10060i;

        /* renamed from: j */
        private Integer f10061j;

        /* renamed from: k */
        private Integer f10062k;

        /* renamed from: l */
        private ArrayList<C7232g.C7233a> f10063l = new ArrayList<>();

        /* renamed from: m */
        private C7241l f10064m;

        /* renamed from: A */
        public final C3878a mo27451A(String str) {
            this.f10056e = str;
            return this;
        }

        /* renamed from: B */
        public final C3878a mo27452B(Integer num) {
            this.f10061j = num;
            return this;
        }

        /* renamed from: a */
        public final C3878a mo27453a(List<? extends C7232g.C7233a> list) {
            C13706o.m87929f(list, "arrowPosition");
            this.f10063l.clear();
            this.f10063l.addAll(list);
            return this;
        }

        /* renamed from: b */
        public final C3878a mo27454b(Integer num) {
            this.f10059h = num;
            return this;
        }

        /* renamed from: c */
        public final BubbleMessageView mo27455c() {
            Object obj = mo27462j().get();
            C13706o.m87926c(obj);
            return new BubbleMessageView((Context) obj, this);
        }

        /* renamed from: d */
        public final C3878a mo27456d(Drawable drawable) {
            this.f10058g = drawable;
            return this;
        }

        /* renamed from: e */
        public final C3878a mo27457e(boolean z) {
            this.f10055d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: f */
        public final C3878a mo27458f(Context context) {
            C13706o.m87929f(context, "context");
            mo27474v(new WeakReference(context));
            return this;
        }

        /* renamed from: g */
        public final ArrayList<C7232g.C7233a> mo27459g() {
            return this.f10063l;
        }

        /* renamed from: h */
        public final Integer mo27460h() {
            return this.f10059h;
        }

        /* renamed from: i */
        public final Drawable mo27461i() {
            return this.f10058g;
        }

        /* renamed from: j */
        public final WeakReference<Context> mo27462j() {
            WeakReference<Context> weakReference = this.f10052a;
            if (weakReference != null) {
                return weakReference;
            }
            C13706o.m87945v("mContext");
            return null;
        }

        /* renamed from: k */
        public final Boolean mo27463k() {
            return this.f10055d;
        }

        /* renamed from: l */
        public final Drawable mo27464l() {
            return this.f10054c;
        }

        /* renamed from: m */
        public final C7241l mo27465m() {
            return this.f10064m;
        }

        /* renamed from: n */
        public final String mo27466n() {
            return this.f10057f;
        }

        /* renamed from: o */
        public final Integer mo27467o() {
            return this.f10062k;
        }

        /* renamed from: p */
        public final RectF mo27468p() {
            return this.f10053b;
        }

        /* renamed from: q */
        public final Integer mo27469q() {
            return this.f10060i;
        }

        /* renamed from: r */
        public final String mo27470r() {
            return this.f10056e;
        }

        /* renamed from: s */
        public final Integer mo27471s() {
            return this.f10061j;
        }

        /* renamed from: t */
        public final C3878a mo27472t(Drawable drawable) {
            this.f10054c = drawable;
            return this;
        }

        /* renamed from: u */
        public final C3878a mo27473u(C7241l lVar) {
            this.f10064m = lVar;
            return this;
        }

        /* renamed from: v */
        public final void mo27474v(WeakReference<Context> weakReference) {
            C13706o.m87929f(weakReference, "<set-?>");
            this.f10052a = weakReference;
        }

        /* renamed from: w */
        public final C3878a mo27475w(String str) {
            this.f10057f = str;
            return this;
        }

        /* renamed from: x */
        public final C3878a mo27476x(Integer num) {
            this.f10062k = num;
            return this;
        }

        /* renamed from: y */
        public final C3878a mo27477y(RectF rectF) {
            C13706o.m87929f(rectF, "targetViewLocationOnScreen");
            this.f10053b = rectF;
            return this;
        }

        /* renamed from: z */
        public final C3878a mo27478z(Integer num) {
            this.f10060i = num;
            return this;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.bubbleshowcase.BubbleMessageView$b */
    /* compiled from: BubbleMessageView.kt */
    public /* synthetic */ class C3879b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10065a;

        static {
            int[] iArr = new int[C7232g.C7233a.values().length];
            iArr[C7232g.C7233a.LEFT.ordinal()] = 1;
            iArr[C7232g.C7233a.RIGHT.ordinal()] = 2;
            iArr[C7232g.C7233a.TOP.ordinal()] = 3;
            iArr[C7232g.C7233a.BOTTOM.ordinal()] = 4;
            f10065a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BubbleMessageView(Context context, C3878a aVar) {
        super(context);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(aVar, "builder");
        this.f10043a = 20;
        this.f10051z = ContextCompat.getColor(getContext(), C17528R$color.primary);
        this.f10040A = new ArrayList<>();
        m15084k();
        setAttributes(aVar);
        setBubbleListener(aVar);
    }

    /* renamed from: c */
    private final void m15077c() {
        this.f10045d = (ImageView) findViewById(C17532R$id.imageViewShowCase);
        this.f10048o = (ImageView) findViewById(C17532R$id.imageViewShowCaseClose);
        this.f10046f = (TextView) findViewById(C17532R$id.textViewShowCaseTitle);
        this.f10047g = (TextView) findViewById(C17532R$id.textViewShowCaseText);
        this.f10049p = (ConstraintLayout) findViewById(C17532R$id.showCaseMessageViewLayout);
    }

    /* renamed from: d */
    private final void m15078d(Canvas canvas, C7232g.C7233a aVar, RectF rectF) {
        int i;
        int i2;
        int i3 = C3879b.f10065a[aVar.ordinal()];
        if (i3 == 1) {
            i2 = getMargin();
            i = rectF != null ? m15082i(rectF) : getHeight() / 2;
        } else if (i3 == 2) {
            i2 = getViewWidth() - getMargin();
            i = rectF != null ? m15082i(rectF) : getHeight() / 2;
        } else if (i3 == 3) {
            i2 = rectF != null ? m15081h(rectF) : getWidth() / 2;
            i = getMargin();
        } else if (i3 == 4) {
            i2 = rectF != null ? m15081h(rectF) : getWidth() / 2;
            i = getHeight() - getMargin();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        m15080g(canvas, this.f10041B, i2, i, C7242m.f17670a.mo37102a(this.f10043a));
    }

    /* renamed from: f */
    private final void m15079f(Canvas canvas) {
        RectF rectF = new RectF((float) getMargin(), (float) getMargin(), ((float) getViewWidth()) - ((float) getMargin()), ((float) getHeight()) - ((float) getMargin()));
        Paint paint = this.f10041B;
        C13706o.m87926c(paint);
        canvas.drawRoundRect(rectF, 10.0f, 10.0f, paint);
    }

    /* renamed from: g */
    private final void m15080g(Canvas canvas, Paint paint, int i, int i2, int i3) {
        int i4 = i3 / 2;
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) (i2 + i4);
        path.moveTo(f, f2);
        float f3 = (float) i2;
        path.lineTo((float) (i - i4), f3);
        path.lineTo(f, (float) (i2 - i4));
        path.lineTo((float) (i + i4), f3);
        path.lineTo(f, f2);
        path.close();
        C13706o.m87926c(paint);
        canvas.drawPath(path, paint);
    }

    private final int getMargin() {
        return C7242m.f17670a.mo37102a(20);
    }

    private final int getSecurityArrowMargin() {
        return getMargin() + C7242m.f17670a.mo37102a((this.f10043a * 2) / 3);
    }

    private final int getViewWidth() {
        return getWidth();
    }

    /* renamed from: h */
    private final int m15081h(RectF rectF) {
        if (m15087n(rectF)) {
            return getWidth() - getSecurityArrowMargin();
        }
        if (m15086m(rectF)) {
            return getSecurityArrowMargin();
        }
        C13706o.m87926c(rectF);
        return Math.round(rectF.centerX() - ((float) C7242m.f17670a.mo37103b(this)));
    }

    /* renamed from: i */
    private final int m15082i(RectF rectF) {
        if (m15085l(rectF)) {
            return getHeight() - getSecurityArrowMargin();
        }
        if (m15088o(rectF)) {
            return getSecurityArrowMargin();
        }
        C13706o.m87926c(rectF);
        float centerY = rectF.centerY();
        C7242m mVar = C7242m.f17670a;
        Context context = getContext();
        C13706o.m87928e(context, "context");
        return Math.round((centerY + ((float) mVar.mo37107f(context))) - ((float) mVar.mo37104c(this)));
    }

    /* renamed from: j */
    private final void m15083j() {
        this.f10044c = ViewGroup.inflate(getContext(), C17535R$layout.view_bubble_message, this);
    }

    /* renamed from: k */
    private final void m15084k() {
        setWillNotDraw(false);
        m15083j();
        m15077c();
    }

    /* renamed from: l */
    private final boolean m15085l(RectF rectF) {
        C13706o.m87926c(rectF);
        float centerY = rectF.centerY();
        C7242m mVar = C7242m.f17670a;
        int c = (mVar.mo37104c(this) + getHeight()) - getSecurityArrowMargin();
        Context context = getContext();
        C13706o.m87928e(context, "context");
        return centerY > ((float) (c - mVar.mo37107f(context)));
    }

    /* renamed from: m */
    private final boolean m15086m(RectF rectF) {
        C13706o.m87926c(rectF);
        return rectF.centerX() < ((float) (C7242m.f17670a.mo37103b(this) + getSecurityArrowMargin()));
    }

    /* renamed from: n */
    private final boolean m15087n(RectF rectF) {
        C13706o.m87926c(rectF);
        return rectF.centerX() > ((float) ((C7242m.f17670a.mo37103b(this) + getWidth()) - getSecurityArrowMargin()));
    }

    /* renamed from: o */
    private final boolean m15088o(RectF rectF) {
        C13706o.m87926c(rectF);
        float centerY = rectF.centerY();
        C7242m mVar = C7242m.f17670a;
        int c = mVar.mo37104c(this) + getSecurityArrowMargin();
        Context context = getContext();
        C13706o.m87928e(context, "context");
        return centerY < ((float) (c - mVar.mo37107f(context)));
    }

    /* renamed from: p */
    private final void m15089p() {
        Paint paint = new Paint(1);
        this.f10041B = paint;
        paint.setColor(this.f10051z);
        Paint paint2 = this.f10041B;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.f10041B;
        if (paint3 != null) {
            paint3.setStrokeWidth(4.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m15090q(C3878a aVar, View view) {
        C13706o.m87929f(aVar, "$builder");
        C7241l m = aVar.mo27465m();
        if (m != null) {
            m.mo37069a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m15091r(C3878a aVar, View view) {
        C13706o.m87929f(aVar, "$builder");
        C7241l m = aVar.mo27465m();
        if (m != null) {
            m.mo37070b();
        }
    }

    private final void setAttributes(C3878a aVar) {
        ImageView imageView;
        if (aVar.mo27464l() != null) {
            ImageView imageView2 = this.f10045d;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f10045d;
            if (imageView3 != null) {
                Drawable l = aVar.mo27464l();
                C13706o.m87926c(l);
                imageView3.setImageDrawable(l);
            }
        }
        if (aVar.mo27461i() != null) {
            ImageView imageView4 = this.f10048o;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.f10048o;
            if (imageView5 != null) {
                Drawable i = aVar.mo27461i();
                C13706o.m87926c(i);
                imageView5.setImageDrawable(i);
            }
        }
        if (aVar.mo27463k() != null) {
            Boolean k = aVar.mo27463k();
            C13706o.m87926c(k);
            if (k.booleanValue() && (imageView = this.f10048o) != null) {
                imageView.setVisibility(4);
            }
        }
        if (aVar.mo27470r() != null) {
            TextView textView = this.f10046f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f10046f;
            if (textView2 != null) {
                textView2.setText(aVar.mo27470r());
            }
        }
        if (aVar.mo27466n() != null) {
            TextView textView3 = this.f10047g;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.f10047g;
            if (textView4 != null) {
                textView4.setText(aVar.mo27466n());
            }
        }
        Integer q = aVar.mo27469q();
        if (q != null) {
            q.intValue();
            TextView textView5 = this.f10046f;
            if (textView5 != null) {
                Integer q2 = aVar.mo27469q();
                C13706o.m87926c(q2);
                textView5.setTextColor(q2.intValue());
            }
            TextView textView6 = this.f10047g;
            if (textView6 != null) {
                Integer q3 = aVar.mo27469q();
                C13706o.m87926c(q3);
                textView6.setTextColor(q3.intValue());
            }
        }
        Integer s = aVar.mo27471s();
        if (s != null) {
            s.intValue();
            TextView textView7 = this.f10046f;
            if (textView7 != null) {
                Integer s2 = aVar.mo27471s();
                C13706o.m87926c(s2);
                textView7.setTextSize(2, (float) s2.intValue());
            }
        }
        Integer o = aVar.mo27467o();
        if (o != null) {
            o.intValue();
            TextView textView8 = this.f10047g;
            if (textView8 != null) {
                Integer o2 = aVar.mo27467o();
                C13706o.m87926c(o2);
                textView8.setTextSize(2, (float) o2.intValue());
            }
        }
        Integer h = aVar.mo27460h();
        if (h != null) {
            h.intValue();
            Integer h2 = aVar.mo27460h();
            C13706o.m87926c(h2);
            this.f10051z = h2.intValue();
        }
        this.f10040A = aVar.mo27459g();
        this.f10050s = aVar.mo27468p();
    }

    private final void setBubbleListener(C3878a aVar) {
        ImageView imageView = this.f10048o;
        if (imageView != null) {
            imageView.setOnClickListener(new C11928c(aVar));
        }
        View view = this.f10044c;
        if (view != null) {
            view.setOnClickListener(new C11927b(aVar));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C13706o.m87929f(canvas, "canvas");
        super.onDraw(canvas);
        m15089p();
        m15079f(canvas);
        Iterator<C7232g.C7233a> it = this.f10040A.iterator();
        while (it.hasNext()) {
            C7232g.C7233a next = it.next();
            C13706o.m87928e(next, "arrowPosition");
            m15078d(canvas, next, this.f10050s);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BubbleMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
        this.f10043a = 20;
        this.f10051z = ContextCompat.getColor(getContext(), C17528R$color.primary);
        this.f10040A = new ArrayList<>();
        m15084k();
    }
}
