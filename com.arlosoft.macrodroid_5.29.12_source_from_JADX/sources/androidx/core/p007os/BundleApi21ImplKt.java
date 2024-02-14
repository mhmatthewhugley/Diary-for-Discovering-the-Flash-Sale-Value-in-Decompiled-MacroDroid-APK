package androidx.core.p007os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@RequiresApi(21)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, mo71668d2 = {"Landroidx/core/os/BundleApi21ImplKt;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "Lja/u;", "putSize", "Landroid/util/SizeF;", "putSizeF", "<init>", "()V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: androidx.core.os.BundleApi21ImplKt */
/* compiled from: Bundle.kt */
final class BundleApi21ImplKt {
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @DoNotInline
    public static final void putSize(Bundle bundle, String str, Size size) {
        C13706o.m87929f(bundle, "bundle");
        C13706o.m87929f(str, "key");
        bundle.putSize(str, size);
    }

    @DoNotInline
    public static final void putSizeF(Bundle bundle, String str, SizeF sizeF) {
        C13706o.m87929f(bundle, "bundle");
        C13706o.m87929f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
