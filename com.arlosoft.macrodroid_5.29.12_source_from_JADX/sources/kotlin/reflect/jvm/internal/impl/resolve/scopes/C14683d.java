package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d */
/* compiled from: MemberScope.kt */
public final class C14683d {

    /* renamed from: c */
    public static final C14684a f63687c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f63688d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int f63689e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int f63690f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int f63691g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final int f63692h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final int f63693i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final int f63694j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final int f63695k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final int f63696l;

    /* renamed from: m */
    private static final int f63697m;

    /* renamed from: n */
    private static final int f63698n;

    /* renamed from: o */
    public static final C14683d f63699o;

    /* renamed from: p */
    public static final C14683d f63700p;

    /* renamed from: q */
    public static final C14683d f63701q;

    /* renamed from: r */
    public static final C14683d f63702r;

    /* renamed from: s */
    public static final C14683d f63703s;

    /* renamed from: t */
    public static final C14683d f63704t;

    /* renamed from: u */
    public static final C14683d f63705u;

    /* renamed from: v */
    public static final C14683d f63706v;

    /* renamed from: w */
    public static final C14683d f63707w;

    /* renamed from: x */
    public static final C14683d f63708x;

    /* renamed from: y */
    private static final List<C14684a.C14685a> f63709y;

    /* renamed from: z */
    private static final List<C14684a.C14685a> f63710z;

    /* renamed from: a */
    private final List<C14680c> f63711a;

    /* renamed from: b */
    private final int f63712b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a */
    /* compiled from: MemberScope.kt */
    public static final class C14684a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a$a */
        /* compiled from: MemberScope.kt */
        private static final class C14685a {

            /* renamed from: a */
            private final int f63713a;

            /* renamed from: b */
            private final String f63714b;

            public C14685a(int i, String str) {
                C13706o.m87929f(str, "name");
                this.f63713a = i;
                this.f63714b = str;
            }

            /* renamed from: a */
            public final int mo73815a() {
                return this.f63713a;
            }

            /* renamed from: b */
            public final String mo73816b() {
                return this.f63714b;
            }
        }

        private C14684a() {
        }

        public /* synthetic */ C14684a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final int m91837j() {
            int f = C14683d.f63688d;
            C14684a aVar = C14683d.f63687c;
            C14683d.f63688d = C14683d.f63688d << 1;
            return f;
        }

        /* renamed from: b */
        public final int mo73807b() {
            return C14683d.f63695k;
        }

        /* renamed from: c */
        public final int mo73808c() {
            return C14683d.f63696l;
        }

        /* renamed from: d */
        public final int mo73809d() {
            return C14683d.f63693i;
        }

        /* renamed from: e */
        public final int mo73810e() {
            return C14683d.f63689e;
        }

        /* renamed from: f */
        public final int mo73811f() {
            return C14683d.f63692h;
        }

        /* renamed from: g */
        public final int mo73812g() {
            return C14683d.f63690f;
        }

        /* renamed from: h */
        public final int mo73813h() {
            return C14683d.f63691g;
        }

        /* renamed from: i */
        public final int mo73814i() {
            return C14683d.f63694j;
        }
    }

    static {
        C14684a.C14685a aVar;
        C14684a.C14685a aVar2;
        Class<C14683d> cls = C14683d.class;
        C14684a aVar3 = new C14684a((C13695i) null);
        f63687c = aVar3;
        int a = aVar3.m91837j();
        f63689e = a;
        int a2 = aVar3.m91837j();
        f63690f = a2;
        int a3 = aVar3.m91837j();
        f63691g = a3;
        int a4 = aVar3.m91837j();
        f63692h = a4;
        int a5 = aVar3.m91837j();
        f63693i = a5;
        int a6 = aVar3.m91837j();
        f63694j = a6;
        int a7 = aVar3.m91837j() - 1;
        f63695k = a7;
        int i = a | a2 | a3;
        f63696l = i;
        int i2 = a2 | a5 | a6;
        f63697m = i2;
        int i3 = a5 | a6;
        f63698n = i3;
        f63699o = new C14683d(a7, (List) null, 2, (C13695i) null);
        f63700p = new C14683d(i3, (List) null, 2, (C13695i) null);
        f63701q = new C14683d(a, (List) null, 2, (C13695i) null);
        f63702r = new C14683d(a2, (List) null, 2, (C13695i) null);
        f63703s = new C14683d(a3, (List) null, 2, (C13695i) null);
        f63704t = new C14683d(i, (List) null, 2, (C13695i) null);
        f63705u = new C14683d(a4, (List) null, 2, (C13695i) null);
        f63706v = new C14683d(a5, (List) null, 2, (C13695i) null);
        f63707w = new C14683d(a6, (List) null, 2, (C13695i) null);
        f63708x = new C14683d(i2, (List) null, 2, (C13695i) null);
        Field[] fields = cls.getFields();
        C13706o.m87928e(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get((Object) null);
            C14683d dVar = obj instanceof C14683d ? (C14683d) obj : null;
            if (dVar != null) {
                int i4 = dVar.f63712b;
                String name = field2.getName();
                C13706o.m87928e(name, "field.name");
                aVar2 = new C14684a.C14685a(i4, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f63709y = arrayList2;
        Field[] fields2 = cls.getFields();
        C13706o.m87928e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            if (C13706o.m87924a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj2 = field4.get((Object) null);
            C13706o.m87927d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                C13706o.m87928e(name2, "field.name");
                aVar = new C14684a.C14685a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f63710z = arrayList5;
    }

    public C14683d(int i, List<? extends C14680c> list) {
        C13706o.m87929f(list, "excludes");
        this.f63711a = list;
        for (C14680c a : list) {
            i &= ~a.mo73798a();
        }
        this.f63712b = i;
    }

    /* renamed from: a */
    public final boolean mo73800a(int i) {
        return (i & this.f63712b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(C14683d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C14683d dVar = (C14683d) obj;
        return C13706o.m87924a(this.f63711a, dVar.f63711a) && this.f63712b == dVar.f63712b;
    }

    public int hashCode() {
        return (this.f63711a.hashCode() * 31) + this.f63712b;
    }

    /* renamed from: l */
    public final List<C14680c> mo73803l() {
        return this.f63711a;
    }

    /* renamed from: m */
    public final int mo73804m() {
        return this.f63712b;
    }

    /* renamed from: n */
    public final C14683d mo73805n(int i) {
        int i2 = i & this.f63712b;
        if (i2 == 0) {
            return null;
        }
        return new C14683d(i2, this.f63711a);
    }

    public String toString() {
        T t;
        boolean z;
        Iterator<T> it = f63709y.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C14684a.C14685a) t).mo73815a() == this.f63712b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C14684a.C14685a aVar = (C14684a.C14685a) t;
        String b = aVar != null ? aVar.mo73816b() : null;
        if (b == null) {
            List<C14684a.C14685a> list = f63710z;
            ArrayList arrayList = new ArrayList();
            for (C14684a.C14685a aVar2 : list) {
                String b2 = mo73800a(aVar2.mo73815a()) ? aVar2.mo73816b() : null;
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            b = C13566b0.m87432g0(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + b + ", " + this.f63711a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14683d(int i, List list, int i2, C13695i iVar) {
        this(i, (i2 & 2) != 0 ? C13614t.m87748j() : list);
    }
}
