package twitter4j;

import java.util.Arrays;
import java.util.Date;
import twitter4j.conf.Configuration;

final class StatusJSONImpl extends TwitterResponseImpl implements Status {
    private static final Logger logger = Logger.getLogger(StatusJSONImpl.class);
    private static final long serialVersionUID = -6461195536943679985L;
    private long[] contributorsIDs;
    private Date createdAt;
    private long currentUserRetweetId = -1;
    private ExtendedMediaEntity[] extendedMediaEntities;
    private int favoriteCount;
    private GeoLocation geoLocation = null;
    private HashtagEntity[] hashtagEntities;

    /* renamed from: id */
    private long f69261id;
    private String inReplyToScreenName;
    private long inReplyToStatusId;
    private long inReplyToUserId;
    private boolean isFavorited;
    private boolean isPossiblySensitive;
    private boolean isRetweeted;
    private boolean isTruncated;
    private String lang;
    private MediaEntity[] mediaEntities;
    private Place place = null;
    private Status quotedStatus;
    private long quotedStatusId = -1;
    private long retweetCount;
    private Status retweetedStatus;
    private Scopes scopes;
    private String source;
    private SymbolEntity[] symbolEntities;
    private String text;
    private URLEntity[] urlEntities;
    private User user = null;
    private UserMentionEntity[] userMentionEntities;
    private String[] withheldInCountries = null;

    StatusJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        super(httpResponse);
        JSONObject asJSONObject = httpResponse.asJSONObject();
        init(asJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, asJSONObject);
        }
    }

    static ResponseList<Status> createStatusList(HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray asJSONArray = httpResponse.asJSONArray();
            int length = asJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = asJSONArray.getJSONObject(i);
                StatusJSONImpl statusJSONImpl = new StatusJSONImpl(jSONObject);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(statusJSONImpl, jSONObject);
                }
                responseListImpl.add(statusJSONImpl);
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
        JSONObject jSONObject2 = jSONObject;
        String str = "withheld_in_countries";
        String str2 = "place_ids";
        String str3 = "scopes";
        String str4 = "lang";
        String str5 = "current_user_retweet";
        String str6 = "symbols";
        this.f69261id = ParseUtil.getLong("id", jSONObject2);
        this.source = ParseUtil.getUnescapedString("source", jSONObject2);
        this.createdAt = ParseUtil.getDate("created_at", jSONObject2);
        this.isTruncated = ParseUtil.getBoolean("truncated", jSONObject2);
        this.inReplyToStatusId = ParseUtil.getLong("in_reply_to_status_id", jSONObject2);
        this.inReplyToUserId = ParseUtil.getLong("in_reply_to_user_id", jSONObject2);
        this.isFavorited = ParseUtil.getBoolean("favorited", jSONObject2);
        this.isRetweeted = ParseUtil.getBoolean("retweeted", jSONObject2);
        this.inReplyToScreenName = ParseUtil.getUnescapedString("in_reply_to_screen_name", jSONObject2);
        this.retweetCount = ParseUtil.getLong("retweet_count", jSONObject2);
        this.favoriteCount = ParseUtil.getInt("favorite_count", jSONObject2);
        this.isPossiblySensitive = ParseUtil.getBoolean("possibly_sensitive", jSONObject2);
        try {
            if (!jSONObject2.isNull("user")) {
                this.user = new UserJSONImpl(jSONObject2.getJSONObject("user"));
            }
            this.geoLocation = JSONImplFactory.createGeoLocation(jSONObject);
            if (!jSONObject2.isNull("place")) {
                this.place = new PlaceJSONImpl(jSONObject2.getJSONObject("place"));
            }
            if (!jSONObject2.isNull("retweeted_status")) {
                this.retweetedStatus = new StatusJSONImpl(jSONObject2.getJSONObject("retweeted_status"));
            }
            if (!jSONObject2.isNull("contributors")) {
                JSONArray jSONArray = jSONObject2.getJSONArray("contributors");
                this.contributorsIDs = new long[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.contributorsIDs[i] = Long.parseLong(jSONArray.getString(i));
                }
            } else {
                this.contributorsIDs = new long[0];
            }
            if (!jSONObject2.isNull("entities")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("entities");
                if (!jSONObject3.isNull("user_mentions")) {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("user_mentions");
                    int length = jSONArray2.length();
                    this.userMentionEntities = new UserMentionEntity[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        this.userMentionEntities[i2] = new UserMentionEntityJSONImpl(jSONArray2.getJSONObject(i2));
                    }
                }
                if (!jSONObject3.isNull("urls")) {
                    JSONArray jSONArray3 = jSONObject3.getJSONArray("urls");
                    int length2 = jSONArray3.length();
                    this.urlEntities = new URLEntity[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        this.urlEntities[i3] = new URLEntityJSONImpl(jSONArray3.getJSONObject(i3));
                    }
                }
                if (!jSONObject3.isNull("hashtags")) {
                    JSONArray jSONArray4 = jSONObject3.getJSONArray("hashtags");
                    int length3 = jSONArray4.length();
                    this.hashtagEntities = new HashtagEntity[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        this.hashtagEntities[i4] = new HashtagEntityJSONImpl(jSONArray4.getJSONObject(i4));
                    }
                }
                String str7 = str6;
                if (!jSONObject3.isNull(str7)) {
                    JSONArray jSONArray5 = jSONObject3.getJSONArray(str7);
                    int length4 = jSONArray5.length();
                    this.symbolEntities = new SymbolEntity[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        this.symbolEntities[i5] = new HashtagEntityJSONImpl(jSONArray5.getJSONObject(i5));
                    }
                }
                if (!jSONObject3.isNull("media")) {
                    JSONArray jSONArray6 = jSONObject3.getJSONArray("media");
                    int length5 = jSONArray6.length();
                    this.mediaEntities = new MediaEntity[length5];
                    for (int i6 = 0; i6 < length5; i6++) {
                        this.mediaEntities[i6] = new MediaEntityJSONImpl(jSONArray6.getJSONObject(i6));
                    }
                }
            }
            if (!jSONObject2.isNull("extended_entities")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("extended_entities");
                if (!jSONObject4.isNull("media")) {
                    JSONArray jSONArray7 = jSONObject4.getJSONArray("media");
                    int length6 = jSONArray7.length();
                    this.extendedMediaEntities = new ExtendedMediaEntity[length6];
                    for (int i7 = 0; i7 < length6; i7++) {
                        this.extendedMediaEntities[i7] = new ExtendedMediaEntityJSONImpl(jSONArray7.getJSONObject(i7));
                    }
                }
            }
            if (!jSONObject2.isNull("quoted_status")) {
                this.quotedStatus = new StatusJSONImpl(jSONObject2.getJSONObject("quoted_status"));
            }
            if (!jSONObject2.isNull("quoted_status_id")) {
                this.quotedStatusId = ParseUtil.getLong("quoted_status_id", jSONObject2);
            }
            if (!jSONObject2.isNull("quoted_status")) {
                this.quotedStatus = new StatusJSONImpl(jSONObject2.getJSONObject("quoted_status"));
            }
            if (!jSONObject2.isNull("quoted_status_id")) {
                this.quotedStatusId = ParseUtil.getLong("quoted_status_id", jSONObject2);
            }
            UserMentionEntity[] userMentionEntityArr = this.userMentionEntities;
            if (userMentionEntityArr == null) {
                userMentionEntityArr = new UserMentionEntity[0];
            }
            this.userMentionEntities = userMentionEntityArr;
            URLEntity[] uRLEntityArr = this.urlEntities;
            if (uRLEntityArr == null) {
                uRLEntityArr = new URLEntity[0];
            }
            this.urlEntities = uRLEntityArr;
            HashtagEntity[] hashtagEntityArr = this.hashtagEntities;
            if (hashtagEntityArr == null) {
                hashtagEntityArr = new HashtagEntity[0];
            }
            this.hashtagEntities = hashtagEntityArr;
            SymbolEntity[] symbolEntityArr = this.symbolEntities;
            if (symbolEntityArr == null) {
                symbolEntityArr = new SymbolEntity[0];
            }
            this.symbolEntities = symbolEntityArr;
            MediaEntity[] mediaEntityArr = this.mediaEntities;
            if (mediaEntityArr == null) {
                mediaEntityArr = new MediaEntity[0];
            }
            this.mediaEntities = mediaEntityArr;
            ExtendedMediaEntity[] extendedMediaEntityArr = this.extendedMediaEntities;
            if (extendedMediaEntityArr == null) {
                extendedMediaEntityArr = new ExtendedMediaEntity[0];
            }
            this.extendedMediaEntities = extendedMediaEntityArr;
            this.text = HTMLEntity.unescapeAndSlideEntityIncdices(jSONObject2.getString("text"), this.userMentionEntities, this.urlEntities, this.hashtagEntities, this.mediaEntities);
            String str8 = str5;
            if (!jSONObject2.isNull(str8)) {
                this.currentUserRetweetId = jSONObject2.getJSONObject(str8).getLong("id");
            }
            String str9 = str4;
            if (!jSONObject2.isNull(str9)) {
                this.lang = ParseUtil.getUnescapedString(str9, jSONObject2);
            }
            String str10 = str3;
            if (!jSONObject2.isNull(str10)) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject(str10);
                String str11 = str2;
                if (!jSONObject5.isNull(str11)) {
                    JSONArray jSONArray8 = jSONObject5.getJSONArray(str11);
                    int length7 = jSONArray8.length();
                    String[] strArr = new String[length7];
                    for (int i8 = 0; i8 < length7; i8++) {
                        strArr[i8] = jSONArray8.getString(i8);
                    }
                    this.scopes = new ScopesImpl(strArr);
                }
            }
            String str12 = str;
            if (!jSONObject2.isNull(str12)) {
                JSONArray jSONArray9 = jSONObject2.getJSONArray(str12);
                int length8 = jSONArray9.length();
                this.withheldInCountries = new String[length8];
                for (int i9 = 0; i9 < length8; i9++) {
                    this.withheldInCountries[i9] = jSONArray9.getString(i9);
                }
            }
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof Status) && ((Status) obj).getId() == this.f69261id;
    }

    public long[] getContributors() {
        return this.contributorsIDs;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public long getCurrentUserRetweetId() {
        return this.currentUserRetweetId;
    }

    public ExtendedMediaEntity[] getExtendedMediaEntities() {
        return this.extendedMediaEntities;
    }

    public int getFavoriteCount() {
        return this.favoriteCount;
    }

    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    public HashtagEntity[] getHashtagEntities() {
        return this.hashtagEntities;
    }

    public long getId() {
        return this.f69261id;
    }

    public String getInReplyToScreenName() {
        return this.inReplyToScreenName;
    }

    public long getInReplyToStatusId() {
        return this.inReplyToStatusId;
    }

    public long getInReplyToUserId() {
        return this.inReplyToUserId;
    }

    public String getLang() {
        return this.lang;
    }

    public MediaEntity[] getMediaEntities() {
        return this.mediaEntities;
    }

    public Place getPlace() {
        return this.place;
    }

    public Status getQuotedStatus() {
        return this.quotedStatus;
    }

    public long getQuotedStatusId() {
        return this.quotedStatusId;
    }

    public int getRetweetCount() {
        return (int) this.retweetCount;
    }

    public Status getRetweetedStatus() {
        return this.retweetedStatus;
    }

    public Scopes getScopes() {
        return this.scopes;
    }

    public String getSource() {
        return this.source;
    }

    public SymbolEntity[] getSymbolEntities() {
        return this.symbolEntities;
    }

    public String getText() {
        return this.text;
    }

    public URLEntity[] getURLEntities() {
        return this.urlEntities;
    }

    public User getUser() {
        return this.user;
    }

    public UserMentionEntity[] getUserMentionEntities() {
        return this.userMentionEntities;
    }

    public String[] getWithheldInCountries() {
        return this.withheldInCountries;
    }

    public int hashCode() {
        return (int) this.f69261id;
    }

    public boolean isFavorited() {
        return this.isFavorited;
    }

    public boolean isPossiblySensitive() {
        return this.isPossiblySensitive;
    }

    public boolean isRetweet() {
        return this.retweetedStatus != null;
    }

    public boolean isRetweeted() {
        return this.isRetweeted;
    }

    public boolean isRetweetedByMe() {
        return this.currentUserRetweetId != -1;
    }

    public boolean isTruncated() {
        return this.isTruncated;
    }

    public String toString() {
        return "StatusJSONImpl{createdAt=" + this.createdAt + ", id=" + this.f69261id + ", text='" + this.text + '\'' + ", source='" + this.source + '\'' + ", isTruncated=" + this.isTruncated + ", inReplyToStatusId=" + this.inReplyToStatusId + ", inReplyToUserId=" + this.inReplyToUserId + ", isFavorited=" + this.isFavorited + ", isRetweeted=" + this.isRetweeted + ", favoriteCount=" + this.favoriteCount + ", inReplyToScreenName='" + this.inReplyToScreenName + '\'' + ", geoLocation=" + this.geoLocation + ", place=" + this.place + ", retweetCount=" + this.retweetCount + ", isPossiblySensitive=" + this.isPossiblySensitive + ", lang='" + this.lang + '\'' + ", contributorsIDs=" + Arrays.toString(this.contributorsIDs) + ", retweetedStatus=" + this.retweetedStatus + ", userMentionEntities=" + Arrays.toString(this.userMentionEntities) + ", urlEntities=" + Arrays.toString(this.urlEntities) + ", hashtagEntities=" + Arrays.toString(this.hashtagEntities) + ", mediaEntities=" + Arrays.toString(this.mediaEntities) + ", symbolEntities=" + Arrays.toString(this.symbolEntities) + ", currentUserRetweetId=" + this.currentUserRetweetId + ", user=" + this.user + ", withHeldInCountries=" + Arrays.toString(this.withheldInCountries) + ", quotedStatusId=" + this.quotedStatusId + ", quotedStatus=" + this.quotedStatus + '}';
    }

    public int compareTo(Status status) {
        long id = this.f69261id - status.getId();
        if (id < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (id > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) id;
    }

    StatusJSONImpl(JSONObject jSONObject, Configuration configuration) throws TwitterException {
        init(jSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.registerJSONObject(this, jSONObject);
        }
    }

    StatusJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    StatusJSONImpl() {
    }
}
