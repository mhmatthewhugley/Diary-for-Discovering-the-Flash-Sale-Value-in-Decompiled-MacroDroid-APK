package com.samsung.android.sdk.pass.support.p233v1;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.SdkSupporter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.samsung.android.sdk.pass.support.v1.FingerprintManagerProxyFactory */
public class FingerprintManagerProxyFactory {

    /* renamed from: com.samsung.android.sdk.pass.support.v1.FingerprintManagerProxyFactory$a */
    private static class C11726a implements InvocationHandler {

        /* renamed from: a */
        private Object f57603a;

        /* renamed from: b */
        private Map f57604b = new HashMap();

        public C11726a(Object obj) {
            this.f57603a = obj;
            Method[] methods = IFingerprintManagerProxy.class.getMethods();
            for (Method method : obj.getClass().getMethods()) {
                String name = method.getName();
                if (m81906a(methods, method)) {
                    this.f57604b.put(name, method);
                }
            }
        }

        /* renamed from: a */
        private static boolean m81906a(Method[] methodArr, Method method) {
            String name = method.getName();
            Class[] parameterTypes = method.getParameterTypes();
            for (Method method2 : methodArr) {
                if (method2.getName().equals(name)) {
                    Class[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes == null || parameterTypes2 == null) {
                        return true;
                    }
                    if (parameterTypes.length == parameterTypes2.length) {
                        int length = parameterTypes.length;
                        boolean z = false;
                        for (int i = 0; i < length; i++) {
                            if (!parameterTypes2[i].equals(parameterTypes[i])) {
                                z = true;
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Method method2 = (Method) this.f57604b.get(method.getName());
            if (method2 != null) {
                return method2.invoke(this.f57603a, objArr);
            }
            return null;
        }
    }

    public static IFingerprintManagerProxy create(Context context) {
        Object obj;
        try {
            obj = Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Log.e("FingerprintManagerProxy", "Cannot create FingerprintManagerProxy : " + e);
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C11726a aVar = new C11726a(obj);
        return (IFingerprintManagerProxy) Proxy.newProxyInstance(FingerprintManagerProxyFactory.class.getClassLoader(), new Class[]{IFingerprintManagerProxy.class}, aVar);
    }
}
