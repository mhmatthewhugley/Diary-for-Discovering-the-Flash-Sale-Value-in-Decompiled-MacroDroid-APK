package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\n\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\b¨\u0006\u0006"}, mo71668d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Half.kt */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s) {
        Half valueOf = Half.valueOf(s);
        C13706o.m87928e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f) {
        Half valueOf = Half.valueOf(f);
        C13706o.m87928e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        C13706o.m87929f(str, "<this>");
        Half valueOf = Half.valueOf(str);
        C13706o.m87928e(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(double d) {
        Half valueOf = Half.valueOf((float) d);
        C13706o.m87928e(valueOf, "valueOf(this)");
        return valueOf;
    }
}
