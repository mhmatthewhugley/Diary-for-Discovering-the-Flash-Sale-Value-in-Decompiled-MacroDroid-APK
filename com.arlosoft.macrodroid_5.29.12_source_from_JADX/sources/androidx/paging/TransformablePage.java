package androidx.paging;

import androidx.paging.ViewportHint;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 &*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001&B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007B3\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\tHÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003JE\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J.\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, mo71668d2 = {"Landroidx/paging/TransformablePage;", "T", "", "originalPageOffset", "", "data", "", "(ILjava/util/List;)V", "originalPageOffsets", "", "hintOriginalPageOffset", "hintOriginalIndices", "([ILjava/util/List;ILjava/util/List;)V", "getData", "()Ljava/util/List;", "getHintOriginalIndices", "getHintOriginalPageOffset", "()I", "getOriginalPageOffsets", "()[I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "viewportHintFor", "Landroidx/paging/ViewportHint$Access;", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: TransformablePage.kt */
public final class TransformablePage<T> {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final TransformablePage<Object> EMPTY_INITIAL_PAGE = new TransformablePage<>(0, C13614t.m87748j());
    private final List<T> data;
    private final List<Integer> hintOriginalIndices;
    private final int hintOriginalPageOffset;
    private final int[] originalPageOffsets;

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0001\u0010\b*\u00020\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "()V", "EMPTY_INITIAL_PAGE", "Landroidx/paging/TransformablePage;", "getEMPTY_INITIAL_PAGE", "()Landroidx/paging/TransformablePage;", "empty", "T", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: TransformablePage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final <T> TransformablePage<T> empty() {
            return getEMPTY_INITIAL_PAGE();
        }

        public final TransformablePage<Object> getEMPTY_INITIAL_PAGE() {
            return TransformablePage.EMPTY_INITIAL_PAGE;
        }
    }

    public TransformablePage(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        C13706o.m87929f(iArr, "originalPageOffsets");
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.originalPageOffsets = iArr;
        this.data = list;
        this.hintOriginalPageOffset = i;
        this.hintOriginalIndices = list2;
        boolean z = false;
        if (!(iArr.length == 0)) {
            if (!((list2 == null || list2.size() == list.size()) ? true : z)) {
                StringBuilder sb = new StringBuilder();
                sb.append("If originalIndices (size = ");
                List<Integer> hintOriginalIndices2 = getHintOriginalIndices();
                C13706o.m87926c(hintOriginalIndices2);
                sb.append(hintOriginalIndices2.size());
                sb.append(") is provided, it must be same length as data (size = ");
                sb.append(getData().size());
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return;
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    public static /* synthetic */ TransformablePage copy$default(TransformablePage transformablePage, int[] iArr, List<T> list, int i, List<Integer> list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iArr = transformablePage.originalPageOffsets;
        }
        if ((i2 & 2) != 0) {
            list = transformablePage.data;
        }
        if ((i2 & 4) != 0) {
            i = transformablePage.hintOriginalPageOffset;
        }
        if ((i2 & 8) != 0) {
            list2 = transformablePage.hintOriginalIndices;
        }
        return transformablePage.copy(iArr, list, i, list2);
    }

    public final int[] component1() {
        return this.originalPageOffsets;
    }

    public final List<T> component2() {
        return this.data;
    }

    public final int component3() {
        return this.hintOriginalPageOffset;
    }

    public final List<Integer> component4() {
        return this.hintOriginalIndices;
    }

    public final TransformablePage<T> copy(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        C13706o.m87929f(iArr, "originalPageOffsets");
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        return new TransformablePage<>(iArr, list, i, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(TransformablePage.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && C13706o.m87924a(this.data, transformablePage.data) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset && C13706o.m87924a(this.hintOriginalIndices, transformablePage.hintOriginalIndices);
    }

    public final List<T> getData() {
        return this.data;
    }

    public final List<Integer> getHintOriginalIndices() {
        return this.hintOriginalIndices;
    }

    public final int getHintOriginalPageOffset() {
        return this.hintOriginalPageOffset;
    }

    public final int[] getOriginalPageOffsets() {
        return this.originalPageOffsets;
    }

    public int hashCode() {
        int hashCode = ((((Arrays.hashCode(this.originalPageOffsets) * 31) + this.data.hashCode()) * 31) + this.hintOriginalPageOffset) * 31;
        List<Integer> list = this.hintOriginalIndices;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.originalPageOffsets) + ", data=" + this.data + ", hintOriginalPageOffset=" + this.hintOriginalPageOffset + ", hintOriginalIndices=" + this.hintOriginalIndices + ')';
    }

    public final ViewportHint.Access viewportHintFor(int i, int i2, int i3, int i4, int i5) {
        C16788e k;
        int i6 = this.hintOriginalPageOffset;
        List<Integer> list = this.hintOriginalIndices;
        boolean z = true;
        if (list == null || (k = C13614t.m87749k(list)) == null || !k.mo79775k(i)) {
            z = false;
        }
        if (z) {
            i = this.hintOriginalIndices.get(i).intValue();
        }
        return new ViewportHint.Access(i6, i, i2, i3, i4, i5);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, (List<Integer>) null);
        C13706o.m87929f(list, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
    }
}
