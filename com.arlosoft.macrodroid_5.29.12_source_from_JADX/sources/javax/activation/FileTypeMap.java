package javax.activation;

import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class FileTypeMap {
    private static FileTypeMap defaultMap;
    private static Map<ClassLoader, FileTypeMap> map = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized javax.activation.FileTypeMap getDefaultFileTypeMap() {
        /*
            java.lang.Class<javax.activation.FileTypeMap> r0 = javax.activation.FileTypeMap.class
            monitor-enter(r0)
            javax.activation.FileTypeMap r1 = defaultMap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            java.lang.ClassLoader r1 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch:{ all -> 0x0023 }
            java.util.Map<java.lang.ClassLoader, javax.activation.FileTypeMap> r2 = map     // Catch:{ all -> 0x0023 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0023 }
            javax.activation.FileTypeMap r2 = (javax.activation.FileTypeMap) r2     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0021
            javax.activation.MimetypesFileTypeMap r2 = new javax.activation.MimetypesFileTypeMap     // Catch:{ all -> 0x0023 }
            r2.<init>()     // Catch:{ all -> 0x0023 }
            java.util.Map<java.lang.ClassLoader, javax.activation.FileTypeMap> r3 = map     // Catch:{ all -> 0x0023 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.FileTypeMap.getDefaultFileTypeMap():javax.activation.FileTypeMap");
    }

    public static synchronized void setDefaultFileTypeMap(FileTypeMap fileTypeMap) {
        Class<FileTypeMap> cls = FileTypeMap.class;
        synchronized (cls) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                try {
                    securityManager.checkSetFactory();
                } catch (SecurityException e) {
                    ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null || classLoader.getParent() == null || classLoader != fileTypeMap.getClass().getClassLoader()) {
                        throw e;
                    }
                }
            }
            map.remove(SecuritySupport.getContextClassLoader());
            defaultMap = fileTypeMap;
        }
    }

    public abstract String getContentType(File file);

    public abstract String getContentType(String str);
}
