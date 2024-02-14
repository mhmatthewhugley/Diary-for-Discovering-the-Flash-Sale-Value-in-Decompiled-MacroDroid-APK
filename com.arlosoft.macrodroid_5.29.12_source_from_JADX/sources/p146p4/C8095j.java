package p146p4;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* renamed from: p4.j */
/* compiled from: LazyHeaders */
public final class C8095j implements C8092h {

    /* renamed from: c */
    private final Map<String, List<C8094i>> f19688c;

    /* renamed from: d */
    private volatile Map<String, String> f19689d;

    /* renamed from: p4.j$a */
    /* compiled from: LazyHeaders */
    public static final class C8096a {

        /* renamed from: d */
        private static final String f19690d;

        /* renamed from: e */
        private static final Map<String, List<C8094i>> f19691e;

        /* renamed from: a */
        private boolean f19692a = true;

        /* renamed from: b */
        private Map<String, List<C8094i>> f19693b = f19691e;

        /* renamed from: c */
        private boolean f19694c = true;

        static {
            String b = m33700b();
            f19690d = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(HTTP.USER_AGENT, Collections.singletonList(new C8097b(b)));
            }
            f19691e = Collections.unmodifiableMap(hashMap);
        }

        @VisibleForTesting
        /* renamed from: b */
        static String m33700b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C8095j mo38111a() {
            this.f19692a = true;
            return new C8095j(this.f19693b);
        }
    }

    /* renamed from: p4.j$b */
    /* compiled from: LazyHeaders */
    static final class C8097b implements C8094i {
        @NonNull

        /* renamed from: a */
        private final String f19695a;

        C8097b(@NonNull String str) {
            this.f19695a = str;
        }

        /* renamed from: a */
        public String mo38107a() {
            return this.f19695a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8097b) {
                return this.f19695a.equals(((C8097b) obj).f19695a);
            }
            return false;
        }

        public int hashCode() {
            return this.f19695a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f19695a + '\'' + '}';
        }
    }

    C8095j(Map<String, List<C8094i>> map) {
        this.f19688c = Collections.unmodifiableMap(map);
    }

    @NonNull
    /* renamed from: b */
    private String m33697b(@NonNull List<C8094i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo38107a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m33698c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f19688c.entrySet()) {
            String b = m33697b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo38106a() {
        if (this.f19689d == null) {
            synchronized (this) {
                if (this.f19689d == null) {
                    this.f19689d = Collections.unmodifiableMap(m33698c());
                }
            }
        }
        return this.f19689d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8095j) {
            return this.f19688c.equals(((C8095j) obj).f19688c);
        }
        return false;
    }

    public int hashCode() {
        return this.f19688c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f19688c + '}';
    }
}
