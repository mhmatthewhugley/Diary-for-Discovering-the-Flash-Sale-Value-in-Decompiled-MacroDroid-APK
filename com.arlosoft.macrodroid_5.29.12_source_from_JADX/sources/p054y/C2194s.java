package p054y;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0010h;
import p012b0.C1397a;
import p049u.C2103b;
import p049u.C2111j;
import p049u.C2112k;
import p049u.C2113l;
import p050v.C2117b;
import p051w.C2146d;
import p055z.C2205c;

/* renamed from: y.s */
/* compiled from: LayerParser */
public class C2194s {

    /* renamed from: a */
    private static final C2205c.C2206a f6811a = C2205c.C2206a.m9050a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final C2205c.C2206a f6812b = C2205c.C2206a.m9050a("d", "a");

    /* renamed from: c */
    private static final C2205c.C2206a f6813c = C2205c.C2206a.m9050a("nm");

    /* renamed from: y.s$a */
    /* compiled from: LayerParser */
    static /* synthetic */ class C2195a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6814a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                w.d$b[] r0 = p051w.C2146d.C2148b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6814a = r0
                w.d$b r1 = p051w.C2146d.C2148b.LUMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6814a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.d$b r1 = p051w.C2146d.C2148b.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p054y.C2194s.C2195a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C2146d m9015a(C1463d dVar) {
        Rect b = dVar.mo17053b();
        List emptyList = Collections.emptyList();
        C2146d.C2147a aVar = C2146d.C2147a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C2113l lVar = r4;
        C2113l lVar2 = new C2113l();
        return new C2146d(emptyList, dVar, "__container", -1, aVar, -1, (String) null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), (C2111j) null, (C2112k) null, Collections.emptyList(), C2146d.C2148b.NONE, (C2103b) null, false);
    }

    /* renamed from: b */
    public static C2146d m9016b(C2205c cVar, C1463d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2205c cVar2 = cVar;
        C1463d dVar2 = dVar;
        C2146d.C2148b bVar = C2146d.C2148b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.mo24400e();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C2146d.C2148b bVar2 = bVar;
        C2146d.C2147a aVar = null;
        String str = null;
        C2113l lVar = null;
        C2111j jVar = null;
        C2112k kVar = null;
        C2103b bVar3 = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (cVar.mo24404h()) {
            switch (cVar2.mo24412v(f6811a)) {
                case 0:
                    str3 = cVar.mo24409p();
                    break;
                case 1:
                    j2 = (long) cVar.mo24407m();
                    break;
                case 2:
                    str = cVar.mo24409p();
                    break;
                case 3:
                    int m = cVar.mo24407m();
                    aVar = C2146d.C2147a.UNKNOWN;
                    if (m >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = C2146d.C2147a.values()[m];
                        break;
                    }
                case 4:
                    j = (long) cVar.mo24407m();
                    break;
                case 5:
                    i = (int) (((float) cVar.mo24407m()) * C0010h.m75e());
                    break;
                case 6:
                    i2 = (int) (((float) cVar.mo24407m()) * C0010h.m75e());
                    break;
                case 7:
                    i3 = Color.parseColor(cVar.mo24409p());
                    break;
                case 8:
                    lVar = C2169c.m8958g(cVar, dVar);
                    break;
                case 9:
                    int m2 = cVar.mo24407m();
                    if (m2 < C2146d.C2148b.values().length) {
                        bVar2 = C2146d.C2148b.values()[m2];
                        int i6 = C2195a.f6814a[bVar2.ordinal()];
                        if (i6 == 1) {
                            dVar2.mo17052a("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            dVar2.mo17052a("Unsupported matte type: Luma Inverted");
                        }
                        dVar2.mo17068q(1);
                        break;
                    } else {
                        dVar2.mo17052a("Unsupported matte type: " + m2);
                        break;
                    }
                case 10:
                    cVar.mo24399c();
                    while (cVar.mo24404h()) {
                        arrayList3.add(C2197u.m9023a(cVar, dVar));
                    }
                    dVar2.mo17068q(arrayList3.size());
                    cVar.mo24401f();
                    break;
                case 11:
                    cVar.mo24399c();
                    while (cVar.mo24404h()) {
                        C2117b a = C2177g.m8979a(cVar, dVar);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    cVar.mo24401f();
                    break;
                case 12:
                    cVar.mo24400e();
                    while (cVar.mo24404h()) {
                        int v = cVar2.mo24412v(f6812b);
                        if (v == 0) {
                            jVar = C2171d.m8964d(cVar, dVar);
                        } else if (v != 1) {
                            cVar.mo24413w();
                            cVar.mo24414x();
                        } else {
                            cVar.mo24399c();
                            if (cVar.mo24404h()) {
                                kVar = C2167b.m8949a(cVar, dVar);
                            }
                            while (cVar.mo24404h()) {
                                cVar.mo24414x();
                            }
                            cVar.mo24401f();
                        }
                    }
                    cVar.mo24402g();
                    break;
                case 13:
                    cVar.mo24399c();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.mo24404h()) {
                        cVar.mo24400e();
                        while (cVar.mo24404h()) {
                            if (cVar2.mo24412v(f6813c) != 0) {
                                cVar.mo24413w();
                                cVar.mo24414x();
                            } else {
                                arrayList5.add(cVar.mo24409p());
                            }
                        }
                        cVar.mo24402g();
                    }
                    cVar.mo24401f();
                    dVar2.mo17052a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f3 = (float) cVar.mo24406j();
                    break;
                case 15:
                    f4 = (float) cVar.mo24406j();
                    break;
                case 16:
                    i4 = (int) (((float) cVar.mo24407m()) * C0010h.m75e());
                    break;
                case 17:
                    i5 = (int) (((float) cVar.mo24407m()) * C0010h.m75e());
                    break;
                case 18:
                    f = (float) cVar.mo24406j();
                    break;
                case 19:
                    f2 = (float) cVar.mo24406j();
                    break;
                case 20:
                    bVar3 = C2171d.m8966f(cVar2, dVar2, false);
                    break;
                case 21:
                    str2 = cVar.mo24409p();
                    break;
                case 22:
                    z = cVar.mo24405i();
                    break;
                default:
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
        }
        cVar.mo24402g();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            C1397a aVar2 = r0;
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            C1397a aVar3 = new C1397a(dVar, valueOf2, valueOf2, (Interpolator) null, 0.0f, Float.valueOf(f5));
            arrayList2.add(aVar2);
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= 0.0f) {
            f6 = dVar.mo17057f();
        }
        C1463d dVar3 = dVar;
        arrayList2.add(new C1397a(dVar3, valueOf, valueOf, (Interpolator) null, f5, Float.valueOf(f6)));
        arrayList2.add(new C1397a(dVar3, valueOf2, valueOf2, (Interpolator) null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            dVar2.mo17052a("Convert your Illustrator layers to shape layers.");
        }
        return new C2146d(arrayList4, dVar, str3, j2, aVar, j, str, arrayList, lVar, i, i2, i3, f3, f4, i4, i5, jVar, kVar, arrayList2, bVar2, bVar3, z);
    }
}
