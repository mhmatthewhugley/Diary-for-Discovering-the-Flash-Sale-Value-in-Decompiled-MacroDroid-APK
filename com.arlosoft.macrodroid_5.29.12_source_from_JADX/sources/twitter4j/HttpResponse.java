package twitter4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import twitter4j.conf.ConfigurationContext;

public abstract class HttpResponse {
    private static final Logger logger = Logger.getLogger(HttpResponseImpl.class);
    protected final HttpClientConfiguration CONF;

    /* renamed from: is */
    protected InputStream f69253is;
    private JSONObject json;
    private JSONArray jsonArray;
    protected String responseAsString;
    protected int statusCode;
    private boolean streamConsumed;

    HttpResponse() {
        this.responseAsString = null;
        this.streamConsumed = false;
        this.json = null;
        this.jsonArray = null;
        this.CONF = ConfigurationContext.getInstance().getHttpClientConfiguration();
    }

    private void disconnectForcibly() {
        try {
            disconnect();
        } catch (Exception unused) {
        }
    }

    public JSONArray asJSONArray() throws TwitterException {
        if (this.jsonArray == null) {
            Reader reader = null;
            try {
                String str = this.responseAsString;
                if (str == null) {
                    reader = asReader();
                    this.jsonArray = new JSONArray(new JSONTokener(reader));
                } else {
                    this.jsonArray = new JSONArray(str);
                }
                if (this.CONF.isPrettyDebugEnabled()) {
                    logger.debug(this.jsonArray.toString(1));
                } else {
                    Logger logger2 = logger;
                    String str2 = this.responseAsString;
                    if (str2 == null) {
                        str2 = this.jsonArray.toString();
                    }
                    logger2.debug(str2);
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused) {
                    }
                }
                disconnectForcibly();
            } catch (JSONException e) {
                if (logger.isDebugEnabled()) {
                    throw new TwitterException(e.getMessage() + ":" + this.responseAsString, (Throwable) e);
                }
                throw new TwitterException(e.getMessage(), (Throwable) e);
            } catch (Throwable th) {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused2) {
                    }
                }
                disconnectForcibly();
                throw th;
            }
        }
        return this.jsonArray;
    }

    public JSONObject asJSONObject() throws TwitterException {
        if (this.json == null) {
            Reader reader = null;
            try {
                if (this.responseAsString == null) {
                    reader = asReader();
                    this.json = new JSONObject(new JSONTokener(reader));
                } else {
                    this.json = new JSONObject(this.responseAsString);
                }
                if (this.CONF.isPrettyDebugEnabled()) {
                    logger.debug(this.json.toString(1));
                } else {
                    Logger logger2 = logger;
                    String str = this.responseAsString;
                    if (str == null) {
                        str = this.json.toString();
                    }
                    logger2.debug(str);
                }
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused) {
                    }
                }
                disconnectForcibly();
            } catch (JSONException e) {
                if (this.responseAsString == null) {
                    throw new TwitterException(e.getMessage(), (Throwable) e);
                }
                throw new TwitterException(e.getMessage() + ":" + this.responseAsString, (Throwable) e);
            } catch (Throwable th) {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException unused2) {
                    }
                }
                disconnectForcibly();
                throw th;
            }
        }
        return this.json;
    }

    public Reader asReader() {
        try {
            return new BufferedReader(new InputStreamReader(this.f69253is, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return new InputStreamReader(this.f69253is);
        }
    }

    public InputStream asStream() {
        if (!this.streamConsumed) {
            return this.f69253is;
        }
        throw new IllegalStateException("Stream has already been consumed.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:14|15|(2:16|(1:18)(1:51))|19|20|21|22|23|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071 A[SYNTHETIC, Splitter:B:40:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC, Splitter:B:44:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String asString() throws twitter4j.TwitterException {
        /*
            r6 = this;
            java.lang.String r0 = r6.responseAsString
            if (r0 != 0) goto L_0x007f
            r0 = 0
            java.io.InputStream r1 = r6.asStream()     // Catch:{ IOException -> 0x0060, all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            if (r1 == 0) goto L_0x0010
            r1.close()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r6.disconnectForcibly()
            return r0
        L_0x0014:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0056, all -> 0x0051 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0056, all -> 0x0051 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x0056, all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0056, all -> 0x0051 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f }
            r0.<init>()     // Catch:{ IOException -> 0x004f }
        L_0x0025:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f }
            if (r3 == 0) goto L_0x0034
            r0.append(r3)     // Catch:{ IOException -> 0x004f }
            java.lang.String r3 = "\n"
            r0.append(r3)     // Catch:{ IOException -> 0x004f }
            goto L_0x0025
        L_0x0034:
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x004f }
            r6.responseAsString = r0     // Catch:{ IOException -> 0x004f }
            twitter4j.Logger r3 = logger     // Catch:{ IOException -> 0x004f }
            r3.debug(r0)     // Catch:{ IOException -> 0x004f }
            r1.close()     // Catch:{ IOException -> 0x004f }
            r0 = 1
            r6.streamConsumed = r0     // Catch:{ IOException -> 0x004f }
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            r6.disconnectForcibly()
            goto L_0x007f
        L_0x004f:
            r0 = move-exception
            goto L_0x0064
        L_0x0051:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x006f
        L_0x0056:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x0064
        L_0x005b:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
            goto L_0x006f
        L_0x0060:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x0064:
            twitter4j.TwitterException r3 = new twitter4j.TwitterException     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x006e }
            r3.<init>((java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x006e }
            throw r3     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0076
        L_0x0075:
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            r6.disconnectForcibly()
            throw r0
        L_0x007f:
            java.lang.String r0 = r6.responseAsString
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.HttpResponse.asString():java.lang.String");
    }

    public abstract void disconnect() throws IOException;

    public abstract String getResponseHeader(String str);

    public abstract Map<String, List<String>> getResponseHeaderFields();

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return "HttpResponse{statusCode=" + this.statusCode + ", responseAsString='" + this.responseAsString + '\'' + ", is=" + this.f69253is + ", streamConsumed=" + this.streamConsumed + '}';
    }

    public HttpResponse(HttpClientConfiguration httpClientConfiguration) {
        this.responseAsString = null;
        this.streamConsumed = false;
        this.json = null;
        this.jsonArray = null;
        this.CONF = httpClientConfiguration;
    }
}
