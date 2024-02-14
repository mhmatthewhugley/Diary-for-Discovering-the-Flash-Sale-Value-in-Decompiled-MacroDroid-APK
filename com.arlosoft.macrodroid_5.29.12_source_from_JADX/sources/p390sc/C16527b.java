package p390sc;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15904b0;
import okhttp3.C15912d;
import okhttp3.C15915d0;
import okhttp3.C15986u;
import org.apache.http.protocol.HTTP;
import p372qc.C16279b;
import p408uc.C16686c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u0005B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo71668d2 = {"Lsc/b;", "", "Lokhttp3/b0;", "networkRequest", "Lokhttp3/b0;", "b", "()Lokhttp3/b0;", "Lokhttp3/d0;", "cacheResponse", "Lokhttp3/d0;", "a", "()Lokhttp3/d0;", "<init>", "(Lokhttp3/b0;Lokhttp3/d0;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: sc.b */
/* compiled from: CacheStrategy.kt */
public final class C16527b {

    /* renamed from: c */
    public static final C16528a f67247c = new C16528a((C13695i) null);

    /* renamed from: a */
    private final C15904b0 f67248a;

    /* renamed from: b */
    private final C15915d0 f67249b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo71668d2 = {"Lsc/b$a;", "", "Lokhttp3/d0;", "response", "Lokhttp3/b0;", "request", "", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: sc.b$a */
    /* compiled from: CacheStrategy.kt */
    public static final class C16528a {
        private C16528a() {
        }

        public /* synthetic */ C16528a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo79327a(C15915d0 d0Var, C15904b0 b0Var) {
            C13706o.m87929f(d0Var, "response");
            C13706o.m87929f(b0Var, "request");
            int g = d0Var.mo75971g();
            if (!(g == 200 || g == 410 || g == 414 || g == 501 || g == 203 || g == 204)) {
                if (g != 307) {
                    if (!(g == 308 || g == 404 || g == 405)) {
                        switch (g) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C15915d0.m95985o(d0Var, "Expires", (String) null, 2, (Object) null) == null && d0Var.mo75967c().mo75952c() == -1 && !d0Var.mo75967c().mo75951b() && !d0Var.mo75967c().mo75950a()) {
                    return false;
                }
            }
            if (d0Var.mo75967c().mo75957h() || b0Var.mo75912b().mo75957h()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u0012"}, mo71668d2 = {"Lsc/b$b;", "", "", "f", "Lsc/b;", "c", "", "d", "a", "Lokhttp3/b0;", "request", "e", "b", "nowMillis", "Lokhttp3/d0;", "cacheResponse", "<init>", "(JLokhttp3/b0;Lokhttp3/d0;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: sc.b$b */
    /* compiled from: CacheStrategy.kt */
    public static final class C16529b {

        /* renamed from: a */
        private Date f67250a;

        /* renamed from: b */
        private String f67251b;

        /* renamed from: c */
        private Date f67252c;

        /* renamed from: d */
        private String f67253d;

        /* renamed from: e */
        private Date f67254e;

        /* renamed from: f */
        private long f67255f;

        /* renamed from: g */
        private long f67256g;

        /* renamed from: h */
        private String f67257h;

        /* renamed from: i */
        private int f67258i = -1;

        /* renamed from: j */
        private final long f67259j;

        /* renamed from: k */
        private final C15904b0 f67260k;

        /* renamed from: l */
        private final C15915d0 f67261l;

        public C16529b(long j, C15904b0 b0Var, C15915d0 d0Var) {
            C13706o.m87929f(b0Var, "request");
            this.f67259j = j;
            this.f67260k = b0Var;
            this.f67261l = d0Var;
            if (d0Var != null) {
                this.f67255f = d0Var.mo75985z();
                this.f67256g = d0Var.mo75983x();
                C15986u p = d0Var.mo75976p();
                int size = p.size();
                for (int i = 0; i < size; i++) {
                    String d = p.mo76242d(i);
                    String i2 = p.mo76246i(i);
                    if (C15176v.m93641v(d, HTTP.DATE_HEADER, true)) {
                        this.f67250a = C16686c.m99136a(i2);
                        this.f67251b = i2;
                    } else if (C15176v.m93641v(d, "Expires", true)) {
                        this.f67254e = C16686c.m99136a(i2);
                    } else if (C15176v.m93641v(d, "Last-Modified", true)) {
                        this.f67252c = C16686c.m99136a(i2);
                        this.f67253d = i2;
                    } else if (C15176v.m93641v(d, "ETag", true)) {
                        this.f67257h = i2;
                    } else if (C15176v.m93641v(d, "Age", true)) {
                        this.f67258i = C16279b.m97642R(i2, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private final long m98647a() {
            Date date = this.f67250a;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f67256g - date.getTime());
            }
            int i = this.f67258i;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f67256g;
            return j + (j2 - this.f67255f) + (this.f67259j - j2);
        }

        /* renamed from: c */
        private final C16527b m98648c() {
            if (this.f67261l == null) {
                return new C16527b(this.f67260k, (C15915d0) null);
            }
            if (this.f67260k.mo75916f() && this.f67261l.mo75973i() == null) {
                return new C16527b(this.f67260k, (C15915d0) null);
            }
            if (!C16527b.f67247c.mo79327a(this.f67261l, this.f67260k)) {
                return new C16527b(this.f67260k, (C15915d0) null);
            }
            C15912d b = this.f67260k.mo75912b();
            if (b.mo75956g() || m98650e(this.f67260k)) {
                return new C16527b(this.f67260k, (C15915d0) null);
            }
            C15912d c = this.f67261l.mo75967c();
            long a = m98647a();
            long d = m98649d();
            if (b.mo75952c() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis((long) b.mo75952c()));
            }
            long j = 0;
            long millis = b.mo75954e() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo75954e()) : 0;
            if (!c.mo75955f() && b.mo75953d() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo75953d());
            }
            if (!c.mo75956g()) {
                long j2 = millis + a;
                if (j2 < j + d) {
                    C15915d0.C15916a u = this.f67261l.mo75980u();
                    if (j2 >= d) {
                        u.mo75986a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m98651f()) {
                        u.mo75986a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C16527b((C15904b0) null, u.mo75988c());
                }
            }
            String str = this.f67257h;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f67252c != null) {
                str = this.f67253d;
            } else if (this.f67250a == null) {
                return new C16527b(this.f67260k, (C15915d0) null);
            } else {
                str = this.f67251b;
            }
            C15986u.C15987a f = this.f67260k.mo75915e().mo76244f();
            C13706o.m87926c(str);
            f.mo76254d(str2, str);
            return new C16527b(this.f67260k.mo75918h().mo75928g(f.mo76256f()).mo75923b(), this.f67261l);
        }

        /* renamed from: d */
        private final long m98649d() {
            C15915d0 d0Var = this.f67261l;
            C13706o.m87926c(d0Var);
            C15912d c = d0Var.mo75967c();
            if (c.mo75952c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) c.mo75952c());
            }
            Date date = this.f67254e;
            if (date != null) {
                Date date2 = this.f67250a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f67256g);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f67252c == null || this.f67261l.mo75984y().mo75920j().mo76275o() != null) {
                return 0;
            } else {
                Date date3 = this.f67250a;
                long time2 = date3 != null ? date3.getTime() : this.f67255f;
                Date date4 = this.f67252c;
                C13706o.m87926c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        /* renamed from: e */
        private final boolean m98650e(C15904b0 b0Var) {
            return (b0Var.mo75914d("If-Modified-Since") == null && b0Var.mo75914d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private final boolean m98651f() {
            C15915d0 d0Var = this.f67261l;
            C13706o.m87926c(d0Var);
            return d0Var.mo75967c().mo75952c() == -1 && this.f67254e == null;
        }

        /* renamed from: b */
        public final C16527b mo79328b() {
            C16527b c = m98648c();
            return (c.mo79326b() == null || !this.f67260k.mo75912b().mo75958i()) ? c : new C16527b((C15904b0) null, (C15915d0) null);
        }
    }

    public C16527b(C15904b0 b0Var, C15915d0 d0Var) {
        this.f67248a = b0Var;
        this.f67249b = d0Var;
    }

    /* renamed from: a */
    public final C15915d0 mo79325a() {
        return this.f67249b;
    }

    /* renamed from: b */
    public final C15904b0 mo79326b() {
        return this.f67248a;
    }
}
