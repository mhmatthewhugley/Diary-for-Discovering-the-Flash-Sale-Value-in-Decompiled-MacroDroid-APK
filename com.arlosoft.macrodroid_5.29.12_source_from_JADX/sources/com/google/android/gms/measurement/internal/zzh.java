package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzh {

    /* renamed from: A */
    private long f46931A;
    @Nullable

    /* renamed from: B */
    private String f46932B;

    /* renamed from: C */
    private boolean f46933C;

    /* renamed from: D */
    private long f46934D;

    /* renamed from: E */
    private long f46935E;

    /* renamed from: a */
    private final zzfr f46936a;

    /* renamed from: b */
    private final String f46937b;
    @Nullable

    /* renamed from: c */
    private String f46938c;
    @Nullable

    /* renamed from: d */
    private String f46939d;
    @Nullable

    /* renamed from: e */
    private String f46940e;
    @Nullable

    /* renamed from: f */
    private String f46941f;

    /* renamed from: g */
    private long f46942g;

    /* renamed from: h */
    private long f46943h;

    /* renamed from: i */
    private long f46944i;
    @Nullable

    /* renamed from: j */
    private String f46945j;

    /* renamed from: k */
    private long f46946k;
    @Nullable

    /* renamed from: l */
    private String f46947l;

    /* renamed from: m */
    private long f46948m;

    /* renamed from: n */
    private long f46949n;

    /* renamed from: o */
    private boolean f46950o;

    /* renamed from: p */
    private boolean f46951p;
    @Nullable

    /* renamed from: q */
    private String f46952q;
    @Nullable

    /* renamed from: r */
    private Boolean f46953r;

    /* renamed from: s */
    private long f46954s;
    @Nullable

    /* renamed from: t */
    private List f46955t;
    @Nullable

    /* renamed from: u */
    private String f46956u;

    /* renamed from: v */
    private long f46957v;

    /* renamed from: w */
    private long f46958w;

    /* renamed from: x */
    private long f46959x;

    /* renamed from: y */
    private long f46960y;

    /* renamed from: z */
    private long f46961z;

    @WorkerThread
    zzh(zzfr zzfr, String str) {
        Preconditions.m4488k(zzfr);
        Preconditions.m4484g(str);
        this.f46936a = zzfr;
        this.f46937b = str;
        zzfr.mo55185B().mo55073e();
    }

    @WorkerThread
    /* renamed from: A */
    public final long mo55254A() {
        this.f46936a.mo55185B().mo55073e();
        return 0;
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo55255B(long j) {
        boolean z = true;
        Preconditions.m4478a(j >= 0);
        this.f46936a.mo55185B().mo55073e();
        boolean z2 = this.f46933C;
        if (this.f46942g == j) {
            z = false;
        }
        this.f46933C = z | z2;
        this.f46942g = j;
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo55256C(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46943h != j;
        this.f46943h = j;
    }

    @WorkerThread
    /* renamed from: D */
    public final void mo55257D(boolean z) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46950o != z;
        this.f46950o = z;
    }

    @WorkerThread
    /* renamed from: E */
    public final void mo55258E(@Nullable Boolean bool) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46953r, bool);
        this.f46953r = bool;
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo55259F(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46940e, str);
        this.f46940e = str;
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo55260G(@Nullable List list) {
        this.f46936a.mo55185B().mo55073e();
        if (!zzg.m65721a(this.f46955t, list)) {
            this.f46933C = true;
            this.f46955t = list != null ? new ArrayList(list) : null;
        }
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo55261H(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46956u, str);
        this.f46956u = str;
    }

    @WorkerThread
    /* renamed from: I */
    public final boolean mo55262I() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46951p;
    }

    @WorkerThread
    /* renamed from: J */
    public final boolean mo55263J() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46950o;
    }

    @WorkerThread
    /* renamed from: K */
    public final boolean mo55264K() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46933C;
    }

    @WorkerThread
    /* renamed from: L */
    public final long mo55265L() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46946k;
    }

    @WorkerThread
    /* renamed from: M */
    public final long mo55266M() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46934D;
    }

    @WorkerThread
    /* renamed from: N */
    public final long mo55267N() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46960y;
    }

    @WorkerThread
    /* renamed from: O */
    public final long mo55268O() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46961z;
    }

    @WorkerThread
    /* renamed from: P */
    public final long mo55269P() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46959x;
    }

    @WorkerThread
    /* renamed from: Q */
    public final long mo55270Q() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46958w;
    }

    @WorkerThread
    /* renamed from: R */
    public final long mo55271R() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46931A;
    }

    @WorkerThread
    /* renamed from: S */
    public final long mo55272S() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46957v;
    }

    @WorkerThread
    /* renamed from: T */
    public final long mo55273T() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46949n;
    }

    @WorkerThread
    /* renamed from: U */
    public final long mo55274U() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46954s;
    }

    @WorkerThread
    /* renamed from: V */
    public final long mo55275V() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46935E;
    }

    @WorkerThread
    /* renamed from: W */
    public final long mo55276W() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46948m;
    }

    @WorkerThread
    /* renamed from: X */
    public final long mo55277X() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46944i;
    }

    @WorkerThread
    /* renamed from: Y */
    public final long mo55278Y() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46942g;
    }

    @WorkerThread
    /* renamed from: Z */
    public final long mo55279Z() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46943h;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final String mo55280a() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46940e;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a0 */
    public final Boolean mo55281a0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46953r;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public final String mo55282b() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46956u;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b0 */
    public final String mo55283b0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46952q;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c */
    public final List mo55284c() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46955t;
    }

    @WorkerThread
    @Nullable
    /* renamed from: c0 */
    public final String mo55285c0() {
        this.f46936a.mo55185B().mo55073e();
        String str = this.f46932B;
        mo55314y((String) null);
        return str;
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo55286d() {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C = false;
    }

    @WorkerThread
    /* renamed from: d0 */
    public final String mo55287d0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46937b;
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo55288e() {
        this.f46936a.mo55185B().mo55073e();
        long j = this.f46942g + 1;
        if (j > 2147483647L) {
            this.f46936a.mo55221z().mo55103u().mo55092b("Bundle index overflow. appId", zzeh.m65566x(this.f46937b));
            j = 0;
        }
        this.f46933C = true;
        this.f46942g = j;
    }

    @WorkerThread
    @Nullable
    /* renamed from: e0 */
    public final String mo55289e0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46938c;
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo55290f(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f46933C |= true ^ zzg.m65721a(this.f46952q, str);
        this.f46952q = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: f0 */
    public final String mo55291f0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46947l;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo55292g(boolean z) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46951p != z;
        this.f46951p = z;
    }

    @WorkerThread
    @Nullable
    /* renamed from: g0 */
    public final String mo55293g0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46945j;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo55294h(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46938c, str);
        this.f46938c = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: h0 */
    public final String mo55295h0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46941f;
    }

    @WorkerThread
    /* renamed from: i */
    public final void mo55296i(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46947l, str);
        this.f46947l = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: i0 */
    public final String mo55297i0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46939d;
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo55298j(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46945j, str);
        this.f46945j = str;
    }

    @WorkerThread
    @Nullable
    /* renamed from: j0 */
    public final String mo55299j0() {
        this.f46936a.mo55185B().mo55073e();
        return this.f46932B;
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo55300k(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46946k != j;
        this.f46946k = j;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo55301l(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46934D != j;
        this.f46934D = j;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo55302m(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46960y != j;
        this.f46960y = j;
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo55303n(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46961z != j;
        this.f46961z = j;
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo55304o(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46959x != j;
        this.f46959x = j;
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo55305p(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46958w != j;
        this.f46958w = j;
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo55306q(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46931A != j;
        this.f46931A = j;
    }

    @WorkerThread
    /* renamed from: r */
    public final void mo55307r(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46957v != j;
        this.f46957v = j;
    }

    @WorkerThread
    /* renamed from: s */
    public final void mo55308s(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46949n != j;
        this.f46949n = j;
    }

    @WorkerThread
    /* renamed from: t */
    public final void mo55309t(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46954s != j;
        this.f46954s = j;
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo55310u(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46935E != j;
        this.f46935E = j;
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo55311v(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46941f, str);
        this.f46941f = str;
    }

    @WorkerThread
    /* renamed from: w */
    public final void mo55312w(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f46933C |= true ^ zzg.m65721a(this.f46939d, str);
        this.f46939d = str;
    }

    @WorkerThread
    /* renamed from: x */
    public final void mo55313x(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46948m != j;
        this.f46948m = j;
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo55314y(@Nullable String str) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= !zzg.m65721a(this.f46932B, str);
        this.f46932B = str;
    }

    @WorkerThread
    /* renamed from: z */
    public final void mo55315z(long j) {
        this.f46936a.mo55185B().mo55073e();
        this.f46933C |= this.f46944i != j;
        this.f46944i = j;
    }
}
