package p032g;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import android.view.View;
import p017c.C1422b;

/* renamed from: g.a */
/* compiled from: PermissionNotGrantedClickListener */
public class C1987a implements View.OnClickListener {

    /* renamed from: a */
    private final MaterialIntroActivity f6067a;

    /* renamed from: c */
    private final C1422b f6068c;

    public C1987a(MaterialIntroActivity materialIntroActivity, C1422b bVar) {
        this.f6067a = materialIntroActivity;
        this.f6068c = bVar;
    }

    public void onClick(View view) {
        this.f6068c.mo16881c();
        this.f6067a.mo78h2();
    }
}
