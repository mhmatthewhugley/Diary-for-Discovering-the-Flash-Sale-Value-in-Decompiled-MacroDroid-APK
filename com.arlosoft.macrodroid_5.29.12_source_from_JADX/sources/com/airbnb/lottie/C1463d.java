package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p001a0.C0006d;
import p048t.C2095c;
import p048t.C2096d;
import p048t.C2100h;
import p051w.C2146d;

/* renamed from: com.airbnb.lottie.d */
/* compiled from: LottieComposition */
public class C1463d {

    /* renamed from: a */
    private final C1497n f892a = new C1497n();

    /* renamed from: b */
    private final HashSet<String> f893b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C2146d>> f894c;

    /* renamed from: d */
    private Map<String, C1488g> f895d;

    /* renamed from: e */
    private Map<String, C2095c> f896e;

    /* renamed from: f */
    private List<C2100h> f897f;

    /* renamed from: g */
    private SparseArrayCompat<C2096d> f898g;

    /* renamed from: h */
    private LongSparseArray<C2146d> f899h;

    /* renamed from: i */
    private List<C2146d> f900i;

    /* renamed from: j */
    private Rect f901j;

    /* renamed from: k */
    private float f902k;

    /* renamed from: l */
    private float f903l;

    /* renamed from: m */
    private float f904m;

    /* renamed from: n */
    private boolean f905n;

    /* renamed from: o */
    private int f906o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public void mo17052a(String str) {
        C0006d.m32c(str);
        this.f893b.add(str);
    }

    /* renamed from: b */
    public Rect mo17053b() {
        return this.f901j;
    }

    /* renamed from: c */
    public SparseArrayCompat<C2096d> mo17054c() {
        return this.f898g;
    }

    /* renamed from: d */
    public float mo17055d() {
        return (float) ((long) ((mo17056e() / this.f904m) * 1000.0f));
    }

    /* renamed from: e */
    public float mo17056e() {
        return this.f903l - this.f902k;
    }

    /* renamed from: f */
    public float mo17057f() {
        return this.f903l;
    }

    /* renamed from: g */
    public Map<String, C2095c> mo17058g() {
        return this.f896e;
    }

    /* renamed from: h */
    public float mo17059h() {
        return this.f904m;
    }

    /* renamed from: i */
    public Map<String, C1488g> mo17060i() {
        return this.f895d;
    }

    /* renamed from: j */
    public List<C2146d> mo17061j() {
        return this.f900i;
    }

    @Nullable
    /* renamed from: k */
    public C2100h mo17062k(String str) {
        int size = this.f897f.size();
        for (int i = 0; i < size; i++) {
            C2100h hVar = this.f897f.get(i);
            if (hVar.mo24223a(str)) {
                return hVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: l */
    public int mo17063l() {
        return this.f906o;
    }

    /* renamed from: m */
    public C1497n mo17064m() {
        return this.f892a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: n */
    public List<C2146d> mo17065n(String str) {
        return this.f894c.get(str);
    }

    /* renamed from: o */
    public float mo17066o() {
        return this.f902k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p */
    public boolean mo17067p() {
        return this.f905n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: q */
    public void mo17068q(int i) {
        this.f906o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: r */
    public void mo17069r(Rect rect, float f, float f2, float f3, List<C2146d> list, LongSparseArray<C2146d> longSparseArray, Map<String, List<C2146d>> map, Map<String, C1488g> map2, SparseArrayCompat<C2096d> sparseArrayCompat, Map<String, C2095c> map3, List<C2100h> list2) {
        this.f901j = rect;
        this.f902k = f;
        this.f903l = f2;
        this.f904m = f3;
        this.f900i = list;
        this.f899h = longSparseArray;
        this.f894c = map;
        this.f895d = map2;
        this.f898g = sparseArrayCompat;
        this.f896e = map3;
        this.f897f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: s */
    public C2146d mo17070s(long j) {
        return this.f899h.get(j);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: t */
    public void mo17071t(boolean z) {
        this.f905n = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C2146d w : this.f900i) {
            sb.append(w.mo24375w("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo17073u(boolean z) {
        this.f892a.mo17172b(z);
    }
}
