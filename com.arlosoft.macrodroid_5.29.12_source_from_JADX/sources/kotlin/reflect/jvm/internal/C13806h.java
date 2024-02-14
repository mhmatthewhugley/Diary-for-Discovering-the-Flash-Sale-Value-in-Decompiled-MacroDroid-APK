package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C13832i;
import kotlin.reflect.jvm.internal.impl.builtins.C13847c;
import kotlin.reflect.jvm.internal.impl.builtins.C13848d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import org.apache.commons.p353io.FilenameUtils;
import p242db.C12001k;
import p263fb.C12256d;
import p298jb.C13359a;
import p308kb.C13455c;
import p308kb.C13494n;
import p327mb.C15722e;
import p336nb.C15766a;
import p361pa.C16147a;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;
import p433xa.C16875d;
import p433xa.C16878g;
import p433xa.C16879h;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00012\u00020\u0005:\u0001@B\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b>\u0010?J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0016\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR9\u0010'\u001a$\u0012 \u0012\u001e \"*\u000e\u0018\u00010!R\b\u0012\u0004\u0012\u00028\u00000\u00000!R\b\u0012\u0004\u0012\u00028\u00000\u00000 8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010-R\u0014\u00103\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088@X\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002088@X\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:¨\u0006A"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/h;", "", "T", "Lkotlin/reflect/jvm/internal/i;", "Lxa/d;", "Lkotlin/reflect/jvm/internal/z;", "", "M", "Lpb/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "y", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "u", "", "index", "v", "value", "", "d", "other", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "f", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/h$a;", "kotlin.jvm.PlatformType", "g", "Lkotlin/reflect/jvm/internal/c0$b;", "I", "()Lkotlin/reflect/jvm/internal/c0$b;", "data", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "t", "()Ljava/util/Collection;", "constructorDescriptors", "j", "()Ljava/lang/String;", "simpleName", "qualifiedName", "Lpb/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.h */
/* compiled from: KClassImpl.kt */
public final class C13806h<T> extends C13832i implements C16875d<T>, C15106z {

    /* renamed from: f */
    private final Class<T> f62022f;

    /* renamed from: g */
    private final C13724c0.C13726b<C13806h<T>.a> f62023g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\bG\u0010HJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0014R-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198FX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR%\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00198FX\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u001dR#\u0010*\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R!\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\r8FX\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u0011R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\r8FX\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b1\u0010\u0011R)\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000!0\r8FX\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u0011R%\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\"\u0010\u001dR%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b%\u0010\u001dR%\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0002¢\u0006\f\n\u0004\b9\u0010\t\u001a\u0004\b0\u0010\u001dR%\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198BX\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b3\u0010\u001dR%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b\u0016\u0010\u001dR%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0002¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b\u001b\u0010\u001dR%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\bB\u0010\u001dR%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\u00198FX\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010\u001d¨\u0006I"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/h$a;", "Lkotlin/reflect/jvm/internal/i$b;", "Lkotlin/reflect/jvm/internal/i;", "Ljava/lang/Class;", "jClass", "", "f", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "d", "Lkotlin/reflect/jvm/internal/c0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "o", "()Ljava/lang/String;", "simpleName", "g", "n", "qualifiedName", "", "Lxa/h;", "h", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lxa/d;", "i", "getNestedClasses", "nestedClasses", "j", "Lkotlin/reflect/jvm/internal/c0$b;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lxa/o;", "k", "getTypeParameters", "typeParameters", "Lxa/n;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/f;", "declaredNonStaticMembers", "declaredStaticMembers", "p", "inheritedNonStaticMembers", "q", "inheritedStaticMembers", "r", "allNonStaticMembers", "s", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "<init>", "(Lkotlin/reflect/jvm/internal/h;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.h$a */
    /* compiled from: KClassImpl.kt */
    public final class C13807a extends C13832i.C13834b {

        /* renamed from: w */
        static final /* synthetic */ C16887m<Object>[] f62024w;

        /* renamed from: d */
        private final C13724c0.C13725a f62025d;

        /* renamed from: e */
        private final C13724c0.C13725a f62026e = C13724c0.m87973d(new C13811d(this));

        /* renamed from: f */
        private final C13724c0.C13725a f62027f;

        /* renamed from: g */
        private final C13724c0.C13725a f62028g;

        /* renamed from: h */
        private final C13724c0.C13725a f62029h;

        /* renamed from: i */
        private final C13724c0.C13725a f62030i;

        /* renamed from: j */
        private final C13724c0.C13726b f62031j;

        /* renamed from: k */
        private final C13724c0.C13725a f62032k;

        /* renamed from: l */
        private final C13724c0.C13725a f62033l;

        /* renamed from: m */
        private final C13724c0.C13725a f62034m;

        /* renamed from: n */
        private final C13724c0.C13725a f62035n;

        /* renamed from: o */
        private final C13724c0.C13725a f62036o;

        /* renamed from: p */
        private final C13724c0.C13725a f62037p;

        /* renamed from: q */
        private final C13724c0.C13725a f62038q;

        /* renamed from: r */
        private final C13724c0.C13725a f62039r;

        /* renamed from: s */
        private final C13724c0.C13725a f62040s;

        /* renamed from: t */
        private final C13724c0.C13725a f62041t;

        /* renamed from: u */
        private final C13724c0.C13725a f62042u;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$a */
        /* compiled from: KClassImpl.kt */
        static final class C13808a extends C13708q implements C16254a<List<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13808a(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13792f<?>> invoke() {
                return C13566b0.m87442q0(this.this$0.mo72060g(), this.this$0.mo72061h());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$b */
        /* compiled from: KClassImpl.kt */
        static final class C13809b extends C13708q implements C16254a<List<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13809b(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13792f<?>> invoke() {
                return C13566b0.m87442q0(this.this$0.mo72062i(), this.this$0.m88136l());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$c */
        /* compiled from: KClassImpl.kt */
        static final class C13810c extends C13708q implements C16254a<List<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13810c(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13792f<?>> invoke() {
                return C13566b0.m87442q0(this.this$0.m88135j(), this.this$0.m88137m());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$d */
        /* compiled from: KClassImpl.kt */
        static final class C13811d extends C13708q implements C16254a<List<? extends Annotation>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13811d(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<Annotation> invoke() {
                return C13841i0.m88199d(this.this$0.mo72063k());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lxa/h;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$e */
        /* compiled from: KClassImpl.kt */
        static final class C13812e extends C13708q implements C16254a<List<? extends C16879h<? extends T>>> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13812e(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final List<C16879h<T>> invoke() {
                Collection<C14052l> t = this.this$0.mo71977t();
                C13806h<T> hVar = this.this$0;
                ArrayList arrayList = new ArrayList(C13616u.m87774u(t, 10));
                for (C14052l jVar : t) {
                    arrayList.add(new C15047j(hVar, jVar));
                }
                return arrayList;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$f */
        /* compiled from: KClassImpl.kt */
        static final class C13813f extends C13708q implements C16254a<List<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13813f(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13792f<?>> invoke() {
                return C13566b0.m87442q0(this.this$0.mo72062i(), this.this$0.m88135j());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$g */
        /* compiled from: KClassImpl.kt */
        static final class C13814g extends C13708q implements C16254a<Collection<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13814g(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final Collection<C13792f<?>> invoke() {
                C13806h<T> hVar = this.this$0;
                return hVar.mo72093w(hVar.mo72055K(), C13832i.C13836c.DECLARED);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$h */
        /* compiled from: KClassImpl.kt */
        static final class C13815h extends C13708q implements C16254a<Collection<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13815h(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final Collection<C13792f<?>> invoke() {
                C13806h<T> hVar = this.this$0;
                return hVar.mo72093w(hVar.mo72056L(), C13832i.C13836c.DECLARED);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "T", "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/e;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$i */
        /* compiled from: KClassImpl.kt */
        static final class C13816i extends C13708q implements C16254a<C13948e> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13816i(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final C13948e invoke() {
                C13948e eVar;
                C16151b F = this.this$0.m88116H();
                C12001k a = this.this$0.mo72053I().invoke().mo72096a();
                if (F.mo78553k()) {
                    eVar = a.mo67441a().mo73960b(F);
                } else {
                    eVar = C14147x.m89564a(a.mo67442b(), F);
                }
                if (eVar != null) {
                    return eVar;
                }
                Void unused = this.this$0.m88117M();
                throw null;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$j */
        /* compiled from: KClassImpl.kt */
        static final class C13817j extends C13708q implements C16254a<Collection<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13817j(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final Collection<C13792f<?>> invoke() {
                C13806h<T> hVar = this.this$0;
                return hVar.mo72093w(hVar.mo72055K(), C13832i.C13836c.INHERITED);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$k */
        /* compiled from: KClassImpl.kt */
        static final class C13818k extends C13708q implements C16254a<Collection<? extends C13792f<?>>> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13818k(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final Collection<C13792f<?>> invoke() {
                C13806h<T> hVar = this.this$0;
                return hVar.mo72093w(hVar.mo72056L(), C13832i.C13836c.INHERITED);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/h;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$l */
        /* compiled from: KClassImpl.kt */
        static final class C13819l extends C13708q implements C16254a<List<? extends C13806h<? extends Object>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13819l(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13806h<? extends Object>> invoke() {
                C14692h T = this.this$0.mo72063k().mo72284T();
                C13706o.m87928e(T, "descriptor.unsubstitutedInnerClassesScope");
                Collection a = C14698k.C14699a.m91887a(T, (C14683d) null, (C16265l) null, 3, (Object) null);
                ArrayList<C14064m> arrayList = new ArrayList<>();
                for (Object next : a) {
                    if (!C14650d.m91602B((C14064m) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (C14064m mVar : arrayList) {
                    C13948e eVar = mVar instanceof C13948e ? (C13948e) mVar : null;
                    Class<?> o = eVar != null ? C13841i0.m88210o(eVar) : null;
                    C13806h hVar = o != null ? new C13806h(o) : null;
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                }
                return arrayList2;
            }
        }

        @Metadata(mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.h$a$m */
        /* compiled from: KClassImpl.kt */
        static final class C13820m extends C13708q implements C16254a<T> {
            final /* synthetic */ C13806h<T>.a this$0;
            final /* synthetic */ C13806h<T> this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13820m(C13806h<T>.a aVar, C13806h<T> hVar) {
                super(0);
                this.this$0 = aVar;
                this.this$1 = hVar;
            }

            public final T invoke() {
                Field field;
                C13948e k = this.this$0.mo72063k();
                if (k.mo62168h() != C13951f.OBJECT) {
                    return null;
                }
                if (!k.mo62162a0() || C13848d.m88219a(C13847c.f62065a, k)) {
                    field = this.this$1.mo71931e().getDeclaredField("INSTANCE");
                } else {
                    field = this.this$1.mo71931e().getEnclosingClass().getDeclaredField(k.getName().mo78583d());
                }
                T t = field.get((Object) null);
                C13706o.m87927d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$n */
        /* compiled from: KClassImpl.kt */
        static final class C13821n extends C13708q implements C16254a<String> {
            final /* synthetic */ C13806h<T> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13821n(C13806h<T> hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final String invoke() {
                if (this.this$0.mo71931e().isAnonymousClass()) {
                    return null;
                }
                C16151b F = this.this$0.m88116H();
                if (F.mo78553k()) {
                    return null;
                }
                return F.mo78544b().mo78556b();
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/h;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$o */
        /* compiled from: KClassImpl.kt */
        static final class C13822o extends C13708q implements C16254a<List<? extends C13806h<? extends T>>> {
            final /* synthetic */ C13806h<T>.a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13822o(C13806h<T>.a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final List<C13806h<? extends T>> invoke() {
                Collection<C13948e> w = this.this$0.mo72063k().mo62181w();
                C13706o.m87928e(w, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (C13948e eVar : w) {
                    C13706o.m87927d(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> o = C13841i0.m88210o(eVar);
                    C13806h hVar = o != null ? new C13806h(o) : null;
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "", "a", "()Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$p */
        /* compiled from: KClassImpl.kt */
        static final class C13823p extends C13708q implements C16254a<String> {
            final /* synthetic */ C13806h<T> this$0;
            final /* synthetic */ C13806h<T>.a this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13823p(C13806h<T> hVar, C13806h<T>.a aVar) {
                super(0);
                this.this$0 = hVar;
                this.this$1 = aVar;
            }

            /* renamed from: a */
            public final String invoke() {
                if (this.this$0.mo71931e().isAnonymousClass()) {
                    return null;
                }
                C16151b F = this.this$0.m88116H();
                if (F.mo78553k()) {
                    return this.this$1.m88134f(this.this$0.mo71931e());
                }
                String d = F.mo78552j().mo78583d();
                C13706o.m87928e(d, "classId.shortClassName.asString()");
                return d;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/x;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$q */
        /* compiled from: KClassImpl.kt */
        static final class C13824q extends C13708q implements C16254a<List<? extends C15097x>> {
            final /* synthetic */ C13806h<T>.a this$0;
            final /* synthetic */ C13806h<T> this$1;

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
            /* renamed from: kotlin.reflect.jvm.internal.h$a$q$a */
            /* compiled from: KClassImpl.kt */
            static final class C13825a extends C13708q implements C16254a<Type> {
                final /* synthetic */ C14900e0 $kotlinType;
                final /* synthetic */ C13806h<T>.a this$0;
                final /* synthetic */ C13806h<T> this$1;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C13825a(C14900e0 e0Var, C13806h<T>.a aVar, C13806h<T> hVar) {
                    super(0);
                    this.$kotlinType = e0Var;
                    this.this$0 = aVar;
                    this.this$1 = hVar;
                }

                /* renamed from: a */
                public final Type invoke() {
                    C13961h c = this.$kotlinType.mo73702N0().mo62183c();
                    if (c instanceof C13948e) {
                        Class<?> o = C13841i0.m88210o((C13948e) c);
                        if (o == null) {
                            throw new C13719a0("Unsupported superclass of " + this.this$0 + ": " + c);
                        } else if (C13706o.m87924a(this.this$1.mo71931e().getSuperclass(), o)) {
                            Type genericSuperclass = this.this$1.mo71931e().getGenericSuperclass();
                            C13706o.m87928e(genericSuperclass, "{\n                      …ass\n                    }");
                            return genericSuperclass;
                        } else {
                            Class[] interfaces = this.this$1.mo71931e().getInterfaces();
                            C13706o.m87928e(interfaces, "jClass.interfaces");
                            int K = C13596m.m87586K(interfaces, o);
                            if (K >= 0) {
                                Type type = this.this$1.mo71931e().getGenericInterfaces()[K];
                                C13706o.m87928e(type, "{\n                      …ex]\n                    }");
                                return type;
                            }
                            throw new C13719a0("No superclass of " + this.this$0 + " in Java reflection for " + c);
                        }
                    } else {
                        throw new C13719a0("Supertype not a class: " + c);
                    }
                }
            }

            @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "T", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
            /* renamed from: kotlin.reflect.jvm.internal.h$a$q$b */
            /* compiled from: KClassImpl.kt */
            static final class C13826b extends C13708q implements C16254a<Type> {

                /* renamed from: a */
                public static final C13826b f62044a = new C13826b();

                C13826b() {
                    super(0);
                }

                /* renamed from: a */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13824q(C13806h<T>.a aVar, C13806h<T> hVar) {
                super(0);
                this.this$0 = aVar;
                this.this$1 = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List<kotlin.reflect.jvm.internal.C15097x> invoke() {
                /*
                    r7 = this;
                    kotlin.reflect.jvm.internal.h<T>$a r0 = r7.this$0
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.mo72063k()
                    kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.mo62171j()
                    java.util.Collection r0 = r0.mo72370l()
                    java.lang.String r1 = "descriptor.typeConstructor.supertypes"
                    kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r0.size()
                    r1.<init>(r2)
                    kotlin.reflect.jvm.internal.h<T>$a r2 = r7.this$0
                    kotlin.reflect.jvm.internal.h<T> r3 = r7.this$1
                    java.util.Iterator r0 = r0.iterator()
                L_0x0024:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x0043
                    java.lang.Object r4 = r0.next()
                    kotlin.reflect.jvm.internal.impl.types.e0 r4 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r4
                    kotlin.reflect.jvm.internal.x r5 = new kotlin.reflect.jvm.internal.x
                    java.lang.String r6 = "kotlinType"
                    kotlin.jvm.internal.C13706o.m87928e(r4, r6)
                    kotlin.reflect.jvm.internal.h$a$q$a r6 = new kotlin.reflect.jvm.internal.h$a$q$a
                    r6.<init>(r4, r2, r3)
                    r5.<init>(r4, r6)
                    r1.add(r5)
                    goto L_0x0024
                L_0x0043:
                    kotlin.reflect.jvm.internal.h<T>$a r0 = r7.this$0
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.mo72063k()
                    boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88276t0(r0)
                    if (r0 != 0) goto L_0x00a7
                    boolean r0 = r1.isEmpty()
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0059
                L_0x0057:
                    r2 = 1
                    goto L_0x0088
                L_0x0059:
                    java.util.Iterator r0 = r1.iterator()
                L_0x005d:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x0057
                    java.lang.Object r4 = r0.next()
                    kotlin.reflect.jvm.internal.x r4 = (kotlin.reflect.jvm.internal.C15097x) r4
                    kotlin.reflect.jvm.internal.impl.types.e0 r4 = r4.mo74393l()
                    kotlin.reflect.jvm.internal.impl.descriptors.e r4 = kotlin.reflect.jvm.internal.impl.resolve.C14650d.m91618e(r4)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.mo62168h()
                    java.lang.String r5 = "getClassDescriptorForType(it.type).kind"
                    kotlin.jvm.internal.C13706o.m87928e(r4, r5)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.C13951f.INTERFACE
                    if (r4 == r5) goto L_0x0085
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.C13951f.ANNOTATION_CLASS
                    if (r4 != r5) goto L_0x0083
                    goto L_0x0085
                L_0x0083:
                    r4 = 0
                    goto L_0x0086
                L_0x0085:
                    r4 = 1
                L_0x0086:
                    if (r4 != 0) goto L_0x005d
                L_0x0088:
                    if (r2 == 0) goto L_0x00a7
                    kotlin.reflect.jvm.internal.x r0 = new kotlin.reflect.jvm.internal.x
                    kotlin.reflect.jvm.internal.h<T>$a r2 = r7.this$0
                    kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo72063k()
                    kotlin.reflect.jvm.internal.impl.builtins.h r2 = p389sb.C16519a.m98613f(r2)
                    kotlin.reflect.jvm.internal.impl.types.m0 r2 = r2.mo72136i()
                    java.lang.String r3 = "descriptor.builtIns.anyType"
                    kotlin.jvm.internal.C13706o.m87928e(r2, r3)
                    kotlin.reflect.jvm.internal.h$a$q$b r3 = kotlin.reflect.jvm.internal.C13806h.C13807a.C13824q.C13826b.f62044a
                    r0.<init>(r2, r3)
                    r1.add(r0)
                L_0x00a7:
                    java.util.List r0 = p272gc.C12338a.m83073c(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13806h.C13807a.C13824q.invoke():java.util.List");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/y;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/List;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.h$a$r */
        /* compiled from: KClassImpl.kt */
        static final class C13827r extends C13708q implements C16254a<List<? extends C15103y>> {
            final /* synthetic */ C13806h<T>.a this$0;
            final /* synthetic */ C13806h<T> this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13827r(C13806h<T>.a aVar, C13806h<T> hVar) {
                super(0);
                this.this$0 = aVar;
                this.this$1 = hVar;
            }

            /* renamed from: a */
            public final List<C15103y> invoke() {
                List<C13950e1> q = this.this$0.mo72063k().mo62178q();
                C13706o.m87928e(q, "descriptor.declaredTypeParameters");
                C13806h<T> hVar = this.this$1;
                ArrayList arrayList = new ArrayList(C13616u.m87774u(q, 10));
                for (C13950e1 e1Var : q) {
                    C13706o.m87928e(e1Var, "descriptor");
                    arrayList.add(new C15103y(hVar, e1Var));
                }
                return arrayList;
            }
        }

        static {
            Class<C13807a> cls = C13807a.class;
            f62024w = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "annotations", "getAnnotations()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "simpleName", "getSimpleName()Ljava/lang/String;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "constructors", "getConstructors()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "supertypes", "getSupertypes()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public C13807a() {
            super();
            this.f62025d = C13724c0.m87973d(new C13816i(C13806h.this));
            this.f62027f = C13724c0.m87973d(new C13823p(C13806h.this, this));
            this.f62028g = C13724c0.m87973d(new C13821n(C13806h.this));
            this.f62029h = C13724c0.m87973d(new C13812e(C13806h.this));
            this.f62030i = C13724c0.m87973d(new C13819l(this));
            this.f62031j = C13724c0.m87971b(new C13820m(this, C13806h.this));
            this.f62032k = C13724c0.m87973d(new C13827r(this, C13806h.this));
            this.f62033l = C13724c0.m87973d(new C13824q(this, C13806h.this));
            this.f62034m = C13724c0.m87973d(new C13822o(this));
            this.f62035n = C13724c0.m87973d(new C13814g(C13806h.this));
            this.f62036o = C13724c0.m87973d(new C13815h(C13806h.this));
            this.f62037p = C13724c0.m87973d(new C13817j(C13806h.this));
            this.f62038q = C13724c0.m87973d(new C13818k(C13806h.this));
            this.f62039r = C13724c0.m87973d(new C13809b(this));
            this.f62040s = C13724c0.m87973d(new C13810c(this));
            this.f62041t = C13724c0.m87973d(new C13813f(this));
            this.f62042u = C13724c0.m87973d(new C13808a(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m88134f(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C13706o.m87928e(simpleName, "name");
                return C15177w.m93654I0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C13706o.m87928e(simpleName, "name");
                return C15177w.m93654I0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
            }
            C13706o.m87928e(simpleName, "name");
            return C15177w.m93653H0(simpleName, '$', (String) null, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<C13792f<?>> m88135j() {
            Object b = this.f62036o.mo71982b(this, f62024w[11]);
            C13706o.m87928e(b, "<get-declaredStaticMembers>(...)");
            return (Collection) b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<C13792f<?>> m88136l() {
            Object b = this.f62037p.mo71982b(this, f62024w[12]);
            C13706o.m87928e(b, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final Collection<C13792f<?>> m88137m() {
            Object b = this.f62038q.mo71982b(this, f62024w[13]);
            C13706o.m87928e(b, "<get-inheritedStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: g */
        public final Collection<C13792f<?>> mo72060g() {
            Object b = this.f62039r.mo71982b(this, f62024w[14]);
            C13706o.m87928e(b, "<get-allNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: h */
        public final Collection<C13792f<?>> mo72061h() {
            Object b = this.f62040s.mo71982b(this, f62024w[15]);
            C13706o.m87928e(b, "<get-allStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: i */
        public final Collection<C13792f<?>> mo72062i() {
            Object b = this.f62035n.mo71982b(this, f62024w[10]);
            C13706o.m87928e(b, "<get-declaredNonStaticMembers>(...)");
            return (Collection) b;
        }

        /* renamed from: k */
        public final C13948e mo72063k() {
            Object b = this.f62025d.mo71982b(this, f62024w[0]);
            C13706o.m87928e(b, "<get-descriptor>(...)");
            return (C13948e) b;
        }

        /* renamed from: n */
        public final String mo72064n() {
            return (String) this.f62028g.mo71982b(this, f62024w[3]);
        }

        /* renamed from: o */
        public final String mo72065o() {
            return (String) this.f62027f.mo71982b(this, f62024w[2]);
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.h$b */
    /* compiled from: KClassImpl.kt */
    public /* synthetic */ class C13828b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62045a;

        static {
            int[] iArr = new int[C13359a.C13360a.values().length];
            iArr[C13359a.C13360a.FILE_FACADE.ordinal()] = 1;
            iArr[C13359a.C13360a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[C13359a.C13360a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[C13359a.C13360a.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[C13359a.C13360a.UNKNOWN.ordinal()] = 5;
            iArr[C13359a.C13360a.CLASS.ordinal()] = 6;
            f62045a = iArr;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e \u0004*\u000e\u0018\u00010\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"", "T", "Lkotlin/reflect/jvm/internal/h$a;", "Lkotlin/reflect/jvm/internal/h;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/h$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.h$c */
    /* compiled from: KClassImpl.kt */
    static final class C13829c extends C13708q implements C16254a<C13806h<T>.a> {
        final /* synthetic */ C13806h<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13829c(C13806h<T> hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final C13806h<T>.a invoke() {
            return new C13807a();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.h$d */
    /* compiled from: KClassImpl.kt */
    /* synthetic */ class C13830d extends C13703l implements C16269p<C14814w, C13494n, C14140t0> {

        /* renamed from: a */
        public static final C13830d f62046a = new C13830d();

        C13830d() {
            super(2);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14814w.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: l */
        public final C14140t0 invoke(C14814w wVar, C13494n nVar) {
            C13706o.m87929f(wVar, "p0");
            C13706o.m87929f(nVar, "p1");
            return wVar.mo74011l(nVar);
        }
    }

    public C13806h(Class<T> cls) {
        C13706o.m87929f(cls, "jClass");
        this.f62022f = cls;
        C13724c0.C13726b<C13806h<T>.a> b = C13724c0.m87971b(new C13829c(this));
        C13706o.m87928e(b, "lazy { Data() }");
        this.f62023g = b;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final C16151b m88116H() {
        return C13802f0.f62018a.mo72049c(mo71931e());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.mo67427b();
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void m88117M() {
        /*
            r4 = this;
            db.f$a r0 = p242db.C11995f.f58195c
            java.lang.Class r1 = r4.mo71931e()
            db.f r0 = r0.mo67435a(r1)
            if (r0 == 0) goto L_0x0017
            jb.a r0 = r0.mo67427b()
            if (r0 == 0) goto L_0x0017
            jb.a$a r0 = r0.mo70762c()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001c
            r1 = -1
            goto L_0x0024
        L_0x001c:
            int[] r1 = kotlin.reflect.jvm.internal.C13806h.C13828b.f62045a
            int r2 = r0.ordinal()
            r1 = r1[r2]
        L_0x0024:
            switch(r1) {
                case -1: goto L_0x008b;
                case 0: goto L_0x0027;
                case 1: goto L_0x0070;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x0055;
                case 5: goto L_0x002d;
                case 6: goto L_0x008b;
                default: goto L_0x0027;
            }
        L_0x0027:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x002d:
            kotlin.reflect.jvm.internal.a0 r1 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown class: "
            r2.append(r3)
            java.lang.Class r3 = r4.mo71931e()
            r2.append(r3)
            java.lang.String r3 = " (kind = "
            r2.append(r3)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0055:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo71931e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0070:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo71931e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            kotlin.reflect.jvm.internal.a0 r0 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unresolved class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo71931e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13806h.m88117M():java.lang.Void");
    }

    /* renamed from: I */
    public final C13724c0.C13726b<C13806h<T>.a> mo72053I() {
        return this.f62023g;
    }

    /* renamed from: J */
    public C13948e mo72054J() {
        return this.f62023g.invoke().mo72063k();
    }

    /* renamed from: K */
    public final C14692h mo72055K() {
        return mo72054J().mo72274p().mo72955n();
    }

    /* renamed from: L */
    public final C14692h mo72056L() {
        C14692h m0 = mo72054J().mo62176m0();
        C13706o.m87928e(m0, "descriptor.staticScope");
        return m0;
    }

    /* renamed from: d */
    public boolean mo71940d(Object obj) {
        Integer c = C14088d.m89399c(mo71931e());
        if (c != null) {
            return C13698j0.m87915o(obj, c.intValue());
        }
        Class<?> g = C14088d.m89403g(mo71931e());
        if (g == null) {
            g = mo71931e();
        }
        return g.isInstance(obj);
    }

    /* renamed from: e */
    public Class<T> mo71931e() {
        return this.f62022f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13806h) && C13706o.m87924a(C16147a.m96969c(this), C16147a.m96969c((C16875d) obj));
    }

    /* renamed from: g */
    public String mo71942g() {
        return this.f62023g.invoke().mo72064n();
    }

    public int hashCode() {
        return C16147a.m96969c(this).hashCode();
    }

    /* renamed from: j */
    public String mo71944j() {
        return this.f62023g.invoke().mo72065o();
    }

    /* renamed from: t */
    public Collection<C14052l> mo71977t() {
        C13948e J = mo72054J();
        if (J.mo62168h() == C13951f.INTERFACE || J.mo62168h() == C13951f.OBJECT) {
            return C13614t.m87748j();
        }
        Collection<C13944d> k = J.mo62173k();
        C13706o.m87928e(k, "descriptor.constructors");
        return k;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C16151b H = m88116H();
        C16152c h = H.mo78549h();
        C13706o.m87928e(h, "classId.packageFqName");
        if (h.mo78558d()) {
            str = "";
        } else {
            str = h.mo78556b() + FilenameUtils.EXTENSION_SEPARATOR;
        }
        String b = H.mo78551i().mo78556b();
        C13706o.m87928e(b, "classId.relativeClassName.asString()");
        sb.append(str + C15176v.m93629D(b, FilenameUtils.EXTENSION_SEPARATOR, '$', false, 4, (Object) null));
        return sb.toString();
    }

    /* renamed from: u */
    public Collection<C14154y> mo71978u(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        C14692h K = mo72055K();
        C12256d dVar = C12256d.FROM_REFLECTION;
        return C13566b0.m87442q0(K.mo72450c(fVar, dVar), mo72056L().mo72450c(fVar, dVar));
    }

    /* renamed from: v */
    public C14140t0 mo71979v(int i) {
        Class<?> declaringClass;
        if (!C13706o.m87924a(mo71931e().getSimpleName(), "DefaultImpls") || (declaringClass = mo71931e().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            C13948e J = mo72054J();
            C14730d dVar = J instanceof C14730d ? (C14730d) J : null;
            if (dVar == null) {
                return null;
            }
            C13455c b1 = dVar.mo73864b1();
            C14495h.C14502f<C13455c, List<C13494n>> fVar = C15766a.f65120j;
            C13706o.m87928e(fVar, "classLocalVariable");
            C13494n nVar = (C13494n) C15722e.m95027b(b1, fVar, i);
            if (nVar != null) {
                return (C14140t0) C13841i0.m88202g(mo71931e(), nVar, dVar.mo73863a1().mo73992g(), dVar.mo73863a1().mo73995j(), dVar.mo73865d1(), C13830d.f62046a);
            }
            return null;
        }
        C16875d<?> e = C16147a.m96971e(declaringClass);
        C13706o.m87927d(e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((C13806h) e).mo71979v(i);
    }

    /* renamed from: y */
    public Collection<C14140t0> mo71980y(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        C14692h K = mo72055K();
        C12256d dVar = C12256d.FROM_REFLECTION;
        return C13566b0.m87442q0(K.mo72451d(fVar, dVar), mo72056L().mo72451d(fVar, dVar));
    }
}
