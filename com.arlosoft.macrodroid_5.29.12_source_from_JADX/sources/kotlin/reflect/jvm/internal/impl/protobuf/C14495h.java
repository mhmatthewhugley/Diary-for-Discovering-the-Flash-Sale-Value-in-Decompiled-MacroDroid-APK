package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14492g;
import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14539w;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* compiled from: GeneratedMessageLite */
public abstract class C14495h extends C14478a implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    /* compiled from: GeneratedMessageLite */
    static /* synthetic */ class C14496a {

        /* renamed from: a */
        static final /* synthetic */ int[] f63360a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.w$c[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63360a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f63360a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14546c.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14495h.C14496a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$b */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C14497b<MessageType extends C14495h, BuilderType extends C14497b> extends C14478a.C14479a<BuilderType> {

        /* renamed from: a */
        private C14485d f63361a = C14485d.f63329a;

        protected C14497b() {
        }

        /* renamed from: l */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: n */
        public final C14485d mo73387n() {
            return this.f63361a;
        }

        /* renamed from: o */
        public abstract BuilderType mo71036o(MessageType messagetype);

        /* renamed from: p */
        public final BuilderType mo73388p(C14485d dVar) {
            this.f63361a = dVar;
            return this;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C14498c<MessageType extends C14499d<MessageType>, BuilderType extends C14498c<MessageType, BuilderType>> extends C14497b<MessageType, BuilderType> implements C14518p {

        /* renamed from: c */
        private C14492g<C14501e> f63362c = C14492g.m90918g();

        /* renamed from: d */
        private boolean f63363d;

        protected C14498c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public C14492g<C14501e> m90960r() {
            this.f63362c.mo73376q();
            this.f63363d = false;
            return this.f63362c;
        }

        /* renamed from: s */
        private void m90961s() {
            if (!this.f63363d) {
                this.f63362c = this.f63362c.clone();
                this.f63363d = true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public final void mo73389t(MessageType messagetype) {
            m90961s();
            this.f63362c.mo73377r(messagetype.extensions);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$e */
    /* compiled from: GeneratedMessageLite */
    static final class C14501e implements C14492g.C14494b<C14501e> {

        /* renamed from: a */
        final C14503i.C14505b<?> f63368a;

        /* renamed from: c */
        final int f63369c;

        /* renamed from: d */
        final C14539w.C14541b f63370d;

        /* renamed from: f */
        final boolean f63371f;

        /* renamed from: g */
        final boolean f63372g;

        C14501e(C14503i.C14505b<?> bVar, int i, C14539w.C14541b bVar2, boolean z, boolean z2) {
            this.f63368a = bVar;
            this.f63369c = i;
            this.f63370d = bVar2;
            this.f63371f = z;
            this.f63372g = z2;
        }

        /* renamed from: D */
        public C14539w.C14541b mo73379D() {
            return this.f63370d;
        }

        /* renamed from: M */
        public C14539w.C14546c mo73380M() {
            return this.f63370d.mo73521b();
        }

        /* renamed from: O */
        public boolean mo73381O() {
            return this.f63372g;
        }

        /* renamed from: b */
        public int compareTo(C14501e eVar) {
            return this.f63369c - eVar.f63369c;
        }

        /* renamed from: c */
        public int mo73382c() {
            return this.f63369c;
        }

        /* renamed from: d */
        public C14503i.C14505b<?> mo73400d() {
            return this.f63368a;
        }

        /* renamed from: e1 */
        public C14516o.C14517a mo73383e1(C14516o.C14517a aVar, C14516o oVar) {
            return ((C14497b) aVar).mo71036o((C14495h) oVar);
        }

        /* renamed from: u */
        public boolean mo73384u() {
            return this.f63371f;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$f */
    /* compiled from: GeneratedMessageLite */
    public static class C14502f<ContainingType extends C14516o, Type> {

        /* renamed from: a */
        final ContainingType f63373a;

        /* renamed from: b */
        final Type f63374b;

        /* renamed from: c */
        final C14516o f63375c;

        /* renamed from: d */
        final C14501e f63376d;

        /* renamed from: e */
        final Class f63377e;

        /* renamed from: f */
        final Method f63378f;

        C14502f(ContainingType containingtype, Type type, C14516o oVar, C14501e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.mo73379D() == C14539w.C14541b.MESSAGE && oVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f63373a = containingtype;
                this.f63374b = type;
                this.f63375c = oVar;
                this.f63376d = eVar;
                this.f63377e = cls;
                if (C14503i.C14504a.class.isAssignableFrom(cls)) {
                    this.f63378f = C14495h.m90947k(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.f63378f = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo73401a(Object obj) {
            if (!this.f63376d.mo73384u()) {
                return mo73405e(obj);
            }
            if (this.f63376d.mo73380M() != C14539w.C14546c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object e : (List) obj) {
                arrayList.add(mo73405e(e));
            }
            return arrayList;
        }

        /* renamed from: b */
        public ContainingType mo73402b() {
            return this.f63373a;
        }

        /* renamed from: c */
        public C14516o mo73403c() {
            return this.f63375c;
        }

        /* renamed from: d */
        public int mo73404d() {
            return this.f63376d.mo73382c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Object mo73405e(Object obj) {
            if (this.f63376d.mo73380M() != C14539w.C14546c.ENUM) {
                return obj;
            }
            return C14495h.m90948l(this.f63378f, (Object) null, (Integer) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object mo73406f(Object obj) {
            return this.f63376d.mo73380M() == C14539w.C14546c.ENUM ? Integer.valueOf(((C14503i.C14504a) obj).mo71084c()) : obj;
        }
    }

    protected C14495h() {
    }

    /* renamed from: k */
    static Method m90947k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + valueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(valueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: l */
    static Object m90948l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: n */
    public static <ContainingType extends C14516o, Type> C14502f<ContainingType, Type> m90949n(ContainingType containingtype, C14516o oVar, C14503i.C14505b<?> bVar, int i, C14539w.C14541b bVar2, boolean z, Class cls) {
        return new C14502f(containingtype, Collections.emptyList(), oVar, new C14501e(bVar, i, bVar2, true, z), cls);
    }

    /* renamed from: p */
    public static <ContainingType extends C14516o, Type> C14502f<ContainingType, Type> m90950p(ContainingType containingtype, Type type, C14516o oVar, C14503i.C14505b<?> bVar, int i, C14539w.C14541b bVar2, Class cls) {
        return new C14502f(containingtype, type, oVar, new C14501e(bVar, i, bVar2, false, false), cls);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.C14516o> boolean m90951r(kotlin.reflect.jvm.internal.impl.protobuf.C14492g<kotlin.reflect.jvm.internal.impl.protobuf.C14495h.C14501e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.C14488e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.C14490f r9, int r10) throws java.io.IOException {
        /*
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.m91118b(r10)
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.m91117a(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f r6 = r9.mo73363b(r6, r1)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            goto L_0x003d
        L_0x0013:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r3 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.mo73379D()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C14492g.m90919l(r3, r1)
            if (r0 != r3) goto L_0x0021
            r0 = 0
            goto L_0x0011
        L_0x0021:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r3 = r6.f63376d
            boolean r4 = r3.f63371f
            if (r4 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.f63370d
            boolean r3 = r3.mo73523e()
            if (r3 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r3 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = r3.mo73379D()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C14492g.m90919l(r3, r2)
            if (r0 != r3) goto L_0x0010
            r0 = 0
            r3 = 1
        L_0x003d:
            if (r0 == 0) goto L_0x0044
            boolean r5 = r7.mo73338P(r10, r8)
            return r5
        L_0x0044:
            if (r3 == 0) goto L_0x0094
            int r8 = r7.mo73326A()
            int r8 = r7.mo73345j(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r9 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = r9.mo73379D()
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.ENUM
            if (r9 != r10) goto L_0x0079
        L_0x0058:
            int r9 = r7.mo73342e()
            if (r9 <= 0) goto L_0x008f
            int r9 = r7.mo73349n()
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.i$b r10 = r10.mo73400d()
            kotlin.reflect.jvm.internal.impl.protobuf.i$a r9 = r10.mo71085a(r9)
            if (r9 != 0) goto L_0x006f
            return r2
        L_0x006f:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            java.lang.Object r9 = r6.mo73406f(r9)
            r5.mo73366a(r10, r9)
            goto L_0x0058
        L_0x0079:
            int r9 = r7.mo73342e()
            if (r9 <= 0) goto L_0x008f
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r9 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = r9.mo73379D()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.C14492g.m90923u(r7, r9, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            r5.mo73366a(r10, r9)
            goto L_0x0079
        L_0x008f:
            r7.mo73344i(r8)
            goto L_0x0120
        L_0x0094:
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14495h.C14496a.f63360a
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r3 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r3 = r3.mo73380M()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L_0x00cb
            r9 = 2
            if (r0 == r9) goto L_0x00b2
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r8 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r8 = r8.mo73379D()
            java.lang.Object r7 = kotlin.reflect.jvm.internal.impl.protobuf.C14492g.m90923u(r7, r8, r1)
            goto L_0x0105
        L_0x00b2:
            int r7 = r7.mo73349n()
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r9 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.i$b r9 = r9.mo73400d()
            kotlin.reflect.jvm.internal.impl.protobuf.i$a r9 = r9.mo71085a(r7)
            if (r9 != 0) goto L_0x00c9
            r8.mo73264o0(r10)
            r8.mo73274y0(r7)
            return r2
        L_0x00c9:
            r7 = r9
            goto L_0x0105
        L_0x00cb:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            boolean r10 = r10.mo73384u()
            if (r10 != 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            java.lang.Object r10 = r5.mo73369h(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.o r10 = (kotlin.reflect.jvm.internal.impl.protobuf.C14516o) r10
            if (r10 == 0) goto L_0x00e2
            kotlin.reflect.jvm.internal.impl.protobuf.o$a r8 = r10.mo71014b()
        L_0x00e2:
            if (r8 != 0) goto L_0x00ec
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r6.mo73403c()
            kotlin.reflect.jvm.internal.impl.protobuf.o$a r8 = r8.mo71016d()
        L_0x00ec:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r10 = r6.f63376d
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = r10.mo73379D()
            kotlin.reflect.jvm.internal.impl.protobuf.w$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C14539w.C14541b.GROUP
            if (r10 != r0) goto L_0x00fe
            int r10 = r6.mo73404d()
            r7.mo73353r(r10, r8, r9)
            goto L_0x0101
        L_0x00fe:
            r7.mo73357v(r8, r9)
        L_0x0101:
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r8.build()
        L_0x0105:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r8 = r6.f63376d
            boolean r8 = r8.mo73384u()
            if (r8 == 0) goto L_0x0117
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r8 = r6.f63376d
            java.lang.Object r6 = r6.mo73406f(r7)
            r5.mo73366a(r8, r6)
            goto L_0x0120
        L_0x0117:
            kotlin.reflect.jvm.internal.impl.protobuf.h$e r8 = r6.f63376d
            java.lang.Object r6 = r6.mo73406f(r7)
            r5.mo73378v(r8, r6)
        L_0x0120:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C14495h.m90951r(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    /* renamed from: f */
    public C14519q<? extends C14516o> mo71017f() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo73385m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo73386q(C14488e eVar, CodedOutputStream codedOutputStream, C14490f fVar, int i) throws IOException {
        return eVar.mo73338P(i, codedOutputStream);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C14499d<MessageType extends C14499d<MessageType>> extends C14495h implements C14518p {
        /* access modifiers changed from: private */
        public final C14492g<C14501e> extensions;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d$a */
        /* compiled from: GeneratedMessageLite */
        protected class C14500a {

            /* renamed from: a */
            private final Iterator<Map.Entry<C14501e, Object>> f63364a;

            /* renamed from: b */
            private Map.Entry<C14501e, Object> f63365b;

            /* renamed from: c */
            private final boolean f63366c;

            /* synthetic */ C14500a(C14499d dVar, boolean z, C14496a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo73397a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C14501e, Object> entry = this.f63365b;
                    if (entry != null && entry.getKey().mo73382c() < i) {
                        C14501e key = this.f63365b.getKey();
                        if (!this.f63366c || key.mo73380M() != C14539w.C14546c.MESSAGE || key.mo73384u()) {
                            C14492g.m90927z(key, this.f63365b.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.mo73255f0(key.mo73382c(), (C14516o) this.f63365b.getValue());
                        }
                        if (this.f63364a.hasNext()) {
                            this.f63365b = this.f63364a.next();
                        } else {
                            this.f63365b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private C14500a(boolean z) {
                Iterator<Map.Entry<C14501e, Object>> p = C14499d.this.extensions.mo73375p();
                this.f63364a = p;
                if (p.hasNext()) {
                    this.f63365b = p.next();
                }
                this.f63366c = z;
            }
        }

        protected C14499d() {
            this.extensions = C14492g.m90922t();
        }

        /* renamed from: B */
        private void m90963B(C14502f<MessageType, ?> fVar) {
            if (fVar.mo73402b() != mo71124e()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public C14499d<MessageType>.a mo73390A() {
            return new C14500a(this, false, (C14496a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo73385m() {
            this.extensions.mo73376q();
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public boolean mo73386q(C14488e eVar, CodedOutputStream codedOutputStream, C14490f fVar, int i) throws IOException {
            return C14495h.m90951r(this.extensions, mo71124e(), eVar, codedOutputStream, fVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public boolean mo73391u() {
            return this.extensions.mo73374n();
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public int mo73392v() {
            return this.extensions.mo73372k();
        }

        /* renamed from: w */
        public final <Type> Type mo73393w(C14502f<MessageType, Type> fVar) {
            m90963B(fVar);
            Object h = this.extensions.mo73369h(fVar.f63376d);
            if (h == null) {
                return fVar.f63374b;
            }
            return fVar.mo73401a(h);
        }

        /* renamed from: x */
        public final <Type> Type mo73394x(C14502f<MessageType, List<Type>> fVar, int i) {
            m90963B(fVar);
            return fVar.mo73405e(this.extensions.mo73370i(fVar.f63376d, i));
        }

        /* renamed from: y */
        public final <Type> int mo73395y(C14502f<MessageType, List<Type>> fVar) {
            m90963B(fVar);
            return this.extensions.mo73371j(fVar.f63376d);
        }

        /* renamed from: z */
        public final <Type> boolean mo73396z(C14502f<MessageType, Type> fVar) {
            m90963B(fVar);
            return this.extensions.mo73373m(fVar.f63376d);
        }

        protected C14499d(C14498c<MessageType, ?> cVar) {
            this.extensions = cVar.m90960r();
        }
    }

    protected C14495h(C14497b bVar) {
    }
}
