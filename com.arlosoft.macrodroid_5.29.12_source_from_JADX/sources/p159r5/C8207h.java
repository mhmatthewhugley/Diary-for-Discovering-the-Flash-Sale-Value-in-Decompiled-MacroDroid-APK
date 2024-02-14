package p159r5;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.SignInMethodQueryResult;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.h */
/* compiled from: ProviderUtils */
public final class C8207h {

    /* renamed from: r5.h$a */
    /* compiled from: ProviderUtils */
    static class C8208a implements Continuation<SignInMethodQueryResult, Task<List<String>>> {

        /* renamed from: a */
        final /* synthetic */ FlowParameters f19893a;

        C8208a(FlowParameters flowParameters) {
            this.f19893a = flowParameters;
        }

        /* renamed from: b */
        private void m34084b(List<String> list, String str, boolean z) {
            if (!list.remove(str)) {
                return;
            }
            if (z) {
                list.add(0, str);
            } else {
                list.add(str);
            }
        }

        /* renamed from: c */
        private void m34085c(List<String> list) {
            m34084b(list, "password", true);
            m34084b(list, "google.com", true);
            m34084b(list, "emailLink", false);
        }

        /* renamed from: d */
        public Task<List<String>> mo21119a(@NonNull Task<SignInMethodQueryResult> task) {
            List<String> a = task.mo23715p().mo22713a();
            if (a == null) {
                a = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList(this.f19893a.f15985c.size());
            for (AuthUI.IdpConfig b : this.f19893a.f15985c) {
                arrayList.add(b.mo34057b());
            }
            ArrayList arrayList2 = new ArrayList(a.size());
            for (String j : a) {
                String j2 = C8207h.m34083j(j);
                if (arrayList.contains(j2)) {
                    arrayList2.add(0, j2);
                }
            }
            if (arrayList.contains("emailLink") && a.contains("password") && !a.contains("emailLink")) {
                arrayList2.add(0, C8207h.m34083j("emailLink"));
            }
            if (task.mo23719t() && arrayList2.isEmpty() && !a.isEmpty()) {
                return Tasks.m66666e(new FirebaseUiException(3));
            }
            m34085c(arrayList2);
            return Tasks.m66667f(arrayList2);
        }
    }

    /* renamed from: r5.h$b */
    /* compiled from: ProviderUtils */
    static class C8209b implements Continuation<List<String>, Task<String>> {
        C8209b() {
        }

        /* renamed from: b */
        public Task<String> mo21119a(@NonNull Task<List<String>> task) {
            if (!task.mo23719t()) {
                return Tasks.m66666e(task.mo23714o());
            }
            List p = task.mo23715p();
            if (p.isEmpty()) {
                return Tasks.m66667f(null);
            }
            return Tasks.m66667f(p.get(0));
        }
    }

    /* renamed from: a */
    public static String m34074a(@NonNull String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1534095099:
                if (str.equals("https://github.com")) {
                    c = 0;
                    break;
                }
                break;
            case -1294469354:
                if (str.equals("https://phone.firebase")) {
                    c = 1;
                    break;
                }
                break;
            case -376862683:
                if (str.equals("https://accounts.google.com")) {
                    c = 2;
                    break;
                }
                break;
            case 746549591:
                if (str.equals("https://twitter.com")) {
                    c = 3;
                    break;
                }
                break;
            case 1721158175:
                if (str.equals("https://www.facebook.com")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "github.com";
            case 1:
                return "phone";
            case 2:
                return "google.com";
            case 3:
                return "twitter.com";
            case 4:
                return "facebook.com";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static Task<List<String>> m34075b(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return Tasks.m66666e(new NullPointerException("Email cannot be empty"));
        }
        return firebaseAuth.mo22611e(str).mo23712m(new C8208a(flowParameters));
    }

    /* renamed from: c */
    public static Task<String> m34076c(@NonNull FirebaseAuth firebaseAuth, @NonNull FlowParameters flowParameters, @NonNull String str) {
        return m34075b(firebaseAuth, flowParameters, str).mo23712m(new C8209b());
    }

    @Nullable
    /* renamed from: d */
    public static AuthCredential m34077d(IdpResponse idpResponse) {
        if (idpResponse.mo34097p()) {
            return idpResponse.mo34089h();
        }
        String n = idpResponse.mo34095n();
        n.hashCode();
        if (n.equals("google.com")) {
            return GoogleAuthProvider.m6074a(idpResponse.mo34094m(), (String) null);
        }
        if (!n.equals("facebook.com")) {
            return null;
        }
        return FacebookAuthProvider.m5980a(idpResponse.mo34094m());
    }

    @Nullable
    /* renamed from: e */
    public static AuthUI.IdpConfig m34078e(List<AuthUI.IdpConfig> list, String str) {
        for (AuthUI.IdpConfig next : list) {
            if (next.mo34057b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: f */
    public static AuthUI.IdpConfig m34079f(List<AuthUI.IdpConfig> list, String str) {
        AuthUI.IdpConfig e = m34078e(list, str);
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("Provider " + str + " not found.");
    }

    @Nullable
    /* renamed from: g */
    public static String m34080g(@Nullable IdpResponse idpResponse) {
        if (idpResponse == null) {
            return null;
        }
        return m34081h(idpResponse.mo34095n());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34081h(@androidx.annotation.NonNull java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1830313082: goto L_0x003e;
                case -1536293812: goto L_0x0034;
                case -364826023: goto L_0x002a;
                case 106642798: goto L_0x0020;
                case 1216985755: goto L_0x0016;
                case 1985010934: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0048
        L_0x000c:
            java.lang.String r0 = "github.com"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 3
            goto L_0x0049
        L_0x0016:
            java.lang.String r0 = "password"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 5
            goto L_0x0049
        L_0x0020:
            java.lang.String r0 = "phone"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 4
            goto L_0x0049
        L_0x002a:
            java.lang.String r0 = "facebook.com"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0034:
            java.lang.String r0 = "google.com"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 0
            goto L_0x0049
        L_0x003e:
            java.lang.String r0 = "twitter.com"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0048
            r5 = 2
            goto L_0x0049
        L_0x0048:
            r5 = -1
        L_0x0049:
            if (r5 == 0) goto L_0x0061
            if (r5 == r4) goto L_0x005e
            if (r5 == r3) goto L_0x005b
            if (r5 == r2) goto L_0x0058
            if (r5 == r1) goto L_0x0055
            r5 = 0
            return r5
        L_0x0055:
            java.lang.String r5 = "https://phone.firebase"
            return r5
        L_0x0058:
            java.lang.String r5 = "https://github.com"
            return r5
        L_0x005b:
            java.lang.String r5 = "https://twitter.com"
            return r5
        L_0x005e:
            java.lang.String r5 = "https://www.facebook.com"
            return r5
        L_0x0061:
            java.lang.String r5 = "https://accounts.google.com"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p159r5.C8207h.m34081h(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public static String m34082i(@NonNull String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c = 2;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 3;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c = 4;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c = 5;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_twitter);
            case 1:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_google);
            case 2:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_facebook);
            case 3:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_phone);
            case 4:
            case 6:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_email);
            case 5:
                return AuthUI.m25695e().getString(R$string.fui_idp_name_github);
            default:
                return null;
        }
    }

    @NonNull
    /* renamed from: j */
    public static String m34083j(@NonNull String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c = 2;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c = 3;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c = 4;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c = 5;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "twitter.com";
            case 1:
                return "google.com";
            case 2:
                return "facebook.com";
            case 3:
                return "phone";
            case 4:
                return "password";
            case 5:
                return "github.com";
            case 6:
                return "emailLink";
            default:
                return str;
        }
    }
}
