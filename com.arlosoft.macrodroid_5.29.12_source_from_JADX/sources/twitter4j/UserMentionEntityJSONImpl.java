package twitter4j;

class UserMentionEntityJSONImpl extends EntityIndex implements UserMentionEntity {
    private static final long serialVersionUID = 6060510953676673013L;

    /* renamed from: id */
    private long f69265id;
    private String name;
    private String screenName;

    UserMentionEntityJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("indices");
            setStart(jSONArray.getInt(0));
            setEnd(jSONArray.getInt(1));
            if (!jSONObject.isNull("name")) {
                this.name = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("screen_name")) {
                this.screenName = jSONObject.getString("screen_name");
            }
            this.f69265id = ParseUtil.getLong("id", jSONObject);
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserMentionEntityJSONImpl userMentionEntityJSONImpl = (UserMentionEntityJSONImpl) obj;
        if (this.f69265id != userMentionEntityJSONImpl.f69265id) {
            return false;
        }
        String str = this.name;
        if (str == null ? userMentionEntityJSONImpl.name != null : !str.equals(userMentionEntityJSONImpl.name)) {
            return false;
        }
        String str2 = this.screenName;
        String str3 = userMentionEntityJSONImpl.screenName;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int getEnd() {
        return super.getEnd();
    }

    public long getId() {
        return this.f69265id;
    }

    public String getName() {
        return this.name;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public int getStart() {
        return super.getStart();
    }

    public String getText() {
        return this.screenName;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.screenName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f69265id;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "UserMentionEntityJSONImpl{name='" + this.name + '\'' + ", screenName='" + this.screenName + '\'' + ", id=" + this.f69265id + '}';
    }

    UserMentionEntityJSONImpl(int i, int i2, String str, String str2, long j) {
        setStart(i);
        setEnd(i2);
        this.name = str;
        this.screenName = str2;
        this.f69265id = j;
    }

    UserMentionEntityJSONImpl() {
    }
}
