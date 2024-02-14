package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R$attr;
import com.afollestad.materialdialogs.R$dimen;
import com.afollestad.materialdialogs.R$id;
import com.afollestad.materialdialogs.R$styleable;
import p037m.C2007e;
import p037m.C2023g;
import p040o.C2039a;

public class MDRootLayout extends ViewGroup {

    /* renamed from: A */
    private boolean f783A;

    /* renamed from: B */
    private boolean f784B;

    /* renamed from: C */
    private int f785C;

    /* renamed from: D */
    private int f786D;

    /* renamed from: E */
    private int f787E;

    /* renamed from: F */
    private C2007e f788F = C2007e.START;

    /* renamed from: G */
    private int f789G;

    /* renamed from: H */
    private Paint f790H;

    /* renamed from: I */
    private ViewTreeObserver.OnScrollChangedListener f791I;

    /* renamed from: J */
    private ViewTreeObserver.OnScrollChangedListener f792J;

    /* renamed from: K */
    private int f793K;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MDButton[] f794a = new MDButton[3];

    /* renamed from: c */
    private int f795c;

    /* renamed from: d */
    private View f796d;

    /* renamed from: f */
    private View f797f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f798g = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f799o = false;

    /* renamed from: p */
    private C2023g f800p = C2023g.ADAPTIVE;

    /* renamed from: s */
    private boolean f801s = false;

    /* renamed from: z */
    private boolean f802z = true;

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$a */
    class C1432a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f803a;

        /* renamed from: c */
        final /* synthetic */ boolean f804c;

        /* renamed from: d */
        final /* synthetic */ boolean f805d;

        C1432a(View view, boolean z, boolean z2) {
            this.f803a = view;
            this.f804c = z;
            this.f805d = z2;
        }

        public boolean onPreDraw() {
            if (this.f803a.getMeasuredHeight() == 0) {
                return true;
            }
            if (!MDRootLayout.m672l((WebView) this.f803a)) {
                if (this.f804c) {
                    boolean unused = MDRootLayout.this.f798g = false;
                }
                if (this.f805d) {
                    boolean unused2 = MDRootLayout.this.f799o = false;
                }
            } else {
                MDRootLayout.this.m668h((ViewGroup) this.f803a, this.f804c, this.f805d);
            }
            this.f803a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$b */
    class C1433b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f807a;

        /* renamed from: b */
        final /* synthetic */ boolean f808b;

        /* renamed from: c */
        final /* synthetic */ boolean f809c;

        C1433b(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f807a = viewGroup;
            this.f808b = z;
            this.f809c = z2;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            MDButton[] e = MDRootLayout.this.f794a;
            int length = e.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MDButton mDButton = e[i3];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m676p(this.f807a, this.f808b, this.f809c, z);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$c */
    class C1434c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f811a;

        /* renamed from: c */
        final /* synthetic */ boolean f812c;

        /* renamed from: d */
        final /* synthetic */ boolean f813d;

        C1434c(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f811a = viewGroup;
            this.f812c = z;
            this.f813d = z2;
        }

        public void onScrollChanged() {
            MDButton[] e = MDRootLayout.this.f794a;
            int length = e.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    MDButton mDButton = e[i];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f811a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m677q((WebView) viewGroup, this.f812c, this.f813d, z);
            } else {
                MDRootLayout.this.m676p(viewGroup, this.f812c, this.f813d, z);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$d */
    static /* synthetic */ class C1435d {

        /* renamed from: a */
        static final /* synthetic */ int[] f815a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m.e[] r0 = p037m.C2007e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f815a = r0
                m.e r1 = p037m.C2007e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f815a     // Catch:{ NoSuchFieldError -> 0x001d }
                m.e r1 = p037m.C2007e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.C1435d.<clinit>():void");
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m675o(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m668h(ViewGroup viewGroup, boolean z, boolean z2) {
        if ((!z2 && this.f791I == null) || (z2 && this.f792J == null)) {
            if (viewGroup instanceof RecyclerView) {
                C1433b bVar = new C1433b(viewGroup, z, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.addOnScrollListener(bVar);
                bVar.onScrolled(recyclerView, 0, 0);
                return;
            }
            C1434c cVar = new C1434c(viewGroup, z, z2);
            if (!z2) {
                this.f791I = cVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f791I);
            } else {
                this.f792J = cVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f792J);
            }
            cVar.onScrollChanged();
        }
    }

    /* renamed from: i */
    private static boolean m669i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        boolean z = adapterView.getFirstVisiblePosition() == 0;
        boolean z2 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
        if (!z || !z2 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m670j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: k */
    private static boolean m671k(ScrollView scrollView) {
        if (scrollView.getChildCount() != 0 && (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m672l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    @Nullable
    /* renamed from: m */
    private static View m673m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: n */
    private static View m674n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    private void m675o(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MDRootLayout, i, 0);
        this.f783A = obtainStyledAttributes.getBoolean(R$styleable.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.f785C = resources.getDimensionPixelSize(R$dimen.md_notitle_vertical_padding);
        this.f786D = resources.getDimensionPixelSize(R$dimen.md_button_frame_vertical_padding);
        this.f789G = resources.getDimensionPixelSize(R$dimen.md_button_padding_frame_side);
        this.f787E = resources.getDimensionPixelSize(R$dimen.md_button_height);
        this.f790H = new Paint();
        this.f793K = resources.getDimensionPixelSize(R$dimen.md_divider_height);
        this.f790H.setColor(C2039a.m8442l(context, R$attr.md_divider_color));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m676p(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.f796d;
            this.f798g = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            this.f799o = z4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m677q(WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = this.f796d;
            this.f798g = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            this.f799o = z4;
        }
    }

    /* renamed from: r */
    private void m678r() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i = C1435d.f815a[this.f788F.ordinal()];
            if (i == 1) {
                this.f788F = C2007e.END;
            } else if (i == 2) {
                this.f788F = C2007e.START;
            }
        }
    }

    /* renamed from: s */
    private static boolean m679s(View view) {
        boolean z = true;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!z2 || !(view instanceof MDButton)) {
            return z2;
        }
        if (((MDButton) view).getText().toString().trim().length() <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    private void m680u(View view, boolean z, boolean z2) {
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (m671k(scrollView)) {
                    m668h(scrollView, z, z2);
                    return;
                }
                if (z) {
                    this.f798g = false;
                }
                if (z2) {
                    this.f799o = false;
                }
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                if (m669i(adapterView)) {
                    m668h(adapterView, z, z2);
                    return;
                }
                if (z) {
                    this.f798g = false;
                }
                if (z2) {
                    this.f799o = false;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new C1432a(view, z, z2));
            } else if (view instanceof RecyclerView) {
                boolean j = m670j((RecyclerView) view);
                if (z) {
                    this.f798g = j;
                }
                if (z2) {
                    this.f799o = j;
                }
                if (j) {
                    m668h((ViewGroup) view, z, z2);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View n = m674n(viewGroup);
                m680u(n, z, z2);
                View m = m673m(viewGroup);
                if (m != n) {
                    m680u(m, false, true);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f797f;
        if (view != null) {
            if (this.f798g) {
                int top = view.getTop();
                canvas.drawRect(0.0f, (float) (top - this.f793K), (float) getMeasuredWidth(), (float) top, this.f790H);
            }
            if (this.f799o) {
                int bottom = this.f797f.getBottom();
                canvas.drawRect(0.0f, (float) bottom, (float) getMeasuredWidth(), (float) (bottom + this.f793K), this.f790H);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == R$id.md_titleFrame) {
                this.f796d = childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNeutral) {
                this.f794a[0] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultNegative) {
                this.f794a[1] = (MDButton) childAt;
            } else if (childAt.getId() == R$id.md_buttonDefaultPositive) {
                this.f794a[2] = (MDButton) childAt;
            } else {
                this.f797f = childAt;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (m679s(this.f796d)) {
            int measuredHeight = this.f796d.getMeasuredHeight() + i2;
            this.f796d.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.f784B && this.f802z) {
            i2 += this.f785C;
        }
        if (m679s(this.f797f)) {
            View view = this.f797f;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        if (this.f801s) {
            int i14 = i4 - this.f786D;
            for (MDButton mDButton : this.f794a) {
                if (m679s(mDButton)) {
                    mDButton.layout(i, i14 - mDButton.getMeasuredHeight(), i3, i14);
                    i14 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f802z) {
                i4 -= this.f786D;
            }
            int i15 = i4 - this.f787E;
            int i16 = this.f789G;
            if (m679s(this.f794a[2])) {
                if (this.f788F == C2007e.END) {
                    i13 = i + i16;
                    i12 = this.f794a[2].getMeasuredWidth() + i13;
                    i5 = -1;
                } else {
                    int i17 = i3 - i16;
                    i13 = i17 - this.f794a[2].getMeasuredWidth();
                    i12 = i17;
                    i5 = i13;
                }
                this.f794a[2].layout(i13, i15, i12, i4);
                i16 += this.f794a[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            if (m679s(this.f794a[1])) {
                C2007e eVar = this.f788F;
                if (eVar == C2007e.END) {
                    i11 = i16 + i;
                    i10 = this.f794a[1].getMeasuredWidth() + i11;
                } else if (eVar == C2007e.START) {
                    i10 = i3 - i16;
                    i11 = i10 - this.f794a[1].getMeasuredWidth();
                } else {
                    i11 = this.f789G + i;
                    i10 = this.f794a[1].getMeasuredWidth() + i11;
                    i6 = i10;
                    this.f794a[1].layout(i11, i15, i10, i4);
                }
                i6 = -1;
                this.f794a[1].layout(i11, i15, i10, i4);
            } else {
                i6 = -1;
            }
            if (m679s(this.f794a[0])) {
                C2007e eVar2 = this.f788F;
                if (eVar2 == C2007e.END) {
                    i7 = i3 - this.f789G;
                    i8 = i7 - this.f794a[0].getMeasuredWidth();
                } else if (eVar2 == C2007e.START) {
                    i8 = i + this.f789G;
                    i7 = this.f794a[0].getMeasuredWidth() + i8;
                } else {
                    if (i6 != -1 || i5 == -1) {
                        if (i5 == -1 && i6 != -1) {
                            i9 = this.f794a[0].getMeasuredWidth();
                        } else if (i5 == -1) {
                            i6 = ((i3 - i) / 2) - (this.f794a[0].getMeasuredWidth() / 2);
                            i9 = this.f794a[0].getMeasuredWidth();
                        }
                        i5 = i6 + i9;
                    } else {
                        i6 = i5 - this.f794a[0].getMeasuredWidth();
                    }
                    i7 = i5;
                    i8 = i6;
                }
                this.f794a[0].layout(i8, i15, i7, i4);
            }
        }
        m680u(this.f797f, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r2 = r11.f795c
            if (r1 <= r2) goto L_0x000d
            r1 = r2
        L_0x000d:
            r2 = 1
            r11.f802z = r2
            m.g r3 = r11.f800p
            m.g r4 = p037m.C2023g.ALWAYS
            r5 = 0
            if (r3 != r4) goto L_0x001a
            r3 = 1
        L_0x0018:
            r8 = 0
            goto L_0x0058
        L_0x001a:
            m.g r4 = p037m.C2023g.NEVER
            if (r3 != r4) goto L_0x0020
            r3 = 0
            goto L_0x0018
        L_0x0020:
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f794a
            int r4 = r3.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0041
            r9 = r3[r6]
            if (r9 == 0) goto L_0x003e
            boolean r10 = m679s(r9)
            if (r10 == 0) goto L_0x003e
            r9.mo16906b(r5, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredWidth()
            int r7 = r7 + r8
            r8 = 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0041:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.afollestad.materialdialogs.R$dimen.md_neutral_button_margin
            int r3 = r3.getDimensionPixelSize(r4)
            int r3 = r3 * 2
            int r3 = r0 - r3
            if (r7 <= r3) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r11.f801s = r3
            if (r3 == 0) goto L_0x007c
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f794a
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x0061:
            if (r6 >= r4) goto L_0x007d
            r9 = r3[r6]
            if (r9 == 0) goto L_0x0079
            boolean r10 = m679s(r9)
            if (r10 == 0) goto L_0x0079
            r9.mo16906b(r2, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredHeight()
            int r7 = r7 + r8
            r8 = 1
        L_0x0079:
            int r6 = r6 + 1
            goto L_0x0061
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r8 == 0) goto L_0x0099
            boolean r12 = r11.f801s
            if (r12 == 0) goto L_0x008e
            int r12 = r1 - r7
            int r13 = r11.f786D
            int r3 = r13 * 2
            int r3 = r3 + r5
            int r13 = r13 * 2
            int r13 = r13 + r5
            goto L_0x00a1
        L_0x008e:
            int r12 = r11.f787E
            int r12 = r1 - r12
            int r13 = r11.f786D
            int r13 = r13 * 2
            int r3 = r13 + 0
            goto L_0x00a0
        L_0x0099:
            int r12 = r11.f786D
            int r12 = r12 * 2
            int r3 = r12 + 0
            r12 = r1
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            android.view.View r4 = r11.f796d
            boolean r4 = m679s(r4)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x00bc
            android.view.View r4 = r11.f796d
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r4.measure(r7, r5)
            android.view.View r4 = r11.f796d
            int r4 = r4.getMeasuredHeight()
            int r12 = r12 - r4
            goto L_0x00c3
        L_0x00bc:
            boolean r4 = r11.f784B
            if (r4 != 0) goto L_0x00c3
            int r4 = r11.f785C
            int r3 = r3 + r4
        L_0x00c3:
            android.view.View r4 = r11.f797f
            boolean r4 = m679s(r4)
            if (r4 == 0) goto L_0x0110
            android.view.View r4 = r11.f797f
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r7 = r12 - r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r4.measure(r6, r7)
            android.view.View r4 = r11.f797f
            int r4 = r4.getMeasuredHeight()
            int r6 = r12 - r3
            if (r4 > r6) goto L_0x010d
            boolean r4 = r11.f783A
            if (r4 == 0) goto L_0x0101
            android.view.View r4 = r11.f796d
            boolean r4 = m679s(r4)
            if (r4 != 0) goto L_0x0101
            if (r8 == 0) goto L_0x00f5
            goto L_0x0101
        L_0x00f5:
            r11.f802z = r5
            android.view.View r2 = r11.f797f
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r13
            int r5 = r12 - r2
            goto L_0x0111
        L_0x0101:
            r11.f802z = r2
            android.view.View r13 = r11.f797f
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r3
            int r5 = r12 - r13
            goto L_0x0111
        L_0x010d:
            r11.f802z = r5
            goto L_0x0111
        L_0x0110:
            r5 = r12
        L_0x0111:
            int r1 = r1 - r5
            r11.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(C2007e eVar) {
        this.f788F = eVar;
        m678r();
    }

    public void setButtonStackedGravity(C2007e eVar) {
        for (MDButton mDButton : this.f794a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i) {
        this.f790H.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f795c = i;
    }

    public void setStackingBehavior(C2023g gVar) {
        this.f800p = gVar;
        invalidate();
    }

    /* renamed from: t */
    public void mo16920t() {
        this.f784B = true;
    }

    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m675o(context, attributeSet, i);
    }
}
