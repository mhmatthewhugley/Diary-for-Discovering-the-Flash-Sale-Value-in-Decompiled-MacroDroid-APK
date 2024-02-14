package p298jb;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14616f;
import org.apache.http.cookie.ClientCookie;
import p298jb.C13359a;
import p349ob.C15828a;
import p349ob.C15834e;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: jb.b */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class C13362b implements C14459q.C14462c {

    /* renamed from: j */
    private static final boolean f61376j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    private static final Map<C16151b, C13359a.C13360a> f61377k;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int[] f61378a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f61379b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f61380c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f61381d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String[] f61382e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String[] f61383f = null;

    /* renamed from: g */
    private String[] f61384g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C13359a.C13360a f61385h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String[] f61386i = null;

    /* renamed from: jb.b$b */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private static abstract class C13364b implements C14459q.C14461b {

        /* renamed from: a */
        private final List<String> f61387a = new ArrayList();

        /* renamed from: f */
        private static /* synthetic */ void m85722f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo70775a() {
            mo70780g((String[]) this.f61387a.toArray(new String[0]));
        }

        /* renamed from: b */
        public C14459q.C14460a mo70776b(C16151b bVar) {
            if (bVar != null) {
                return null;
            }
            m85722f(3);
            return null;
        }

        /* renamed from: c */
        public void mo70777c(C16151b bVar, C16157f fVar) {
            if (bVar == null) {
                m85722f(0);
            }
            if (fVar == null) {
                m85722f(1);
            }
        }

        /* renamed from: d */
        public void mo70778d(Object obj) {
            if (obj instanceof String) {
                this.f61387a.add((String) obj);
            }
        }

        /* renamed from: e */
        public void mo70779e(C14616f fVar) {
            if (fVar == null) {
                m85722f(2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo70780g(String[] strArr);
    }

    /* renamed from: jb.b$c */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C13365c implements C14459q.C14460a {

        /* renamed from: jb.b$c$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C13366a extends C13364b {
            C13366a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m85738f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo70780g(String[] strArr) {
                if (strArr == null) {
                    m85738f(0);
                }
                String[] unused = C13362b.this.f61382e = strArr;
            }
        }

        /* renamed from: jb.b$c$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C13367b extends C13364b {
            C13367b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m85740f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo70780g(String[] strArr) {
                if (strArr == null) {
                    m85740f(0);
                }
                String[] unused = C13362b.this.f61383f = strArr;
            }
        }

        private C13365c() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m85729g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private C14459q.C14461b m85730h() {
            return new C13366a();
        }

        /* renamed from: i */
        private C14459q.C14461b m85731i() {
            return new C13367b();
        }

        /* renamed from: a */
        public void mo70781a() {
        }

        /* renamed from: b */
        public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
            if (bVar == null) {
                m85729g(1);
            }
            if (fVar2 == null) {
                m85729g(2);
            }
        }

        /* renamed from: c */
        public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
            if (bVar != null) {
                return null;
            }
            m85729g(3);
            return null;
        }

        /* renamed from: d */
        public void mo70784d(C16157f fVar, Object obj) {
            if (fVar != null) {
                String d = fVar.mo78583d();
                if ("k".equals(d)) {
                    if (obj instanceof Integer) {
                        C13359a.C13360a unused = C13362b.this.f61385h = C13359a.C13360a.m85707e(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(d)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = C13362b.this.f61378a = (int[]) obj;
                    }
                } else if ("xs".equals(d)) {
                    if (obj instanceof String) {
                        String unused3 = C13362b.this.f61379b = (String) obj;
                    }
                } else if ("xi".equals(d)) {
                    if (obj instanceof Integer) {
                        int unused4 = C13362b.this.f61380c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(d) && (obj instanceof String)) {
                    String unused5 = C13362b.this.f61381d = (String) obj;
                }
            }
        }

        /* renamed from: e */
        public void mo70785e(C16157f fVar, C14616f fVar2) {
            if (fVar2 == null) {
                m85729g(0);
            }
        }

        /* renamed from: f */
        public C14459q.C14461b mo70786f(C16157f fVar) {
            String d = fVar != null ? fVar.mo78583d() : null;
            if ("d1".equals(d)) {
                return m85730h();
            }
            if ("d2".equals(d)) {
                return m85731i();
            }
            return null;
        }
    }

    /* renamed from: jb.b$d */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C13368d implements C14459q.C14460a {

        /* renamed from: jb.b$d$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C13369a extends C13364b {
            C13369a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m85750f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo70780g(String[] strArr) {
                if (strArr == null) {
                    m85750f(0);
                }
                String[] unused = C13362b.this.f61386i = strArr;
            }
        }

        private C13368d() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m85742g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private C14459q.C14461b m85743h() {
            return new C13369a();
        }

        /* renamed from: a */
        public void mo70781a() {
        }

        /* renamed from: b */
        public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
            if (bVar == null) {
                m85742g(1);
            }
            if (fVar2 == null) {
                m85742g(2);
            }
        }

        /* renamed from: c */
        public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
            if (bVar != null) {
                return null;
            }
            m85742g(3);
            return null;
        }

        /* renamed from: d */
        public void mo70784d(C16157f fVar, Object obj) {
        }

        /* renamed from: e */
        public void mo70785e(C16157f fVar, C14616f fVar2) {
            if (fVar2 == null) {
                m85742g(0);
            }
        }

        /* renamed from: f */
        public C14459q.C14461b mo70786f(C16157f fVar) {
            if ("b".equals(fVar != null ? fVar.mo78583d() : null)) {
                return m85743h();
            }
            return null;
        }
    }

    /* renamed from: jb.b$e */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C13370e implements C14459q.C14460a {

        /* renamed from: jb.b$e$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C13371a extends C13364b {
            C13371a() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m85761f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo70780g(String[] strArr) {
                if (strArr == null) {
                    m85761f(0);
                }
                String[] unused = C13362b.this.f61382e = strArr;
            }
        }

        /* renamed from: jb.b$e$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C13372b extends C13364b {
            C13372b() {
            }

            /* renamed from: f */
            private static /* synthetic */ void m85763f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo70780g(String[] strArr) {
                if (strArr == null) {
                    m85763f(0);
                }
                String[] unused = C13362b.this.f61383f = strArr;
            }
        }

        private C13370e() {
        }

        /* renamed from: g */
        private static /* synthetic */ void m85752g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private C14459q.C14461b m85753h() {
            return new C13371a();
        }

        /* renamed from: i */
        private C14459q.C14461b m85754i() {
            return new C13372b();
        }

        /* renamed from: a */
        public void mo70781a() {
        }

        /* renamed from: b */
        public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
            if (bVar == null) {
                m85752g(1);
            }
            if (fVar2 == null) {
                m85752g(2);
            }
        }

        /* renamed from: c */
        public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
            if (bVar != null) {
                return null;
            }
            m85752g(3);
            return null;
        }

        /* renamed from: d */
        public void mo70784d(C16157f fVar, Object obj) {
            if (fVar != null) {
                String d = fVar.mo78583d();
                if (ClientCookie.VERSION_ATTR.equals(d)) {
                    if (obj instanceof int[]) {
                        int[] unused = C13362b.this.f61378a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(d)) {
                    String unused2 = C13362b.this.f61379b = obj instanceof String ? (String) obj : null;
                }
            }
        }

        /* renamed from: e */
        public void mo70785e(C16157f fVar, C14616f fVar2) {
            if (fVar2 == null) {
                m85752g(0);
            }
        }

        /* renamed from: f */
        public C14459q.C14461b mo70786f(C16157f fVar) {
            String d = fVar != null ? fVar.mo78583d() : null;
            if (Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA.equals(d) || "filePartClassNames".equals(d)) {
                return m85753h();
            }
            if ("strings".equals(d)) {
                return m85754i();
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f61377k = hashMap;
        hashMap.put(C16151b.m96975m(new C16152c("kotlin.jvm.internal.KotlinClass")), C13359a.C13360a.CLASS);
        hashMap.put(C16151b.m96975m(new C16152c("kotlin.jvm.internal.KotlinFileFacade")), C13359a.C13360a.FILE_FACADE);
        hashMap.put(C16151b.m96975m(new C16152c("kotlin.jvm.internal.KotlinMultifileClass")), C13359a.C13360a.MULTIFILE_CLASS);
        hashMap.put(C16151b.m96975m(new C16152c("kotlin.jvm.internal.KotlinMultifileClassPart")), C13359a.C13360a.MULTIFILE_CLASS_PART);
        hashMap.put(C16151b.m96975m(new C16152c("kotlin.jvm.internal.KotlinSyntheticClass")), C13359a.C13360a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    private static /* synthetic */ void m85709d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: n */
    private boolean m85718n() {
        C13359a.C13360a aVar = this.f61385h;
        return aVar == C13359a.C13360a.CLASS || aVar == C13359a.C13360a.FILE_FACADE || aVar == C13359a.C13360a.MULTIFILE_CLASS_PART;
    }

    /* renamed from: a */
    public void mo70772a() {
    }

    /* renamed from: c */
    public C14459q.C14460a mo70773c(C16151b bVar, C14158z0 z0Var) {
        C13359a.C13360a aVar;
        if (bVar == null) {
            m85709d(0);
        }
        if (z0Var == null) {
            m85709d(1);
        }
        C16152c b = bVar.mo78544b();
        if (b.equals(C14163a0.f62784a)) {
            return new C13365c();
        }
        if (b.equals(C14163a0.f62802s)) {
            return new C13368d();
        }
        if (f61376j || this.f61385h != null || (aVar = f61377k.get(bVar)) == null) {
            return null;
        }
        this.f61385h = aVar;
        return new C13370e();
    }

    /* renamed from: m */
    public C13359a mo70774m() {
        byte[] bArr = null;
        if (this.f61385h == null || this.f61378a == null) {
            return null;
        }
        C15834e eVar = new C15834e(this.f61378a, (this.f61380c & 8) != 0);
        if (!eVar.mo75618h()) {
            this.f61384g = this.f61382e;
            this.f61382e = null;
        } else if (m85718n() && this.f61382e == null) {
            return null;
        }
        String[] strArr = this.f61386i;
        if (strArr != null) {
            bArr = C15828a.m95437e(strArr);
        }
        return new C13359a(this.f61385h, eVar, this.f61382e, this.f61384g, this.f61383f, this.f61379b, this.f61380c, this.f61381d, bArr);
    }
}
