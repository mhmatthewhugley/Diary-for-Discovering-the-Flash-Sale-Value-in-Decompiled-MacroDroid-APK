package org.apache.http.protocol;

import androidx.webkit.ProxyConfig;
import java.util.HashMap;
import java.util.Map;

public class UriPatternMatcher {
    private final Map map = new HashMap();

    public Object lookup(String str) {
        if (str != null) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            Object obj = this.map.get(str);
            if (obj == null) {
                String str2 = null;
                for (String str3 : this.map.keySet()) {
                    if (matchUriRequestPattern(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith(ProxyConfig.MATCH_ALL_SCHEMES)))) {
                        obj = this.map.get(str3);
                        str2 = str3;
                    }
                }
            }
            return obj;
        }
        throw new IllegalArgumentException("Request URI may not be null");
    }

    /* access modifiers changed from: protected */
    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (str.endsWith(ProxyConfig.MATCH_ALL_SCHEMES) && str2.startsWith(str.substring(0, str.length() - 1))) {
            return true;
        }
        if (!str.startsWith(ProxyConfig.MATCH_ALL_SCHEMES) || !str2.endsWith(str.substring(1, str.length()))) {
            return false;
        }
        return true;
    }

    public void register(String str, Object obj) {
        if (str != null) {
            this.map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("URI request pattern may not be null");
    }

    public void setHandlers(Map map2) {
        if (map2 != null) {
            this.map.clear();
            this.map.putAll(map2);
            return;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
    }

    public void unregister(String str) {
        if (str != null) {
            this.map.remove(str);
        }
    }
}
