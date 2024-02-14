package p127l5;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: l5.a */
/* compiled from: PhoneNumber */
public final class C7687a {

    /* renamed from: d */
    private static final C7687a f18620d = new C7687a("", "", "");

    /* renamed from: a */
    private final String f18621a;

    /* renamed from: b */
    private final String f18622b;

    /* renamed from: c */
    private final String f18623c;

    public C7687a(String str, String str2, String str3) {
        this.f18621a = str;
        this.f18622b = str2;
        this.f18623c = str3;
    }

    /* renamed from: d */
    public static boolean m32053d(C7687a aVar) {
        return aVar != null && !f18620d.equals(aVar) && !TextUtils.isEmpty(aVar.mo37729a()) && !TextUtils.isEmpty(aVar.mo37730b());
    }

    /* renamed from: e */
    public static boolean m32054e(C7687a aVar) {
        return aVar != null && !f18620d.equals(aVar) && !TextUtils.isEmpty(aVar.mo37731c()) && !TextUtils.isEmpty(aVar.mo37729a()) && !TextUtils.isEmpty(aVar.mo37730b());
    }

    /* renamed from: a */
    public String mo37729a() {
        return this.f18623c;
    }

    /* renamed from: b */
    public String mo37730b() {
        return this.f18622b;
    }

    /* renamed from: c */
    public String mo37731c() {
        return this.f18621a;
    }
}
