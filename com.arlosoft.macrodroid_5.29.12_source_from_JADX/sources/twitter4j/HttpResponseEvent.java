package twitter4j;

public final class HttpResponseEvent {
    private final HttpRequest request;
    private final HttpResponse response;
    private final TwitterException twitterException;

    HttpResponseEvent(HttpRequest httpRequest, HttpResponse httpResponse, TwitterException twitterException2) {
        this.request = httpRequest;
        this.response = httpResponse;
        this.twitterException = twitterException2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HttpResponseEvent.class != obj.getClass()) {
            return false;
        }
        HttpResponseEvent httpResponseEvent = (HttpResponseEvent) obj;
        HttpRequest httpRequest = this.request;
        if (httpRequest == null ? httpResponseEvent.request != null : !httpRequest.equals(httpResponseEvent.request)) {
            return false;
        }
        HttpResponse httpResponse = this.response;
        HttpResponse httpResponse2 = httpResponseEvent.response;
        return httpResponse == null ? httpResponse2 == null : httpResponse.equals(httpResponse2);
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public HttpResponse getResponse() {
        return this.response;
    }

    public TwitterException getTwitterException() {
        return this.twitterException;
    }

    public int hashCode() {
        HttpRequest httpRequest = this.request;
        int i = 0;
        int hashCode = (httpRequest != null ? httpRequest.hashCode() : 0) * 31;
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            i = httpResponse.hashCode();
        }
        return hashCode + i;
    }

    public boolean isAuthenticated() {
        return this.request.getAuthorization().isEnabled();
    }

    public String toString() {
        return "HttpResponseEvent{request=" + this.request + ", response=" + this.response + '}';
    }
}
