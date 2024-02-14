package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.h0 */
/* compiled from: SpreadBuilder */
public class C13694h0 {

    /* renamed from: a */
    private final ArrayList<Object> f61930a;

    public C13694h0(int i) {
        this.f61930a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo71949a(Object obj) {
        this.f61930a.add(obj);
    }

    /* renamed from: b */
    public void mo71950b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f61930a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f61930a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f61930a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f61930a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f61930a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo71951c() {
        return this.f61930a.size();
    }

    /* renamed from: d */
    public Object[] mo71952d(Object[] objArr) {
        return this.f61930a.toArray(objArr);
    }
}
