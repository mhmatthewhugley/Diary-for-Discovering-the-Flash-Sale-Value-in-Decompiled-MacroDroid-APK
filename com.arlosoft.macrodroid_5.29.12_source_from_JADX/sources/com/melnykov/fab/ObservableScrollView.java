package com.melnykov.fab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView {

    /* renamed from: a */
    private C11705a f57540a;

    /* renamed from: com.melnykov.fab.ObservableScrollView$a */
    public interface C11705a {
        /* renamed from: a */
        void mo65797a(ScrollView scrollView, int i, int i2, int i3, int i4);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C11705a aVar = this.f57540a;
        if (aVar != null) {
            aVar.mo65797a(this, i, i2, i3, i4);
        }
    }

    public void setOnScrollChangedListener(C11705a aVar) {
        this.f57540a = aVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
