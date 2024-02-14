package p196y4;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p090f5.C7316k;

/* renamed from: y4.a */
/* compiled from: ActivityFragmentLifecycle */
class C10408a implements C10417h {

    /* renamed from: a */
    private final Set<C10418i> f23649a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f23650b;

    /* renamed from: c */
    private boolean f23651c;

    C10408a() {
    }

    /* renamed from: a */
    public void mo41104a(@NonNull C10418i iVar) {
        this.f23649a.add(iVar);
        if (this.f23651c) {
            iVar.onDestroy();
        } else if (this.f23650b) {
            iVar.onStart();
        } else {
            iVar.mo24581N();
        }
    }

    /* renamed from: b */
    public void mo41105b(@NonNull C10418i iVar) {
        this.f23649a.remove(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41106c() {
        this.f23651c = true;
        for (T onDestroy : C7316k.m30214i(this.f23649a)) {
            onDestroy.onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41107d() {
        this.f23650b = true;
        for (T onStart : C7316k.m30214i(this.f23649a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41108e() {
        this.f23650b = false;
        for (T N : C7316k.m30214i(this.f23649a)) {
            N.mo24581N();
        }
    }
}
