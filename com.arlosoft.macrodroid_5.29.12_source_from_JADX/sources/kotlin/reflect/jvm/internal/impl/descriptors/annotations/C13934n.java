package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import p297ja.C13337s;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.n */
/* compiled from: KotlinTarget.kt */
public enum C13934n {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, (boolean) null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: A */
    private static final List<C13934n> f62347A = null;

    /* renamed from: B */
    private static final List<C13934n> f62348B = null;

    /* renamed from: C */
    private static final List<C13934n> f62349C = null;

    /* renamed from: D */
    private static final List<C13934n> f62350D = null;

    /* renamed from: E */
    private static final List<C13934n> f62351E = null;

    /* renamed from: F */
    private static final List<C13934n> f62352F = null;

    /* renamed from: G */
    private static final List<C13934n> f62353G = null;

    /* renamed from: H */
    private static final Map<C13918e, C13934n> f62354H = null;

    /* renamed from: a */
    public static final C13935a f62373a = null;

    /* renamed from: c */
    private static final HashMap<String, C13934n> f62376c = null;

    /* renamed from: d */
    private static final Set<C13934n> f62378d = null;

    /* renamed from: f */
    private static final Set<C13934n> f62381f = null;

    /* renamed from: g */
    private static final List<C13934n> f62383g = null;

    /* renamed from: o */
    private static final List<C13934n> f62392o = null;

    /* renamed from: p */
    private static final List<C13934n> f62394p = null;

    /* renamed from: s */
    private static final List<C13934n> f62398s = null;

    /* renamed from: z */
    private static final List<C13934n> f62406z = null;
    private final String description;
    private final boolean isDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.n$a */
    /* compiled from: KotlinTarget.kt */
    public static final class C13935a {
        private C13935a() {
        }

        public /* synthetic */ C13935a(C13695i iVar) {
            this();
        }
    }

    static {
        f62373a = new C13935a((C13695i) null);
        f62376c = new HashMap<>();
        for (C13934n nVar : values()) {
            f62376c.put(nVar.name(), nVar);
        }
        C13934n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C13934n nVar2 : values) {
            if (nVar2.isDefault) {
                arrayList.add(nVar2);
            }
        }
        f62378d = C13566b0.m87407K0(arrayList);
        f62381f = C13596m.m87627v0(values());
        C13934n nVar3 = CLASS;
        f62383g = C13614t.m87751m(ANNOTATION_CLASS, nVar3);
        f62392o = C13614t.m87751m(LOCAL_CLASS, nVar3);
        f62394p = C13614t.m87751m(CLASS_ONLY, nVar3);
        C13934n nVar4 = OBJECT;
        f62398s = C13614t.m87751m(COMPANION_OBJECT, nVar4, nVar3);
        f62406z = C13614t.m87751m(nVar4, nVar3);
        f62347A = C13614t.m87751m(INTERFACE, nVar3);
        f62348B = C13614t.m87751m(ENUM_CLASS, nVar3);
        C13934n nVar5 = PROPERTY;
        C13934n nVar6 = FIELD;
        f62349C = C13614t.m87751m(ENUM_ENTRY, nVar5, nVar6);
        C13934n nVar7 = PROPERTY_SETTER;
        f62350D = C13612s.m87736e(nVar7);
        C13934n nVar8 = PROPERTY_GETTER;
        f62351E = C13612s.m87736e(nVar8);
        f62352F = C13612s.m87736e(FUNCTION);
        C13934n nVar9 = FILE;
        f62353G = C13612s.m87736e(nVar9);
        C13918e eVar = C13918e.CONSTRUCTOR_PARAMETER;
        C13934n nVar10 = VALUE_PARAMETER;
        f62354H = C13615t0.m87762l(C13337s.m85692a(eVar, nVar10), C13337s.m85692a(C13918e.FIELD, nVar6), C13337s.m85692a(C13918e.PROPERTY, nVar5), C13337s.m85692a(C13918e.FILE, nVar9), C13337s.m85692a(C13918e.PROPERTY_GETTER, nVar8), C13337s.m85692a(C13918e.PROPERTY_SETTER, nVar7), C13337s.m85692a(C13918e.RECEIVER, nVar10), C13337s.m85692a(C13918e.SETTER_PARAMETER, nVar10), C13337s.m85692a(C13918e.PROPERTY_DELEGATE_FIELD, nVar6));
    }

    private C13934n(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }
}
