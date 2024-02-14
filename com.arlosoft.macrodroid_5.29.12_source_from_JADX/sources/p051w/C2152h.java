package p051w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C1463d;
import com.airbnb.lottie.C1472f;
import com.airbnb.lottie.C1492k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.p353io.IOUtils;
import p001a0.C0010h;
import p012b0.C1399c;
import p045q.C2050d;
import p046r.C2068a;
import p046r.C2087n;
import p046r.C2089p;
import p048t.C2093b;
import p048t.C2095c;
import p048t.C2096d;
import p049u.C2102a;
import p049u.C2103b;
import p049u.C2112k;
import p050v.C2132n;

/* renamed from: w.h */
/* compiled from: TextLayer */
public class C2152h extends C2140a {

    /* renamed from: A */
    private final RectF f6741A = new RectF();

    /* renamed from: B */
    private final Matrix f6742B = new Matrix();

    /* renamed from: C */
    private final Paint f6743C = new C2153a(1);

    /* renamed from: D */
    private final Paint f6744D = new C2154b(1);

    /* renamed from: E */
    private final Map<C2096d, List<C2050d>> f6745E = new HashMap();

    /* renamed from: F */
    private final LongSparseArray<String> f6746F = new LongSparseArray<>();

    /* renamed from: G */
    private final C2087n f6747G;

    /* renamed from: H */
    private final C1472f f6748H;

    /* renamed from: I */
    private final C1463d f6749I;
    @Nullable

    /* renamed from: J */
    private C2068a<Integer, Integer> f6750J;
    @Nullable

    /* renamed from: K */
    private C2068a<Integer, Integer> f6751K;
    @Nullable

    /* renamed from: L */
    private C2068a<Integer, Integer> f6752L;
    @Nullable

    /* renamed from: M */
    private C2068a<Integer, Integer> f6753M;
    @Nullable

    /* renamed from: N */
    private C2068a<Float, Float> f6754N;
    @Nullable

    /* renamed from: O */
    private C2068a<Float, Float> f6755O;
    @Nullable

    /* renamed from: P */
    private C2068a<Float, Float> f6756P;
    @Nullable

    /* renamed from: Q */
    private C2068a<Float, Float> f6757Q;
    @Nullable

    /* renamed from: R */
    private C2068a<Float, Float> f6758R;
    @Nullable

    /* renamed from: S */
    private C2068a<Float, Float> f6759S;

    /* renamed from: z */
    private final StringBuilder f6760z = new StringBuilder(2);

    /* renamed from: w.h$a */
    /* compiled from: TextLayer */
    class C2153a extends Paint {
        C2153a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: w.h$b */
    /* compiled from: TextLayer */
    class C2154b extends Paint {
        C2154b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: w.h$c */
    /* compiled from: TextLayer */
    static /* synthetic */ class C2155c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6763a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                t.b$a[] r0 = p048t.C2093b.C2094a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6763a = r0
                t.b$a r1 = p048t.C2093b.C2094a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6763a     // Catch:{ NoSuchFieldError -> 0x001d }
                t.b$a r1 = p048t.C2093b.C2094a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                t.b$a r1 = p048t.C2093b.C2094a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051w.C2152h.C2155c.<clinit>():void");
        }
    }

    C2152h(C1472f fVar, C2146d dVar) {
        super(fVar, dVar);
        C2103b bVar;
        C2103b bVar2;
        C2102a aVar;
        C2102a aVar2;
        this.f6748H = fVar;
        this.f6749I = dVar.mo24352a();
        C2087n c = dVar.mo24368q().mo24228a();
        this.f6747G = c;
        c.mo24142a(this);
        mo24347i(c);
        C2112k r = dVar.mo24369r();
        if (!(r == null || (aVar2 = r.f6526a) == null)) {
            C2068a<Integer, Integer> a = aVar2.mo24228a();
            this.f6750J = a;
            a.mo24142a(this);
            mo24347i(this.f6750J);
        }
        if (!(r == null || (aVar = r.f6527b) == null)) {
            C2068a<Integer, Integer> a2 = aVar.mo24228a();
            this.f6752L = a2;
            a2.mo24142a(this);
            mo24347i(this.f6752L);
        }
        if (!(r == null || (bVar2 = r.f6528c) == null)) {
            C2068a<Float, Float> a3 = bVar2.mo24228a();
            this.f6754N = a3;
            a3.mo24142a(this);
            mo24347i(this.f6754N);
        }
        if (r != null && (bVar = r.f6529d) != null) {
            C2068a<Float, Float> a4 = bVar.mo24228a();
            this.f6756P = a4;
            a4.mo24142a(this);
            mo24347i(this.f6756P);
        }
    }

    /* renamed from: K */
    private void m8903K(C2093b.C2094a aVar, Canvas canvas, float f) {
        int i = C2155c.f6763a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: L */
    private String m8904L(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m8916X(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f6746F.containsKey(j)) {
            return this.f6746F.get(j);
        }
        this.f6760z.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f6760z.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f6760z.toString();
        this.f6746F.put(j, sb);
        return sb;
    }

    /* renamed from: M */
    private void m8905M(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: N */
    private void m8906N(C2096d dVar, Matrix matrix, float f, C2093b bVar, Canvas canvas) {
        List<C2050d> U = m8913U(dVar);
        for (int i = 0; i < U.size(); i++) {
            Path path = U.get(i).getPath();
            path.computeBounds(this.f6741A, false);
            this.f6742B.set(matrix);
            this.f6742B.preTranslate(0.0f, (-bVar.f6493g) * C0010h.m75e());
            this.f6742B.preScale(f, f);
            path.transform(this.f6742B);
            if (bVar.f6497k) {
                m8909Q(path, this.f6743C, canvas);
                m8909Q(path, this.f6744D, canvas);
            } else {
                m8909Q(path, this.f6744D, canvas);
                m8909Q(path, this.f6743C, canvas);
            }
        }
    }

    /* renamed from: O */
    private void m8907O(String str, C2093b bVar, Canvas canvas) {
        if (bVar.f6497k) {
            m8905M(str, this.f6743C, canvas);
            m8905M(str, this.f6744D, canvas);
            return;
        }
        m8905M(str, this.f6744D, canvas);
        m8905M(str, this.f6743C, canvas);
    }

    /* renamed from: P */
    private void m8908P(String str, C2093b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String L = m8904L(str, i);
            i += L.length();
            m8907O(L, bVar, canvas);
            canvas.translate(this.f6743C.measureText(L) + f, 0.0f);
        }
    }

    /* renamed from: Q */
    private void m8909Q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: R */
    private void m8910R(String str, C2093b bVar, Matrix matrix, C2095c cVar, Canvas canvas, float f, float f2) {
        float floatValue;
        for (int i = 0; i < str.length(); i++) {
            C2096d dVar = this.f6749I.mo17054c().get(C2096d.m8651c(str.charAt(i), cVar.mo24207a(), cVar.mo24209c()));
            if (dVar != null) {
                m8906N(dVar, matrix, f2, bVar, canvas);
                float b = ((float) dVar.mo24211b()) * f2 * C0010h.m75e() * f;
                float f3 = ((float) bVar.f6491e) / 10.0f;
                C2068a<Float, Float> aVar = this.f6757Q;
                if (aVar != null) {
                    floatValue = aVar.mo24148h().floatValue();
                } else {
                    C2068a<Float, Float> aVar2 = this.f6756P;
                    if (aVar2 != null) {
                        floatValue = aVar2.mo24148h().floatValue();
                    }
                    canvas.translate(b + (f3 * f), 0.0f);
                }
                f3 += floatValue;
                canvas.translate(b + (f3 * f), 0.0f);
            }
        }
    }

    /* renamed from: S */
    private void m8911S(C2093b bVar, Matrix matrix, C2095c cVar, Canvas canvas) {
        float f;
        C2093b bVar2 = bVar;
        Canvas canvas2 = canvas;
        C2068a<Float, Float> aVar = this.f6759S;
        if (aVar != null) {
            f = aVar.mo24148h().floatValue();
        } else {
            C2068a<Float, Float> aVar2 = this.f6758R;
            if (aVar2 != null) {
                f = aVar2.mo24148h().floatValue();
            } else {
                f = bVar2.f6489c;
            }
        }
        float f2 = f / 100.0f;
        float g = C0010h.m77g(matrix);
        String str = bVar2.f6487a;
        float e = bVar2.f6492f * C0010h.m75e();
        List<String> W = m8915W(str);
        int size = W.size();
        for (int i = 0; i < size; i++) {
            String str2 = W.get(i);
            float V = m8914V(str2, cVar, f2, g);
            canvas.save();
            m8903K(bVar2.f6490d, canvas2, V);
            canvas2.translate(0.0f, (((float) i) * e) - ((((float) (size - 1)) * e) / 2.0f));
            m8910R(str2, bVar, matrix, cVar, canvas, g, f2);
            canvas.restore();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a4 A[LOOP:0: B:18:0x00a2->B:19:0x00a4, LOOP_END] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8912T(p048t.C2093b r7, p048t.C2095c r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            p001a0.C0010h.m77g(r9)
            com.airbnb.lottie.f r9 = r6.f6748H
            java.lang.String r0 = r8.mo24207a()
            java.lang.String r8 = r8.mo24209c()
            android.graphics.Typeface r8 = r9.mo17092G(r0, r8)
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r9 = r7.f6487a
            com.airbnb.lottie.f r0 = r6.f6748H
            r0.mo17091F()
            android.graphics.Paint r0 = r6.f6743C
            r0.setTypeface(r8)
            r.a<java.lang.Float, java.lang.Float> r8 = r6.f6759S
            if (r8 == 0) goto L_0x002f
            java.lang.Object r8 = r8.mo24148h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x0040
        L_0x002f:
            r.a<java.lang.Float, java.lang.Float> r8 = r6.f6758R
            if (r8 == 0) goto L_0x003e
            java.lang.Object r8 = r8.mo24148h()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x0040
        L_0x003e:
            float r8 = r7.f6489c
        L_0x0040:
            android.graphics.Paint r0 = r6.f6743C
            float r1 = p001a0.C0010h.m75e()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.f6744D
            android.graphics.Paint r1 = r6.f6743C
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.f6744D
            android.graphics.Paint r1 = r6.f6743C
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.f6492f
            float r1 = p001a0.C0010h.m75e()
            float r0 = r0 * r1
            int r1 = r7.f6491e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            r.a<java.lang.Float, java.lang.Float> r2 = r6.f6757Q
            if (r2 == 0) goto L_0x007f
            java.lang.Object r2 = r2.mo24148h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L_0x007d:
            float r1 = r1 + r2
            goto L_0x008e
        L_0x007f:
            r.a<java.lang.Float, java.lang.Float> r2 = r6.f6756P
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r2.mo24148h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L_0x007d
        L_0x008e:
            float r2 = p001a0.C0010h.m75e()
            float r1 = r1 * r2
            float r1 = r1 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r8
            java.util.List r8 = r6.m8915W(r9)
            int r9 = r8.size()
            r2 = 0
        L_0x00a2:
            if (r2 >= r9) goto L_0x00db
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.f6744D
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + -1
            float r5 = (float) r5
            float r5 = r5 * r1
            float r4 = r4 + r5
            r10.save()
            t.b$a r5 = r7.f6490d
            r6.m8903K(r5, r10, r4)
            int r4 = r9 + -1
            float r4 = (float) r4
            float r4 = r4 * r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.m8908P(r3, r7, r10, r1)
            r10.restore()
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p051w.C2152h.m8912T(t.b, t.c, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    /* renamed from: U */
    private List<C2050d> m8913U(C2096d dVar) {
        if (this.f6745E.containsKey(dVar)) {
            return this.f6745E.get(dVar);
        }
        List<C2132n> a = dVar.mo24210a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2050d(this.f6748H, this, a.get(i)));
        }
        this.f6745E.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: V */
    private float m8914V(String str, C2095c cVar, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C2096d dVar = this.f6749I.mo17054c().get(C2096d.m8651c(str.charAt(i), cVar.mo24207a(), cVar.mo24209c()));
            if (dVar != null) {
                f3 = (float) (((double) f3) + (dVar.mo24211b() * ((double) f) * ((double) C0010h.m75e()) * ((double) f2)));
            }
        }
        return f3;
    }

    /* renamed from: W */
    private List<String> m8915W(String str) {
        return Arrays.asList(str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
    }

    /* renamed from: X */
    private boolean m8916X(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    /* renamed from: c */
    public <T> void mo24125c(T t, @Nullable C1399c<T> cVar) {
        super.mo24125c(t, cVar);
        if (t == C1492k.f986a) {
            C2068a<Integer, Integer> aVar = this.f6751K;
            if (aVar != null) {
                mo24341C(aVar);
            }
            if (cVar == null) {
                this.f6751K = null;
                return;
            }
            C2089p pVar = new C2089p(cVar);
            this.f6751K = pVar;
            pVar.mo24142a(this);
            mo24347i(this.f6751K);
        } else if (t == C1492k.f987b) {
            C2068a<Integer, Integer> aVar2 = this.f6753M;
            if (aVar2 != null) {
                mo24341C(aVar2);
            }
            if (cVar == null) {
                this.f6753M = null;
                return;
            }
            C2089p pVar2 = new C2089p(cVar);
            this.f6753M = pVar2;
            pVar2.mo24142a(this);
            mo24347i(this.f6753M);
        } else if (t == C1492k.f1002q) {
            C2068a<Float, Float> aVar3 = this.f6755O;
            if (aVar3 != null) {
                mo24341C(aVar3);
            }
            if (cVar == null) {
                this.f6755O = null;
                return;
            }
            C2089p pVar3 = new C2089p(cVar);
            this.f6755O = pVar3;
            pVar3.mo24142a(this);
            mo24347i(this.f6755O);
        } else if (t == C1492k.f1003r) {
            C2068a<Float, Float> aVar4 = this.f6757Q;
            if (aVar4 != null) {
                mo24341C(aVar4);
            }
            if (cVar == null) {
                this.f6757Q = null;
                return;
            }
            C2089p pVar4 = new C2089p(cVar);
            this.f6757Q = pVar4;
            pVar4.mo24142a(this);
            mo24347i(this.f6757Q);
        } else if (t == C1492k.f983D) {
            C2068a<Float, Float> aVar5 = this.f6759S;
            if (aVar5 != null) {
                mo24341C(aVar5);
            }
            if (cVar == null) {
                this.f6759S = null;
                return;
            }
            C2089p pVar5 = new C2089p(cVar);
            this.f6759S = pVar5;
            pVar5.mo24142a(this);
            mo24347i(this.f6759S);
        }
    }

    /* renamed from: e */
    public void mo24127e(RectF rectF, Matrix matrix, boolean z) {
        super.mo24127e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f6749I.mo17053b().width(), (float) this.f6749I.mo17053b().height());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24348t(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f6748H.mo17136m0()) {
            canvas.concat(matrix);
        }
        C2093b bVar = (C2093b) this.f6747G.mo24148h();
        C2095c cVar = this.f6749I.mo17058g().get(bVar.f6488b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        C2068a<Integer, Integer> aVar = this.f6751K;
        if (aVar != null) {
            this.f6743C.setColor(aVar.mo24148h().intValue());
        } else {
            C2068a<Integer, Integer> aVar2 = this.f6750J;
            if (aVar2 != null) {
                this.f6743C.setColor(aVar2.mo24148h().intValue());
            } else {
                this.f6743C.setColor(bVar.f6494h);
            }
        }
        C2068a<Integer, Integer> aVar3 = this.f6753M;
        if (aVar3 != null) {
            this.f6744D.setColor(aVar3.mo24148h().intValue());
        } else {
            C2068a<Integer, Integer> aVar4 = this.f6752L;
            if (aVar4 != null) {
                this.f6744D.setColor(aVar4.mo24148h().intValue());
            } else {
                this.f6744D.setColor(bVar.f6495i);
            }
        }
        int intValue = ((this.f6680v.mo24192h() == null ? 100 : this.f6680v.mo24192h().mo24148h().intValue()) * 255) / 100;
        this.f6743C.setAlpha(intValue);
        this.f6744D.setAlpha(intValue);
        C2068a<Float, Float> aVar5 = this.f6755O;
        if (aVar5 != null) {
            this.f6744D.setStrokeWidth(aVar5.mo24148h().floatValue());
        } else {
            C2068a<Float, Float> aVar6 = this.f6754N;
            if (aVar6 != null) {
                this.f6744D.setStrokeWidth(aVar6.mo24148h().floatValue());
            } else {
                this.f6744D.setStrokeWidth(bVar.f6496j * C0010h.m75e() * C0010h.m77g(matrix));
            }
        }
        if (this.f6748H.mo17136m0()) {
            m8911S(bVar, matrix, cVar, canvas);
        } else {
            m8912T(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }
}
