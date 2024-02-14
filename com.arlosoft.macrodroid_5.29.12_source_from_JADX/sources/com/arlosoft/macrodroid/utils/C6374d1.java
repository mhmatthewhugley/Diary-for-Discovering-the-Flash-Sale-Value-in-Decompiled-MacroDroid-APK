package com.arlosoft.macrodroid.utils;

import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: com.arlosoft.macrodroid.utils.d1 */
/* compiled from: RootHelper */
public class C6374d1 {
    /* renamed from: a */
    public static int m24616a(String str, String str2) {
        try {
            for (Class declaredFields : Class.forName(str).getDeclaredClasses()) {
                for (Field field : declaredFields.getDeclaredFields()) {
                    String name = field.getName();
                    if (name != null) {
                        if (name.equals("TRANSACTION_" + str2)) {
                            try {
                                field.setAccessible(true);
                                return field.getInt(field);
                            } catch (Exception unused) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return -1;
        } catch (Exception e) {
            Log.e("++++++", "+++++++++++++++ " + e.toString());
            return -1;
        }
    }
}
