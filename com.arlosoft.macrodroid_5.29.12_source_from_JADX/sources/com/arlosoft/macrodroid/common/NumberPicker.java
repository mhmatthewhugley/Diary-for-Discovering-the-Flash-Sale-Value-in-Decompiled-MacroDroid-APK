package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import org.apache.commons.cli.HelpFormatter;

public class NumberPicker extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f10342A = false;

    /* renamed from: B */
    private C3991b f10343B;

    /* renamed from: a */
    private int f10344a = -999;

    /* renamed from: c */
    private int f10345c = 999;

    /* renamed from: d */
    private int f10346d = 1;

    /* renamed from: f */
    private Integer f10347f;

    /* renamed from: g */
    private Button f10348g;

    /* renamed from: o */
    private Button f10349o;

    /* renamed from: p */
    private EditText f10350p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f10351s = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f10352z = false;

    /* renamed from: com.arlosoft.macrodroid.common.NumberPicker$b */
    public interface C3991b {
        /* renamed from: N0 */
        void mo26174N0();
    }

    /* renamed from: com.arlosoft.macrodroid.common.NumberPicker$c */
    private class C3992c implements Runnable {
        private C3992c() {
        }

        public void run() {
            if (NumberPicker.this.f10352z) {
                NumberPicker.this.m15503o();
                NumberPicker.this.f10351s.postDelayed(new C3992c(), 50);
            } else if (NumberPicker.this.f10342A) {
                NumberPicker.this.m15502n();
                NumberPicker.this.f10351s.postDelayed(new C3992c(), 50);
            }
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 55.0f, getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics()));
        m15504p(context);
        m15506r(context);
        m15505q(context);
        if (getOrientation() == 1) {
            addView(this.f10349o, layoutParams);
            addView(this.f10350p, layoutParams);
            addView(this.f10348g, layoutParams);
            return;
        }
        addView(this.f10348g, layoutParams);
        addView(this.f10350p, layoutParams);
        addView(this.f10349o, layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m15502n() {
        if (this.f10347f.intValue() > this.f10344a) {
            Integer valueOf = Integer.valueOf(this.f10347f.intValue() - this.f10346d);
            this.f10347f = valueOf;
            this.f10350p.setText(valueOf.toString());
            C3991b bVar = this.f10343B;
            if (bVar != null) {
                bVar.mo26174N0();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m15503o() {
        if (this.f10347f.intValue() < this.f10345c) {
            Integer valueOf = Integer.valueOf(this.f10347f.intValue() + this.f10346d);
            this.f10347f = valueOf;
            this.f10350p.setText(valueOf.toString());
            C3991b bVar = this.f10343B;
            if (bVar != null) {
                bVar.mo26174N0();
            }
        }
    }

    /* renamed from: p */
    private void m15504p(Context context) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(2130969680, typedValue, true);
        Button button = new Button(context);
        this.f10348g = button;
        button.setBackgroundResource(typedValue.resourceId);
        this.f10348g.setTextSize(26.0f);
        this.f10348g.setText(HelpFormatter.DEFAULT_OPT_PREFIX);
        this.f10348g.setOnClickListener(new C4038m0(this));
        this.f10348g.setOnLongClickListener(new C4047p0(this));
        this.f10348g.setOnTouchListener(new C4057s0(this));
    }

    /* renamed from: q */
    private void m15505q(Context context) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(2130969680, typedValue, true);
        Button button = new Button(context);
        this.f10349o = button;
        button.setBackgroundResource(typedValue.resourceId);
        this.f10349o.setTextSize(26.0f);
        this.f10349o.setText("+");
        this.f10349o.setOnClickListener(new C4035l0(this));
        this.f10349o.setOnLongClickListener(new C4051q0(this));
        this.f10349o.setOnTouchListener(new C4054r0(this));
    }

    /* renamed from: r */
    private void m15506r(Context context) {
        this.f10347f = 0;
        EditText editText = new EditText(context);
        this.f10350p = editText;
        editText.setTextSize(20.0f);
        this.f10350p.setOnKeyListener(new C4044o0(this));
        this.f10350p.setOnFocusChangeListener(C4041n0.f10592a);
        this.f10350p.setGravity(17);
        this.f10350p.setText(this.f10347f.toString());
        this.f10350p.setInputType(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m15507s(View view) {
        m15502n();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ boolean m15508t(View view) {
        this.f10342A = true;
        this.f10351s.post(new C3992c());
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean m15509u(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.f10342A) {
            this.f10342A = false;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m15510v(View view) {
        m15503o();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ boolean m15511w(View view) {
        this.f10352z = true;
        this.f10351s.post(new C3992c());
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ boolean m15512x(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.f10352z) {
            this.f10352z = false;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ boolean m15513y(View view, int i, KeyEvent keyEvent) {
        int intValue = this.f10347f.intValue();
        try {
            this.f10347f = Integer.valueOf(Integer.parseInt(((EditText) view).getText().toString()));
        } catch (NumberFormatException unused) {
            this.f10347f = Integer.valueOf(intValue);
        }
        C3991b bVar = this.f10343B;
        if (bVar == null) {
            return false;
        }
        bVar.mo26174N0();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ void m15514z(View view, boolean z) {
        if (z) {
            ((EditText) view).selectAll();
        }
    }

    public int getValue() {
        int intValue = this.f10347f.intValue();
        try {
            this.f10347f = Integer.valueOf(Integer.parseInt(this.f10350p.getText().toString()));
        } catch (NumberFormatException unused) {
            this.f10347f = Integer.valueOf(intValue);
        }
        return this.f10347f.intValue();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f10348g.setEnabled(z);
        this.f10349o.setEnabled(z);
        this.f10350p.setEnabled(z);
    }

    public void setIncrementStep(int i) {
        this.f10346d = i;
    }

    public void setListener(C3991b bVar) {
        this.f10343B = bVar;
    }

    public void setMaximum(int i) {
        this.f10345c = i;
    }

    public void setMinimum(int i) {
        this.f10344a = i;
    }

    public void setValue(int i) {
        int i2 = this.f10345c;
        if (i > i2) {
            i = i2;
        }
        int i3 = this.f10344a;
        if (i < i3) {
            i = i3;
        }
        Integer valueOf = Integer.valueOf(i);
        this.f10347f = valueOf;
        this.f10350p.setText(valueOf.toString());
        C3991b bVar = this.f10343B;
        if (bVar != null) {
            bVar.mo26174N0();
        }
    }
}
