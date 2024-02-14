package p147p5;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.auth.PhoneAuthCredential;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p5.d */
/* compiled from: PhoneVerification */
public final class C8144d {

    /* renamed from: a */
    private final String f19767a;

    /* renamed from: b */
    private final PhoneAuthCredential f19768b;

    /* renamed from: c */
    private final boolean f19769c;

    public C8144d(@NonNull String str, @NonNull PhoneAuthCredential phoneAuthCredential, boolean z) {
        this.f19767a = str;
        this.f19768b = phoneAuthCredential;
        this.f19769c = z;
    }

    @NonNull
    /* renamed from: a */
    public PhoneAuthCredential mo38157a() {
        return this.f19768b;
    }

    @NonNull
    /* renamed from: b */
    public String mo38158b() {
        return this.f19767a;
    }

    /* renamed from: c */
    public boolean mo38159c() {
        return this.f19769c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8144d.class != obj.getClass()) {
            return false;
        }
        C8144d dVar = (C8144d) obj;
        if (this.f19769c != dVar.f19769c || !this.f19767a.equals(dVar.f19767a) || !this.f19768b.equals(dVar.f19768b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f19767a.hashCode() * 31) + this.f19768b.hashCode()) * 31) + (this.f19769c ? 1 : 0);
    }

    public String toString() {
        return "PhoneVerification{mNumber='" + this.f19767a + '\'' + ", mCredential=" + this.f19768b + ", mIsAutoVerified=" + this.f19769c + '}';
    }
}
