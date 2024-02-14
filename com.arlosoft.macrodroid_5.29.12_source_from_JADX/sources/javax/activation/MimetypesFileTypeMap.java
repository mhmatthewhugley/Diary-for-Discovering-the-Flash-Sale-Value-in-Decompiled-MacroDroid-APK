package javax.activation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;
import p412v7.C16720b;
import p412v7.C16724f;

public class MimetypesFileTypeMap extends FileTypeMap {
    private static final int PROG = 0;
    private static final String confDir;
    private static final String defaultType = "application/octet-stream";

    /* renamed from: DB */
    private C16724f[] f61334DB;

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

    public MimetypesFileTypeMap() {
        Vector vector = new Vector(5);
        vector.addElement((Object) null);
        C16720b.m99261b("MimetypesFileTypeMap: load HOME");
        try {
            String property = System.getProperty("user.home");
            if (property != null) {
                C16724f loadFile = loadFile(property + File.separator + ".mime.types");
                if (loadFile != null) {
                    vector.addElement(loadFile);
                }
            }
        } catch (SecurityException unused) {
        }
        C16720b.m99261b("MimetypesFileTypeMap: load SYS");
        try {
            String str = confDir;
            if (str != null) {
                C16724f loadFile2 = loadFile(str + "mime.types");
                if (loadFile2 != null) {
                    vector.addElement(loadFile2);
                }
            }
        } catch (SecurityException unused2) {
        }
        C16720b.m99261b("MimetypesFileTypeMap: load JAR");
        loadAllResources(vector, "META-INF/mime.types");
        C16720b.m99261b("MimetypesFileTypeMap: load DEF");
        C16724f loadResource = loadResource("/META-INF/mimetypes.default");
        if (loadResource != null) {
            vector.addElement(loadResource);
        }
        C16724f[] fVarArr = new C16724f[vector.size()];
        this.f61334DB = fVarArr;
        vector.copyInto(fVarArr);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00e4 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c6 A[Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[SYNTHETIC, Splitter:B:58:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAllResources(java.util.Vector r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
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
            java.lang.String r3 = "MimetypesFileTypeMap: getResources"
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
            java.lang.String r7 = "MimetypesFileTypeMap: URL "
            r6.append(r7)     // Catch:{ Exception -> 0x00e7 }
            r6.append(r4)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00e7 }
            p412v7.C16720b.m99261b(r6)     // Catch:{ Exception -> 0x00e7 }
        L_0x004a:
            r6 = 1
            java.io.InputStream r5 = javax.activation.SecuritySupport.openStream(r4)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            if (r5 == 0) goto L_0x0081
            v7.f r7 = new v7.f     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r7.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            r9.addElement(r7)     // Catch:{ IOException -> 0x00bf, SecurityException -> 0x00a3 }
            boolean r3 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            if (r3 == 0) goto L_0x0073
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            r3.<init>()     // Catch:{ IOException -> 0x007d, SecurityException -> 0x0079, all -> 0x0075 }
            java.lang.String r7 = "MimetypesFileTypeMap: successfully loaded mime types from URL: "
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
            java.lang.String r7 = "MimetypesFileTypeMap: not loading mime types from URL: "
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
            if (r1 != 0) goto L_0x0124
            java.lang.String r0 = "MimetypesFileTypeMap: !anyLoaded"
            p412v7.C16720b.m99261b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            v7.f r10 = r8.loadResource(r10)
            if (r10 == 0) goto L_0x0124
            r9.addElement(r10)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MimetypesFileTypeMap.loadAllResources(java.util.Vector, java.lang.String):void");
    }

    private C16724f loadFile(String str) {
        try {
            return new C16724f(str);
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
    private p412v7.C16724f loadResource(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MimetypesFileTypeMap: can't load "
            r1 = 0
            java.lang.Class r2 = r6.getClass()     // Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054 }
            java.io.InputStream r2 = javax.activation.SecuritySupport.getResourceAsStream(r2, r7)     // Catch:{ IOException -> 0x0073, SecurityException -> 0x0056, all -> 0x0054 }
            if (r2 == 0) goto L_0x0030
            v7.f r3 = new v7.f     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r3.<init>((java.io.InputStream) r2)     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            boolean r4 = p412v7.C16720b.m99260a()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            if (r4 == 0) goto L_0x002c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            r4.<init>()     // Catch:{ IOException -> 0x0052, SecurityException -> 0x0050 }
            java.lang.String r5 = "MimetypesFileTypeMap: successfully loaded mime types file: "
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
            java.lang.String r4 = "MimetypesFileTypeMap: not loading mime types file: "
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
        throw new UnsupportedOperationException("Method not decompiled: javax.activation.MimetypesFileTypeMap.loadResource(java.lang.String):v7.f");
    }

    public synchronized void addMimeTypes(String str) {
        C16724f[] fVarArr = this.f61334DB;
        if (fVarArr[0] == null) {
            fVarArr[0] = new C16724f();
        }
        this.f61334DB[0].mo79649a(str);
    }

    public String getContentType(File file) {
        return getContentType(file.getName());
    }

    public synchronized String getContentType(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String substring = str.substring(lastIndexOf + 1);
        if (substring.length() == 0) {
            return "application/octet-stream";
        }
        int i = 0;
        while (true) {
            C16724f[] fVarArr = this.f61334DB;
            if (i >= fVarArr.length) {
                return "application/octet-stream";
            }
            if (fVarArr[i] != null) {
                String b = fVarArr[i].mo79650b(substring);
                if (b != null) {
                    return b;
                }
            }
            i++;
        }
    }

    public MimetypesFileTypeMap(String str) throws IOException {
        this();
        this.f61334DB[0] = new C16724f(str);
    }

    public MimetypesFileTypeMap(InputStream inputStream) {
        this();
        try {
            this.f61334DB[0] = new C16724f(inputStream);
        } catch (IOException unused) {
        }
    }
}
