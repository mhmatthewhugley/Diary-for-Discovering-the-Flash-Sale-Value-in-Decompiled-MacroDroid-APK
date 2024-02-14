package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import p339ne.C15789a;
import p339ne.C15790b;

/* renamed from: org.slf4j.helpers.e */
/* compiled from: SubstituteLoggerFactory */
public class C16082e implements C15789a {

    /* renamed from: a */
    final List f66046a = new ArrayList();

    /* renamed from: a */
    public C15790b mo75501a(String str) {
        synchronized (this.f66046a) {
            this.f66046a.add(str);
        }
        return C16079b.f66045a;
    }

    /* renamed from: b */
    public List mo78413b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f66046a) {
            arrayList.addAll(this.f66046a);
        }
        return arrayList;
    }
}
