package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class Query implements Serializable {
    public static final Unit KILOMETERS = Unit.km;
    public static final Unit MILES = Unit.mi;
    public static final ResultType MIXED = ResultType.mixed;
    public static final ResultType POPULAR = ResultType.popular;
    public static final ResultType RECENT = ResultType.recent;
    private static final HttpParameter WITH_TWITTER_USER_ID = new HttpParameter("with_twitter_user_id", "true");
    private static final long serialVersionUID = 7196404519192910019L;
    private int count;
    private String geocode;
    private String lang;
    private String locale;
    private long maxId;
    private String nextPageQuery;
    private String query;
    private ResultType resultType;
    private String since;
    private long sinceId;
    private String until;

    public enum ResultType {
        popular,
        mixed,
        recent
    }

    public enum Unit {
        mi,
        km
    }

    public Query() {
        this.query = null;
        this.lang = null;
        this.locale = null;
        this.maxId = -1;
        this.count = -1;
        this.since = null;
        this.sinceId = -1;
        this.geocode = null;
        this.until = null;
        this.resultType = null;
        this.nextPageQuery = null;
    }

    private void appendParameter(String str, String str2, List<HttpParameter> list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    static Query createWithNextPageQuery(String str) {
        Unit unit;
        String str2 = str;
        Query query2 = new Query();
        query2.nextPageQuery = str2;
        if (str2 != null) {
            String substring = str2.substring(1, str.length());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (HttpParameter next : HttpParameter.decodeParameters(substring)) {
                linkedHashMap.put(next.getName(), next.getValue());
            }
            if (linkedHashMap.containsKey("q")) {
                query2.setQuery((String) linkedHashMap.get("q"));
            }
            if (linkedHashMap.containsKey("lang")) {
                query2.setLang((String) linkedHashMap.get("lang"));
            }
            if (linkedHashMap.containsKey("locale")) {
                query2.setLocale((String) linkedHashMap.get("locale"));
            }
            if (linkedHashMap.containsKey("max_id")) {
                query2.setMaxId(Long.parseLong((String) linkedHashMap.get("max_id")));
            }
            if (linkedHashMap.containsKey("count")) {
                query2.setCount(Integer.parseInt((String) linkedHashMap.get("count")));
            }
            if (linkedHashMap.containsKey("geocode")) {
                String[] split = ((String) linkedHashMap.get("geocode")).split(",");
                double parseDouble = Double.parseDouble(split[0]);
                double parseDouble2 = Double.parseDouble(split[1]);
                double d = 0.0d;
                String str3 = split[2];
                Unit[] values = Unit.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        unit = null;
                        break;
                    }
                    Unit unit2 = values[i];
                    if (str3.endsWith(unit2.name())) {
                        d = Double.parseDouble(str3.substring(0, str3.length() - 2));
                        unit = unit2;
                        break;
                    }
                    i++;
                }
                if (unit != null) {
                    query2.setGeoCode(new GeoLocation(parseDouble, parseDouble2), d, unit);
                } else {
                    throw new IllegalArgumentException("unrecognized geocode radius: " + str3);
                }
            }
            if (linkedHashMap.containsKey("result_type")) {
                query2.setResultType(ResultType.valueOf((String) linkedHashMap.get("result_type")));
            }
        }
        return query2;
    }

    /* access modifiers changed from: package-private */
    public HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList(12);
        appendParameter("q", this.query, (List<HttpParameter>) arrayList);
        appendParameter("lang", this.lang, (List<HttpParameter>) arrayList);
        appendParameter("locale", this.locale, (List<HttpParameter>) arrayList);
        appendParameter("max_id", this.maxId, (List<HttpParameter>) arrayList);
        appendParameter("count", (long) this.count, (List<HttpParameter>) arrayList);
        appendParameter("since", this.since, (List<HttpParameter>) arrayList);
        appendParameter("since_id", this.sinceId, (List<HttpParameter>) arrayList);
        appendParameter("geocode", this.geocode, (List<HttpParameter>) arrayList);
        appendParameter("until", this.until, (List<HttpParameter>) arrayList);
        ResultType resultType2 = this.resultType;
        if (resultType2 != null) {
            arrayList.add(new HttpParameter("result_type", resultType2.name()));
        }
        arrayList.add(WITH_TWITTER_USER_ID);
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    public Query count(int i) {
        setCount(i);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        Query query2 = (Query) obj;
        if (this.maxId != query2.maxId || this.count != query2.count || this.sinceId != query2.sinceId) {
            return false;
        }
        String str = this.geocode;
        if (str == null ? query2.geocode != null : !str.equals(query2.geocode)) {
            return false;
        }
        String str2 = this.lang;
        if (str2 == null ? query2.lang != null : !str2.equals(query2.lang)) {
            return false;
        }
        String str3 = this.locale;
        if (str3 == null ? query2.locale != null : !str3.equals(query2.locale)) {
            return false;
        }
        String str4 = this.nextPageQuery;
        if (str4 == null ? query2.nextPageQuery != null : !str4.equals(query2.nextPageQuery)) {
            return false;
        }
        String str5 = this.query;
        if (str5 == null ? query2.query != null : !str5.equals(query2.query)) {
            return false;
        }
        ResultType resultType2 = this.resultType;
        if (resultType2 == null ? query2.resultType != null : !resultType2.equals(query2.resultType)) {
            return false;
        }
        String str6 = this.since;
        if (str6 == null ? query2.since != null : !str6.equals(query2.since)) {
            return false;
        }
        String str7 = this.until;
        String str8 = query2.until;
        return str7 == null ? str8 == null : str7.equals(str8);
    }

    public Query geoCode(GeoLocation geoLocation, double d, String str) {
        setGeoCode(geoLocation, d, str);
        return this;
    }

    public int getCount() {
        return this.count;
    }

    public String getGeocode() {
        return this.geocode;
    }

    public String getLang() {
        return this.lang;
    }

    public String getLocale() {
        return this.locale;
    }

    public long getMaxId() {
        return this.maxId;
    }

    public String getQuery() {
        return this.query;
    }

    public ResultType getResultType() {
        return this.resultType;
    }

    public String getSince() {
        return this.since;
    }

    public long getSinceId() {
        return this.sinceId;
    }

    public String getUntil() {
        return this.until;
    }

    public int hashCode() {
        String str = this.query;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lang;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.locale;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.maxId;
        int i2 = (((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.count) * 31;
        String str4 = this.since;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long j2 = this.sinceId;
        int i3 = (((i2 + hashCode4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str5 = this.geocode;
        int hashCode5 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.until;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        ResultType resultType2 = this.resultType;
        int hashCode7 = (hashCode6 + (resultType2 != null ? resultType2.hashCode() : 0)) * 31;
        String str7 = this.nextPageQuery;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public Query lang(String str) {
        setLang(str);
        return this;
    }

    public Query locale(String str) {
        setLocale(str);
        return this;
    }

    public Query maxId(long j) {
        setMaxId(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    public String nextPage() {
        return this.nextPageQuery;
    }

    public Query query(String str) {
        setQuery(str);
        return this;
    }

    public Query resultType(ResultType resultType2) {
        setResultType(resultType2);
        return this;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setGeoCode(GeoLocation geoLocation, double d, Unit unit) {
        this.geocode = geoLocation.getLatitude() + "," + geoLocation.getLongitude() + "," + d + unit.name();
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setMaxId(long j) {
        this.maxId = j;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setResultType(ResultType resultType2) {
        this.resultType = resultType2;
    }

    public void setSince(String str) {
        this.since = str;
    }

    public void setSinceId(long j) {
        this.sinceId = j;
    }

    public void setUntil(String str) {
        this.until = str;
    }

    public Query since(String str) {
        setSince(str);
        return this;
    }

    public Query sinceId(long j) {
        setSinceId(j);
        return this;
    }

    public String toString() {
        return "Query{query='" + this.query + '\'' + ", lang='" + this.lang + '\'' + ", locale='" + this.locale + '\'' + ", maxId=" + this.maxId + ", count=" + this.count + ", since='" + this.since + '\'' + ", sinceId=" + this.sinceId + ", geocode='" + this.geocode + '\'' + ", until='" + this.until + '\'' + ", resultType='" + this.resultType + '\'' + ", nextPageQuery='" + this.nextPageQuery + '\'' + '}';
    }

    public Query until(String str) {
        setUntil(str);
        return this;
    }

    private void appendParameter(String str, long j, List<HttpParameter> list) {
        if (0 <= j) {
            list.add(new HttpParameter(str, String.valueOf(j)));
        }
    }

    public void setGeoCode(GeoLocation geoLocation, double d, String str) {
        this.geocode = geoLocation.getLatitude() + "," + geoLocation.getLongitude() + "," + d + str;
    }

    public Query(String str) {
        this.lang = null;
        this.locale = null;
        this.maxId = -1;
        this.count = -1;
        this.since = null;
        this.sinceId = -1;
        this.geocode = null;
        this.until = null;
        this.resultType = null;
        this.nextPageQuery = null;
        this.query = str;
    }
}
