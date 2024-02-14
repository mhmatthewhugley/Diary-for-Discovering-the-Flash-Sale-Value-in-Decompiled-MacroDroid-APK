package p292io.grpc.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p226cd.C11179b;

/* renamed from: io.grpc.okhttp.internal.f */
/* compiled from: Platform */
public class C12938f {

    /* renamed from: b */
    public static final Logger f60607b = Logger.getLogger(C12938f.class.getName());

    /* renamed from: c */
    private static final String[] f60608c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final C12938f f60609d = m84996d();

    /* renamed from: a */
    private final Provider f60610a;

    /* renamed from: io.grpc.okhttp.internal.f$a */
    /* compiled from: Platform */
    class C12939a implements PrivilegedExceptionAction<Method> {
        C12939a() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$b */
    /* compiled from: Platform */
    class C12940b implements PrivilegedExceptionAction<Method> {
        C12940b() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$c */
    /* compiled from: Platform */
    class C12941c implements PrivilegedExceptionAction<Method> {
        C12941c() {
        }

        /* renamed from: a */
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$d */
    /* compiled from: Platform */
    private static class C12942d extends C12938f {

        /* renamed from: e */
        private final C12937e<Socket> f60611e;

        /* renamed from: f */
        private final C12937e<Socket> f60612f;

        /* renamed from: g */
        private final Method f60613g;

        /* renamed from: h */
        private final Method f60614h;

        /* renamed from: i */
        private final C12937e<Socket> f60615i;

        /* renamed from: j */
        private final C12937e<Socket> f60616j;

        /* renamed from: k */
        private final C12946h f60617k;

        public C12942d(C12937e<Socket> eVar, C12937e<Socket> eVar2, Method method, Method method2, C12937e<Socket> eVar3, C12937e<Socket> eVar4, Provider provider, C12946h hVar) {
            super(provider);
            this.f60611e = eVar;
            this.f60612f = eVar2;
            this.f60613g = method;
            this.f60614h = method2;
            this.f60615i = eVar3;
            this.f60616j = eVar4;
            this.f60617k = hVar;
        }

        /* renamed from: c */
        public void mo69733c(SSLSocket sSLSocket, String str, List<C12947g> list) {
            if (str != null) {
                this.f60611e.mo69729e(sSLSocket, Boolean.TRUE);
                this.f60612f.mo69729e(sSLSocket, str);
            }
            if (this.f60616j.mo69731g(sSLSocket)) {
                this.f60616j.mo69730f(sSLSocket, C12938f.m84995b(list));
            }
        }

        /* renamed from: h */
        public String mo69735h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f60615i.mo69731g(sSLSocket) && (bArr = (byte[]) this.f60615i.mo69730f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C12949i.f60644c);
            }
            return null;
        }

        /* renamed from: i */
        public C12946h mo69736i() {
            return this.f60617k;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$e */
    /* compiled from: Platform */
    private static class C12943e extends C12938f {

        /* renamed from: e */
        private final Method f60618e;

        /* renamed from: f */
        private final Method f60619f;

        /* synthetic */ C12943e(Provider provider, Method method, Method method2, C12939a aVar) {
            this(provider, method, method2);
        }

        /* renamed from: c */
        public void mo69733c(SSLSocket sSLSocket, String str, List<C12947g> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (C12947g next : list) {
                if (next != C12947g.HTTP_1_0) {
                    arrayList.add(next.toString());
                }
            }
            try {
                this.f60618e.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: h */
        public String mo69735h(SSLSocket sSLSocket) {
            try {
                return (String) this.f60619f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: i */
        public C12946h mo69736i() {
            return C12946h.ALPN_AND_NPN;
        }

        private C12943e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f60618e = method;
            this.f60619f = method2;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$f */
    /* compiled from: Platform */
    private static class C12944f extends C12938f {

        /* renamed from: e */
        private final Method f60620e;

        /* renamed from: f */
        private final Method f60621f;

        /* renamed from: g */
        private final Method f60622g;

        /* renamed from: h */
        private final Class<?> f60623h;

        /* renamed from: i */
        private final Class<?> f60624i;

        public C12944f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f60620e = method;
            this.f60621f = method2;
            this.f60622g = method3;
            this.f60623h = cls;
            this.f60624i = cls2;
        }

        /* renamed from: a */
        public void mo69732a(SSLSocket sSLSocket) {
            try {
                this.f60622g.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
            }
        }

        /* renamed from: c */
        public void mo69733c(SSLSocket sSLSocket, String str, List<C12947g> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C12947g gVar = list.get(i);
                if (gVar != C12947g.HTTP_1_0) {
                    arrayList.add(gVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C12938f.class.getClassLoader(), new Class[]{this.f60623h, this.f60624i}, new C12945g(arrayList));
                this.f60620e.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (InvocationTargetException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: h */
        public String mo69735h(SSLSocket sSLSocket) {
            try {
                C12945g gVar = (C12945g) Proxy.getInvocationHandler(this.f60621f.invoke((Object) null, new Object[]{sSLSocket}));
                if (!gVar.f60626b && gVar.f60627c == null) {
                    C12938f.f60607b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (gVar.f60626b) {
                    return null;
                } else {
                    return gVar.f60627c;
                }
            } catch (InvocationTargetException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }

        /* renamed from: i */
        public C12946h mo69736i() {
            return C12946h.ALPN_AND_NPN;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$g */
    /* compiled from: Platform */
    private static class C12945g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f60625a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f60626b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f60627c;

        public C12945g(List<String> list) {
            this.f60625a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C12949i.f60643b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f60626b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f60625a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f60625a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f60627c = str;
                            return str;
                        }
                    }
                    String str2 = this.f60625a.get(0);
                    this.f60627c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f60627c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: io.grpc.okhttp.internal.f$h */
    /* compiled from: Platform */
    public enum C12946h {
        ALPN_AND_NPN,
        NPN,
        f60630d
    }

    public C12938f(Provider provider) {
        this.f60610a = provider;
    }

    /* renamed from: b */
    public static byte[] m84995b(List<C12947g> list) {
        C11179b bVar = new C11179b();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C12947g gVar = list.get(i);
            if (gVar != C12947g.HTTP_1_0) {
                bVar.writeByte(gVar.toString().length());
                bVar.mo62455s0(gVar.toString());
            }
        }
        return bVar.mo62461v1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p292io.grpc.okhttp.internal.C12938f m84996d() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.security.Provider r8 = m84998f()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L_0x00a3
            io.grpc.okhttp.internal.e r4 = new io.grpc.okhttp.internal.e
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r5[r3] = r6
            java.lang.String r6 = "setUseSessionTickets"
            r4.<init>(r2, r6, r5)
            io.grpc.okhttp.internal.e r5 = new io.grpc.okhttp.internal.e
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7
            java.lang.String r7 = "setHostname"
            r5.<init>(r2, r7, r6)
            io.grpc.okhttp.internal.e r6 = new io.grpc.okhttp.internal.e
            java.lang.Class[] r7 = new java.lang.Class[r3]
            java.lang.String r9 = "getAlpnSelectedProtocol"
            r6.<init>(r0, r9, r7)
            io.grpc.okhttp.internal.e r7 = new io.grpc.okhttp.internal.e
            java.lang.Class[] r9 = new java.lang.Class[r1]
            r9[r3] = r0
            java.lang.String r0 = "setAlpnProtocols"
            r7.<init>(r2, r0, r9)
            java.lang.String r0 = "android.net.TrafficStats"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r9 = "tagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.reflect.Method r9 = r0.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0058 }
            java.lang.String r10 = "untagSocket"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r1[r3] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            goto L_0x005a
        L_0x0058:
            r9 = r2
        L_0x0059:
            r0 = r2
        L_0x005a:
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "GmsCore_OpenSSL"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Conscrypt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "Ssl_Guard"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007f
            goto L_0x0094
        L_0x007f:
            boolean r1 = m85000k()
            if (r1 == 0) goto L_0x0088
            io.grpc.okhttp.internal.f$h r1 = p292io.grpc.okhttp.internal.C12938f.C12946h.ALPN_AND_NPN
            goto L_0x0096
        L_0x0088:
            boolean r1 = m84999j()
            if (r1 == 0) goto L_0x0091
            io.grpc.okhttp.internal.f$h r1 = p292io.grpc.okhttp.internal.C12938f.C12946h.NPN
            goto L_0x0096
        L_0x0091:
            io.grpc.okhttp.internal.f$h r1 = p292io.grpc.okhttp.internal.C12938f.C12946h.f60630d
            goto L_0x0096
        L_0x0094:
            io.grpc.okhttp.internal.f$h r1 = p292io.grpc.okhttp.internal.C12938f.C12946h.ALPN_AND_NPN
        L_0x0096:
            r10 = r1
            io.grpc.okhttp.internal.f$d r11 = new io.grpc.okhttp.internal.f$d
            r1 = r11
            r2 = r4
            r3 = r5
            r4 = r9
            r5 = r0
            r9 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L_0x00a3:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getDefault()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.security.Provider r0 = r0.getProvider()     // Catch:{ NoSuchAlgorithmException -> 0x0160 }
            java.lang.String r4 = "TLS"
            javax.net.ssl.SSLContext r4 = javax.net.ssl.SSLContext.getInstance(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.init(r2, r2, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            javax.net.ssl.SSLEngine r4 = r4.createSSLEngine()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            io.grpc.okhttp.internal.f$a r5 = new io.grpc.okhttp.internal.f$a     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.invoke(r4, r6)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            io.grpc.okhttp.internal.f$b r4 = new io.grpc.okhttp.internal.f$b     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r4.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            io.grpc.okhttp.internal.f$c r5 = new io.grpc.okhttp.internal.f$c     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            io.grpc.okhttp.internal.f$e r6 = new io.grpc.okhttp.internal.f$e     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            r6.<init>(r0, r4, r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e4 }
            return r6
        L_0x00e4:
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r5.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = "$Provider"
            r5.append(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r7 = "$ClientProvider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r8 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "$ServerProvider"
            r6.append(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class r9 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r6[r1] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r5 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r6 = r4.getMethod(r2, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.String r2 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            java.lang.reflect.Method r7 = r4.getMethod(r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            io.grpc.okhttp.internal.f$f r1 = new io.grpc.okhttp.internal.f$f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            r4 = r1
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x015a }
            return r1
        L_0x015a:
            io.grpc.okhttp.internal.f r1 = new io.grpc.okhttp.internal.f
            r1.<init>(r0)
            return r1
        L_0x0160:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.okhttp.internal.C12938f.m84996d():io.grpc.okhttp.internal.f");
    }

    /* renamed from: e */
    public static C12938f m84997e() {
        return f60609d;
    }

    /* renamed from: f */
    private static Provider m84998f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f60608c) {
                if (str.equals(provider.getClass().getName())) {
                    f60607b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f60607b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    private static boolean m84999j() {
        try {
            C12938f.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            f60607b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m85000k() {
        try {
            C12938f.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            f60607b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo69732a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo69733c(SSLSocket sSLSocket, String str, List<C12947g> list) {
    }

    /* renamed from: g */
    public Provider mo69734g() {
        return this.f60610a;
    }

    /* renamed from: h */
    public String mo69735h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public C12946h mo69736i() {
        return C12946h.f60630d;
    }
}
