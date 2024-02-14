package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14446l;
import p398tb.C16609d;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.n */
/* compiled from: methodSignatureMapping.kt */
final class C14452n implements C14451m<C14446l> {

    /* renamed from: a */
    public static final C14452n f63301a = new C14452n();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.n$a */
    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class C14453a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63302a;

        static {
            int[] iArr = new int[C13859i.values().length];
            iArr[C13859i.BOOLEAN.ordinal()] = 1;
            iArr[C13859i.CHAR.ordinal()] = 2;
            iArr[C13859i.BYTE.ordinal()] = 3;
            iArr[C13859i.SHORT.ordinal()] = 4;
            iArr[C13859i.INT.ordinal()] = 5;
            iArr[C13859i.FLOAT.ordinal()] = 6;
            iArr[C13859i.LONG.ordinal()] = 7;
            iArr[C13859i.DOUBLE.ordinal()] = 8;
            f63302a = iArr;
        }
    }

    private C14452n() {
    }

    /* renamed from: g */
    public C14446l mo73190b(C14446l lVar) {
        C13706o.m87929f(lVar, "possiblyPrimitiveType");
        if (!(lVar instanceof C14446l.C14450d)) {
            return lVar;
        }
        C14446l.C14450d dVar = (C14446l.C14450d) lVar;
        if (dVar.mo73188i() == null) {
            return lVar;
        }
        String f = C16609d.m98928c(dVar.mo73188i().mo79465j()).mo79458f();
        C13706o.m87928e(f, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return mo73193e(f);
    }

    /* renamed from: h */
    public C14446l mo73189a(String str) {
        C16610e eVar;
        C14446l cVar;
        C13706o.m87929f(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        C16610e[] values = C16610e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = values[i];
            if (eVar.mo79462f().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (eVar != null) {
            return new C14446l.C14450d(eVar);
        }
        if (charAt == 'V') {
            return new C14446l.C14450d((C16610e) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new C14446l.C14447a(mo73189a(substring));
        } else {
            if (charAt == 'L') {
                boolean Q = C15177w.m93669Q(str, ';', false, 2, (Object) null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            C13706o.m87928e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new C14446l.C14449c(substring2);
        }
        return cVar;
    }

    /* renamed from: i */
    public C14446l.C14449c mo73193e(String str) {
        C13706o.m87929f(str, "internalName");
        return new C14446l.C14449c(str);
    }

    /* renamed from: j */
    public C14446l mo73191c(C13859i iVar) {
        C13706o.m87929f(iVar, "primitiveType");
        switch (C14453a.f63302a[iVar.ordinal()]) {
            case 1:
                return C14446l.f63289a.mo73179a();
            case 2:
                return C14446l.f63289a.mo73181c();
            case 3:
                return C14446l.f63289a.mo73180b();
            case 4:
                return C14446l.f63289a.mo73186h();
            case 5:
                return C14446l.f63289a.mo73184f();
            case 6:
                return C14446l.f63289a.mo73183e();
            case 7:
                return C14446l.f63289a.mo73185g();
            case 8:
                return C14446l.f63289a.mo73182d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public C14446l mo73194f() {
        return mo73193e("java/lang/Class");
    }

    /* renamed from: l */
    public String mo73192d(C14446l lVar) {
        String f;
        C13706o.m87929f(lVar, "type");
        if (lVar instanceof C14446l.C14447a) {
            return '[' + mo73192d(((C14446l.C14447a) lVar).mo73178i());
        } else if (lVar instanceof C14446l.C14450d) {
            C16610e i = ((C14446l.C14450d) lVar).mo73188i();
            if (i == null || (f = i.mo79462f()) == null) {
                return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            }
            return f;
        } else if (lVar instanceof C14446l.C14449c) {
            return 'L' + ((C14446l.C14449c) lVar).mo73187i() + ';';
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
