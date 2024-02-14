package p031f;

import agency.tango.materialintroscreen.R$anim;
import agency.tango.materialintroscreen.R$string;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import p000a.C0001b;
import p000a.C0002c;
import p011b.C1396a;

/* renamed from: f.d */
/* compiled from: MessageButtonBehaviourOnPageSelected */
public class C1983d implements C1981b {

    /* renamed from: a */
    private Button f6056a;

    /* renamed from: b */
    private C1396a f6057b;

    /* renamed from: c */
    private SparseArray<C0001b> f6058c;

    /* renamed from: f.d$a */
    /* compiled from: MessageButtonBehaviourOnPageSelected */
    class C1984a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0002c f6059a;

        C1984a(C0002c cVar) {
            this.f6059a = cVar;
        }

        public void onClick(View view) {
            this.f6059a.mo6V();
        }
    }

    public C1983d(Button button, C1396a aVar, SparseArray<C0001b> sparseArray) {
        this.f6056a = button;
        this.f6057b = aVar;
        this.f6058c = sparseArray;
    }

    /* renamed from: b */
    private boolean m8286b(int i) {
        return this.f6058c.get(i) != null && C0002c.m5j0(this.f6058c.get(i).mo5b());
    }

    /* renamed from: c */
    private void m8287c(C0002c cVar) {
    }

    /* renamed from: a */
    public void mo85a(int i) {
        C0002c b = this.f6057b.getItem(i);
        if (b.mo10f0()) {
            m8287c(b);
            this.f6056a.setText(b.getActivity().getString(R$string.grant_permissions));
            this.f6056a.setOnClickListener(new C1984a(b));
        } else if (m8286b(i)) {
            m8287c(b);
            this.f6056a.setText(this.f6058c.get(i).mo5b());
            this.f6056a.setOnClickListener(this.f6058c.get(i).mo4a());
        } else if (this.f6056a.getVisibility() != 4) {
            this.f6056a.startAnimation(AnimationUtils.loadAnimation(b.getContext(), R$anim.fade_out));
            this.f6056a.setVisibility(4);
        }
    }
}
