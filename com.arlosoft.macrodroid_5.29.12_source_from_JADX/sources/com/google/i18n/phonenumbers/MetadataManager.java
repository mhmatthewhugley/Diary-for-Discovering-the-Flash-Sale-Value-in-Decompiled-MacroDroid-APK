package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

final class MetadataManager {

    /* renamed from: a */
    static final MetadataLoader f56061a = new MetadataLoader() {
        /* renamed from: a */
        public InputStream mo64323a(String str) {
            return MetadataManager.class.getResourceAsStream(str);
        }
    };

    /* renamed from: b */
    private static final Logger f56062b = Logger.getLogger(MetadataManager.class.getName());

    /* renamed from: c */
    private static final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> f56063c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> f56064d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final Set<Integer> f56065e = AlternateFormatsCountryCodeSet.m78735a();

    /* renamed from: f */
    private static final Set<String> f56066f = ShortNumbersRegionCodeSet.m78948a();

    static class SingleFileMetadataMaps {

        /* renamed from: a */
        private final Map<String, Phonemetadata.PhoneMetadata> f56067a;

        /* renamed from: b */
        private final Map<Integer, Phonemetadata.PhoneMetadata> f56068b;

        private SingleFileMetadataMaps(Map<String, Phonemetadata.PhoneMetadata> map, Map<Integer, Phonemetadata.PhoneMetadata> map2) {
            this.f56067a = Collections.unmodifiableMap(map);
            this.f56068b = Collections.unmodifiableMap(map2);
        }

        /* renamed from: c */
        static SingleFileMetadataMaps m78745c(String str, MetadataLoader metadataLoader) {
            List<Phonemetadata.PhoneMetadata> a = MetadataManager.m78741d(str, metadataLoader);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Phonemetadata.PhoneMetadata phoneMetadata : a) {
                String id = phoneMetadata.getId();
                if ("001".equals(id)) {
                    hashMap2.put(Integer.valueOf(phoneMetadata.mo64407a()), phoneMetadata);
                } else {
                    hashMap.put(id, phoneMetadata);
                }
            }
            return new SingleFileMetadataMaps(hashMap, hashMap2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Phonemetadata.PhoneMetadata mo64324a(int i) {
            return this.f56068b.get(Integer.valueOf(i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Phonemetadata.PhoneMetadata mo64325b(String str) {
            return this.f56067a.get(str);
        }
    }

    private MetadataManager() {
    }

    /* renamed from: b */
    static Phonemetadata.PhoneMetadata m78739b(int i) {
        if (!f56065e.contains(Integer.valueOf(i))) {
            return null;
        }
        return m78740c(Integer.valueOf(i), f56063c, "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto", f56061a);
    }

    /* renamed from: c */
    static <T> Phonemetadata.PhoneMetadata m78740c(T t, ConcurrentHashMap<T, Phonemetadata.PhoneMetadata> concurrentHashMap, String str, MetadataLoader metadataLoader) {
        Phonemetadata.PhoneMetadata phoneMetadata = concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        String str2 = str + "_" + t;
        List<Phonemetadata.PhoneMetadata> d = m78741d(str2, metadataLoader);
        if (d.size() > 1) {
            f56062b.log(Level.WARNING, "more than one metadata in file " + str2);
        }
        Phonemetadata.PhoneMetadata phoneMetadata2 = d.get(0);
        Phonemetadata.PhoneMetadata putIfAbsent = concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        return putIfAbsent != null ? putIfAbsent : phoneMetadata2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static List<Phonemetadata.PhoneMetadata> m78741d(String str, MetadataLoader metadataLoader) {
        InputStream a = metadataLoader.mo64323a(str);
        if (a != null) {
            List<Phonemetadata.PhoneMetadata> b = m78743f(a).mo64441b();
            if (b.size() != 0) {
                return b;
            }
            throw new IllegalStateException("empty metadata: " + str);
        }
        throw new IllegalStateException("missing metadata: " + str);
    }

    /* renamed from: e */
    static SingleFileMetadataMaps m78742e(AtomicReference<SingleFileMetadataMaps> atomicReference, String str, MetadataLoader metadataLoader) {
        SingleFileMetadataMaps singleFileMetadataMaps = atomicReference.get();
        if (singleFileMetadataMaps != null) {
            return singleFileMetadataMaps;
        }
        atomicReference.compareAndSet((Object) null, SingleFileMetadataMaps.m78745c(str, metadataLoader));
        return atomicReference.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0034 A[SYNTHETIC, Splitter:B:24:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0038 A[Catch:{ IOException -> 0x003c }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection m78743f(java.io.InputStream r5) {
        /*
            java.lang.String r0 = "error closing input stream (ignored)"
            java.lang.String r1 = "cannot load/parse metadata"
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x002b }
            r3.<init>(r5)     // Catch:{ IOException -> 0x002b }
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection r2 = new com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection     // Catch:{ all -> 0x0026 }
            r2.<init>()     // Catch:{ all -> 0x0026 }
            r2.readExternal(r3)     // Catch:{ IOException -> 0x001f }
            r3.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001e
        L_0x0016:
            r5 = move-exception
            java.util.logging.Logger r1 = f56062b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r5)
        L_0x001e:
            return r2
        L_0x001f:
            r2 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0026 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0026 }
            throw r4     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            r2 = r3
            goto L_0x0032
        L_0x0029:
            r1 = move-exception
            goto L_0x0032
        L_0x002b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0029 }
            r4.<init>(r1, r3)     // Catch:{ all -> 0x0029 }
            throw r4     // Catch:{ all -> 0x0029 }
        L_0x0032:
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0044
        L_0x0038:
            r5.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0044
        L_0x003c:
            r5 = move-exception
            java.util.logging.Logger r2 = f56062b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r2.log(r3, r0, r5)
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.MetadataManager.m78743f(java.io.InputStream):com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection");
    }
}
