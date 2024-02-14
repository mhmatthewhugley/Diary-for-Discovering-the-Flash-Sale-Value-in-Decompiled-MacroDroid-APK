package androidx.core.p007os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\t\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bH\u0007¨\u0006\n"}, mo71668d2 = {"", "Lja/m;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([Lja/m;)Landroid/os/PersistableBundle;", "", "toPersistableBundle", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.PersistableBundleKt */
/* compiled from: PersistableBundle.kt */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(C13328m<String, ? extends Object>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(mVarArr.length);
        for (C13328m<String, ? extends Object> mVar : mVarArr) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, mVar.mo70152a(), mVar.mo70153b());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        C13706o.m87929f(map, "<this>");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, (String) next.getKey(), next.getValue());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
