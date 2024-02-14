package p054y;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.C1463d;
import com.airbnb.lottie.C1488g;
import com.android.p023dx.rop.code.RegisterSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001a0.C0006d;
import p001a0.C0010h;
import p048t.C2095c;
import p048t.C2096d;
import p048t.C2100h;
import p051w.C2146d;
import p055z.C2205c;

/* renamed from: y.t */
/* compiled from: LottieCompositionMoshiParser */
public class C2196t {

    /* renamed from: a */
    private static final C2205c.C2206a f6815a = C2205c.C2206a.m9050a("w", "h", "ip", "op", "fr", RegisterSpec.PREFIX, "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static C2205c.C2206a f6816b = C2205c.C2206a.m9050a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final C2205c.C2206a f6817c = C2205c.C2206a.m9050a("list");

    /* renamed from: d */
    private static final C2205c.C2206a f6818d = C2205c.C2206a.m9050a("cm", "tm", "dr");

    /* renamed from: a */
    public static C1463d m9017a(C2205c cVar) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        C2205c cVar2 = cVar;
        float e = C0010h.m75e();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        C1463d dVar = new C1463d();
        cVar.mo24400e();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (cVar.mo24404h()) {
            switch (cVar2.mo24412v(f6815a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = cVar.mo24407m();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = cVar.mo24407m();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) cVar.mo24406j();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo24406j()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo24406j();
                    break;
                case 5:
                    String[] split = cVar.mo24409p().split("\\.");
                    if (!C0010h.m80j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar.mo17052a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m9021e(cVar2, dVar, arrayList2, longSparseArray);
                    break;
                case 7:
                    m9018b(cVar2, dVar, hashMap2, hashMap3);
                    break;
                case 8:
                    m9020d(cVar2, hashMap4);
                    break;
                case 9:
                    m9019c(cVar2, dVar, sparseArrayCompat);
                    break;
                case 10:
                    m9022f(cVar2, dVar, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo24413w();
                    cVar.mo24414x();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        ArrayList arrayList7 = arrayList3;
        dVar.mo17069r(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return dVar;
    }

    /* renamed from: b */
    private static void m9018b(C2205c cVar, C1463d dVar, Map<String, List<C2146d>> map, Map<String, C1488g> map2) throws IOException {
        cVar.mo24399c();
        while (cVar.mo24404h()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            cVar.mo24400e();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (cVar.mo24404h()) {
                int v = cVar.mo24412v(f6816b);
                if (v == 0) {
                    str = cVar.mo24409p();
                } else if (v == 1) {
                    cVar.mo24399c();
                    while (cVar.mo24404h()) {
                        C2146d b = C2194s.m9016b(cVar, dVar);
                        longSparseArray.put(b.mo24353b(), b);
                        arrayList.add(b);
                    }
                    cVar.mo24401f();
                } else if (v == 2) {
                    i = cVar.mo24407m();
                } else if (v == 3) {
                    i2 = cVar.mo24407m();
                } else if (v == 4) {
                    str2 = cVar.mo24409p();
                } else if (v != 5) {
                    cVar.mo24413w();
                    cVar.mo24414x();
                } else {
                    str3 = cVar.mo24409p();
                }
            }
            cVar.mo24402g();
            if (str2 != null) {
                C1488g gVar = new C1488g(i, i2, str, str2, str3);
                map2.put(gVar.mo17157d(), gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo24401f();
    }

    /* renamed from: c */
    private static void m9019c(C2205c cVar, C1463d dVar, SparseArrayCompat<C2096d> sparseArrayCompat) throws IOException {
        cVar.mo24399c();
        while (cVar.mo24404h()) {
            C2096d a = C2183j.m8987a(cVar, dVar);
            sparseArrayCompat.put(a.hashCode(), a);
        }
        cVar.mo24401f();
    }

    /* renamed from: d */
    private static void m9020d(C2205c cVar, Map<String, C2095c> map) throws IOException {
        cVar.mo24400e();
        while (cVar.mo24404h()) {
            if (cVar.mo24412v(f6817c) != 0) {
                cVar.mo24413w();
                cVar.mo24414x();
            } else {
                cVar.mo24399c();
                while (cVar.mo24404h()) {
                    C2095c a = C2185k.m8989a(cVar);
                    map.put(a.mo24208b(), a);
                }
                cVar.mo24401f();
            }
        }
        cVar.mo24402g();
    }

    /* renamed from: e */
    private static void m9021e(C2205c cVar, C1463d dVar, List<C2146d> list, LongSparseArray<C2146d> longSparseArray) throws IOException {
        cVar.mo24399c();
        int i = 0;
        while (cVar.mo24404h()) {
            C2146d b = C2194s.m9016b(cVar, dVar);
            if (b.mo24355d() == C2146d.C2147a.IMAGE) {
                i++;
            }
            list.add(b);
            longSparseArray.put(b.mo24353b(), b);
            if (i > 4) {
                C0006d.m32c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.mo24401f();
    }

    /* renamed from: f */
    private static void m9022f(C2205c cVar, C1463d dVar, List<C2100h> list) throws IOException {
        cVar.mo24399c();
        while (cVar.mo24404h()) {
            String str = null;
            cVar.mo24400e();
            float f = 0.0f;
            float f2 = 0.0f;
            while (cVar.mo24404h()) {
                int v = cVar.mo24412v(f6818d);
                if (v == 0) {
                    str = cVar.mo24409p();
                } else if (v == 1) {
                    f = (float) cVar.mo24406j();
                } else if (v != 2) {
                    cVar.mo24413w();
                    cVar.mo24414x();
                } else {
                    f2 = (float) cVar.mo24406j();
                }
            }
            cVar.mo24402g();
            list.add(new C2100h(str, f, f2));
        }
        cVar.mo24401f();
    }
}
