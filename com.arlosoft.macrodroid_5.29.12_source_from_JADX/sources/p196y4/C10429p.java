package p196y4;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p067c5.C2278h;
import p090f5.C7316k;

/* renamed from: y4.p */
/* compiled from: TargetTracker */
public final class C10429p implements C10418i {

    /* renamed from: a */
    private final Set<C2278h<?>> f23684a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: N */
    public void mo24581N() {
        for (T N : C7316k.m30214i(this.f23684a)) {
            N.mo24581N();
        }
    }

    /* renamed from: i */
    public void mo41144i() {
        this.f23684a.clear();
    }

    @NonNull
    /* renamed from: j */
    public List<C2278h<?>> mo41145j() {
        return C7316k.m30214i(this.f23684a);
    }

    /* renamed from: k */
    public void mo41146k(@NonNull C2278h<?> hVar) {
        this.f23684a.add(hVar);
    }

    /* renamed from: l */
    public void mo41147l(@NonNull C2278h<?> hVar) {
        this.f23684a.remove(hVar);
    }

    public void onDestroy() {
        for (T onDestroy : C7316k.m30214i(this.f23684a)) {
            onDestroy.onDestroy();
        }
    }

    public void onStart() {
        for (T onStart : C7316k.m30214i(this.f23684a)) {
            onStart.onStart();
        }
    }
}
