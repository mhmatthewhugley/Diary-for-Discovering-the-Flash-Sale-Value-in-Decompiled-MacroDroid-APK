package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p001a0.C0008f;

/* renamed from: com.airbnb.lottie.n */
/* compiled from: PerformanceTracker */
public class C1497n {

    /* renamed from: a */
    private boolean f1021a = false;

    /* renamed from: b */
    private final Set<C1499b> f1022b = new ArraySet();

    /* renamed from: c */
    private final Map<String, C0008f> f1023c = new HashMap();

    /* renamed from: d */
    private final Comparator<Pair<String, Float>> f1024d = new C1498a();

    /* renamed from: com.airbnb.lottie.n$a */
    /* compiled from: PerformanceTracker */
    class C1498a implements Comparator<Pair<String, Float>> {
        C1498a() {
        }

        /* renamed from: a */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: com.airbnb.lottie.n$b */
    /* compiled from: PerformanceTracker */
    public interface C1499b {
        /* renamed from: a */
        void mo17175a(float f);
    }

    /* renamed from: a */
    public void mo17171a(String str, float f) {
        if (this.f1021a) {
            C0008f fVar = this.f1023c.get(str);
            if (fVar == null) {
                fVar = new C0008f();
                this.f1023c.put(str, fVar);
            }
            fVar.mo60a(f);
            if (str.equals("__container")) {
                for (C1499b a : this.f1022b) {
                    a.mo17175a(f);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17172b(boolean z) {
        this.f1021a = z;
    }
}
