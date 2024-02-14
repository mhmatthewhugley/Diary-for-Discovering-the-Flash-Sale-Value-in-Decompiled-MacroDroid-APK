package p226cd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C13570c;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0017B!\b\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\"\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo71668d2 = {"Lcd/o;", "Lkotlin/collections/c;", "Lcd/e;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "d", "", "byteStrings", "[Lcd/e;", "f", "()[Lcd/e;", "", "trie", "[I", "h", "()[I", "getSize", "()I", "size", "<init>", "([Lcd/e;[I)V", "a", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.o */
/* compiled from: Options.kt */
public final class C11199o extends C13570c<C11188e> implements RandomAccess {

    /* renamed from: d */
    public static final C11200a f54123d = new C11200a((C13695i) null);

    /* renamed from: a */
    private final C11188e[] f54124a;

    /* renamed from: c */
    private final int[] f54125c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Lcd/o$a;", "", "", "nodeOffset", "Lcd/b;", "node", "", "byteStringOffset", "", "Lcd/e;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lja/u;", "a", "", "Lcd/o;", "d", "([Lcd/e;)Lcd/o;", "c", "(Lcd/b;)J", "intCount", "<init>", "()V", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* renamed from: cd.o$a */
    /* compiled from: Options.kt */
    public static final class C11200a {
        private C11200a() {
        }

        public /* synthetic */ C11200a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        private final void m75186a(long j, C11179b bVar, int i, List<? extends C11188e> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            C11179b bVar2;
            C11179b bVar3 = bVar;
            int i9 = i;
            List<? extends C11188e> list3 = list;
            int i10 = i2;
            int i11 = i3;
            List<Integer> list4 = list2;
            if (i10 < i11) {
                if (i10 < i11) {
                    int i12 = i10;
                    while (true) {
                        int i13 = i12 + 1;
                        if (!(((C11188e) list3.get(i12)).mo62485C() >= i9)) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (i13 >= i11) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                C11188e eVar = (C11188e) list.get(i2);
                C11188e eVar2 = (C11188e) list3.get(i11 - 1);
                if (i9 == eVar.mo62485C()) {
                    int intValue = list4.get(i10).intValue();
                    int i14 = i10 + 1;
                    i4 = i14;
                    i5 = intValue;
                    eVar = (C11188e) list3.get(i14);
                } else {
                    i4 = i10;
                    i5 = -1;
                }
                if (eVar.mo62496g(i9) != eVar2.mo62496g(i9)) {
                    int i15 = i4 + 1;
                    int i16 = 1;
                    if (i15 < i11) {
                        while (true) {
                            int i17 = i15 + 1;
                            if (((C11188e) list3.get(i15 - 1)).mo62496g(i9) != ((C11188e) list3.get(i15)).mo62496g(i9)) {
                                i16++;
                            }
                            if (i17 >= i11) {
                                break;
                            }
                            i15 = i17;
                        }
                    }
                    long c = j + m75188c(bVar3) + ((long) 2) + ((long) (i16 * 2));
                    bVar3.writeInt(i16);
                    bVar3.writeInt(i5);
                    if (i4 < i11) {
                        int i18 = i4;
                        while (true) {
                            int i19 = i18 + 1;
                            byte g = ((C11188e) list3.get(i18)).mo62496g(i9);
                            if (i18 == i4 || g != ((C11188e) list3.get(i18 - 1)).mo62496g(i9)) {
                                bVar3.writeInt(g & 255);
                            }
                            if (i19 >= i11) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    C11179b bVar4 = new C11179b();
                    while (i4 < i11) {
                        byte g2 = ((C11188e) list3.get(i4)).mo62496g(i9);
                        int i20 = i4 + 1;
                        if (i20 < i11) {
                            int i21 = i20;
                            while (true) {
                                int i22 = i21 + 1;
                                if (g2 != ((C11188e) list3.get(i21)).mo62496g(i9)) {
                                    i7 = i21;
                                    break;
                                } else if (i22 >= i11) {
                                    break;
                                } else {
                                    i21 = i22;
                                }
                            }
                        }
                        i7 = i11;
                        if (i20 == i7 && i9 + 1 == ((C11188e) list3.get(i4)).mo62485C()) {
                            bVar3.writeInt(list4.get(i4).intValue());
                            i8 = i7;
                            bVar2 = bVar4;
                        } else {
                            bVar3.writeInt(((int) (c + m75188c(bVar4))) * -1);
                            i8 = i7;
                            bVar2 = bVar4;
                            m75186a(c, bVar4, i9 + 1, list, i4, i7, list2);
                        }
                        bVar4 = bVar2;
                        i4 = i8;
                    }
                    bVar3.mo62396A1(bVar4);
                    return;
                }
                int min = Math.min(eVar.mo62485C(), eVar2.mo62485C());
                if (i9 < min) {
                    int i23 = i9;
                    i6 = 0;
                    while (true) {
                        int i24 = i23 + 1;
                        if (eVar.mo62496g(i23) != eVar2.mo62496g(i23)) {
                            break;
                        }
                        i6++;
                        if (i24 >= min) {
                            break;
                        }
                        i23 = i24;
                    }
                } else {
                    i6 = 0;
                }
                long c2 = j + m75188c(bVar3) + ((long) 2) + ((long) i6) + 1;
                bVar3.writeInt(-i6);
                bVar3.writeInt(i5);
                int i25 = i9 + i6;
                if (i9 < i25) {
                    while (true) {
                        int i26 = i9 + 1;
                        bVar3.writeInt(eVar.mo62496g(i9) & 255);
                        if (i26 >= i25) {
                            break;
                        }
                        i9 = i26;
                    }
                }
                if (i4 + 1 == i11) {
                    if (i25 == ((C11188e) list3.get(i4)).mo62485C()) {
                        bVar3.writeInt(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C11179b bVar5 = new C11179b();
                bVar3.writeInt(((int) (m75188c(bVar5) + c2)) * -1);
                m75186a(c2, bVar5, i25, list, i4, i3, list2);
                bVar3.mo62396A1(bVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m75187b(C11200a aVar, long j, C11179b bVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m75186a((i4 & 1) != 0 ? 0 : j, bVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m75188c(C11179b bVar) {
            return bVar.mo62399D() / ((long) 4);
        }

        /* renamed from: d */
        public final C11199o mo62541d(C11188e... eVarArr) {
            C11188e[] eVarArr2 = eVarArr;
            C13706o.m87929f(eVarArr2, "byteStrings");
            int i = 0;
            if (eVarArr2.length == 0) {
                return new C11199o(new C11188e[0], new int[]{0, -1}, (C13695i) null);
            }
            List r0 = C13596m.m87619r0(eVarArr);
            C13622x.m87780x(r0);
            ArrayList arrayList = new ArrayList(eVarArr2.length);
            for (C11188e eVar : eVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List p = C13614t.m87754p(Arrays.copyOf(numArr, numArr.length));
            int length = eVarArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                p.set(C13614t.m87747i(r0, eVarArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C11188e) r0.get(0)).mo62485C() > 0) {
                int i4 = 0;
                while (i4 < r0.size()) {
                    C11188e eVar2 = (C11188e) r0.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < r0.size()) {
                        C11188e eVar3 = (C11188e) r0.get(i6);
                        if (!eVar3.mo62486E(eVar2)) {
                            continue;
                            break;
                        }
                        if (!(eVar3.mo62485C() != eVar2.mo62485C())) {
                            throw new IllegalArgumentException(C13706o.m87936m("duplicate option: ", eVar3).toString());
                        } else if (((Number) p.get(i6)).intValue() > ((Number) p.get(i4)).intValue()) {
                            r0.remove(i6);
                            p.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                C11179b bVar = new C11179b();
                m75187b(this, 0, bVar, 0, r0, 0, 0, p, 53, (Object) null);
                int[] iArr = new int[((int) m75188c(bVar))];
                while (!bVar.mo62469x1()) {
                    iArr[i] = bVar.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(eVarArr2, eVarArr2.length);
                C13706o.m87928e(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new C11199o((C11188e[]) copyOf, iArr, (C13695i) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    private C11199o(C11188e[] eVarArr, int[] iArr) {
        this.f54124a = eVarArr;
        this.f54125c = iArr;
    }

    public /* synthetic */ C11199o(C11188e[] eVarArr, int[] iArr, C13695i iVar) {
        this(eVarArr, iArr);
    }

    /* renamed from: k */
    public static final C11199o m75179k(C11188e... eVarArr) {
        return f54123d.mo62541d(eVarArr);
    }

    /* renamed from: c */
    public /* bridge */ boolean mo62532c(C11188e eVar) {
        return super.contains(eVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11188e)) {
            return false;
        }
        return mo62532c((C11188e) obj);
    }

    /* renamed from: d */
    public C11188e get(int i) {
        return this.f54124a[i];
    }

    /* renamed from: f */
    public final C11188e[] mo62535f() {
        return this.f54124a;
    }

    public int getSize() {
        return this.f54124a.length;
    }

    /* renamed from: h */
    public final int[] mo62536h() {
        return this.f54125c;
    }

    /* renamed from: i */
    public /* bridge */ int mo62537i(C11188e eVar) {
        return super.indexOf(eVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C11188e)) {
            return -1;
        }
        return mo62537i((C11188e) obj);
    }

    /* renamed from: j */
    public /* bridge */ int mo62539j(C11188e eVar) {
        return super.lastIndexOf(eVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C11188e)) {
            return -1;
        }
        return mo62539j((C11188e) obj);
    }
}
