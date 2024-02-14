package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13321g;
import p297ja.C13326k;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.i */
/* compiled from: PrimitiveType.kt */
public enum C13859i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: a */
    public static final C13860a f62086a = null;

    /* renamed from: c */
    public static final Set<C13859i> f62087c = null;
    private final C13321g arrayTypeFqName$delegate;
    private final C16157f arrayTypeName;
    private final C13321g typeFqName$delegate;
    private final C16157f typeName;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.i$a */
    /* compiled from: PrimitiveType.kt */
    public static final class C13860a {
        private C13860a() {
        }

        public /* synthetic */ C13860a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.i$b */
    /* compiled from: PrimitiveType.kt */
    static final class C13861b extends C13708q implements C16254a<C16152c> {
        final /* synthetic */ C13859i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13861b(C13859i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final C16152c invoke() {
            C16152c c = C13902k.f62196r.mo78557c(this.this$0.mo72157e());
            C13706o.m87928e(c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.i$c */
    /* compiled from: PrimitiveType.kt */
    static final class C13862c extends C13708q implements C16254a<C16152c> {
        final /* synthetic */ C13859i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13862c(C13859i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final C16152c invoke() {
            C16152c c = C13902k.f62196r.mo78557c(this.this$0.mo72159g());
            C13706o.m87928e(c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c;
        }
    }

    static {
        C13859i iVar;
        C13859i iVar2;
        C13859i iVar3;
        C13859i iVar4;
        C13859i iVar5;
        C13859i iVar6;
        C13859i iVar7;
        f62086a = new C13860a((C13695i) null);
        f62087c = C13627z0.m87809g(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    private C13859i(String str) {
        C16157f i = C16157f.m97019i(str);
        C13706o.m87928e(i, "identifier(typeName)");
        this.typeName = i;
        C16157f i2 = C16157f.m97019i(str + "Array");
        C13706o.m87928e(i2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = i2;
        C13326k kVar = C13326k.PUBLICATION;
        this.typeFqName$delegate = C13323i.m85668a(kVar, new C13862c(this));
        this.arrayTypeFqName$delegate = C13323i.m85668a(kVar, new C13861b(this));
    }

    /* renamed from: d */
    public final C16152c mo72156d() {
        return (C16152c) this.arrayTypeFqName$delegate.getValue();
    }

    /* renamed from: e */
    public final C16157f mo72157e() {
        return this.arrayTypeName;
    }

    /* renamed from: f */
    public final C16152c mo72158f() {
        return (C16152c) this.typeFqName$delegate.getValue();
    }

    /* renamed from: g */
    public final C16157f mo72159g() {
        return this.typeName;
    }
}
