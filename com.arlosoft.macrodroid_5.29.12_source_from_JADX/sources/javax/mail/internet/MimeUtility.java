package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.BEncoderStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.QDecoderStream;
import com.sun.mail.util.QEncoderStream;
import com.sun.mail.util.QPDecoderStream;
import com.sun.mail.util.QPEncoderStream;
import com.sun.mail.util.UUDecoderStream;
import com.sun.mail.util.UUEncoderStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.EncodingAware;
import javax.mail.MessagingException;
import org.apache.commons.p353io.IOUtils;

public class MimeUtility {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ALL = -1;
    static final int ALL_ASCII = 1;
    static final int MOSTLY_ASCII = 2;
    static final int MOSTLY_NONASCII = 3;
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final boolean decodeStrict = PropUtil.getBooleanSystemProperty("mail.mime.decodetext.strict", true);
    private static String defaultJavaCharset;
    private static String defaultMIMECharset;
    private static final boolean encodeEolStrict = PropUtil.getBooleanSystemProperty("mail.mime.encodeeol.strict", false);
    private static final boolean foldEncodedWords = PropUtil.getBooleanSystemProperty("mail.mime.foldencodedwords", false);
    private static final boolean foldText = PropUtil.getBooleanSystemProperty("mail.mime.foldtext", true);
    private static final boolean ignoreUnknownEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoreunknownencoding", false);
    private static Map<String, String> java2mime = new HashMap(40);
    private static Map<String, String> mime2java = new HashMap(14);
    private static final Map<String, Boolean> nonAsciiCharsetMap = new HashMap();

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0073 */
    static {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            nonAsciiCharsetMap = r0
            java.lang.String r0 = "mail.mime.decodetext.strict"
            r1 = 1
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r1)
            decodeStrict = r0
            java.lang.String r0 = "mail.mime.encodeeol.strict"
            r2 = 0
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r2)
            encodeEolStrict = r0
            java.lang.String r0 = "mail.mime.ignoreunknownencoding"
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r2)
            ignoreUnknownEncoding = r0
            java.lang.String r0 = "mail.mime.allowutf8"
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r2)
            allowUtf8 = r0
            java.lang.String r0 = "mail.mime.foldencodedwords"
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r2)
            foldEncodedWords = r0
            java.lang.String r0 = "mail.mime.foldtext"
            boolean r0 = com.sun.mail.util.PropUtil.getBooleanSystemProperty(r0, r1)
            foldText = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 40
            r0.<init>(r1)
            java2mime = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 14
            r0.<init>(r1)
            mime2java = r0
            java.lang.Class<javax.mail.internet.MimeUtility> r0 = javax.mail.internet.MimeUtility.class
            java.lang.String r1 = "/META-INF/javamail.charset.map"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0074
            com.sun.mail.util.LineInputStream r1 = new com.sun.mail.util.LineInputStream     // Catch:{ all -> 0x006c }
            r1.<init>(r0)     // Catch:{ all -> 0x006c }
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime     // Catch:{ all -> 0x006a }
            loadMappings(r1, r0)     // Catch:{ all -> 0x006a }
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java     // Catch:{ all -> 0x006a }
            loadMappings(r1, r0)     // Catch:{ all -> 0x006a }
            r1.close()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0074
        L_0x0068:
            goto L_0x0074
        L_0x006a:
            r0 = move-exception
            goto L_0x0070
        L_0x006c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0070:
            r1.close()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            throw r0     // Catch:{ Exception -> 0x0068 }
        L_0x0074:
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "euc-kr"
            java.lang.String r2 = "ISO-8859-1"
            if (r0 == 0) goto L_0x0191
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_1"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_1"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-1"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_2"
            java.lang.String r4 = "ISO-8859-2"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_2"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-2"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_3"
            java.lang.String r4 = "ISO-8859-3"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_3"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-3"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_4"
            java.lang.String r4 = "ISO-8859-4"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_4"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-4"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_5"
            java.lang.String r4 = "ISO-8859-5"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_5"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-5"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_6"
            java.lang.String r4 = "ISO-8859-6"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_6"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-6"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_7"
            java.lang.String r4 = "ISO-8859-7"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_7"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-7"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_8"
            java.lang.String r4 = "ISO-8859-8"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_8"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-8"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "8859_9"
            java.lang.String r4 = "ISO-8859-9"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859_9"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso8859-9"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "sjis"
            java.lang.String r4 = "Shift_JIS"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "jis"
            java.lang.String r4 = "ISO-2022-JP"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "iso2022jp"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "euc_jp"
            java.lang.String r4 = "euc-jp"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "koi8_r"
            java.lang.String r4 = "koi8-r"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "euc_cn"
            java.lang.String r4 = "euc-cn"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "euc_tw"
            java.lang.String r4 = "euc-tw"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            java.lang.String r3 = "euc_kr"
            r0.put(r3, r1)
        L_0x0191:
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0207
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "iso-2022-cn"
            java.lang.String r4 = "ISO2022CN"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "iso-2022-kr"
            java.lang.String r4 = "ISO2022KR"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "utf-8"
            java.lang.String r4 = "UTF8"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "utf8"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "ja_jp.iso2022-7"
            java.lang.String r4 = "ISO2022JP"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "ja_jp.eucjp"
            java.lang.String r4 = "EUCJIS"
            r0.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r3 = "KSC5601"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "euckr"
            r0.put(r1, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "us-ascii"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "x-us-ascii"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "gb2312"
            java.lang.String r2 = "GB18030"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "cp936"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "ms936"
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = mime2java
            java.lang.String r1 = "gbk"
            r0.put(r1, r2)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.<clinit>():void");
    }

    private MimeUtility() {
    }

    static int checkAscii(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (nonascii(str.charAt(i3))) {
                i++;
            } else {
                i2++;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i2 > i ? 2 : 3;
    }

    public static InputStream decode(InputStream inputStream, String str) throws MessagingException {
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64DecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || ignoreUnknownEncoding) {
            return inputStream;
        }
        throw new MessagingException("Unknown encoding: " + str);
    }

    private static String decodeInnerWords(String str) throws UnsupportedEncodingException {
        int indexOf;
        int indexOf2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int indexOf3 = str.indexOf("=?", i);
            if (indexOf3 < 0) {
                break;
            }
            sb.append(str.substring(i, indexOf3));
            int indexOf4 = str.indexOf(63, indexOf3 + 2);
            if (indexOf4 < 0 || (indexOf = str.indexOf(63, indexOf4 + 1)) < 0 || (indexOf2 = str.indexOf("?=", indexOf + 1)) < 0) {
                break;
            }
            i = indexOf2 + 2;
            String substring = str.substring(indexOf3, i);
            try {
                substring = decodeWord(substring);
            } catch (ParseException unused) {
            }
            sb.append(substring);
        }
        if (i == 0) {
            return str;
        }
        if (i < str.length()) {
            sb.append(str.substring(i));
        }
        return sb.toString();
    }

    public static String decodeText(String str) throws UnsupportedEncodingException {
        if (str.indexOf("=?") == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r", true);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            char charAt = nextToken.charAt(0);
            if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                sb2.append(charAt);
            } else {
                try {
                    String decodeWord = decodeWord(nextToken);
                    if (!z && sb2.length() > 0) {
                        sb.append(sb2);
                    }
                    nextToken = decodeWord;
                    z = true;
                } catch (ParseException unused) {
                    if (!decodeStrict) {
                        String decodeInnerWords = decodeInnerWords(nextToken);
                        if (decodeInnerWords != nextToken) {
                            if ((!z || !nextToken.startsWith("=?")) && sb2.length() > 0) {
                                sb.append(sb2);
                            }
                            z = nextToken.endsWith("?=");
                            nextToken = decodeInnerWords;
                        } else if (sb2.length() > 0) {
                            sb.append(sb2);
                        }
                    } else if (sb2.length() > 0) {
                        sb.append(sb2);
                    }
                    z = false;
                }
                sb.append(nextToken);
                sb2.setLength(0);
            }
        }
        sb.append(sb2);
        return sb.toString();
    }

    public static String decodeWord(String str) throws ParseException, UnsupportedEncodingException {
        InputStream inputStream;
        if (str.startsWith("=?")) {
            int indexOf = str.indexOf(63, 2);
            if (indexOf != -1) {
                String substring = str.substring(2, indexOf);
                int indexOf2 = substring.indexOf(42);
                if (indexOf2 >= 0) {
                    substring = substring.substring(0, indexOf2);
                }
                String javaCharset = javaCharset(substring);
                int i = indexOf + 1;
                int indexOf3 = str.indexOf(63, i);
                if (indexOf3 != -1) {
                    String substring2 = str.substring(i, indexOf3);
                    int i2 = indexOf3 + 1;
                    int indexOf4 = str.indexOf("?=", i2);
                    if (indexOf4 != -1) {
                        String substring3 = str.substring(i2, indexOf4);
                        try {
                            String str2 = "";
                            if (substring3.length() > 0) {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ASCIIUtility.getBytes(substring3));
                                if (substring2.equalsIgnoreCase("B")) {
                                    inputStream = new BASE64DecoderStream(byteArrayInputStream);
                                } else if (substring2.equalsIgnoreCase("Q")) {
                                    inputStream = new QDecoderStream(byteArrayInputStream);
                                } else {
                                    throw new UnsupportedEncodingException("unknown encoding: " + substring2);
                                }
                                int available = byteArrayInputStream.available();
                                byte[] bArr = new byte[available];
                                int read = inputStream.read(bArr, 0, available);
                                if (read > 0) {
                                    str2 = new String(bArr, 0, read, javaCharset);
                                }
                            }
                            int i3 = indexOf4 + 2;
                            if (i3 >= str.length()) {
                                return str2;
                            }
                            String substring4 = str.substring(i3);
                            if (!decodeStrict) {
                                substring4 = decodeInnerWords(substring4);
                            }
                            return str2 + substring4;
                        } catch (UnsupportedEncodingException e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new ParseException(e2.toString());
                        } catch (IllegalArgumentException unused) {
                            throw new UnsupportedEncodingException(javaCharset);
                        }
                    } else {
                        throw new ParseException("encoded word does not end with \"?=\": " + str);
                    }
                } else {
                    throw new ParseException("encoded word does not include encoding: " + str);
                }
            } else {
                throw new ParseException("encoded word does not include charset: " + str);
            }
        } else {
            throw new ParseException("encoded word does not start with \"=?\": " + str);
        }
    }

    private static void doEncode(String str, boolean z, String str2, int i, String str3, boolean z2, boolean z3, StringBuilder sb) throws UnsupportedEncodingException {
        int i2;
        OutputStream outputStream;
        int length;
        String str4 = str;
        boolean z4 = z3;
        StringBuilder sb2 = sb;
        byte[] bytes = str.getBytes(str2);
        if (z) {
            i2 = BEncoderStream.encodedLength(bytes);
        } else {
            i2 = QEncoderStream.encodedLength(bytes, z4);
        }
        if (i2 <= i || (length = str.length()) <= 1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (z) {
                outputStream = new BEncoderStream(byteArrayOutputStream);
            } else {
                outputStream = new QEncoderStream(byteArrayOutputStream, z4);
            }
            try {
                outputStream.write(bytes);
                outputStream.close();
            } catch (IOException unused) {
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (!z2) {
                if (foldEncodedWords) {
                    sb2.append("\r\n ");
                } else {
                    sb2.append(" ");
                }
            }
            sb2.append(str3);
            for (byte b : byteArray) {
                sb2.append((char) b);
            }
            sb2.append("?=");
            return;
        }
        int i3 = length / 2;
        if (Character.isHighSurrogate(str.charAt(i3 - 1))) {
            i3--;
        }
        int i4 = i3;
        if (i4 > 0) {
            doEncode(str.substring(0, i4), z, str2, i, str3, z2, z3, sb);
        }
        doEncode(str.substring(i4, length), z, str2, i, str3, false, z3, sb);
    }

    public static OutputStream encode(OutputStream outputStream, String str) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit")) {
            return outputStream;
        }
        throw new MessagingException("Unknown encoding: " + str);
    }

    public static String encodeText(String str) throws UnsupportedEncodingException {
        return encodeText(str, (String) null, (String) null);
    }

    public static String encodeWord(String str) throws UnsupportedEncodingException {
        return encodeWord(str, (String) null, (String) null);
    }

    public static String fold(int i, String str) {
        if (!foldText) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((r4 = str.charAt(length)) == ' ' || r4 == 9 || r4 == 13 || r4 == 10)) {
            length--;
        }
        if (length != str.length() - 1) {
            str = str.substring(0, length + 1);
        }
        if (str.length() + i <= 76) {
            return makesafe(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        char c = 0;
        while (true) {
            if (str.length() + i <= 76) {
                break;
            }
            int i2 = 0;
            int i3 = -1;
            while (i2 < str.length() && (i3 == -1 || i + i2 <= 76)) {
                char charAt = str.charAt(i2);
                if (!((charAt != ' ' && charAt != 9) || c == ' ' || c == 9)) {
                    i3 = i2;
                }
                i2++;
                c = charAt;
            }
            if (i3 == -1) {
                sb.append(str);
                str = "";
                break;
            }
            sb.append(str.substring(0, i3));
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            c = str.charAt(i3);
            sb.append(c);
            str = str.substring(i3 + 1);
            i = 1;
        }
        sb.append(str);
        return makesafe(sb);
    }

    public static String getDefaultJavaCharset() {
        if (defaultJavaCharset == null) {
            String str = null;
            try {
                str = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
            if (str == null || str.length() <= 0) {
                try {
                    defaultJavaCharset = System.getProperty("file.encoding", "8859_1");
                } catch (SecurityException unused2) {
                    String encoding = new InputStreamReader(new InputStream() {
                        public int read() {
                            return 0;
                        }
                    }).getEncoding();
                    defaultJavaCharset = encoding;
                    if (encoding == null) {
                        defaultJavaCharset = "8859_1";
                    }
                }
            } else {
                String javaCharset = javaCharset(str);
                defaultJavaCharset = javaCharset;
                return javaCharset;
            }
        }
        return defaultJavaCharset;
    }

    static String getDefaultMIMECharset() {
        if (defaultMIMECharset == null) {
            try {
                defaultMIMECharset = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
        }
        if (defaultMIMECharset == null) {
            defaultMIMECharset = mimeCharset(getDefaultJavaCharset());
        }
        return defaultMIMECharset;
    }

    public static String getEncoding(DataSource dataSource) {
        String encoding;
        String str = "base64";
        if ((dataSource instanceof EncodingAware) && (encoding = ((EncodingAware) dataSource).getEncoding()) != null) {
            return encoding;
        }
        InputStream inputStream = null;
        try {
            ContentType contentType = new ContentType(dataSource.getContentType());
            InputStream inputStream2 = dataSource.getInputStream();
            boolean match = contentType.match("text/*");
            int checkAscii = checkAscii(inputStream2, -1, !match);
            if (checkAscii == 1) {
                str = "7bit";
            } else if (checkAscii == 2) {
                if (!match || !nonAsciiCharset(contentType)) {
                    str = "quoted-printable";
                }
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused) {
                }
            }
            return str;
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return str;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int indexOfAny(String str, String str2) {
        return indexOfAny(str, str2, 0);
    }

    public static String javaCharset(String str) {
        Map<String, String> map = mime2java;
        if (map == null || str == null) {
            return str;
        }
        String str2 = map.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            try {
                Charset.forName(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        return str2 == null ? str : str2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:15:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadMappings(com.sun.mail.util.LineInputStream r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
        L_0x0000:
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0042 }
            if (r0 != 0) goto L_0x0007
            goto L_0x0042
        L_0x0007:
            java.lang.String r1 = "--"
            boolean r2 = r0.startsWith(r1)
            if (r2 == 0) goto L_0x0016
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L_0x0016
            goto L_0x0042
        L_0x0016:
            java.lang.String r1 = r0.trim()
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0000
            java.lang.String r1 = "#"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0029
            goto L_0x0000
        L_0x0029:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = " \t"
            r1.<init>(r0, r2)
            java.lang.String r0 = r1.nextToken()     // Catch:{ NoSuchElementException -> 0x0000 }
            java.lang.String r1 = r1.nextToken()     // Catch:{ NoSuchElementException -> 0x0000 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ NoSuchElementException -> 0x0000 }
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch:{ NoSuchElementException -> 0x0000 }
            r4.put(r0, r1)     // Catch:{ NoSuchElementException -> 0x0000 }
            goto L_0x0000
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.loadMappings(com.sun.mail.util.LineInputStream, java.util.Map):void");
    }

    private static String makesafe(CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length() && (r2 = charSequence.charAt(i)) != 13 && r2 != 10) {
            i++;
        }
        if (i == charSequence.length()) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder(charSequence.length() + 1);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(charSequence.toString()));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                if (readLine.trim().length() != 0) {
                    if (sb.length() > 0) {
                        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                        char charAt = readLine.charAt(0);
                        if (!(charAt == ' ' || charAt == 9)) {
                            sb.append(' ');
                        }
                    }
                    sb.append(readLine);
                }
            } catch (IOException unused) {
                return charSequence.toString();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.get(r2.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String mimeCharset(java.lang.String r2) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = java2mime
            if (r0 == 0) goto L_0x0017
            if (r2 != 0) goto L_0x0007
            goto L_0x0017
        L_0x0007:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.mimeCharset(java.lang.String):java.lang.String");
    }

    private static boolean nonAsciiCharset(ContentType contentType) {
        Boolean bool;
        Boolean bool2;
        String parameter = contentType.getParameter("charset");
        boolean z = false;
        if (parameter == null) {
            return false;
        }
        String lowerCase = parameter.toLowerCase(Locale.ENGLISH);
        Map<String, Boolean> map = nonAsciiCharsetMap;
        synchronized (map) {
            bool = map.get(lowerCase);
        }
        if (bool == null) {
            try {
                byte[] bytes = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(lowerCase);
                if (!(bytes.length == 2 && bytes[0] == 13 && bytes[1] == 10)) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            } catch (UnsupportedEncodingException unused) {
                bool2 = Boolean.FALSE;
            } catch (RuntimeException unused2) {
                bool2 = Boolean.TRUE;
            }
            bool = bool2;
            Map<String, Boolean> map2 = nonAsciiCharsetMap;
            synchronized (map2) {
                map2.put(lowerCase, bool);
            }
        }
        return bool.booleanValue();
    }

    static final boolean nonascii(int i) {
        return i >= 127 || !(i >= 32 || i == 13 || i == 10 || i == 9);
    }

    public static String quote(String str, String str2) {
        char c = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == '\\' || charAt == 13 || charAt == 10) {
                StringBuilder sb = new StringBuilder(length + 3);
                sb.append('\"');
                sb.append(str.substring(0, i));
                while (i < length) {
                    char charAt2 = str.charAt(i);
                    if ((charAt2 == '\"' || charAt2 == '\\' || charAt2 == 13 || charAt2 == 10) && !(charAt2 == 10 && c == 13)) {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(charAt2);
                    i++;
                    c = charAt2;
                }
                sb.append('\"');
                return sb.toString();
            }
            if (charAt < ' ' || ((charAt >= 127 && !allowUtf8) || str2.indexOf(charAt) >= 0)) {
                z = true;
            }
            i++;
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

    public static String unfold(String str) {
        char charAt;
        if (!foldText) {
            return str;
        }
        StringBuilder sb = null;
        while (true) {
            int indexOfAny = indexOfAny(str, IOUtils.LINE_SEPARATOR_WINDOWS);
            if (indexOfAny < 0) {
                break;
            }
            int length = str.length();
            int i = indexOfAny + 1;
            if (i < length && str.charAt(i - 1) == 13 && str.charAt(i) == 10) {
                i++;
            }
            if (indexOfAny > 0) {
                int i2 = indexOfAny - 1;
                if (str.charAt(i2) == '\\') {
                    if (sb == null) {
                        sb = new StringBuilder(str.length());
                    }
                    sb.append(str.substring(0, i2));
                    sb.append(str.substring(indexOfAny, i));
                    str = str.substring(i);
                }
            }
            if (i >= length || (charAt = str.charAt(i)) == ' ' || charAt == 9) {
                if (sb == null) {
                    sb = new StringBuilder(str.length());
                }
                sb.append(str.substring(0, indexOfAny));
                str = str.substring(i);
            } else {
                if (sb == null) {
                    sb = new StringBuilder(str.length());
                }
                sb.append(str.substring(0, i));
                str = str.substring(i);
            }
        }
        if (sb == null) {
            return str;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String encodeText(String str, String str2, String str3) throws UnsupportedEncodingException {
        return encodeWord(str, str2, str3, false);
    }

    public static String encodeWord(String str, String str2, String str3) throws UnsupportedEncodingException {
        return encodeWord(str, str2, str3, true);
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

    static int checkAscii(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            if (nonascii(b & 255)) {
                i++;
            } else {
                i2++;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i2 > i ? 2 : 3;
    }

    private static String encodeWord(String str, String str2, String str3, boolean z) throws UnsupportedEncodingException {
        String str4;
        boolean z2;
        int checkAscii = checkAscii(str);
        if (checkAscii == 1) {
            return str;
        }
        if (str2 == null) {
            str4 = getDefaultJavaCharset();
            str2 = getDefaultMIMECharset();
        } else {
            str4 = javaCharset(str2);
        }
        if (str3 == null) {
            str3 = checkAscii != 3 ? "Q" : "B";
        }
        if (str3.equalsIgnoreCase("B")) {
            z2 = true;
        } else if (str3.equalsIgnoreCase("Q")) {
            z2 = false;
        } else {
            throw new UnsupportedEncodingException("Unknown transfer encoding: " + str3);
        }
        StringBuilder sb = new StringBuilder();
        int length = 68 - str2.length();
        doEncode(str, z2, str4, length, "=?" + str2 + "?" + str3 + "?", true, z, sb);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int checkAscii(java.io.InputStream r16, int r17, boolean r18) {
        /*
            r0 = r17
            boolean r1 = encodeEolStrict
            r3 = 0
            if (r1 == 0) goto L_0x000b
            if (r18 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r4 = 0
            r5 = -1
            r6 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001c
            if (r0 != r5) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            int r4 = java.lang.Math.min(r0, r6)
            r6 = r4
        L_0x001a:
            byte[] r4 = new byte[r6]
        L_0x001c:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x006c
            r13 = r16
            int r14 = r13.read(r4, r3, r6)     // Catch:{ IOException -> 0x006b }
            if (r14 != r5) goto L_0x002c
            goto L_0x006c
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r15 >= r14) goto L_0x0064
            byte r2 = r4[r15]     // Catch:{ IOException -> 0x006b }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = 10
            r12 = 13
            if (r1 == 0) goto L_0x0042
            if (r3 != r12) goto L_0x003d
            if (r2 != r5) goto L_0x0041
        L_0x003d:
            if (r3 == r12) goto L_0x0042
            if (r2 != r5) goto L_0x0042
        L_0x0041:
            r9 = 1
        L_0x0042:
            if (r2 == r12) goto L_0x004f
            if (r2 != r5) goto L_0x0047
            goto L_0x004f
        L_0x0047:
            int r11 = r11 + 1
            r3 = 998(0x3e6, float:1.398E-42)
            if (r11 <= r3) goto L_0x0050
            r10 = 1
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            boolean r3 = nonascii(r2)     // Catch:{ IOException -> 0x006b }
            if (r3 == 0) goto L_0x005d
            if (r18 == 0) goto L_0x005a
            r3 = 3
            return r3
        L_0x005a:
            int r8 = r8 + 1
            goto L_0x005f
        L_0x005d:
            int r7 = r7 + 1
        L_0x005f:
            int r15 = r15 + 1
            r3 = r2
            r5 = -1
            goto L_0x002d
        L_0x0064:
            r2 = -1
            if (r0 == r2) goto L_0x0068
            int r0 = r0 - r14
        L_0x0068:
            r3 = 0
            r5 = -1
            goto L_0x0021
        L_0x006b:
        L_0x006c:
            if (r0 != 0) goto L_0x0072
            if (r18 == 0) goto L_0x0072
            r0 = 3
            return r0
        L_0x0072:
            r0 = 3
            r1 = 2
            if (r8 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x0079
            return r0
        L_0x0079:
            if (r10 == 0) goto L_0x007c
            return r1
        L_0x007c:
            r0 = 1
            return r0
        L_0x007e:
            if (r7 <= r8) goto L_0x0081
            return r1
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MimeUtility.checkAscii(java.io.InputStream, int, boolean):int");
    }

    public static String getEncoding(DataHandler dataHandler) {
        if (dataHandler.getName() != null) {
            return getEncoding(dataHandler.getDataSource());
        }
        try {
            if (new ContentType(dataHandler.getContentType()).match("text/*")) {
                AsciiOutputStream asciiOutputStream = new AsciiOutputStream(false, false);
                try {
                    dataHandler.writeTo(asciiOutputStream);
                } catch (IOException unused) {
                }
                int ascii = asciiOutputStream.getAscii();
                if (ascii != 1) {
                    if (ascii != 2) {
                        return "base64";
                    }
                    return "quoted-printable";
                }
            } else {
                AsciiOutputStream asciiOutputStream2 = new AsciiOutputStream(true, encodeEolStrict);
                try {
                    dataHandler.writeTo(asciiOutputStream2);
                } catch (IOException unused2) {
                }
                if (asciiOutputStream2.getAscii() != 1) {
                    return "base64";
                }
            }
            return "7bit";
        } catch (Exception unused3) {
            return "base64";
        }
    }

    public static OutputStream encode(OutputStream outputStream, String str, String str2) throws MessagingException {
        if (str == null) {
            return outputStream;
        }
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64EncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPEncoderStream(outputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUEncoderStream(outputStream, str2);
        }
        if (str.equalsIgnoreCase("binary") || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit")) {
            return outputStream;
        }
        throw new MessagingException("Unknown encoding: " + str);
    }
}
