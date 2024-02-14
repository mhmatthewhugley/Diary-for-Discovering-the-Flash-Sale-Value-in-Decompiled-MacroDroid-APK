package javax.mail.internet;

import com.sun.mail.util.PropUtil;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.mail.Address;
import javax.mail.Session;
import org.apache.commons.p353io.IOUtils;

public class InternetAddress extends Address implements Cloneable {
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final boolean ignoreBogusGroupName = PropUtil.getBooleanSystemProperty("mail.mime.address.ignorebogusgroupname", true);
    private static final String rfc822phrase = HeaderTokenizer.RFC822.replace(' ', 0).replace(9, 0);
    private static final long serialVersionUID = -7507595530758302903L;
    private static final String specialsNoDot = "()<>,;:\\\"[]@";
    private static final String specialsNoDotNoAt = "()<>,;:\\\"[]";
    private static final boolean useCanonicalHostName = PropUtil.getBooleanSystemProperty("mail.mime.address.usecanonicalhostname", true);
    protected String address;
    protected String encodedPersonal;
    protected String personal;

    public InternetAddress() {
    }

    static InternetAddress _getLocalAddress(Session session) throws SecurityException, AddressException, UnknownHostException {
        String str;
        String str2;
        String str3;
        String str4;
        if (session == null) {
            str = System.getProperty("user.name");
            str3 = getLocalHostName();
            str2 = null;
        } else {
            str2 = session.getProperty("mail.from");
            if (str2 == null) {
                String property = session.getProperty("mail.user");
                if (property == null || property.length() == 0) {
                    property = session.getProperty("user.name");
                }
                if (property == null || property.length() == 0) {
                    str4 = System.getProperty("user.name");
                } else {
                    str4 = property;
                }
                String property2 = session.getProperty("mail.host");
                if (property2 == null || property2.length() == 0) {
                    property2 = getLocalHostName();
                }
                String str5 = str4;
                str3 = property2;
                str = str5;
            } else {
                str = null;
                str3 = null;
            }
        }
        if (!(str2 != null || str == null || str.length() == 0 || str3 == null || str3.length() == 0)) {
            str2 = MimeUtility.quote(str.trim(), "()<>,;:\\\"[]@\t ") + "@" + str3;
        }
        if (str2 == null) {
            return null;
        }
        return new InternetAddress(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0143, code lost:
        throw new javax.mail.internet.AddressException("Domain literal not at start of domain", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0146, code lost:
        if (r6 != ']') goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x014a, code lost:
        if (r2 != (r1 - 1)) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x014c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0155, code lost:
        throw new javax.mail.internet.AddressException("Domain literal end not at end of domain", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0156, code lost:
        if (r6 <= ' ') goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0158, code lost:
        if (r6 == 127) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x015a, code lost:
        if (r5 != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0160, code lost:
        if (java.lang.Character.isLetterOrDigit(r6) != false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0164, code lost:
        if (r6 == '-') goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0166, code lost:
        if (r6 != '.') goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0170, code lost:
        throw new javax.mail.internet.AddressException("Domain contains illegal character", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0171, code lost:
        if (r6 != '.') goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0173, code lost:
        if (r7 == '.') goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x017d, code lost:
        throw new javax.mail.internet.AddressException("Domain contains dot-dot", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x017e, code lost:
        r2 = r2 + 1;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0189, code lost:
        throw new javax.mail.internet.AddressException("Domain contains control or whitespace", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x018a, code lost:
        if (r7 == '.') goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x018c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0194, code lost:
        throw new javax.mail.internet.AddressException("Domain ends with dot", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x019c, code lost:
        throw new javax.mail.internet.AddressException("Domain starts with dot", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01a4, code lost:
        throw new javax.mail.internet.AddressException("Missing domain", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01ac, code lost:
        throw new javax.mail.internet.AddressException("Unterminated quote", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0114, code lost:
        if (r9 != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0116, code lost:
        if (r6 == '@') goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0118, code lost:
        if (r18 != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0122, code lost:
        throw new javax.mail.internet.AddressException("Missing final '@domain'", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0123, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0124, code lost:
        if (r8 >= r1) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012a, code lost:
        if (r0.charAt(r8) == '.') goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012c, code lost:
        r2 = r8;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012e, code lost:
        if (r2 >= r1) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0130, code lost:
        r6 = r0.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0136, code lost:
        if (r6 != '[') goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0138, code lost:
        if (r2 != r8) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013a, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void checkAddress(java.lang.String r16, boolean r17, boolean r18) throws javax.mail.internet.AddressException {
        /*
            r0 = r16
            if (r0 == 0) goto L_0x01b5
            int r1 = r16.length()
            if (r1 == 0) goto L_0x01ad
            r2 = 64
            r3 = 0
            r4 = 1
            if (r17 == 0) goto L_0x003b
            char r5 = r0.charAt(r3)
            if (r5 != r2) goto L_0x003b
            r5 = 0
        L_0x0017:
            java.lang.String r6 = ",:"
            int r6 = indexOfAny(r0, r6, r5)
            if (r6 < 0) goto L_0x003c
            char r5 = r0.charAt(r5)
            if (r5 != r2) goto L_0x0033
            char r5 = r0.charAt(r6)
            r7 = 58
            if (r5 != r7) goto L_0x0030
            int r5 = r6 + 1
            goto L_0x003c
        L_0x0030:
            int r5 = r6 + 1
            goto L_0x0017
        L_0x0033:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Illegal route-addr"
            r1.<init>(r2, r0)
            throw r1
        L_0x003b:
            r5 = 0
        L_0x003c:
            r6 = 65535(0xffff, float:9.1834E-41)
            r8 = r5
            r7 = 65535(0xffff, float:9.1834E-41)
            r9 = 0
        L_0x0044:
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 32
            r12 = 46
            if (r8 >= r1) goto L_0x0114
            char r7 = r0.charAt(r8)
            r13 = 92
            if (r7 == r13) goto L_0x010d
            if (r6 != r13) goto L_0x0058
            goto L_0x010d
        L_0x0058:
            r13 = 34
            if (r7 != r13) goto L_0x0086
            if (r9 == 0) goto L_0x0076
            if (r18 == 0) goto L_0x0073
            int r9 = r8 + 1
            if (r9 >= r1) goto L_0x0073
            char r9 = r0.charAt(r9)
            if (r9 != r2) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Quote not at end of local address"
            r1.<init>(r2, r0)
            throw r1
        L_0x0073:
            r9 = 0
            goto L_0x010d
        L_0x0076:
            if (r18 == 0) goto L_0x0083
            if (r8 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Quote not at start of local address"
            r1.<init>(r2, r0)
            throw r1
        L_0x0083:
            r9 = 1
            goto L_0x010d
        L_0x0086:
            r13 = 13
            r14 = 10
            if (r7 != r13) goto L_0x009f
            int r13 = r8 + 1
            if (r13 >= r1) goto L_0x00bc
            char r13 = r0.charAt(r13)
            if (r13 != r14) goto L_0x0097
            goto L_0x00bc
        L_0x0097:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Quoted local address contains CR without LF"
            r1.<init>(r2, r0)
            throw r1
        L_0x009f:
            if (r7 != r14) goto L_0x00bc
            int r13 = r8 + 1
            if (r13 >= r1) goto L_0x00bc
            char r14 = r0.charAt(r13)
            if (r14 == r11) goto L_0x00bc
            char r13 = r0.charAt(r13)
            r14 = 9
            if (r13 != r14) goto L_0x00b4
            goto L_0x00bc
        L_0x00b4:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Quoted local address contains newline without whitespace"
            r1.<init>(r2, r0)
            throw r1
        L_0x00bc:
            if (r9 == 0) goto L_0x00bf
            goto L_0x010d
        L_0x00bf:
            if (r7 != r12) goto L_0x00d6
            if (r8 == r5) goto L_0x00ce
            if (r6 == r12) goto L_0x00c6
            goto L_0x00d6
        L_0x00c6:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Local address contains dot-dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x00ce:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Local address starts with dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x00d6:
            if (r7 != r2) goto L_0x00f0
            if (r8 == 0) goto L_0x00e8
            if (r6 == r12) goto L_0x00e0
            r15 = r7
            r7 = r6
            r6 = r15
            goto L_0x0114
        L_0x00e0:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Local address ends with dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x00e8:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing local name"
            r1.<init>(r2, r0)
            throw r1
        L_0x00f0:
            if (r7 <= r11) goto L_0x0105
            if (r7 == r10) goto L_0x0105
            java.lang.String r10 = "()<>,;:\\\"[]@"
            int r10 = r10.indexOf(r7)
            if (r10 >= 0) goto L_0x00fd
            goto L_0x010d
        L_0x00fd:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Local address contains illegal character"
            r1.<init>(r2, r0)
            throw r1
        L_0x0105:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Local address contains control or whitespace"
            r1.<init>(r2, r0)
            throw r1
        L_0x010d:
            int r8 = r8 + 1
            r15 = r7
            r7 = r6
            r6 = r15
            goto L_0x0044
        L_0x0114:
            if (r9 != 0) goto L_0x01a5
            if (r6 == r2) goto L_0x0123
            if (r18 != 0) goto L_0x011b
            return
        L_0x011b:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing final '@domain'"
            r1.<init>(r2, r0)
            throw r1
        L_0x0123:
            int r8 = r8 + r4
            if (r8 >= r1) goto L_0x019d
            char r2 = r0.charAt(r8)
            if (r2 == r12) goto L_0x0195
            r2 = r8
            r5 = 0
        L_0x012e:
            if (r2 >= r1) goto L_0x018a
            char r6 = r0.charAt(r2)
            r9 = 91
            if (r6 != r9) goto L_0x0144
            if (r2 != r8) goto L_0x013c
            r5 = 1
            goto L_0x017e
        L_0x013c:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain literal not at start of domain"
            r1.<init>(r2, r0)
            throw r1
        L_0x0144:
            r9 = 93
            if (r6 != r9) goto L_0x0156
            int r5 = r1 + -1
            if (r2 != r5) goto L_0x014e
            r5 = 0
            goto L_0x017e
        L_0x014e:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain literal end not at end of domain"
            r1.<init>(r2, r0)
            throw r1
        L_0x0156:
            if (r6 <= r11) goto L_0x0182
            if (r6 == r10) goto L_0x0182
            if (r5 != 0) goto L_0x017e
            boolean r9 = java.lang.Character.isLetterOrDigit(r6)
            if (r9 != 0) goto L_0x0171
            r9 = 45
            if (r6 == r9) goto L_0x0171
            if (r6 != r12) goto L_0x0169
            goto L_0x0171
        L_0x0169:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain contains illegal character"
            r1.<init>(r2, r0)
            throw r1
        L_0x0171:
            if (r6 != r12) goto L_0x017e
            if (r7 == r12) goto L_0x0176
            goto L_0x017e
        L_0x0176:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain contains dot-dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x017e:
            int r2 = r2 + 1
            r7 = r6
            goto L_0x012e
        L_0x0182:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain contains control or whitespace"
            r1.<init>(r2, r0)
            throw r1
        L_0x018a:
            if (r7 == r12) goto L_0x018d
            return
        L_0x018d:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain ends with dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x0195:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Domain starts with dot"
            r1.<init>(r2, r0)
            throw r1
        L_0x019d:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing domain"
            r1.<init>(r2, r0)
            throw r1
        L_0x01a5:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Unterminated quote"
            r1.<init>(r2, r0)
            throw r1
        L_0x01ad:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Empty address"
            r1.<init>(r2, r0)
            throw r1
        L_0x01b5:
            javax.mail.internet.AddressException r0 = new javax.mail.internet.AddressException
            java.lang.String r1 = "Address is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.InternetAddress.checkAddress(java.lang.String, boolean, boolean):void");
    }

    public static InternetAddress getLocalAddress(Session session) {
        try {
            return _getLocalAddress(session);
        } catch (SecurityException | UnknownHostException | AddressException unused) {
            return null;
        }
    }

    private static String getLocalHostName() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        String str = null;
        if (localHost == null) {
            return null;
        }
        if (useCanonicalHostName) {
            str = localHost.getCanonicalHostName();
        }
        if (str == null) {
            str = localHost.getHostName();
        }
        if (str == null) {
            str = localHost.getHostAddress();
        }
        if (str == null || str.length() <= 0 || !isInetAddressLiteral(str)) {
            return str;
        }
        return '[' + str + ']';
    }

    private static int indexOfAny(String str, String str2) {
        return indexOfAny(str, str2, 0);
    }

    private static boolean isInetAddressLiteral(String str) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && charAt != '.') {
                if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                    z = true;
                } else if (charAt != ':') {
                    return false;
                } else {
                    z2 = true;
                }
            }
        }
        if (!z || z2) {
            return true;
        }
        return false;
    }

    private boolean isSimple() {
        String str = this.address;
        return str == null || indexOfAny(str, specialsNoDotNoAt) < 0;
    }

    private static int lengthOfFirstSegment(String str) {
        int indexOf = str.indexOf(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (indexOf != -1) {
            return indexOf;
        }
        return str.length();
    }

    private static int lengthOfLastSegment(String str, int i) {
        int lastIndexOf = str.lastIndexOf(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (lastIndexOf != -1) {
            return (str.length() - lastIndexOf) - 2;
        }
        return str.length() + i;
    }

    public static InternetAddress[] parse(String str) throws AddressException {
        return parse(str, true);
    }

    public static InternetAddress[] parseHeader(String str, boolean z) throws AddressException {
        return parse(MimeUtility.unfold(str), z, true);
    }

    private static String quotePhrase(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == '\\') {
                StringBuilder sb = new StringBuilder(length + 3);
                sb.append('\"');
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == '\"' || charAt2 == '\\') {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(charAt2);
                }
                sb.append('\"');
                return sb.toString();
            }
            if ((charAt < ' ' && charAt != 13 && charAt != 10 && charAt != 9) || ((charAt >= 127 && !allowUtf8) || rfc822phrase.indexOf(charAt) >= 0)) {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(length + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }

    private static String unquote(String str) {
        if (!str.startsWith("\"") || !str.endsWith("\"") || str.length() <= 1) {
            return str;
        }
        String substring = str.substring(1, str.length() - 1);
        if (substring.indexOf(92) < 0) {
            return substring;
        }
        StringBuilder sb = new StringBuilder(substring.length());
        int i = 0;
        while (i < substring.length()) {
            char charAt = substring.charAt(i);
            if (charAt == '\\' && i < substring.length() - 1) {
                i++;
                charAt = substring.charAt(i);
            }
            sb.append(charAt);
            i++;
        }
        return sb.toString();
    }

    public Object clone() {
        try {
            return (InternetAddress) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InternetAddress)) {
            return false;
        }
        String address2 = ((InternetAddress) obj).getAddress();
        String str = this.address;
        if (address2 == str) {
            return true;
        }
        if (str == null || !str.equalsIgnoreCase(address2)) {
            return false;
        }
        return true;
    }

    public String getAddress() {
        return this.address;
    }

    public InternetAddress[] getGroup(boolean z) throws AddressException {
        int indexOf;
        String address2 = getAddress();
        if (address2 != null && address2.endsWith(";") && (indexOf = address2.indexOf(58)) >= 0) {
            return parseHeader(address2.substring(indexOf + 1, address2.length() - 1), z);
        }
        return null;
    }

    public String getPersonal() {
        String str = this.personal;
        if (str != null) {
            return str;
        }
        String str2 = this.encodedPersonal;
        if (str2 == null) {
            return null;
        }
        try {
            String decodeText = MimeUtility.decodeText(str2);
            this.personal = decodeText;
            return decodeText;
        } catch (Exception unused) {
            return this.encodedPersonal;
        }
    }

    public String getType() {
        return "rfc822";
    }

    public int hashCode() {
        String str = this.address;
        if (str == null) {
            return 0;
        }
        return str.toLowerCase(Locale.ENGLISH).hashCode();
    }

    public boolean isGroup() {
        String str = this.address;
        return str != null && str.endsWith(";") && this.address.indexOf(58) > 0;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPersonal(String str, String str2) throws UnsupportedEncodingException {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = MimeUtility.encodeWord(str, str2, (String) null);
        } else {
            this.encodedPersonal = null;
        }
    }

    public String toString() {
        String str;
        String str2 = this.address;
        if (str2 == null) {
            str2 = "";
        }
        if (this.encodedPersonal == null && (str = this.personal) != null) {
            try {
                this.encodedPersonal = MimeUtility.encodeWord(str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (this.encodedPersonal != null) {
            return quotePhrase(this.encodedPersonal) + " <" + str2 + ">";
        } else if (isGroup() || isSimple()) {
            return str2;
        } else {
            return "<" + str2 + ">";
        }
    }

    public String toUnicodeString() {
        String personal2 = getPersonal();
        if (personal2 != null) {
            return quotePhrase(personal2) + " <" + this.address + ">";
        } else if (isGroup() || isSimple()) {
            return this.address;
        } else {
            return "<" + this.address + ">";
        }
    }

    public void validate() throws AddressException {
        if (isGroup()) {
            getGroup(true);
        } else {
            checkAddress(getAddress(), true, true);
        }
    }

    public InternetAddress(String str) throws AddressException {
        InternetAddress[] parse = parse(str, true);
        if (parse.length == 1) {
            this.address = parse[0].address;
            this.personal = parse[0].personal;
            this.encodedPersonal = parse[0].encodedPersonal;
            return;
        }
        throw new AddressException("Illegal address", str);
    }

    private static int indexOfAny(String str, String str2, int i) {
        try {
            int length = str.length();
            while (i < length) {
                if (str2.indexOf(str.charAt(i)) >= 0) {
                    return i;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        return -1;
    }

    public static InternetAddress[] parse(String str, boolean z) throws AddressException {
        return parse(str, z, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x019b, code lost:
        if (r2 == ';') goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01e4, code lost:
        if (r8 == -1) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0263, code lost:
        if (r8 == -1) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02a3, code lost:
        if (r3.trim().length() == 0) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x035e, code lost:
        if (r0.trim().length() == 0) goto L_0x0360;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x00c2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.mail.internet.InternetAddress[] parse(java.lang.String r19, boolean r20, boolean r21) throws javax.mail.internet.AddressException {
        /*
            r0 = r19
            int r1 = r19.length()
            if (r21 == 0) goto L_0x000c
            if (r20 != 0) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7 = 0
            r8 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = -1
        L_0x001a:
            r16 = 0
            if (r7 >= r1) goto L_0x0337
            char r15 = r0.charAt(r7)
            r2 = 9
            if (r15 == r2) goto L_0x0333
            r2 = 10
            if (r15 == r2) goto L_0x0333
            r2 = 13
            if (r15 == r2) goto L_0x0333
            r2 = 32
            if (r15 == r2) goto L_0x0333
            java.lang.String r2 = "Missing '\"'"
            r3 = 34
            if (r15 == r3) goto L_0x0308
            r6 = 44
            if (r15 == r6) goto L_0x0270
            r6 = 62
            if (r15 == r6) goto L_0x0260
            r6 = 91
            if (r15 == r6) goto L_0x0233
            r6 = 41
            r3 = 40
            if (r15 == r3) goto L_0x01f0
            if (r15 == r6) goto L_0x01e1
            switch(r15) {
                case 58: goto L_0x015a;
                case 59: goto L_0x0114;
                case 60: goto L_0x0055;
                default: goto L_0x004f;
            }
        L_0x004f:
            r3 = -1
            if (r8 != r3) goto L_0x0333
            r2 = -1
            goto L_0x0265
        L_0x0055:
            r3 = -1
            if (r11 == 0) goto L_0x0095
            if (r4 == 0) goto L_0x008d
            if (r8 != r3) goto L_0x005e
            goto L_0x0273
        L_0x005e:
            if (r10 != 0) goto L_0x0095
            if (r9 != r3) goto L_0x0063
            r9 = r7
        L_0x0063:
            java.lang.String r3 = r0.substring(r8, r9)
            java.lang.String r3 = r3.trim()
            javax.mail.internet.InternetAddress r6 = new javax.mail.internet.InternetAddress
            r6.<init>()
            r6.setAddress(r3)
            if (r13 < 0) goto L_0x0083
            java.lang.String r3 = r0.substring(r13, r14)
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = unquote(r3)
            r6.encodedPersonal = r3
        L_0x0083:
            r5.add(r6)
            r8 = -1
            r9 = -1
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = -1
            goto L_0x0096
        L_0x008d:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Extra route-addr"
            r1.<init>(r2, r0, r7)
            throw r1
        L_0x0095:
            r12 = 1
        L_0x0096:
            int r3 = r7 + 1
            r15 = r3
            r6 = 0
        L_0x009a:
            r16 = r3
            if (r15 >= r1) goto L_0x00c2
            char r3 = r0.charAt(r15)
            r17 = r9
            r9 = 34
            if (r3 == r9) goto L_0x00b8
            r9 = 62
            if (r3 == r9) goto L_0x00b4
            r9 = 92
            if (r3 == r9) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            int r15 = r15 + 1
            goto L_0x00b6
        L_0x00b4:
            if (r6 == 0) goto L_0x00c4
        L_0x00b6:
            r3 = 1
            goto L_0x00bc
        L_0x00b8:
            r3 = r6 ^ 1
            r6 = r3
            goto L_0x00b6
        L_0x00bc:
            int r15 = r15 + r3
            r3 = r16
            r9 = r17
            goto L_0x009a
        L_0x00c2:
            r17 = r9
        L_0x00c4:
            if (r6 == 0) goto L_0x00ea
            if (r4 == 0) goto L_0x00e4
            r2 = r16
        L_0x00ca:
            if (r2 >= r1) goto L_0x00e2
            char r3 = r0.charAt(r2)
            r6 = 92
            if (r3 != r6) goto L_0x00da
            int r2 = r2 + 1
            r3 = 1
            r6 = 62
            goto L_0x00e0
        L_0x00da:
            r6 = 62
            if (r3 != r6) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r3 = 1
        L_0x00e0:
            int r2 = r2 + r3
            goto L_0x00ca
        L_0x00e2:
            r9 = r2
            goto L_0x00eb
        L_0x00e4:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            r1.<init>(r2, r0, r15)
            throw r1
        L_0x00ea:
            r9 = r15
        L_0x00eb:
            if (r9 < r1) goto L_0x0101
            if (r4 == 0) goto L_0x00f9
            r2 = -1
            if (r8 != r2) goto L_0x00f3
            r8 = r7
        L_0x00f3:
            r7 = r16
            r9 = r17
            goto L_0x0333
        L_0x00f9:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '>'"
            r1.<init>(r2, r0, r9)
            throw r1
        L_0x0101:
            if (r10 != 0) goto L_0x010d
            if (r8 < 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r8 = r13
            r7 = r14
        L_0x0108:
            r14 = r7
            r13 = r8
            r7 = r16
            goto L_0x010e
        L_0x010d:
            r7 = r8
        L_0x010e:
            r8 = r7
            r7 = r9
            r2 = 1
            r11 = 1
            goto L_0x0334
        L_0x0114:
            r2 = -1
            if (r8 != r2) goto L_0x0119
            goto L_0x0273
        L_0x0119:
            if (r10 == 0) goto L_0x014e
            if (r21 == 0) goto L_0x012f
            if (r20 != 0) goto L_0x012f
            int r2 = r7 + 1
            if (r2 >= r1) goto L_0x012f
            char r2 = r0.charAt(r2)
            r3 = 64
            if (r2 != r3) goto L_0x012f
            r2 = 1
            r10 = 0
            goto L_0x0334
        L_0x012f:
            javax.mail.internet.InternetAddress r2 = new javax.mail.internet.InternetAddress
            r2.<init>()
            int r3 = r7 + 1
            java.lang.String r3 = r0.substring(r8, r3)
            java.lang.String r3 = r3.trim()
            r2.setAddress(r3)
            r5.add(r2)
            r2 = 1
            r8 = -1
            r9 = -1
            r10 = 0
        L_0x0148:
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = -1
            goto L_0x0334
        L_0x014e:
            if (r4 == 0) goto L_0x0152
            goto L_0x0270
        L_0x0152:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Illegal semicolon, not in group"
            r1.<init>(r2, r0, r7)
            throw r1
        L_0x015a:
            if (r10 == 0) goto L_0x0167
            if (r4 == 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Nested group"
            r1.<init>(r2, r0, r7)
            throw r1
        L_0x0167:
            r2 = -1
            if (r8 != r2) goto L_0x016b
            r8 = r7
        L_0x016b:
            if (r21 == 0) goto L_0x01dd
            if (r20 != 0) goto L_0x01dd
            int r2 = r7 + 1
            if (r2 >= r1) goto L_0x019f
            java.lang.String r3 = ")>[]:@\\,."
            char r2 = r0.charAt(r2)
            int r6 = r3.indexOf(r2)
            if (r6 < 0) goto L_0x019f
            r6 = 64
            if (r2 == r6) goto L_0x0184
            goto L_0x019d
        L_0x0184:
            int r6 = r7 + 2
        L_0x0186:
            r12 = 59
            if (r6 >= r1) goto L_0x019b
            char r2 = r0.charAt(r6)
            if (r2 != r12) goto L_0x0191
            goto L_0x019b
        L_0x0191:
            int r15 = r3.indexOf(r2)
            if (r15 < 0) goto L_0x0198
            goto L_0x019b
        L_0x0198:
            int r6 = r6 + 1
            goto L_0x0186
        L_0x019b:
            if (r2 != r12) goto L_0x019f
        L_0x019d:
            goto L_0x0328
        L_0x019f:
            java.lang.String r2 = r0.substring(r8, r7)
            boolean r3 = ignoreBogusGroupName
            if (r3 == 0) goto L_0x01da
            java.lang.String r3 = "mailto"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01d7
            java.lang.String r3 = "From"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01d7
            java.lang.String r3 = "To"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01d7
            java.lang.String r3 = "Cc"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01d7
            java.lang.String r3 = "Subject"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x01d7
            java.lang.String r3 = "Re"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x01da
        L_0x01d7:
            r8 = -1
            goto L_0x0330
        L_0x01da:
            r10 = 1
            goto L_0x0330
        L_0x01dd:
            r2 = 1
            r10 = 1
            goto L_0x0331
        L_0x01e1:
            if (r4 == 0) goto L_0x01e8
            r2 = -1
            if (r8 != r2) goto L_0x0333
            goto L_0x0265
        L_0x01e8:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '('"
            r1.<init>(r2, r0, r7)
            throw r1
        L_0x01f0:
            r2 = -1
            if (r8 < 0) goto L_0x01f6
            if (r9 != r2) goto L_0x01f6
            r9 = r7
        L_0x01f6:
            int r7 = r7 + 1
            r12 = r7
            r2 = 1
        L_0x01fa:
            if (r12 >= r1) goto L_0x0219
            if (r2 <= 0) goto L_0x0219
            char r15 = r0.charAt(r12)
            if (r15 == r3) goto L_0x0212
            if (r15 == r6) goto L_0x020f
            r3 = 92
            if (r15 == r3) goto L_0x020c
        L_0x020a:
            r3 = 1
            goto L_0x0215
        L_0x020c:
            int r12 = r12 + 1
            goto L_0x020a
        L_0x020f:
            int r2 = r2 + -1
            goto L_0x020a
        L_0x0212:
            int r2 = r2 + 1
            goto L_0x020a
        L_0x0215:
            int r12 = r12 + r3
            r3 = 40
            goto L_0x01fa
        L_0x0219:
            if (r2 <= 0) goto L_0x0227
            if (r4 == 0) goto L_0x021f
            goto L_0x0328
        L_0x021f:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing ')'"
            r1.<init>(r2, r0, r12)
            throw r1
        L_0x0227:
            int r2 = r12 + -1
            r3 = -1
            if (r13 != r3) goto L_0x022d
            r13 = r7
        L_0x022d:
            if (r14 != r3) goto L_0x025d
            r7 = r2
            r14 = r7
            goto L_0x0330
        L_0x0233:
            r3 = -1
            if (r8 != r3) goto L_0x0237
            r8 = r7
        L_0x0237:
            int r7 = r7 + 1
            r2 = r7
        L_0x023a:
            if (r2 >= r1) goto L_0x024f
            char r3 = r0.charAt(r2)
            r6 = 92
            if (r3 == r6) goto L_0x024a
            r6 = 93
            if (r3 == r6) goto L_0x024f
        L_0x0248:
            r3 = 1
            goto L_0x024d
        L_0x024a:
            int r2 = r2 + 1
            goto L_0x0248
        L_0x024d:
            int r2 = r2 + r3
            goto L_0x023a
        L_0x024f:
            if (r2 < r1) goto L_0x025d
            if (r4 == 0) goto L_0x0255
            goto L_0x0328
        L_0x0255:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r3 = "Missing ']'"
            r1.<init>(r3, r0, r2)
            throw r1
        L_0x025d:
            r7 = r2
            goto L_0x0330
        L_0x0260:
            if (r4 == 0) goto L_0x0268
            r2 = -1
            if (r8 != r2) goto L_0x0333
        L_0x0265:
            r8 = r7
            goto L_0x0333
        L_0x0268:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '<'"
            r1.<init>(r2, r0, r7)
            throw r1
        L_0x0270:
            r2 = -1
            if (r8 != r2) goto L_0x027a
        L_0x0273:
            r2 = 1
            r8 = -1
            r9 = -1
            r11 = 0
            r12 = 0
            goto L_0x0334
        L_0x027a:
            if (r10 == 0) goto L_0x0280
            r2 = 1
            r11 = 0
            goto L_0x0334
        L_0x0280:
            if (r9 != r2) goto L_0x0283
            r9 = r7
        L_0x0283:
            java.lang.String r2 = r0.substring(r8, r9)
            java.lang.String r2 = r2.trim()
            if (r12 == 0) goto L_0x02a5
            if (r13 < 0) goto L_0x02a5
            java.lang.String r3 = r0.substring(r13, r14)
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = unquote(r3)
            java.lang.String r6 = r3.trim()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x02a7
        L_0x02a5:
            r3 = r16
        L_0x02a7:
            if (r21 == 0) goto L_0x02c8
            if (r20 != 0) goto L_0x02c8
            if (r3 == 0) goto L_0x02c8
            r6 = 64
            int r8 = r3.indexOf(r6)
            if (r8 < 0) goto L_0x02c8
            int r6 = r2.indexOf(r6)
            if (r6 >= 0) goto L_0x02c8
            r6 = 33
            int r6 = r2.indexOf(r6)
            if (r6 >= 0) goto L_0x02c8
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x02c8:
            if (r12 != 0) goto L_0x02ee
            if (r20 != 0) goto L_0x02ee
            if (r21 == 0) goto L_0x02cf
            goto L_0x02ee
        L_0x02cf:
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            r3.<init>(r2)
        L_0x02d4:
            boolean r2 = r3.hasMoreTokens()
            if (r2 == 0) goto L_0x0303
            java.lang.String r2 = r3.nextToken()
            r6 = 0
            checkAddress(r2, r6, r6)
            javax.mail.internet.InternetAddress r8 = new javax.mail.internet.InternetAddress
            r8.<init>()
            r8.setAddress(r2)
            r5.add(r8)
            goto L_0x02d4
        L_0x02ee:
            r6 = 0
            if (r4 != 0) goto L_0x02f4
            checkAddress(r2, r11, r6)
        L_0x02f4:
            javax.mail.internet.InternetAddress r6 = new javax.mail.internet.InternetAddress
            r6.<init>()
            r6.setAddress(r2)
            if (r3 == 0) goto L_0x0300
            r6.encodedPersonal = r3
        L_0x0300:
            r5.add(r6)
        L_0x0303:
            r2 = 1
            r8 = -1
            r9 = -1
            goto L_0x0148
        L_0x0308:
            r3 = -1
            if (r8 != r3) goto L_0x030c
            r8 = r7
        L_0x030c:
            int r7 = r7 + 1
            r3 = r7
        L_0x030f:
            if (r3 >= r1) goto L_0x0324
            char r6 = r0.charAt(r3)
            r12 = 34
            if (r6 == r12) goto L_0x0324
            r15 = 92
            if (r6 == r15) goto L_0x031f
        L_0x031d:
            r6 = 1
            goto L_0x0322
        L_0x031f:
            int r3 = r3 + 1
            goto L_0x031d
        L_0x0322:
            int r3 = r3 + r6
            goto L_0x030f
        L_0x0324:
            if (r3 < r1) goto L_0x032f
            if (r4 == 0) goto L_0x0329
        L_0x0328:
            goto L_0x0330
        L_0x0329:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x032f:
            r7 = r3
        L_0x0330:
            r2 = 1
        L_0x0331:
            r12 = 1
            goto L_0x0334
        L_0x0333:
            r2 = 1
        L_0x0334:
            int r7 = r7 + r2
            goto L_0x001a
        L_0x0337:
            if (r8 < 0) goto L_0x03be
            r2 = -1
            if (r9 != r2) goto L_0x033d
            goto L_0x033e
        L_0x033d:
            r1 = r9
        L_0x033e:
            java.lang.String r1 = r0.substring(r8, r1)
            java.lang.String r1 = r1.trim()
            if (r12 == 0) goto L_0x0360
            if (r13 < 0) goto L_0x0360
            java.lang.String r0 = r0.substring(r13, r14)
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = unquote(r0)
            java.lang.String r2 = r0.trim()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0362
        L_0x0360:
            r0 = r16
        L_0x0362:
            if (r21 == 0) goto L_0x0383
            if (r20 != 0) goto L_0x0383
            if (r0 == 0) goto L_0x0383
            r2 = 64
            int r3 = r0.indexOf(r2)
            if (r3 < 0) goto L_0x0383
            int r2 = r1.indexOf(r2)
            if (r2 >= 0) goto L_0x0383
            r2 = 33
            int r2 = r1.indexOf(r2)
            if (r2 >= 0) goto L_0x0383
            r18 = r1
            r1 = r0
            r0 = r18
        L_0x0383:
            if (r12 != 0) goto L_0x03a9
            if (r20 != 0) goto L_0x03a9
            if (r21 == 0) goto L_0x038a
            goto L_0x03a9
        L_0x038a:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r1)
        L_0x038f:
            boolean r1 = r0.hasMoreTokens()
            if (r1 == 0) goto L_0x03be
            java.lang.String r1 = r0.nextToken()
            r2 = 0
            checkAddress(r1, r2, r2)
            javax.mail.internet.InternetAddress r3 = new javax.mail.internet.InternetAddress
            r3.<init>()
            r3.setAddress(r1)
            r5.add(r3)
            goto L_0x038f
        L_0x03a9:
            r2 = 0
            if (r4 != 0) goto L_0x03af
            checkAddress(r1, r11, r2)
        L_0x03af:
            javax.mail.internet.InternetAddress r2 = new javax.mail.internet.InternetAddress
            r2.<init>()
            r2.setAddress(r1)
            if (r0 == 0) goto L_0x03bb
            r2.encodedPersonal = r0
        L_0x03bb:
            r5.add(r2)
        L_0x03be:
            int r0 = r5.size()
            javax.mail.internet.InternetAddress[] r0 = new javax.mail.internet.InternetAddress[r0]
            r5.toArray(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.InternetAddress.parse(java.lang.String, boolean, boolean):javax.mail.internet.InternetAddress[]");
    }

    public void setPersonal(String str) throws UnsupportedEncodingException {
        this.personal = str;
        if (str != null) {
            this.encodedPersonal = MimeUtility.encodeWord(str);
        } else {
            this.encodedPersonal = null;
        }
    }

    public static String toUnicodeString(Address[] addressArr) {
        return toUnicodeString(addressArr, 0);
    }

    public static String toUnicodeString(Address[] addressArr, int i) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < addressArr.length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
                i += 2;
            }
            String unicodeString = addressArr[i2].toUnicodeString();
            if (MimeUtility.checkAscii(unicodeString) != 1) {
                unicodeString = new String(unicodeString.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
                z = true;
            }
            String fold = MimeUtility.fold(0, unicodeString);
            if (lengthOfFirstSegment(fold) + i > 76) {
                int length = sb.length();
                if (length > 0) {
                    int i3 = length - 1;
                    if (sb.charAt(i3) == ' ') {
                        sb.setLength(i3);
                    }
                }
                sb.append("\r\n\t");
                i = 8;
            }
            sb.append(fold);
            i = lengthOfLastSegment(fold, i);
        }
        String sb2 = sb.toString();
        return z ? new String(sb2.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8) : sb2;
    }

    public static String toString(Address[] addressArr) {
        return toString(addressArr, 0);
    }

    public InternetAddress(String str, boolean z) throws AddressException {
        this(str);
        if (!z) {
            return;
        }
        if (isGroup()) {
            getGroup(true);
        } else {
            checkAddress(this.address, true, true);
        }
    }

    public static String toString(Address[] addressArr, int i) {
        if (addressArr == null || addressArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < addressArr.length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
                i += 2;
            }
            String fold = MimeUtility.fold(0, addressArr[i2].toString());
            if (lengthOfFirstSegment(fold) + i > 76) {
                int length = sb.length();
                if (length > 0) {
                    int i3 = length - 1;
                    if (sb.charAt(i3) == ' ') {
                        sb.setLength(i3);
                    }
                }
                sb.append("\r\n\t");
                i = 8;
            }
            sb.append(fold);
            i = lengthOfLastSegment(fold, i);
        }
        return sb.toString();
    }

    public InternetAddress(String str, String str2) throws UnsupportedEncodingException {
        this(str, str2, (String) null);
    }

    public InternetAddress(String str, String str2, String str3) throws UnsupportedEncodingException {
        this.address = str;
        setPersonal(str2, str3);
    }
}
