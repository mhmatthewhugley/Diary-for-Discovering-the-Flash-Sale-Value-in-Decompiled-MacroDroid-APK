package p393t6;

import java.util.ArrayList;

/* renamed from: t6.e */
/* compiled from: TaggedList */
public class C16578e<T> extends ArrayList<T> {
    private Object tag;

    /* renamed from: c */
    public synchronized <V> V mo79400c() {
        return this.tag;
    }

    /* renamed from: d */
    public synchronized <V> void mo79401d(V v) {
        this.tag = v;
    }
}
