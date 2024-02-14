package p292io.grpc;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p292io.grpc.C12520a;

/* renamed from: io.grpc.w */
/* compiled from: EquivalentAddressGroup */
public final class C13005w {

    /* renamed from: d */
    public static final C12520a.C12523c<String> f60757d = C12520a.C12523c.m83647a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a */
    private final List<SocketAddress> f60758a;

    /* renamed from: b */
    private final C12520a f60759b;

    /* renamed from: c */
    private final int f60760c;

    public C13005w(List<SocketAddress> list) {
        this(list, C12520a.f59384b);
    }

    /* renamed from: a */
    public List<SocketAddress> mo69861a() {
        return this.f60758a;
    }

    /* renamed from: b */
    public C12520a mo69862b() {
        return this.f60759b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13005w)) {
            return false;
        }
        C13005w wVar = (C13005w) obj;
        if (this.f60758a.size() != wVar.f60758a.size()) {
            return false;
        }
        for (int i = 0; i < this.f60758a.size(); i++) {
            if (!this.f60758a.get(i).equals(wVar.f60758a.get(i))) {
                return false;
            }
        }
        if (!this.f60759b.equals(wVar.f60759b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f60760c;
    }

    public String toString() {
        return "[" + this.f60758a + "/" + this.f60759b + "]";
    }

    public C13005w(List<SocketAddress> list, C12520a aVar) {
        Preconditions.m5378e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f60758a = unmodifiableList;
        this.f60759b = (C12520a) Preconditions.m5393t(aVar, "attrs");
        this.f60760c = unmodifiableList.hashCode();
    }

    public C13005w(SocketAddress socketAddress) {
        this(socketAddress, C12520a.f59384b);
    }

    public C13005w(SocketAddress socketAddress, C12520a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }
}
