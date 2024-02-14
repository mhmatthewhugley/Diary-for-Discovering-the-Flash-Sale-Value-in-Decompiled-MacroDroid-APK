package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\b\u0004\u0010\u0007\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aZ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0007\u001a`\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\b\u001aN\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\fH\u0007\u001aP\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001a>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\fH\u0007\u001ap\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122.\u0010\u0015\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a^\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u001e\u0010\u0015\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007\u001a;\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo71668d2 = {"", "T", "R", "Landroidx/paging/PagingData;", "Lkotlin/Function2;", "Landroidx/paging/PageEvent;", "Lkotlin/coroutines/d;", "transform", "(Landroidx/paging/PagingData;Lqa/p;)Landroidx/paging/PagingData;", "map", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function1;", "", "flatMap", "", "predicate", "filter", "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", "Lkotlin/Function3;", "generator", "insertSeparators", "(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Lqa/q;)Landroidx/paging/PagingData;", "item", "insertHeaderItem", "(Landroidx/paging/PagingData;Landroidx/paging/TerminalSeparatorType;Ljava/lang/Object;)Landroidx/paging/PagingData;", "insertFooterItem", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: PagingDataTransforms.kt */
public final class PagingDataTransforms {
    @CheckResult
    public static final /* synthetic */ PagingData filter(PagingData pagingData, C16269p pVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(pVar, "predicate");
        return new PagingData(new PagingDataTransforms$filter$$inlined$transform$1(pagingData.getFlow$paging_common(), pVar), pagingData.getReceiver$paging_common());
    }

    @CheckResult
    public static final /* synthetic */ PagingData flatMap(PagingData pagingData, C16269p pVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(pVar, "transform");
        return new PagingData(new PagingDataTransforms$flatMap$$inlined$transform$1(pagingData.getFlow$paging_common(), pVar), pagingData.getReceiver$paging_common());
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(terminalSeparatorType, "terminalSeparatorType");
        C13706o.m87929f(t, "item");
        return insertSeparators((PagingData) pagingData, terminalSeparatorType, (C16270q) new PagingDataTransforms$insertFooterItem$1(t, (C13635d<? super PagingDataTransforms$insertFooterItem$1>) null));
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, T t) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(t, "item");
        return insertFooterItem$default(pagingData, (TerminalSeparatorType) null, t, 1, (Object) null);
    }

    public static /* synthetic */ PagingData insertFooterItem$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertFooterItem(pagingData, terminalSeparatorType, obj);
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(terminalSeparatorType, "terminalSeparatorType");
        C13706o.m87929f(t, "item");
        return insertSeparators((PagingData) pagingData, terminalSeparatorType, (C16270q) new PagingDataTransforms$insertHeaderItem$1(t, (C13635d<? super PagingDataTransforms$insertHeaderItem$1>) null));
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, T t) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(t, "item");
        return insertHeaderItem$default(pagingData, (TerminalSeparatorType) null, t, 1, (Object) null);
    }

    public static /* synthetic */ PagingData insertHeaderItem$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertHeaderItem(pagingData, terminalSeparatorType, obj);
    }

    @CheckResult
    public static final /* synthetic */ PagingData insertSeparators(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, C16270q qVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(terminalSeparatorType, "terminalSeparatorType");
        C13706o.m87929f(qVar, "generator");
        return new PagingData(SeparatorsKt.insertEventSeparators(pagingData.getFlow$paging_common(), terminalSeparatorType, qVar), pagingData.getReceiver$paging_common());
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, C16269p<? super T, ? super T, ? extends R> pVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(pVar, "generator");
        return insertSeparators$default(pagingData, (TerminalSeparatorType) null, executor, pVar, 1, (Object) null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, C16270q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertSeparators(pagingData, terminalSeparatorType, qVar);
    }

    @CheckResult
    public static final /* synthetic */ PagingData map(PagingData pagingData, C16269p pVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(pVar, "transform");
        return new PagingData(new PagingDataTransforms$map$$inlined$transform$1(pagingData.getFlow$paging_common(), pVar), pagingData.getReceiver$paging_common());
    }

    private static final <T, R> PagingData<R> transform(PagingData<T> pagingData, C16269p<? super PageEvent<T>, ? super C13635d<? super PageEvent<R>>, ? extends Object> pVar) {
        return new PagingData<>(new PagingDataTransforms$transform$$inlined$map$1(pagingData.getFlow$paging_common(), pVar), pagingData.getReceiver$paging_common());
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, C16269p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertSeparators(pagingData, terminalSeparatorType, executor, pVar);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, C16269p<? super T, ? super T, ? extends R> pVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(terminalSeparatorType, "terminalSeparatorType");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(pVar, "generator");
        return insertSeparators((PagingData) pagingData, terminalSeparatorType, (C16270q) new PagingDataTransforms$insertSeparators$1(executor, pVar, (C13635d<? super PagingDataTransforms$insertSeparators$1>) null));
    }

    @CheckResult
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, Executor executor, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(lVar, "predicate");
        return new PagingData<>(new PagingDataTransforms$filter$$inlined$transform$2(pagingData.getFlow$paging_common(), executor, lVar), pagingData.getReceiver$paging_common());
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, Executor executor, C16265l<? super T, ? extends Iterable<? extends R>> lVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(lVar, "transform");
        return new PagingData<>(new PagingDataTransforms$flatMap$$inlined$transform$2(pagingData.getFlow$paging_common(), executor, lVar), pagingData.getReceiver$paging_common());
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, Executor executor, C16265l<? super T, ? extends R> lVar) {
        C13706o.m87929f(pagingData, "<this>");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(lVar, "transform");
        return new PagingData<>(new PagingDataTransforms$map$$inlined$transform$2(pagingData.getFlow$paging_common(), executor, lVar), pagingData.getReceiver$paging_common());
    }
}
