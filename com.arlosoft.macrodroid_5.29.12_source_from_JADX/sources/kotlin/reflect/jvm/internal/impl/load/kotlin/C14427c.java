package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13917d;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14169a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14614d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14616f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14618h;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14623k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14627m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14641r;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14644u;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14646w;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14647x;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14648y;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14649z;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14781e;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p272gc.C12338a;
import p308kb.C13444b;
import p327mb.C15719c;
import p362pb.C16151b;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class C14427c extends C14410a<C13915c, C14617g<?>> {

    /* renamed from: c */
    private final C13958g0 f63244c;

    /* renamed from: d */
    private final C14043j0 f63245d;

    /* renamed from: e */
    private final C14781e f63246e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c$a */
    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    private abstract class C14428a implements C14459q.C14460a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c$a$a */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C14429a implements C14459q.C14460a {

            /* renamed from: a */
            private final /* synthetic */ C14459q.C14460a f63248a;

            /* renamed from: b */
            final /* synthetic */ C14459q.C14460a f63249b;

            /* renamed from: c */
            final /* synthetic */ C14428a f63250c;

            /* renamed from: d */
            final /* synthetic */ C16157f f63251d;

            /* renamed from: e */
            final /* synthetic */ ArrayList<C13915c> f63252e;

            C14429a(C14459q.C14460a aVar, C14428a aVar2, C16157f fVar, ArrayList<C13915c> arrayList) {
                this.f63249b = aVar;
                this.f63250c = aVar2;
                this.f63251d = fVar;
                this.f63252e = arrayList;
                this.f63248a = aVar;
            }

            /* renamed from: a */
            public void mo70781a() {
                this.f63249b.mo70781a();
                this.f63250c.mo73155h(this.f63251d, new C14610a((C13915c) C13566b0.m87446u0(this.f63252e)));
            }

            /* renamed from: b */
            public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
                C13706o.m87929f(bVar, "enumClassId");
                C13706o.m87929f(fVar2, "enumEntryName");
                this.f63248a.mo70782b(fVar, bVar, fVar2);
            }

            /* renamed from: c */
            public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
                C13706o.m87929f(bVar, "classId");
                return this.f63248a.mo70783c(fVar, bVar);
            }

            /* renamed from: d */
            public void mo70784d(C16157f fVar, Object obj) {
                this.f63248a.mo70784d(fVar, obj);
            }

            /* renamed from: e */
            public void mo70785e(C16157f fVar, C14616f fVar2) {
                C13706o.m87929f(fVar2, "value");
                this.f63248a.mo70785e(fVar, fVar2);
            }

            /* renamed from: f */
            public C14459q.C14461b mo70786f(C16157f fVar) {
                return this.f63248a.mo70786f(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c$a$b */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C14430b implements C14459q.C14461b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final ArrayList<C14617g<?>> f63253a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ C14427c f63254b;

            /* renamed from: c */
            final /* synthetic */ C16157f f63255c;

            /* renamed from: d */
            final /* synthetic */ C14428a f63256d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c$a$b$a */
            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            public static final class C14431a implements C14459q.C14460a {

                /* renamed from: a */
                private final /* synthetic */ C14459q.C14460a f63257a;

                /* renamed from: b */
                final /* synthetic */ C14459q.C14460a f63258b;

                /* renamed from: c */
                final /* synthetic */ C14430b f63259c;

                /* renamed from: d */
                final /* synthetic */ ArrayList<C13915c> f63260d;

                C14431a(C14459q.C14460a aVar, C14430b bVar, ArrayList<C13915c> arrayList) {
                    this.f63258b = aVar;
                    this.f63259c = bVar;
                    this.f63260d = arrayList;
                    this.f63257a = aVar;
                }

                /* renamed from: a */
                public void mo70781a() {
                    this.f63258b.mo70781a();
                    this.f63259c.f63253a.add(new C14610a((C13915c) C13566b0.m87446u0(this.f63260d)));
                }

                /* renamed from: b */
                public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
                    C13706o.m87929f(bVar, "enumClassId");
                    C13706o.m87929f(fVar2, "enumEntryName");
                    this.f63257a.mo70782b(fVar, bVar, fVar2);
                }

                /* renamed from: c */
                public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
                    C13706o.m87929f(bVar, "classId");
                    return this.f63257a.mo70783c(fVar, bVar);
                }

                /* renamed from: d */
                public void mo70784d(C16157f fVar, Object obj) {
                    this.f63257a.mo70784d(fVar, obj);
                }

                /* renamed from: e */
                public void mo70785e(C16157f fVar, C14616f fVar2) {
                    C13706o.m87929f(fVar2, "value");
                    this.f63257a.mo70785e(fVar, fVar2);
                }

                /* renamed from: f */
                public C14459q.C14461b mo70786f(C16157f fVar) {
                    return this.f63257a.mo70786f(fVar);
                }
            }

            C14430b(C14427c cVar, C16157f fVar, C14428a aVar) {
                this.f63254b = cVar;
                this.f63255c = fVar;
                this.f63256d = aVar;
            }

            /* renamed from: a */
            public void mo70775a() {
                this.f63256d.mo73154g(this.f63255c, this.f63253a);
            }

            /* renamed from: b */
            public C14459q.C14460a mo70776b(C16151b bVar) {
                C13706o.m87929f(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                C14427c cVar = this.f63254b;
                C14158z0 z0Var = C14158z0.f62778a;
                C13706o.m87928e(z0Var, "NO_SOURCE");
                C14459q.C14460a x = cVar.mo73149x(bVar, z0Var, arrayList);
                C13706o.m87926c(x);
                return new C14431a(x, this, arrayList);
            }

            /* renamed from: c */
            public void mo70777c(C16151b bVar, C16157f fVar) {
                C13706o.m87929f(bVar, "enumClassId");
                C13706o.m87929f(fVar, "enumEntryName");
                this.f63253a.add(new C14622j(bVar, fVar));
            }

            /* renamed from: d */
            public void mo70778d(Object obj) {
                this.f63253a.add(this.f63254b.m90538K(this.f63255c, obj));
            }

            /* renamed from: e */
            public void mo70779e(C14616f fVar) {
                C13706o.m87929f(fVar, "value");
                this.f63253a.add(new C14636q(fVar));
            }
        }

        public C14428a() {
        }

        /* renamed from: b */
        public void mo70782b(C16157f fVar, C16151b bVar, C16157f fVar2) {
            C13706o.m87929f(bVar, "enumClassId");
            C13706o.m87929f(fVar2, "enumEntryName");
            mo73155h(fVar, new C14622j(bVar, fVar2));
        }

        /* renamed from: c */
        public C14459q.C14460a mo70783c(C16157f fVar, C16151b bVar) {
            C13706o.m87929f(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            C14427c cVar = C14427c.this;
            C14158z0 z0Var = C14158z0.f62778a;
            C13706o.m87928e(z0Var, "NO_SOURCE");
            C14459q.C14460a x = cVar.mo73149x(bVar, z0Var, arrayList);
            C13706o.m87926c(x);
            return new C14429a(x, this, fVar, arrayList);
        }

        /* renamed from: d */
        public void mo70784d(C16157f fVar, Object obj) {
            mo73155h(fVar, C14427c.this.m90538K(fVar, obj));
        }

        /* renamed from: e */
        public void mo70785e(C16157f fVar, C14616f fVar2) {
            C13706o.m87929f(fVar2, "value");
            mo73155h(fVar, new C14636q(fVar2));
        }

        /* renamed from: f */
        public C14459q.C14461b mo70786f(C16157f fVar) {
            return new C14430b(C14427c.this, fVar, this);
        }

        /* renamed from: g */
        public abstract void mo73154g(C16157f fVar, ArrayList<C14617g<?>> arrayList);

        /* renamed from: h */
        public abstract void mo73155h(C16157f fVar, C14617g<?> gVar);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c$b */
    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class C14432b extends C14428a {

        /* renamed from: b */
        private final HashMap<C16157f, C14617g<?>> f63261b = new HashMap<>();

        /* renamed from: c */
        final /* synthetic */ C14427c f63262c;

        /* renamed from: d */
        final /* synthetic */ C13948e f63263d;

        /* renamed from: e */
        final /* synthetic */ C16151b f63264e;

        /* renamed from: f */
        final /* synthetic */ List<C13915c> f63265f;

        /* renamed from: g */
        final /* synthetic */ C14158z0 f63266g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14432b(C14427c cVar, C13948e eVar, C16151b bVar, List<C13915c> list, C14158z0 z0Var) {
            super();
            this.f63262c = cVar;
            this.f63263d = eVar;
            this.f63264e = bVar;
            this.f63265f = list;
            this.f63266g = z0Var;
        }

        /* renamed from: a */
        public void mo70781a() {
            if (!this.f63262c.mo73110E(this.f63264e, this.f63261b) && !this.f63262c.mo73148w(this.f63264e)) {
                this.f63265f.add(new C13917d(this.f63263d.mo72274p(), this.f63261b, this.f63266g));
            }
        }

        /* renamed from: g */
        public void mo73154g(C16157f fVar, ArrayList<C14617g<?>> arrayList) {
            C13706o.m87929f(arrayList, "elements");
            if (fVar != null) {
                C13966i1 b = C14169a.m89659b(fVar, this.f63263d);
                if (b != null) {
                    HashMap<C16157f, C14617g<?>> hashMap = this.f63261b;
                    C14618h hVar = C14618h.f63618a;
                    List<T> c = C12338a.m83073c(arrayList);
                    C14900e0 type = b.getType();
                    C13706o.m87928e(type, "parameter.type");
                    hashMap.put(fVar, hVar.mo73730b(c, type));
                } else if (this.f63262c.mo73148w(this.f63264e) && C13706o.m87924a(fVar.mo78583d(), "value")) {
                    ArrayList<C14610a> arrayList2 = new ArrayList<>();
                    for (T next : arrayList) {
                        if (next instanceof C14610a) {
                            arrayList2.add(next);
                        }
                    }
                    List<C13915c> list = this.f63265f;
                    for (C14610a b2 : arrayList2) {
                        list.add((C13915c) b2.mo73727b());
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo73155h(C16157f fVar, C14617g<?> gVar) {
            C13706o.m87929f(gVar, "value");
            if (fVar != null) {
                this.f63261b.put(fVar, gVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14427c(C13958g0 g0Var, C14043j0 j0Var, C17012n nVar, C14454o oVar) {
        super(nVar, oVar);
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(j0Var, "notFoundClasses");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(oVar, "kotlinClassFinder");
        this.f63244c = g0Var;
        this.f63245d = j0Var;
        this.f63246e = new C14781e(g0Var, j0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final C14617g<?> m90538K(C16157f fVar, Object obj) {
        C14617g<?> c = C14618h.f63618a.mo73731c(obj);
        if (c != null) {
            return c;
        }
        C14623k.C14624a aVar = C14623k.f63621b;
        return aVar.mo73737a("Unsupported annotation argument: " + fVar);
    }

    /* renamed from: N */
    private final C13948e m90539N(C16151b bVar) {
        return C14147x.m89566c(this.f63244c, bVar, this.f63245d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C14617g<?> mo73111G(String str, Object obj) {
        C13706o.m87929f(str, "desc");
        C13706o.m87929f(obj, "initializer");
        boolean z = false;
        if (C15177w.m93663N("ZBCS", str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return C14618h.f63618a.mo73731c(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C13915c mo73133A(C13444b bVar, C15719c cVar) {
        C13706o.m87929f(bVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        return this.f63246e.mo73941a(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public C14617g<?> mo73112I(C14617g<?> gVar) {
        C14617g<?> yVar;
        C13706o.m87929f(gVar, "constant");
        if (gVar instanceof C14614d) {
            yVar = new C14646w(((Number) ((C14614d) gVar).mo73727b()).byteValue());
        } else if (gVar instanceof C14644u) {
            yVar = new C14649z(((Number) ((C14644u) gVar).mo73727b()).shortValue());
        } else if (gVar instanceof C14627m) {
            yVar = new C14647x(((Number) ((C14627m) gVar).mo73727b()).intValue());
        } else if (!(gVar instanceof C14641r)) {
            return gVar;
        } else {
            yVar = new C14648y(((Number) ((C14641r) gVar).mo73727b()).longValue());
        }
        return yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public C14459q.C14460a mo73149x(C16151b bVar, C14158z0 z0Var, List<C13915c> list) {
        C13706o.m87929f(bVar, "annotationClassId");
        C13706o.m87929f(z0Var, "source");
        C13706o.m87929f(list, "result");
        return new C14432b(this, m90539N(bVar), bVar, list, z0Var);
    }
}
