package p159r5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.c */
/* compiled from: EmailLinkParser */
public class C8201c {

    /* renamed from: b */
    private static String f19876b = "link";

    /* renamed from: a */
    private Map<String, String> f19877a;

    public C8201c(@NonNull String str) {
        Preconditions.m4484g(str);
        Map<String, String> f = m34032f(Uri.parse(str));
        this.f19877a = f;
        if (f.isEmpty()) {
            throw new IllegalArgumentException("Invalid link: no parameters found");
        }
    }

    /* renamed from: f */
    private Map<String, String> m34032f(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            for (String next : uri.getQueryParameterNames()) {
                if (!next.equalsIgnoreCase(f19876b)) {
                    if (!next.equalsIgnoreCase("continueUrl")) {
                        String queryParameter = uri.getQueryParameter(next);
                        if (queryParameter != null) {
                            hashMap.put(next, queryParameter);
                        }
                    }
                }
                Map<String, String> f = m34032f(Uri.parse(uri.getQueryParameter(next)));
                if (f != null) {
                    hashMap.putAll(f);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo38277a() {
        return this.f19877a.get("ui_auid");
    }

    /* renamed from: b */
    public boolean mo38278b() {
        String str = this.f19877a.get("ui_sd");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("1");
    }

    /* renamed from: c */
    public String mo38279c() {
        return this.f19877a.get("oobCode");
    }

    /* renamed from: d */
    public String mo38280d() {
        return this.f19877a.get("ui_pid");
    }

    /* renamed from: e */
    public String mo38281e() {
        return this.f19877a.get("ui_sid");
    }
}
