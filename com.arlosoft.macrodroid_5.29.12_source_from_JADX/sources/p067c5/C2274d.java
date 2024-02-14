package p067c5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p079d5.C7259b;

/* renamed from: c5.d */
/* compiled from: ImageViewTarget */
public abstract class C2274d<Z> extends C2279i<ImageView, Z> implements C7259b.C7260a {
    @Nullable

    /* renamed from: i */
    private Animatable f6979i;

    public C2274d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: m */
    private void m9352m(@Nullable Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f6979i = animatable;
            animatable.start();
            return;
        }
        this.f6979i = null;
    }

    /* renamed from: p */
    private void m9353p(@Nullable Z z) {
        mo24589o(z);
        m9352m(z);
    }

    /* renamed from: N */
    public void mo24581N() {
        Animatable animatable = this.f6979i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: b */
    public void mo24582b(@Nullable Drawable drawable) {
        super.mo24582b(drawable);
        m9353p((Object) null);
        mo24593n(drawable);
    }

    /* renamed from: d */
    public void mo24584d(@Nullable Drawable drawable) {
        super.mo24584d(drawable);
        Animatable animatable = this.f6979i;
        if (animatable != null) {
            animatable.stop();
        }
        m9353p((Object) null);
        mo24593n(drawable);
    }

    /* renamed from: e */
    public void mo24592e(@NonNull Z z, @Nullable C7259b<? super Z> bVar) {
        if (bVar == null || !bVar.mo37125a(z, this)) {
            m9353p(z);
        } else {
            m9352m(z);
        }
    }

    /* renamed from: h */
    public void mo24586h(@Nullable Drawable drawable) {
        super.mo24586h(drawable);
        m9353p((Object) null);
        mo24593n(drawable);
    }

    /* renamed from: n */
    public void mo24593n(Drawable drawable) {
        ((ImageView) this.f6984b).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo24589o(@Nullable Z z);

    public void onStart() {
        Animatable animatable = this.f6979i;
        if (animatable != null) {
            animatable.start();
        }
    }
}
