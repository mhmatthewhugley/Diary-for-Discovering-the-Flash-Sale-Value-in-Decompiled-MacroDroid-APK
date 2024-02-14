package javax.mail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.BitSet;
import java.util.Locale;

public class URLName {
    static final int caseDiff = 32;
    private static boolean doEncode = true;
    static BitSet dontNeedEncoding = new BitSet(256);
    private String file;
    protected String fullURL;
    private int hashCode;
    private String host;
    private InetAddress hostAddress;
    private boolean hostAddressKnown;
    private String password;
    private int port;
    private String protocol;
    private String ref;
    private String username;

    static {
        try {
            doEncode = !Boolean.getBoolean("mail.URLName.dontencode");
        } catch (Exception unused) {
        }
        for (int i = 97; i <= 122; i++) {
            dontNeedEncoding.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            dontNeedEncoding.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            dontNeedEncoding.set(i3);
        }
        dontNeedEncoding.set(32);
        dontNeedEncoding.set(45);
        dontNeedEncoding.set(95);
        dontNeedEncoding.set(46);
        dontNeedEncoding.set(42);
    }

    public URLName(String str, String str2, int i, String str3, String str4, String str5) {
        int indexOf;
        this.hostAddressKnown = false;
        this.hashCode = 0;
        this.protocol = str;
        this.host = str2;
        this.port = i;
        if (str3 == null || (indexOf = str3.indexOf(35)) == -1) {
            this.file = str3;
            this.ref = null;
        } else {
            this.file = str3.substring(0, indexOf);
            this.ref = str3.substring(indexOf + 1);
        }
        this.username = doEncode ? encode(str4) : str4;
        this.password = doEncode ? encode(str5) : str5;
    }

    private static String _encode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (dontNeedEncoding.get(charAt)) {
                if (charAt == ' ') {
                    charAt = '+';
                }
                sb.append((char) charAt);
            } else {
                try {
                    outputStreamWriter.write(charAt);
                    outputStreamWriter.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    for (int i2 = 0; i2 < byteArray.length; i2++) {
                        sb.append('%');
                        char forDigit = Character.forDigit((byteArray[i2] >> 4) & 15, 16);
                        if (Character.isLetter(forDigit)) {
                            forDigit = (char) (forDigit - ' ');
                        }
                        sb.append(forDigit);
                        char forDigit2 = Character.forDigit(byteArray[i2] & 15, 16);
                        if (Character.isLetter(forDigit2)) {
                            forDigit2 = (char) (forDigit2 - ' ');
                        }
                        sb.append(forDigit2);
                    }
                    byteArrayOutputStream.reset();
                } catch (IOException unused) {
                    byteArrayOutputStream.reset();
                }
            }
        }
        return sb.toString();
    }

    static String decode(String str) {
        if (str == null) {
            return null;
        }
        if (indexOfAny(str, "+%") == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 3;
                try {
                    sb.append((char) Integer.parseInt(str.substring(i + 1, i2), 16));
                    i += 2;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Illegal URL encoded value: " + str.substring(i, i2));
                }
            } else if (charAt != '+') {
                sb.append(charAt);
            } else {
                sb.append(' ');
            }
            i++;
        }
        String sb2 = sb.toString();
        try {
            return new String(sb2.getBytes("8859_1"));
        } catch (UnsupportedEncodingException unused2) {
            return sb2;
        }
    }

    static String encode(String str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == ' ' || !dontNeedEncoding.get(charAt)) {
                return _encode(str);
            }
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.net.InetAddress getHostAddress() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hostAddressKnown     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0009
            java.net.InetAddress r0 = r2.hostAddress     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0009:
            java.lang.String r0 = r2.host     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 != 0) goto L_0x0010
            monitor-exit(r2)
            return r1
        L_0x0010:
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x0017 }
            r2.hostAddress = r0     // Catch:{ UnknownHostException -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r2.hostAddress = r1     // Catch:{ all -> 0x0020 }
        L_0x0019:
            r0 = 1
            r2.hostAddressKnown = r0     // Catch:{ all -> 0x0020 }
            java.net.InetAddress r0 = r2.hostAddress     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.URLName.getHostAddress():java.net.InetAddress");
    }

    private static int indexOfAny(String str, String str2) {
        return indexOfAny(str, str2, 0);
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof URLName)) {
            return false;
        }
        URLName uRLName = (URLName) obj;
        String str2 = this.protocol;
        String str3 = uRLName.protocol;
        if (str2 != str3 && (str2 == null || !str2.equals(str3))) {
            return false;
        }
        InetAddress hostAddress2 = getHostAddress();
        InetAddress hostAddress3 = uRLName.getHostAddress();
        if (hostAddress2 == null || hostAddress3 == null) {
            String str4 = this.host;
            if (str4 == null || (str = uRLName.host) == null) {
                if (str4 != uRLName.host) {
                    return false;
                }
            } else if (!str4.equalsIgnoreCase(str)) {
                return false;
            }
        } else if (!hostAddress2.equals(hostAddress3)) {
            return false;
        }
        String str5 = this.username;
        String str6 = uRLName.username;
        if (str5 != str6 && (str5 == null || !str5.equals(str6))) {
            return false;
        }
        String str7 = this.file;
        String str8 = "";
        if (str7 == null) {
            str7 = str8;
        }
        String str9 = uRLName.file;
        if (str9 != null) {
            str8 = str9;
        }
        if (str7.equals(str8) && this.port == uRLName.port) {
            return true;
        }
        return false;
    }

    public String getFile() {
        return this.file;
    }

    public String getHost() {
        return this.host;
    }

    public String getPassword() {
        return doEncode ? decode(this.password) : this.password;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRef() {
        return this.ref;
    }

    public URL getURL() throws MalformedURLException {
        String str;
        String file2 = getFile();
        if (file2 == null) {
            str = "";
        } else {
            str = "/" + file2;
        }
        return new URL(getProtocol(), getHost(), getPort(), str);
    }

    public String getUsername() {
        return doEncode ? decode(this.username) : this.username;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.protocol;
        if (str != null) {
            this.hashCode = i + str.hashCode();
        }
        InetAddress hostAddress2 = getHostAddress();
        if (hostAddress2 != null) {
            this.hashCode += hostAddress2.hashCode();
        } else {
            String str2 = this.host;
            if (str2 != null) {
                this.hashCode += str2.toLowerCase(Locale.ENGLISH).hashCode();
            }
        }
        String str3 = this.username;
        if (str3 != null) {
            this.hashCode += str3.hashCode();
        }
        String str4 = this.file;
        if (str4 != null) {
            this.hashCode += str4.hashCode();
        }
        int i2 = this.hashCode + this.port;
        this.hashCode = i2;
        return i2;
    }

    /* access modifiers changed from: protected */
    public void parseString(String str) {
        int indexOf;
        String str2;
        int i;
        this.password = null;
        this.username = null;
        this.host = null;
        this.ref = null;
        this.file = null;
        this.protocol = null;
        this.port = -1;
        int length = str.length();
        int indexOf2 = str.indexOf(58);
        if (indexOf2 != -1) {
            this.protocol = str.substring(0, indexOf2);
        }
        int i2 = indexOf2 + 1;
        if (str.regionMatches(i2, "//", 0, 2)) {
            int i3 = indexOf2 + 3;
            int indexOf3 = str.indexOf(47, i3);
            if (indexOf3 != -1) {
                str2 = str.substring(i3, indexOf3);
                int i4 = indexOf3 + 1;
                if (i4 < length) {
                    this.file = str.substring(i4);
                } else {
                    this.file = "";
                }
            } else {
                str2 = str.substring(i3);
            }
            int indexOf4 = str2.indexOf(64);
            if (indexOf4 != -1) {
                String substring = str2.substring(0, indexOf4);
                str2 = str2.substring(indexOf4 + 1);
                int indexOf5 = substring.indexOf(58);
                if (indexOf5 != -1) {
                    this.username = substring.substring(0, indexOf5);
                    this.password = substring.substring(indexOf5 + 1);
                } else {
                    this.username = substring;
                }
            }
            if (str2.length() <= 0 || str2.charAt(0) != '[') {
                i = str2.indexOf(58);
            } else {
                i = str2.indexOf(58, str2.indexOf(93));
            }
            if (i != -1) {
                String substring2 = str2.substring(i + 1);
                if (substring2.length() > 0) {
                    try {
                        this.port = Integer.parseInt(substring2);
                    } catch (NumberFormatException unused) {
                        this.port = -1;
                    }
                }
                this.host = str2.substring(0, i);
            } else {
                this.host = str2;
            }
        } else if (i2 < length) {
            this.file = str.substring(i2);
        }
        String str3 = this.file;
        if (str3 != null && (indexOf = str3.indexOf(35)) != -1) {
            this.ref = this.file.substring(indexOf + 1);
            this.file = this.file.substring(0, indexOf);
        }
    }

    public String toString() {
        if (this.fullURL == null) {
            StringBuilder sb = new StringBuilder();
            String str = this.protocol;
            if (str != null) {
                sb.append(str);
                sb.append(":");
            }
            if (!(this.username == null && this.host == null)) {
                sb.append("//");
                String str2 = this.username;
                if (str2 != null) {
                    sb.append(str2);
                    if (this.password != null) {
                        sb.append(":");
                        sb.append(this.password);
                    }
                    sb.append("@");
                }
                String str3 = this.host;
                if (str3 != null) {
                    sb.append(str3);
                }
                if (this.port != -1) {
                    sb.append(":");
                    sb.append(Integer.toString(this.port));
                }
                if (this.file != null) {
                    sb.append("/");
                }
            }
            String str4 = this.file;
            if (str4 != null) {
                sb.append(str4);
            }
            if (this.ref != null) {
                sb.append("#");
                sb.append(this.ref);
            }
            this.fullURL = sb.toString();
        }
        return this.fullURL;
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

    public URLName(URL url) {
        this(url.toString());
    }

    public URLName(String str) {
        this.hostAddressKnown = false;
        this.port = -1;
        this.hashCode = 0;
        parseString(str);
    }
}
