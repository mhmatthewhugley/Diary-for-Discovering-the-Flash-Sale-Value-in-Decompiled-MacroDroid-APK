package androidx.paging;

import kotlin.Metadata;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo71668d2 = {"androidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C0914xd8884410 implements C15288g<C13339u> {
    final /* synthetic */ C15478k0 $$this$launch$inlined;
    final /* synthetic */ PageFetcherSnapshot this$0;

    public C0914xd8884410(PageFetcherSnapshot pageFetcherSnapshot, C15478k0 k0Var) {
        this.this$0 = pageFetcherSnapshot;
        this.$$this$launch$inlined = k0Var;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x032a, code lost:
        r8 = r12;
        r2 = r13;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x032d, code lost:
        r12 = r9.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0337, code lost:
        if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0[r2.ordinal()] != 1) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0339, code lost:
        r13 = r12;
        r12 = r2;
        r5 = r12;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x033e, code lost:
        r6 = r9.this$0.stateHolder;
        r5 = r6.lock;
        r0.L$0 = r9;
        r0.L$1 = r8;
        r0.L$2 = r2;
        r0.L$3 = r6;
        r0.L$4 = r5;
        r0.L$5 = r2;
        r0.L$6 = r12;
        r0.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x035e, code lost:
        if (r5.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0360, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0361, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r13 = r6.state.getFailedHintsByLoadType$paging_common().get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0370, code lost:
        r5.mo74907b((java.lang.Object) null);
        r5 = r2;
        r2 = r13;
        r13 = r12;
        r12 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0377, code lost:
        r0.L$0 = r9;
        r0.L$1 = r8;
        r0.L$2 = r12;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.L$5 = null;
        r0.L$6 = null;
        r0.label = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038d, code lost:
        if (r13.retryLoadError(r5, r2, r0) != r1) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x038f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0390, code lost:
        r5 = r8;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0394, code lost:
        if (r12 != androidx.paging.LoadType.REFRESH) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0396, code lost:
        r2 = r6.this$0.stateHolder;
        r12 = r2.lock;
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r2;
        r0.L$3 = r12;
        r0.label = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03b0, code lost:
        if (r12.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03b2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r13 = r2.state.getSourceLoadStates$paging_common().get(androidx.paging.LoadType.REFRESH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c1, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03c6, code lost:
        if ((r13 instanceof androidx.paging.LoadState.Error) != false) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c8, code lost:
        r6.this$0.startConsumingHints(r6.$$this$launch$inlined);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03d0, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03d1, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d4, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d5, code lost:
        r12 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d7, code lost:
        r13 = androidx.paging.LoadType.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03df, code lost:
        if ((r12.getAppend() instanceof androidx.paging.LoadState.Error) != false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e5, code lost:
        if (r13 == androidx.paging.LoadType.REFRESH) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e7, code lost:
        r2 = r5.this$0.stateHolder;
        r12 = r2.lock;
        r0.L$0 = r5;
        r0.L$1 = r13;
        r0.L$2 = r2;
        r0.L$3 = r12;
        r0.label = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0401, code lost:
        if (r12.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0403, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r2 = r2.state;
        r6 = r5.this$0;
        r0.L$0 = r5;
        r0.L$1 = r13;
        r0.L$2 = r12;
        r0.L$3 = null;
        r0.label = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x041a, code lost:
        if (r6.setLoading(r2, r13, r0) != r1) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x041c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x041d, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x041e, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0420, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0428, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0429, code lost:
        r7 = r5;
        r12 = r7.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0434, code lost:
        if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0[r2.ordinal()] != 1) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0436, code lost:
        r13 = r12;
        r12 = r2;
        r3 = r12;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x043b, code lost:
        r5 = r7.this$0.stateHolder;
        r3 = r5.lock;
        r0.L$0 = r7;
        r0.L$1 = r2;
        r0.L$2 = r5;
        r0.L$3 = r3;
        r0.L$4 = r2;
        r0.L$5 = r12;
        r0.label = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0459, code lost:
        if (r3.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x045b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x045c, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r13 = r5.state.getFailedHintsByLoadType$paging_common().get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x046b, code lost:
        r3.mo74907b((java.lang.Object) null);
        r3 = r2;
        r2 = r13;
        r13 = r12;
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0472, code lost:
        r0.L$0 = r7;
        r0.L$1 = r12;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.L$5 = null;
        r0.label = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0486, code lost:
        if (r13.retryLoadError(r3, r2, r0) != r1) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0488, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0489, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x048c, code lost:
        if (r12 != androidx.paging.LoadType.REFRESH) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x048e, code lost:
        r12 = r2.this$0.stateHolder;
        r13 = r12.lock;
        r0.L$0 = r2;
        r0.L$1 = r12;
        r0.L$2 = r13;
        r0.label = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a6, code lost:
        if (r13.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04a8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a9, code lost:
        r1 = r12;
        r12 = r13;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r13 = r1.state.getSourceLoadStates$paging_common().get(androidx.paging.LoadType.REFRESH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04ba, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04bf, code lost:
        if ((r13 instanceof androidx.paging.LoadState.Error) != false) goto L_0x04ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04c1, code lost:
        r0.this$0.startConsumingHints(r0.$$this$launch$inlined);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04c9, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04ca, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04cd, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04d0, code lost:
        return p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04d1, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04d2, code lost:
        r3.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04d5, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04d6, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d7, code lost:
        r5.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04da, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04db, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04dc, code lost:
        r5.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04df, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04e0, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04e1, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04e4, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a3, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a5, code lost:
        r12.mo74907b((java.lang.Object) null);
        r8 = r5;
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r13 = r2.state;
        r13 = p297ja.C13337s.m85692a(r13.getSourceLoadStates$paging_common().snapshot(), r13.currentPagingState$paging_common(r5.this$0.hintHandler.getLastAccessHint()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01fd, code lost:
        r12.mo74907b((java.lang.Object) null);
        r12 = (androidx.paging.LoadStates) r13.mo70152a();
        r13 = (androidx.paging.PagingState) r13.mo70153b();
        r2 = r5.this$0.getRemoteMediatorConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0212, code lost:
        if (r2 != null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0215, code lost:
        r2.retryFailed(r13);
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x021a, code lost:
        r13 = androidx.paging.LoadType.REFRESH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0222, code lost:
        if ((r12.getRefresh() instanceof androidx.paging.LoadState.Error) != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0226, code lost:
        r8 = r12;
        r2 = r13;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0229, code lost:
        r12 = r9.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0233, code lost:
        if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0[r2.ordinal()] != 1) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0235, code lost:
        r13 = r12;
        r12 = r2;
        r5 = r12;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x023a, code lost:
        r6 = r9.this$0.stateHolder;
        r5 = r6.lock;
        r0.L$0 = r9;
        r0.L$1 = r8;
        r0.L$2 = r2;
        r0.L$3 = r6;
        r0.L$4 = r5;
        r0.L$5 = r2;
        r0.L$6 = r12;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0259, code lost:
        if (r5.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x025b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x025c, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r13 = r6.state.getFailedHintsByLoadType$paging_common().get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x026b, code lost:
        r5.mo74907b((java.lang.Object) null);
        r5 = r2;
        r2 = r13;
        r13 = r12;
        r12 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0272, code lost:
        r0.L$0 = r9;
        r0.L$1 = r8;
        r0.L$2 = r12;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.L$5 = null;
        r0.L$6 = null;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0287, code lost:
        if (r13.retryLoadError(r5, r2, r0) != r1) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0289, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x028a, code lost:
        r5 = r8;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x028e, code lost:
        if (r12 != androidx.paging.LoadType.REFRESH) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0290, code lost:
        r2 = r6.this$0.stateHolder;
        r12 = r2.lock;
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r2;
        r0.L$3 = r12;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02a9, code lost:
        if (r12.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02ab, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r13 = r2.state.getSourceLoadStates$paging_common().get(androidx.paging.LoadType.REFRESH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02ba, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02bf, code lost:
        if ((r13 instanceof androidx.paging.LoadState.Error) != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02c1, code lost:
        r6.this$0.startConsumingHints(r6.$$this$launch$inlined);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02c9, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02ca, code lost:
        r12.mo74907b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02cd, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ce, code lost:
        r12 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02d0, code lost:
        r13 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02d8, code lost:
        if ((r12.getPrepend() instanceof androidx.paging.LoadState.Error) != false) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02de, code lost:
        if (r13 == androidx.paging.LoadType.REFRESH) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02e0, code lost:
        r2 = r5.this$0.stateHolder;
        r6 = r2.lock;
        r0.L$0 = r5;
        r0.L$1 = r12;
        r0.L$2 = r13;
        r0.L$3 = r2;
        r0.L$4 = r6;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02fb, code lost:
        if (r6.mo74906a((java.lang.Object) null, r0) != r1) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02fd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02fe, code lost:
        r10 = r5;
        r5 = r12;
        r12 = r6;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r2 = r2.state;
        r7 = r6.this$0;
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.L$2 = r13;
        r0.L$3 = r12;
        r0.L$4 = null;
        r0.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r7.setLoading(r2, r13, r0) != r1) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x031d, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031e, code lost:
        r13 = p297ja.C13339u.f61331a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0320, code lost:
        r12.mo74907b((java.lang.Object) null);
        r8 = r5;
        r9 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(p297ja.C13339u r12, kotlin.coroutines.C13635d<? super p297ja.C13339u> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.paging.C0914xd8884410.C09151
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.C0914xd8884410.C09151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x016f;
                case 3: goto L_0x0159;
                case 4: goto L_0x0138;
                case 5: goto L_0x0125;
                case 6: goto L_0x0110;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00a8;
                case 11: goto L_0x0093;
                case 12: goto L_0x007c;
                case 13: goto L_0x0068;
                case 14: goto L_0x004b;
                case 15: goto L_0x003e;
                case 16: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r12 = r0.L$2
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r1 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState.Holder) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r0 = (androidx.paging.C0914xd8884410) r0
            p297ja.C13332o.m85685b(r13)
            goto L_0x04ac
        L_0x003e:
            java.lang.Object r12 = r0.L$1
            androidx.paging.LoadType r12 = (androidx.paging.LoadType) r12
            java.lang.Object r2 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.C0914xd8884410) r2
            p297ja.C13332o.m85685b(r13)
            goto L_0x048a
        L_0x004b:
            java.lang.Object r12 = r0.L$5
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            java.lang.Object r2 = r0.L$4
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r3 = r0.L$3
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.C15536b) r3
            java.lang.Object r5 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            java.lang.Object r6 = r0.L$1
            androidx.paging.LoadType r6 = (androidx.paging.LoadType) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r7 = (androidx.paging.C0914xd8884410) r7
            p297ja.C13332o.m85685b(r13)
            goto L_0x045d
        L_0x0068:
            java.lang.Object r12 = r0.L$2
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$1
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r5 = (androidx.paging.C0914xd8884410) r5
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x0079 }
            goto L_0x041e
        L_0x0079:
            r13 = move-exception
            goto L_0x0424
        L_0x007c:
            java.lang.Object r12 = r0.L$3
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.LoadType r5 = (androidx.paging.LoadType) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r6 = (androidx.paging.C0914xd8884410) r6
            p297ja.C13332o.m85685b(r13)
            r13 = r5
            r5 = r6
            goto L_0x0404
        L_0x0093:
            java.lang.Object r12 = r0.L$3
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.LoadStates r5 = (androidx.paging.LoadStates) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r6 = (androidx.paging.C0914xd8884410) r6
            p297ja.C13332o.m85685b(r13)
            goto L_0x03b3
        L_0x00a8:
            java.lang.Object r12 = r0.L$2
            androidx.paging.LoadType r12 = (androidx.paging.LoadType) r12
            java.lang.Object r2 = r0.L$1
            androidx.paging.LoadStates r2 = (androidx.paging.LoadStates) r2
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r5 = (androidx.paging.C0914xd8884410) r5
            p297ja.C13332o.m85685b(r13)
            r6 = r5
            r5 = r2
            goto L_0x0392
        L_0x00bb:
            java.lang.Object r12 = r0.L$6
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            java.lang.Object r2 = r0.L$5
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r5 = r0.L$4
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r6 = r0.L$3
            androidx.paging.PageFetcherSnapshotState$Holder r6 = (androidx.paging.PageFetcherSnapshotState.Holder) r6
            java.lang.Object r7 = r0.L$2
            androidx.paging.LoadType r7 = (androidx.paging.LoadType) r7
            java.lang.Object r8 = r0.L$1
            androidx.paging.LoadStates r8 = (androidx.paging.LoadStates) r8
            java.lang.Object r9 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r9 = (androidx.paging.C0914xd8884410) r9
            p297ja.C13332o.m85685b(r13)
            goto L_0x0362
        L_0x00dc:
            java.lang.Object r12 = r0.L$3
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$2
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.LoadStates r5 = (androidx.paging.LoadStates) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r6 = (androidx.paging.C0914xd8884410) r6
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x00f1 }
            goto L_0x031e
        L_0x00f1:
            r13 = move-exception
            goto L_0x0326
        L_0x00f4:
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$3
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$2
            androidx.paging.LoadType r5 = (androidx.paging.LoadType) r5
            java.lang.Object r6 = r0.L$1
            androidx.paging.LoadStates r6 = (androidx.paging.LoadStates) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r7 = (androidx.paging.C0914xd8884410) r7
            p297ja.C13332o.m85685b(r13)
            r13 = r5
            r5 = r6
            r6 = r7
            goto L_0x0302
        L_0x0110:
            java.lang.Object r12 = r0.L$3
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$2
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.LoadStates r5 = (androidx.paging.LoadStates) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r6 = (androidx.paging.C0914xd8884410) r6
            p297ja.C13332o.m85685b(r13)
            goto L_0x02ac
        L_0x0125:
            java.lang.Object r12 = r0.L$2
            androidx.paging.LoadType r12 = (androidx.paging.LoadType) r12
            java.lang.Object r2 = r0.L$1
            androidx.paging.LoadStates r2 = (androidx.paging.LoadStates) r2
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r5 = (androidx.paging.C0914xd8884410) r5
            p297ja.C13332o.m85685b(r13)
            r6 = r5
            r5 = r2
            goto L_0x028c
        L_0x0138:
            java.lang.Object r12 = r0.L$6
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            java.lang.Object r2 = r0.L$5
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r5 = r0.L$4
            kotlinx.coroutines.sync.b r5 = (kotlinx.coroutines.sync.C15536b) r5
            java.lang.Object r6 = r0.L$3
            androidx.paging.PageFetcherSnapshotState$Holder r6 = (androidx.paging.PageFetcherSnapshotState.Holder) r6
            java.lang.Object r7 = r0.L$2
            androidx.paging.LoadType r7 = (androidx.paging.LoadType) r7
            java.lang.Object r8 = r0.L$1
            androidx.paging.LoadStates r8 = (androidx.paging.LoadStates) r8
            java.lang.Object r9 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r9 = (androidx.paging.C0914xd8884410) r9
            p297ja.C13332o.m85685b(r13)
            goto L_0x025d
        L_0x0159:
            java.lang.Object r12 = r0.L$3
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$2
            androidx.paging.LoadType r2 = (androidx.paging.LoadType) r2
            java.lang.Object r5 = r0.L$1
            androidx.paging.LoadStates r5 = (androidx.paging.LoadStates) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r6 = (androidx.paging.C0914xd8884410) r6
            p297ja.C13332o.m85685b(r13)     // Catch:{ all -> 0x016d }
            goto L_0x01a3
        L_0x016d:
            r13 = move-exception
            goto L_0x01ac
        L_0x016f:
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$3
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$2
            androidx.paging.LoadType r5 = (androidx.paging.LoadType) r5
            java.lang.Object r6 = r0.L$1
            androidx.paging.LoadStates r6 = (androidx.paging.LoadStates) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r7 = (androidx.paging.C0914xd8884410) r7
            p297ja.C13332o.m85685b(r13)
            androidx.paging.PageFetcherSnapshotState r13 = r2.state     // Catch:{ all -> 0x016d }
            androidx.paging.PageFetcherSnapshot r2 = r7.this$0     // Catch:{ all -> 0x016d }
            r0.L$0 = r7     // Catch:{ all -> 0x016d }
            r0.L$1 = r6     // Catch:{ all -> 0x016d }
            r0.L$2 = r5     // Catch:{ all -> 0x016d }
            r0.L$3 = r12     // Catch:{ all -> 0x016d }
            r0.L$4 = r4     // Catch:{ all -> 0x016d }
            r8 = 3
            r0.label = r8     // Catch:{ all -> 0x016d }
            java.lang.Object r13 = r2.setLoading(r13, r5, r0)     // Catch:{ all -> 0x016d }
            if (r13 != r1) goto L_0x01a0
            return r1
        L_0x01a0:
            r2 = r5
            r5 = r6
            r6 = r7
        L_0x01a3:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x016d }
            r12.mo74907b(r4)
            r8 = r5
            r9 = r6
            goto L_0x0229
        L_0x01ac:
            r12.mo74907b(r4)
            throw r13
        L_0x01b0:
            java.lang.Object r12 = r0.L$2
            kotlinx.coroutines.sync.b r12 = (kotlinx.coroutines.sync.C15536b) r12
            java.lang.Object r2 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r5 = r0.L$0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 r5 = (androidx.paging.C0914xd8884410) r5
            p297ja.C13332o.m85685b(r13)
            goto L_0x01df
        L_0x01c0:
            p297ja.C13332o.m85685b(r13)
            ja.u r12 = (p297ja.C13339u) r12
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r12.stateHolder
            kotlinx.coroutines.sync.b r12 = r2.lock
            r0.L$0 = r11
            r0.L$1 = r2
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r13 = r12.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x01de
            return r1
        L_0x01de:
            r5 = r11
        L_0x01df:
            androidx.paging.PageFetcherSnapshotState r13 = r2.state     // Catch:{ all -> 0x04e0 }
            androidx.paging.MutableLoadStateCollection r2 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x04e0 }
            androidx.paging.LoadStates r2 = r2.snapshot()     // Catch:{ all -> 0x04e0 }
            androidx.paging.PageFetcherSnapshot r6 = r5.this$0     // Catch:{ all -> 0x04e0 }
            androidx.paging.HintHandler r6 = r6.hintHandler     // Catch:{ all -> 0x04e0 }
            androidx.paging.ViewportHint$Access r6 = r6.getLastAccessHint()     // Catch:{ all -> 0x04e0 }
            androidx.paging.PagingState r13 = r13.currentPagingState$paging_common(r6)     // Catch:{ all -> 0x04e0 }
            ja.m r13 = p297ja.C13337s.m85692a(r2, r13)     // Catch:{ all -> 0x04e0 }
            r12.mo74907b(r4)
            java.lang.Object r12 = r13.mo70152a()
            androidx.paging.LoadStates r12 = (androidx.paging.LoadStates) r12
            java.lang.Object r13 = r13.mo70153b()
            androidx.paging.PagingState r13 = (androidx.paging.PagingState) r13
            androidx.paging.PageFetcherSnapshot r2 = r5.this$0
            androidx.paging.RemoteMediatorConnection r2 = r2.getRemoteMediatorConnection()
            if (r2 != 0) goto L_0x0215
            goto L_0x021a
        L_0x0215:
            r2.retryFailed(r13)
            ja.u r13 = p297ja.C13339u.f61331a
        L_0x021a:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.REFRESH
            androidx.paging.LoadState r2 = r12.getRefresh()
            boolean r2 = r2 instanceof androidx.paging.LoadState.Error
            if (r2 != 0) goto L_0x0226
            goto L_0x02d0
        L_0x0226:
            r8 = r12
            r2 = r13
            r9 = r5
        L_0x0229:
            androidx.paging.PageFetcherSnapshot r12 = r9.this$0
            int[] r13 = androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0
            int r5 = r2.ordinal()
            r13 = r13[r5]
            if (r13 != r3) goto L_0x023a
            r13 = r12
            r12 = r2
            r5 = r12
            r2 = r4
            goto L_0x0272
        L_0x023a:
            androidx.paging.PageFetcherSnapshot r13 = r9.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r6 = r13.stateHolder
            kotlinx.coroutines.sync.b r5 = r6.lock
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r2
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.L$6 = r12
            r13 = 4
            r0.label = r13
            java.lang.Object r13 = r5.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x025c
            return r1
        L_0x025c:
            r7 = r2
        L_0x025d:
            androidx.paging.PageFetcherSnapshotState r13 = r6.state     // Catch:{ all -> 0x04db }
            java.util.Map r13 = r13.getFailedHintsByLoadType$paging_common()     // Catch:{ all -> 0x04db }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x04db }
            androidx.paging.ViewportHint r13 = (androidx.paging.ViewportHint) r13     // Catch:{ all -> 0x04db }
            r5.mo74907b(r4)
            r5 = r2
            r2 = r13
            r13 = r12
            r12 = r7
        L_0x0272:
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r12
            r0.L$3 = r4
            r0.L$4 = r4
            r0.L$5 = r4
            r0.L$6 = r4
            r6 = 5
            r0.label = r6
            java.lang.Object r13 = r13.retryLoadError(r5, r2, r0)
            if (r13 != r1) goto L_0x028a
            return r1
        L_0x028a:
            r5 = r8
            r6 = r9
        L_0x028c:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.REFRESH
            if (r12 != r13) goto L_0x02ce
            androidx.paging.PageFetcherSnapshot r12 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r12.stateHolder
            kotlinx.coroutines.sync.b r12 = r2.lock
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r12
            r13 = 6
            r0.label = r13
            java.lang.Object r13 = r12.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x02ac
            return r1
        L_0x02ac:
            androidx.paging.PageFetcherSnapshotState r13 = r2.state     // Catch:{ all -> 0x02c9 }
            androidx.paging.MutableLoadStateCollection r13 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x02c9 }
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x02c9 }
            androidx.paging.LoadState r13 = r13.get(r2)     // Catch:{ all -> 0x02c9 }
            r12.mo74907b(r4)
            boolean r12 = r13 instanceof androidx.paging.LoadState.Error
            if (r12 != 0) goto L_0x02ce
            androidx.paging.PageFetcherSnapshot r12 = r6.this$0
            kotlinx.coroutines.k0 r13 = r6.$$this$launch$inlined
            r12.startConsumingHints(r13)
            goto L_0x02ce
        L_0x02c9:
            r13 = move-exception
            r12.mo74907b(r4)
            throw r13
        L_0x02ce:
            r12 = r5
            r5 = r6
        L_0x02d0:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.PREPEND
            androidx.paging.LoadState r2 = r12.getPrepend()
            boolean r2 = r2 instanceof androidx.paging.LoadState.Error
            if (r2 != 0) goto L_0x02dc
            goto L_0x03d7
        L_0x02dc:
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            if (r13 == r2) goto L_0x032a
            androidx.paging.PageFetcherSnapshot r2 = r5.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r2.stateHolder
            kotlinx.coroutines.sync.b r6 = r2.lock
            r0.L$0 = r5
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r2
            r0.L$4 = r6
            r7 = 7
            r0.label = r7
            java.lang.Object r7 = r6.mo74906a(r4, r0)
            if (r7 != r1) goto L_0x02fe
            return r1
        L_0x02fe:
            r10 = r5
            r5 = r12
            r12 = r6
            r6 = r10
        L_0x0302:
            androidx.paging.PageFetcherSnapshotState r2 = r2.state     // Catch:{ all -> 0x00f1 }
            androidx.paging.PageFetcherSnapshot r7 = r6.this$0     // Catch:{ all -> 0x00f1 }
            r0.L$0 = r6     // Catch:{ all -> 0x00f1 }
            r0.L$1 = r5     // Catch:{ all -> 0x00f1 }
            r0.L$2 = r13     // Catch:{ all -> 0x00f1 }
            r0.L$3 = r12     // Catch:{ all -> 0x00f1 }
            r0.L$4 = r4     // Catch:{ all -> 0x00f1 }
            r8 = 8
            r0.label = r8     // Catch:{ all -> 0x00f1 }
            java.lang.Object r2 = r7.setLoading(r2, r13, r0)     // Catch:{ all -> 0x00f1 }
            if (r2 != r1) goto L_0x031d
            return r1
        L_0x031d:
            r2 = r13
        L_0x031e:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x00f1 }
            r12.mo74907b(r4)
            r8 = r5
            r9 = r6
            goto L_0x032d
        L_0x0326:
            r12.mo74907b(r4)
            throw r13
        L_0x032a:
            r8 = r12
            r2 = r13
            r9 = r5
        L_0x032d:
            androidx.paging.PageFetcherSnapshot r12 = r9.this$0
            int[] r13 = androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0
            int r5 = r2.ordinal()
            r13 = r13[r5]
            if (r13 != r3) goto L_0x033e
            r13 = r12
            r12 = r2
            r5 = r12
            r2 = r4
            goto L_0x0377
        L_0x033e:
            androidx.paging.PageFetcherSnapshot r13 = r9.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r6 = r13.stateHolder
            kotlinx.coroutines.sync.b r5 = r6.lock
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r2
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.L$6 = r12
            r13 = 9
            r0.label = r13
            java.lang.Object r13 = r5.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x0361
            return r1
        L_0x0361:
            r7 = r2
        L_0x0362:
            androidx.paging.PageFetcherSnapshotState r13 = r6.state     // Catch:{ all -> 0x04d6 }
            java.util.Map r13 = r13.getFailedHintsByLoadType$paging_common()     // Catch:{ all -> 0x04d6 }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x04d6 }
            androidx.paging.ViewportHint r13 = (androidx.paging.ViewportHint) r13     // Catch:{ all -> 0x04d6 }
            r5.mo74907b(r4)
            r5 = r2
            r2 = r13
            r13 = r12
            r12 = r7
        L_0x0377:
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r12
            r0.L$3 = r4
            r0.L$4 = r4
            r0.L$5 = r4
            r0.L$6 = r4
            r6 = 10
            r0.label = r6
            java.lang.Object r13 = r13.retryLoadError(r5, r2, r0)
            if (r13 != r1) goto L_0x0390
            return r1
        L_0x0390:
            r5 = r8
            r6 = r9
        L_0x0392:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.REFRESH
            if (r12 != r13) goto L_0x03d5
            androidx.paging.PageFetcherSnapshot r12 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r12.stateHolder
            kotlinx.coroutines.sync.b r12 = r2.lock
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r12
            r13 = 11
            r0.label = r13
            java.lang.Object r13 = r12.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x03b3
            return r1
        L_0x03b3:
            androidx.paging.PageFetcherSnapshotState r13 = r2.state     // Catch:{ all -> 0x03d0 }
            androidx.paging.MutableLoadStateCollection r13 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x03d0 }
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x03d0 }
            androidx.paging.LoadState r13 = r13.get(r2)     // Catch:{ all -> 0x03d0 }
            r12.mo74907b(r4)
            boolean r12 = r13 instanceof androidx.paging.LoadState.Error
            if (r12 != 0) goto L_0x03d5
            androidx.paging.PageFetcherSnapshot r12 = r6.this$0
            kotlinx.coroutines.k0 r13 = r6.$$this$launch$inlined
            r12.startConsumingHints(r13)
            goto L_0x03d5
        L_0x03d0:
            r13 = move-exception
            r12.mo74907b(r4)
            throw r13
        L_0x03d5:
            r12 = r5
            r5 = r6
        L_0x03d7:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.APPEND
            androidx.paging.LoadState r12 = r12.getAppend()
            boolean r12 = r12 instanceof androidx.paging.LoadState.Error
            if (r12 != 0) goto L_0x03e3
            goto L_0x04ce
        L_0x03e3:
            androidx.paging.LoadType r12 = androidx.paging.LoadType.REFRESH
            if (r13 == r12) goto L_0x0428
            androidx.paging.PageFetcherSnapshot r12 = r5.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r2 = r12.stateHolder
            kotlinx.coroutines.sync.b r12 = r2.lock
            r0.L$0 = r5
            r0.L$1 = r13
            r0.L$2 = r2
            r0.L$3 = r12
            r6 = 12
            r0.label = r6
            java.lang.Object r6 = r12.mo74906a(r4, r0)
            if (r6 != r1) goto L_0x0404
            return r1
        L_0x0404:
            androidx.paging.PageFetcherSnapshotState r2 = r2.state     // Catch:{ all -> 0x0079 }
            androidx.paging.PageFetcherSnapshot r6 = r5.this$0     // Catch:{ all -> 0x0079 }
            r0.L$0 = r5     // Catch:{ all -> 0x0079 }
            r0.L$1 = r13     // Catch:{ all -> 0x0079 }
            r0.L$2 = r12     // Catch:{ all -> 0x0079 }
            r0.L$3 = r4     // Catch:{ all -> 0x0079 }
            r7 = 13
            r0.label = r7     // Catch:{ all -> 0x0079 }
            java.lang.Object r2 = r6.setLoading(r2, r13, r0)     // Catch:{ all -> 0x0079 }
            if (r2 != r1) goto L_0x041d
            return r1
        L_0x041d:
            r2 = r13
        L_0x041e:
            ja.u r13 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0079 }
            r12.mo74907b(r4)
            goto L_0x0429
        L_0x0424:
            r12.mo74907b(r4)
            throw r13
        L_0x0428:
            r2 = r13
        L_0x0429:
            r7 = r5
            androidx.paging.PageFetcherSnapshot r12 = r7.this$0
            int[] r13 = androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C09214.WhenMappings.$EnumSwitchMapping$0
            int r5 = r2.ordinal()
            r13 = r13[r5]
            if (r13 != r3) goto L_0x043b
            r13 = r12
            r12 = r2
            r3 = r12
            r2 = r4
            goto L_0x0472
        L_0x043b:
            androidx.paging.PageFetcherSnapshot r13 = r7.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = r13.stateHolder
            kotlinx.coroutines.sync.b r3 = r5.lock
            r0.L$0 = r7
            r0.L$1 = r2
            r0.L$2 = r5
            r0.L$3 = r3
            r0.L$4 = r2
            r0.L$5 = r12
            r13 = 14
            r0.label = r13
            java.lang.Object r13 = r3.mo74906a(r4, r0)
            if (r13 != r1) goto L_0x045c
            return r1
        L_0x045c:
            r6 = r2
        L_0x045d:
            androidx.paging.PageFetcherSnapshotState r13 = r5.state     // Catch:{ all -> 0x04d1 }
            java.util.Map r13 = r13.getFailedHintsByLoadType$paging_common()     // Catch:{ all -> 0x04d1 }
            java.lang.Object r13 = r13.get(r6)     // Catch:{ all -> 0x04d1 }
            androidx.paging.ViewportHint r13 = (androidx.paging.ViewportHint) r13     // Catch:{ all -> 0x04d1 }
            r3.mo74907b(r4)
            r3 = r2
            r2 = r13
            r13 = r12
            r12 = r6
        L_0x0472:
            r0.L$0 = r7
            r0.L$1 = r12
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r0.L$5 = r4
            r5 = 15
            r0.label = r5
            java.lang.Object r13 = r13.retryLoadError(r3, r2, r0)
            if (r13 != r1) goto L_0x0489
            return r1
        L_0x0489:
            r2 = r7
        L_0x048a:
            androidx.paging.LoadType r13 = androidx.paging.LoadType.REFRESH
            if (r12 != r13) goto L_0x04ce
            androidx.paging.PageFetcherSnapshot r12 = r2.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r12 = r12.stateHolder
            kotlinx.coroutines.sync.b r13 = r12.lock
            r0.L$0 = r2
            r0.L$1 = r12
            r0.L$2 = r13
            r3 = 16
            r0.label = r3
            java.lang.Object r0 = r13.mo74906a(r4, r0)
            if (r0 != r1) goto L_0x04a9
            return r1
        L_0x04a9:
            r1 = r12
            r12 = r13
            r0 = r2
        L_0x04ac:
            androidx.paging.PageFetcherSnapshotState r13 = r1.state     // Catch:{ all -> 0x04c9 }
            androidx.paging.MutableLoadStateCollection r13 = r13.getSourceLoadStates$paging_common()     // Catch:{ all -> 0x04c9 }
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x04c9 }
            androidx.paging.LoadState r13 = r13.get(r1)     // Catch:{ all -> 0x04c9 }
            r12.mo74907b(r4)
            boolean r12 = r13 instanceof androidx.paging.LoadState.Error
            if (r12 != 0) goto L_0x04ce
            androidx.paging.PageFetcherSnapshot r12 = r0.this$0
            kotlinx.coroutines.k0 r13 = r0.$$this$launch$inlined
            r12.startConsumingHints(r13)
            goto L_0x04ce
        L_0x04c9:
            r13 = move-exception
            r12.mo74907b(r4)
            throw r13
        L_0x04ce:
            ja.u r12 = p297ja.C13339u.f61331a
            return r12
        L_0x04d1:
            r12 = move-exception
            r3.mo74907b(r4)
            throw r12
        L_0x04d6:
            r12 = move-exception
            r5.mo74907b(r4)
            throw r12
        L_0x04db:
            r12 = move-exception
            r5.mo74907b(r4)
            throw r12
        L_0x04e0:
            r13 = move-exception
            r12.mo74907b(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C0914xd8884410.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
