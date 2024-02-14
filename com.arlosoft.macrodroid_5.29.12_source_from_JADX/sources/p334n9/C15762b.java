package p334n9;

import android.view.View;
import androidx.annotation.CallSuper;
import p286i9.C12454b;

/* renamed from: n9.b */
/* compiled from: ExpandableViewHolder */
public abstract class C15762b extends C15763c {
    public C15762b(View view, C12454b bVar, boolean z) {
        super(view, bVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo75401A(int i) {
        this.f65105d.mo68845B0(i, mo29475F());
        if (this.itemView.getX() < 0.0f || this.itemView.getY() < 0.0f) {
            this.f65105d.mo68943I().scrollToPosition(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo75402B(int i) {
        this.f65105d.mo68858K0(i, mo29475F());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo75403C() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo75404D() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo75405E() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo29475F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo75406G() {
        int u = mo75400u();
        if (mo75403C() && this.f65105d.mo68909y1(u)) {
            mo75401A(u);
        } else if (mo75405E() && !this.f65105d.mo68946M(u)) {
            mo75402B(u);
        }
    }

    @CallSuper
    /* renamed from: f */
    public void mo70871f(int i, int i2) {
        if (this.f65105d.mo68909y1(mo75400u())) {
            mo75401A(i);
        }
        super.mo70871f(i, i2);
    }

    @CallSuper
    public void onClick(View view) {
        if (this.f65105d.mo68851D1(mo75400u())) {
            mo75406G();
        }
        super.onClick(view);
    }

    @CallSuper
    public boolean onLongClick(View view) {
        int u = mo75400u();
        if (this.f65105d.mo68851D1(u) && mo75404D()) {
            mo75401A(u);
        }
        return super.onLongClick(view);
    }
}
