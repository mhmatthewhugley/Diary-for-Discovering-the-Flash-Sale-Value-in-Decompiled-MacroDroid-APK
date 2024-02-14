package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* renamed from: a */
    private TextView f50282a;

    /* renamed from: c */
    private Button f50283c;

    /* renamed from: d */
    private int f50284d;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private static void m69603d(@NonNull View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m69604e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f50282a.getPaddingTop() == i2 && this.f50282a.getPaddingBottom() == i3) {
            return z;
        }
        m69603d(this.f50282a, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo58913a(int i, int i2) {
        this.f50282a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f50282a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f50283c.getVisibility() == 0) {
            this.f50283c.setAlpha(0.0f);
            this.f50283c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo58914b(int i, int i2) {
        this.f50282a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f50282a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f50283c.getVisibility() == 0) {
            this.f50283c.setAlpha(1.0f);
            this.f50283c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58954c(float f) {
        if (f != 1.0f) {
            this.f50283c.setTextColor(MaterialColors.m68108h(MaterialColors.m68104d(this, C10462R.attr.colorSurface), this.f50283c.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f50283c;
    }

    public TextView getMessageView() {
        return this.f50282a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50282a = (TextView) findViewById(C10462R.C10465id.snackbar_text);
        this.f50283c = (Button) findViewById(C10462R.C10465id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (m69604e(1, r0, r0 - r1) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (m69604e(0, r0, r0) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C10462R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C10462R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f50282a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x0027
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0041
            int r5 = r7.f50284d
            if (r5 <= 0) goto L_0x0041
            android.widget.Button r5 = r7.f50283c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f50284d
            if (r5 <= r6) goto L_0x0041
            int r1 = r0 - r1
            boolean r0 = r7.m69604e(r4, r0, r1)
            if (r0 == 0) goto L_0x004c
            goto L_0x004b
        L_0x0041:
            if (r2 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            boolean r0 = r7.m69604e(r3, r0, r0)
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r3 = 1
        L_0x004c:
            if (r3 == 0) goto L_0x0051
            super.onMeasure(r8, r9)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f50284d = i;
    }
}
