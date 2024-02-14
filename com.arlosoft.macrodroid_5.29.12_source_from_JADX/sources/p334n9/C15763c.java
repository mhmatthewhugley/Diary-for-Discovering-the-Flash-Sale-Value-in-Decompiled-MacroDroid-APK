package p334n9;

import android.animation.Animator;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.List;
import p286i9.C12454b;
import p306k9.C13420a;
import p316l9.C15608g;
import p325m9.C15705a;
import p325m9.C15706b;

/* renamed from: n9.c */
/* compiled from: FlexibleViewHolder */
public abstract class C15763c extends C15761a implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C13420a.C13422b {

    /* renamed from: d */
    protected final C12454b f65105d;

    /* renamed from: f */
    private boolean f65106f;

    /* renamed from: g */
    private boolean f65107g;

    /* renamed from: o */
    protected int f65108o;

    public C15763c(View view, C12454b bVar) {
        this(view, bVar, false);
    }

    /* renamed from: a */
    public final boolean mo70868a() {
        C15608g e1 = this.f65105d.mo68886e1(mo75400u());
        return e1 != null && e1.mo74949a();
    }

    /* renamed from: b */
    public final boolean mo70869b() {
        C15608g e1 = this.f65105d.mo68886e1(mo75400u());
        return e1 != null && e1.mo74950b();
    }

    /* renamed from: d */
    public View mo70870d() {
        return null;
    }

    @CallSuper
    /* renamed from: f */
    public void mo70871f(int i, int i2) {
        this.f65108o = i2;
        this.f65107g = this.f65105d.mo68946M(i);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = C15705a.m94971b(this.f65105d.mo68942H());
        objArr[2] = i2 == 1 ? "Swipe(1)" : "Drag(2)";
        C15706b.m94982j("onActionStateChanged position=%s mode=%s actionState=%s", objArr);
        if (i2 == 2) {
            if (!this.f65107g) {
                if ((this.f65106f || this.f65105d.mo68942H() == 2) && (mo75413y() || this.f65105d.mo68942H() != 2)) {
                    C12454b bVar = this.f65105d;
                    if (bVar.f59291R0 != null && bVar.mo68859L(i)) {
                        C15706b.m94982j("onLongClick on position %s mode=%s", Integer.valueOf(i), Integer.valueOf(this.f65105d.mo68942H()));
                        this.f65105d.f59291R0.mo68931a(i);
                        this.f65107g = true;
                    }
                }
                if (!this.f65107g) {
                    this.f65105d.mo68863Q(i);
                }
            }
            if (!mo75399t().isActivated()) {
                mo75414z();
            }
        } else if (i2 == 1 && mo75412x() && !this.f65107g) {
            this.f65105d.mo68863Q(i);
            mo75414z();
        }
    }

    /* renamed from: o */
    public View mo70872o() {
        return null;
    }

    @CallSuper
    public void onClick(View view) {
        int u = mo75400u();
        if (this.f65105d.mo68851D1(u) && this.f65105d.f59289Q0 != null && this.f65108o == 0) {
            C15706b.m94982j("onClick on position %s mode=%s", Integer.valueOf(u), C15705a.m94971b(this.f65105d.mo68942H()));
            if (this.f65105d.f59289Q0.mo29315a(view, u)) {
                mo75414z();
            }
        }
    }

    @CallSuper
    public boolean onLongClick(View view) {
        int u = mo75400u();
        if (!this.f65105d.mo68851D1(u)) {
            return false;
        }
        C12454b bVar = this.f65105d;
        if (bVar.f59291R0 == null || bVar.mo68852E1()) {
            this.f65106f = true;
            return false;
        }
        C15706b.m94982j("onLongClick on position %s mode=%s", Integer.valueOf(u), C15705a.m94971b(this.f65105d.mo68942H()));
        this.f65105d.f59291R0.mo68931a(u);
        mo75414z();
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int u = mo75400u();
        if (!this.f65105d.mo68851D1(u) || !mo70869b()) {
            C15706b.m94983k("Can't start drag: Item is not enabled or draggable!", new Object[0]);
            return false;
        }
        C15706b.m94982j("onTouch with DragHandleView on position %s mode=%s", Integer.valueOf(u), C15705a.m94971b(this.f65105d.mo68942H()));
        if (motionEvent.getActionMasked() == 0 && this.f65105d.mo68846B1()) {
            this.f65105d.mo68888f1().startDrag(this);
        }
        return false;
    }

    /* renamed from: p */
    public View mo70873p() {
        return this.itemView;
    }

    @CallSuper
    /* renamed from: s */
    public void mo70874s(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = C15705a.m94971b(this.f65105d.mo68942H());
        objArr[2] = this.f65108o == 1 ? "Swipe(1)" : "Drag(2)";
        C15706b.m94982j("onItemReleased position=%s mode=%s actionState=%s", objArr);
        if (!this.f65107g) {
            if (mo75413y() && this.f65105d.mo68942H() == 2) {
                C15706b.m94982j("onLongClick for ActionMode on position %s mode=%s", Integer.valueOf(i), Integer.valueOf(this.f65105d.mo68942H()));
                C12454b.C12469n nVar = this.f65105d.f59291R0;
                if (nVar != null) {
                    nVar.mo68931a(i);
                }
                if (this.f65105d.mo68946M(i)) {
                    mo75414z();
                }
            } else if (mo75412x() && mo75399t().isActivated()) {
                this.f65105d.mo68863Q(i);
                mo75414z();
            } else if (this.f65108o == 2) {
                this.f65105d.mo68863Q(i);
                if (mo75399t().isActivated()) {
                    mo75414z();
                }
            }
        }
        this.f65106f = false;
        this.f65108o = 0;
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ View mo75399t() {
        return super.mo75399t();
    }

    /* renamed from: v */
    public float mo75410v() {
        return 0.0f;
    }

    /* renamed from: w */
    public void mo75411w(@NonNull List<Animator> list, int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo75412x() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo75413y() {
        return false;
    }

    @CallSuper
    /* renamed from: z */
    public void mo75414z() {
        int u = mo75400u();
        if (this.f65105d.mo68859L(u)) {
            boolean M = this.f65105d.mo68946M(u);
            if ((mo75399t().isActivated() && !M) || (!mo75399t().isActivated() && M)) {
                mo75399t().setActivated(M);
                if (this.f65105d.mo68897k1() == u) {
                    this.f65105d.mo68855H0();
                }
                if (mo75399t().isActivated() && mo75410v() > 0.0f) {
                    ViewCompat.setElevation(this.itemView, mo75410v());
                } else if (mo75410v() > 0.0f) {
                    ViewCompat.setElevation(this.itemView, 0.0f);
                }
            }
        }
    }

    public C15763c(View view, C12454b bVar, boolean z) {
        super(view, bVar, z);
        this.f65106f = false;
        this.f65107g = false;
        this.f65108o = 0;
        this.f65105d = bVar;
        if (bVar.f59289Q0 != null) {
            mo75399t().setOnClickListener(this);
        }
        if (bVar.f59291R0 != null) {
            mo75399t().setOnLongClickListener(this);
        }
    }
}
