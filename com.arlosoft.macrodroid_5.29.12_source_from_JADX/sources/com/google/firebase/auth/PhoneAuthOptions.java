package com.google.firebase.auth;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class PhoneAuthOptions {

    /* renamed from: a */
    private final FirebaseAuth f4531a;

    /* renamed from: b */
    private Long f4532b;

    /* renamed from: c */
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks f4533c;

    /* renamed from: d */
    private Executor f4534d;
    @Nullable

    /* renamed from: e */
    private String f4535e;

    /* renamed from: f */
    private Activity f4536f;
    @Nullable

    /* renamed from: g */
    private PhoneAuthProvider.ForceResendingToken f4537g;
    @Nullable

    /* renamed from: h */
    private MultiFactorSession f4538h;
    @Nullable

    /* renamed from: i */
    private PhoneMultiFactorInfo f4539i;

    /* renamed from: j */
    private boolean f4540j;

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static final class Builder {

        /* renamed from: a */
        private final FirebaseAuth f4541a;

        /* renamed from: b */
        private String f4542b;

        /* renamed from: c */
        private Long f4543c;

        /* renamed from: d */
        private PhoneAuthProvider.OnVerificationStateChangedCallbacks f4544d;

        /* renamed from: e */
        private Executor f4545e;

        /* renamed from: f */
        private Activity f4546f;
        @Nullable

        /* renamed from: g */
        private PhoneAuthProvider.ForceResendingToken f4547g;

        /* renamed from: h */
        private MultiFactorSession f4548h;

        /* renamed from: i */
        private PhoneMultiFactorInfo f4549i;

        /* renamed from: j */
        private boolean f4550j;

        public Builder(@NonNull FirebaseAuth firebaseAuth) {
            this.f4541a = (FirebaseAuth) Preconditions.m4488k(firebaseAuth);
        }

        @NonNull
        /* renamed from: a */
        public PhoneAuthOptions mo22696a() {
            Preconditions.m4489l(this.f4541a, "FirebaseAuth instance cannot be null");
            Preconditions.m4489l(this.f4543c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            Preconditions.m4489l(this.f4544d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            Preconditions.m4489l(this.f4546f, "You must specify an Activity on your PhoneAuthOptions. Please call #setActivity()");
            this.f4545e = TaskExecutors.f47996a;
            if (this.f4543c.longValue() < 0 || this.f4543c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            MultiFactorSession multiFactorSession = this.f4548h;
            boolean z = false;
            if (multiFactorSession == null) {
                Preconditions.m4485h(this.f4542b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                Preconditions.m4479b(!this.f4550j, "You cannot require sms validation without setting a multi-factor session.");
                if (this.f4549i == null) {
                    z = true;
                }
                Preconditions.m4479b(z, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (((zzag) multiFactorSession).mo22741p2()) {
                Preconditions.m4484g(this.f4542b);
                if (this.f4549i == null) {
                    z = true;
                }
                Preconditions.m4479b(z, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            } else {
                Preconditions.m4479b(this.f4549i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                if (this.f4542b == null) {
                    z = true;
                }
                Preconditions.m4479b(z, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            }
            return new PhoneAuthOptions(this.f4541a, this.f4543c, this.f4544d, this.f4545e, this.f4542b, this.f4546f, this.f4547g, this.f4548h, this.f4549i, this.f4550j, (zzah) null);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo22697b(@NonNull Activity activity) {
            this.f4546f = activity;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo22698c(@NonNull PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
            this.f4544d = onVerificationStateChangedCallbacks;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder mo22699d(@NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.f4547g = forceResendingToken;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public Builder mo22700e(@NonNull String str) {
            this.f4542b = str;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public Builder mo22701f(@NonNull Long l, @NonNull TimeUnit timeUnit) {
            this.f4543c = Long.valueOf(TimeUnit.SECONDS.convert(l.longValue(), timeUnit));
            return this;
        }
    }

    /* synthetic */ PhoneAuthOptions(FirebaseAuth firebaseAuth, Long l, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, String str, Activity activity, PhoneAuthProvider.ForceResendingToken forceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z, zzah zzah) {
        this.f4531a = firebaseAuth;
        this.f4535e = str;
        this.f4532b = l;
        this.f4533c = onVerificationStateChangedCallbacks;
        this.f4536f = activity;
        this.f4534d = executor;
        this.f4537g = forceResendingToken;
        this.f4538h = multiFactorSession;
        this.f4539i = phoneMultiFactorInfo;
        this.f4540j = z;
    }

    @NonNull
    /* renamed from: a */
    public static Builder m6097a(@NonNull FirebaseAuth firebaseAuth) {
        return new Builder(firebaseAuth);
    }

    @Nullable
    /* renamed from: b */
    public final Activity mo22685b() {
        return this.f4536f;
    }

    @NonNull
    /* renamed from: c */
    public final FirebaseAuth mo22686c() {
        return this.f4531a;
    }

    @Nullable
    /* renamed from: d */
    public final MultiFactorSession mo22687d() {
        return this.f4538h;
    }

    @Nullable
    /* renamed from: e */
    public final PhoneAuthProvider.ForceResendingToken mo22688e() {
        return this.f4537g;
    }

    @NonNull
    /* renamed from: f */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks mo22689f() {
        return this.f4533c;
    }

    @Nullable
    /* renamed from: g */
    public final PhoneMultiFactorInfo mo22690g() {
        return this.f4539i;
    }

    @NonNull
    /* renamed from: h */
    public final Long mo22691h() {
        return this.f4532b;
    }

    @Nullable
    /* renamed from: i */
    public final String mo22692i() {
        return this.f4535e;
    }

    @NonNull
    /* renamed from: j */
    public final Executor mo22693j() {
        return this.f4534d;
    }

    /* renamed from: k */
    public final boolean mo22694k() {
        return this.f4540j;
    }

    /* renamed from: l */
    public final boolean mo22695l() {
        return this.f4538h != null;
    }
}
