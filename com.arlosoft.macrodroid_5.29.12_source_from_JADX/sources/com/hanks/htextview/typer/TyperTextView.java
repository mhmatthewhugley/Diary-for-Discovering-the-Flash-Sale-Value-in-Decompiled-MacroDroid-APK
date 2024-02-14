package com.hanks.htextview.typer;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.hanks.htextview.base.HTextView;
import java.util.Random;
import p266g6.C12306a;

public class TyperTextView extends HTextView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Random f57298a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CharSequence f57299c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f57300d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f57301f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f57302g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C12306a f57303o;

    /* renamed from: com.hanks.htextview.typer.TyperTextView$a */
    class C11658a implements Handler.Callback {
        C11658a() {
        }

        public boolean handleMessage(Message message) {
            int length = TyperTextView.this.getText().length();
            if (length < TyperTextView.this.f57299c.length()) {
                if (TyperTextView.this.f57301f + length > TyperTextView.this.f57299c.length()) {
                    TyperTextView typerTextView = TyperTextView.this;
                    int unused = typerTextView.f57301f = typerTextView.f57299c.length() - length;
                }
                TyperTextView typerTextView2 = TyperTextView.this;
                typerTextView2.append(typerTextView2.f57299c.subSequence(length, TyperTextView.this.f57301f + length));
                long d = (long) (TyperTextView.this.f57302g + TyperTextView.this.f57298a.nextInt(TyperTextView.this.f57302g));
                Message obtain = Message.obtain();
                obtain.what = 1895;
                TyperTextView.this.f57300d.sendMessageDelayed(obtain, d);
                return false;
            }
            if (TyperTextView.this.f57303o != null) {
                TyperTextView.this.f57303o.mo68621a(TyperTextView.this);
            }
            return false;
        }
    }

    public TyperTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getCharIncrease() {
        return this.f57301f;
    }

    public int getTyperSpeed() {
        return this.f57302g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57300d.removeMessages(1895);
    }

    public void setAnimationListener(C12306a aVar) {
        this.f57303o = aVar;
    }

    public void setCharIncrease(int i) {
        this.f57301f = i;
    }

    public void setProgress(float f) {
        CharSequence charSequence = this.f57299c;
        setText(charSequence.subSequence(0, (int) (((float) charSequence.length()) * f)));
    }

    public void setTyperSpeed(int i) {
        this.f57302g = i;
    }

    public TyperTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.TyperTextView);
        this.f57302g = obtainStyledAttributes.getInt(R$styleable.TyperTextView_typerSpeed, 100);
        this.f57301f = obtainStyledAttributes.getInt(R$styleable.TyperTextView_charIncrease, 2);
        obtainStyledAttributes.recycle();
        this.f57298a = new Random();
        this.f57299c = getText();
        this.f57300d = new Handler(new C11658a());
    }
}
