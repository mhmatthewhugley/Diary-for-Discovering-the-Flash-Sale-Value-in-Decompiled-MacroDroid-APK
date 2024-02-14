package p146p4;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p090f5.C7315j;
import p102h4.C7380e;

/* renamed from: p4.g */
/* compiled from: GlideUrl */
public class C8091g implements C7380e {

    /* renamed from: b */
    private final C8092h f19679b;
    @Nullable

    /* renamed from: c */
    private final URL f19680c;
    @Nullable

    /* renamed from: d */
    private final String f19681d;
    @Nullable

    /* renamed from: e */
    private String f19682e;
    @Nullable

    /* renamed from: f */
    private URL f19683f;
    @Nullable

    /* renamed from: g */
    private volatile byte[] f19684g;

    /* renamed from: h */
    private int f19685h;

    public C8091g(URL url) {
        this(url, C8092h.f19687b);
    }

    /* renamed from: d */
    private byte[] m33687d() {
        if (this.f19684g == null) {
            this.f19684g = mo38102c().getBytes(C7380e.f18044a);
        }
        return this.f19684g;
    }

    /* renamed from: f */
    private String m33688f() {
        if (TextUtils.isEmpty(this.f19682e)) {
            String str = this.f19681d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C7315j.m30204d(this.f19680c)).toString();
            }
            this.f19682e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f19682e;
    }

    /* renamed from: g */
    private URL m33689g() throws MalformedURLException {
        if (this.f19683f == null) {
            this.f19683f = new URL(m33688f());
        }
        return this.f19683f;
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m33687d());
    }

    /* renamed from: c */
    public String mo38102c() {
        String str = this.f19681d;
        return str != null ? str : ((URL) C7315j.m30204d(this.f19680c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> mo38103e() {
        return this.f19679b.mo38106a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8091g)) {
            return false;
        }
        C8091g gVar = (C8091g) obj;
        if (!mo38102c().equals(gVar.mo38102c()) || !this.f19679b.equals(gVar.f19679b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo38104h() throws MalformedURLException {
        return m33689g();
    }

    public int hashCode() {
        if (this.f19685h == 0) {
            int hashCode = mo38102c().hashCode();
            this.f19685h = hashCode;
            this.f19685h = (hashCode * 31) + this.f19679b.hashCode();
        }
        return this.f19685h;
    }

    public String toString() {
        return mo38102c();
    }

    public C8091g(String str) {
        this(str, C8092h.f19687b);
    }

    public C8091g(URL url, C8092h hVar) {
        this.f19680c = (URL) C7315j.m30204d(url);
        this.f19681d = null;
        this.f19679b = (C8092h) C7315j.m30204d(hVar);
    }

    public C8091g(String str, C8092h hVar) {
        this.f19680c = null;
        this.f19681d = C7315j.m30202b(str);
        this.f19679b = (C8092h) C7315j.m30204d(hVar);
    }
}
