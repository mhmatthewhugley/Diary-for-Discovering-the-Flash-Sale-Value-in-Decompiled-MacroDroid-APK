package com.hanks.htextview.scale;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.hanks.htextview.base.HTextView;
import p266g6.C12306a;
import p274h6.C12375a;

public class ScaleTextView extends HTextView {

    /* renamed from: a */
    private C12375a f57296a;

    public ScaleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo65569a(CharSequence charSequence) {
        this.f57296a.mo68627c(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f57296a.mo68631g(canvas);
    }

    public void setAnimationListener(C12306a aVar) {
        this.f57296a.mo68632i(aVar);
    }

    public void setProgress(float f) {
        this.f57296a.mo68633j(f);
    }

    public ScaleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12375a aVar = new C12375a();
        this.f57296a = aVar;
        aVar.mo68629e(this, attributeSet, i);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
