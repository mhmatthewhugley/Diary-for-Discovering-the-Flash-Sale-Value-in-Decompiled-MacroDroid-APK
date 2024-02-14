package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p204firebaseauthapi.zzzy;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class FirebaseUser extends AbstractSafeParcelable implements UserInfo {
    @NonNull
    /* renamed from: A2 */
    public abstract zzzy mo22641A2();

    @NonNull
    /* renamed from: B2 */
    public abstract String mo22642B2();

    @NonNull
    /* renamed from: C2 */
    public abstract String mo22643C2();

    @Nullable
    /* renamed from: D2 */
    public abstract List mo22644D2();

    /* renamed from: E2 */
    public abstract void mo22645E2(@NonNull zzzy zzzy);

    /* renamed from: F2 */
    public abstract void mo22646F2(@NonNull List list);

    @Nullable
    /* renamed from: l2 */
    public abstract String mo22647l2();

    @NonNull
    /* renamed from: m2 */
    public abstract MultiFactor mo22648m2();

    @Nullable
    /* renamed from: n2 */
    public abstract String mo22649n2();

    @Nullable
    /* renamed from: o2 */
    public abstract Uri mo22650o2();

    @Nullable
    /* renamed from: p0 */
    public abstract String mo22651p0();

    @NonNull
    /* renamed from: p2 */
    public abstract List<? extends UserInfo> mo22652p2();

    @Nullable
    /* renamed from: q2 */
    public abstract String mo22653q2();

    @NonNull
    /* renamed from: r2 */
    public abstract String mo22654r2();

    /* renamed from: s2 */
    public abstract boolean mo22655s2();

    @NonNull
    /* renamed from: t2 */
    public Task<AuthResult> mo22656t2(@NonNull AuthCredential authCredential) {
        Preconditions.m4488k(authCredential);
        return FirebaseAuth.getInstance(mo22660x2()).mo22599M(this, authCredential);
    }

    @NonNull
    /* renamed from: u2 */
    public Task<AuthResult> mo22657u2(@NonNull AuthCredential authCredential) {
        Preconditions.m4488k(authCredential);
        return FirebaseAuth.getInstance(mo22660x2()).mo22600N(this, authCredential);
    }

    @NonNull
    /* renamed from: v2 */
    public Task<AuthResult> mo22658v2(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        Preconditions.m4488k(activity);
        Preconditions.m4488k(federatedAuthProvider);
        return FirebaseAuth.getInstance(mo22660x2()).mo22602P(activity, federatedAuthProvider, this);
    }

    @NonNull
    /* renamed from: w2 */
    public Task<Void> mo22659w2(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.m4488k(userProfileChangeRequest);
        return FirebaseAuth.getInstance(mo22660x2()).mo22603Q(this, userProfileChangeRequest);
    }

    @NonNull
    /* renamed from: x2 */
    public abstract FirebaseApp mo22660x2();

    @NonNull
    /* renamed from: y2 */
    public abstract FirebaseUser mo22661y2();

    @NonNull
    /* renamed from: z2 */
    public abstract FirebaseUser mo22662z2(@NonNull List list);
}
