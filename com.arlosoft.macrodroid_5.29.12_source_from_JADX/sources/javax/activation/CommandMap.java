package javax.activation;

import java.util.Map;
import java.util.WeakHashMap;

public abstract class CommandMap {
    private static CommandMap defaultCommandMap;
    private static Map<ClassLoader, CommandMap> map = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized javax.activation.CommandMap getDefaultCommandMap() {
        /*
            java.lang.Class<javax.activation.CommandMap> r0 = javax.activation.CommandMap.class
            monitor-enter(r0)
            javax.activation.CommandMap r1 = defaultCommandMap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            java.lang.ClassLoader r1 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch:{ all -> 0x0023 }
            java.util.Map<java.lang.ClassLoader, javax.activation.CommandMap> r2 = map     // Catch:{ all -> 0x0023 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0023 }
            javax.activation.CommandMap r2 = (javax.activation.CommandMap) r2     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0021
            javax.activation.MailcapCommandMap r2 = new javax.activation.MailcapCommandMap     // Catch:{ all -> 0x0023 }
            r2.<init>()     // Catch:{ all -> 0x0023 }
            java.util.Map<java.lang.ClassLoader, javax.activation.CommandMap> r3 = map     // Catch:{ all -> 0x0023 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.CommandMap.getDefaultCommandMap():javax.activation.CommandMap");
    }

    public static synchronized void setDefaultCommandMap(CommandMap commandMap) {
        Class<CommandMap> cls = CommandMap.class;
        synchronized (cls) {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                try {
                    securityManager.checkSetFactory();
                } catch (SecurityException e) {
                    ClassLoader classLoader = cls.getClassLoader();
                    if (classLoader == null || classLoader.getParent() == null || classLoader != commandMap.getClass().getClassLoader()) {
                        throw e;
                    }
                }
            }
            map.remove(SecuritySupport.getContextClassLoader());
            defaultCommandMap = commandMap;
        }
    }

    public abstract DataContentHandler createDataContentHandler(String str);

    public DataContentHandler createDataContentHandler(String str, DataSource dataSource) {
        return createDataContentHandler(str);
    }

    public abstract CommandInfo[] getAllCommands(String str);

    public CommandInfo[] getAllCommands(String str, DataSource dataSource) {
        return getAllCommands(str);
    }

    public abstract CommandInfo getCommand(String str, String str2);

    public CommandInfo getCommand(String str, String str2, DataSource dataSource) {
        return getCommand(str, str2);
    }

    public String[] getMimeTypes() {
        return null;
    }

    public abstract CommandInfo[] getPreferredCommands(String str);

    public CommandInfo[] getPreferredCommands(String str, DataSource dataSource) {
        return getPreferredCommands(str);
    }
}
