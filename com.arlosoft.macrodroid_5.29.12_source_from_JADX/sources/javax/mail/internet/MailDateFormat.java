package javax.mail.internet;

import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;

public class MailDateFormat extends SimpleDateFormat {
    private static final int LEAP_SECOND = 60;
    /* access modifiers changed from: private */
    public static final MailLogger LOGGER = new MailLogger((Class<?>) MailDateFormat.class, "DEBUG", false, System.out);
    private static final String PATTERN = "EEE, d MMM yyyy HH:mm:ss Z (z)";
    private static final int UNKNOWN_DAY_NAME = -1;
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = -8148227605210628779L;

    private static abstract class AbstractDateParser {
        static final int INVALID_CHAR = -1;
        static final int MAX_YEAR_DIGITS = 8;
        final ParsePosition pos;
        final String text;

        AbstractDateParser(String str, ParsePosition parsePosition) {
            this.text = str;
            this.pos = parsePosition;
        }

        /* access modifiers changed from: package-private */
        public final int getAsciiDigit() {
            int i = getChar();
            if (48 <= i && i <= 57) {
                return Character.digit((char) i, 10);
            }
            if (i != -1) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public final int getChar() {
            if (this.pos.getIndex() >= this.text.length()) {
                return -1;
            }
            char charAt = this.text.charAt(this.pos.getIndex());
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return charAt;
        }

        /* access modifiers changed from: package-private */
        public boolean isValidZoneOffset(int i) {
            return i % 100 < 60;
        }

        /* access modifiers changed from: package-private */
        public final Date parse() {
            int index = this.pos.getIndex();
            try {
                return tryParse();
            } catch (Exception e) {
                if (MailDateFormat.LOGGER.isLoggable(Level.FINE)) {
                    MailLogger access$000 = MailDateFormat.LOGGER;
                    Level level = Level.FINE;
                    access$000.log(level, "Bad date: '" + this.text + "'", (Throwable) e);
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setErrorIndex(parsePosition.getIndex());
                this.pos.setIndex(index);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final int parseAsciiDigits(int i) throws ParseException {
            return parseAsciiDigits(i, i);
        }

        /* access modifiers changed from: package-private */
        public final void parseChar(char c) throws ParseException {
            if (!skipChar(c)) {
                throw new ParseException("Invalid input: expected '" + c + "'", this.pos.getIndex());
            }
        }

        /* access modifiers changed from: package-private */
        public final int parseDayName() throws ParseException {
            int i = getChar();
            if (i != -1) {
                if (i != 70) {
                    if (i != 77) {
                        if (i != 87) {
                            if (i != 83) {
                                if (i == 84) {
                                    if (skipPair('u', 'e')) {
                                        return 3;
                                    }
                                    if (skipPair('h', 'u')) {
                                        return 5;
                                    }
                                }
                            } else if (skipPair('u', 'n')) {
                                return 1;
                            } else {
                                if (skipPair('a', 't')) {
                                    return 7;
                                }
                            }
                        } else if (skipPair('e', 'd')) {
                            return 4;
                        }
                    } else if (skipPair('o', 'n')) {
                        return 2;
                    }
                } else if (skipPair('r', 'i')) {
                    return 6;
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 1);
                throw new ParseException("Invalid day-name", this.pos.getIndex());
            }
            throw new ParseException("Invalid day-name", this.pos.getIndex());
        }

        /* access modifiers changed from: package-private */
        public final void parseFoldingWhiteSpace() throws ParseException {
            if (!skipFoldingWhiteSpace()) {
                throw new ParseException("Invalid input: expected FWS", this.pos.getIndex());
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
            if (r17 == false) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
            if (r17 == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
            if (r17 == false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            if (r17 == false) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
            if (r17 == false) goto L_0x00c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
            if (r17 == false) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
            if (r17 == false) goto L_0x0128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
            if (r17 == false) goto L_0x0139;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int parseMonthName(boolean r17) throws java.text.ParseException {
            /*
                r16 = this;
                r0 = r16
                int r1 = r16.getChar()
                r2 = 82
                r3 = 80
                r4 = 65
                r5 = 67
                r6 = 85
                java.lang.String r7 = "Invalid month"
                r8 = 69
                r9 = 114(0x72, float:1.6E-43)
                r10 = 97
                r11 = 117(0x75, float:1.64E-43)
                r12 = 112(0x70, float:1.57E-43)
                r13 = 99
                r14 = 1
                r15 = 101(0x65, float:1.42E-43)
                switch(r1) {
                    case -1: goto L_0x015e;
                    case 65: goto L_0x0139;
                    case 68: goto L_0x0128;
                    case 70: goto L_0x0115;
                    case 74: goto L_0x00c1;
                    case 77: goto L_0x0081;
                    case 78: goto L_0x0068;
                    case 79: goto L_0x0053;
                    case 83: goto L_0x0042;
                    case 97: goto L_0x003e;
                    case 100: goto L_0x003a;
                    case 102: goto L_0x0036;
                    case 106: goto L_0x0032;
                    case 109: goto L_0x002f;
                    case 110: goto L_0x002c;
                    case 111: goto L_0x0029;
                    case 115: goto L_0x0026;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x016a
            L_0x0026:
                if (r17 != 0) goto L_0x016a
                goto L_0x0042
            L_0x0029:
                if (r17 != 0) goto L_0x016a
                goto L_0x0053
            L_0x002c:
                if (r17 != 0) goto L_0x016a
                goto L_0x0068
            L_0x002f:
                if (r17 != 0) goto L_0x016a
                goto L_0x0081
            L_0x0032:
                if (r17 != 0) goto L_0x016a
                goto L_0x00c1
            L_0x0036:
                if (r17 != 0) goto L_0x016a
                goto L_0x0115
            L_0x003a:
                if (r17 != 0) goto L_0x016a
                goto L_0x0128
            L_0x003e:
                if (r17 != 0) goto L_0x016a
                goto L_0x0139
            L_0x0042:
                boolean r1 = r0.skipPair(r15, r12)
                if (r1 != 0) goto L_0x0050
                if (r17 != 0) goto L_0x016a
                boolean r1 = r0.skipAlternativePair(r15, r8, r12, r3)
                if (r1 == 0) goto L_0x016a
            L_0x0050:
                r1 = 8
                return r1
            L_0x0053:
                r1 = 116(0x74, float:1.63E-43)
                boolean r2 = r0.skipPair(r13, r1)
                if (r2 != 0) goto L_0x0065
                if (r17 != 0) goto L_0x016a
                r2 = 84
                boolean r1 = r0.skipAlternativePair(r13, r5, r1, r2)
                if (r1 == 0) goto L_0x016a
            L_0x0065:
                r1 = 9
                return r1
            L_0x0068:
                r1 = 111(0x6f, float:1.56E-43)
                r2 = 118(0x76, float:1.65E-43)
                boolean r3 = r0.skipPair(r1, r2)
                if (r3 != 0) goto L_0x007e
                if (r17 != 0) goto L_0x016a
                r3 = 79
                r4 = 86
                boolean r1 = r0.skipAlternativePair(r1, r3, r2, r4)
                if (r1 == 0) goto L_0x016a
            L_0x007e:
                r1 = 10
                return r1
            L_0x0081:
                boolean r1 = r0.skipChar(r10)
                if (r1 != 0) goto L_0x008f
                if (r17 != 0) goto L_0x016a
                boolean r1 = r0.skipChar(r4)
                if (r1 == 0) goto L_0x016a
            L_0x008f:
                boolean r1 = r0.skipChar(r9)
                if (r1 != 0) goto L_0x00bf
                if (r17 != 0) goto L_0x009e
                boolean r1 = r0.skipChar(r2)
                if (r1 == 0) goto L_0x009e
                goto L_0x00bf
            L_0x009e:
                r1 = 121(0x79, float:1.7E-43)
                boolean r1 = r0.skipChar(r1)
                if (r1 != 0) goto L_0x00bd
                if (r17 != 0) goto L_0x00b1
                r1 = 89
                boolean r1 = r0.skipChar(r1)
                if (r1 == 0) goto L_0x00b1
                goto L_0x00bd
            L_0x00b1:
                java.text.ParsePosition r1 = r0.pos
                int r2 = r1.getIndex()
                int r2 = r2 - r14
                r1.setIndex(r2)
                goto L_0x016a
            L_0x00bd:
                r1 = 4
                return r1
            L_0x00bf:
                r1 = 2
                return r1
            L_0x00c1:
                boolean r1 = r0.skipChar(r11)
                r2 = 78
                r3 = 110(0x6e, float:1.54E-43)
                if (r1 != 0) goto L_0x00e4
                if (r17 != 0) goto L_0x00d4
                boolean r1 = r0.skipChar(r6)
                if (r1 == 0) goto L_0x00d4
                goto L_0x00e4
            L_0x00d4:
                boolean r1 = r0.skipPair(r10, r3)
                if (r1 != 0) goto L_0x00e2
                if (r17 != 0) goto L_0x016a
                boolean r1 = r0.skipAlternativePair(r10, r4, r3, r2)
                if (r1 == 0) goto L_0x016a
            L_0x00e2:
                r1 = 0
                return r1
            L_0x00e4:
                r1 = 108(0x6c, float:1.51E-43)
                boolean r1 = r0.skipChar(r1)
                if (r1 != 0) goto L_0x0113
                if (r17 != 0) goto L_0x00f7
                r1 = 76
                boolean r1 = r0.skipChar(r1)
                if (r1 == 0) goto L_0x00f7
                goto L_0x0113
            L_0x00f7:
                boolean r1 = r0.skipChar(r3)
                if (r1 != 0) goto L_0x0111
                if (r17 != 0) goto L_0x0106
                boolean r1 = r0.skipChar(r2)
                if (r1 == 0) goto L_0x0106
                goto L_0x0111
            L_0x0106:
                java.text.ParsePosition r1 = r0.pos
                int r2 = r1.getIndex()
                int r2 = r2 - r14
                r1.setIndex(r2)
                goto L_0x016a
            L_0x0111:
                r1 = 5
                return r1
            L_0x0113:
                r1 = 6
                return r1
            L_0x0115:
                r1 = 98
                boolean r2 = r0.skipPair(r15, r1)
                if (r2 != 0) goto L_0x0127
                if (r17 != 0) goto L_0x016a
                r2 = 66
                boolean r1 = r0.skipAlternativePair(r15, r8, r1, r2)
                if (r1 == 0) goto L_0x016a
            L_0x0127:
                return r14
            L_0x0128:
                boolean r1 = r0.skipPair(r15, r13)
                if (r1 != 0) goto L_0x0136
                if (r17 != 0) goto L_0x016a
                boolean r1 = r0.skipAlternativePair(r15, r8, r13, r5)
                if (r1 == 0) goto L_0x016a
            L_0x0136:
                r1 = 11
                return r1
            L_0x0139:
                r1 = 103(0x67, float:1.44E-43)
                boolean r4 = r0.skipPair(r11, r1)
                if (r4 != 0) goto L_0x015c
                if (r17 != 0) goto L_0x014c
                r4 = 71
                boolean r1 = r0.skipAlternativePair(r11, r6, r1, r4)
                if (r1 == 0) goto L_0x014c
                goto L_0x015c
            L_0x014c:
                boolean r1 = r0.skipPair(r12, r9)
                if (r1 != 0) goto L_0x015a
                if (r17 != 0) goto L_0x016a
                boolean r1 = r0.skipAlternativePair(r12, r3, r9, r2)
                if (r1 == 0) goto L_0x016a
            L_0x015a:
                r1 = 3
                return r1
            L_0x015c:
                r1 = 7
                return r1
            L_0x015e:
                java.text.ParseException r1 = new java.text.ParseException
                java.text.ParsePosition r2 = r0.pos
                int r2 = r2.getIndex()
                r1.<init>(r7, r2)
                throw r1
            L_0x016a:
                java.text.ParsePosition r1 = r0.pos
                int r2 = r1.getIndex()
                int r2 = r2 - r14
                r1.setIndex(r2)
                java.text.ParseException r1 = new java.text.ParseException
                java.text.ParsePosition r2 = r0.pos
                int r2 = r2.getIndex()
                r1.<init>(r7, r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: javax.mail.internet.MailDateFormat.AbstractDateParser.parseMonthName(boolean):int");
        }

        /* access modifiers changed from: package-private */
        public final int parseZoneOffset() throws ParseException {
            int i = getChar();
            int i2 = -1;
            if (i == 43 || i == 45) {
                int parseAsciiDigits = parseAsciiDigits(4, 4, true);
                if (isValidZoneOffset(parseAsciiDigits)) {
                    if (i != 43) {
                        i2 = 1;
                    }
                    return i2 * (((parseAsciiDigits / 100) * 60) + (parseAsciiDigits % 100));
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 5);
                throw new ParseException("Invalid zone", this.pos.getIndex());
            }
            if (i != -1) {
                ParsePosition parsePosition2 = this.pos;
                parsePosition2.setIndex(parsePosition2.getIndex() - 1);
            }
            throw new ParseException("Invalid zone", this.pos.getIndex());
        }

        /* access modifiers changed from: package-private */
        public final boolean peekAsciiDigit() {
            return this.pos.getIndex() < this.text.length() && '0' <= this.text.charAt(this.pos.getIndex()) && this.text.charAt(this.pos.getIndex()) <= '9';
        }

        /* access modifiers changed from: package-private */
        public final boolean peekChar(char c) {
            return this.pos.getIndex() < this.text.length() && this.text.charAt(this.pos.getIndex()) == c;
        }

        /* access modifiers changed from: package-private */
        public boolean peekFoldingWhiteSpace() {
            return this.pos.getIndex() < this.text.length() && (this.text.charAt(this.pos.getIndex()) == ' ' || this.text.charAt(this.pos.getIndex()) == 9 || this.text.charAt(this.pos.getIndex()) == 13);
        }

        /* access modifiers changed from: package-private */
        public final boolean skipAlternative(char c, char c2) {
            return skipChar(c) || skipChar(c2);
        }

        /* access modifiers changed from: package-private */
        public final boolean skipAlternativePair(char c, char c2, char c3, char c4) {
            if (!skipAlternative(c, c2)) {
                return false;
            }
            if (skipAlternative(c3, c4)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean skipAlternativeTriple(char c, char c2, char c3, char c4, char c5, char c6) {
            if (!skipAlternativePair(c, c2, c3, c4)) {
                return false;
            }
            if (skipAlternative(c5, c6)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 2);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean skipChar(char c) {
            if (this.pos.getIndex() >= this.text.length() || this.text.charAt(this.pos.getIndex()) != c) {
                return false;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean skipFoldingWhiteSpace() {
            if (skipChar(' ')) {
                if (!peekFoldingWhiteSpace()) {
                    return true;
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            } else if (!peekFoldingWhiteSpace()) {
                return false;
            }
            int index = this.pos.getIndex();
            if (skipWhiteSpace()) {
                while (skipNewline()) {
                    if (!skipWhiteSpace()) {
                        this.pos.setIndex(index);
                        return false;
                    }
                }
                return true;
            } else if (skipNewline() && skipWhiteSpace()) {
                return true;
            } else {
                this.pos.setIndex(index);
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean skipNewline() {
            return skipPair(13, 10);
        }

        /* access modifiers changed from: package-private */
        public final boolean skipPair(char c, char c2) {
            if (!skipChar(c)) {
                return false;
            }
            if (skipChar(c2)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean skipWhiteSpace() {
            int index = this.pos.getIndex();
            do {
            } while (skipAlternative(' ', 9));
            return this.pos.getIndex() > index;
        }

        /* access modifiers changed from: package-private */
        public abstract Date tryParse() throws ParseException;

        /* access modifiers changed from: package-private */
        public final int parseAsciiDigits(int i, int i2) throws ParseException {
            return parseAsciiDigits(i, i2, false);
        }

        /* access modifiers changed from: package-private */
        public final int parseAsciiDigits(int i, int i2, boolean z) throws ParseException {
            String str;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && peekAsciiDigit()) {
                i4 = (i4 * 10) + getAsciiDigit();
                i3++;
            }
            if (i3 >= i && (i3 != i2 || z || !peekAsciiDigit())) {
                return i4;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - i3);
            if (i == i2) {
                str = Integer.toString(i);
            } else {
                str = "between " + i + " and " + i2;
            }
            throw new ParseException("Invalid input: expected " + str + " ASCII digits", this.pos.getIndex());
        }
    }

    private class Rfc2822LenientParser extends Rfc2822StrictParser {
        private Boolean hasDefaultFws;

        Rfc2822LenientParser(String str, ParsePosition parsePosition) {
            super(str, parsePosition);
        }

        /* access modifiers changed from: package-private */
        public boolean isMonthNameCaseSensitive() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isValidZoneOffset(int i) {
            return true;
        }

        /* access modifiers changed from: package-private */
        public int parseDay() throws ParseException {
            skipFoldingWhiteSpace();
            return parseAsciiDigits(1, 3);
        }

        /* access modifiers changed from: package-private */
        public void parseFwsBetweenTimeOfDayAndZone() throws ParseException {
            skipFoldingWhiteSpace();
        }

        /* access modifiers changed from: package-private */
        public void parseFwsInMonth() throws ParseException {
            Boolean bool = this.hasDefaultFws;
            if (bool == null) {
                this.hasDefaultFws = Boolean.valueOf(!skipChar('-'));
                skipFoldingWhiteSpace();
            } else if (bool.booleanValue()) {
                skipFoldingWhiteSpace();
            } else {
                parseChar('-');
            }
        }

        /* access modifiers changed from: package-private */
        public int parseHour() throws ParseException {
            return parseAsciiDigits(1, 2);
        }

        /* access modifiers changed from: package-private */
        public int parseMinute() throws ParseException {
            return parseAsciiDigits(1, 2);
        }

        /* access modifiers changed from: package-private */
        public int parseOptionalBegin() {
            while (this.pos.getIndex() < this.text.length() && !peekAsciiDigit()) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int parseSecond() throws ParseException {
            return parseAsciiDigits(1, 2);
        }

        /* access modifiers changed from: package-private */
        public int parseYear() throws ParseException {
            int parseAsciiDigits = parseAsciiDigits(1, 8);
            return parseAsciiDigits >= 1000 ? parseAsciiDigits : parseAsciiDigits >= 50 ? parseAsciiDigits + 1900 : parseAsciiDigits + 2000;
        }

        /* access modifiers changed from: package-private */
        public int parseZone() throws ParseException {
            int i;
            try {
                if (this.pos.getIndex() < this.text.length()) {
                    if (!peekChar('+')) {
                        if (!peekChar('-')) {
                            if (skipAlternativePair('U', 'u', 'T', 't') || skipAlternativeTriple('G', 'g', 'M', 'm', 'T', 't')) {
                                return 0;
                            }
                            if (skipAlternative('E', 'e')) {
                                i = 4;
                            } else if (skipAlternative('C', 'c')) {
                                i = 5;
                            } else if (skipAlternative('M', 'm')) {
                                i = 6;
                            } else if (skipAlternative('P', 'p')) {
                                i = 7;
                            } else {
                                throw new ParseException("Invalid zone", this.pos.getIndex());
                            }
                            if (skipAlternativePair('S', 's', 'T', 't')) {
                                i++;
                            } else if (!skipAlternativePair('D', 'd', 'T', 't')) {
                                ParsePosition parsePosition = this.pos;
                                parsePosition.setIndex(parsePosition.getIndex() - 1);
                                throw new ParseException("Invalid zone", this.pos.getIndex());
                            }
                            return i * 60;
                        }
                    }
                    return parseZoneOffset();
                }
                throw new ParseException("Missing zone", this.pos.getIndex());
            } catch (ParseException e) {
                MailLogger access$000 = MailDateFormat.LOGGER;
                Level level = Level.FINE;
                if (access$000.isLoggable(level)) {
                    MailLogger access$0002 = MailDateFormat.LOGGER;
                    access$0002.log(level, "No timezone? : '" + this.text + "'", (Throwable) e);
                }
                return 0;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean peekFoldingWhiteSpace() {
            return super.peekFoldingWhiteSpace() || (this.pos.getIndex() < this.text.length() && this.text.charAt(this.pos.getIndex()) == 10);
        }

        /* access modifiers changed from: package-private */
        public boolean skipFoldingWhiteSpace() {
            boolean peekFoldingWhiteSpace = peekFoldingWhiteSpace();
            while (this.pos.getIndex() < this.text.length() && ((r1 = this.text.charAt(this.pos.getIndex())) == 9 || r1 == 10 || r1 == 13 || r1 == ' ')) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
            return peekFoldingWhiteSpace;
        }
    }

    private class Rfc2822StrictParser extends AbstractDateParser {
        Rfc2822StrictParser(String str, ParsePosition parsePosition) {
            super(str, parsePosition);
        }

        /* access modifiers changed from: package-private */
        public boolean isMonthNameCaseSensitive() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public int parseDay() throws ParseException {
            skipFoldingWhiteSpace();
            return parseAsciiDigits(1, 2);
        }

        /* access modifiers changed from: package-private */
        public void parseFwsBetweenTimeOfDayAndZone() throws ParseException {
            parseFoldingWhiteSpace();
        }

        /* access modifiers changed from: package-private */
        public void parseFwsInMonth() throws ParseException {
            parseFoldingWhiteSpace();
        }

        /* access modifiers changed from: package-private */
        public int parseHour() throws ParseException {
            return parseAsciiDigits(2);
        }

        /* access modifiers changed from: package-private */
        public int parseMinute() throws ParseException {
            return parseAsciiDigits(2);
        }

        /* access modifiers changed from: package-private */
        public int parseMonth() throws ParseException {
            parseFwsInMonth();
            int parseMonthName = parseMonthName(isMonthNameCaseSensitive());
            parseFwsInMonth();
            return parseMonthName;
        }

        /* access modifiers changed from: package-private */
        public int parseOptionalBegin() throws ParseException {
            if (peekAsciiDigit()) {
                return -1;
            }
            skipFoldingWhiteSpace();
            int parseDayName = parseDayName();
            parseChar(',');
            return parseDayName;
        }

        /* access modifiers changed from: package-private */
        public int parseSecond() throws ParseException {
            return parseAsciiDigits(2);
        }

        /* access modifiers changed from: package-private */
        public int parseYear() throws ParseException {
            int parseAsciiDigits = parseAsciiDigits(4, 8);
            if (parseAsciiDigits >= 1900) {
                return parseAsciiDigits;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 4);
            while (this.text.charAt(this.pos.getIndex() - 1) == '0') {
                ParsePosition parsePosition2 = this.pos;
                parsePosition2.setIndex(parsePosition2.getIndex() - 1);
            }
            throw new ParseException("Invalid year", this.pos.getIndex());
        }

        /* access modifiers changed from: package-private */
        public int parseZone() throws ParseException {
            return parseZoneOffset();
        }

        /* access modifiers changed from: package-private */
        public Date tryParse() throws ParseException {
            int parseOptionalBegin = parseOptionalBegin();
            int parseDay = parseDay();
            int parseMonth = parseMonth();
            int parseYear = parseYear();
            parseFoldingWhiteSpace();
            int parseHour = parseHour();
            parseChar(':');
            int parseMinute = parseMinute();
            int parseSecond = skipChar(':') ? parseSecond() : 0;
            parseFwsBetweenTimeOfDayAndZone();
            try {
                return MailDateFormat.this.toDate(parseOptionalBegin, parseDay, parseMonth, parseYear, parseHour, parseMinute, parseSecond, parseZone());
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Invalid input: some of the calendar fields have invalid values, or day-name is inconsistent with date", this.pos.getIndex());
            }
        }
    }

    public MailDateFormat() {
        super(PATTERN, Locale.US);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        super.applyPattern(PATTERN);
    }

    private void superApplyPattern(String str) {
        super.applyPattern(str);
    }

    /* access modifiers changed from: private */
    public Date toDate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7 == 60 ? 59 : i7;
        TimeZone timeZone = this.calendar.getTimeZone();
        try {
            this.calendar.setTimeZone(UTC);
            this.calendar.clear();
            this.calendar.set(i4, i3, i2, i5, i6, i9);
            if (i != -1) {
                if (i != this.calendar.get(7)) {
                    throw new IllegalArgumentException("Inconsistent day-name");
                }
            }
            this.calendar.add(12, i8);
            return this.calendar.getTime();
        } finally {
            this.calendar.setTimeZone(timeZone);
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        MailDateFormat mailDateFormat = new MailDateFormat();
        mailDateFormat.superApplyPattern("EEE, d MMM yyyy HH:mm:ss 'XXXXX' (z)");
        mailDateFormat.setTimeZone(getTimeZone());
        return mailDateFormat;
    }

    public void applyLocalizedPattern(String str) {
        throw new UnsupportedOperationException("Method applyLocalizedPattern() shouldn't be called");
    }

    public void applyPattern(String str) {
        throw new UnsupportedOperationException("Method applyPattern() shouldn't be called");
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return super.format(date, stringBuffer, fieldPosition);
    }

    public Date get2DigitYearStart() {
        throw new UnsupportedOperationException("Method get2DigitYearStart() shouldn't be called");
    }

    public Date parse(String str, ParsePosition parsePosition) {
        if (str == null || parsePosition == null) {
            throw null;
        } else if (parsePosition.getIndex() < 0 || parsePosition.getIndex() >= str.length()) {
            return null;
        } else {
            if (isLenient()) {
                return new Rfc2822LenientParser(str, parsePosition).parse();
            }
            return new Rfc2822StrictParser(str, parsePosition).parse();
        }
    }

    public void set2DigitYearStart(Date date) {
        throw new UnsupportedOperationException("Method set2DigitYearStart() shouldn't be called");
    }

    public void setCalendar(Calendar calendar) {
        throw new UnsupportedOperationException("Method setCalendar() shouldn't be called");
    }

    public void setDateFormatSymbols(DateFormatSymbols dateFormatSymbols) {
        throw new UnsupportedOperationException("Method setDateFormatSymbols() shouldn't be called");
    }

    public void setNumberFormat(NumberFormat numberFormat) {
        throw new UnsupportedOperationException("Method setNumberFormat() shouldn't be called");
    }

    public MailDateFormat clone() {
        return (MailDateFormat) super.clone();
    }
}
