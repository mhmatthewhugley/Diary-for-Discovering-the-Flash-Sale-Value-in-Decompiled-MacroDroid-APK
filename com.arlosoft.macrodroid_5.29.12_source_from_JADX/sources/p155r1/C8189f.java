package p155r1;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r1.f */
/* compiled from: SendGridMail */
public class C8189f {

    /* renamed from: a */
    private final Map<String, String> f19850a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f19851b = new HashMap();

    /* renamed from: c */
    private final Map<String, String> f19852c = new HashMap();

    /* renamed from: d */
    private String f19853d;

    /* renamed from: e */
    private final Map<String, String> f19854e = new HashMap();

    /* renamed from: f */
    private final Map<String, String> f19855f = new HashMap();

    /* renamed from: g */
    private final Map<String, String> f19856g = new HashMap();

    /* renamed from: h */
    private final Map<String, Map<String, Boolean>> f19857h = new HashMap();

    /* renamed from: i */
    private String f19858i;

    /* renamed from: j */
    private int f19859j;

    /* renamed from: k */
    private List<C8190a> f19860k = new ArrayList();

    /* renamed from: r1.f$a */
    /* compiled from: SendGridMail */
    static class C8190a {

        /* renamed from: a */
        private final String f19861a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f19862b;

        C8190a(File file) throws IOException {
            this.f19861a = C8186b.m33946a(file);
            this.f19862b = file.getName();
        }

        /* renamed from: d */
        static boolean m33976d(File file) {
            return file != null && file.canRead() && file.exists() && file.isFile();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo38256b() {
            return this.f19861a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo38257c() {
            return this.f19862b;
        }
    }

    /* renamed from: a */
    public void mo38237a(@NonNull Context context, @NonNull Uri uri) throws IOException {
        if (this.f19860k.size() < 10) {
            File b = C8186b.m33947b(context, uri);
            if (C8190a.m33976d(b)) {
                this.f19860k.add(new C8190a(b));
            }
        }
    }

    /* renamed from: b */
    public void mo38238b(@NonNull File file) throws IOException {
        if (this.f19860k.size() < 10 && C8190a.m33976d(file)) {
            this.f19860k.add(new C8190a(file));
        }
    }

    /* renamed from: c */
    public void mo38239c(@NonNull String str, @Nullable String str2) {
        if (this.f19850a.size() < 1000) {
            if (str2 == null) {
                str2 = "";
            }
            this.f19850a.put(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<String> mo38240d() {
        ArrayList arrayList = new ArrayList();
        for (C8190a a : this.f19860k) {
            arrayList.add(a.f19862b);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo38241e() {
        return this.f19854e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<C8190a> mo38242f() {
        return this.f19860k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, String> mo38243g() {
        return this.f19855f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<String, String> mo38244h() {
        return this.f19852c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Map<String, String> mo38245i() {
        return this.f19851b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Map<String, String> mo38246j() {
        return this.f19850a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Map<String, String> mo38247k() {
        return this.f19856g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo38248l() {
        return this.f19859j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo38249m() {
        return this.f19853d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo38250n() {
        return this.f19858i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Map<String, Map<String, Boolean>> mo38251o() {
        return this.f19857h;
    }

    /* renamed from: p */
    public void mo38252p(@NonNull String str) {
        if (str.length() == 0) {
            str = " ";
        }
        this.f19854e.put("text/plain", str);
    }

    /* renamed from: q */
    public void mo38253q(@NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f19855f.put(str, str2);
    }

    /* renamed from: r */
    public void mo38254r(@NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f19856g.put(str, str2);
    }

    /* renamed from: s */
    public void mo38255s(@NonNull String str) {
        if (str.length() == 0) {
            str = " ";
        }
        this.f19853d = str;
    }
}
