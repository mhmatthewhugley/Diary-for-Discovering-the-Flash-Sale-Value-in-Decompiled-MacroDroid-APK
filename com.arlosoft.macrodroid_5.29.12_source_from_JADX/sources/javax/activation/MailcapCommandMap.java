package javax.activation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p412v7.C16720b;
import p412v7.C16721c;

public class MailcapCommandMap extends CommandMap {
    private static final int PROG = 0;
    private static final String confDir;

    /* renamed from: DB */
    private C16721c[] f61333DB;

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction() {
                public Object run() {
                    String property = System.getProperty("java.home");
                    StringBuilder sb = new StringBuilder();
                    sb.append(property);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("conf");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        return sb2 + str;
                    }
                    return property + str + "lib" + str;
                }
            });
        } catch (Exception unused) {
            str = null;
        }
        confDir = str;
    }

    public MailcapCommandMap() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add((Object) null);
        C16720b.m99261b("MailcapCommandMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                C16721c loadFile = loadFile(property + File.separator + ".mailcap");
                if (loadFile != null) {
                    arrayList.add(loadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        C16720b.m99261b("MailcapCommandMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                C16721c loadFile2 = loadFile(str + "mailcap");
                if (loadFile2 != null) {
                    arrayList.add(loadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        C16720b.m99261b("MailcapCommandMap: load JAR");
        loadAllResources(arrayList, "META-INF/mailcap");
        C16720b.m99261b("MailcapCommandMap: load DEF");
        C16721c loadResource = loadResource("/META-INF/mailcap.default");
        if (loadResource != null) {
            arrayList.add(loadResource);
        }
        C16721c[] cVarArr = new C16721c[arrayList.size()];
        this.f61333DB = cVarArr;
        this.f61333DB = (C16721c[]) arrayList.toArray(cVarArr);
    }

    private void appendCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            for (String commandInfo : (List) map.get(str)) {
                list.add(new CommandInfo(str, commandInfo));
            }
        }
    }

    private void appendPrefCmdsToList(Map map, List list) {
        for (String str : map.keySet()) {
            if (!checkForVerb(list, str)) {
                list.add(new CommandInfo(str, (String) ((List) map.get(str)).get(0)));
            }
        }
    }

    private boolean checkForVerb(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((CommandInfo) it.next()).getCommandName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = java.lang.Class.forName(r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.activation.DataContentHandler getDataContentHandler(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Can't load DCH "
            boolean r1 = p412v7.C16720b.m99260a()
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = "    got content-handler"
            p412v7.C16720b.m99261b(r1)
        L_0x000d:
            boolean r1 = p412v7.C16720b.m99260a()
            if (r1 == 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "      class "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            p412v7.C16720b.m99261b(r1)
        L_0x0027:
            java.lang.ClassLoader r1 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
            if (r1 != 0) goto L_0x0035
            java.lang.Class r1 = r3.getClass()     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
        L_0x0035:
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ Exception -> 0x003a }
            goto L_0x003e
        L_0x003a:
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
        L_0x003e:
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r1.newInstance()     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
            javax.activation.DataContentHandler r1 = (javax.activation.DataContentHandler) r1     // Catch:{ IllegalAccessException -> 0x007b, ClassNotFoundException -> 0x0061, InstantiationException -> 0x0047 }
            return r1
        L_0x0047:
            r1 = move-exception
            boolean r2 = p412v7.C16720b.m99260a()
            if (r2 == 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            p412v7.C16720b.m99262c(r4, r1)
            goto L_0x0094
        L_0x0061:
            r1 = move-exception
            boolean r2 = p412v7.C16720b.m99260a()
            if (r2 == 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            p412v7.C16720b.m99262c(r4, r1)
            goto L_0x0094
        L_0x007b:
            r1 = move-exception
            boolean r2 = p412v7.C16720b.m99260a()
            if (r2 == 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            p412v7.C16720b.m99262c(r4, r1)
        L_0x0094:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.getDataContentHandler(java.lang.String):javax.activation.DataContentHandler");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00e4 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c6 A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[SYNTHETIC, Splitter:B:58:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAllResources(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MailcapCommandMap: can't load "
            r1 = 0
            java.lang.ClassLoader r2 = javax.activation.SecuritySupport.getContextClassLoader()     // Catch:{ Exception -> 0x00ea }
            if (r2 != 0) goto L_0x0011
            java.lang.Class r2 = r8.getClass()     // Catch:{ Exception -> 0x00ea }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x00ea }
        L_0x0011:
            if (r2 == 0) goto L_0x0018
            java.net.URL[] r2 = javax.activation.SecuritySupport.getResources(r2, r10)     // Catch:{ Exception -> 0x00ea }
            goto L_0x001c
        L_0x0018:
            java.net.URL[] r2 = javax.activation.SecuritySupport.getSystemResources(r10)     // Catch:{ Exception -> 0x00ea }
        L_0x001c:
            if (r2 == 0) goto L_0x0103
            boolean r3 = p412v7.C16720b.m99260a()     // Catch:{ Exception -> 0x00ea }
            if (r3 == 0) goto L_0x0029
            java.lang.String r3 = "MailcapCommandMap: getResources"
            p412v7.C16720b.m99261b(r3)     // Catch:{ Exception -> 0x00ea }
        L_0x0029:
            r3 = 0
        L_0x002a:
            int r4 = r2.length     // Catch:{ Exception -> 0x00e7 }
            if (r1 >= r4) goto L_0x00e5
            r4 = r2[r1]     // Catch:{ Exception -> 0x00e7 }
            r5 = 0
            boolean r6 = p412v7.C16720b.m99260a()     // Catch:{ Exception -> 0x00e7 }
            if (r6 == 0) goto L_0x004a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e7 }
            r6.<init>()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r7 = "MailcapCommandMap: URL "
            r6.append(r7)     // Catch:{ Exception -> 0x00e7 }
            r6.append(r4)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00e7 }
            p412v7.C16720b.m99261b(r6)     // Catch:{ Exception -> 0x00e7 }
        L_0x004a:
            r6 = 1
            java.io.InputStream r5 = javax.activation.SecuritySupport.openStream(r4)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            if (r5 == 0) goto L_0x0081
            v7.c r7 = new v7.c     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r7.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r9.add(r7)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            boolean r3 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            if (r3 == 0) goto L_0x0073
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            r3.<init>()     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            java.lang.String r7 = "MailcapCommandMap: successfully loaded mailcap file from URL: "
            r3.append(r7)     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            r3.append(r4)     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            p412v7.C16720b.m99261b(r3)     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
        L_0x0073:
            r3 = 1
            goto L_0x009b
        L_0x0075:
            r1 = move-exception
            r3 = 1
            goto L_0x00df
        L_0x0079:
            r3 = move-exception
            r6 = r3
            r3 = 1
            goto L_0x00a4
        L_0x007d:
            r3 = move-exception
            r6 = r3
            r3 = 1
            goto L_0x00c0
        L_0x0081:
            boolean r6 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            if (r6 == 0) goto L_0x009b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r6.<init>()     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            java.lang.String r7 = "MailcapCommandMap: not loading mailcap file from URL: "
            r6.append(r7)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r6.append(r4)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            p412v7.C16720b.m99261b(r6)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
        L_0x009b:
            if (r5 == 0) goto L_0x00db
        L_0x009d:
            r5.close()     // Catch:{ IOException -> 0x00db }
            goto L_0x00db
        L_0x00a1:
            r1 = move-exception
            goto L_0x00df
        L_0x00a3:
            r6 = move-exception
        L_0x00a4:
            boolean r7 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x00a1 }
            if (r7 == 0) goto L_0x00bc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r7.<init>()     // Catch:{ all -> 0x00a1 }
            r7.append(r0)     // Catch:{ all -> 0x00a1 }
            r7.append(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00a1 }
            p412v7.C16720b.m99262c(r4, r6)     // Catch:{ all -> 0x00a1 }
        L_0x00bc:
            if (r5 == 0) goto L_0x00db
            goto L_0x009d
        L_0x00bf:
            r6 = move-exception
        L_0x00c0:
            boolean r7 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x00a1 }
            if (r7 == 0) goto L_0x00d8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r7.<init>()     // Catch:{ all -> 0x00a1 }
            r7.append(r0)     // Catch:{ all -> 0x00a1 }
            r7.append(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x00a1 }
            p412v7.C16720b.m99262c(r4, r6)     // Catch:{ all -> 0x00a1 }
        L_0x00d8:
            if (r5 == 0) goto L_0x00db
            goto L_0x009d
        L_0x00db:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x00df:
            if (r5 == 0) goto L_0x00e4
            r5.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            throw r1     // Catch:{ Exception -> 0x00e7 }
        L_0x00e5:
            r1 = r3
            goto L_0x0103
        L_0x00e7:
            r2 = move-exception
            r1 = r3
            goto L_0x00eb
        L_0x00ea:
            r2 = move-exception
        L_0x00eb:
            boolean r3 = p412v7.C16720b.m99260a()
            if (r3 == 0) goto L_0x0103
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = r3.toString()
            p412v7.C16720b.m99262c(r0, r2)
        L_0x0103:
            if (r1 != 0) goto L_0x012a
            boolean r0 = p412v7.C16720b.m99260a()
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "MailcapCommandMap: !anyLoaded"
            p412v7.C16720b.m99261b(r0)
        L_0x0110:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            v7.c r10 = r8.loadResource(r10)
            if (r10 == 0) goto L_0x012a
            r9.add(r10)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.loadAllResources(java.util.List, java.lang.String):void");
    }

    private C16721c loadFile(String str) {
        try {
            return new C16721c(str);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r2 == null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b A[Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[SYNTHETIC, Splitter:B:41:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p412v7.C16721c loadResource(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MailcapCommandMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054 }
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054 }
            if (r2 == 0) goto L_0x0030
            v7.c r3 = new v7.c     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r3.<init>((java.io.InputStream) r2)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            boolean r4 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            if (r4 == 0) goto L_0x002c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r4.<init>()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            java.lang.String r5 = "MailcapCommandMap: successfully loaded mailcap file: "
            r4.append(r5)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r4.append(r7)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            p412v7.C16720b.m99261b(r4)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
        L_0x002c:
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r3
        L_0x0030:
            boolean r3 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            if (r3 == 0) goto L_0x004a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r3.<init>()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            java.lang.String r4 = "MailcapCommandMap: not loading mailcap file: "
            r3.append(r4)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r3.append(r7)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            p412v7.C16720b.m99261b(r3)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
        L_0x004a:
            if (r2 == 0) goto L_0x0090
        L_0x004c:
            r2.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0090
        L_0x0050:
            r3 = move-exception
            goto L_0x0058
        L_0x0052:
            r3 = move-exception
            goto L_0x0075
        L_0x0054:
            r7 = move-exception
            goto L_0x0093
        L_0x0056:
            r3 = move-exception
            r2 = r1
        L_0x0058:
            boolean r4 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0070
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            r4.append(r7)     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0091 }
            p412v7.C16720b.m99262c(r7, r3)     // Catch:{ all -> 0x0091 }
        L_0x0070:
            if (r2 == 0) goto L_0x0090
            goto L_0x004c
        L_0x0073:
            r3 = move-exception
            r2 = r1
        L_0x0075:
            boolean r4 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x008d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            r4.append(r0)     // Catch:{ all -> 0x0091 }
            r4.append(r7)     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0091 }
            p412v7.C16720b.m99262c(r7, r3)     // Catch:{ all -> 0x0091 }
        L_0x008d:
            if (r2 == 0) goto L_0x0090
            goto L_0x004c
        L_0x0090:
            return r1
        L_0x0091:
            r7 = move-exception
            r1 = r2
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.loadResource(java.lang.String):v7.c");
    }

    public synchronized void addMailcap(String str) {
        C16720b.m99261b("MailcapCommandMap: add to PROG");
        C16721c[] cVarArr = this.f61333DB;
        if (cVarArr[0] == null) {
            cVarArr[0] = new C16721c();
        }
        this.f61333DB[0].mo79638a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = r4.f61333DB;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r1 >= r2.length) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r2[r1] != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (p412v7.C16720b.m99260a() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        p412v7.C16720b.m99261b("  search fallback DB #" + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r2 = r4.f61333DB[r1].mo79639b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r2 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r2 = (java.util.List) r2.get("content-handler");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r2 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        r2 = getDataContentHandler((java.lang.String) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        if (r2 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized javax.activation.DataContentHandler createDataContentHandler(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x001b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r0.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "MailcapCommandMap: createDataContentHandler for "
            r0.append(r1)     // Catch:{ all -> 0x00bb }
            r0.append(r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bb }
            p412v7.C16720b.m99261b(r0)     // Catch:{ all -> 0x00bb }
        L_0x001b:
            if (r5 == 0) goto L_0x0023
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch:{ all -> 0x00bb }
        L_0x0023:
            r0 = 0
            r1 = 0
        L_0x0025:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x00bb }
            int r3 = r2.length     // Catch:{ all -> 0x00bb }
            if (r1 >= r3) goto L_0x006e
            r2 = r2[r1]     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x002f
            goto L_0x006b
        L_0x002f:
            boolean r2 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0049
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "  search DB #"
            r2.append(r3)     // Catch:{ all -> 0x00bb }
            r2.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bb }
            p412v7.C16720b.m99261b(r2)     // Catch:{ all -> 0x00bb }
        L_0x0049:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x00bb }
            r2 = r2[r1]     // Catch:{ all -> 0x00bb }
            java.util.Map r2 = r2.mo79640c(r5)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x006b
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00bb }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bb }
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x006b
            monitor-exit(r4)
            return r2
        L_0x006b:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x006e:
            r1 = 0
        L_0x006f:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x00bb }
            int r3 = r2.length     // Catch:{ all -> 0x00bb }
            if (r1 >= r3) goto L_0x00b8
            r2 = r2[r1]     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0079
            goto L_0x00b5
        L_0x0079:
            boolean r2 = p412v7.C16720b.m99260a()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0093
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "  search fallback DB #"
            r2.append(r3)     // Catch:{ all -> 0x00bb }
            r2.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bb }
            p412v7.C16720b.m99261b(r2)     // Catch:{ all -> 0x00bb }
        L_0x0093:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x00bb }
            r2 = r2[r1]     // Catch:{ all -> 0x00bb }
            java.util.Map r2 = r2.mo79639b(r5)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b5
            java.lang.String r3 = "content-handler"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00bb }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bb }
            javax.activation.DataContentHandler r2 = r4.getDataContentHandler(r2)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b5
            monitor-exit(r4)
            return r2
        L_0x00b5:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x00b8:
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x00bb:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.createDataContentHandler(java.lang.String):javax.activation.DataContentHandler");
    }

    public synchronized CommandInfo[] getAllCommands(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            C16721c[] cVarArr = this.f61333DB;
            if (i2 >= cVarArr.length) {
                break;
            }
            if (cVarArr[i2] != null) {
                Map c = cVarArr[i2].mo79640c(str);
                if (c != null) {
                    appendCmdsToList(c, arrayList);
                }
            }
            i2++;
        }
        while (true) {
            C16721c[] cVarArr2 = this.f61333DB;
            if (i < cVarArr2.length) {
                if (cVarArr2[i] != null) {
                    Map b = cVarArr2[i].mo79639b(str);
                    if (b != null) {
                        appendCmdsToList(b, arrayList);
                    }
                }
                i++;
            }
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2 = r4.f61333DB;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r1 >= r2.length) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r2[r1] != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        r2 = r2[r1].mo79639b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (r2 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        r2 = (java.util.List) r2.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r2 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r2 = (java.lang.String) r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r2 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        return new javax.activation.CommandInfo(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0069, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized javax.activation.CommandInfo getCommand(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x000c
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x000a }
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch:{ all -> 0x000a }
            goto L_0x000c
        L_0x000a:
            r5 = move-exception
            goto L_0x006a
        L_0x000c:
            r0 = 0
            r1 = 0
        L_0x000e:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x000a }
            int r3 = r2.length     // Catch:{ all -> 0x000a }
            if (r1 >= r3) goto L_0x003a
            r3 = r2[r1]     // Catch:{ all -> 0x000a }
            if (r3 != 0) goto L_0x0018
            goto L_0x0037
        L_0x0018:
            r2 = r2[r1]     // Catch:{ all -> 0x000a }
            java.util.Map r2 = r2.mo79640c(r5)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x000a }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x000a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0037
            javax.activation.CommandInfo r5 = new javax.activation.CommandInfo     // Catch:{ all -> 0x000a }
            r5.<init>(r6, r2)     // Catch:{ all -> 0x000a }
            monitor-exit(r4)
            return r5
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x003a:
            r1 = 0
        L_0x003b:
            v7.c[] r2 = r4.f61333DB     // Catch:{ all -> 0x000a }
            int r3 = r2.length     // Catch:{ all -> 0x000a }
            if (r1 >= r3) goto L_0x0067
            r3 = r2[r1]     // Catch:{ all -> 0x000a }
            if (r3 != 0) goto L_0x0045
            goto L_0x0064
        L_0x0045:
            r2 = r2[r1]     // Catch:{ all -> 0x000a }
            java.util.Map r2 = r2.mo79639b(r5)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x000a }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x000a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0064
            javax.activation.CommandInfo r5 = new javax.activation.CommandInfo     // Catch:{ all -> 0x000a }
            r5.<init>(r6, r2)     // Catch:{ all -> 0x000a }
            monitor-exit(r4)
            return r5
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0067:
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x006a:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MailcapCommandMap.getCommand(java.lang.String, java.lang.String):javax.activation.CommandInfo");
    }

    public synchronized String[] getMimeTypes() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        int i = 0;
        while (true) {
            C16721c[] cVarArr = this.f61333DB;
            if (i < cVarArr.length) {
                if (cVarArr[i] != null) {
                    String[] d = cVarArr[i].mo79641d();
                    if (d != null) {
                        for (int i2 = 0; i2 < d.length; i2++) {
                            if (!arrayList.contains(d[i2])) {
                                arrayList.add(d[i2]);
                            }
                        }
                    }
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized String[] getNativeCommands(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        while (true) {
            C16721c[] cVarArr = this.f61333DB;
            if (i < cVarArr.length) {
                if (cVarArr[i] != null) {
                    String[] e = cVarArr[i].mo79642e(str);
                    if (e != null) {
                        for (int i2 = 0; i2 < e.length; i2++) {
                            if (!arrayList.contains(e[i2])) {
                                arrayList.add(e[i2]);
                            }
                        }
                    }
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public synchronized CommandInfo[] getPreferredCommands(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (str != null) {
            str = str.toLowerCase(Locale.ENGLISH);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            C16721c[] cVarArr = this.f61333DB;
            if (i2 >= cVarArr.length) {
                break;
            }
            if (cVarArr[i2] != null) {
                Map c = cVarArr[i2].mo79640c(str);
                if (c != null) {
                    appendPrefCmdsToList(c, arrayList);
                }
            }
            i2++;
        }
        while (true) {
            C16721c[] cVarArr2 = this.f61333DB;
            if (i < cVarArr2.length) {
                if (cVarArr2[i] != null) {
                    Map b = cVarArr2[i].mo79639b(str);
                    if (b != null) {
                        appendPrefCmdsToList(b, arrayList);
                    }
                }
                i++;
            }
        }
        return (CommandInfo[]) arrayList.toArray(new CommandInfo[arrayList.size()]);
    }

    public MailcapCommandMap(String str) throws IOException {
        this();
        if (C16720b.m99260a()) {
            C16720b.m99261b("MailcapCommandMap: load PROG from " + str);
        }
        C16721c[] cVarArr = this.f61333DB;
        if (cVarArr[0] == null) {
            cVarArr[0] = new C16721c(str);
        }
    }

    public MailcapCommandMap(InputStream inputStream) {
        this();
        C16720b.m99261b("MailcapCommandMap: load PROG");
        C16721c[] cVarArr = this.f61333DB;
        if (cVarArr[0] == null) {
            try {
                cVarArr[0] = new C16721c(inputStream);
            } catch (IOException unused) {
            }
        }
    }
}
