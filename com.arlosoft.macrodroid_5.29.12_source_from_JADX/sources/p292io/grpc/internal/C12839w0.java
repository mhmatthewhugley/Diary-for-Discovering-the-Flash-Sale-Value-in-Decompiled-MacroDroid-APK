package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Verify;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import p292io.grpc.C12520a;
import p292io.grpc.C13005w;
import p292io.grpc.internal.C12602b0;

/* renamed from: io.grpc.internal.w0 */
/* compiled from: JndiResourceResolverFactory */
final class C12839w0 implements C12602b0.C12610f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Throwable f60282a = m84672d();

    @VisibleForTesting
    /* renamed from: io.grpc.internal.w0$a */
    /* compiled from: JndiResourceResolverFactory */
    static final class C12840a implements C12843c {
        C12840a() {
        }

        /* renamed from: b */
        private static void m84675b() {
            if (C12839w0.f60282a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C12839w0.f60282a);
            }
        }

        /* renamed from: c */
        private static void m84676c(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: d */
        private static void m84677d(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: a */
        public List<String> mo69605a(String str, String str2) throws NamingException {
            m84675b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                m84676c(all2, e);
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        m84676c(all, e2);
                    }
                }
                all.close();
            } catch (NamingException e3) {
                m84677d(initialDirContext, e3);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.w0$b */
    /* compiled from: JndiResourceResolverFactory */
    static final class C12841b implements C12602b0.C12609e {

        /* renamed from: b */
        private static final Logger f60283b = Logger.getLogger(C12841b.class.getName());

        /* renamed from: c */
        private static final Pattern f60284c = Pattern.compile("\\s+");

        /* renamed from: a */
        private final C12843c f60285a;

        /* renamed from: io.grpc.internal.w0$b$a */
        /* compiled from: JndiResourceResolverFactory */
        private static final class C12842a {

            /* renamed from: a */
            final String f60286a;

            /* renamed from: b */
            final int f60287b;

            C12842a(String str, int i) {
                this.f60286a = str;
                this.f60287b = i;
            }
        }

        public C12841b(C12843c cVar) {
            this.f60285a = cVar;
        }

        /* renamed from: c */
        private static C12842a m84679c(String str) {
            String[] split = f60284c.split(str);
            Verify.m5498a(split.length == 4, "Bad SRV Record: %s", str);
            return new C12842a(split[3], Integer.parseInt(split[2]));
        }

        @VisibleForTesting
        /* renamed from: d */
        static String m84680d(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            boolean z = false;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (!z) {
                    if (charAt != ' ') {
                        if (charAt == '\"') {
                            z = true;
                        }
                    }
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                    i++;
                } else if (charAt == '\\') {
                    i++;
                    charAt = str.charAt(i);
                }
                sb.append(charAt);
                i++;
            }
            return sb.toString();
        }

        /* renamed from: a */
        public List<String> mo69228a(String str) throws NamingException {
            Logger logger = f60283b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            C12843c cVar = this.f60285a;
            List<String> a = cVar.mo69605a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a.size())});
            }
            ArrayList arrayList = new ArrayList(a.size());
            for (String d : a) {
                arrayList.add(m84680d(d));
            }
            return Collections.unmodifiableList(arrayList);
        }

        /* renamed from: b */
        public List<C13005w> mo69229b(C12602b0.C12603a aVar, String str) throws Exception {
            Logger logger = f60283b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query SRV records for {0}", new Object[]{str});
            }
            C12843c cVar = this.f60285a;
            List<String> a = cVar.mo69605a("SRV", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} SRV records", new Object[]{Integer.valueOf(a.size())});
            }
            ArrayList arrayList = new ArrayList(a.size());
            Throwable th = null;
            Level level2 = Level.WARNING;
            for (String next : a) {
                try {
                    C12842a c = m84679c(next);
                    if (c.f60286a.endsWith(".")) {
                        String str2 = c.f60286a;
                        String substring = str2.substring(0, str2.length() - 1);
                        List<InetAddress> b = aVar.mo69222b(c.f60286a);
                        ArrayList arrayList2 = new ArrayList(b.size());
                        for (InetAddress inetSocketAddress : b) {
                            arrayList2.add(new InetSocketAddress(inetSocketAddress, c.f60287b));
                        }
                        arrayList.add(new C13005w((List<SocketAddress>) Collections.unmodifiableList(arrayList2), C12520a.m83640c().mo69033d(C12743n0.f60014c, substring).mo69031a()));
                    } else {
                        throw new RuntimeException("Returned SRV host does not end in period: " + c.f60286a);
                    }
                } catch (UnknownHostException e) {
                    e = e;
                    Logger logger2 = f60283b;
                    logger2.log(level2, "Can't find address for SRV record " + next, e);
                    if (th == null) {
                        level2 = Level.FINE;
                        th = e;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    Logger logger3 = f60283b;
                    logger3.log(level2, "Failed to construct SRV record " + next, e);
                    if (th == null) {
                        level2 = Level.FINE;
                        th = e;
                    }
                }
            }
            if (!arrayList.isEmpty() || th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.w0$c */
    /* compiled from: JndiResourceResolverFactory */
    interface C12843c {
        /* renamed from: a */
        List<String> mo69605a(String str, String str2) throws NamingException;
    }

    /* renamed from: d */
    private static Throwable m84672d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (RuntimeException e2) {
            return e2;
        } catch (Error e3) {
            return e3;
        }
    }

    /* renamed from: a */
    public C12602b0.C12609e mo69230a() {
        if (mo69231b() != null) {
            return null;
        }
        return new C12841b(new C12840a());
    }

    /* renamed from: b */
    public Throwable mo69231b() {
        return f60282a;
    }
}
