package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;
import java.util.Objects;

final class AutoValue_SendRequest extends SendRequest {

    /* renamed from: a */
    private final TransportContext f1324a;

    /* renamed from: b */
    private final String f1325b;

    /* renamed from: c */
    private final Event<?> f1326c;

    /* renamed from: d */
    private final Transformer<?, byte[]> f1327d;

    /* renamed from: e */
    private final Encoding f1328e;

    static final class Builder extends SendRequest.Builder {

        /* renamed from: a */
        private TransportContext f1329a;

        /* renamed from: b */
        private String f1330b;

        /* renamed from: c */
        private Event<?> f1331c;

        /* renamed from: d */
        private Transformer<?, byte[]> f1332d;

        /* renamed from: e */
        private Encoding f1333e;

        Builder() {
        }

        /* renamed from: a */
        public SendRequest mo19420a() {
            String str = "";
            if (this.f1329a == null) {
                str = str + " transportContext";
            }
            if (this.f1330b == null) {
                str = str + " transportName";
            }
            if (this.f1331c == null) {
                str = str + " event";
            }
            if (this.f1332d == null) {
                str = str + " transformer";
            }
            if (this.f1333e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.f1329a, this.f1330b, this.f1331c, this.f1332d, this.f1333e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SendRequest.Builder mo19421b(Encoding encoding) {
            Objects.requireNonNull(encoding, "Null encoding");
            this.f1333e = encoding;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public SendRequest.Builder mo19422c(Event<?> event) {
            Objects.requireNonNull(event, "Null event");
            this.f1331c = event;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public SendRequest.Builder mo19423d(Transformer<?, byte[]> transformer) {
            Objects.requireNonNull(transformer, "Null transformer");
            this.f1332d = transformer;
            return this;
        }

        /* renamed from: e */
        public SendRequest.Builder mo19424e(TransportContext transportContext) {
            Objects.requireNonNull(transportContext, "Null transportContext");
            this.f1329a = transportContext;
            return this;
        }

        /* renamed from: f */
        public SendRequest.Builder mo19425f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f1330b = str;
            return this;
        }
    }

    /* renamed from: b */
    public Encoding mo19412b() {
        return this.f1328e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Event<?> mo19413c() {
        return this.f1326c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Transformer<?, byte[]> mo19414e() {
        return this.f1327d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        if (!this.f1324a.equals(sendRequest.mo19416f()) || !this.f1325b.equals(sendRequest.mo19417g()) || !this.f1326c.equals(sendRequest.mo19413c()) || !this.f1327d.equals(sendRequest.mo19414e()) || !this.f1328e.equals(sendRequest.mo19412b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public TransportContext mo19416f() {
        return this.f1324a;
    }

    /* renamed from: g */
    public String mo19417g() {
        return this.f1325b;
    }

    public int hashCode() {
        return ((((((((this.f1324a.hashCode() ^ 1000003) * 1000003) ^ this.f1325b.hashCode()) * 1000003) ^ this.f1326c.hashCode()) * 1000003) ^ this.f1327d.hashCode()) * 1000003) ^ this.f1328e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f1324a + ", transportName=" + this.f1325b + ", event=" + this.f1326c + ", transformer=" + this.f1327d + ", encoding=" + this.f1328e + "}";
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
        this.f1324a = transportContext;
        this.f1325b = str;
        this.f1326c = event;
        this.f1327d = transformer;
        this.f1328e = encoding;
    }
}
