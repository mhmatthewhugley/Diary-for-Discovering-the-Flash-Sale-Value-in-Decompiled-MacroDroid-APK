package com.arlosoft.macrodroid.rest;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import okhttp3.C15919e0;
import p297ja.C13321g;
import p370qa.C16254a;
import p455ag.C17105a;
import retrofit2.C17300s;
import retrofit2.HttpException;

/* compiled from: BaseError.kt */
public final class BaseError extends Exception {

    /* renamed from: a */
    public static final C5074b f12700a = new C5074b((C13695i) null);

    /* renamed from: c */
    private static final C5076d f12701c = C5076d.CLIENT;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C13321g<Gson> f12702d = C13323i.m85669b(C5073a.f12703a);
    private final C5075c error;
    private final String errorBody;
    private final Integer httpErrorCode;
    private final C5076d type;

    /* renamed from: com.arlosoft.macrodroid.rest.BaseError$a */
    /* compiled from: BaseError.kt */
    static final class C5073a extends C13708q implements C16254a<Gson> {

        /* renamed from: a */
        public static final C5073a f12703a = new C5073a();

        C5073a() {
            super(0);
        }

        /* renamed from: a */
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.rest.BaseError$b */
    /* compiled from: BaseError.kt */
    public static final class C5074b {
        private C5074b() {
        }

        public /* synthetic */ C5074b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Gson mo29994a() {
            return (Gson) BaseError.f12702d.getValue();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.rest.BaseError$c */
    /* compiled from: BaseError.kt */
    public static final class C5075c {

        /* renamed from: a */
        private final String f12704a;

        /* renamed from: b */
        private final String f12705b;

        /* renamed from: c */
        private final String f12706c;

        /* renamed from: d */
        private final String f12707d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5075c)) {
                return false;
            }
            C5075c cVar = (C5075c) obj;
            return C13706o.m87924a(this.f12704a, cVar.f12704a) && C13706o.m87924a(this.f12705b, cVar.f12705b) && C13706o.m87924a(this.f12706c, cVar.f12706c) && C13706o.m87924a(this.f12707d, cVar.f12707d);
        }

        public int hashCode() {
            String str = this.f12704a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f12705b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f12706c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12707d;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "Error(error=" + this.f12704a + ", errorCode=" + this.f12705b + ", errorMessage=" + this.f12706c + ", errorType=" + this.f12707d + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.rest.BaseError$d */
    /* compiled from: BaseError.kt */
    public enum C5076d {
        CLIENT,
        SERVER,
        UNAUTHORISED,
        NETWORK_UNAVAILABLE,
        TIMEOUT,
        UNSUPPORTED_APP_VERSION,
        TERMS_AND_CONDITIONS_OUT_OF_DATE,
        WALLET_LOCKED,
        WALLET_SUPER_LOCKED,
        STEP_UP_REQUIRED,
        FRAUD_LOCKED,
        NOT_IMPLEMENTED
    }

    public BaseError() {
        this((Throwable) null, (C5076d) null, 3, (C13695i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseError(Throwable th, C5076d dVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : dVar);
    }

    /* renamed from: c */
    private final C5075c m19548c(String str) {
        try {
            return (C5075c) f12700a.mo29994a().mo63976j(str, C5075c.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo29992b() {
        C5076d dVar = this.type;
        return dVar == C5076d.NETWORK_UNAVAILABLE || dVar == C5076d.TIMEOUT;
    }

    public BaseError(Throwable th, C5076d dVar) {
        super(th);
        String str;
        Integer num;
        C5076d dVar2;
        C5075c cVar = null;
        if (dVar == null) {
            boolean z = false;
            if (th instanceof HttpException) {
                HttpException httpException = (HttpException) th;
                C17300s<?> c = httpException.mo80528c();
                C13706o.m87926c(c);
                C15919e0 d = c.mo80594d();
                String string = d != null ? d.string() : null;
                Integer valueOf = Integer.valueOf(httpException.mo80527a());
                int intValue = valueOf.intValue();
                if (intValue == 400) {
                    cVar = m19548c(string);
                    dVar2 = C5076d.CLIENT;
                } else if (intValue == 401) {
                    dVar2 = C5076d.UNAUTHORISED;
                } else if (intValue == 403) {
                    cVar = m19548c(string);
                    dVar2 = f12701c;
                } else if (intValue == 404) {
                    dVar2 = C5076d.CLIENT;
                } else {
                    if (404 <= intValue && intValue < 500) {
                        dVar2 = C5076d.CLIENT;
                    } else {
                        if (500 <= intValue && intValue < 600) {
                            z = true;
                        }
                        if (z) {
                            dVar2 = C5076d.SERVER;
                        } else {
                            dVar2 = f12701c;
                        }
                    }
                }
                C5076d dVar3 = dVar2;
                num = valueOf;
                str = string;
                dVar = dVar3;
                this.type = dVar;
                this.error = cVar;
                this.errorBody = str;
                this.httpErrorCode = num;
            } else if (th instanceof SocketTimeoutException) {
                dVar = C5076d.TIMEOUT;
            } else if (th instanceof SSLHandshakeException) {
                dVar = C5076d.TIMEOUT;
            } else if (th instanceof UnknownHostException) {
                C17105a.m100583e("UnknownHostException mapping to Type.TIMEOUT", new Object[0]);
                dVar = C5076d.TIMEOUT;
            } else {
                dVar = f12701c;
            }
        }
        str = null;
        num = null;
        this.type = dVar;
        this.error = cVar;
        this.errorBody = str;
        this.httpErrorCode = num;
    }
}
