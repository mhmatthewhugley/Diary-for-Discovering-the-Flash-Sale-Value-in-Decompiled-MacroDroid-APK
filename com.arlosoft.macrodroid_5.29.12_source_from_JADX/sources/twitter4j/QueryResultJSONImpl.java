package twitter4j;

import java.util.ArrayList;
import java.util.List;
import twitter4j.conf.Configuration;

final class QueryResultJSONImpl extends TwitterResponseImpl implements QueryResult {
    private static final long serialVersionUID = -5359566235429947156L;
    private double completedIn;
    private int count;
    private long maxId;
    private String nextResults;
    private String query;
    private String refreshUrl;
    private long sinceId;
    private List<Status> tweets;

    QueryResultJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        super(httpResponse);
        JSONObject asJSONObject = httpResponse.asJSONObject();
        try {
            JSONObject jSONObject = asJSONObject.getJSONObject("search_metadata");
            this.completedIn = ParseUtil.getDouble("completed_in", jSONObject);
            this.count = ParseUtil.getInt("count", jSONObject);
            this.maxId = ParseUtil.getLong("max_id", jSONObject);
            this.nextResults = jSONObject.has("next_results") ? jSONObject.getString("next_results") : null;
            this.query = ParseUtil.getURLDecodedString("query", jSONObject);
            this.refreshUrl = ParseUtil.getUnescapedString("refresh_url", jSONObject);
            this.sinceId = ParseUtil.getLong("since_id", jSONObject);
            JSONArray jSONArray = asJSONObject.getJSONArray("statuses");
            this.tweets = new ArrayList(jSONArray.length());
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                this.tweets.add(new StatusJSONImpl(jSONArray.getJSONObject(i), configuration));
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + asJSONObject.toString(), (Throwable) e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryResultJSONImpl.class != obj.getClass()) {
            return false;
        }
        QueryResult queryResult = (QueryResult) obj;
        if (Double.compare(queryResult.getCompletedIn(), this.completedIn) != 0 || this.maxId != queryResult.getMaxId() || this.count != queryResult.getCount() || this.sinceId != queryResult.getSinceId() || !this.query.equals(queryResult.getQuery())) {
            return false;
        }
        String str = this.refreshUrl;
        if (str == null ? queryResult.getRefreshURL() != null : !str.equals(queryResult.getRefreshURL())) {
            return false;
        }
        List<Status> list = this.tweets;
        List<Status> tweets2 = queryResult.getTweets();
        return list == null ? tweets2 == null : list.equals(tweets2);
    }

    public double getCompletedIn() {
        return this.completedIn;
    }

    public int getCount() {
        return this.count;
    }

    public long getMaxId() {
        return this.maxId;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRefreshURL() {
        return this.refreshUrl;
    }

    public long getSinceId() {
        return this.sinceId;
    }

    public List<Status> getTweets() {
        return this.tweets;
    }

    public boolean hasNext() {
        return this.nextResults != null;
    }

    public int hashCode() {
        long j = this.sinceId;
        long j2 = this.maxId;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.refreshUrl;
        int i2 = 0;
        int hashCode = ((i + (str != null ? str.hashCode() : 0)) * 31) + this.count;
        double d = this.completedIn;
        long doubleToLongBits = d != 0.0d ? Double.doubleToLongBits(d) : 0;
        int hashCode2 = ((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.query.hashCode()) * 31;
        List<Status> list = this.tweets;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public Query nextQuery() {
        String str = this.nextResults;
        if (str == null) {
            return null;
        }
        return Query.createWithNextPageQuery(str);
    }

    public String toString() {
        return "QueryResultJSONImpl{sinceId=" + this.sinceId + ", maxId=" + this.maxId + ", refreshUrl='" + this.refreshUrl + '\'' + ", count=" + this.count + ", completedIn=" + this.completedIn + ", query='" + this.query + '\'' + ", tweets=" + this.tweets + '}';
    }

    QueryResultJSONImpl(Query query2) {
        this.sinceId = query2.getSinceId();
        this.count = query2.getCount();
        this.tweets = new ArrayList(0);
    }
}
