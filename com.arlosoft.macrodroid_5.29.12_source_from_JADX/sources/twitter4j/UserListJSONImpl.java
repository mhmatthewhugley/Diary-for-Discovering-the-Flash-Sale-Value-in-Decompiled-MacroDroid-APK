package twitter4j;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import twitter4j.conf.Configuration;

class UserListJSONImpl extends TwitterResponseImpl implements UserList {
    private static final long serialVersionUID = 449418980060197008L;
    private Date createdAt;
    private String description;
    private boolean following;
    private String fullName;

    /* renamed from: id */
    private long f69264id;
    private int memberCount;
    private boolean mode;
    private String name;
    private String slug;
    private int subscriberCount;
    private String uri;
    private User user;

    UserListJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        super(httpResponse);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        JSONObject asJSONObject = httpResponse.asJSONObject();
        init(asJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.registerJSONObject(this, asJSONObject);
        }
    }

    static PagableResponseList<UserList> createPagableUserListList(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONObject asJSONObject = httpResponse.asJSONObject();
            JSONArray jSONArray = asJSONObject.getJSONArray("lists");
            int length = jSONArray.length();
            PagableResponseListImpl pagableResponseListImpl = new PagableResponseListImpl(length, asJSONObject, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                UserListJSONImpl userListJSONImpl = new UserListJSONImpl(jSONObject);
                pagableResponseListImpl.add(userListJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userListJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(pagableResponseListImpl, asJSONObject);
            }
            return pagableResponseListImpl;
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    static ResponseList<UserList> createUserListList(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray asJSONArray = httpResponse.asJSONArray();
            int length = asJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = asJSONArray.getJSONObject(i);
                UserListJSONImpl userListJSONImpl = new UserListJSONImpl(jSONObject);
                responseListImpl.add(userListJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userListJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, asJSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        this.f69264id = ParseUtil.getLong("id", jSONObject);
        this.name = ParseUtil.getRawString("name", jSONObject);
        this.fullName = ParseUtil.getRawString("full_name", jSONObject);
        this.slug = ParseUtil.getRawString("slug", jSONObject);
        this.description = ParseUtil.getRawString("description", jSONObject);
        this.subscriberCount = ParseUtil.getInt("subscriber_count", jSONObject);
        this.memberCount = ParseUtil.getInt("member_count", jSONObject);
        this.uri = ParseUtil.getRawString("uri", jSONObject);
        this.mode = "public".equals(ParseUtil.getRawString("mode", jSONObject));
        this.following = ParseUtil.getBoolean("following", jSONObject);
        this.createdAt = ParseUtil.getDate("created_at", jSONObject);
        try {
            if (!jSONObject.isNull("user")) {
                this.user = new UserJSONImpl(jSONObject.getJSONObject("user"));
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObject.toString(), (Throwable) e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserList) && ((UserList) obj).getId() == this.f69264id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFullName() {
        return this.fullName;
    }

    public long getId() {
        return this.f69264id;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public String getName() {
        return this.name;
    }

    public String getSlug() {
        return this.slug;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public URI getURI() {
        try {
            return new URI(this.uri);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        return (int) this.f69264id;
    }

    public boolean isFollowing() {
        return this.following;
    }

    public boolean isPublic() {
        return this.mode;
    }

    public String toString() {
        return "UserListJSONImpl{id=" + this.f69264id + ", name='" + this.name + '\'' + ", fullName='" + this.fullName + '\'' + ", slug='" + this.slug + '\'' + ", description='" + this.description + '\'' + ", subscriberCount=" + this.subscriberCount + ", memberCount=" + this.memberCount + ", uri='" + this.uri + '\'' + ", mode=" + this.mode + ", user=" + this.user + ", following=" + this.following + '}';
    }

    public int compareTo(UserList userList) {
        long id = this.f69264id - userList.getId();
        if (id < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (id > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) id;
    }

    UserListJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }
}
