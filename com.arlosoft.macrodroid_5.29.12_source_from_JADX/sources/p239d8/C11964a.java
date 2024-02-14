package p239d8;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import p249e8.C12172a;
import p260f8.C12247a;
import p260f8.C12248b;

/* renamed from: d8.a */
/* compiled from: ExpandCollapseController */
public class C11964a {

    /* renamed from: a */
    private C12172a f58155a;

    /* renamed from: b */
    private C12247a f58156b;

    public C11964a(C12247a aVar, C12172a aVar2) {
        this.f58156b = aVar;
        this.f58155a = aVar2;
    }

    /* renamed from: a */
    private void m82336a(C12248b bVar) {
        C12247a aVar = this.f58156b;
        aVar.f58757b[bVar.f58759a] = false;
        C12172a aVar2 = this.f58155a;
        if (aVar2 != null) {
            aVar2.mo67377u(aVar.mo68565b(bVar) + 1, ((ExpandableGroup) this.f58156b.f58756a.get(bVar.f58759a)).mo66994a());
        }
    }

    /* renamed from: b */
    private void m82337b(C12248b bVar) {
        C12247a aVar = this.f58156b;
        aVar.f58757b[bVar.f58759a] = true;
        C12172a aVar2 = this.f58155a;
        if (aVar2 != null) {
            aVar2.mo67378w(aVar.mo68565b(bVar) + 1, ((ExpandableGroup) this.f58156b.f58756a.get(bVar.f58759a)).mo66994a());
        }
    }

    /* renamed from: c */
    public boolean mo67374c(int i) {
        C12248b c = this.f58156b.mo68566c(i);
        boolean z = this.f58156b.f58757b[c.f58759a];
        if (z) {
            m82336a(c);
        } else {
            m82337b(c);
        }
        return z;
    }
}
