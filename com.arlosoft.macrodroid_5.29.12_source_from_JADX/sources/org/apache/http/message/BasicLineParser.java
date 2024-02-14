package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

public class BasicLineParser implements LineParser {
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    protected final ProtocolVersion protocol;

    public BasicLineParser(ProtocolVersion protocolVersion) {
        this.protocol = protocolVersion == null ? HttpVersion.HTTP_1_1 : protocolVersion;
    }

    public static final Header parseHeader(String str, LineParser lineParser) throws ParseException {
        if (str != null) {
            if (lineParser == null) {
                lineParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return lineParser.parseHeader(charArrayBuffer);
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    public static final ProtocolVersion parseProtocolVersion(String str, LineParser lineParser) throws ParseException {
        if (str != null) {
            if (lineParser == null) {
                lineParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return lineParser.parseProtocolVersion(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }

    public static final RequestLine parseRequestLine(String str, LineParser lineParser) throws ParseException {
        if (str != null) {
            if (lineParser == null) {
                lineParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return lineParser.parseRequestLine(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }

    public static final StatusLine parseStatusLine(String str, LineParser lineParser) throws ParseException {
        if (str != null) {
            if (lineParser == null) {
                lineParser = DEFAULT;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.append(str);
            return lineParser.parseStatusLine(charArrayBuffer, new ParserCursor(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null.");
    }

    /* access modifiers changed from: protected */
    public ProtocolVersion createProtocolVersion(int i, int i2) {
        return this.protocol.forVersion(i, i2);
    }

    /* access modifiers changed from: protected */
    public RequestLine createRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    /* access modifiers changed from: protected */
    public StatusLine createStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        return new BasicStatusLine(protocolVersion, i, str);
    }

    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            int pos = parserCursor.getPos();
            String protocol2 = this.protocol.getProtocol();
            int length = protocol2.length();
            boolean z = false;
            if (charArrayBuffer.length() < length + 4) {
                return false;
            }
            if (pos < 0) {
                pos = (charArrayBuffer.length() - 4) - length;
            } else if (pos == 0) {
                while (pos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                    pos++;
                }
            }
            int i = pos + length;
            if (i + 4 > charArrayBuffer.length()) {
                return false;
            }
            boolean z2 = true;
            int i2 = 0;
            while (z2 && i2 < length) {
                z2 = charArrayBuffer.charAt(pos + i2) == protocol2.charAt(i2);
                i2++;
            }
            if (!z2) {
                return z2;
            }
            if (charArrayBuffer.charAt(i) == '/') {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    public void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    public BasicLineParser() {
        this((ProtocolVersion) null);
    }

    public Header parseHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        return new BufferedHeader(charArrayBuffer);
    }

    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            String protocol2 = this.protocol.getProtocol();
            int length = protocol2.length();
            int pos = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int i = pos2 + length;
            if (i + 4 <= upperBound) {
                boolean z = false;
                boolean z2 = true;
                int i2 = 0;
                while (z2 && i2 < length) {
                    z2 = charArrayBuffer.charAt(pos2 + i2) == protocol2.charAt(i2);
                    i2++;
                }
                if (z2) {
                    if (charArrayBuffer.charAt(i) == '/') {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    int i3 = pos2 + length + 1;
                    int indexOf = charArrayBuffer.indexOf(46, i3, upperBound);
                    if (indexOf != -1) {
                        try {
                            int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(i3, indexOf));
                            int i4 = indexOf + 1;
                            int indexOf2 = charArrayBuffer.indexOf(32, i4, upperBound);
                            if (indexOf2 == -1) {
                                indexOf2 = upperBound;
                            }
                            try {
                                int parseInt2 = Integer.parseInt(charArrayBuffer.substringTrimmed(i4, indexOf2));
                                parserCursor.updatePos(indexOf2);
                                return createProtocolVersion(parseInt, parseInt2);
                            } catch (NumberFormatException unused) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Invalid protocol minor version number: ");
                                stringBuffer.append(charArrayBuffer.substring(pos, upperBound));
                                throw new ParseException(stringBuffer.toString());
                            }
                        } catch (NumberFormatException unused2) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Invalid protocol major version number: ");
                            stringBuffer2.append(charArrayBuffer.substring(pos, upperBound));
                            throw new ParseException(stringBuffer2.toString());
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Invalid protocol version number: ");
                        stringBuffer3.append(charArrayBuffer.substring(pos, upperBound));
                        throw new ParseException(stringBuffer3.toString());
                    }
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Not a valid protocol version: ");
                    stringBuffer4.append(charArrayBuffer.substring(pos, upperBound));
                    throw new ParseException(stringBuffer4.toString());
                }
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Not a valid protocol version: ");
                stringBuffer5.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer5.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            int pos = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            try {
                skipWhitespace(charArrayBuffer, parserCursor);
                int pos2 = parserCursor.getPos();
                int indexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
                if (indexOf >= 0) {
                    String substringTrimmed = charArrayBuffer.substringTrimmed(pos2, indexOf);
                    parserCursor.updatePos(indexOf);
                    skipWhitespace(charArrayBuffer, parserCursor);
                    int pos3 = parserCursor.getPos();
                    int indexOf2 = charArrayBuffer.indexOf(32, pos3, upperBound);
                    if (indexOf2 >= 0) {
                        String substringTrimmed2 = charArrayBuffer.substringTrimmed(pos3, indexOf2);
                        parserCursor.updatePos(indexOf2);
                        ProtocolVersion parseProtocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
                        skipWhitespace(charArrayBuffer, parserCursor);
                        if (parserCursor.atEnd()) {
                            return createRequestLine(substringTrimmed, substringTrimmed2, parseProtocolVersion);
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid request line: ");
                        stringBuffer.append(charArrayBuffer.substring(pos, upperBound));
                        throw new ParseException(stringBuffer.toString());
                    }
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid request line: ");
                    stringBuffer2.append(charArrayBuffer.substring(pos, upperBound));
                    throw new ParseException(stringBuffer2.toString());
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid request line: ");
                stringBuffer3.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer3.toString());
            } catch (IndexOutOfBoundsException unused) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Invalid request line: ");
                stringBuffer4.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer4.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            int pos = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            try {
                ProtocolVersion parseProtocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
                skipWhitespace(charArrayBuffer, parserCursor);
                int pos2 = parserCursor.getPos();
                int indexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
                if (indexOf < 0) {
                    indexOf = upperBound;
                }
                return createStatusLine(parseProtocolVersion, Integer.parseInt(charArrayBuffer.substringTrimmed(pos2, indexOf)), indexOf < upperBound ? charArrayBuffer.substringTrimmed(indexOf, upperBound) : "");
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to parse status code from status line: ");
                stringBuffer.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer.toString());
            } catch (IndexOutOfBoundsException unused2) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid status line: ");
                stringBuffer2.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer2.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
