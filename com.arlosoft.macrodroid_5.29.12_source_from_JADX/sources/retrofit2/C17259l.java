package retrofit2;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15492n;
import kotlinx.coroutines.C15497o;
import org.apache.commons.p353io.FilenameUtils;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo71668d2 = {"", "T", "Lretrofit2/b;", "a", "(Lretrofit2/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lretrofit2/s;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "d", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: retrofit2.l */
/* compiled from: KotlinExtensions.kt */
public final class C17259l {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"", "T", "", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$a */
    /* compiled from: KotlinExtensions.kt */
    static final class C17260a extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C17236b $this_await$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17260a(C17236b bVar) {
            super(1);
            this.$this_await$inlined = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.$this_await$inlined.cancel();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"", "T", "", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$b */
    /* compiled from: KotlinExtensions.kt */
    static final class C17261b extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C17236b $this_await$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17261b(C17236b bVar) {
            super(1);
            this.$this_await$inlined = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.$this_await$inlined.cancel();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo71668d2 = {"retrofit2/l$c", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lja/u;", "b", "", "t", "a", "retrofit"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$c */
    /* compiled from: KotlinExtensions.kt */
    public static final class C17262c implements C17239d<T> {

        /* renamed from: a */
        final /* synthetic */ C15492n f68828a;

        C17262c(C15492n nVar) {
            this.f68828a = nVar;
        }

        /* renamed from: a */
        public void mo80374a(C17236b<T> bVar, Throwable th) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(th, "t");
            C15492n nVar = this.f68828a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
        }

        /* renamed from: b */
        public void mo80375b(C17236b<T> bVar, C17300s<T> sVar) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(sVar, "response");
            if (sVar.mo80595e()) {
                T a = sVar.mo80592a();
                if (a == null) {
                    Object i = bVar.mo80539m().mo75919i(C17258k.class);
                    if (i == null) {
                        C13706o.m87939p();
                    }
                    C13706o.m87925b(i, "call.request().tag(Invocation::class.java)!!");
                    Method a2 = ((C17258k) i).mo80551a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    C13706o.m87925b(a2, "method");
                    Class<?> declaringClass = a2.getDeclaringClass();
                    C13706o.m87925b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    sb.append(a2.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                    C15492n nVar = this.f68828a;
                    C13329n.C13330a aVar = C13329n.f61327a;
                    nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(kotlinNullPointerException)));
                    return;
                }
                C15492n nVar2 = this.f68828a;
                C13329n.C13330a aVar2 = C13329n.f61327a;
                nVar2.resumeWith(C13329n.m85676a(a));
                return;
            }
            C15492n nVar3 = this.f68828a;
            HttpException httpException = new HttpException(sVar);
            C13329n.C13330a aVar3 = C13329n.f61327a;
            nVar3.resumeWith(C13329n.m85676a(C13332o.m85684a(httpException)));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo71668d2 = {"retrofit2/l$d", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lja/u;", "b", "", "t", "a", "retrofit"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$d */
    /* compiled from: KotlinExtensions.kt */
    public static final class C17263d implements C17239d<T> {

        /* renamed from: a */
        final /* synthetic */ C15492n f68829a;

        C17263d(C15492n nVar) {
            this.f68829a = nVar;
        }

        /* renamed from: a */
        public void mo80374a(C17236b<T> bVar, Throwable th) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(th, "t");
            C15492n nVar = this.f68829a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
        }

        /* renamed from: b */
        public void mo80375b(C17236b<T> bVar, C17300s<T> sVar) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(sVar, "response");
            if (sVar.mo80595e()) {
                C15492n nVar = this.f68829a;
                T a = sVar.mo80592a();
                C13329n.C13330a aVar = C13329n.f61327a;
                nVar.resumeWith(C13329n.m85676a(a));
                return;
            }
            C15492n nVar2 = this.f68829a;
            HttpException httpException = new HttpException(sVar);
            C13329n.C13330a aVar2 = C13329n.f61327a;
            nVar2.resumeWith(C13329n.m85676a(C13332o.m85684a(httpException)));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"T", "L;", "it", "Lja/u;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$e */
    /* compiled from: KotlinExtensions.kt */
    static final class C17264e extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C17236b $this_awaitResponse$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17264e(C17236b bVar) {
            super(1);
            this.$this_awaitResponse$inlined = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.$this_awaitResponse$inlined.cancel();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo71668d2 = {"retrofit2/l$f", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lja/u;", "b", "", "t", "a", "retrofit"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$f */
    /* compiled from: KotlinExtensions.kt */
    public static final class C17265f implements C17239d<T> {

        /* renamed from: a */
        final /* synthetic */ C15492n f68830a;

        C17265f(C15492n nVar) {
            this.f68830a = nVar;
        }

        /* renamed from: a */
        public void mo80374a(C17236b<T> bVar, Throwable th) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(th, "t");
            C15492n nVar = this.f68830a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
        }

        /* renamed from: b */
        public void mo80375b(C17236b<T> bVar, C17300s<T> sVar) {
            C13706o.m87930g(bVar, NotificationCompat.CATEGORY_CALL);
            C13706o.m87930g(sVar, "response");
            C15492n nVar = this.f68830a;
            C13329n.C13330a aVar = C13329n.f61327a;
            nVar.resumeWith(C13329n.m85676a(sVar));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo71668d2 = {"Lja/u;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: retrofit2.l$g */
    /* compiled from: KotlinExtensions.kt */
    static final class C17266g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C13635d f68831a;

        /* renamed from: c */
        final /* synthetic */ Exception f68832c;

        C17266g(C13635d dVar, Exception exc) {
            this.f68831a = dVar;
            this.f68832c = exc;
        }

        public final void run() {
            C13635d b = C13649c.m87831b(this.f68831a);
            Exception exc = this.f68832c;
            C13329n.C13330a aVar = C13329n.f61327a;
            b.resumeWith(C13329n.m85676a(C13332o.m85684a(exc)));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo71668d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/coroutines/d;", "", "continuation", "", "suspendAndThrow"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    @C13658f(mo71893c = "retrofit2.KotlinExtensions", mo71894f = "KotlinExtensions.kt", mo71895l = {113}, mo71896m = "suspendAndThrow")
    /* renamed from: retrofit2.l$h */
    /* compiled from: KotlinExtensions.kt */
    static final class C17267h extends C13656d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C17267h(C13635d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C17259l.m100886d((Exception) null, this);
        }
    }

    /* renamed from: a */
    public static final <T> Object m100883a(C17236b<T> bVar, C13635d<? super T> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74843d(new C17260a(bVar));
        bVar.mo80540q0(new C17262c(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* renamed from: b */
    public static final <T> Object m100884b(C17236b<T> bVar, C13635d<? super T> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74843d(new C17261b(bVar));
        bVar.mo80540q0(new C17263d(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* renamed from: c */
    public static final <T> Object m100885c(C17236b<T> bVar, C13635d<? super C17300s<T>> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74843d(new C17264e(bVar));
        bVar.mo80540q0(new C17265f(oVar));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m100886d(java.lang.Exception r4, kotlin.coroutines.C13635d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.C17259l.C17267h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.l$h r0 = (retrofit2.C17259l.C17267h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.l$h r0 = new retrofit2.l$h
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            p297ja.C13332o.m85685b(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p297ja.C13332o.m85685b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.h0 r5 = kotlinx.coroutines.C15186a1.m93729a()
            kotlin.coroutines.g r2 = r0.getContext()
            retrofit2.l$g r3 = new retrofit2.l$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.C13660h.m87847c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            ja.u r4 = p297ja.C13339u.f61331a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C17259l.m100886d(java.lang.Exception, kotlin.coroutines.d):java.lang.Object");
    }
}
