package p310kd;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kd.a */
/* compiled from: BleAdvertisement */
public class C13550a {

    /* renamed from: a */
    private List<C13557d> f61828a;

    /* renamed from: b */
    private byte[] f61829b;

    public C13550a(byte[] bArr) {
        this.f61829b = bArr;
        ArrayList arrayList = new ArrayList();
        m87351b(0, bArr.length < 31 ? bArr.length : 31, arrayList);
        if (bArr.length > 31) {
            m87351b(31, bArr.length, arrayList);
        }
        this.f61828a = arrayList;
    }

    /* renamed from: b */
    private void m87351b(int i, int i2, ArrayList<C13557d> arrayList) {
        do {
            C13557d e = C13557d.m87371e(this.f61829b, i);
            if (e != null) {
                i = i + e.mo71659a() + 1;
                arrayList.add(e);
            }
            if (e == null) {
                return;
            }
        } while (i < i2);
    }

    /* renamed from: a */
    public List<C13557d> mo71646a() {
        return this.f61828a;
    }
}
