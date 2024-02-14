package javax.mail.internet;

import androidx.webkit.ProxyConfig;
import com.sun.mail.util.PropUtil;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class ParameterList {
    private static final boolean applehack = PropUtil.getBooleanSystemProperty("mail.mime.applefilenames", false);
    private static final boolean decodeParameters = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters", true);
    private static final boolean decodeParametersStrict = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters.strict", false);
    private static final boolean encodeParameters = PropUtil.getBooleanSystemProperty("mail.mime.encodeparameters", true);
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final boolean parametersStrict = PropUtil.getBooleanSystemProperty("mail.mime.parameters.strict", true);
    private static final boolean splitLongParameters = PropUtil.getBooleanSystemProperty("mail.mime.splitlongparameters", true);
    private static final boolean windowshack = PropUtil.getBooleanSystemProperty("mail.mime.windowsfilenames", false);
    private String lastName;
    private Map<String, Object> list;
    private Set<String> multisegmentNames;
    private Map<String, Object> slist;

    private static class LiteralValue {
        String value;

        private LiteralValue() {
        }
    }

    private static class MultiValue extends ArrayList<Object> {
        private static final long serialVersionUID = 699561094618751023L;
        String value;

        private MultiValue() {
        }
    }

    private static class ParamEnum implements Enumeration<String> {

        /* renamed from: it */
        private Iterator<String> f61345it;

        ParamEnum(Iterator<String> it) {
            this.f61345it = it;
        }

        public boolean hasMoreElements() {
            return this.f61345it.hasNext();
        }

        public String nextElement() {
            return this.f61345it.next();
        }
    }

    private static class ToStringBuffer {

        /* renamed from: sb */
        private StringBuilder f61346sb = new StringBuilder();
        private int used;

        public ToStringBuffer(int i) {
            this.used = i;
        }

        public void addNV(String str, String str2) {
            this.f61346sb.append("; ");
            this.used += 2;
            if (this.used + str.length() + str2.length() + 1 > 76) {
                this.f61346sb.append("\r\n\t");
                this.used = 8;
            }
            StringBuilder sb = this.f61346sb;
            sb.append(str);
            sb.append('=');
            int length = this.used + str.length() + 1;
            this.used = length;
            if (length + str2.length() > 76) {
                String fold = MimeUtility.fold(this.used, str2);
                this.f61346sb.append(fold);
                int lastIndexOf = fold.lastIndexOf(10);
                if (lastIndexOf >= 0) {
                    this.used += (fold.length() - lastIndexOf) - 1;
                } else {
                    this.used += fold.length();
                }
            } else {
                this.f61346sb.append(str2);
                this.used += str2.length();
            }
        }

        public String toString() {
            return this.f61346sb.toString();
        }
    }

    private static class Value {
        String charset;
        String encodedValue;
        String value;

        private Value() {
        }
    }

    public ParameterList() {
        this.list = new LinkedHashMap();
        this.lastName = null;
        if (decodeParameters) {
            this.multisegmentNames = new HashSet();
            this.slist = new HashMap();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void combineMultisegmentNames(boolean r10) throws javax.mail.internet.ParseException {
        /*
            r9 = this;
            java.util.Set<java.lang.String> r0 = r9.multisegmentNames     // Catch:{ all -> 0x0101 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0101 }
        L_0x0006:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00b2
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0101 }
            javax.mail.internet.ParameterList$MultiValue r2 = new javax.mail.internet.ParameterList$MultiValue     // Catch:{ all -> 0x0101 }
            r3 = 0
            r2.<init>()     // Catch:{ all -> 0x0101 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0101 }
            r4.<init>()     // Catch:{ all -> 0x0101 }
            r5 = 0
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            r6.<init>()     // Catch:{ all -> 0x0101 }
            r6.append(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = "*"
            r6.append(r7)     // Catch:{ all -> 0x0101 }
            r6.append(r5)     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0101 }
            java.util.Map<java.lang.String, java.lang.Object> r7 = r9.slist     // Catch:{ all -> 0x0101 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0101 }
            if (r7 != 0) goto L_0x003b
            goto L_0x0050
        L_0x003b:
            r2.add(r7)     // Catch:{ all -> 0x0101 }
            boolean r8 = r7 instanceof javax.mail.internet.ParameterList.Value     // Catch:{ IOException -> 0x00a9 }
            if (r8 == 0) goto L_0x00a0
            javax.mail.internet.ParameterList$Value r7 = (javax.mail.internet.ParameterList.Value) r7     // Catch:{ IOException -> 0x00a9 }
            if (r5 != 0) goto L_0x0049
            java.lang.String r3 = r7.charset     // Catch:{ IOException -> 0x00a9 }
            goto L_0x009a
        L_0x0049:
            if (r3 != 0) goto L_0x009a
            java.util.Set<java.lang.String> r7 = r9.multisegmentNames     // Catch:{ IOException -> 0x00a9 }
            r7.remove(r1)     // Catch:{ IOException -> 0x00a9 }
        L_0x0050:
            if (r5 != 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.list     // Catch:{ all -> 0x0101 }
            r2.remove(r1)     // Catch:{ all -> 0x0101 }
            goto L_0x0006
        L_0x0058:
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = javax.mail.internet.MimeUtility.javaCharset(r3)     // Catch:{ UnsupportedEncodingException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r3 = move-exception
            goto L_0x007d
        L_0x0061:
            if (r3 == 0) goto L_0x0069
            int r5 = r3.length()     // Catch:{ UnsupportedEncodingException -> 0x005f }
            if (r5 != 0) goto L_0x006d
        L_0x0069:
            java.lang.String r3 = javax.mail.internet.MimeUtility.getDefaultJavaCharset()     // Catch:{ UnsupportedEncodingException -> 0x005f }
        L_0x006d:
            if (r3 == 0) goto L_0x0076
            java.lang.String r3 = r4.toString(r3)     // Catch:{ UnsupportedEncodingException -> 0x005f }
            r2.value = r3     // Catch:{ UnsupportedEncodingException -> 0x005f }
            goto L_0x0089
        L_0x0076:
            java.lang.String r3 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x005f }
            r2.value = r3     // Catch:{ UnsupportedEncodingException -> 0x005f }
            goto L_0x0089
        L_0x007d:
            boolean r5 = decodeParametersStrict     // Catch:{ all -> 0x0101 }
            if (r5 != 0) goto L_0x0090
            java.lang.String r3 = "iso-8859-1"
            java.lang.String r3 = r4.toString(r3)     // Catch:{ UnsupportedEncodingException -> 0x0089 }
            r2.value = r3     // Catch:{ UnsupportedEncodingException -> 0x0089 }
        L_0x0089:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.list     // Catch:{ all -> 0x0101 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0101 }
            goto L_0x0006
        L_0x0090:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0101 }
            r0.<init>(r1)     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x009a:
            java.lang.String r7 = r7.value     // Catch:{ IOException -> 0x00a9 }
            decodeBytes((java.lang.String) r7, (java.io.OutputStream) r4)     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00a9
        L_0x00a0:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00a9 }
            byte[] r7 = com.sun.mail.util.ASCIIUtility.getBytes((java.lang.String) r7)     // Catch:{ IOException -> 0x00a9 }
            r4.write(r7)     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r9.slist     // Catch:{ all -> 0x0101 }
            r7.remove(r6)     // Catch:{ all -> 0x0101 }
            int r5 = r5 + 1
            goto L_0x001e
        L_0x00b2:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x00f6
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x00c4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r10.next()
            boolean r1 = r0 instanceof javax.mail.internet.ParameterList.Value
            if (r1 == 0) goto L_0x00c4
            javax.mail.internet.ParameterList$Value r0 = (javax.mail.internet.ParameterList.Value) r0
            java.lang.String r1 = r0.value     // Catch:{ UnsupportedEncodingException -> 0x00df }
            java.lang.String r2 = r0.charset     // Catch:{ UnsupportedEncodingException -> 0x00df }
            java.lang.String r1 = decodeBytes((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x00df }
            r0.value = r1     // Catch:{ UnsupportedEncodingException -> 0x00df }
            goto L_0x00c4
        L_0x00df:
            r0 = move-exception
            boolean r1 = decodeParametersStrict
            if (r1 != 0) goto L_0x00e5
            goto L_0x00c4
        L_0x00e5:
            javax.mail.internet.ParseException r10 = new javax.mail.internet.ParseException
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00ef:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.list
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.slist
            r10.putAll(r0)
        L_0x00f6:
            java.util.Set<java.lang.String> r10 = r9.multisegmentNames
            r10.clear()
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            r10.clear()
            return
        L_0x0101:
            r0 = move-exception
            if (r10 == 0) goto L_0x0152
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x0148
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x0116:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0141
            java.lang.Object r1 = r10.next()
            boolean r2 = r1 instanceof javax.mail.internet.ParameterList.Value
            if (r2 == 0) goto L_0x0116
            javax.mail.internet.ParameterList$Value r1 = (javax.mail.internet.ParameterList.Value) r1
            java.lang.String r2 = r1.value     // Catch:{ UnsupportedEncodingException -> 0x0131 }
            java.lang.String r3 = r1.charset     // Catch:{ UnsupportedEncodingException -> 0x0131 }
            java.lang.String r2 = decodeBytes((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ UnsupportedEncodingException -> 0x0131 }
            r1.value = r2     // Catch:{ UnsupportedEncodingException -> 0x0131 }
            goto L_0x0116
        L_0x0131:
            r1 = move-exception
            boolean r2 = decodeParametersStrict
            if (r2 != 0) goto L_0x0137
            goto L_0x0116
        L_0x0137:
            javax.mail.internet.ParseException r10 = new javax.mail.internet.ParseException
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        L_0x0141:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.list
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.slist
            r10.putAll(r1)
        L_0x0148:
            java.util.Set<java.lang.String> r10 = r9.multisegmentNames
            r10.clear()
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.slist
            r10.clear()
        L_0x0152:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.ParameterList.combineMultisegmentNames(boolean):void");
    }

    private static String decodeBytes(String str, String str2) throws ParseException, UnsupportedEncodingException {
        byte[] bArr = new byte[str.length()];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                try {
                    charAt = (char) Integer.parseInt(str.substring(i + 1, i + 3), 16);
                    i += 2;
                } catch (NumberFormatException e) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e.toString());
                    }
                } catch (StringIndexOutOfBoundsException e2) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e2.toString());
                    }
                }
            }
            bArr[i2] = (byte) charAt;
            i++;
            i2++;
        }
        if (str2 != null) {
            str2 = MimeUtility.javaCharset(str2);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = MimeUtility.getDefaultJavaCharset();
        }
        return new String(bArr, 0, i2, str2);
    }

    private static Value encodeValue(String str, String str2) {
        if (MimeUtility.checkAscii(str) == 1) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(MimeUtility.javaCharset(str2));
            StringBuffer stringBuffer = new StringBuffer(bytes.length + str2.length() + 2);
            stringBuffer.append(str2);
            stringBuffer.append("''");
            for (byte b : bytes) {
                char c = (char) (b & 255);
                if (c <= ' ' || c >= 127 || c == '*' || c == '\'' || c == '%' || HeaderTokenizer.MIME.indexOf(c) >= 0) {
                    stringBuffer.append('%');
                    char[] cArr = hex;
                    stringBuffer.append(cArr[c >> 4]);
                    stringBuffer.append(cArr[c & 15]);
                } else {
                    stringBuffer.append(c);
                }
            }
            Value value = new Value();
            value.charset = str2;
            value.value = str;
            value.encodedValue = stringBuffer.toString();
            return value;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static Value extractCharset(String str) throws ParseException {
        Value value = new Value();
        value.encodedValue = str;
        value.value = str;
        try {
            int indexOf = str.indexOf(39);
            if (indexOf >= 0) {
                String substring = str.substring(0, indexOf);
                int indexOf2 = str.indexOf(39, indexOf + 1);
                if (indexOf2 >= 0) {
                    value.value = str.substring(indexOf2 + 1);
                    value.charset = substring;
                    return value;
                } else if (!decodeParametersStrict) {
                    return value;
                } else {
                    throw new ParseException("Missing language in encoded value: " + str);
                }
            } else if (!decodeParametersStrict) {
                return value;
            } else {
                throw new ParseException("Missing charset in encoded value: " + str);
            }
        } catch (NumberFormatException e) {
            if (decodeParametersStrict) {
                throw new ParseException(e.toString());
            }
        } catch (StringIndexOutOfBoundsException e2) {
            if (decodeParametersStrict) {
                throw new ParseException(e2.toString());
            }
        }
    }

    private void putEncodedName(String str, String str2) throws ParseException {
        Object obj;
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            this.list.put(str, str2);
        } else if (indexOf == str.length() - 1) {
            String substring = str.substring(0, indexOf);
            Value extractCharset = extractCharset(str2);
            try {
                extractCharset.value = decodeBytes(extractCharset.value, extractCharset.charset);
            } catch (UnsupportedEncodingException e) {
                if (decodeParametersStrict) {
                    throw new ParseException(e.toString());
                }
            }
            this.list.put(substring, extractCharset);
        } else {
            String substring2 = str.substring(0, indexOf);
            this.multisegmentNames.add(substring2);
            this.list.put(substring2, "");
            Object obj2 = str2;
            if (str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                if (str.endsWith("*0*")) {
                    obj = extractCharset(str2);
                } else {
                    Value value = new Value();
                    value.encodedValue = str2;
                    value.value = str2;
                    obj = value;
                }
                str = str.substring(0, str.length() - 1);
                obj2 = obj;
            }
            this.slist.put(str, obj2);
        }
    }

    private static String quote(String str) {
        return MimeUtility.quote(str, HeaderTokenizer.MIME);
    }

    public void combineSegments() {
        if (decodeParameters && this.multisegmentNames.size() > 0) {
            try {
                combineMultisegmentNames(true);
            } catch (ParseException unused) {
            }
        }
    }

    public String get(String str) {
        Object obj = this.list.get(str.trim().toLowerCase(Locale.ENGLISH));
        if (obj instanceof MultiValue) {
            return ((MultiValue) obj).value;
        }
        if (obj instanceof LiteralValue) {
            return ((LiteralValue) obj).value;
        }
        if (obj instanceof Value) {
            return ((Value) obj).value;
        }
        return (String) obj;
    }

    public Enumeration<String> getNames() {
        return new ParamEnum(this.list.keySet().iterator());
    }

    public void remove(String str) {
        this.list.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void set(String str, String str2) {
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        if (decodeParameters) {
            try {
                putEncodedName(lowerCase, str2);
            } catch (ParseException unused) {
                this.list.put(lowerCase, str2);
            }
        } else {
            this.list.put(lowerCase, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setLiteral(String str, String str2) {
        LiteralValue literalValue = new LiteralValue();
        literalValue.value = str2;
        this.list.put(str, literalValue);
    }

    public int size() {
        return this.list.size();
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int i) {
        String str;
        String str2;
        ToStringBuffer toStringBuffer = new ToStringBuffer(i);
        for (Map.Entry next : this.list.entrySet()) {
            String str3 = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof MultiValue) {
                MultiValue multiValue = (MultiValue) value;
                String str4 = str3 + ProxyConfig.MATCH_ALL_SCHEMES;
                for (int i2 = 0; i2 < multiValue.size(); i2++) {
                    Object obj = multiValue.get(i2);
                    if (obj instanceof Value) {
                        str = str4 + i2 + ProxyConfig.MATCH_ALL_SCHEMES;
                        str2 = ((Value) obj).encodedValue;
                    } else {
                        str = str4 + i2;
                        str2 = (String) obj;
                    }
                    toStringBuffer.addNV(str, quote(str2));
                }
            } else if (value instanceof LiteralValue) {
                toStringBuffer.addNV(str3, quote(((LiteralValue) value).value));
            } else if (value instanceof Value) {
                toStringBuffer.addNV(str3 + ProxyConfig.MATCH_ALL_SCHEMES, quote(((Value) value).encodedValue));
            } else {
                String str5 = (String) value;
                if (str5.length() <= 60 || !splitLongParameters || !encodeParameters) {
                    toStringBuffer.addNV(str3, quote(str5));
                } else {
                    String str6 = str3 + ProxyConfig.MATCH_ALL_SCHEMES;
                    int i3 = 0;
                    while (str5.length() > 60) {
                        toStringBuffer.addNV(str6 + i3, quote(str5.substring(0, 60)));
                        str5 = str5.substring(60);
                        i3++;
                    }
                    if (str5.length() > 0) {
                        toStringBuffer.addNV(str6 + i3, quote(str5));
                    }
                }
            }
        }
        return toStringBuffer.toString();
    }

    public void set(String str, String str2, String str3) {
        if (encodeParameters) {
            Value encodeValue = encodeValue(str2, str3);
            if (encodeValue != null) {
                this.list.put(str.trim().toLowerCase(Locale.ENGLISH), encodeValue);
            } else {
                set(str, str2);
            }
        } else {
            set(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016d, code lost:
        throw new javax.mail.internet.ParseException("In parameter list <" + r12 + ">, expected ';', got \"" + r1.getValue() + "\"");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParameterList(java.lang.String r12) throws javax.mail.internet.ParseException {
        /*
            r11 = this;
            r11.<init>()
            javax.mail.internet.HeaderTokenizer r0 = new javax.mail.internet.HeaderTokenizer
            java.lang.String r1 = "()<>@,;:\\\"\t []/?="
            r0.<init>(r12, r1)
        L_0x000a:
            javax.mail.internet.HeaderTokenizer$Token r1 = r0.next()
            int r2 = r1.getType()
            r3 = -4
            if (r2 != r3) goto L_0x0016
            goto L_0x002e
        L_0x0016:
            char r4 = (char) r2
            java.lang.String r5 = "filename"
            java.lang.String r6 = "name"
            r7 = -1
            r8 = 59
            java.lang.String r9 = "\""
            java.lang.String r10 = "In parameter list <"
            if (r4 != r8) goto L_0x0103
            javax.mail.internet.HeaderTokenizer$Token r1 = r0.next()
            int r2 = r1.getType()
            if (r2 != r3) goto L_0x0037
        L_0x002e:
            boolean r12 = decodeParameters
            if (r12 == 0) goto L_0x0036
            r12 = 0
            r11.combineMultisegmentNames(r12)
        L_0x0036:
            return
        L_0x0037:
            int r2 = r1.getType()
            if (r2 != r7) goto L_0x00df
            java.lang.String r1 = r1.getValue()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            javax.mail.internet.HeaderTokenizer$Token r2 = r0.next()
            int r3 = r2.getType()
            char r3 = (char) r3
            r4 = 61
            if (r3 != r4) goto L_0x00bb
            boolean r2 = windowshack
            if (r2 == 0) goto L_0x006a
            boolean r2 = r1.equals(r6)
            if (r2 != 0) goto L_0x0064
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x006a
        L_0x0064:
            r2 = 1
            javax.mail.internet.HeaderTokenizer$Token r2 = r0.next(r8, r2)
            goto L_0x0077
        L_0x006a:
            boolean r2 = parametersStrict
            if (r2 == 0) goto L_0x0073
            javax.mail.internet.HeaderTokenizer$Token r2 = r0.next()
            goto L_0x0077
        L_0x0073:
            javax.mail.internet.HeaderTokenizer$Token r2 = r0.next(r8)
        L_0x0077:
            int r3 = r2.getType()
            if (r3 == r7) goto L_0x00a5
            r4 = -2
            if (r3 != r4) goto L_0x0081
            goto L_0x00a5
        L_0x0081:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r12)
            java.lang.String r12 = ">, expected parameter value, got \""
            r1.append(r12)
            java.lang.String r12 = r2.getValue()
            r1.append(r12)
            r1.append(r9)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00a5:
            java.lang.String r2 = r2.getValue()
            r11.lastName = r1
            boolean r3 = decodeParameters
            if (r3 == 0) goto L_0x00b4
            r11.putEncodedName(r1, r2)
            goto L_0x000a
        L_0x00b4:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r11.list
            r3.put(r1, r2)
            goto L_0x000a
        L_0x00bb:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r12)
            java.lang.String r12 = ">, expected '=', got \""
            r1.append(r12)
            java.lang.String r12 = r2.getValue()
            r1.append(r12)
            r1.append(r9)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00df:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            java.lang.String r12 = ">, expected parameter name, got \""
            r2.append(r12)
            java.lang.String r12 = r1.getValue()
            r2.append(r12)
            r2.append(r9)
            java.lang.String r12 = r2.toString()
            r0.<init>(r12)
            throw r0
        L_0x0103:
            if (r2 != r7) goto L_0x014a
            java.lang.String r2 = r11.lastName
            if (r2 == 0) goto L_0x014a
            boolean r3 = applehack
            if (r3 == 0) goto L_0x011b
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x011f
            java.lang.String r2 = r11.lastName
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x011f
        L_0x011b:
            boolean r2 = parametersStrict
            if (r2 != 0) goto L_0x014a
        L_0x011f:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.list
            java.lang.String r3 = r11.lastName
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r1 = r1.getValue()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r11.list
            java.lang.String r3 = r11.lastName
            r2.put(r3, r1)
            goto L_0x000a
        L_0x014a:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            java.lang.String r12 = ">, expected ';', got \""
            r2.append(r12)
            java.lang.String r12 = r1.getValue()
            r2.append(r12)
            r2.append(r9)
            java.lang.String r12 = r2.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.ParameterList.<init>(java.lang.String):void");
    }

    private static void decodeBytes(String str, OutputStream outputStream) throws ParseException, IOException {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                try {
                    charAt = (char) Integer.parseInt(str.substring(i + 1, i + 3), 16);
                    i += 2;
                } catch (NumberFormatException e) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e.toString());
                    }
                } catch (StringIndexOutOfBoundsException e2) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e2.toString());
                    }
                }
            }
            outputStream.write((byte) charAt);
            i++;
        }
    }
}
