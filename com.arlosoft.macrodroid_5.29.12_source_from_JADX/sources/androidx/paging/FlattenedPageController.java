package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.sync.C15536b;
import kotlinx.coroutines.sync.C15544d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\tH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo71668d2 = {"Landroidx/paging/FlattenedPageController;", "", "T", "Lkotlin/collections/k0;", "Landroidx/paging/PageEvent;", "event", "Lja/u;", "record", "(Lkotlin/collections/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getStateAsEvents", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/FlattenedPageEventStorage;", "list", "Landroidx/paging/FlattenedPageEventStorage;", "Lkotlinx/coroutines/sync/b;", "lock", "Lkotlinx/coroutines/sync/b;", "", "maxEventIndex", "I", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: CachedPageEventFlow.kt */
final class FlattenedPageController<T> {
    private final FlattenedPageEventStorage<T> list = new FlattenedPageEventStorage<>();
    private final C15536b lock = C15544d.m94682b(false, 1, (Object) null);
    private int maxEventIndex = -1;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getStateAsEvents(kotlin.coroutines.C13635d<? super java.util.List<? extends kotlin.collections.C13592k0<? extends androidx.paging.PageEvent<T>>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.C15536b) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            p297ja.C13332o.m85685b(r9)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            p297ja.C13332o.m85685b(r9)
            kotlinx.coroutines.sync.b r9 = r8.lock
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r0 = r9.mo74906a(r3, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r8
            r1 = r9
        L_0x004e:
            androidx.paging.FlattenedPageEventStorage<T> r9 = r0.list     // Catch:{ all -> 0x008e }
            java.util.List r9 = r9.getAsEvents()     // Catch:{ all -> 0x008e }
            int r0 = r0.maxEventIndex     // Catch:{ all -> 0x008e }
            int r2 = r9.size()     // Catch:{ all -> 0x008e }
            int r0 = r0 - r2
            int r0 = r0 + r4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r4 = 10
            int r4 = kotlin.collections.C13616u.m87774u(r9, r4)     // Catch:{ all -> 0x008e }
            r2.<init>(r4)     // Catch:{ all -> 0x008e }
            r4 = 0
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x008e }
        L_0x006c:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x008e }
            int r6 = r4 + 1
            if (r4 >= 0) goto L_0x007d
            kotlin.collections.C13614t.m87758t()     // Catch:{ all -> 0x008e }
        L_0x007d:
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5     // Catch:{ all -> 0x008e }
            kotlin.collections.k0 r7 = new kotlin.collections.k0     // Catch:{ all -> 0x008e }
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch:{ all -> 0x008e }
            r2.add(r7)     // Catch:{ all -> 0x008e }
            r4 = r6
            goto L_0x006c
        L_0x008a:
            r1.mo74907b(r3)
            return r2
        L_0x008e:
            r9 = move-exception
            r1.mo74907b(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.getStateAsEvents(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object record(kotlin.collections.C13592k0<? extends androidx.paging.PageEvent<T>> r6, kotlin.coroutines.C13635d<? super p297ja.C13339u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.sync.b r6 = (kotlinx.coroutines.sync.C15536b) r6
            java.lang.Object r1 = r0.L$1
            kotlin.collections.k0 r1 = (kotlin.collections.C13592k0) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            p297ja.C13332o.m85685b(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            p297ja.C13332o.m85685b(r7)
            kotlinx.coroutines.sync.b r7 = r5.lock
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r0 = r7.mo74906a(r3, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            int r1 = r6.mo71844c()     // Catch:{ all -> 0x006c }
            r0.maxEventIndex = r1     // Catch:{ all -> 0x006c }
            androidx.paging.FlattenedPageEventStorage<T> r0 = r0.list     // Catch:{ all -> 0x006c }
            java.lang.Object r6 = r6.mo71845d()     // Catch:{ all -> 0x006c }
            androidx.paging.PageEvent r6 = (androidx.paging.PageEvent) r6     // Catch:{ all -> 0x006c }
            r0.add(r6)     // Catch:{ all -> 0x006c }
            ja.u r6 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x006c }
            r7.mo74907b(r3)
            return r6
        L_0x006c:
            r6 = move-exception
            r7.mo74907b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.record(kotlin.collections.k0, kotlin.coroutines.d):java.lang.Object");
    }
}
