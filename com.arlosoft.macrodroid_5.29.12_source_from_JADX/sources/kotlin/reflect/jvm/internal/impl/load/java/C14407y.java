package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p362pb.C16152c;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.y */
/* compiled from: Jsr305Settings.kt */
public final class C14407y {

    /* renamed from: a */
    private final C14200f0 f63190a;

    /* renamed from: b */
    private final C14200f0 f63191b;

    /* renamed from: c */
    private final Map<C16152c, C14200f0> f63192c;

    /* renamed from: d */
    private final C13321g f63193d;

    /* renamed from: e */
    private final boolean f63194e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.y$a */
    /* compiled from: Jsr305Settings.kt */
    static final class C14408a extends C13708q implements C16254a<String[]> {
        final /* synthetic */ C14407y this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14408a(C14407y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* renamed from: a */
        public final String[] invoke() {
            C14407y yVar = this.this$0;
            List c = C13612s.m87734c();
            c.add(yVar.mo73100a().getDescription());
            C14200f0 b = yVar.mo73101b();
            if (b != null) {
                c.add("under-migration:" + b.getDescription());
            }
            for (Map.Entry next : yVar.mo73102c().entrySet()) {
                c.add('@' + next.getKey() + ':' + ((C14200f0) next.getValue()).getDescription());
            }
            Object[] array = C13612s.m87732a(c).toArray(new String[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    public C14407y(C14200f0 f0Var, C14200f0 f0Var2, Map<C16152c, ? extends C14200f0> map) {
        C13706o.m87929f(f0Var, "globalLevel");
        C13706o.m87929f(map, "userDefinedLevelForSpecificAnnotation");
        this.f63190a = f0Var;
        this.f63191b = f0Var2;
        this.f63192c = map;
        this.f63193d = C13323i.m85669b(new C14408a(this));
        C14200f0 f0Var3 = C14200f0.IGNORE;
        this.f63194e = f0Var == f0Var3 && f0Var2 == f0Var3 && map.isEmpty();
    }

    /* renamed from: a */
    public final C14200f0 mo73100a() {
        return this.f63190a;
    }

    /* renamed from: b */
    public final C14200f0 mo73101b() {
        return this.f63191b;
    }

    /* renamed from: c */
    public final Map<C16152c, C14200f0> mo73102c() {
        return this.f63192c;
    }

    /* renamed from: d */
    public final boolean mo73103d() {
        return this.f63194e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14407y)) {
            return false;
        }
        C14407y yVar = (C14407y) obj;
        return this.f63190a == yVar.f63190a && this.f63191b == yVar.f63191b && C13706o.m87924a(this.f63192c, yVar.f63192c);
    }

    public int hashCode() {
        int hashCode = this.f63190a.hashCode() * 31;
        C14200f0 f0Var = this.f63191b;
        return ((hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31) + this.f63192c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f63190a + ", migrationLevel=" + this.f63191b + ", userDefinedLevelForSpecificAnnotation=" + this.f63192c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14407y(C14200f0 f0Var, C14200f0 f0Var2, Map map, int i, C13695i iVar) {
        this(f0Var, (i & 2) != 0 ? null : f0Var2, (i & 4) != 0 ? C13615t0.m87759i() : map);
    }
}
