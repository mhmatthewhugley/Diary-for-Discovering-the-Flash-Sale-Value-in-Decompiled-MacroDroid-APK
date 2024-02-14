package androidx.paging;

import androidx.core.app.NotificationCompat;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p370qa.C16270q;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001BB\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012.\u0010H\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000G\u0012\u0006\u0012\u0004\u0018\u00010\u00010Fø\u0001\u0000¢\u0006\u0004\bL\u0010MJ&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0002\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0002J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00010\u000bJ\"\u0010\u0010\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\"\u0010\u0011\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u0002068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\"\u0010@\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\"\u0010C\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&RB\u0010H\u001a*\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000G\u0012\u0006\u0012\u0004\u0018\u00010\u00010F8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, mo71668d2 = {"Landroidx/paging/SeparatorState;", "", "R", "T", "Landroidx/paging/TransformablePage;", "originalPage", "transformablePageToStash", "Landroidx/paging/PageEvent;", "event", "onEvent", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$Insert;", "asRType", "Landroidx/paging/TerminalSeparatorType;", "terminalSeparatorType", "", "terminatesStart", "terminatesEnd", "onInsert", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/PageEvent$Drop;", "onDrop", "Landroidx/paging/PageEvent$LoadStateUpdate;", "onLoadStateUpdate", "(Landroidx/paging/PageEvent$LoadStateUpdate;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/TerminalSeparatorType;", "getTerminalSeparatorType", "()Landroidx/paging/TerminalSeparatorType;", "", "pageStash", "Ljava/util/List;", "getPageStash", "()Ljava/util/List;", "endTerminalSeparatorDeferred", "Z", "getEndTerminalSeparatorDeferred", "()Z", "setEndTerminalSeparatorDeferred", "(Z)V", "startTerminalSeparatorDeferred", "getStartTerminalSeparatorDeferred", "setStartTerminalSeparatorDeferred", "Landroidx/paging/MutableLoadStateCollection;", "sourceStates", "Landroidx/paging/MutableLoadStateCollection;", "getSourceStates", "()Landroidx/paging/MutableLoadStateCollection;", "Landroidx/paging/LoadStates;", "mediatorStates", "Landroidx/paging/LoadStates;", "getMediatorStates", "()Landroidx/paging/LoadStates;", "setMediatorStates", "(Landroidx/paging/LoadStates;)V", "", "placeholdersBefore", "I", "getPlaceholdersBefore", "()I", "setPlaceholdersBefore", "(I)V", "placeholdersAfter", "getPlaceholdersAfter", "setPlaceholdersAfter", "footerAdded", "getFooterAdded", "setFooterAdded", "headerAdded", "getHeaderAdded", "setHeaderAdded", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "generator", "Lqa/q;", "getGenerator", "()Lqa/q;", "<init>", "(Landroidx/paging/TerminalSeparatorType;Lqa/q;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: Separators.kt */
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;
    private final C16270q<T, T, C13635d<? super R>, Object> generator;
    private boolean headerAdded;
    private LoadStates mediatorStates;
    private final List<TransformablePage<T>> pageStash = new ArrayList();
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final MutableLoadStateCollection sourceStates = new MutableLoadStateCollection();
    private boolean startTerminalSeparatorDeferred;
    private final TerminalSeparatorType terminalSeparatorType;

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: Separators.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            iArr[TerminalSeparatorType.FULLY_COMPLETE.ordinal()] = 1;
            iArr[TerminalSeparatorType.SOURCE_COMPLETE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SeparatorState(TerminalSeparatorType terminalSeparatorType2, C16270q<? super T, ? super T, ? super C13635d<? super R>, ? extends Object> qVar) {
        C13706o.m87929f(terminalSeparatorType2, "terminalSeparatorType");
        C13706o.m87929f(qVar, "generator");
        this.terminalSeparatorType = terminalSeparatorType2;
        this.generator = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        r7 = (java.lang.Integer) kotlin.collections.C13566b0.m87422W(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> androidx.paging.TransformablePage<T> transformablePageToStash(androidx.paging.TransformablePage<T> r9) {
        /*
            r8 = this;
            androidx.paging.TransformablePage r0 = new androidx.paging.TransformablePage
            int[] r1 = r9.getOriginalPageOffsets()
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.util.List r4 = r9.getData()
            java.lang.Object r4 = kotlin.collections.C13566b0.m87422W(r4)
            r5 = 0
            r3[r5] = r4
            java.util.List r4 = r9.getData()
            java.lang.Object r4 = kotlin.collections.C13566b0.m87434i0(r4)
            r6 = 1
            r3[r6] = r4
            java.util.List r3 = kotlin.collections.C13614t.m87751m(r3)
            int r4 = r9.getHintOriginalPageOffset()
            java.lang.Integer[] r2 = new java.lang.Integer[r2]
            java.util.List r7 = r9.getHintOriginalIndices()
            if (r7 != 0) goto L_0x0031
        L_0x002f:
            r7 = 0
            goto L_0x003e
        L_0x0031:
            java.lang.Object r7 = kotlin.collections.C13566b0.m87422W(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            int r7 = r7.intValue()
        L_0x003e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            java.util.List r5 = r9.getHintOriginalIndices()
            if (r5 != 0) goto L_0x004c
            r5 = 0
            goto L_0x0052
        L_0x004c:
            java.lang.Object r5 = kotlin.collections.C13566b0.m87434i0(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x0052:
            if (r5 != 0) goto L_0x005d
            java.util.List r9 = r9.getData()
            int r9 = kotlin.collections.C13614t.m87750l(r9)
            goto L_0x0061
        L_0x005d:
            int r9 = r5.intValue()
        L_0x0061:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r6] = r9
            java.util.List r9 = kotlin.collections.C13614t.m87751m(r2)
            r0.<init>(r1, r3, r4, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.transformablePageToStash(androidx.paging.TransformablePage):androidx.paging.TransformablePage");
    }

    public final PageEvent.Insert<R> asRType(PageEvent.Insert<T> insert) {
        C13706o.m87929f(insert, "<this>");
        return insert;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    public final C16270q<T, T, C13635d<? super R>, Object> getGenerator() {
        return this.generator;
    }

    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    public final LoadStates getMediatorStates() {
        return this.mediatorStates;
    }

    public final List<TransformablePage<T>> getPageStash() {
        return this.pageStash;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final MutableLoadStateCollection getSourceStates() {
        return this.sourceStates;
    }

    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    public final TerminalSeparatorType getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    public final PageEvent.Drop<R> onDrop(PageEvent.Drop<T> drop) {
        C13706o.m87929f(drop, NotificationCompat.CATEGORY_EVENT);
        this.sourceStates.set(drop.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
        LoadType loadType = drop.getLoadType();
        LoadType loadType2 = LoadType.PREPEND;
        if (loadType == loadType2) {
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            this.headerAdded = false;
        } else if (drop.getLoadType() == LoadType.APPEND) {
            this.placeholdersAfter = drop.getPlaceholdersRemaining();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (drop.getLoadType() == loadType2) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        boolean unused = C13624y.m87795D(this.pageStash, new SeparatorState$onDrop$1(new C16788e(drop.getMinPageOffset(), drop.getMaxPageOffset())));
        return drop;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onEvent(androidx.paging.PageEvent<T> r6, kotlin.coroutines.C13635d<? super androidx.paging.PageEvent<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SeparatorState$onEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SeparatorState$onEvent$1 r0 = (androidx.paging.SeparatorState$onEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SeparatorState$onEvent$1 r0 = new androidx.paging.SeparatorState$onEvent$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$0
            androidx.paging.SeparatorState r6 = (androidx.paging.SeparatorState) r6
            p297ja.C13332o.m85685b(r7)
            goto L_0x0076
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.L$0
            androidx.paging.SeparatorState r6 = (androidx.paging.SeparatorState) r6
            p297ja.C13332o.m85685b(r7)
            goto L_0x0055
        L_0x0040:
            p297ja.C13332o.m85685b(r7)
            boolean r7 = r6 instanceof androidx.paging.PageEvent.Insert
            if (r7 == 0) goto L_0x0058
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent.Insert) r6
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r5.onInsert(r6, r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r5
        L_0x0055:
            androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
            goto L_0x0078
        L_0x0058:
            boolean r7 = r6 instanceof androidx.paging.PageEvent.Drop
            if (r7 == 0) goto L_0x0064
            androidx.paging.PageEvent$Drop r6 = (androidx.paging.PageEvent.Drop) r6
            androidx.paging.PageEvent$Drop r7 = r5.onDrop(r6)
            r6 = r5
            goto L_0x0078
        L_0x0064:
            boolean r7 = r6 instanceof androidx.paging.PageEvent.LoadStateUpdate
            if (r7 == 0) goto L_0x00b3
            androidx.paging.PageEvent$LoadStateUpdate r6 = (androidx.paging.PageEvent.LoadStateUpdate) r6
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r5.onLoadStateUpdate(r6, r0)
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r5
        L_0x0076:
            androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
        L_0x0078:
            boolean r0 = r6.getEndTerminalSeparatorDeferred()
            if (r0 == 0) goto L_0x0095
            java.util.List r0 = r6.getPageStash()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred endTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0095:
            boolean r0 = r6.getStartTerminalSeparatorDeferred()
            if (r0 == 0) goto L_0x00b2
            java.util.List r6 = r6.getPageStash()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a6
            goto L_0x00b2
        L_0x00a6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred startTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00b2:
            return r7
        L_0x00b3:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onEvent(androidx.paging.PageEvent, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: androidx.paging.TransformablePage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v27, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x042a, code lost:
        r9 = r8.getHintOriginalPageOffset();
        r10 = r8.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0433, code lost:
        if (r10 != null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0435, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0437, code lost:
        r10 = (java.lang.Integer) kotlin.collections.C13566b0.m87422W(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x043d, code lost:
        if (r10 != null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0440, code lost:
        r10 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0444, code lost:
        androidx.paging.SeparatorsKt.addSeparatorPage(r5, r6, (androidx.paging.TransformablePage) null, r8, r9, r10);
        r6 = r1;
        r5 = r2;
        r10 = r12;
        r9 = r13;
        r8 = r15;
        r12 = r18;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0454, code lost:
        if (r6 != 0) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0456, code lost:
        kotlin.jvm.internal.C13706o.m87926c(r9);
        r1 = r9.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x045d, code lost:
        if (r1 <= 0) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x045f, code lost:
        r2 = r1;
        r13 = r12;
        r15 = r14;
        r1 = r20;
        r12 = r8;
        r8 = r7;
        r7 = r5;
        r5 = r4;
        r4 = 0;
        r29 = r11;
        r11 = r9;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x046e, code lost:
        r14 = r4 + 1;
        r4 = r1.getGenerator();
        r3.L$0 = r1;
        r3.L$1 = r15;
        r3.L$2 = r8;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r10;
        r3.L$7 = r9;
        r3.L$8 = r8;
        r32 = r1;
        r3.L$9 = null;
        r3.Z$0 = r7;
        r3.I$0 = r6;
        r3.I$1 = r14;
        r3.I$2 = r2;
        r3.label = 3;
        r0 = androidx.paging.SeparatorsKt.insertInternalSeparators(r15.getPages().get(r4), r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04a4, code lost:
        if (r0 != r5) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04a6, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x04a7, code lost:
        r1 = r32;
        r4 = r14;
        r14 = r8;
        r29 = r2;
        r2 = r0;
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x04b0, code lost:
        r8.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04b3, code lost:
        if (r4 < r0) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x04b5, code lost:
        r4 = r5;
        r5 = r7;
        r7 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
        r13 = r15;
        r14 = r1;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04c1, code lost:
        r2 = r0;
        r8 = r14;
        r0 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04c6, code lost:
        r1 = r6;
        r13 = r14;
        r14 = r20;
        r29 = r12;
        r12 = r7;
        r7 = r11;
        r11 = r29;
        r30 = r10;
        r10 = r8;
        r8 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        r9 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04db, code lost:
        if (r13.getLoadType() != androidx.paging.LoadType.APPEND) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04e7, code lost:
        if ((!r14.getPageStash().isEmpty()) == false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04e9, code lost:
        r6 = kotlin.collections.C13566b0.m87434i0(r14.getPageStash());
        r0 = r14.getGenerator();
        r2 = kotlin.collections.C13566b0.m87434i0(r6.getData());
        kotlin.jvm.internal.C13706o.m87926c(r10);
        r15 = kotlin.collections.C13566b0.m87422W(r10.getData());
        r3.L$0 = r14;
        r3.L$1 = r13;
        r3.L$2 = r12;
        r3.L$3 = r11;
        r3.L$4 = r10;
        r3.L$5 = r9;
        r3.L$6 = r8;
        r3.L$7 = r7;
        r3.L$8 = r6;
        r32 = r6;
        r3.L$9 = null;
        r3.Z$0 = r5;
        r3.I$0 = r1;
        r3.label = 4;
        r2 = r0.invoke(r2, r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x052d, code lost:
        if (r2 != r4) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x052f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0530, code lost:
        r0 = r3;
        r15 = r12;
        r18 = r13;
        r19 = r14;
        r3 = r2;
        r12 = r9;
        r13 = r10;
        r14 = r11;
        r9 = r5;
        r10 = r7;
        r11 = r8;
        r8 = r4;
        r4 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0540, code lost:
        r6 = r13.getHintOriginalPageOffset();
        r2 = r13.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0548, code lost:
        if (r2 != null) goto L_0x054c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x054a, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x054c, code lost:
        r2 = (java.lang.Integer) kotlin.collections.C13566b0.m87422W(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0552, code lost:
        if (r2 != null) goto L_0x0555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0555, code lost:
        r7 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x055a, code lost:
        androidx.paging.SeparatorsKt.addSeparatorPage(r15, r3, r4, r13, r6, r7);
        r3 = r0;
        r4 = r8;
        r5 = r9;
        r7 = r10;
        r8 = r11;
        r9 = r12;
        r10 = r14;
        r6 = r15;
        r12 = r18;
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x056c, code lost:
        r6 = r12;
        r12 = r13;
        r13 = r10;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0570, code lost:
        kotlin.jvm.internal.C13706o.m87926c(r13);
        r10.add(r14.transformablePageToStash(r13));
        r0 = r14.getGenerator();
        r3.L$0 = r14;
        r3.L$1 = r12;
        r3.L$2 = r6;
        r3.L$3 = r10;
        r3.L$4 = r9;
        r3.L$5 = r8;
        r3.L$6 = r7;
        r3.L$7 = r6;
        r3.L$8 = null;
        r3.L$9 = null;
        r3.Z$0 = r5;
        r3.I$0 = r1;
        r3.label = 5;
        r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r13, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x059e, code lost:
        if (r2 != r4) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05a0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05a1, code lost:
        r11 = r6;
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05a3, code lost:
        r6.add(r2);
        r0 = r12.getPages();
        r2 = r9.intValue();
        kotlin.jvm.internal.C13706o.m87926c(r7);
        r0 = r0.subList(r2, r7.intValue() + 1).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05c3, code lost:
        if (r0.hasNext() == false) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x05c5, code lost:
        r2 = r0.next();
        r9 = r8;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05cf, code lost:
        if (r8.hasNext() == false) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05d1, code lost:
        r0 = (androidx.paging.TransformablePage) r8.next();
        r6 = (androidx.paging.TransformablePage) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x05e4, code lost:
        if ((!r0.getData().isEmpty()) == false) goto L_0x0693;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x05e6, code lost:
        r2 = r13.getGenerator();
        r14 = kotlin.collections.C13566b0.m87434i0(r6.getData());
        r15 = kotlin.collections.C13566b0.m87422W(r0.getData());
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r11;
        r3.L$3 = r10;
        r3.L$4 = r9;
        r3.L$5 = r7;
        r3.L$6 = r8;
        r3.L$7 = r0;
        r3.L$8 = r6;
        r32 = r0;
        r3.L$9 = null;
        r3.Z$0 = r5;
        r3.I$0 = r1;
        r3.label = 6;
        r2 = r2.invoke(r14, r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x061c, code lost:
        if (r2 != r4) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x061e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x061f, code lost:
        r0 = r3;
        r14 = r9;
        r15 = r10;
        r18 = r11;
        r19 = r12;
        r20 = r13;
        r11 = r32;
        r3 = r2;
        r9 = r5;
        r10 = r6;
        r13 = r7;
        r12 = r8;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0630, code lost:
        r2 = r19.getLoadType();
        r4 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0636, code lost:
        if (r2 != r4) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0638, code lost:
        r2 = r10.getHintOriginalPageOffset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x063d, code lost:
        r2 = r11.getHintOriginalPageOffset();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0641, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0646, code lost:
        if (r19.getLoadType() != r4) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0648, code lost:
        r2 = r10.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x064c, code lost:
        if (r2 != null) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x064e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0650, code lost:
        r2 = (java.lang.Integer) kotlin.collections.C13566b0.m87434i0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0656, code lost:
        if (r2 != null) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0658, code lost:
        r4 = kotlin.collections.C13614t.m87750l(r10.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0661, code lost:
        r4 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0666, code lost:
        r2 = r11.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x066a, code lost:
        if (r2 != null) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x066c, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x066e, code lost:
        r2 = (java.lang.Integer) kotlin.collections.C13566b0.m87422W(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0674, code lost:
        if (r2 != null) goto L_0x0677;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0677, code lost:
        r4 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x067b, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x067c, code lost:
        androidx.paging.SeparatorsKt.addSeparatorPage(r18, r3, r10, r11, r6, r7);
        r3 = r0;
        r4 = r8;
        r5 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
        r13 = r15;
        r6 = r18;
        r15 = r19;
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0693, code lost:
        r15 = r12;
        r12 = r9;
        r9 = r0;
        r29 = r8;
        r8 = r6;
        r6 = r11;
        r11 = r7;
        r7 = r13;
        r13 = r10;
        r10 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x06ac, code lost:
        if ((!r9.getData().isEmpty()) == false) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x06ae, code lost:
        r13.add(r7.transformablePageToStash(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x06b5, code lost:
        r0 = r7.getGenerator();
        r3.L$0 = r7;
        r3.L$1 = r15;
        r3.L$2 = r6;
        r3.L$3 = r13;
        r3.L$4 = r12;
        r3.L$5 = r11;
        r3.L$6 = r10;
        r3.L$7 = r9;
        r3.L$8 = r8;
        r3.L$9 = r6;
        r3.Z$0 = r5;
        r3.I$0 = r1;
        r3.label = 7;
        r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r9, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x06d8, code lost:
        if (r2 != r4) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x06da, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x06db, code lost:
        r0 = r7;
        r7 = r11;
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x06de, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x06eb, code lost:
        if ((!r9.getData().isEmpty()) == false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x06ed, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x06ef, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x06f0, code lost:
        r8 = r10;
        r9 = r12;
        r10 = r13;
        r12 = r15;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x06fd, code lost:
        if (r12.getLoadType() != androidx.paging.LoadType.PREPEND) goto L_0x078e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0709, code lost:
        if ((!r13.getPageStash().isEmpty()) == false) goto L_0x078e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x070b, code lost:
        r6 = (androidx.paging.TransformablePage) kotlin.collections.C13566b0.m87422W(r13.getPageStash());
        r0 = r13.getGenerator();
        kotlin.jvm.internal.C13706o.m87926c(r9);
        r2 = kotlin.collections.C13566b0.m87434i0(r9.getData());
        r8 = kotlin.collections.C13566b0.m87422W(r6.getData());
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r11;
        r3.L$3 = r10;
        r3.L$4 = r9;
        r3.L$5 = r7;
        r3.L$6 = r6;
        r3.L$7 = null;
        r3.L$8 = null;
        r3.L$9 = null;
        r3.Z$0 = r5;
        r3.I$0 = r1;
        r3.label = 8;
        r2 = r0.invoke(r2, r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x074e, code lost:
        if (r2 != r4) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0750, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0751, code lost:
        r0 = r3;
        r8 = r4;
        r14 = r12;
        r15 = r13;
        r3 = r2;
        r12 = r10;
        r13 = r11;
        r10 = r7;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x075c, code lost:
        r6 = r11.getHintOriginalPageOffset();
        r2 = r11.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0764, code lost:
        if (r2 != null) goto L_0x0768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0766, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0768, code lost:
        r2 = (java.lang.Integer) kotlin.collections.C13566b0.m87434i0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x076e, code lost:
        if (r2 != null) goto L_0x0779;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0770, code lost:
        r2 = kotlin.collections.C13614t.m87750l(r11.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0779, code lost:
        r2 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x077d, code lost:
        androidx.paging.SeparatorsKt.addSeparatorPage(r13, r3, r11, r5, r6, r2);
        r3 = r0;
        r6 = r1;
        r4 = r8;
        r5 = r9;
        r7 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x078e, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x078f, code lost:
        r0 = r7.intValue() + 1;
        r1 = kotlin.collections.C13614t.m87750l(r12.getPages());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x079d, code lost:
        if (r0 > r1) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x079f, code lost:
        r14 = r10;
        r8 = r13;
        r10 = r6;
        r13 = r9;
        r6 = r12;
        r12 = r11;
        r11 = r5;
        r5 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07a8, code lost:
        r9 = r1 + 1;
        r2 = r8.getGenerator();
        r3.L$0 = r8;
        r3.L$1 = r6;
        r3.L$2 = r12;
        r3.L$3 = r14;
        r3.L$4 = r13;
        r3.L$5 = r12;
        r3.L$6 = null;
        r3.L$7 = null;
        r3.L$8 = null;
        r3.L$9 = null;
        r3.Z$0 = r11;
        r3.I$0 = r10;
        r3.I$1 = r9;
        r3.I$2 = r5;
        r3.I$3 = r1;
        r3.label = 9;
        r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r6.getPages().get(r1), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x07df, code lost:
        if (r2 != r4) goto L_0x07e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x07e1, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x07e2, code lost:
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x07e3, code lost:
        r12.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07e6, code lost:
        if (r1 != r5) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x07e8, code lost:
        r0 = r3;
        r9 = r6;
        r3 = r8;
        r6 = r10;
        r5 = r11;
        r10 = r13;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x07f0, code lost:
        r1 = r9;
        r12 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x07f3, code lost:
        r0 = r3;
        r14 = r10;
        r1 = r11;
        r3 = r13;
        r10 = r9;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0801, code lost:
        throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0802, code lost:
        r0 = r3;
        r1 = r7;
        r9 = r14;
        r3 = r20;
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0808, code lost:
        if (r5 == false) goto L_0x0884;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x080e, code lost:
        if (r3.getFooterAdded() != false) goto L_0x0884;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0810, code lost:
        r3.setFooterAdded(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0814, code lost:
        if (r6 == 0) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0816, code lost:
        r2 = (androidx.paging.TransformablePage) kotlin.collections.C13566b0.m87434i0(r3.getPageStash());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0821, code lost:
        kotlin.jvm.internal.C13706o.m87926c(r10);
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0825, code lost:
        r5 = r3.getGenerator();
        r6 = kotlin.collections.C13566b0.m87434i0(r2.getData());
        r0.L$0 = r3;
        r0.L$1 = r9;
        r0.L$2 = r1;
        r0.L$3 = r14;
        r0.L$4 = r2;
        r0.L$5 = r1;
        r7 = null;
        r0.L$6 = null;
        r0.L$7 = null;
        r0.L$8 = null;
        r0.L$9 = null;
        r0.label = 10;
        r0 = r5.invoke(r6, null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x084e, code lost:
        if (r0 != r4) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0850, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0851, code lost:
        r16 = r0;
        r15 = r1;
        r17 = r2;
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0857, code lost:
        r19 = r17.getHintOriginalPageOffset();
        r0 = r17.getHintOriginalIndices();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0861, code lost:
        if (r0 != null) goto L_0x0865;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0863, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0865, code lost:
        r8 = kotlin.collections.C13566b0.m87434i0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x086c, code lost:
        if (r8 != null) goto L_0x0877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x086e, code lost:
        r0 = kotlin.collections.C13614t.m87750l(r17.getData());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0877, code lost:
        r0 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x087b, code lost:
        androidx.paging.SeparatorsKt.addSeparatorPage(r15, r16, r17, (androidx.paging.TransformablePage) null, r19, r0);
        r23 = r1;
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0884, code lost:
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0886, code lost:
        r3.setEndTerminalSeparatorDeferred(false);
        r3.setStartTerminalSeparatorDeferred(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0893, code lost:
        if (r9.getLoadType() != androidx.paging.LoadType.APPEND) goto L_0x089d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0895, code lost:
        r3.getPageStash().addAll(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x089d, code lost:
        r3.getPageStash().addAll(0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x08a4, code lost:
        r22 = r9.getLoadType();
        r9.getPages();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x08c4, code lost:
        return new androidx.paging.PageEvent.Insert(r22, r23, r9.getPlaceholdersBefore(), r9.getPlaceholdersAfter(), r9.getSourceLoadStates(), r9.getMediatorLoadStates(), (kotlin.jvm.internal.C13695i) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        return new androidx.paging.PageEvent.Insert(r3, kotlin.collections.C13612s.m87736e(androidx.paging.SeparatorsKt.separatorPage(r2, r5, r4, r4)), r1.getPlaceholdersBefore(), r1.getPlaceholdersAfter(), r1.getSourceLoadStates(), r1.getMediatorLoadStates(), (kotlin.jvm.internal.C13695i) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        return r3.asRType(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02f2, code lost:
        r3.setEndTerminalSeparatorDeferred(r4);
        r3.setStartTerminalSeparatorDeferred(r4);
        r3.setHeaderAdded(r5);
        r3.setFooterAdded(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02fe, code lost:
        if (r2 != null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0305, code lost:
        r3 = r1.getLoadType();
        r1.getPages();
        r5 = new int[r5];
        r5[r4] = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v27, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object onInsert(androidx.paging.PageEvent.Insert<T> r32, kotlin.coroutines.C13635d<? super androidx.paging.PageEvent.Insert<R>> r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            boolean r3 = r2 instanceof androidx.paging.SeparatorState$onInsert$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.SeparatorState$onInsert$1 r3 = (androidx.paging.SeparatorState$onInsert$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.SeparatorState$onInsert$1 r3 = new androidx.paging.SeparatorState$onInsert$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r5 = r3.label
            switch(r5) {
                case 0: goto L_0x020d;
                case 1: goto L_0x01fe;
                case 2: goto L_0x01bc;
                case 3: goto L_0x0182;
                case 4: goto L_0x0146;
                case 5: goto L_0x011d;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00ac;
                case 8: goto L_0x007c;
                case 9: goto L_0x0055;
                case 10: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.Object r1 = r3.L$5
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.L$4
            androidx.paging.TransformablePage r4 = (androidx.paging.TransformablePage) r4
            java.lang.Object r5 = r3.L$3
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r7 = r3.L$2
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r9 = r3.L$1
            androidx.paging.PageEvent$Insert r9 = (androidx.paging.PageEvent.Insert) r9
            java.lang.Object r3 = r3.L$0
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            p297ja.C13332o.m85685b(r2)
            r15 = r1
            r16 = r2
            r17 = r4
            r1 = r7
            r7 = 0
            goto L_0x0857
        L_0x0055:
            int r1 = r3.I$3
            int r5 = r3.I$2
            int r9 = r3.I$1
            int r10 = r3.I$0
            boolean r11 = r3.Z$0
            java.lang.Object r12 = r3.L$5
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.L$4
            androidx.paging.TransformablePage r13 = (androidx.paging.TransformablePage) r13
            java.lang.Object r14 = r3.L$3
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.L$2
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r6 = r3.L$1
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent.Insert) r6
            java.lang.Object r8 = r3.L$0
            androidx.paging.SeparatorState r8 = (androidx.paging.SeparatorState) r8
            p297ja.C13332o.m85685b(r2)
            goto L_0x07e3
        L_0x007c:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$6
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            java.lang.Object r8 = r3.L$5
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r9 = r3.L$4
            androidx.paging.TransformablePage r9 = (androidx.paging.TransformablePage) r9
            java.lang.Object r10 = r3.L$3
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r3.L$2
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.L$1
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            java.lang.Object r13 = r3.L$0
            androidx.paging.SeparatorState r13 = (androidx.paging.SeparatorState) r13
            p297ja.C13332o.m85685b(r2)
            r0 = r3
            r14 = r12
            r15 = r13
            r3 = r2
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r4
        L_0x00a8:
            r9 = r5
            r5 = r6
            goto L_0x075c
        L_0x00ac:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$9
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r8 = r3.L$8
            androidx.paging.TransformablePage r8 = (androidx.paging.TransformablePage) r8
            java.lang.Object r9 = r3.L$7
            androidx.paging.TransformablePage r9 = (androidx.paging.TransformablePage) r9
            java.lang.Object r10 = r3.L$6
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r3.L$5
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r3.L$4
            androidx.paging.TransformablePage r12 = (androidx.paging.TransformablePage) r12
            java.lang.Object r13 = r3.L$3
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.L$2
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.L$1
            androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
            java.lang.Object r7 = r3.L$0
            androidx.paging.SeparatorState r7 = (androidx.paging.SeparatorState) r7
            p297ja.C13332o.m85685b(r2)
            r0 = r7
            r7 = r11
            r11 = r14
            goto L_0x06de
        L_0x00e0:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$8
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            java.lang.Object r7 = r3.L$7
            androidx.paging.TransformablePage r7 = (androidx.paging.TransformablePage) r7
            java.lang.Object r8 = r3.L$6
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r3.L$5
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.L$4
            androidx.paging.TransformablePage r10 = (androidx.paging.TransformablePage) r10
            java.lang.Object r11 = r3.L$3
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.L$2
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.SeparatorState r14 = (androidx.paging.SeparatorState) r14
            p297ja.C13332o.m85685b(r2)
            r0 = r3
            r15 = r11
            r18 = r12
            r19 = r13
            r20 = r14
            r3 = r2
            r11 = r7
            r12 = r8
            r13 = r9
            r14 = r10
            r8 = r4
            r9 = r5
            r10 = r6
            goto L_0x0630
        L_0x011d:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$7
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r3.L$6
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r8 = r3.L$5
            androidx.paging.TransformablePage r8 = (androidx.paging.TransformablePage) r8
            java.lang.Object r9 = r3.L$4
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.L$3
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r3.L$2
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.L$1
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            java.lang.Object r13 = r3.L$0
            androidx.paging.SeparatorState r13 = (androidx.paging.SeparatorState) r13
            p297ja.C13332o.m85685b(r2)
            goto L_0x05a3
        L_0x0146:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$8
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            java.lang.Object r7 = r3.L$7
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r8 = r3.L$6
            androidx.paging.TransformablePage r8 = (androidx.paging.TransformablePage) r8
            java.lang.Object r9 = r3.L$5
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.L$4
            androidx.paging.TransformablePage r10 = (androidx.paging.TransformablePage) r10
            java.lang.Object r11 = r3.L$3
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.L$2
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.L$1
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            java.lang.Object r14 = r3.L$0
            androidx.paging.SeparatorState r14 = (androidx.paging.SeparatorState) r14
            p297ja.C13332o.m85685b(r2)
            r0 = r3
            r15 = r12
            r18 = r13
            r19 = r14
            r3 = r2
            r12 = r9
            r13 = r10
            r14 = r11
            r9 = r5
            r10 = r7
            r11 = r8
            r8 = r4
            r4 = r6
            goto L_0x0540
        L_0x0182:
            int r1 = r3.I$2
            int r5 = r3.I$1
            int r6 = r3.I$0
            boolean r7 = r3.Z$0
            java.lang.Object r8 = r3.L$8
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r9 = r3.L$7
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.L$6
            androidx.paging.TransformablePage r10 = (androidx.paging.TransformablePage) r10
            java.lang.Object r11 = r3.L$5
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r3.L$4
            androidx.paging.TransformablePage r12 = (androidx.paging.TransformablePage) r12
            java.lang.Object r13 = r3.L$3
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.L$2
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.L$1
            androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
            r32 = r1
            java.lang.Object r1 = r3.L$0
            androidx.paging.SeparatorState r1 = (androidx.paging.SeparatorState) r1
            p297ja.C13332o.m85685b(r2)
            r0 = r32
            r29 = r5
            r5 = r4
            r4 = r29
            goto L_0x04b0
        L_0x01bc:
            int r1 = r3.I$0
            boolean r5 = r3.Z$0
            java.lang.Object r6 = r3.L$9
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.L$8
            androidx.paging.TransformablePage r7 = (androidx.paging.TransformablePage) r7
            java.lang.Object r8 = r3.L$7
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r9 = r3.L$6
            androidx.paging.TransformablePage r9 = (androidx.paging.TransformablePage) r9
            java.lang.Object r10 = r3.L$5
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r3.L$4
            androidx.paging.TransformablePage r11 = (androidx.paging.TransformablePage) r11
            java.lang.Object r12 = r3.L$3
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.L$2
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.L$1
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent.Insert) r14
            java.lang.Object r15 = r3.L$0
            androidx.paging.SeparatorState r15 = (androidx.paging.SeparatorState) r15
            p297ja.C13332o.m85685b(r2)
            r18 = r12
            r19 = r13
            r20 = r15
            r12 = r9
            r13 = r10
            r15 = r11
            r11 = r8
            r8 = r7
            r29 = r6
            r6 = r2
            r2 = r5
            r5 = r29
            goto L_0x042a
        L_0x01fe:
            java.lang.Object r1 = r3.L$1
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent.Insert) r1
            java.lang.Object r3 = r3.L$0
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            p297ja.C13332o.m85685b(r2)
            r4 = 0
            r5 = 1
            goto L_0x02f2
        L_0x020d:
            p297ja.C13332o.m85685b(r2)
            androidx.paging.TerminalSeparatorType r2 = r31.getTerminalSeparatorType()
            boolean r2 = r0.terminatesStart(r1, r2)
            androidx.paging.TerminalSeparatorType r5 = r31.getTerminalSeparatorType()
            boolean r5 = r0.terminatesEnd(r1, r5)
            java.util.List r6 = r32.getPages()
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0230
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0230
        L_0x022e:
            r6 = 1
            goto L_0x024b
        L_0x0230:
            java.util.Iterator r6 = r6.iterator()
        L_0x0234:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x022e
            java.lang.Object r7 = r6.next()
            androidx.paging.TransformablePage r7 = (androidx.paging.TransformablePage) r7
            java.util.List r7 = r7.getData()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0234
            r6 = 0
        L_0x024b:
            boolean r7 = r31.getHeaderAdded()
            if (r7 == 0) goto L_0x025e
            androidx.paging.LoadType r7 = r32.getLoadType()
            androidx.paging.LoadType r8 = androidx.paging.LoadType.PREPEND
            if (r7 != r8) goto L_0x025e
            if (r6 == 0) goto L_0x025c
            goto L_0x025e
        L_0x025c:
            r7 = 0
            goto L_0x025f
        L_0x025e:
            r7 = 1
        L_0x025f:
            if (r7 == 0) goto L_0x08d1
            boolean r7 = r31.getFooterAdded()
            if (r7 == 0) goto L_0x0274
            androidx.paging.LoadType r7 = r32.getLoadType()
            androidx.paging.LoadType r8 = androidx.paging.LoadType.APPEND
            if (r7 != r8) goto L_0x0274
            if (r6 == 0) goto L_0x0272
            goto L_0x0274
        L_0x0272:
            r7 = 0
            goto L_0x0275
        L_0x0274:
            r7 = 1
        L_0x0275:
            if (r7 == 0) goto L_0x08c5
            androidx.paging.MutableLoadStateCollection r7 = r31.getSourceStates()
            androidx.paging.LoadStates r8 = r32.getSourceLoadStates()
            r7.set(r8)
            androidx.paging.LoadStates r7 = r32.getMediatorLoadStates()
            r0.setMediatorStates(r7)
            androidx.paging.LoadType r7 = r32.getLoadType()
            androidx.paging.LoadType r8 = androidx.paging.LoadType.APPEND
            if (r7 == r8) goto L_0x0298
            int r7 = r32.getPlaceholdersBefore()
            r0.setPlaceholdersBefore(r7)
        L_0x0298:
            androidx.paging.LoadType r7 = r32.getLoadType()
            androidx.paging.LoadType r8 = androidx.paging.LoadType.PREPEND
            if (r7 == r8) goto L_0x02a7
            int r7 = r32.getPlaceholdersAfter()
            r0.setPlaceholdersAfter(r7)
        L_0x02a7:
            if (r6 == 0) goto L_0x034e
            if (r2 != 0) goto L_0x02b2
            if (r5 != 0) goto L_0x02b2
            androidx.paging.PageEvent$Insert r1 = r31.asRType(r32)
            return r1
        L_0x02b2:
            boolean r7 = r31.getHeaderAdded()
            if (r7 == 0) goto L_0x02c3
            boolean r7 = r31.getFooterAdded()
            if (r7 == 0) goto L_0x02c3
            androidx.paging.PageEvent$Insert r1 = r31.asRType(r32)
            return r1
        L_0x02c3:
            java.util.List r7 = r31.getPageStash()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x034e
            if (r2 == 0) goto L_0x0330
            if (r5 == 0) goto L_0x0330
            boolean r6 = r31.getHeaderAdded()
            if (r6 != 0) goto L_0x0330
            boolean r6 = r31.getFooterAdded()
            if (r6 != 0) goto L_0x0330
            qa.q r2 = r31.getGenerator()
            r3.L$0 = r0
            r3.L$1 = r1
            r5 = 1
            r3.label = r5
            r6 = 0
            java.lang.Object r2 = r2.invoke(r6, r6, r3)
            if (r2 != r4) goto L_0x02f0
            return r4
        L_0x02f0:
            r3 = r0
            r4 = 0
        L_0x02f2:
            r3.setEndTerminalSeparatorDeferred(r4)
            r3.setStartTerminalSeparatorDeferred(r4)
            r3.setHeaderAdded(r5)
            r3.setFooterAdded(r5)
            if (r2 != 0) goto L_0x0305
            androidx.paging.PageEvent$Insert r1 = r3.asRType(r1)
            goto L_0x032f
        L_0x0305:
            androidx.paging.LoadType r3 = r1.getLoadType()
            r1.getPages()
            int[] r5 = new int[r5]
            r5[r4] = r4
            androidx.paging.TransformablePage r2 = androidx.paging.SeparatorsKt.separatorPage(r2, r5, r4, r4)
            java.util.List r4 = kotlin.collections.C13612s.m87736e(r2)
            int r5 = r1.getPlaceholdersBefore()
            int r6 = r1.getPlaceholdersAfter()
            androidx.paging.LoadStates r7 = r1.getSourceLoadStates()
            androidx.paging.LoadStates r8 = r1.getMediatorLoadStates()
            r9 = 0
            androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x032f:
            return r1
        L_0x0330:
            if (r5 == 0) goto L_0x033d
            boolean r3 = r31.getFooterAdded()
            if (r3 != 0) goto L_0x033d
            r3 = 1
            r0.setEndTerminalSeparatorDeferred(r3)
            goto L_0x033e
        L_0x033d:
            r3 = 1
        L_0x033e:
            if (r2 == 0) goto L_0x0349
            boolean r2 = r31.getHeaderAdded()
            if (r2 != 0) goto L_0x0349
            r0.setStartTerminalSeparatorDeferred(r3)
        L_0x0349:
            androidx.paging.PageEvent$Insert r1 = r31.asRType(r32)
            return r1
        L_0x034e:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r8 = r32.getPages()
            int r8 = r8.size()
            r7.<init>(r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r8 = r32.getPages()
            int r8 = r8.size()
            r12.<init>(r8)
            if (r6 != 0) goto L_0x03ca
            r8 = 0
        L_0x036b:
            java.util.List r9 = r32.getPages()
            int r9 = kotlin.collections.C13614t.m87750l(r9)
            if (r8 >= r9) goto L_0x038c
            java.util.List r9 = r32.getPages()
            java.lang.Object r9 = r9.get(r8)
            androidx.paging.TransformablePage r9 = (androidx.paging.TransformablePage) r9
            java.util.List r9 = r9.getData()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x038c
            int r8 = r8 + 1
            goto L_0x036b
        L_0x038c:
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r8)
            java.util.List r10 = r32.getPages()
            java.lang.Object r8 = r10.get(r8)
            androidx.paging.TransformablePage r8 = (androidx.paging.TransformablePage) r8
            java.util.List r10 = r32.getPages()
            int r10 = kotlin.collections.C13614t.m87750l(r10)
        L_0x03a2:
            if (r10 <= 0) goto L_0x03bb
            java.util.List r11 = r32.getPages()
            java.lang.Object r11 = r11.get(r10)
            androidx.paging.TransformablePage r11 = (androidx.paging.TransformablePage) r11
            java.util.List r11 = r11.getData()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x03bb
            int r10 = r10 + -1
            goto L_0x03a2
        L_0x03bb:
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r10)
            java.util.List r13 = r32.getPages()
            java.lang.Object r10 = r13.get(r10)
            androidx.paging.TransformablePage r10 = (androidx.paging.TransformablePage) r10
            goto L_0x03ce
        L_0x03ca:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x03ce:
            if (r2 == 0) goto L_0x0451
            boolean r2 = r31.getHeaderAdded()
            if (r2 != 0) goto L_0x0451
            r2 = 1
            r0.setHeaderAdded(r2)
            if (r6 == 0) goto L_0x03e7
            java.util.List r2 = r31.getPageStash()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87422W(r2)
            androidx.paging.TransformablePage r2 = (androidx.paging.TransformablePage) r2
            goto L_0x03eb
        L_0x03e7:
            kotlin.jvm.internal.C13706o.m87926c(r8)
            r2 = r8
        L_0x03eb:
            qa.q r13 = r31.getGenerator()
            java.util.List r14 = r2.getData()
            java.lang.Object r14 = kotlin.collections.C13566b0.m87422W(r14)
            r3.L$0 = r0
            r3.L$1 = r1
            r3.L$2 = r7
            r3.L$3 = r12
            r3.L$4 = r8
            r3.L$5 = r9
            r3.L$6 = r10
            r3.L$7 = r11
            r3.L$8 = r2
            r3.L$9 = r7
            r3.Z$0 = r5
            r3.I$0 = r6
            r15 = 2
            r3.label = r15
            r15 = 0
            java.lang.Object r13 = r13.invoke(r15, r14, r3)
            if (r13 != r4) goto L_0x041a
            return r4
        L_0x041a:
            r20 = r0
            r14 = r1
            r1 = r6
            r19 = r7
            r15 = r8
            r18 = r12
            r6 = r13
            r8 = r2
            r2 = r5
            r5 = r19
            r13 = r9
            r12 = r10
        L_0x042a:
            r7 = 0
            int r9 = r8.getHintOriginalPageOffset()
            java.util.List r10 = r8.getHintOriginalIndices()
            if (r10 != 0) goto L_0x0437
        L_0x0435:
            r10 = 0
            goto L_0x0444
        L_0x0437:
            java.lang.Object r10 = kotlin.collections.C13566b0.m87422W(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x0440
            goto L_0x0435
        L_0x0440:
            int r10 = r10.intValue()
        L_0x0444:
            androidx.paging.SeparatorsKt.addSeparatorPage(r5, r6, r7, r8, r9, r10)
            r6 = r1
            r5 = r2
            r10 = r12
            r9 = r13
            r8 = r15
            r12 = r18
            r7 = r19
            goto L_0x0454
        L_0x0451:
            r20 = r0
            r14 = r1
        L_0x0454:
            if (r6 != 0) goto L_0x0802
            kotlin.jvm.internal.C13706o.m87926c(r9)
            int r1 = r9.intValue()
            if (r1 <= 0) goto L_0x04c6
            r2 = r1
            r13 = r12
            r15 = r14
            r1 = r20
            r12 = r8
            r8 = r7
            r7 = r5
            r5 = r4
            r4 = 0
            r29 = r11
            r11 = r9
            r9 = r29
        L_0x046e:
            int r14 = r4 + 1
            java.util.List r0 = r15.getPages()
            java.lang.Object r0 = r0.get(r4)
            androidx.paging.TransformablePage r0 = (androidx.paging.TransformablePage) r0
            qa.q r4 = r1.getGenerator()
            r3.L$0 = r1
            r3.L$1 = r15
            r3.L$2 = r8
            r3.L$3 = r13
            r3.L$4 = r12
            r3.L$5 = r11
            r3.L$6 = r10
            r3.L$7 = r9
            r3.L$8 = r8
            r32 = r1
            r1 = 0
            r3.L$9 = r1
            r3.Z$0 = r7
            r3.I$0 = r6
            r3.I$1 = r14
            r3.I$2 = r2
            r1 = 3
            r3.label = r1
            java.lang.Object r0 = androidx.paging.SeparatorsKt.insertInternalSeparators(r0, r4, r3)
            if (r0 != r5) goto L_0x04a7
            return r5
        L_0x04a7:
            r1 = r32
            r4 = r14
            r14 = r8
            r29 = r2
            r2 = r0
            r0 = r29
        L_0x04b0:
            r8.add(r2)
            if (r4 < r0) goto L_0x04c1
            r4 = r5
            r5 = r7
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r1
            r1 = r6
            goto L_0x04d5
        L_0x04c1:
            r2 = r0
            r8 = r14
            r0 = r31
            goto L_0x046e
        L_0x04c6:
            r1 = r6
            r13 = r14
            r14 = r20
            r29 = r12
            r12 = r7
            r7 = r11
            r11 = r29
            r30 = r10
            r10 = r8
            r8 = r30
        L_0x04d5:
            androidx.paging.LoadType r0 = r13.getLoadType()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            if (r0 != r2) goto L_0x056c
            java.util.List r0 = r14.getPageStash()
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x056c
            java.util.List r0 = r14.getPageStash()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87434i0(r0)
            r6 = r0
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            qa.q r0 = r14.getGenerator()
            java.util.List r2 = r6.getData()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87434i0(r2)
            kotlin.jvm.internal.C13706o.m87926c(r10)
            java.util.List r15 = r10.getData()
            java.lang.Object r15 = kotlin.collections.C13566b0.m87422W(r15)
            r3.L$0 = r14
            r3.L$1 = r13
            r3.L$2 = r12
            r3.L$3 = r11
            r3.L$4 = r10
            r3.L$5 = r9
            r3.L$6 = r8
            r3.L$7 = r7
            r3.L$8 = r6
            r32 = r6
            r6 = 0
            r3.L$9 = r6
            r3.Z$0 = r5
            r3.I$0 = r1
            r6 = 4
            r3.label = r6
            java.lang.Object r2 = r0.invoke(r2, r15, r3)
            if (r2 != r4) goto L_0x0530
            return r4
        L_0x0530:
            r0 = r3
            r15 = r12
            r18 = r13
            r19 = r14
            r3 = r2
            r12 = r9
            r13 = r10
            r14 = r11
            r9 = r5
            r10 = r7
            r11 = r8
            r8 = r4
            r4 = r32
        L_0x0540:
            int r6 = r13.getHintOriginalPageOffset()
            java.util.List r2 = r13.getHintOriginalIndices()
            if (r2 != 0) goto L_0x054c
        L_0x054a:
            r7 = 0
            goto L_0x055a
        L_0x054c:
            java.lang.Object r2 = kotlin.collections.C13566b0.m87422W(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0555
            goto L_0x054a
        L_0x0555:
            int r2 = r2.intValue()
            r7 = r2
        L_0x055a:
            r2 = r15
            r5 = r13
            androidx.paging.SeparatorsKt.addSeparatorPage(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r4 = r8
            r5 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r14
            r6 = r15
            r12 = r18
            r14 = r19
            goto L_0x0570
        L_0x056c:
            r6 = r12
            r12 = r13
            r13 = r10
            r10 = r11
        L_0x0570:
            kotlin.jvm.internal.C13706o.m87926c(r13)
            androidx.paging.TransformablePage r0 = r14.transformablePageToStash(r13)
            r10.add(r0)
            qa.q r0 = r14.getGenerator()
            r3.L$0 = r14
            r3.L$1 = r12
            r3.L$2 = r6
            r3.L$3 = r10
            r3.L$4 = r9
            r3.L$5 = r8
            r3.L$6 = r7
            r3.L$7 = r6
            r2 = 0
            r3.L$8 = r2
            r3.L$9 = r2
            r3.Z$0 = r5
            r3.I$0 = r1
            r2 = 5
            r3.label = r2
            java.lang.Object r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r13, r0, r3)
            if (r2 != r4) goto L_0x05a1
            return r4
        L_0x05a1:
            r11 = r6
            r13 = r14
        L_0x05a3:
            r6.add(r2)
            java.util.List r0 = r12.getPages()
            int r2 = r9.intValue()
            kotlin.jvm.internal.C13706o.m87926c(r7)
            int r6 = r7.intValue()
            r9 = 1
            int r6 = r6 + r9
            java.util.List r0 = r0.subList(r2, r6)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07fa
            java.lang.Object r2 = r0.next()
            r9 = r8
            r8 = r0
        L_0x05cb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06f7
            java.lang.Object r0 = r8.next()
            androidx.paging.TransformablePage r0 = (androidx.paging.TransformablePage) r0
            r6 = r2
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            java.util.List r2 = r0.getData()
            boolean r2 = r2.isEmpty()
            r14 = 1
            r2 = r2 ^ r14
            if (r2 == 0) goto L_0x0693
            qa.q r2 = r13.getGenerator()
            java.util.List r14 = r6.getData()
            java.lang.Object r14 = kotlin.collections.C13566b0.m87434i0(r14)
            java.util.List r15 = r0.getData()
            java.lang.Object r15 = kotlin.collections.C13566b0.m87422W(r15)
            r3.L$0 = r13
            r3.L$1 = r12
            r3.L$2 = r11
            r3.L$3 = r10
            r3.L$4 = r9
            r3.L$5 = r7
            r3.L$6 = r8
            r3.L$7 = r0
            r3.L$8 = r6
            r32 = r0
            r0 = 0
            r3.L$9 = r0
            r3.Z$0 = r5
            r3.I$0 = r1
            r0 = 6
            r3.label = r0
            java.lang.Object r2 = r2.invoke(r14, r15, r3)
            if (r2 != r4) goto L_0x061f
            return r4
        L_0x061f:
            r0 = r3
            r14 = r9
            r15 = r10
            r18 = r11
            r19 = r12
            r20 = r13
            r11 = r32
            r3 = r2
            r9 = r5
            r10 = r6
            r13 = r7
            r12 = r8
            r8 = r4
        L_0x0630:
            androidx.paging.LoadType r2 = r19.getLoadType()
            androidx.paging.LoadType r4 = androidx.paging.LoadType.PREPEND
            if (r2 != r4) goto L_0x063d
            int r2 = r10.getHintOriginalPageOffset()
            goto L_0x0641
        L_0x063d:
            int r2 = r11.getHintOriginalPageOffset()
        L_0x0641:
            r6 = r2
            androidx.paging.LoadType r2 = r19.getLoadType()
            if (r2 != r4) goto L_0x0666
            java.util.List r2 = r10.getHintOriginalIndices()
            if (r2 != 0) goto L_0x0650
            r2 = 0
            goto L_0x0656
        L_0x0650:
            java.lang.Object r2 = kotlin.collections.C13566b0.m87434i0(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0656:
            if (r2 != 0) goto L_0x0661
            java.util.List r2 = r10.getData()
            int r4 = kotlin.collections.C13614t.m87750l(r2)
            goto L_0x067b
        L_0x0661:
            int r4 = r2.intValue()
            goto L_0x067b
        L_0x0666:
            java.util.List r2 = r11.getHintOriginalIndices()
            if (r2 != 0) goto L_0x066e
        L_0x066c:
            r7 = 0
            goto L_0x067c
        L_0x066e:
            java.lang.Object r2 = kotlin.collections.C13566b0.m87422W(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x0677
            goto L_0x066c
        L_0x0677:
            int r4 = r2.intValue()
        L_0x067b:
            r7 = r4
        L_0x067c:
            r2 = r18
            r4 = r10
            r5 = r11
            androidx.paging.SeparatorsKt.addSeparatorPage(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r4 = r8
            r5 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r6 = r18
            r15 = r19
            r7 = r20
            goto L_0x06a2
        L_0x0693:
            r32 = r0
            r15 = r12
            r12 = r9
            r9 = r32
            r29 = r8
            r8 = r6
            r6 = r11
            r11 = r7
            r7 = r13
            r13 = r10
            r10 = r29
        L_0x06a2:
            java.util.List r0 = r9.getData()
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x06b5
            androidx.paging.TransformablePage r0 = r7.transformablePageToStash(r9)
            r13.add(r0)
        L_0x06b5:
            qa.q r0 = r7.getGenerator()
            r3.L$0 = r7
            r3.L$1 = r15
            r3.L$2 = r6
            r3.L$3 = r13
            r3.L$4 = r12
            r3.L$5 = r11
            r3.L$6 = r10
            r3.L$7 = r9
            r3.L$8 = r8
            r3.L$9 = r6
            r3.Z$0 = r5
            r3.I$0 = r1
            r2 = 7
            r3.label = r2
            java.lang.Object r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r9, r0, r3)
            if (r2 != r4) goto L_0x06db
            return r4
        L_0x06db:
            r0 = r7
            r7 = r11
            r11 = r6
        L_0x06de:
            r6.add(r2)
            java.util.List r2 = r9.getData()
            boolean r2 = r2.isEmpty()
            r6 = 1
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x06ef
            r2 = r9
            goto L_0x06f0
        L_0x06ef:
            r2 = r8
        L_0x06f0:
            r8 = r10
            r9 = r12
            r10 = r13
            r12 = r15
            r13 = r0
            goto L_0x05cb
        L_0x06f7:
            androidx.paging.LoadType r0 = r12.getLoadType()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r0 != r2) goto L_0x078e
            java.util.List r0 = r13.getPageStash()
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x078e
            java.util.List r0 = r13.getPageStash()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87422W(r0)
            r6 = r0
            androidx.paging.TransformablePage r6 = (androidx.paging.TransformablePage) r6
            qa.q r0 = r13.getGenerator()
            kotlin.jvm.internal.C13706o.m87926c(r9)
            java.util.List r2 = r9.getData()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87434i0(r2)
            java.util.List r8 = r6.getData()
            java.lang.Object r8 = kotlin.collections.C13566b0.m87422W(r8)
            r3.L$0 = r13
            r3.L$1 = r12
            r3.L$2 = r11
            r3.L$3 = r10
            r3.L$4 = r9
            r3.L$5 = r7
            r3.L$6 = r6
            r14 = 0
            r3.L$7 = r14
            r3.L$8 = r14
            r3.L$9 = r14
            r3.Z$0 = r5
            r3.I$0 = r1
            r14 = 8
            r3.label = r14
            java.lang.Object r2 = r0.invoke(r2, r8, r3)
            if (r2 != r4) goto L_0x0751
            return r4
        L_0x0751:
            r0 = r3
            r8 = r4
            r14 = r12
            r15 = r13
            r3 = r2
            r12 = r10
            r13 = r11
            r10 = r7
            r11 = r9
            goto L_0x00a8
        L_0x075c:
            int r6 = r11.getHintOriginalPageOffset()
            java.util.List r2 = r11.getHintOriginalIndices()
            if (r2 != 0) goto L_0x0768
            r2 = 0
            goto L_0x076e
        L_0x0768:
            java.lang.Object r2 = kotlin.collections.C13566b0.m87434i0(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x076e:
            if (r2 != 0) goto L_0x0779
            java.util.List r2 = r11.getData()
            int r2 = kotlin.collections.C13614t.m87750l(r2)
            goto L_0x077d
        L_0x0779:
            int r2 = r2.intValue()
        L_0x077d:
            r7 = r2
            r2 = r13
            r4 = r11
            androidx.paging.SeparatorsKt.addSeparatorPage(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r6 = r1
            r4 = r8
            r5 = r9
            r7 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            goto L_0x078f
        L_0x078e:
            r6 = r1
        L_0x078f:
            int r0 = r7.intValue()
            r1 = 1
            int r0 = r0 + r1
            java.util.List r1 = r12.getPages()
            int r1 = kotlin.collections.C13614t.m87750l(r1)
            if (r0 > r1) goto L_0x07f3
            r14 = r10
            r8 = r13
            r10 = r6
            r13 = r9
            r6 = r12
            r12 = r11
            r11 = r5
            r5 = r1
            r1 = r0
        L_0x07a8:
            int r9 = r1 + 1
            java.util.List r0 = r6.getPages()
            java.lang.Object r0 = r0.get(r1)
            androidx.paging.TransformablePage r0 = (androidx.paging.TransformablePage) r0
            qa.q r2 = r8.getGenerator()
            r3.L$0 = r8
            r3.L$1 = r6
            r3.L$2 = r12
            r3.L$3 = r14
            r3.L$4 = r13
            r3.L$5 = r12
            r7 = 0
            r3.L$6 = r7
            r3.L$7 = r7
            r3.L$8 = r7
            r3.L$9 = r7
            r3.Z$0 = r11
            r3.I$0 = r10
            r3.I$1 = r9
            r3.I$2 = r5
            r3.I$3 = r1
            r7 = 9
            r3.label = r7
            java.lang.Object r2 = androidx.paging.SeparatorsKt.insertInternalSeparators(r0, r2, r3)
            if (r2 != r4) goto L_0x07e2
            return r4
        L_0x07e2:
            r15 = r12
        L_0x07e3:
            r12.add(r2)
            if (r1 != r5) goto L_0x07f0
            r0 = r3
            r9 = r6
            r3 = r8
            r6 = r10
            r5 = r11
            r10 = r13
            r1 = r15
            goto L_0x0808
        L_0x07f0:
            r1 = r9
            r12 = r15
            goto L_0x07a8
        L_0x07f3:
            r0 = r3
            r14 = r10
            r1 = r11
            r3 = r13
            r10 = r9
            r9 = r12
            goto L_0x0808
        L_0x07fa:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        L_0x0802:
            r0 = r3
            r1 = r7
            r9 = r14
            r3 = r20
            r14 = r12
        L_0x0808:
            if (r5 == 0) goto L_0x0884
            boolean r2 = r3.getFooterAdded()
            if (r2 != 0) goto L_0x0884
            r2 = 1
            r3.setFooterAdded(r2)
            if (r6 == 0) goto L_0x0821
            java.util.List r2 = r3.getPageStash()
            java.lang.Object r2 = kotlin.collections.C13566b0.m87434i0(r2)
            androidx.paging.TransformablePage r2 = (androidx.paging.TransformablePage) r2
            goto L_0x0825
        L_0x0821:
            kotlin.jvm.internal.C13706o.m87926c(r10)
            r2 = r10
        L_0x0825:
            qa.q r5 = r3.getGenerator()
            java.util.List r6 = r2.getData()
            java.lang.Object r6 = kotlin.collections.C13566b0.m87434i0(r6)
            r0.L$0 = r3
            r0.L$1 = r9
            r0.L$2 = r1
            r0.L$3 = r14
            r0.L$4 = r2
            r0.L$5 = r1
            r7 = 0
            r0.L$6 = r7
            r0.L$7 = r7
            r0.L$8 = r7
            r0.L$9 = r7
            r8 = 10
            r0.label = r8
            java.lang.Object r0 = r5.invoke(r6, r7, r0)
            if (r0 != r4) goto L_0x0851
            return r4
        L_0x0851:
            r16 = r0
            r15 = r1
            r17 = r2
            r5 = r14
        L_0x0857:
            r18 = 0
            int r19 = r17.getHintOriginalPageOffset()
            java.util.List r0 = r17.getHintOriginalIndices()
            if (r0 != 0) goto L_0x0865
            r8 = r7
            goto L_0x086c
        L_0x0865:
            java.lang.Object r0 = kotlin.collections.C13566b0.m87434i0(r0)
            r8 = r0
            java.lang.Integer r8 = (java.lang.Integer) r8
        L_0x086c:
            if (r8 != 0) goto L_0x0877
            java.util.List r0 = r17.getData()
            int r0 = kotlin.collections.C13614t.m87750l(r0)
            goto L_0x087b
        L_0x0877:
            int r0 = r8.intValue()
        L_0x087b:
            r20 = r0
            androidx.paging.SeparatorsKt.addSeparatorPage(r15, r16, r17, r18, r19, r20)
            r23 = r1
            r14 = r5
            goto L_0x0886
        L_0x0884:
            r23 = r1
        L_0x0886:
            r0 = 0
            r3.setEndTerminalSeparatorDeferred(r0)
            r3.setStartTerminalSeparatorDeferred(r0)
            androidx.paging.LoadType r1 = r9.getLoadType()
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            if (r1 != r2) goto L_0x089d
            java.util.List r0 = r3.getPageStash()
            r0.addAll(r14)
            goto L_0x08a4
        L_0x089d:
            java.util.List r1 = r3.getPageStash()
            r1.addAll(r0, r14)
        L_0x08a4:
            androidx.paging.LoadType r22 = r9.getLoadType()
            r9.getPages()
            int r24 = r9.getPlaceholdersBefore()
            int r25 = r9.getPlaceholdersAfter()
            androidx.paging.LoadStates r26 = r9.getSourceLoadStates()
            androidx.paging.LoadStates r27 = r9.getMediatorLoadStates()
            r28 = 0
            androidx.paging.PageEvent$Insert r0 = new androidx.paging.PageEvent$Insert
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            return r0
        L_0x08c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Additional append event after append state is done"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x08d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Additional prepend event after prepend state is done"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onInsert(androidx.paging.PageEvent$Insert, kotlin.coroutines.d):java.lang.Object");
    }

    public final Object onLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate, C13635d<? super PageEvent<R>> dVar) {
        LoadState loadState;
        LoadStates mediatorStates2 = getMediatorStates();
        if (C13706o.m87924a(getSourceStates().snapshot(), loadStateUpdate.getSource()) && C13706o.m87924a(mediatorStates2, loadStateUpdate.getMediator())) {
            return loadStateUpdate;
        }
        getSourceStates().set(loadStateUpdate.getSource());
        setMediatorStates(loadStateUpdate.getMediator());
        LoadState loadState2 = null;
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (mediatorStates2 == null) {
                loadState = null;
            } else {
                loadState = mediatorStates2.getPrepend();
            }
            if (!C13706o.m87924a(loadState, loadStateUpdate.getMediator().getPrepend())) {
                return onInsert(PageEvent.Insert.Companion.Prepend(C13614t.m87748j(), getPlaceholdersBefore(), loadStateUpdate.getSource(), loadStateUpdate.getMediator()), dVar);
            }
        }
        if (loadStateUpdate.getMediator() == null || !loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
            return loadStateUpdate;
        }
        if (mediatorStates2 != null) {
            loadState2 = mediatorStates2.getAppend();
        }
        return !C13706o.m87924a(loadState2, loadStateUpdate.getMediator().getAppend()) ? onInsert(PageEvent.Insert.Companion.Append(C13614t.m87748j(), getPlaceholdersAfter(), loadStateUpdate.getSource(), loadStateUpdate.getMediator()), dVar) : loadStateUpdate;
    }

    public final void setEndTerminalSeparatorDeferred(boolean z) {
        this.endTerminalSeparatorDeferred = z;
    }

    public final void setFooterAdded(boolean z) {
        this.footerAdded = z;
    }

    public final void setHeaderAdded(boolean z) {
        this.headerAdded = z;
    }

    public final void setMediatorStates(LoadStates loadStates) {
        this.mediatorStates = loadStates;
    }

    public final void setPlaceholdersAfter(int i) {
        this.placeholdersAfter = i;
    }

    public final void setPlaceholdersBefore(int i) {
        this.placeholdersBefore = i;
    }

    public final void setStartTerminalSeparatorDeferred(boolean z) {
        this.startTerminalSeparatorDeferred = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r3 = r3.getAppend();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> boolean terminatesEnd(androidx.paging.PageEvent.Insert<T> r3, androidx.paging.TerminalSeparatorType r4) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "terminalSeparatorType"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            androidx.paging.LoadType r0 = r3.getLoadType()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.PREPEND
            if (r0 != r1) goto L_0x0015
            boolean r3 = r2.endTerminalSeparatorDeferred
            return r3
        L_0x0015:
            int[] r0 = androidx.paging.SeparatorState.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0037
            r0 = 2
            if (r4 != r0) goto L_0x0031
            androidx.paging.LoadStates r3 = r3.getSourceLoadStates()
            androidx.paging.LoadState r3 = r3.getAppend()
            boolean r0 = r3.getEndOfPaginationReached()
            goto L_0x005f
        L_0x0031:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x0037:
            androidx.paging.LoadStates r4 = r3.getSourceLoadStates()
            androidx.paging.LoadState r4 = r4.getAppend()
            boolean r4 = r4.getEndOfPaginationReached()
            if (r4 == 0) goto L_0x005e
            androidx.paging.LoadStates r3 = r3.getMediatorLoadStates()
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r3 = 0
            goto L_0x005b
        L_0x004d:
            androidx.paging.LoadState r3 = r3.getAppend()
            if (r3 != 0) goto L_0x0054
            goto L_0x004b
        L_0x0054:
            boolean r3 = r3.getEndOfPaginationReached()
            if (r3 != 0) goto L_0x004b
            r3 = 1
        L_0x005b:
            if (r3 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.terminatesEnd(androidx.paging.PageEvent$Insert, androidx.paging.TerminalSeparatorType):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r3 = r3.getPrepend();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> boolean terminatesStart(androidx.paging.PageEvent.Insert<T> r3, androidx.paging.TerminalSeparatorType r4) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "terminalSeparatorType"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            androidx.paging.LoadType r0 = r3.getLoadType()
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r0 != r1) goto L_0x0015
            boolean r3 = r2.startTerminalSeparatorDeferred
            return r3
        L_0x0015:
            int[] r0 = androidx.paging.SeparatorState.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0037
            r0 = 2
            if (r4 != r0) goto L_0x0031
            androidx.paging.LoadStates r3 = r3.getSourceLoadStates()
            androidx.paging.LoadState r3 = r3.getPrepend()
            boolean r0 = r3.getEndOfPaginationReached()
            goto L_0x005f
        L_0x0031:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x0037:
            androidx.paging.LoadStates r4 = r3.getSourceLoadStates()
            androidx.paging.LoadState r4 = r4.getPrepend()
            boolean r4 = r4.getEndOfPaginationReached()
            if (r4 == 0) goto L_0x005e
            androidx.paging.LoadStates r3 = r3.getMediatorLoadStates()
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r3 = 0
            goto L_0x005b
        L_0x004d:
            androidx.paging.LoadState r3 = r3.getPrepend()
            if (r3 != 0) goto L_0x0054
            goto L_0x004b
        L_0x0054:
            boolean r3 = r3.getEndOfPaginationReached()
            if (r3 != 0) goto L_0x004b
            r3 = 1
        L_0x005b:
            if (r3 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.terminatesStart(androidx.paging.PageEvent$Insert, androidx.paging.TerminalSeparatorType):boolean");
    }
}
