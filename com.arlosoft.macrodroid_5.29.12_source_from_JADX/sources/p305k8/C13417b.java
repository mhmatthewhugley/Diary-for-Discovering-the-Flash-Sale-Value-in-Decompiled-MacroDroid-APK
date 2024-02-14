package p305k8;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: k8.b */
/* compiled from: BundleKeyComparator */
public final class C13417b implements Comparator<String>, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public int compare(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
