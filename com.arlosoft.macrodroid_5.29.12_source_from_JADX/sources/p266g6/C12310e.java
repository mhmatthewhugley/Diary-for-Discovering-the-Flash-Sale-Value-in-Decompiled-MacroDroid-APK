package p266g6;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.hanks.htextview.base.HTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g6.e */
/* compiled from: HText */
public abstract class C12310e {

    /* renamed from: a */
    protected int f58979a;

    /* renamed from: b */
    protected int f58980b;

    /* renamed from: c */
    protected CharSequence f58981c;

    /* renamed from: d */
    protected CharSequence f58982d;

    /* renamed from: e */
    protected TextPaint f58983e;

    /* renamed from: f */
    protected TextPaint f58984f;
    /* access modifiers changed from: protected */

    /* renamed from: g */
    public HTextView f58985g;

    /* renamed from: h */
    protected List<Float> f58986h = new ArrayList();

    /* renamed from: i */
    protected List<Float> f58987i = new ArrayList();
    /* access modifiers changed from: protected */

    /* renamed from: j */
    public float f58988j;

    /* renamed from: k */
    protected float f58989k;
    /* access modifiers changed from: protected */

    /* renamed from: l */
    public float f58990l = 0.0f;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public C12306a f58991m;

    /* renamed from: g6.e$a */
    /* compiled from: HText */
    class C12311a implements ViewTreeObserver.OnGlobalLayoutListener {
        C12311a() {
        }

        public void onGlobalLayout() {
            float f;
            C12310e.this.f58985g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C12310e eVar = C12310e.this;
            eVar.f58989k = eVar.f58985g.getTextSize();
            C12310e eVar2 = C12310e.this;
            eVar2.f58980b = eVar2.f58985g.getWidth();
            C12310e eVar3 = C12310e.this;
            eVar3.f58979a = eVar3.f58985g.getHeight();
            C12310e eVar4 = C12310e.this;
            eVar4.f58990l = 0.0f;
            try {
                int layoutDirection = ViewCompat.getLayoutDirection(eVar4.f58985g);
                C12310e eVar5 = C12310e.this;
                if (layoutDirection == 0) {
                    f = eVar5.f58985g.getLayout().getLineLeft(0);
                } else {
                    f = eVar5.f58985g.getLayout().getLineRight(0);
                }
                eVar5.f58990l = f;
            } catch (Exception e) {
                e.printStackTrace();
            }
            C12310e.this.mo68630f();
        }
    }

    /* renamed from: h */
    private void m83014h() {
        float textSize = this.f58985g.getTextSize();
        this.f58989k = textSize;
        this.f58983e.setTextSize(textSize);
        this.f58983e.setColor(this.f58985g.getCurrentTextColor());
        this.f58983e.setTypeface(this.f58985g.getTypeface());
        this.f58986h.clear();
        for (int i = 0; i < this.f58981c.length(); i++) {
            this.f58986h.add(Float.valueOf(this.f58983e.measureText(String.valueOf(this.f58981c.charAt(i)))));
        }
        this.f58984f.setTextSize(this.f58989k);
        this.f58984f.setColor(this.f58985g.getCurrentTextColor());
        this.f58984f.setTypeface(this.f58985g.getTypeface());
        this.f58987i.clear();
        for (int i2 = 0; i2 < this.f58982d.length(); i2++) {
            this.f58987i.add(Float.valueOf(this.f58984f.measureText(String.valueOf(this.f58982d.charAt(i2)))));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68625a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo68626b(CharSequence charSequence);

    /* renamed from: c */
    public void mo68627c(CharSequence charSequence) {
        this.f58985g.setText(charSequence);
        this.f58982d = this.f58981c;
        this.f58981c = charSequence;
        m83014h();
        mo68625a(charSequence);
        mo68626b(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo68628d(Canvas canvas);

    /* renamed from: e */
    public void mo68629e(HTextView hTextView, AttributeSet attributeSet, int i) {
        this.f58985g = hTextView;
        this.f58982d = "";
        this.f58981c = hTextView.getText();
        this.f58988j = 1.0f;
        this.f58983e = new TextPaint(1);
        this.f58984f = new TextPaint(this.f58983e);
        this.f58985g.getViewTreeObserver().addOnGlobalLayoutListener(new C12311a());
        m83014h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo68630f();

    /* renamed from: g */
    public void mo68631g(Canvas canvas) {
        mo68628d(canvas);
    }

    /* renamed from: i */
    public void mo68632i(C12306a aVar) {
        this.f58991m = aVar;
    }

    /* renamed from: j */
    public void mo68633j(float f) {
        this.f58988j = f;
        this.f58985g.invalidate();
    }
}
