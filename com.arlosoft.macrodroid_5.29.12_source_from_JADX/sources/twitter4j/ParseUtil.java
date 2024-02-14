package twitter4j;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;

final class ParseUtil {
    private static final Map<String, LinkedBlockingQueue<SimpleDateFormat>> formatMapQueue = new HashMap();

    private ParseUtil() {
        throw new AssertionError();
    }

    public static boolean getBoolean(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString == null || "null".equals(rawString)) {
            return false;
        }
        return Boolean.valueOf(rawString).booleanValue();
    }

    public static Date getDate(String str, JSONObject jSONObject) throws TwitterException {
        return getDate(str, jSONObject, "EEE MMM d HH:mm:ss z yyyy");
    }

    public static double getDouble(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString == null || "".equals(rawString) || "null".equals(rawString)) {
            return -1.0d;
        }
        return Double.valueOf(rawString).doubleValue();
    }

    public static int getInt(String str, JSONObject jSONObject) {
        return getInt(getRawString(str, jSONObject));
    }

    public static long getLong(String str, JSONObject jSONObject) {
        return getLong(getRawString(str, jSONObject));
    }

    public static String getRawString(String str, JSONObject jSONObject) {
        try {
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    static String getURLDecodedString(String str, JSONObject jSONObject) {
        String rawString = getRawString(str, jSONObject);
        if (rawString == null) {
            return rawString;
        }
        try {
            return URLDecoder.decode(rawString, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return rawString;
        }
    }

    static String getUnescapedString(String str, JSONObject jSONObject) {
        return HTMLEntity.unescape(getRawString(str, jSONObject));
    }

    public static Date parseTrendsDate(String str) throws TwitterException {
        int length = str.length();
        if (length == 10) {
            return new Date(Long.parseLong(str) * 1000);
        }
        if (length != 20) {
            return getDate(str, "EEE, d MMM yyyy HH:mm:ss z");
        }
        return getDate(str, "yyyy-MM-dd'T'HH:mm:ss'Z'");
    }

    public static int toAccessLevel(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return -1;
        }
        String responseHeader = httpResponse.getResponseHeader("X-Access-Level");
        if (responseHeader != null) {
            int length = responseHeader.length();
            if (length == 4) {
                return 1;
            }
            if (length == 10) {
                return 2;
            }
            if (length == 25 || length == 26) {
                return 3;
            }
        }
        return 0;
    }

    public static Date getDate(String str, JSONObject jSONObject, String str2) throws TwitterException {
        String unescapedString = getUnescapedString(str, jSONObject);
        if ("null".equals(unescapedString) || unescapedString == null) {
            return null;
        }
        return getDate(unescapedString, str2);
    }

    public static int getInt(String str) {
        if (str != null && !"".equals(str) && !"null".equals(str)) {
            try {
                return Integer.valueOf(str).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static long getLong(String str) {
        if (str == null || "".equals(str) || "null".equals(str)) {
            return -1;
        }
        if (str.endsWith("+")) {
            return Long.valueOf(str.substring(0, str.length() - 1)).longValue() + 1;
        }
        return Long.valueOf(str).longValue();
    }

    public static Date getDate(String str, String str2) throws TwitterException {
        Map<String, LinkedBlockingQueue<SimpleDateFormat>> map = formatMapQueue;
        LinkedBlockingQueue linkedBlockingQueue = map.get(str2);
        if (linkedBlockingQueue == null) {
            linkedBlockingQueue = new LinkedBlockingQueue();
            map.put(str2, linkedBlockingQueue);
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) linkedBlockingQueue.poll();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        try {
            Date parse = simpleDateFormat.parse(str);
            try {
                linkedBlockingQueue.put(simpleDateFormat);
            } catch (InterruptedException unused) {
            }
            return parse;
        } catch (ParseException e) {
            throw new TwitterException("Unexpected date format(" + str + ") returned from twitter.com", (Throwable) e);
        } catch (Throwable th) {
            try {
                linkedBlockingQueue.put(simpleDateFormat);
            } catch (InterruptedException unused2) {
            }
            throw th;
        }
    }
}
