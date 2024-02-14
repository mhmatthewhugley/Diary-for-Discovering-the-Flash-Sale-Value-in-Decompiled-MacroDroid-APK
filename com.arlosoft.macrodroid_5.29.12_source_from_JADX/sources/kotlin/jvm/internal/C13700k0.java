package kotlin.jvm.internal;

import kotlin.Metadata;
import p433xa.C16889o;
import p433xa.C16893q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo71668d2 = {"Lkotlin/jvm/internal/k0;", "Lxa/o;", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.k0 */
/* compiled from: TypeParameterReference.kt */
public final class C13700k0 implements C16889o {

    /* renamed from: a */
    public static final C13701a f61932a = new C13701a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lkotlin/jvm/internal/k0$a;", "", "Lxa/o;", "typeParameter", "", "a", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.jvm.internal.k0$a */
    /* compiled from: TypeParameterReference.kt */
    public static final class C13701a {

        @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
        /* renamed from: kotlin.jvm.internal.k0$a$a */
        /* compiled from: TypeParameterReference.kt */
        public /* synthetic */ class C13702a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61933a;

            static {
                int[] iArr = new int[C16893q.values().length];
                iArr[C16893q.INVARIANT.ordinal()] = 1;
                iArr[C16893q.IN.ordinal()] = 2;
                iArr[C16893q.OUT.ordinal()] = 3;
                f61933a = iArr;
            }
        }

        private C13701a() {
        }

        public /* synthetic */ C13701a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final String mo71953a(C16889o oVar) {
            C13706o.m87929f(oVar, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C13702a.f61933a[oVar.mo74404l().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(oVar.getName());
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }
}
