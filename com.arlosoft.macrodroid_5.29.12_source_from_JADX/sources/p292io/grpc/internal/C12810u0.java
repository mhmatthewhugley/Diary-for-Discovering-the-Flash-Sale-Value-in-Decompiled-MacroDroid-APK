package p292io.grpc.internal;

import java.util.ArrayList;

/* renamed from: io.grpc.internal.u0 */
/* compiled from: InsightBuilder */
public final class C12810u0 {

    /* renamed from: a */
    private final ArrayList<String> f60207a = new ArrayList<>();

    /* renamed from: a */
    public C12810u0 mo69568a(Object obj) {
        this.f60207a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C12810u0 mo69569b(String str, Object obj) {
        ArrayList<String> arrayList = this.f60207a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f60207a.toString();
    }
}
