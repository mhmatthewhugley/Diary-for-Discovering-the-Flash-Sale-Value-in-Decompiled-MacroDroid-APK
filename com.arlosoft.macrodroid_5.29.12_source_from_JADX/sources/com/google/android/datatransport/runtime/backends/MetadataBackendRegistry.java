package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class MetadataBackendRegistry implements BackendRegistry {

    /* renamed from: a */
    private final BackendFactoryProvider f1400a;

    /* renamed from: b */
    private final CreationContextFactory f1401b;

    /* renamed from: c */
    private final Map<String, TransportBackend> f1402c;

    static class BackendFactoryProvider {

        /* renamed from: a */
        private final Context f1403a;

        /* renamed from: b */
        private Map<String, String> f1404b = null;

        BackendFactoryProvider(Context context) {
            this.f1403a = context;
        }

        /* renamed from: a */
        private Map<String, String> m1316a(Context context) {
            Bundle d = m1318d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m1317c() {
            if (this.f1404b == null) {
                this.f1404b = m1316a(this.f1403a);
            }
            return this.f1404b;
        }

        /* renamed from: d */
        private static Bundle m1318d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: b */
        public BackendFactory mo19491b(String str) {
            String str2 = m1317c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            }
        }
    }

    MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    @Nullable
    public synchronized TransportBackend get(String str) {
        if (this.f1402c.containsKey(str)) {
            return this.f1402c.get(str);
        }
        BackendFactory b = this.f1400a.mo19491b(str);
        if (b == null) {
            return null;
        }
        TransportBackend create = b.create(this.f1401b.mo19489a(str));
        this.f1402c.put(str, create);
        return create;
    }

    MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.f1402c = new HashMap();
        this.f1400a = backendFactoryProvider;
        this.f1401b = creationContextFactory;
    }
}
