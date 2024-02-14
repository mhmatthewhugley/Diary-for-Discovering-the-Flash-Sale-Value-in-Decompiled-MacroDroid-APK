package com.p230lb.auto_fit_textview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: com.lb.auto_fit_textview.AutoResizeTextView */
public class AutoResizeTextView extends AppCompatTextView {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public TextPaint f57509A;

    /* renamed from: a */
    private final RectF f57510a;

    /* renamed from: c */
    private final C11701b f57511c;

    /* renamed from: d */
    private float f57512d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f57513f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f57514g;

    /* renamed from: o */
    private float f57515o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f57516p;

    /* renamed from: s */
    private int f57517s;

    /* renamed from: z */
    private boolean f57518z;

    /* renamed from: com.lb.auto_fit_textview.AutoResizeTextView$a */
    class C11700a implements C11701b {

        /* renamed from: a */
        final RectF f57519a = new RectF();

        C11700a() {
        }

        /* renamed from: a */
        public int mo65770a(int i, RectF rectF) {
            String str;
            AutoResizeTextView.this.f57509A.setTextSize((float) i);
            TransformationMethod transformationMethod = AutoResizeTextView.this.getTransformationMethod();
            if (transformationMethod != null) {
                str = transformationMethod.getTransformation(AutoResizeTextView.this.getText(), AutoResizeTextView.this).toString();
            } else {
                str = AutoResizeTextView.this.getText().toString();
            }
            if (AutoResizeTextView.this.getMaxLines() == 1) {
                this.f57519a.bottom = AutoResizeTextView.this.f57509A.getFontSpacing();
                this.f57519a.right = AutoResizeTextView.this.f57509A.measureText(str);
            } else {
                StaticLayout staticLayout = new StaticLayout(str, AutoResizeTextView.this.f57509A, AutoResizeTextView.this.f57516p, Layout.Alignment.ALIGN_NORMAL, AutoResizeTextView.this.f57513f, AutoResizeTextView.this.f57514g, true);
                if (AutoResizeTextView.this.getMaxLines() != -1 && staticLayout.getLineCount() > AutoResizeTextView.this.getMaxLines()) {
                    return 1;
                }
                this.f57519a.bottom = (float) staticLayout.getHeight();
                int lineCount = staticLayout.getLineCount();
                int i2 = -1;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    int lineEnd = staticLayout.getLineEnd(i3);
                    if (i3 < lineCount - 1 && lineEnd > 0 && !AutoResizeTextView.this.mo65761q(str.charAt(lineEnd - 1), str.charAt(lineEnd))) {
                        return 1;
                    }
                    if (((float) i2) < staticLayout.getLineRight(i3) - staticLayout.getLineLeft(i3)) {
                        i2 = ((int) staticLayout.getLineRight(i3)) - ((int) staticLayout.getLineLeft(i3));
                    }
                }
                this.f57519a.right = (float) i2;
            }
            this.f57519a.offsetTo(0.0f, 0.0f);
            return rectF.contains(this.f57519a) ? -1 : 1;
        }
    }

    /* renamed from: com.lb.auto_fit_textview.AutoResizeTextView$b */
    private interface C11701b {
        /* renamed from: a */
        int mo65770a(int i, RectF rectF);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: o */
    private void m81841o() {
        if (this.f57518z) {
            int i = (int) this.f57515o;
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.f57516p = measuredWidth;
            if (measuredWidth > 0) {
                this.f57509A = new TextPaint(getPaint());
                RectF rectF = this.f57510a;
                rectF.right = (float) this.f57516p;
                rectF.bottom = (float) measuredHeight;
                m81843r(i);
            }
        }
    }

    /* renamed from: p */
    private int m81842p(int i, int i2, C11701b bVar, RectF rectF) {
        int i3 = i2 - 1;
        int i4 = i;
        while (i <= i3) {
            i4 = (i + i3) >>> 1;
            int a = bVar.mo65770a(i4, rectF);
            if (a >= 0) {
                if (a <= 0) {
                    break;
                }
                i4--;
                i3 = i4;
            } else {
                int i5 = i4 + 1;
                i4 = i;
                i = i5;
            }
        }
        return i4;
    }

    /* renamed from: r */
    private void m81843r(int i) {
        super.setTextSize(0, (float) m81842p(i, (int) this.f57512d, this.f57511c, this.f57510a));
    }

    public int getMaxLines() {
        return this.f57517s;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m81841o();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m81841o();
    }

    /* renamed from: q */
    public boolean mo65761q(char c, char c2) {
        return c == ' ' || c == '-';
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m81841o();
    }

    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f57513f = f2;
        this.f57514g = f;
    }

    public void setLines(int i) {
        super.setLines(i);
        this.f57517s = i;
        m81841o();
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f57517s = i;
        m81841o();
    }

    public void setMinTextSize(float f) {
        this.f57515o = f;
        m81841o();
    }

    public void setSingleLine() {
        super.setSingleLine();
        this.f57517s = 1;
        m81841o();
    }

    public void setTextSize(float f) {
        this.f57512d = f;
        m81841o();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        m81841o();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57510a = new RectF();
        this.f57513f = 1.0f;
        this.f57514g = 0.0f;
        this.f57518z = false;
        this.f57515o = TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics());
        this.f57512d = getTextSize();
        this.f57509A = new TextPaint(getPaint());
        if (this.f57517s == 0) {
            this.f57517s = -1;
        }
        this.f57511c = new C11700a();
        this.f57518z = true;
    }

    public void setTextSize(int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f57512d = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        m81841o();
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        if (z) {
            this.f57517s = 1;
        } else {
            this.f57517s = -1;
        }
        m81841o();
    }
}
