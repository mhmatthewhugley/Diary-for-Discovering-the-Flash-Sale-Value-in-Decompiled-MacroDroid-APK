package p292io.grpc.okhttp.internal;

import java.io.IOException;

/* renamed from: io.grpc.okhttp.internal.g */
/* compiled from: Protocol */
public enum C12947g {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    private C12947g(String str) {
        this.protocol = str;
    }

    /* renamed from: b */
    public static C12947g m85021b(String str) throws IOException {
        C12947g gVar = HTTP_1_0;
        if (str.equals(gVar.protocol)) {
            return gVar;
        }
        C12947g gVar2 = HTTP_1_1;
        if (str.equals(gVar2.protocol)) {
            return gVar2;
        }
        C12947g gVar3 = HTTP_2;
        if (str.equals(gVar3.protocol)) {
            return gVar3;
        }
        C12947g gVar4 = SPDY_3;
        if (str.equals(gVar4.protocol)) {
            return gVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.protocol;
    }
}
