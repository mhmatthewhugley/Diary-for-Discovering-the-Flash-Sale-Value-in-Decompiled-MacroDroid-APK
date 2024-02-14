package twitter4j;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

public final class TwitterObjectFactory {
    private static final ThreadLocal<Map> rawJsonMap = new ThreadLocal<Map>() {
        /* access modifiers changed from: protected */
        public Map initialValue() {
            return new HashMap();
        }
    };
    private static boolean registeredAtleastOnce = false;

    /* renamed from: twitter4j.TwitterObjectFactory$2 */
    static /* synthetic */ class C174692 {
        static final /* synthetic */ int[] $SwitchMap$twitter4j$JSONObjectType$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                twitter4j.JSONObjectType$Type[] r0 = twitter4j.JSONObjectType.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$twitter4j$JSONObjectType$Type = r0
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.SENDER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$twitter4j$JSONObjectType$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.STATUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$twitter4j$JSONObjectType$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.DIRECT_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$twitter4j$JSONObjectType$Type     // Catch:{ NoSuchFieldError -> 0x0033 }
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.DELETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$twitter4j$JSONObjectType$Type     // Catch:{ NoSuchFieldError -> 0x003e }
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.LIMIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$twitter4j$JSONObjectType$Type     // Catch:{ NoSuchFieldError -> 0x0049 }
                twitter4j.JSONObjectType$Type r1 = twitter4j.JSONObjectType.Type.SCRUB_GEO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: twitter4j.TwitterObjectFactory.C174692.<clinit>():void");
        }
    }

    private TwitterObjectFactory() {
        throw new AssertionError("not intended to be instantiated.");
    }

    static void clearThreadLocalMap() {
        rawJsonMap.get().clear();
    }

    public static AccountTotals createAccountTotals(String str) throws TwitterException {
        try {
            return new AccountTotalsJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Category createCategory(String str) throws TwitterException {
        try {
            return new CategoryJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static DirectMessage createDirectMessage(String str) throws TwitterException {
        try {
            return new DirectMessageJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static IDs createIDs(String str) throws TwitterException {
        return new IDsJSONImpl(str);
    }

    public static Location createLocation(String str) throws TwitterException {
        try {
            return new LocationJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static OEmbed createOEmbed(String str) throws TwitterException {
        try {
            return new OEmbedJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Object createObject(String str) throws TwitterException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = C174692.$SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.determine(jSONObject).ordinal()];
            if (i == 1) {
                return registerJSONObject(new DirectMessageJSONImpl(jSONObject.getJSONObject("direct_message")), jSONObject);
            }
            if (i == 2) {
                return registerJSONObject(new StatusJSONImpl(jSONObject), jSONObject);
            }
            if (i == 3) {
                return registerJSONObject(new DirectMessageJSONImpl(jSONObject.getJSONObject("direct_message")), jSONObject);
            }
            if (i != 4) {
                return jSONObject;
            }
            return registerJSONObject(new StatusDeletionNoticeImpl(jSONObject.getJSONObject("delete").getJSONObject(NotificationCompat.CATEGORY_STATUS)), jSONObject);
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Place createPlace(String str) throws TwitterException {
        try {
            return new PlaceJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Map<String, RateLimitStatus> createRateLimitStatus(String str) throws TwitterException {
        try {
            return RateLimitStatusJSONImpl.createRateLimitStatuses(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Relationship createRelationship(String str) throws TwitterException {
        try {
            return new RelationshipJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static SavedSearch createSavedSearch(String str) throws TwitterException {
        try {
            return new SavedSearchJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Status createStatus(String str) throws TwitterException {
        try {
            return new StatusJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Trend createTrend(String str) throws TwitterException {
        try {
            return new TrendJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static Trends createTrends(String str) throws TwitterException {
        return new TrendsJSONImpl(str);
    }

    public static User createUser(String str) throws TwitterException {
        try {
            return new UserJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static UserList createUserList(String str) throws TwitterException {
        try {
            return new UserListJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public static String getRawJSON(Object obj) {
        if (registeredAtleastOnce) {
            Object obj2 = rawJsonMap.get().get(obj);
            if (obj2 instanceof String) {
                return (String) obj2;
            }
            if (obj2 != null) {
                return obj2.toString();
            }
            return null;
        }
        throw new IllegalStateException("Apparently jsonStoreEnabled is not set to true.");
    }

    static <T> T registerJSONObject(T t, Object obj) {
        registeredAtleastOnce = true;
        rawJsonMap.get().put(t, obj);
        return t;
    }
}
