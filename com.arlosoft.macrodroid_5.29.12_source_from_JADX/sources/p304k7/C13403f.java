package p304k7;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p304k7.C13401e;

/* renamed from: k7.f */
/* compiled from: KeyframeSet */
class C13403f {

    /* renamed from: a */
    int f61440a;

    /* renamed from: b */
    C13401e f61441b = this.f61444e.get(0);

    /* renamed from: c */
    C13401e f61442c;

    /* renamed from: d */
    Interpolator f61443d;

    /* renamed from: e */
    ArrayList<C13401e> f61444e;

    /* renamed from: f */
    C13407h f61445f;

    public C13403f(C13401e... eVarArr) {
        this.f61440a = eVarArr.length;
        ArrayList<C13401e> arrayList = new ArrayList<>();
        this.f61444e = arrayList;
        arrayList.addAll(Arrays.asList(eVarArr));
        C13401e eVar = this.f61444e.get(this.f61440a - 1);
        this.f61442c = eVar;
        this.f61443d = eVar.mo70822c();
    }

    /* renamed from: c */
    public static C13403f m85801c(float... fArr) {
        int length = fArr.length;
        C13401e.C13402a[] aVarArr = new C13401e.C13402a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (C13401e.C13402a) C13401e.m85790e(0.0f);
            aVarArr[1] = (C13401e.C13402a) C13401e.m85791f(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (C13401e.C13402a) C13401e.m85791f(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (C13401e.C13402a) C13401e.m85791f(((float) i) / ((float) (length - 1)), fArr[i]);
            }
        }
        return new C13399c(aVarArr);
    }

    /* renamed from: a */
    public C13403f mo70814a() {
        throw null;
    }

    /* renamed from: b */
    public Object mo70815b(float f) {
        throw null;
    }

    /* renamed from: d */
    public void mo70828d(C13407h hVar) {
        this.f61445f = hVar;
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f61440a; i++) {
            str = str + this.f61444e.get(i).mo70824d() + "  ";
        }
        return str;
    }
}
