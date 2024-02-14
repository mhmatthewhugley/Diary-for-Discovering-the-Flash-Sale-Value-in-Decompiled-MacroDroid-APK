package com.firebase.p073ui.auth;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.data.model.User;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;

/* renamed from: com.firebase.ui.auth.IdpResponse */
public class IdpResponse implements Parcelable {
    public static final Parcelable.Creator<IdpResponse> CREATOR = new C6844a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final User f15938a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AuthCredential f15939c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f15940d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f15941f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f15942g;

    /* renamed from: o */
    private final FirebaseUiException f15943o;

    /* renamed from: com.firebase.ui.auth.IdpResponse$a */
    static class C6844a implements Parcelable.Creator<IdpResponse> {
        C6844a() {
        }

        /* renamed from: a */
        public IdpResponse createFromParcel(Parcel parcel) {
            User user = (User) parcel.readParcelable(User.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new IdpResponse(user, readString, readString2, z, (FirebaseUiException) parcel.readSerializable(), (AuthCredential) parcel.readParcelable(AuthCredential.class.getClassLoader()), (C6844a) null);
        }

        /* renamed from: b */
        public IdpResponse[] newArray(int i) {
            return new IdpResponse[i];
        }
    }

    /* synthetic */ IdpResponse(User user, String str, String str2, AuthCredential authCredential, boolean z, C6844a aVar) {
        this(user, str, str2, authCredential, z);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public static IdpResponse m25762f(@NonNull Exception exc) {
        if (exc instanceof FirebaseUiException) {
            return new IdpResponse((FirebaseUiException) exc);
        }
        if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
            return ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a();
        }
        if (exc instanceof FirebaseUiUserCollisionException) {
            FirebaseUiUserCollisionException firebaseUiUserCollisionException = (FirebaseUiUserCollisionException) exc;
            return new IdpResponse(new User.C6853b(firebaseUiUserCollisionException.mo34086d(), firebaseUiUserCollisionException.mo34084b()).mo34171a(), (String) null, (String) null, false, new FirebaseUiException(firebaseUiUserCollisionException.mo34085c(), firebaseUiUserCollisionException.getMessage()), firebaseUiUserCollisionException.mo34083a());
        }
        FirebaseUiException firebaseUiException = new FirebaseUiException(0, exc.getMessage());
        firebaseUiException.setStackTrace(exc.getStackTrace());
        return new IdpResponse(firebaseUiException);
    }

    @Nullable
    /* renamed from: g */
    public static IdpResponse m25763g(@Nullable Intent intent) {
        if (intent != null) {
            return (IdpResponse) intent.getParcelableExtra("extra_idp_response");
        }
        return null;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public static Intent m25764k(@NonNull Exception exc) {
        return m25762f(exc).mo34101t();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        FirebaseUiException firebaseUiException;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdpResponse idpResponse = (IdpResponse) obj;
        User user = this.f15938a;
        if (user != null ? user.equals(idpResponse.f15938a) : idpResponse.f15938a == null) {
            String str = this.f15940d;
            if (str != null ? str.equals(idpResponse.f15940d) : idpResponse.f15940d == null) {
                String str2 = this.f15941f;
                if (str2 != null ? str2.equals(idpResponse.f15941f) : idpResponse.f15941f == null) {
                    if (this.f15942g == idpResponse.f15942g && ((firebaseUiException = this.f15943o) != null ? firebaseUiException.equals(idpResponse.f15943o) : idpResponse.f15943o == null)) {
                        AuthCredential authCredential = this.f15939c;
                        if (authCredential == null) {
                            if (idpResponse.f15939c == null) {
                                return true;
                            }
                        } else if (authCredential.mo22576l2().equals(idpResponse.f15939c.mo22576l2())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: h */
    public AuthCredential mo34089h() {
        return this.f15939c;
    }

    public int hashCode() {
        User user = this.f15938a;
        int i = 0;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.f15940d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15941f;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f15942g ? 1 : 0)) * 31;
        FirebaseUiException firebaseUiException = this.f15943o;
        int hashCode4 = (hashCode3 + (firebaseUiException == null ? 0 : firebaseUiException.hashCode())) * 31;
        AuthCredential authCredential = this.f15939c;
        if (authCredential != null) {
            i = authCredential.mo22576l2().hashCode();
        }
        return hashCode4 + i;
    }

    @Nullable
    /* renamed from: i */
    public String mo34091i() {
        User user = this.f15938a;
        if (user != null) {
            return user.mo34158a();
        }
        return null;
    }

    @Nullable
    /* renamed from: j */
    public FirebaseUiException mo34092j() {
        return this.f15943o;
    }

    @Nullable
    /* renamed from: l */
    public String mo34093l() {
        return this.f15941f;
    }

    @Nullable
    /* renamed from: m */
    public String mo34094m() {
        return this.f15940d;
    }

    @Nullable
    /* renamed from: n */
    public String mo34095n() {
        User user = this.f15938a;
        if (user != null) {
            return user.mo34161d();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public User mo34096o() {
        return this.f15938a;
    }

    @Nullable
    /* renamed from: p */
    public boolean mo34097p() {
        return this.f15939c != null;
    }

    /* renamed from: q */
    public boolean mo34098q() {
        return (this.f15939c == null && mo34091i() == null) ? false : true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public boolean mo34099r() {
        return this.f15943o == null;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public C6845b mo34100s() {
        if (mo34099r()) {
            return new C6845b(this);
        }
        throw new IllegalStateException("Cannot mutate an unsuccessful response.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public Intent mo34101t() {
        return new Intent().putExtra("extra_idp_response", this);
    }

    public String toString() {
        return "IdpResponse{mUser=" + this.f15938a + ", mToken='" + this.f15940d + '\'' + ", mSecret='" + this.f15941f + '\'' + ", mIsNewUser='" + this.f15942g + '\'' + ", mException=" + this.f15943o + ", mPendingCredential=" + this.f15939c + '}';
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public IdpResponse mo34103u(AuthResult authResult) {
        return mo34100s().mo34110b(authResult.mo22579N1().mo22575R0()).mo34109a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|9|12|13|(0)|17|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069 A[SYNTHETIC, Splitter:B:15:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[SYNTHETIC, Splitter:B:21:0x0074] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            com.firebase.ui.auth.data.model.User r0 = r4.f15938a
            r5.writeParcelable(r0, r6)
            java.lang.String r6 = r4.f15940d
            r5.writeString(r6)
            java.lang.String r6 = r4.f15941f
            r5.writeString(r6)
            boolean r6 = r4.f15942g
            r5.writeInt(r6)
            r6 = 0
            r0 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0035 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0035 }
            r2.<init>()     // Catch:{ IOException -> 0x0035 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0035 }
            com.firebase.ui.auth.FirebaseUiException r6 = r4.f15943o     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r1.writeObject(r6)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            com.firebase.ui.auth.FirebaseUiException r6 = r4.f15943o     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r5.writeSerializable(r6)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r1.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x006c
        L_0x002e:
            r5 = move-exception
            r6 = r1
            goto L_0x0072
        L_0x0031:
            r6 = r1
            goto L_0x0035
        L_0x0033:
            r5 = move-exception
            goto L_0x0072
        L_0x0035:
            com.firebase.ui.auth.FirebaseUiException r1 = new com.firebase.ui.auth.FirebaseUiException     // Catch:{ all -> 0x0033 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0033 }
            r2.<init>()     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = "Exception serialization error, forced wrapping. Original: "
            r2.append(r3)     // Catch:{ all -> 0x0033 }
            com.firebase.ui.auth.FirebaseUiException r3 = r4.f15943o     // Catch:{ all -> 0x0033 }
            r2.append(r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = ", original cause: "
            r2.append(r3)     // Catch:{ all -> 0x0033 }
            com.firebase.ui.auth.FirebaseUiException r3 = r4.f15943o     // Catch:{ all -> 0x0033 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ all -> 0x0033 }
            r2.append(r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0033 }
            r1.<init>((int) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0033 }
            com.firebase.ui.auth.FirebaseUiException r2 = r4.f15943o     // Catch:{ all -> 0x0033 }
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()     // Catch:{ all -> 0x0033 }
            r1.setStackTrace(r2)     // Catch:{ all -> 0x0033 }
            r5.writeSerializable(r1)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x006c
            r6.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            com.google.firebase.auth.AuthCredential r6 = r4.f15939c
            r5.writeParcelable(r6, r0)
            return
        L_0x0072:
            if (r6 == 0) goto L_0x0077
            r6.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.p073ui.auth.IdpResponse.writeToParcel(android.os.Parcel, int):void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.firebase.ui.auth.IdpResponse$b */
    public static class C6845b {

        /* renamed from: a */
        private User f15944a;

        /* renamed from: b */
        private AuthCredential f15945b;

        /* renamed from: c */
        private String f15946c;

        /* renamed from: d */
        private String f15947d;

        /* renamed from: e */
        private boolean f15948e;

        public C6845b() {
        }

        public C6845b(@NonNull User user) {
            this.f15944a = user;
        }

        /* renamed from: a */
        public IdpResponse mo34109a() {
            if (this.f15945b != null && this.f15944a == null) {
                return new IdpResponse(this.f15945b, new FirebaseUiException(5), (C6844a) null);
            }
            String d = this.f15944a.mo34161d();
            if (AuthUI.f15909g.contains(d) && TextUtils.isEmpty(this.f15946c)) {
                throw new IllegalStateException("Token cannot be null when using a non-email provider.");
            } else if (!d.equals("twitter.com") || !TextUtils.isEmpty(this.f15947d)) {
                return new IdpResponse(this.f15944a, this.f15946c, this.f15947d, this.f15945b, this.f15948e, (C6844a) null);
            } else {
                throw new IllegalStateException("Secret cannot be null when using the Twitter provider.");
            }
        }

        /* renamed from: b */
        public C6845b mo34110b(boolean z) {
            this.f15948e = z;
            return this;
        }

        /* renamed from: c */
        public C6845b mo34111c(AuthCredential authCredential) {
            this.f15945b = authCredential;
            return this;
        }

        /* renamed from: d */
        public C6845b mo34112d(String str) {
            this.f15947d = str;
            return this;
        }

        /* renamed from: e */
        public C6845b mo34113e(String str) {
            this.f15946c = str;
            return this;
        }

        public C6845b(@NonNull IdpResponse idpResponse) {
            this.f15944a = idpResponse.f15938a;
            this.f15946c = idpResponse.f15940d;
            this.f15947d = idpResponse.f15941f;
            this.f15948e = idpResponse.f15942g;
            this.f15945b = idpResponse.f15939c;
        }
    }

    /* synthetic */ IdpResponse(User user, String str, String str2, boolean z, FirebaseUiException firebaseUiException, AuthCredential authCredential, C6844a aVar) {
        this(user, str, str2, z, firebaseUiException, authCredential);
    }

    /* synthetic */ IdpResponse(AuthCredential authCredential, FirebaseUiException firebaseUiException, C6844a aVar) {
        this(authCredential, firebaseUiException);
    }

    private IdpResponse(@NonNull FirebaseUiException firebaseUiException) {
        this((User) null, (String) null, (String) null, false, firebaseUiException, (AuthCredential) null);
    }

    private IdpResponse(@NonNull User user, @Nullable String str, @Nullable String str2, @Nullable AuthCredential authCredential, boolean z) {
        this(user, str, str2, z, (FirebaseUiException) null, authCredential);
    }

    private IdpResponse(AuthCredential authCredential, FirebaseUiException firebaseUiException) {
        this((User) null, (String) null, (String) null, false, firebaseUiException, authCredential);
    }

    private IdpResponse(User user, String str, String str2, boolean z, FirebaseUiException firebaseUiException, AuthCredential authCredential) {
        this.f15938a = user;
        this.f15940d = str;
        this.f15941f = str2;
        this.f15942g = z;
        this.f15943o = firebaseUiException;
        this.f15939c = authCredential;
    }
}
