package p185w4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p083e4.C7271c;
import p090f5.C7315j;
import p095g4.C7333a;
import p102h4.C7387j;
import p185w4.C10341g;

/* renamed from: w4.c */
/* compiled from: GifDrawable */
public class C10336c extends Drawable implements C10341g.C10343b, Animatable, Animatable2Compat {

    /* renamed from: A */
    private Rect f23515A;

    /* renamed from: B */
    private List<Animatable2Compat.AnimationCallback> f23516B;

    /* renamed from: a */
    private final C10337a f23517a;

    /* renamed from: c */
    private boolean f23518c;

    /* renamed from: d */
    private boolean f23519d;

    /* renamed from: f */
    private boolean f23520f;

    /* renamed from: g */
    private boolean f23521g;

    /* renamed from: o */
    private int f23522o;

    /* renamed from: p */
    private int f23523p;

    /* renamed from: s */
    private boolean f23524s;

    /* renamed from: z */
    private Paint f23525z;

    /* renamed from: w4.c$a */
    /* compiled from: GifDrawable */
    static final class C10337a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a */
        final C10341g f23526a;

        C10337a(C10341g gVar) {
            this.f23526a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @NonNull
        public Drawable newDrawable() {
            return new C10336c(this);
        }
    }

    public C10336c(Context context, C7333a aVar, C7387j<Bitmap> jVar, int i, int i2, Bitmap bitmap) {
        this(new C10337a(new C10341g(C7271c.m30011c(context), aVar, i, i2, jVar, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m40575b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m40576d() {
        if (this.f23515A == null) {
            this.f23515A = new Rect();
        }
        return this.f23515A;
    }

    /* renamed from: h */
    private Paint m40577h() {
        if (this.f23525z == null) {
            this.f23525z = new Paint(2);
        }
        return this.f23525z;
    }

    /* renamed from: j */
    private void m40578j() {
        List<Animatable2Compat.AnimationCallback> list = this.f23516B;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f23516B.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: l */
    private void m40579l() {
        this.f23522o = 0;
    }

    /* renamed from: n */
    private void m40580n() {
        C7315j.m30201a(!this.f23520f, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f23517a.f23526a.mo40993f() == 1) {
            invalidateSelf();
        } else if (!this.f23518c) {
            this.f23518c = true;
            this.f23517a.f23526a.mo40999s(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m40581o() {
        this.f23518c = false;
        this.f23517a.f23526a.mo41000t(this);
    }

    /* renamed from: a */
    public void mo40964a() {
        if (m40575b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo40969g() == mo40968f() - 1) {
            this.f23522o++;
        }
        int i = this.f23523p;
        if (i != -1 && this.f23522o >= i) {
            m40578j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo40965c() {
        return this.f23517a.f23526a.mo40989b();
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f23516B;
        if (list != null) {
            list.clear();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.f23520f) {
            if (this.f23524s) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m40576d());
                this.f23524s = false;
            }
            canvas.drawBitmap(this.f23517a.f23526a.mo40990c(), (Rect) null, m40576d(), m40577h());
        }
    }

    /* renamed from: e */
    public Bitmap mo40967e() {
        return this.f23517a.f23526a.mo40992e();
    }

    /* renamed from: f */
    public int mo40968f() {
        return this.f23517a.f23526a.mo40993f();
    }

    /* renamed from: g */
    public int mo40969g() {
        return this.f23517a.f23526a.mo40991d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f23517a;
    }

    public int getIntrinsicHeight() {
        return this.f23517a.f23526a.mo40994i();
    }

    public int getIntrinsicWidth() {
        return this.f23517a.f23526a.mo40996l();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo40974i() {
        return this.f23517a.f23526a.mo40995k();
    }

    public boolean isRunning() {
        return this.f23518c;
    }

    /* renamed from: k */
    public void mo40976k() {
        this.f23520f = true;
        this.f23517a.f23526a.mo40988a();
    }

    /* renamed from: m */
    public void mo40977m(C7387j<Bitmap> jVar, Bitmap bitmap) {
        this.f23517a.f23526a.mo40998p(jVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23524s = true;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.f23516B == null) {
                this.f23516B = new ArrayList();
            }
            this.f23516B.add(animationCallback);
        }
    }

    public void setAlpha(int i) {
        m40577h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m40577h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C7315j.m30201a(!this.f23520f, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f23521g = z;
        if (!z) {
            m40581o();
        } else if (this.f23519d) {
            m40580n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f23519d = true;
        m40579l();
        if (this.f23521g) {
            m40580n();
        }
    }

    public void stop() {
        this.f23519d = false;
        m40581o();
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f23516B;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    C10336c(C10337a aVar) {
        this.f23521g = true;
        this.f23523p = -1;
        this.f23517a = (C10337a) C7315j.m30204d(aVar);
    }
}
