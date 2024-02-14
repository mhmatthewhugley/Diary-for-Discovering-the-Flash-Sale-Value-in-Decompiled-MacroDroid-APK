package com.google.android.gms.internal.wearable;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzl {
    /* renamed from: a */
    public static zzk m64564a(DataMap dataMap) {
        ArrayList arrayList = new ArrayList();
        zzn q = zzx.m64614q();
        TreeSet treeSet = new TreeSet(dataMap.mo56201b());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object a = dataMap.mo56200a(str);
            zzo q2 = zzw.m64609q();
            q2.mo54097l(str);
            q2.mo54098n(m64565b(arrayList, a));
            arrayList2.add((zzw) q2.mo53937g());
        }
        q.mo54096l(arrayList2);
        return new zzk((zzx) q.mo53937g(), arrayList);
    }

    /* renamed from: b */
    private static zzv m64565b(List list, Object obj) {
        zzp q = zzv.m64603q();
        q.mo54100n(1);
        if (obj == null) {
            q.mo54100n(14);
            return (zzv) q.mo53937g();
        }
        zzt v = zzu.m64598v();
        if (obj instanceof String) {
            q.mo54100n(2);
            v.mo54101A((String) obj);
        } else if (obj instanceof Integer) {
            q.mo54100n(6);
            v.mo54113y(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            q.mo54100n(5);
            v.mo54114z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            q.mo54100n(3);
            v.mo54111v(((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            q.mo54100n(4);
            v.mo54112x(((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            q.mo54100n(8);
            v.mo54108s(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            q.mo54100n(7);
            v.mo54109t(((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            q.mo54100n(1);
            v.mo54110u(zzaw.m64053p((byte[]) obj));
        } else if (obj instanceof String[]) {
            q.mo54100n(11);
            v.mo54105p(Arrays.asList((String[]) obj));
        } else if (obj instanceof long[]) {
            q.mo54100n(12);
            v.mo54104o(zzae.m64023b((long[]) obj));
        } else if (obj instanceof float[]) {
            q.mo54100n(15);
            v.mo54103n(zzab.m64021b((float[]) obj));
        } else if (obj instanceof Asset) {
            q.mo54100n(13);
            list.add((Asset) obj);
            v.mo54107r((long) (list.size() - 1));
        } else {
            int i = 0;
            if (obj instanceof DataMap) {
                q.mo54100n(9);
                DataMap dataMap = (DataMap) obj;
                TreeSet treeSet = new TreeSet(dataMap.mo56201b());
                zzw[] zzwArr = new zzw[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zzo q2 = zzw.m64609q();
                    q2.mo54097l(str);
                    q2.mo54098n(m64565b(list, dataMap.mo56200a(str)));
                    zzwArr[i] = (zzw) q2.mo53937g();
                    i++;
                }
                v.mo54102l(Arrays.asList(zzwArr));
            } else if (obj instanceof ArrayList) {
                q.mo54100n(10);
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                Object obj2 = null;
                int i2 = 14;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    zzv b = m64565b(list, obj3);
                    if (b.mo54115t() == 14 || b.mo54115t() == 2 || b.mo54115t() == 6 || b.mo54115t() == 9) {
                        if (i2 == 14) {
                            if (b.mo54115t() != 14) {
                                i2 = b.mo54115t();
                                obj2 = obj3;
                                v.mo54106q(b);
                                i++;
                            } else {
                                i2 = 14;
                            }
                        }
                        if (b.mo54115t() == i2) {
                            v.mo54106q(b);
                            i++;
                        } else {
                            String valueOf = String.valueOf(obj2.getClass());
                            String valueOf2 = String.valueOf(obj3.getClass());
                            throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + valueOf + " and a " + valueOf2);
                        }
                    } else {
                        throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ".concat(String.valueOf(obj3.getClass())));
                    }
                }
            } else {
                throw new RuntimeException("newFieldValueFromValue: unexpected value ".concat(obj.getClass().getSimpleName()));
            }
        }
        q.mo54099l(v);
        return (zzv) q.mo53937g();
    }
}
