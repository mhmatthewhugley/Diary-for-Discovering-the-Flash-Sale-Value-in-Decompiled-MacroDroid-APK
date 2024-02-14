package twitter4j;

import twitter4j.TwitterResponse;

class PagableResponseListImpl<T extends TwitterResponse> extends ResponseListImpl<T> implements PagableResponseList<T> {
    private static final long serialVersionUID = -8603601553967559275L;
    private final long nextCursor;
    private final long previousCursor;

    PagableResponseListImpl(RateLimitStatus rateLimitStatus, int i) {
        super(rateLimitStatus, i);
        this.previousCursor = 0;
        this.nextCursor = 0;
    }

    public long getNextCursor() {
        return this.nextCursor;
    }

    public long getPreviousCursor() {
        return this.previousCursor;
    }

    public boolean hasNext() {
        return 0 != this.nextCursor;
    }

    public boolean hasPrevious() {
        return 0 != this.previousCursor;
    }

    PagableResponseListImpl(int i, JSONObject jSONObject, HttpResponse httpResponse) {
        super(i, httpResponse);
        this.previousCursor = ParseUtil.getLong("previous_cursor", jSONObject);
        this.nextCursor = ParseUtil.getLong("next_cursor", jSONObject);
    }
}
