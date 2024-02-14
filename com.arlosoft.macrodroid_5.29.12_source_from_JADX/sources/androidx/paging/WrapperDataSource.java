package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u001b¢\u0006\u0004\b$\u0010%J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0013\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR,\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, mo71668d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "Lja/u;", "addInvalidatedCallback", "removeInvalidatedCallback", "invalidate", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "", "source", "dest", "stashKeysIfNeeded", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "load", "Landroidx/paging/DataSource;", "Landroidx/arch/core/util/Function;", "listFunction", "Landroidx/arch/core/util/Function;", "Ljava/util/IdentityHashMap;", "keyMap", "Ljava/util/IdentityHashMap;", "", "isInvalid", "()Z", "<init>", "(Landroidx/paging/DataSource;Landroidx/arch/core/util/Function;)V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: WrapperDataSource.kt */
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {
    private final IdentityHashMap<ValueTo, Key> keyMap;
    private final Function<List<ValueFrom>, List<ValueTo>> listFunction;
    private final DataSource<Key, ValueFrom> source;

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: WrapperDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapperDataSource(DataSource<Key, ValueFrom> dataSource, Function<List<ValueFrom>, List<ValueTo>> function) {
        super(dataSource.getType$paging_common());
        C13706o.m87929f(dataSource, "source");
        C13706o.m87929f(function, "listFunction");
        this.source = dataSource;
        this.listFunction = function;
        this.keyMap = WhenMappings.$EnumSwitchMapping$0[dataSource.getType$paging_common().ordinal()] == 1 ? new IdentityHashMap<>() : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object load$suspendImpl(androidx.paging.WrapperDataSource r4, androidx.paging.DataSource.Params r5, kotlin.coroutines.C13635d r6) {
        /*
            boolean r0 = r6 instanceof androidx.paging.WrapperDataSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.WrapperDataSource$load$1 r0 = (androidx.paging.WrapperDataSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.WrapperDataSource$load$1 r0 = new androidx.paging.WrapperDataSource$load$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            androidx.paging.WrapperDataSource r4 = (androidx.paging.WrapperDataSource) r4
            p297ja.C13332o.m85685b(r6)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p297ja.C13332o.m85685b(r6)
            androidx.paging.DataSource<Key, ValueFrom> r6 = r4.source
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.load$paging_common(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            androidx.paging.DataSource$BaseResult r6 = (androidx.paging.DataSource.BaseResult) r6
            androidx.paging.DataSource$BaseResult$Companion r5 = androidx.paging.DataSource.BaseResult.Companion
            androidx.arch.core.util.Function<java.util.List<ValueFrom>, java.util.List<ValueTo>> r0 = r4.listFunction
            androidx.paging.DataSource$BaseResult r5 = r5.convert$paging_common(r6, r0)
            java.util.List<Value> r6 = r6.data
            java.util.List<Value> r0 = r5.data
            r4.stashKeysIfNeeded(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.WrapperDataSource.load$suspendImpl(androidx.paging.WrapperDataSource, androidx.paging.DataSource$Params, kotlin.coroutines.d):java.lang.Object");
    }

    public void addInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(invalidatedCallback);
    }

    public Key getKeyInternal$paging_common(ValueTo valueto) {
        Key key;
        C13706o.m87929f(valueto, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                key = this.keyMap.get(valueto);
                C13706o.m87926c(key);
                C13706o.m87928e(key, "keyMap[item]!!");
            }
            return key;
        }
        throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
    }

    public void invalidate() {
        this.source.invalidate();
    }

    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    public Object load$paging_common(DataSource.Params<Key> params, C13635d<? super DataSource.BaseResult<ValueTo>> dVar) {
        return load$suspendImpl(this, params, dVar);
    }

    public void removeInvalidatedCallback(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(invalidatedCallback);
    }

    public final void stashKeysIfNeeded(List<? extends ValueFrom> list, List<? extends ValueTo> list2) {
        C13706o.m87929f(list, "source");
        C13706o.m87929f(list2, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                int i = 0;
                int size = list2.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        this.keyMap.put(list2.get(i), ((ItemKeyedDataSource) this.source).getKey(list.get(i)));
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                C13339u uVar = C13339u.f61331a;
            }
        }
    }
}
