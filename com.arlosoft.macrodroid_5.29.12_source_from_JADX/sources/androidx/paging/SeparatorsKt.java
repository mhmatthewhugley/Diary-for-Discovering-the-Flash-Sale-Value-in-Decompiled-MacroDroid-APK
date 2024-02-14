package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.flow.C15285f;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0002*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aK\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00112\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0017\u001az\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u0018\"\b\b\u0000\u0010\u0002*\u00028\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001a2.\u0010\u0006\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo71668d2 = {"", "R", "T", "Landroidx/paging/TransformablePage;", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "generator", "insertInternalSeparators", "(Landroidx/paging/TransformablePage;Lqa/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "separator", "", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndex", "separatorPage", "(Ljava/lang/Object;[III)Landroidx/paging/TransformablePage;", "", "Lja/u;", "addSeparatorPage", "(Ljava/util/List;Ljava/lang/Object;[III)V", "adjacentPageBefore", "adjacentPageAfter", "(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V", "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PageEvent;", "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", "insertEventSeparators", "(Lkotlinx/coroutines/flow/f;Landroidx/paging/TerminalSeparatorType;Lqa/q;)Lkotlinx/coroutines/flow/f;", "paging-common"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* compiled from: Separators.kt */
public final class SeparatorsKt {
    public static final <T> void addSeparatorPage(List<TransformablePage<T>> list, T t, int[] iArr, int i, int i2) {
        C13706o.m87929f(list, "<this>");
        C13706o.m87929f(iArr, "originalPageOffsets");
        if (t != null) {
            list.add(separatorPage(t, iArr, i, i2));
        }
    }

    public static final <T extends R, R> C15285f<PageEvent<R>> insertEventSeparators(C15285f<? extends PageEvent<T>> fVar, TerminalSeparatorType terminalSeparatorType, C16270q<? super T, ? super T, ? super C13635d<? super R>, ? extends Object> qVar) {
        C13706o.m87929f(fVar, "<this>");
        C13706o.m87929f(terminalSeparatorType, "terminalSeparatorType");
        C13706o.m87929f(qVar, "generator");
        return new SeparatorsKt$insertEventSeparators$$inlined$map$1(fVar, new SeparatorState(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(qVar, (C13635d<? super SeparatorsKt$insertEventSeparators$separatorState$1>) null)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R, T extends R> java.lang.Object insertInternalSeparators(androidx.paging.TransformablePage<T> r12, p370qa.C16270q<? super T, ? super T, ? super kotlin.coroutines.C13635d<? super R>, ? extends java.lang.Object> r13, kotlin.coroutines.C13635d<? super androidx.paging.TransformablePage<R>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.paging.SeparatorsKt$insertInternalSeparators$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.paging.SeparatorsKt$insertInternalSeparators$1 r0 = (androidx.paging.SeparatorsKt$insertInternalSeparators$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SeparatorsKt$insertInternalSeparators$1 r0 = new androidx.paging.SeparatorsKt$insertInternalSeparators$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 != r3) goto L_0x004a
            int r12 = r0.I$2
            int r13 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$4
            java.lang.Object r5 = r0.L$3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.L$2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.L$1
            qa.q r7 = (p370qa.C16270q) r7
            java.lang.Object r8 = r0.L$0
            androidx.paging.TransformablePage r8 = (androidx.paging.TransformablePage) r8
            p297ja.C13332o.m85685b(r14)
            r10 = r0
            r0 = r13
            r13 = r8
            r8 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r10
            goto L_0x00e3
        L_0x004a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0052:
            p297ja.C13332o.m85685b(r14)
            java.util.List r14 = r12.getData()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0060
            return r12
        L_0x0060:
            java.util.List r14 = r12.getData()
            int r14 = r14.size()
            int r14 = r14 + 4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r14)
            java.util.List r14 = r12.getData()
            java.lang.Object r14 = kotlin.collections.C13566b0.m87422W(r14)
            r2.add(r14)
            java.util.List r14 = r12.getHintOriginalIndices()
            r5 = 0
            if (r14 != 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            java.lang.Object r14 = kotlin.collections.C13566b0.m87422W(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 != 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            int r5 = r14.intValue()
        L_0x0094:
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r5)
            r4.add(r14)
            java.util.List r14 = r12.getData()
            int r14 = r14.size()
            if (r3 >= r14) goto L_0x0105
            r6 = r2
            r5 = r4
            r2 = r1
            r1 = r0
            r0 = r14
            r14 = r13
            r13 = r12
            r12 = 1
        L_0x00ad:
            int r4 = r12 + 1
            java.util.List r7 = r13.getData()
            java.lang.Object r7 = r7.get(r12)
            java.util.List r8 = r13.getData()
            int r9 = r12 + -1
            java.lang.Object r8 = r8.get(r9)
            r1.L$0 = r13
            r1.L$1 = r14
            r1.L$2 = r6
            r1.L$3 = r5
            r1.L$4 = r7
            r1.I$0 = r4
            r1.I$1 = r0
            r1.I$2 = r12
            r1.label = r3
            java.lang.Object r8 = r14.invoke(r8, r7, r1)
            if (r8 != r2) goto L_0x00da
            return r2
        L_0x00da:
            r10 = r7
            r7 = r14
            r14 = r8
            r8 = r6
            r6 = r5
            r5 = r10
            r11 = r4
            r4 = r2
            r2 = r11
        L_0x00e3:
            if (r14 == 0) goto L_0x00ef
            r8.add(r14)
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r12)
            r6.add(r14)
        L_0x00ef:
            r8.add(r5)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r12)
            r6.add(r12)
            if (r2 < r0) goto L_0x00ff
            r12 = r13
            r4 = r6
            r2 = r8
            goto L_0x0105
        L_0x00ff:
            r12 = r2
            r2 = r4
            r5 = r6
            r14 = r7
            r6 = r8
            goto L_0x00ad
        L_0x0105:
            int r13 = r2.size()
            java.util.List r14 = r12.getData()
            int r14 = r14.size()
            if (r13 != r14) goto L_0x0114
            goto L_0x0122
        L_0x0114:
            androidx.paging.TransformablePage r13 = new androidx.paging.TransformablePage
            int[] r14 = r12.getOriginalPageOffsets()
            int r12 = r12.getHintOriginalPageOffset()
            r13.<init>(r14, r2, r12, r4)
            r12 = r13
        L_0x0122:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.insertInternalSeparators(androidx.paging.TransformablePage, qa.q, kotlin.coroutines.d):java.lang.Object");
    }

    public static final <T> TransformablePage<T> separatorPage(T t, int[] iArr, int i, int i2) {
        C13706o.m87929f(t, "separator");
        C13706o.m87929f(iArr, "originalPageOffsets");
        return new TransformablePage<>(iArr, C13612s.m87736e(t), i, C13612s.m87736e(Integer.valueOf(i2)));
    }

    public static final <R, T extends R> void addSeparatorPage(List<TransformablePage<R>> list, R r, TransformablePage<T> transformablePage, TransformablePage<T> transformablePage2, int i, int i2) {
        C13706o.m87929f(list, "<this>");
        int[] iArr = null;
        int[] originalPageOffsets = transformablePage == null ? null : transformablePage.getOriginalPageOffsets();
        if (transformablePage2 != null) {
            iArr = transformablePage2.getOriginalPageOffsets();
        }
        if (originalPageOffsets != null && iArr != null) {
            originalPageOffsets = C13566b0.m87401E0(C13566b0.m87449x0(C13596m.m87630x(C13593l.m87567n(originalPageOffsets, iArr))));
        } else if (originalPageOffsets == null && iArr != null) {
            originalPageOffsets = iArr;
        } else if (originalPageOffsets == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        addSeparatorPage(list, r, originalPageOffsets, i, i2);
    }
}
