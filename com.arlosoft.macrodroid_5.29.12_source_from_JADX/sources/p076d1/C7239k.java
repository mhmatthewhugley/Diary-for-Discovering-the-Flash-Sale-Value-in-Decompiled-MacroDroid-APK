package p076d1;

import java.util.ArrayList;
import kotlin.jvm.internal.C13706o;

/* renamed from: d1.k */
/* compiled from: BubbleShowCaseSequence.kt */
public final class C7239k {

    /* renamed from: a */
    private final ArrayList<C7237i> f17667a;

    /* renamed from: d1.k$a */
    /* compiled from: BubbleShowCaseSequence.kt */
    public static final class C7240a implements C7243n {

        /* renamed from: a */
        final /* synthetic */ C7239k f17668a;

        /* renamed from: b */
        final /* synthetic */ int f17669b;

        C7240a(C7239k kVar, int i) {
            this.f17668a = kVar;
            this.f17669b = i;
        }

        public void onDismiss() {
            this.f17668a.m29941d(this.f17669b + 1);
        }
    }

    public C7239k() {
        ArrayList<C7237i> arrayList = new ArrayList<>();
        this.f17667a = arrayList;
        arrayList.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29941d(int i) {
        if (i < this.f17667a.size()) {
            if (i == 0) {
                this.f17667a.get(i).mo37096x(true);
                this.f17667a.get(i).mo37097y(false);
            } else if (i == this.f17667a.size() - 1) {
                this.f17667a.get(i).mo37096x(false);
                this.f17667a.get(i).mo37097y(true);
            } else {
                this.f17667a.get(i).mo37096x(false);
                this.f17667a.get(i).mo37097y(false);
            }
            this.f17667a.get(i).mo37071A(new C7240a(this, i)).mo37072B();
        }
    }

    /* renamed from: b */
    public final C7239k mo37099b(C7237i iVar) {
        C13706o.m87929f(iVar, "bubbleShowCaseBuilder");
        this.f17667a.add(iVar);
        return this;
    }

    /* renamed from: c */
    public final void mo37100c() {
        m29941d(0);
    }
}
