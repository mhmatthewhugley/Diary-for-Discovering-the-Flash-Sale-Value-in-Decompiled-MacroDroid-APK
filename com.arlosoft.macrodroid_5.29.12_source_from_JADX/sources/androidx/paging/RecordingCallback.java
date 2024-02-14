package androidx.paging;

import androidx.paging.PagedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p424wa.C16785c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0001R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo71668d2 = {"Landroidx/paging/RecordingCallback;", "Landroidx/paging/PagedList$Callback;", "", "position", "count", "Lja/u;", "onChanged", "onInserted", "onRemoved", "other", "dispatchRecordingTo", "", "list", "Ljava/util/List;", "<init>", "()V", "Companion", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: RecordingCallback.kt */
public final class RecordingCallback extends PagedList.Callback {
    private static final int Changed = 0;
    public static final Companion Companion = new Companion((C13695i) null);
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private final List<Integer> list = new ArrayList();

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo71668d2 = {"Landroidx/paging/RecordingCallback$Companion;", "", "()V", "Changed", "", "Inserted", "Removed", "paging-runtime_release"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: RecordingCallback.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    public final void dispatchRecordingTo(PagedList.Callback callback) {
        C13706o.m87929f(callback, "other");
        C16785c j = C16792h.m99548j(C16792h.m99549k(0, this.list.size()), 3);
        int d = j.mo79764d();
        int f = j.mo79766f();
        int h = j.mo79767h();
        if ((h > 0 && d <= f) || (h < 0 && f <= d)) {
            while (true) {
                int i = d + h;
                int intValue = this.list.get(d).intValue();
                if (intValue == 0) {
                    callback.onChanged(this.list.get(d + 1).intValue(), this.list.get(d + 2).intValue());
                } else if (intValue == 1) {
                    callback.onInserted(this.list.get(d + 1).intValue(), this.list.get(d + 2).intValue());
                } else if (intValue == 2) {
                    callback.onRemoved(this.list.get(d + 1).intValue(), this.list.get(d + 2).intValue());
                } else {
                    throw new IllegalStateException("Unexpected recording value");
                }
                if (d == f) {
                    break;
                }
                d = i;
            }
        }
        this.list.clear();
    }

    public void onChanged(int i, int i2) {
        this.list.add(0);
        this.list.add(Integer.valueOf(i));
        this.list.add(Integer.valueOf(i2));
    }

    public void onInserted(int i, int i2) {
        this.list.add(1);
        this.list.add(Integer.valueOf(i));
        this.list.add(Integer.valueOf(i2));
    }

    public void onRemoved(int i, int i2) {
        this.list.add(2);
        this.list.add(Integer.valueOf(i));
        this.list.add(Integer.valueOf(i2));
    }
}
