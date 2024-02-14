package p017c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.AnimRes;
import p028d.C1972f;

/* renamed from: c.b */
/* compiled from: ViewTranslationWrapper */
public class C1422b {

    /* renamed from: a */
    private View f749a;

    /* renamed from: b */
    private C1421a f750b = new C1972f();

    /* renamed from: c */
    private C1421a f751c = new C1972f();

    /* renamed from: d */
    private C1421a f752d;

    /* renamed from: e */
    private Animation f753e;

    public C1422b(View view) {
        this.f749a = view;
        mo16885g(0);
    }

    /* renamed from: a */
    public void mo16879a(float f) {
        this.f752d.mo16878a(this.f749a, f);
    }

    /* renamed from: b */
    public void mo16880b(float f) {
        this.f750b.mo16878a(this.f749a, f);
    }

    /* renamed from: c */
    public void mo16881c() {
        Animation animation = this.f753e;
        if (animation != null) {
            this.f749a.startAnimation(animation);
        }
    }

    /* renamed from: d */
    public void mo16882d(float f) {
        this.f751c.mo16878a(this.f749a, f);
    }

    /* renamed from: e */
    public C1422b mo16883e(C1421a aVar) {
        this.f752d = aVar;
        return this;
    }

    /* renamed from: f */
    public C1422b mo16884f(C1421a aVar) {
        this.f750b = aVar;
        return this;
    }

    /* renamed from: g */
    public C1422b mo16885g(@AnimRes int i) {
        if (i != 0) {
            this.f753e = AnimationUtils.loadAnimation(this.f749a.getContext(), i);
        }
        return this;
    }

    /* renamed from: h */
    public C1422b mo16886h(C1421a aVar) {
        this.f751c = aVar;
        return this;
    }
}
