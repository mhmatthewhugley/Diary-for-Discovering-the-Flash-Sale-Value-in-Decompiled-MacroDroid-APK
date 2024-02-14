package p048t;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: t.e */
/* compiled from: KeyPath */
public class C2097e {

    /* renamed from: c */
    public static final C2097e f6512c = new C2097e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f6513a;
    @Nullable

    /* renamed from: b */
    private C2098f f6514b;

    public C2097e(String... strArr) {
        this.f6513a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m8654b() {
        List<String> list = this.f6513a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m8655f(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public C2097e mo24213a(String str) {
        C2097e eVar = new C2097e(this);
        eVar.f6513a.add(str);
        return eVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public boolean mo24214c(String str, int i) {
        if (i >= this.f6513a.size()) {
            return false;
        }
        boolean z = i == this.f6513a.size() - 1;
        String str2 = this.f6513a.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES);
            if ((z || (i == this.f6513a.size() - 2 && m8654b())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.f6513a.get(i + 1).equals(str)) {
            if (i == this.f6513a.size() - 2 || (i == this.f6513a.size() - 3 && m8654b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f6513a.size() - 1) {
                return false;
            }
            return this.f6513a.get(i2).equals(str);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public C2098f mo24215d() {
        return this.f6514b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public int mo24216e(String str, int i) {
        if (m8655f(str)) {
            return 0;
        }
        if (!this.f6513a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f6513a.size() - 1 && this.f6513a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public boolean mo24217g(String str, int i) {
        if (m8655f(str)) {
            return true;
        }
        if (i >= this.f6513a.size()) {
            return false;
        }
        if (this.f6513a.get(i).equals(str) || this.f6513a.get(i).equals("**") || this.f6513a.get(i).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public boolean mo24218h(String str, int i) {
        if (!"__container".equals(str) && i >= this.f6513a.size() - 1 && !this.f6513a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public C2097e mo24219i(C2098f fVar) {
        C2097e eVar = new C2097e(this);
        eVar.f6514b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f6513a);
        sb.append(",resolved=");
        sb.append(this.f6514b != null);
        sb.append('}');
        return sb.toString();
    }

    private C2097e(C2097e eVar) {
        this.f6513a = new ArrayList(eVar.f6513a);
        this.f6514b = eVar.f6514b;
    }
}
