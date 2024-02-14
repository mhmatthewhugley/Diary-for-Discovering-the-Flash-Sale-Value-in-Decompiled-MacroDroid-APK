package org.apache.http.protocol;

public final class HTTP {
    public static final String ASCII = "ASCII";
    public static final String CHARSET_PARAM = "; charset=";
    public static final String CHUNK_CODING = "chunked";
    public static final String CONN_CLOSE = "Close";
    public static final String CONN_DIRECTIVE = "Connection";
    public static final String CONN_KEEP_ALIVE = "Keep-Alive";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LEN = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";

    /* renamed from: CR */
    public static final int f66007CR = 13;
    public static final String DATE_HEADER = "Date";
    public static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    public static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";
    public static final String DEFAULT_PROTOCOL_CHARSET = "US-ASCII";
    public static final String EXPECT_CONTINUE = "100-Continue";
    public static final String EXPECT_DIRECTIVE = "Expect";

    /* renamed from: HT */
    public static final int f66008HT = 9;
    public static final String IDENTITY_CODING = "identity";
    public static final String ISO_8859_1 = "ISO-8859-1";

    /* renamed from: LF */
    public static final int f66009LF = 10;
    public static final String OCTET_STREAM_TYPE = "application/octet-stream";
    public static final String PLAIN_TEXT_TYPE = "text/plain";
    public static final String SERVER_HEADER = "Server";

    /* renamed from: SP */
    public static final int f66010SP = 32;
    public static final String TARGET_HOST = "Host";
    public static final String TRANSFER_ENCODING = "Transfer-Encoding";
    public static final String USER_AGENT = "User-Agent";
    public static final String US_ASCII = "US-ASCII";
    public static final String UTF_16 = "UTF-16";
    public static final String UTF_8 = "UTF-8";

    private HTTP() {
    }

    public static boolean isWhitespace(char c) {
        return c == ' ' || c == 9 || c == 13 || c == 10;
    }
}
