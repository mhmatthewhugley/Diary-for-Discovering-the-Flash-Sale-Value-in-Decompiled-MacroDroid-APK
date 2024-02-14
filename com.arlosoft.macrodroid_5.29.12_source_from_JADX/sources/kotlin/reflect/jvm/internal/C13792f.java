package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.calls.C13738d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14076q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p271gb.C12327a;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16874c;
import p433xa.C16881j;
import p433xa.C16888n;
import p433xa.C16889o;
import p433xa.C16894r;
import p441ya.C16977a;
import p441ya.C16978b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bM\u0010NJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u001a*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e0\u001e0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010!0!0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001a*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00180\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0016\u0010C\u001a\u0004\u0018\u00010@8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bD\u00103R\u0014\u0010E\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0014\u0010F\u001a\u0002018VX\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010H\u001a\u0002018DX\u0004¢\u0006\u0006\u001a\u0004\bG\u00103R\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/f;", "R", "Lxa/c;", "Lkotlin/reflect/jvm/internal/z;", "", "Lxa/j;", "", "args", "o", "(Ljava/util/Map;)Ljava/lang/Object;", "Lxa/n;", "type", "q", "Ljava/lang/reflect/Type;", "r", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/d;", "continuationArgument", "p", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/c0$a;", "", "", "kotlin.jvm.PlatformType", "a", "Lkotlin/reflect/jvm/internal/c0$a;", "_annotations", "Ljava/util/ArrayList;", "c", "_parameters", "Lkotlin/reflect/jvm/internal/x;", "d", "_returnType", "Lkotlin/reflect/jvm/internal/y;", "f", "_typeParameters", "Lkotlin/reflect/jvm/internal/calls/d;", "s", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "u", "defaultCaller", "Lkotlin/reflect/jvm/internal/i;", "t", "()Lkotlin/reflect/jvm/internal/i;", "container", "", "x", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lxa/n;", "returnType", "Lxa/o;", "getTypeParameters", "typeParameters", "Lxa/r;", "getVisibility", "()Lxa/r;", "visibility", "isFinal", "isOpen", "isAbstract", "w", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.f */
/* compiled from: KCallableImpl.kt */
public abstract class C13792f<R> implements C16874c<R>, C15106z {

    /* renamed from: a */
    private final C13724c0.C13725a<List<Annotation>> f62013a;

    /* renamed from: c */
    private final C13724c0.C13725a<ArrayList<C16881j>> f62014c;

    /* renamed from: d */
    private final C13724c0.C13725a<C15097x> f62015d;

    /* renamed from: f */
    private final C13724c0.C13725a<List<C15103y>> f62016f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"R", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.f$a */
    /* compiled from: KCallableImpl.kt */
    static final class C13793a extends C13708q implements C16254a<List<? extends Annotation>> {
        final /* synthetic */ C13792f<R> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13793a(C13792f<? extends R> fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final List<Annotation> invoke() {
            return C13841i0.m88199d(this.this$0.mo72037v());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"R", "Ljava/util/ArrayList;", "Lxa/j;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/ArrayList;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.f$b */
    /* compiled from: KCallableImpl.kt */
    static final class C13794b extends C13708q implements C16254a<ArrayList<C16881j>> {
        final /* synthetic */ C13792f<R> this$0;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/q0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.f$b$a */
        /* compiled from: KCallableImpl.kt */
        static final class C13795a extends C13708q implements C16254a<C14076q0> {
            final /* synthetic */ C14146w0 $instanceReceiver;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13795a(C14146w0 w0Var) {
                super(0);
                this.$instanceReceiver = w0Var;
            }

            /* renamed from: a */
            public final C14076q0 invoke() {
                return this.$instanceReceiver;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/q0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.f$b$b */
        /* compiled from: KCallableImpl.kt */
        static final class C13796b extends C13708q implements C16254a<C14076q0> {
            final /* synthetic */ C14146w0 $extensionReceiver;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13796b(C14146w0 w0Var) {
                super(0);
                this.$extensionReceiver = w0Var;
            }

            /* renamed from: a */
            public final C14076q0 invoke() {
                return this.$extensionReceiver;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"R", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/q0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.f$b$c */
        /* compiled from: KCallableImpl.kt */
        static final class C13797c extends C13708q implements C16254a<C14076q0> {
            final /* synthetic */ C13936b $descriptor;

            /* renamed from: $i */
            final /* synthetic */ int f62017$i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13797c(C13936b bVar, int i) {
                super(0);
                this.$descriptor = bVar;
                this.f62017$i = i;
            }

            /* renamed from: a */
            public final C14076q0 invoke() {
                C13966i1 i1Var = this.$descriptor.mo72235g().get(this.f62017$i);
                C13706o.m87928e(i1Var, "descriptor.valueParameters[i]");
                return i1Var;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.f$b$d */
        /* compiled from: Comparisons.kt */
        public static final class C13798d<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C15612b.m94865a(((C16881j) t).getName(), ((C16881j) t2).getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13794b(C13792f<? extends R> fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final ArrayList<C16881j> invoke() {
            int i;
            C13936b v = this.this$0.mo72037v();
            ArrayList<C16881j> arrayList = new ArrayList<>();
            int i2 = 0;
            if (!this.this$0.mo72039x()) {
                C14146w0 h = C13841i0.m88203h(v);
                if (h != null) {
                    arrayList.add(new C15070p(this.this$0, 0, C16881j.C16882a.INSTANCE, new C13795a(h)));
                    i = 1;
                } else {
                    i = 0;
                }
                C14146w0 P = v.mo72232P();
                if (P != null) {
                    arrayList.add(new C15070p(this.this$0, i, C16881j.C16882a.EXTENSION_RECEIVER, new C13796b(P)));
                    i++;
                }
            } else {
                i = 0;
            }
            int size = v.mo72235g().size();
            while (i2 < size) {
                arrayList.add(new C15070p(this.this$0, i, C16881j.C16882a.VALUE, new C13797c(v, i2)));
                i2++;
                i++;
            }
            if (this.this$0.mo72038w() && (v instanceof C12327a) && arrayList.size() > 1) {
                C13622x.m87781y(arrayList, new C13798d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"R", "Lkotlin/reflect/jvm/internal/x;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/x;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.f$c */
    /* compiled from: KCallableImpl.kt */
    static final class C13799c extends C13708q implements C16254a<C15097x> {
        final /* synthetic */ C13792f<R> this$0;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.f$c$a */
        /* compiled from: KCallableImpl.kt */
        static final class C13800a extends C13708q implements C16254a<Type> {
            final /* synthetic */ C13792f<R> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13800a(C13792f<? extends R> fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* renamed from: a */
            public final Type invoke() {
                Type l = this.this$0.m88087r();
                return l == null ? this.this$0.mo72034s().getReturnType() : l;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13799c(C13792f<? extends R> fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final C15097x invoke() {
            C14900e0 returnType = this.this$0.mo72037v().getReturnType();
            C13706o.m87926c(returnType);
            return new C15097x(returnType, new C13800a(this.this$0));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"R", "", "Lkotlin/reflect/jvm/internal/y;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.f$d */
    /* compiled from: KCallableImpl.kt */
    static final class C13801d extends C13708q implements C16254a<List<? extends C15103y>> {
        final /* synthetic */ C13792f<R> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13801d(C13792f<? extends R> fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final List<C15103y> invoke() {
            List<C13950e1> typeParameters = this.this$0.mo72037v().getTypeParameters();
            C13706o.m87928e(typeParameters, "descriptor.typeParameters");
            C13792f<R> fVar = this.this$0;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(typeParameters, 10));
            for (C13950e1 e1Var : typeParameters) {
                C13706o.m87928e(e1Var, "descriptor");
                arrayList.add(new C15103y(fVar, e1Var));
            }
            return arrayList;
        }
    }

    public C13792f() {
        C13724c0.C13725a<List<Annotation>> d = C13724c0.m87973d(new C13793a(this));
        C13706o.m87928e(d, "lazySoft { descriptor.computeAnnotations() }");
        this.f62013a = d;
        C13724c0.C13725a<ArrayList<C16881j>> d2 = C13724c0.m87973d(new C13794b(this));
        C13706o.m87928e(d2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f62014c = d2;
        C13724c0.C13725a<C15097x> d3 = C13724c0.m87973d(new C13799c(this));
        C13706o.m87928e(d3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f62015d = d3;
        C13724c0.C13725a<List<C15103y>> d4 = C13724c0.m87973d(new C13801d(this));
        C13706o.m87928e(d4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f62016f = d4;
    }

    /* renamed from: o */
    private final R m88085o(Map<C16881j, ? extends Object> map) {
        Object obj;
        List<C16881j> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
        for (C16881j jVar : parameters) {
            if (map.containsKey(jVar)) {
                obj = map.get(jVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                }
            } else if (jVar.mo74347k()) {
                obj = null;
            } else if (jVar.mo74340a()) {
                obj = m88086q(jVar.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
            }
            arrayList.add(obj);
        }
        C13738d<?> u = mo72036u();
        if (u != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return u.call(array);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        } else {
            throw new C13719a0("This callable does not support a default call: " + mo72037v());
        }
    }

    /* renamed from: q */
    private final Object m88086q(C16888n nVar) {
        Class<?> b = C16147a.m96968b(C16977a.m100216b(nVar));
        if (b.isArray()) {
            Object newInstance = Array.newInstance(b.getComponentType(), 0);
            C13706o.m87928e(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new C13719a0("Cannot instantiate the default empty array of type " + b.getSimpleName() + ", because it is not an array type");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Type m88087r() {
        Type[] lowerBounds;
        C13936b v = mo72037v();
        C14154y yVar = v instanceof C14154y ? (C14154y) v : null;
        boolean z = true;
        if (yVar == null || !yVar.isSuspend()) {
            z = false;
        }
        if (!z) {
            return null;
        }
        Object k0 = C13566b0.m87436k0(mo72034s().mo71984a());
        ParameterizedType parameterizedType = k0 instanceof ParameterizedType ? (ParameterizedType) k0 : null;
        if (!C13706o.m87924a(parameterizedType != null ? parameterizedType.getRawType() : null, C13635d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C13706o.m87928e(actualTypeArguments, "continuationType.actualTypeArguments");
        Object V = C13596m.m87597V(actualTypeArguments);
        WildcardType wildcardType = V instanceof WildcardType ? (WildcardType) V : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C13596m.m87577B(lowerBounds);
    }

    public R call(Object... objArr) {
        C13706o.m87929f(objArr, "args");
        try {
            return mo72034s().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    public R callBy(Map<C16881j, ? extends Object> map) {
        C13706o.m87929f(map, "args");
        return mo72038w() ? m88085o(map) : mo72033p(map, (C13635d<?>) null);
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f62013a.invoke();
        C13706o.m87928e(invoke, "_annotations()");
        return invoke;
    }

    public List<C16881j> getParameters() {
        ArrayList<C16881j> invoke = this.f62014c.invoke();
        C13706o.m87928e(invoke, "_parameters()");
        return invoke;
    }

    public C16888n getReturnType() {
        C15097x invoke = this.f62015d.invoke();
        C13706o.m87928e(invoke, "_returnType()");
        return invoke;
    }

    public List<C16889o> getTypeParameters() {
        List<C15103y> invoke = this.f62016f.invoke();
        C13706o.m87928e(invoke, "_typeParameters()");
        return invoke;
    }

    public C16894r getVisibility() {
        C14141u visibility = mo72037v().getVisibility();
        C13706o.m87928e(visibility, "descriptor.visibility");
        return C13841i0.m88211p(visibility);
    }

    public boolean isAbstract() {
        return mo72037v().mo62179r() == C13945d0.ABSTRACT;
    }

    public boolean isFinal() {
        return mo72037v().mo62179r() == C13945d0.FINAL;
    }

    public boolean isOpen() {
        return mo72037v().mo62179r() == C13945d0.OPEN;
    }

    /* renamed from: p */
    public final R mo72033p(Map<C16881j, ? extends Object> map, C13635d<?> dVar) {
        C13706o.m87929f(map, "args");
        List<C16881j> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<C16881j> it = parameters.iterator();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                C16881j next = it.next();
                if (i != 0 && i % 32 == 0) {
                    arrayList2.add(Integer.valueOf(i2));
                    i2 = 0;
                }
                if (map.containsKey(next)) {
                    arrayList.add(map.get(next));
                } else if (next.mo74347k()) {
                    if (!C13841i0.m88205j(next.getType())) {
                        obj = C13841i0.m88201f(C16978b.m100217a(next.getType()));
                    }
                    arrayList.add(obj);
                    i2 = (1 << (i % 32)) | i2;
                    z = true;
                } else if (next.mo74340a()) {
                    arrayList.add(m88086q(next.getType()));
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.mo74344h() == C16881j.C16882a.VALUE) {
                    i++;
                }
            } else {
                if (dVar != null) {
                    arrayList.add(dVar);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i2));
                C13738d<?> u = mo72036u();
                if (u != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add((Object) null);
                    try {
                        Object[] array2 = arrayList.toArray(new Object[0]);
                        C13706o.m87927d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        return u.call(array2);
                    } catch (IllegalAccessException e) {
                        throw new IllegalCallableAccessException(e);
                    }
                } else {
                    throw new C13719a0("This callable does not support a default call: " + mo72037v());
                }
            }
        }
    }

    /* renamed from: s */
    public abstract C13738d<?> mo72034s();

    /* renamed from: t */
    public abstract C13832i mo72035t();

    /* renamed from: u */
    public abstract C13738d<?> mo72036u();

    /* renamed from: v */
    public abstract C13936b mo72037v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo72038w() {
        return C13706o.m87924a(getName(), "<init>") && mo72035t().mo71931e().isAnnotation();
    }

    /* renamed from: x */
    public abstract boolean mo72039x();
}
