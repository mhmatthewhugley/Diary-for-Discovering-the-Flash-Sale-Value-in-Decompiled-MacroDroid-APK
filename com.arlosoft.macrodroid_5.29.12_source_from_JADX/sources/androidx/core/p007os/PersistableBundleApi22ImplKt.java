package androidx.core.p007os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@RequiresApi(22)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0007¨\u0006\u000e"}, mo71668d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "Landroid/os/PersistableBundle;", "persistableBundle", "", "key", "", "value", "Lja/u;", "putBoolean", "", "putBooleanArray", "<init>", "()V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.PersistableBundleApi22ImplKt */
/* compiled from: PersistableBundle.kt */
final class PersistableBundleApi22ImplKt {
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    public static final void putBoolean(PersistableBundle persistableBundle, String str, boolean z) {
        C13706o.m87929f(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @DoNotInline
    public static final void putBooleanArray(PersistableBundle persistableBundle, String str, boolean[] zArr) {
        C13706o.m87929f(persistableBundle, "persistableBundle");
        C13706o.m87929f(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
