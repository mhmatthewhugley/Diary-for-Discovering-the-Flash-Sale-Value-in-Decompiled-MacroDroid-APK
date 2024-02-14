package com.google.firebase.auth;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class ActionCodeUrl {

    /* renamed from: g */
    private static final Map f4485g;

    /* renamed from: a */
    private final String f4486a;

    /* renamed from: b */
    private final String f4487b;

    /* renamed from: c */
    private final String f4488c;
    @Nullable

    /* renamed from: d */
    private final String f4489d;
    @Nullable

    /* renamed from: e */
    private final String f4490e;
    @Nullable

    /* renamed from: f */
    private final String f4491f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f4485g = Collections.unmodifiableMap(hashMap);
    }

    private ActionCodeUrl(String str) {
        String e = m5955e(str, "apiKey");
        String e2 = m5955e(str, "oobCode");
        String e3 = m5955e(str, "mode");
        if (e == null || e2 == null || e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.f4486a = Preconditions.m4484g(e);
        this.f4487b = Preconditions.m4484g(e2);
        this.f4488c = Preconditions.m4484g(e3);
        this.f4489d = m5955e(str, "continueUrl");
        this.f4490e = m5955e(str, "languageCode");
        this.f4491f = m5955e(str, "tenantId");
    }

    @Nullable
    /* renamed from: c */
    public static ActionCodeUrl m5954c(@Nullable String str) {
        Preconditions.m4484g(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private static String m5955e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.m4484g(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo22572a() {
        return this.f4487b;
    }

    /* renamed from: b */
    public int mo22573b() {
        Map map = f4485g;
        if (map.containsKey(this.f4488c)) {
            return ((Integer) map.get(this.f4488c)).intValue();
        }
        return 3;
    }

    @Nullable
    /* renamed from: d */
    public final String mo22574d() {
        return this.f4491f;
    }
}
