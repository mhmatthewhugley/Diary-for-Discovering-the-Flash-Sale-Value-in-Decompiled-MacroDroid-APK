package p159r5;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.g */
/* compiled from: ProviderAvailability */
public final class C8206g {

    /* renamed from: a */
    public static final boolean f19890a = m34073a("com.firebase.ui.auth.data.remote.GitHubSignInHandler");

    /* renamed from: b */
    public static final boolean f19891b = m34073a("com.facebook.login.LoginManager");

    /* renamed from: c */
    public static final boolean f19892c = m34073a("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    /* renamed from: a */
    private static boolean m34073a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
