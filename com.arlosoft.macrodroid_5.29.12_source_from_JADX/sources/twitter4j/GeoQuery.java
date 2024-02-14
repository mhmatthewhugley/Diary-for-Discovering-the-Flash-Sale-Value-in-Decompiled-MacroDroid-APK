package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class GeoQuery implements Serializable {
    private static final long serialVersionUID = 5434503339001056634L;
    private String accuracy;
    private String granularity;

    /* renamed from: ip */
    private String f69252ip;
    private GeoLocation location;
    private int maxResults;
    private String query;

    public GeoQuery(GeoLocation geoLocation) {
        this.query = null;
        this.f69252ip = null;
        this.accuracy = null;
        this.granularity = null;
        this.maxResults = -1;
        this.location = geoLocation;
    }

    private void appendParameter(String str, String str2, List<HttpParameter> list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    public GeoQuery accuracy(String str) {
        setAccuracy(str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList();
        GeoLocation geoLocation = this.location;
        if (geoLocation != null) {
            appendParameter("lat", geoLocation.getLatitude(), (List<HttpParameter>) arrayList);
            appendParameter("long", this.location.getLongitude(), (List<HttpParameter>) arrayList);
        }
        String str = this.f69252ip;
        if (str != null) {
            appendParameter("ip", str, (List<HttpParameter>) arrayList);
        }
        appendParameter("accuracy", this.accuracy, (List<HttpParameter>) arrayList);
        appendParameter("query", this.query, (List<HttpParameter>) arrayList);
        appendParameter("granularity", this.granularity, (List<HttpParameter>) arrayList);
        appendParameter("max_results", this.maxResults, (List<HttpParameter>) arrayList);
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeoQuery.class != obj.getClass()) {
            return false;
        }
        GeoQuery geoQuery = (GeoQuery) obj;
        if (this.maxResults != geoQuery.maxResults) {
            return false;
        }
        String str = this.accuracy;
        if (str == null ? geoQuery.accuracy != null : !str.equals(geoQuery.accuracy)) {
            return false;
        }
        String str2 = this.granularity;
        if (str2 == null ? geoQuery.granularity != null : !str2.equals(geoQuery.granularity)) {
            return false;
        }
        String str3 = this.f69252ip;
        if (str3 == null ? geoQuery.f69252ip != null : !str3.equals(geoQuery.f69252ip)) {
            return false;
        }
        GeoLocation geoLocation = this.location;
        GeoLocation geoLocation2 = geoQuery.location;
        return geoLocation == null ? geoLocation2 == null : geoLocation.equals(geoLocation2);
    }

    public String getAccuracy() {
        return this.accuracy;
    }

    public String getGranularity() {
        return this.granularity;
    }

    public String getIp() {
        return this.f69252ip;
    }

    public GeoLocation getLocation() {
        return this.location;
    }

    public int getMaxResults() {
        return this.maxResults;
    }

    public String getQuery() {
        return this.query;
    }

    public GeoQuery granularity(String str) {
        setGranularity(str);
        return this;
    }

    public int hashCode() {
        GeoLocation geoLocation = this.location;
        int i = 0;
        int hashCode = (geoLocation != null ? geoLocation.hashCode() : 0) * 31;
        String str = this.f69252ip;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.accuracy;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.granularity;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.maxResults;
    }

    public GeoQuery maxResults(int i) {
        setMaxResults(i);
        return this;
    }

    public void setAccuracy(String str) {
        this.accuracy = str;
    }

    public void setGranularity(String str) {
        this.granularity = str;
    }

    public void setMaxResults(int i) {
        this.maxResults = i;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public String toString() {
        return "GeoQuery{location=" + this.location + ", query='" + this.query + '\'' + ", ip='" + this.f69252ip + '\'' + ", accuracy='" + this.accuracy + '\'' + ", granularity='" + this.granularity + '\'' + ", maxResults=" + this.maxResults + '}';
    }

    private void appendParameter(String str, int i, List<HttpParameter> list) {
        if (i > 0) {
            list.add(new HttpParameter(str, String.valueOf(i)));
        }
    }

    private void appendParameter(String str, double d, List<HttpParameter> list) {
        list.add(new HttpParameter(str, String.valueOf(d)));
    }

    public GeoQuery(String str) {
        this.query = null;
        this.accuracy = null;
        this.granularity = null;
        this.maxResults = -1;
        this.f69252ip = str;
    }
}
