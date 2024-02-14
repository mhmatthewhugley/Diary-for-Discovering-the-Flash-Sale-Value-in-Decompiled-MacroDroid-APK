package com.thebluealliance.spectrum;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.thebluealliance.spectrum.internal.ColorItem;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import p222c8.C11161c;

public class SpectrumPalette extends LinearLayout {

    /* renamed from: A */
    private int f57651A = 0;

    /* renamed from: B */
    private int f57652B = 0;

    /* renamed from: C */
    private int f57653C = 0;

    /* renamed from: D */
    private boolean f57654D = false;

    /* renamed from: E */
    private int f57655E = 2;

    /* renamed from: F */
    private int f57656F = -1;

    /* renamed from: G */
    private boolean f57657G = false;

    /* renamed from: H */
    private EventBus f57658H;

    /* renamed from: I */
    private List<ColorItem> f57659I = new ArrayList();

    /* renamed from: a */
    private int f57660a;

    /* renamed from: c */
    private int f57661c;
    @ColorInt

    /* renamed from: d */
    private int[] f57662d;
    @ColorInt

    /* renamed from: f */
    private int f57663f;

    /* renamed from: g */
    private C11762a f57664g;

    /* renamed from: o */
    private boolean f57665o = false;

    /* renamed from: p */
    private boolean f57666p = false;

    /* renamed from: s */
    private int f57667s = -1;

    /* renamed from: z */
    private int f57668z = 0;

    /* renamed from: com.thebluealliance.spectrum.SpectrumPalette$a */
    public interface C11762a {
        /* renamed from: f */
        void mo28902f(@ColorInt int i);
    }

    public SpectrumPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SpectrumPalette, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SpectrumPalette_spectrum_colors, 0);
        if (resourceId != 0) {
            this.f57662d = getContext().getResources().getIntArray(resourceId);
        }
        this.f57665o = obtainStyledAttributes.getBoolean(R$styleable.SpectrumPalette_spectrum_autoPadding, false);
        this.f57668z = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SpectrumPalette_spectrum_outlineWidth, 0);
        int i = obtainStyledAttributes.getInt(R$styleable.SpectrumPalette_spectrum_columnCount, -1);
        this.f57667s = i;
        if (i != -1) {
            this.f57666p = true;
        }
        obtainStyledAttributes.recycle();
        this.f57652B = getPaddingTop();
        this.f57653C = getPaddingBottom();
        m81955h();
    }

    /* renamed from: a */
    private int m81949a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if ((this.f57660a * i3) + (i3 * 2 * this.f57661c) > i) {
                return i2;
            }
            i2 = i3;
        }
    }

    /* renamed from: b */
    private int m81950b(int i) {
        int[] iArr = this.f57662d;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length / i;
        if (iArr.length % i != 0) {
            length++;
        }
        return length * (this.f57660a + (this.f57661c * 2));
    }

    /* renamed from: c */
    private int m81951c(int i) {
        return i * (this.f57660a + (this.f57661c * 2));
    }

    /* renamed from: d */
    private ColorItem m81952d(int i, int i2) {
        ColorItem colorItem = new ColorItem(getContext(), i, i == i2, this.f57658H);
        int i3 = this.f57660a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        int i4 = this.f57661c;
        layoutParams.setMargins(i4, i4, i4, i4);
        colorItem.setLayoutParams(layoutParams);
        int i5 = this.f57668z;
        if (i5 != 0) {
            colorItem.setOutlineWidth(i5);
        }
        this.f57659I.add(colorItem);
        return colorItem;
    }

    /* renamed from: f */
    private LinearLayout m81953f() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setGravity(1);
        return linearLayout;
    }

    /* renamed from: g */
    private ImageView m81954g() {
        ImageView imageView = new ImageView(getContext());
        int i = this.f57660a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        int i2 = this.f57661c;
        layoutParams.setMargins(i2, i2, i2, i2);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private int getOriginalPaddingBottom() {
        return this.f57653C;
    }

    private int getOriginalPaddingTop() {
        return this.f57652B;
    }

    /* renamed from: h */
    private void m81955h() {
        EventBus eventBus = new EventBus();
        this.f57658H = eventBus;
        eventBus.register(this);
        this.f57660a = getResources().getDimensionPixelSize(R$dimen.color_item_small);
        this.f57661c = getResources().getDimensionPixelSize(R$dimen.color_item_margins_small);
        setOrientation(1);
    }

    /* renamed from: i */
    private void m81956i(int i, int i2, int i3, int i4) {
        this.f57654D = true;
        setPadding(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo66958e() {
        if (!this.f57657G || this.f57655E != this.f57656F) {
            this.f57657G = true;
            this.f57656F = this.f57655E;
            removeAllViews();
            if (this.f57662d != null) {
                LinearLayout f = m81953f();
                int i = 0;
                int i2 = 0;
                while (true) {
                    int[] iArr = this.f57662d;
                    if (i >= iArr.length) {
                        break;
                    }
                    f.addView(m81952d(iArr[i], this.f57663f));
                    i2++;
                    if (i2 == this.f57655E) {
                        addView(f);
                        f = m81953f();
                        i2 = 0;
                    }
                    i++;
                }
                if (i2 > 0) {
                    while (i2 < this.f57655E) {
                        f.addView(m81954g());
                        i2++;
                    }
                    addView(f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f57666p) {
            size = m81951c(this.f57667s) + getPaddingLeft() + getPaddingRight();
            this.f57655E = this.f57667s;
        } else if (mode == 1073741824) {
            this.f57655E = m81949a(size - (getPaddingLeft() + getPaddingRight()));
        } else if (mode == Integer.MIN_VALUE) {
            this.f57655E = m81949a(size - (getPaddingLeft() + getPaddingRight()));
        } else {
            this.f57655E = 4;
            size = m81951c(4) + getPaddingLeft() + getPaddingRight();
        }
        this.f57651A = (size - ((m81951c(this.f57655E) + getPaddingLeft()) + getPaddingRight())) / 2;
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                int b = m81950b(this.f57655E) + this.f57652B + this.f57653C;
                if (this.f57665o) {
                    b += this.f57651A * 2;
                }
                size2 = Math.min(b, size2);
            } else {
                size2 = m81950b(this.f57655E) + this.f57652B + this.f57653C;
                if (this.f57665o) {
                    size2 += this.f57651A * 2;
                }
            }
        }
        if (this.f57665o) {
            m81956i(getPaddingLeft(), this.f57652B + this.f57651A, getPaddingRight(), this.f57653C + this.f57651A);
        }
        mo66958e();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, BasicMeasure.EXACTLY));
    }

    @Subscribe
    public void onSelectedColorChanged(C11161c cVar) {
        int a = cVar.mo62357a();
        this.f57663f = a;
        C11762a aVar = this.f57664g;
        if (aVar != null) {
            aVar.mo28902f(a);
        }
    }

    public void setColors(@ColorInt int[] iArr) {
        this.f57662d = iArr;
        this.f57657G = false;
        mo66958e();
    }

    public void setFixedColumnCount(int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("set column count to ");
            sb.append(i);
            this.f57666p = true;
            this.f57667s = i;
            requestLayout();
            invalidate();
            return;
        }
        this.f57666p = false;
        this.f57667s = -1;
        requestLayout();
        invalidate();
    }

    public void setOnColorSelectedListener(C11762a aVar) {
        this.f57664g = aVar;
    }

    public void setOutlineWidth(int i) {
        this.f57668z = i;
        for (ColorItem outlineWidth : this.f57659I) {
            outlineWidth.setOutlineWidth(i);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f57654D) {
            this.f57652B = i2;
            this.f57653C = i4;
        }
    }

    public void setSelectedColor(@ColorInt int i) {
        this.f57663f = i;
        this.f57658H.post(new C11161c(i));
    }
}
