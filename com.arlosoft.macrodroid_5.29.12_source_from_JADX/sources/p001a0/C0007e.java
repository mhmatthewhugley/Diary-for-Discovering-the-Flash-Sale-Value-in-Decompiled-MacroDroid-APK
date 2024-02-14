package p001a0;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.C1461c;
import com.airbnb.lottie.C1463d;

/* renamed from: a0.e */
/* compiled from: LottieValueAnimator */
public class C0007e extends C0003a implements Choreographer.FrameCallback {
    @Nullable

    /* renamed from: A */
    private C1463d f18A;
    @VisibleForTesting

    /* renamed from: B */
    protected boolean f19B = false;

    /* renamed from: d */
    private float f20d = 1.0f;

    /* renamed from: f */
    private boolean f21f = false;

    /* renamed from: g */
    private long f22g = 0;

    /* renamed from: o */
    private float f23o = 0.0f;

    /* renamed from: p */
    private int f24p = 0;

    /* renamed from: s */
    private float f25s = -2.14748365E9f;

    /* renamed from: z */
    private float f26z = 2.14748365E9f;

    /* renamed from: G */
    private void m34G() {
        if (this.f18A != null) {
            float f = this.f23o;
            if (f < this.f25s || f > this.f26z) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f25s), Float.valueOf(this.f26z), Float.valueOf(this.f23o)}));
            }
        }
    }

    /* renamed from: l */
    private float m35l() {
        C1463d dVar = this.f18A;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.mo17059h()) / Math.abs(this.f20d);
    }

    /* renamed from: q */
    private boolean m36q() {
        return mo50p() < 0.0f;
    }

    /* renamed from: A */
    public void mo33A(float f) {
        if (this.f23o != f) {
            this.f23o = C0009g.m60c(f, mo49o(), mo48n());
            this.f22g = 0;
            mo19e();
        }
    }

    /* renamed from: B */
    public void mo34B(float f) {
        mo35C(this.f25s, f);
    }

    /* renamed from: C */
    public void mo35C(float f, float f2) {
        if (f <= f2) {
            C1463d dVar = this.f18A;
            float o = dVar == null ? -3.4028235E38f : dVar.mo17066o();
            C1463d dVar2 = this.f18A;
            float f3 = dVar2 == null ? Float.MAX_VALUE : dVar2.mo17057f();
            this.f25s = C0009g.m60c(f, o, f3);
            this.f26z = C0009g.m60c(f2, o, f3);
            mo33A((float) ((int) C0009g.m60c(this.f23o, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: D */
    public void mo36D(int i) {
        mo35C((float) i, (float) ((int) this.f26z));
    }

    /* renamed from: E */
    public void mo37E(float f) {
        this.f20d = f;
    }

    @MainThread
    public void cancel() {
        mo13a();
        mo55u();
    }

    public void doFrame(long j) {
        mo54t();
        if (this.f18A != null && isRunning()) {
            C1461c.m735a("LottieValueAnimator#doFrame");
            long j2 = this.f22g;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float l = ((float) j3) / m35l();
            float f = this.f23o;
            if (m36q()) {
                l = -l;
            }
            float f2 = f + l;
            this.f23o = f2;
            boolean z = !C0009g.m62e(f2, mo49o(), mo48n());
            this.f23o = C0009g.m60c(this.f23o, mo49o(), mo48n());
            this.f22g = j;
            mo19e();
            if (z) {
                if (getRepeatCount() == -1 || this.f24p < getRepeatCount()) {
                    mo17c();
                    this.f24p++;
                    if (getRepeatMode() == 2) {
                        this.f21f = !this.f21f;
                        mo58y();
                    } else {
                        this.f23o = m36q() ? mo48n() : mo49o();
                    }
                    this.f22g = j;
                } else {
                    this.f23o = this.f20d < 0.0f ? mo49o() : mo48n();
                    mo55u();
                    mo16b(m36q());
                }
            }
            m34G();
            C1461c.m736b("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: f */
    public void mo40f() {
        this.f18A = null;
        this.f25s = -2.14748365E9f;
        this.f26z = 2.14748365E9f;
    }

    @MainThread
    /* renamed from: g */
    public void mo41g() {
        mo55u();
        mo16b(m36q());
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    public float getAnimatedFraction() {
        float o;
        float n;
        float o2;
        if (this.f18A == null) {
            return 0.0f;
        }
        if (m36q()) {
            o = mo48n() - this.f23o;
            n = mo48n();
            o2 = mo49o();
        } else {
            o = this.f23o - mo49o();
            n = mo48n();
            o2 = mo49o();
        }
        return o / (n - o2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo45h());
    }

    public long getDuration() {
        C1463d dVar = this.f18A;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.mo17055d();
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    /* renamed from: h */
    public float mo45h() {
        C1463d dVar = this.f18A;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f23o - dVar.mo17066o()) / (this.f18A.mo17057f() - this.f18A.mo17066o());
    }

    public boolean isRunning() {
        return this.f19B;
    }

    /* renamed from: k */
    public float mo47k() {
        return this.f23o;
    }

    /* renamed from: n */
    public float mo48n() {
        C1463d dVar = this.f18A;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f26z;
        return f == 2.14748365E9f ? dVar.mo17057f() : f;
    }

    /* renamed from: o */
    public float mo49o() {
        C1463d dVar = this.f18A;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f25s;
        return f == -2.14748365E9f ? dVar.mo17066o() : f;
    }

    /* renamed from: p */
    public float mo50p() {
        return this.f20d;
    }

    @MainThread
    /* renamed from: r */
    public void mo51r() {
        mo55u();
    }

    @MainThread
    /* renamed from: s */
    public void mo52s() {
        this.f19B = true;
        mo18d(m36q());
        mo33A((float) ((int) (m36q() ? mo48n() : mo49o())));
        this.f22g = 0;
        this.f24p = 0;
        mo54t();
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f21f) {
            this.f21f = false;
            mo58y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo54t() {
        if (isRunning()) {
            mo56v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    @MainThread
    /* renamed from: u */
    public void mo55u() {
        mo56v(true);
    }

    /* access modifiers changed from: protected */
    @MainThread
    /* renamed from: v */
    public void mo56v(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f19B = false;
        }
    }

    @MainThread
    /* renamed from: x */
    public void mo57x() {
        this.f19B = true;
        mo54t();
        this.f22g = 0;
        if (m36q() && mo47k() == mo49o()) {
            this.f23o = mo48n();
        } else if (!m36q() && mo47k() == mo48n()) {
            this.f23o = mo49o();
        }
    }

    /* renamed from: y */
    public void mo58y() {
        mo37E(-mo50p());
    }

    /* renamed from: z */
    public void mo59z(C1463d dVar) {
        boolean z = this.f18A == null;
        this.f18A = dVar;
        if (z) {
            mo35C((float) ((int) Math.max(this.f25s, dVar.mo17066o())), (float) ((int) Math.min(this.f26z, dVar.mo17057f())));
        } else {
            mo35C((float) ((int) dVar.mo17066o()), (float) ((int) dVar.mo17057f()));
        }
        float f = this.f23o;
        this.f23o = 0.0f;
        mo33A((float) ((int) f));
        mo19e();
    }
}
