package com.obsez.android.lib.filechooser.permissions;

import android.util.SparseArray;
import java.util.Random;

/* renamed from: com.obsez.android.lib.filechooser.permissions.a */
/* compiled from: PermissionsUtil */
public final class C11707a {

    /* renamed from: a */
    private static final SparseArray<C11708a> f57548a = new SparseArray<>();

    /* renamed from: b */
    private static final Random f57549b = new Random();

    /* renamed from: com.obsez.android.lib.filechooser.permissions.a$a */
    /* compiled from: PermissionsUtil */
    public interface C11708a {
        /* renamed from: a */
        void mo65800a(String[] strArr);

        /* renamed from: b */
        void mo65801b(String[] strArr);

        /* renamed from: c */
        void mo65802c(String[] strArr);
    }

    /* renamed from: a */
    static C11708a m81881a(int i) {
        SparseArray<C11708a> sparseArray = f57548a;
        C11708a aVar = sparseArray.get(i, (Object) null);
        sparseArray.remove(i);
        return aVar;
    }
}
