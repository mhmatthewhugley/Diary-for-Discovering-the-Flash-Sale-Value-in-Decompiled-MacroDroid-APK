package p159r5;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.Preconditions;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.b */
/* compiled from: ContinueUrlBuilder */
public class C8200b {

    /* renamed from: a */
    private StringBuilder f19875a;

    public C8200b(@NonNull String str) {
        Preconditions.m4484g(str);
        this.f19875a = new StringBuilder(str + "?");
    }

    /* renamed from: a */
    private void m34026a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = this.f19875a;
            this.f19875a.append(String.format("%s%s=%s", new Object[]{sb.charAt(sb.length() - 1) == '?' ? "" : "&", str, str2}));
        }
    }

    /* renamed from: b */
    public C8200b mo38272b(@NonNull String str) {
        m34026a("ui_auid", str);
        return this;
    }

    /* renamed from: c */
    public C8200b mo38273c(@NonNull boolean z) {
        m34026a("ui_sd", z ? "1" : "0");
        return this;
    }

    /* renamed from: d */
    public C8200b mo38274d(@NonNull String str) {
        m34026a("ui_pid", str);
        return this;
    }

    /* renamed from: e */
    public C8200b mo38275e(@NonNull String str) {
        m34026a("ui_sid", str);
        return this;
    }

    /* renamed from: f */
    public String mo38276f() {
        StringBuilder sb = this.f19875a;
        if (sb.charAt(sb.length() - 1) == '?') {
            StringBuilder sb2 = this.f19875a;
            sb2.setLength(sb2.length() - 1);
        }
        return this.f19875a.toString();
    }
}
