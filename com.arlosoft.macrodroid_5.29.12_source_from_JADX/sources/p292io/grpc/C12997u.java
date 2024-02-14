package p292io.grpc;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p292io.grpc.C12905k;

/* renamed from: io.grpc.u */
/* compiled from: DecompressorRegistry */
public final class C12997u {

    /* renamed from: c */
    static final Joiner f60744c = Joiner.m5313h(',');

    /* renamed from: d */
    private static final C12997u f60745d = m85198a().mo69852f(new C12905k.C12906a(), true).mo69852f(C12905k.C12907b.f60451a, false);

    /* renamed from: a */
    private final Map<String, C12998a> f60746a;

    /* renamed from: b */
    private final byte[] f60747b;

    /* renamed from: io.grpc.u$a */
    /* compiled from: DecompressorRegistry */
    private static final class C12998a {

        /* renamed from: a */
        final C12995t f60748a;

        /* renamed from: b */
        final boolean f60749b;

        C12998a(C12995t tVar, boolean z) {
            this.f60748a = (C12995t) Preconditions.m5393t(tVar, "decompressor");
            this.f60749b = z;
        }
    }

    private C12997u(C12995t tVar, boolean z, C12997u uVar) {
        String a = tVar.mo69668a();
        Preconditions.m5378e(!a.contains(","), "Comma is currently not allowed in message encoding");
        int size = uVar.f60746a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!uVar.f60746a.containsKey(tVar.mo69668a()) ? size + 1 : size);
        for (C12998a next : uVar.f60746a.values()) {
            String a2 = next.f60748a.mo69668a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new C12998a(next.f60748a, next.f60749b));
            }
        }
        linkedHashMap.put(a, new C12998a(tVar, z));
        this.f60746a = Collections.unmodifiableMap(linkedHashMap);
        this.f60747b = f60744c.mo22180e(mo69849b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C12997u m85198a() {
        return new C12997u();
    }

    /* renamed from: c */
    public static C12997u m85199c() {
        return f60745d;
    }

    /* renamed from: b */
    public Set<String> mo69849b() {
        HashSet hashSet = new HashSet(this.f60746a.size());
        for (Map.Entry next : this.f60746a.entrySet()) {
            if (((C12998a) next.getValue()).f60749b) {
                hashSet.add(next.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte[] mo69850d() {
        return this.f60747b;
    }

    /* renamed from: e */
    public C12995t mo69851e(String str) {
        C12998a aVar = this.f60746a.get(str);
        if (aVar != null) {
            return aVar.f60748a;
        }
        return null;
    }

    /* renamed from: f */
    public C12997u mo69852f(C12995t tVar, boolean z) {
        return new C12997u(tVar, z, this);
    }

    private C12997u() {
        this.f60746a = new LinkedHashMap(0);
        this.f60747b = new byte[0];
    }
}
