package p196y4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p063b5.C2250c;
import p090f5.C7316k;

/* renamed from: y4.n */
/* compiled from: RequestTracker */
public class C10426n {

    /* renamed from: a */
    private final Set<C2250c> f23674a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C2250c> f23675b = new ArrayList();

    /* renamed from: c */
    private boolean f23676c;

    /* renamed from: a */
    private boolean m40818a(@Nullable C2250c cVar, boolean z) {
        boolean z2 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f23674a.remove(cVar);
        if (!this.f23675b.remove(cVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            cVar.clear();
            if (z) {
                cVar.recycle();
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo41131b(@Nullable C2250c cVar) {
        return m40818a(cVar, true);
    }

    /* renamed from: c */
    public void mo41132c() {
        for (T a : C7316k.m30214i(this.f23674a)) {
            m40818a(a, false);
        }
        this.f23675b.clear();
    }

    /* renamed from: d */
    public void mo41133d() {
        this.f23676c = true;
        for (T t : C7316k.m30214i(this.f23674a)) {
            if (t.isRunning()) {
                t.clear();
                this.f23675b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo41134e() {
        for (T t : C7316k.m30214i(this.f23674a)) {
            if (!t.isComplete() && !t.mo24533g()) {
                t.clear();
                if (!this.f23676c) {
                    t.mo24538j();
                } else {
                    this.f23675b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo41135f() {
        this.f23676c = false;
        for (T t : C7316k.m30214i(this.f23674a)) {
            if (!t.isComplete() && !t.isRunning()) {
                t.mo24538j();
            }
        }
        this.f23675b.clear();
    }

    /* renamed from: g */
    public void mo41136g(@NonNull C2250c cVar) {
        this.f23674a.add(cVar);
        if (!this.f23676c) {
            cVar.mo24538j();
            return;
        }
        cVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f23675b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f23674a.size() + ", isPaused=" + this.f23676c + "}";
    }
}
