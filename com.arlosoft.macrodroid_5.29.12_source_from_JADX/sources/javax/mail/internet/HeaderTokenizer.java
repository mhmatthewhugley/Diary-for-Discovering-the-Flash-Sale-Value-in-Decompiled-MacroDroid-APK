package javax.mail.internet;

import org.apache.commons.p353io.IOUtils;

public class HeaderTokenizer {
    private static final Token EOFToken = new Token(-4, (String) null);
    public static final String MIME = "()<>@,;:\\\"\t []/?=";
    public static final String RFC822 = "()<>@,;:\\\"\t .[]";
    private int currentPos;
    private String delimiters;
    private int maxPos;
    private int nextPos;
    private int peekPos;
    private boolean skipComments;
    private String string;

    public static class Token {
        public static final int ATOM = -1;
        public static final int COMMENT = -3;
        public static final int EOF = -4;
        public static final int QUOTEDSTRING = -2;
        private int type;
        private String value;

        public Token(int i, String str) {
            this.type = i;
            this.value = str;
        }

        public int getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }
    }

    public HeaderTokenizer(String str, String str2, boolean z) {
        str = str == null ? "" : str;
        this.string = str;
        this.skipComments = z;
        this.delimiters = str2;
        this.peekPos = 0;
        this.nextPos = 0;
        this.currentPos = 0;
        this.maxPos = str.length();
    }

    private Token collectString(char c, boolean z) throws ParseException {
        String str;
        String str2;
        int i = this.currentPos;
        boolean z2 = false;
        while (true) {
            int i2 = this.currentPos;
            if (i2 < this.maxPos) {
                char charAt = this.string.charAt(i2);
                if (charAt == '\\') {
                    this.currentPos++;
                } else if (charAt != 13) {
                    if (charAt == c) {
                        int i3 = this.currentPos + 1;
                        this.currentPos = i3;
                        if (z2) {
                            str2 = filterToken(this.string, i, i3 - 1, z);
                        } else {
                            str2 = this.string.substring(i, i3 - 1);
                        }
                        if (charAt != '\"') {
                            str2 = trimWhiteSpace(str2);
                            this.currentPos--;
                        }
                        return new Token(-2, str2);
                    }
                    this.currentPos++;
                }
                z2 = true;
                this.currentPos++;
            } else if (c != '\"') {
                if (z2) {
                    str = filterToken(this.string, i, i2, z);
                } else {
                    str = this.string.substring(i, i2);
                }
                return new Token(-2, trimWhiteSpace(str));
            } else {
                throw new ParseException("Unbalanced quoted string");
            }
        }
    }

    private static String filterToken(String str, int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 10 || !z2) {
                if (z3) {
                    if (z) {
                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                    sb.append(charAt);
                    z2 = false;
                    z3 = false;
                } else if (charAt == '\\') {
                    z2 = false;
                    z3 = true;
                } else if (charAt == 13) {
                    z2 = true;
                } else {
                    sb.append(charAt);
                }
                i++;
            }
            z2 = false;
            i++;
        }
        return sb.toString();
    }

    private Token getNext(char c, boolean z) throws ParseException {
        String str;
        if (this.currentPos >= this.maxPos) {
            return EOFToken;
        }
        if (skipWhiteSpace() == -4) {
            return EOFToken;
        }
        char charAt = this.string.charAt(this.currentPos);
        boolean z2 = false;
        while (charAt == '(') {
            int i = this.currentPos + 1;
            this.currentPos = i;
            int i2 = 1;
            while (i2 > 0) {
                int i3 = this.currentPos;
                if (i3 >= this.maxPos) {
                    break;
                }
                char charAt2 = this.string.charAt(i3);
                if (charAt2 == '\\') {
                    this.currentPos++;
                } else if (charAt2 != 13) {
                    if (charAt2 == '(') {
                        i2++;
                    } else if (charAt2 == ')') {
                        i2--;
                    }
                    this.currentPos++;
                }
                z2 = true;
                this.currentPos++;
            }
            if (i2 != 0) {
                throw new ParseException("Unbalanced comments");
            } else if (!this.skipComments) {
                if (z2) {
                    str = filterToken(this.string, i, this.currentPos - 1, z);
                } else {
                    str = this.string.substring(i, this.currentPos - 1);
                }
                return new Token(-3, str);
            } else if (skipWhiteSpace() == -4) {
                return EOFToken;
            } else {
                charAt = this.string.charAt(this.currentPos);
            }
        }
        if (charAt == '\"') {
            this.currentPos++;
            return collectString('\"', z);
        } else if (charAt >= ' ' && charAt < 127 && this.delimiters.indexOf(charAt) < 0) {
            int i4 = this.currentPos;
            while (true) {
                int i5 = this.currentPos;
                if (i5 >= this.maxPos) {
                    break;
                }
                char charAt3 = this.string.charAt(i5);
                if (charAt3 >= ' ' && charAt3 < 127 && charAt3 != '(' && charAt3 != ' ' && charAt3 != '\"' && this.delimiters.indexOf(charAt3) < 0) {
                    this.currentPos++;
                } else if (c > 0 && charAt3 != c) {
                    this.currentPos = i4;
                    return collectString(c, z);
                }
            }
            return new Token(-1, this.string.substring(i4, this.currentPos));
        } else if (c > 0 && charAt != c) {
            return collectString(c, z);
        } else {
            this.currentPos++;
            return new Token(charAt, new String(new char[]{charAt}));
        }
    }

    private int skipWhiteSpace() {
        while (true) {
            int i = this.currentPos;
            if (i >= this.maxPos) {
                return -4;
            }
            char charAt = this.string.charAt(i);
            if (charAt != ' ' && charAt != 9 && charAt != 13 && charAt != 10) {
                return this.currentPos;
            }
            this.currentPos++;
        }
    }

    private static String trimWhiteSpace(String str) {
        int length = str.length() - 1;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt != ' ' && charAt != 9 && charAt != 13 && charAt != 10) {
                break;
            }
            length--;
        }
        if (length <= 0) {
            return "";
        }
        return str.substring(0, length + 1);
    }

    public String getRemainder() {
        if (this.nextPos >= this.string.length()) {
            return null;
        }
        return this.string.substring(this.nextPos);
    }

    public Token next() throws ParseException {
        return next(0, false);
    }

    public Token peek() throws ParseException {
        this.currentPos = this.peekPos;
        Token next = getNext(0, false);
        this.peekPos = this.currentPos;
        return next;
    }

    public Token next(char c) throws ParseException {
        return next(c, false);
    }

    public Token next(char c, boolean z) throws ParseException {
        this.currentPos = this.nextPos;
        Token next = getNext(c, z);
        int i = this.currentPos;
        this.peekPos = i;
        this.nextPos = i;
        return next;
    }

    public HeaderTokenizer(String str, String str2) {
        this(str, str2, true);
    }

    public HeaderTokenizer(String str) {
        this(str, RFC822);
    }
}
