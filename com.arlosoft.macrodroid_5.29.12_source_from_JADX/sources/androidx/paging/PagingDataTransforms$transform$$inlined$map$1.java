package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13705n;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "Lja/u;", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: SafeCollector.common.kt */
public final class PagingDataTransforms$transform$$inlined$map$1 implements C15285f<PageEvent<R>> {
    final /* synthetic */ C15285f $this_unsafeTransform$inlined;
    final /* synthetic */ C16269p $transform$inlined;

    public PagingDataTransforms$transform$$inlined$map$1(C15285f fVar, C16269p pVar) {
        this.$this_unsafeTransform$inlined = fVar;
        this.$transform$inlined = pVar;
    }

    public Object collect(final C15288g gVar, C13635d dVar) {
        C15285f fVar = this.$this_unsafeTransform$inlined;
        final C16269p pVar = this.$transform$inlined;
        Object collect = fVar.collect(new C15288g<PageEvent<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.C13635d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.C09421
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1 r0 = (androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.C09421) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1 r0 = new androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    p297ja.C13332o.m85685b(r8)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
                    p297ja.C13332o.m85685b(r8)
                    goto L_0x0053
                L_0x003c:
                    p297ja.C13332o.m85685b(r8)
                    kotlinx.coroutines.flow.g r8 = r4
                    androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                    qa.p r2 = r2
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    ja.u r7 = p297ja.C13339u.f61331a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }

            public Object emit$$forInline(Object obj, C13635d dVar) {
                C13705n.m87923c(4);
                new C13656d(this, dVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C09412 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit((Object) null, this);
                    }
                };
                C13705n.m87923c(5);
                C15288g gVar = r4;
                Object invoke = r2.invoke((PageEvent) obj, dVar);
                C13705n.m87923c(0);
                gVar.emit(invoke, dVar);
                C13705n.m87923c(1);
                return C13339u.f61331a;
            }
        }, dVar);
        if (collect == C13652d.m87832c()) {
            return collect;
        }
        return C13339u.f61331a;
    }

    public Object collect$$forInline(final C15288g gVar, C13635d dVar) {
        C13705n.m87923c(4);
        new C13656d(this, dVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ PagingDataTransforms$transform$$inlined$map$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C15288g) null, this);
            }
        };
        C13705n.m87923c(5);
        C15285f fVar = this.$this_unsafeTransform$inlined;
        final C16269p pVar = this.$transform$inlined;
        C09412 r1 = new C15288g<PageEvent<T>>() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.C13635d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.C09421
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1 r0 = (androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.C09421) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1 r0 = new androidx.paging.PagingDataTransforms$transform$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    p297ja.C13332o.m85685b(r8)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.C15288g) r7
                    p297ja.C13332o.m85685b(r8)
                    goto L_0x0053
                L_0x003c:
                    p297ja.C13332o.m85685b(r8)
                    kotlinx.coroutines.flow.g r8 = r4
                    androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                    qa.p r2 = r2
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    ja.u r7 = p297ja.C13339u.f61331a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataTransforms$transform$$inlined$map$1.C09412.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }

            public Object emit$$forInline(Object obj, C13635d dVar) {
                C13705n.m87923c(4);
                new C13656d(this, dVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C09412 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit((Object) null, this);
                    }
                };
                C13705n.m87923c(5);
                C15288g gVar = gVar;
                Object invoke = pVar.invoke((PageEvent) obj, dVar);
                C13705n.m87923c(0);
                gVar.emit(invoke, dVar);
                C13705n.m87923c(1);
                return C13339u.f61331a;
            }
        };
        C13705n.m87923c(0);
        fVar.collect(r1, dVar);
        C13705n.m87923c(1);
        return C13339u.f61331a;
    }
}
