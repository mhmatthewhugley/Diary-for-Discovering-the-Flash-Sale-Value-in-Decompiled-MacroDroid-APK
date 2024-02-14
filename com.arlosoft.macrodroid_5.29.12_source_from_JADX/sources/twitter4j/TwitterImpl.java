package twitter4j;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import twitter4j.api.DirectMessagesResources;
import twitter4j.api.FavoritesResources;
import twitter4j.api.FriendsFollowersResources;
import twitter4j.api.HelpResources;
import twitter4j.api.ListsResources;
import twitter4j.api.PlacesGeoResources;
import twitter4j.api.SavedSearchesResources;
import twitter4j.api.SearchResource;
import twitter4j.api.SpamReportingResource;
import twitter4j.api.SuggestedUsersResources;
import twitter4j.api.TimelinesResources;
import twitter4j.api.TrendsResources;
import twitter4j.api.TweetsResources;
import twitter4j.api.UsersResources;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;

class TwitterImpl extends TwitterBaseImpl implements Twitter {
    private static final ConcurrentHashMap<Configuration, HttpParameter[]> implicitParamsMap = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Configuration, String> implicitParamsStrMap = new ConcurrentHashMap<>();
    private static final long serialVersionUID = 9170943084096085770L;
    private final HttpParameter[] IMPLICIT_PARAMS;
    private final String IMPLICIT_PARAMS_STR;
    private final HttpParameter INCLUDE_MY_RETWEET;

    TwitterImpl(Configuration configuration, Authorization authorization) {
        super(configuration, authorization);
        this.INCLUDE_MY_RETWEET = new HttpParameter("include_my_retweet", configuration.isIncludeMyRetweetEnabled());
        ConcurrentHashMap<Configuration, HttpParameter[]> concurrentHashMap = implicitParamsMap;
        if (concurrentHashMap.containsKey(configuration)) {
            this.IMPLICIT_PARAMS = concurrentHashMap.get(configuration);
            this.IMPLICIT_PARAMS_STR = implicitParamsStrMap.get(configuration);
            return;
        }
        String str = configuration.isIncludeEntitiesEnabled() ? "include_entities=true" : "";
        boolean z = configuration.getContributingTo() != -1;
        if (z) {
            if (!"".equals(str)) {
                str = str + "?";
            }
            str = str + "contributingto=" + configuration.getContributingTo();
        }
        ArrayList arrayList = new ArrayList(3);
        if (configuration.isIncludeEntitiesEnabled()) {
            arrayList.add(new HttpParameter("include_entities", "true"));
        }
        if (z) {
            arrayList.add(new HttpParameter("contributingto", configuration.getContributingTo()));
        }
        if (configuration.isTrimUserEnabled()) {
            arrayList.add(new HttpParameter("trim_user", "1"));
        }
        HttpParameter[] httpParameterArr = (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
        implicitParamsStrMap.putIfAbsent(configuration, str);
        concurrentHashMap.putIfAbsent(configuration, httpParameterArr);
        this.IMPLICIT_PARAMS = httpParameterArr;
        this.IMPLICIT_PARAMS_STR = str;
    }

    private void addParameterToList(List<HttpParameter> list, String str, String str2) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    private void checkFileValidity(File file) throws TwitterException {
        if (!file.exists()) {
            throw new TwitterException((Exception) new FileNotFoundException(file + " is not found."));
        } else if (!file.isFile()) {
            throw new TwitterException((Exception) new IOException(file + " is not a file."));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [twitter4j.HttpResponse, twitter4j.HttpParameter[]] */
    private HttpResponse get(String str) throws TwitterException {
        ensureAuthorizationEnabled();
        if (this.IMPLICIT_PARAMS_STR.length() > 0) {
            if (str.contains("?")) {
                str = str + "&" + this.IMPLICIT_PARAMS_STR;
            } else {
                str = str + "?" + this.IMPLICIT_PARAMS_STR;
            }
        }
        HttpResponse httpResponse = 0;
        if (!this.conf.isMBeanEnabled()) {
            return this.http.get(str, httpResponse, this.auth, this);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            httpResponse = this.http.get(str, httpResponse, this.auth, this);
            return httpResponse;
        } finally {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - currentTimeMillis, isOk(httpResponse));
        }
    }

    private boolean isOk(HttpResponse httpResponse) {
        return httpResponse != null && httpResponse.getStatusCode() < 300;
    }

    private HttpParameter[] mergeImplicitParams(HttpParameter... httpParameterArr) {
        return mergeParameters(httpParameterArr, this.IMPLICIT_PARAMS);
    }

    private HttpParameter[] mergeParameters(HttpParameter[] httpParameterArr, HttpParameter[] httpParameterArr2) {
        if (httpParameterArr != null && httpParameterArr2 != null) {
            HttpParameter[] httpParameterArr3 = new HttpParameter[(httpParameterArr.length + httpParameterArr2.length)];
            System.arraycopy(httpParameterArr, 0, httpParameterArr3, 0, httpParameterArr.length);
            System.arraycopy(httpParameterArr2, 0, httpParameterArr3, httpParameterArr.length, httpParameterArr2.length);
            return httpParameterArr3;
        } else if (httpParameterArr == null && httpParameterArr2 == null) {
            return new HttpParameter[0];
        } else {
            return httpParameterArr != null ? httpParameterArr : httpParameterArr2;
        }
    }

    private HttpResponse post(String str) throws TwitterException {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.post(str, this.IMPLICIT_PARAMS, this.auth, this);
        }
        HttpResponse httpResponse = null;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            httpResponse = this.http.post(str, this.IMPLICIT_PARAMS, this.auth, this);
            return httpResponse;
        } finally {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - currentTimeMillis, isOk(httpResponse));
        }
    }

    public User createBlock(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json?user_id=" + j));
    }

    public Status createFavorite(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(post(this.conf.getRestBaseURL() + "favorites/create.json?id=" + j));
    }

    public User createFriendship(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + j));
    }

    public User createMute(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/create.json?user_id=" + j));
    }

    public SavedSearch createSavedSearch(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createSavedSearch(post(this.conf.getRestBaseURL() + "saved_searches/create.json", new HttpParameter("query", str)));
    }

    public UserList createUserList(String str, boolean z, String str2) throws TwitterException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpParameter("name", str));
        arrayList.add(new HttpParameter("mode", z ? "public" : "private"));
        if (str2 != null) {
            arrayList.add(new HttpParameter("description", str2));
        }
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/create.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public UserList createUserListMember(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter("user_id", j2), new HttpParameter("list_id", j)));
    }

    public UserList createUserListMembers(long j, long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("list_id", j), new HttpParameter("user_id", StringUtil.join(jArr))));
    }

    public UserList createUserListSubscription(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter("list_id", j)));
    }

    public User destroyBlock(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json?user_id=" + j));
    }

    public DirectMessage destroyDirectMessage(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/destroy.json?id=" + j + "&full_text=true"));
    }

    public Status destroyFavorite(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(post(this.conf.getRestBaseURL() + "favorites/destroy.json?id=" + j));
    }

    public User destroyFriendship(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json?user_id=" + j));
    }

    public User destroyMute(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/destroy.json?user_id=" + j));
    }

    public SavedSearch destroySavedSearch(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createSavedSearch(post(this.conf.getRestBaseURL() + "saved_searches/destroy/" + j + ".json"));
    }

    public Status destroyStatus(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(post(this.conf.getRestBaseURL() + "statuses/destroy/" + j + ".json"));
    }

    public UserList destroyUserList(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter("list_id", j)));
    }

    public UserList destroyUserListMember(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter("list_id", j), new HttpParameter("user_id", j2)));
    }

    public UserList destroyUserListMembers(long j, String[] strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter("list_id", j), new HttpParameter("screen_name", StringUtil.join(strArr))));
    }

    public UserList destroyUserListSubscription(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter("list_id", j)));
    }

    public DirectMessagesResources directMessages() {
        return this;
    }

    public FavoritesResources favorites() {
        return this;
    }

    public FriendsFollowersResources friendsFollowers() {
        return this;
    }

    public TwitterAPIConfiguration getAPIConfiguration() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createTwitterAPIConfiguration(get(this.conf.getRestBaseURL() + "help/configuration.json"));
    }

    public AccountSettings getAccountSettings() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAccountSettings(get(this.conf.getRestBaseURL() + "account/settings.json"));
    }

    public ResponseList<Location> getAvailableTrends() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createLocationList(get(this.conf.getRestBaseURL() + "trends/available.json"));
    }

    public IDs getBlocksIDs() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json"));
    }

    public PagableResponseList<User> getBlocksList() throws TwitterException {
        return getBlocksList(-1);
    }

    public ResponseList<Location> getClosestTrends(GeoLocation geoLocation) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createLocationList(get(this.conf.getRestBaseURL() + "trends/closest.json", new HttpParameter("lat", geoLocation.getLatitude()), new HttpParameter("long", geoLocation.getLongitude())));
    }

    public ResponseList<User> getContributees(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json?user_id=" + j));
    }

    public ResponseList<User> getContributors(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json?user_id=" + j));
    }

    public InputStream getDMImageAsStream(String str) throws TwitterException {
        return get(str).asStream();
    }

    public ResponseList<DirectMessage> getDirectMessages() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json?full_text=true"));
    }

    public ResponseList<Status> getFavorites() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json"));
    }

    public IDs getFollowersIDs(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?cursor=" + j));
    }

    public PagableResponseList<User> getFollowersList(long j, long j2) throws TwitterException {
        return getFollowersList(j, j2, 20);
    }

    public IDs getFriendsIDs(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?cursor=" + j));
    }

    public PagableResponseList<User> getFriendsList(long j, long j2) throws TwitterException {
        return getFriendsList(j, j2, 20);
    }

    public Place getGeoDetails(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPlace(get(this.conf.getRestBaseURL() + "geo/id/" + str + ".json"));
    }

    public ResponseList<Status> getHomeTimeline() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/home_timeline.json", this.INCLUDE_MY_RETWEET));
    }

    public IDs getIncomingFriendships(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friendships/incoming.json?cursor=" + j));
    }

    public ResponseList<HelpResources.Language> getLanguages() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createLanguageList(get(this.conf.getRestBaseURL() + "help/languages.json"));
    }

    public ResponseList<User> getMemberSuggestions(String str) throws TwitterException {
        try {
            return this.factory.createUserListFromJSONArray(get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(str, "UTF-8") + "/members.json"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public ResponseList<Status> getMentionsTimeline() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json"));
    }

    public IDs getMutesIDs(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "mutes/users/ids.json?cursor=" + j));
    }

    public PagableResponseList<User> getMutesList(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "mutes/users/list.json?cursor=" + j));
    }

    public IDs getNoRetweetsFriendships() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friendships/no_retweets/ids.json"));
    }

    public OEmbed getOEmbed(OEmbedRequest oEmbedRequest) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createOEmbed(get(this.conf.getRestBaseURL() + "statuses/oembed.json", oEmbedRequest.asHttpParameterArray()));
    }

    public IDs getOutgoingFriendships(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friendships/outgoing.json?cursor=" + j));
    }

    public Trends getPlaceTrends(int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createTrends(get(this.conf.getRestBaseURL() + "trends/place.json?id=" + i));
    }

    public String getPrivacyPolicy() throws TwitterException {
        try {
            return get(this.conf.getRestBaseURL() + "help/privacy.json").asJSONObject().getString("privacy");
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public Map<String, RateLimitStatus> getRateLimitStatus() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json"));
    }

    public IDs getRetweeterIds(long j, long j2) throws TwitterException {
        return getRetweeterIds(j, 100, j2);
    }

    public ResponseList<Status> getRetweets(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets/" + j + ".json?count=100"));
    }

    public ResponseList<Status> getRetweetsOfMe() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json"));
    }

    public ResponseList<SavedSearch> getSavedSearches() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createSavedSearchList(get(this.conf.getRestBaseURL() + "saved_searches/list.json"));
    }

    public ResponseList<DirectMessage> getSentDirectMessages() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json?full_text=true"));
    }

    public ResponseList<Place> getSimilarPlaces(GeoLocation geoLocation, String str, String str2, String str3) throws TwitterException {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new HttpParameter("lat", geoLocation.getLatitude()));
        arrayList.add(new HttpParameter("long", geoLocation.getLongitude()));
        arrayList.add(new HttpParameter("name", str));
        if (str2 != null) {
            arrayList.add(new HttpParameter("contained_within", str2));
        }
        if (str3 != null) {
            arrayList.add(new HttpParameter("attribute:street_address", str3));
        }
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/similar_places.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public ResponseList<Category> getSuggestedUserCategories() throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createCategoryList(get(this.conf.getRestBaseURL() + "users/suggestions.json"));
    }

    public String getTermsOfService() throws TwitterException {
        try {
            return get(this.conf.getRestBaseURL() + "help/tos.json").asJSONObject().getString("tos");
        } catch (JSONException e) {
            throw new TwitterException((Exception) e);
        }
    }

    public PagableResponseList<User> getUserListMembers(long j, long j2) throws TwitterException {
        return getUserListMembers(j, 20, j2, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(long j) throws TwitterException {
        return getUserListMemberships(20, j);
    }

    public ResponseList<Status> getUserListStatuses(long j, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter("list_id", j))));
    }

    public PagableResponseList<User> getUserListSubscribers(long j, long j2) throws TwitterException {
        return getUserListSubscribers(j, 20, j2, false);
    }

    public PagableResponseList<UserList> getUserListSubscriptions(String str, long j) throws TwitterException {
        return getUserListSubscriptions(str, 20, j);
    }

    public ResponseList<UserList> getUserLists(String str) throws TwitterException {
        return getUserLists(str, false);
    }

    public PagableResponseList<UserList> getUserListsOwnerships(String str, long j) throws TwitterException {
        return getUserListsOwnerships(str, 20, j);
    }

    public ResponseList<User> getUserSuggestions(String str) throws TwitterException {
        try {
            return this.factory.createUserListFromJSONArray_Users(get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(str, "UTF-8") + ".json"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public ResponseList<Status> getUserTimeline(String str, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{new HttpParameter("screen_name", str), this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    public HelpResources help() {
        return this;
    }

    public ListsResources list() {
        return this;
    }

    public ResponseList<Status> lookup(long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/lookup.json?id=" + StringUtil.join(jArr)));
    }

    public ResponseList<Friendship> lookupFriendships(long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?user_id=" + StringUtil.join(jArr)));
    }

    public ResponseList<User> lookupUsers(long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/lookup.json", new HttpParameter("user_id", StringUtil.join(jArr))));
    }

    public PlacesGeoResources placesGeo() {
        return this;
    }

    public void removeProfileBanner() throws TwitterException {
        post(this.conf.getRestBaseURL() + "account/remove_profile_banner.json");
    }

    public User reportSpam(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json?user_id=" + j));
    }

    public Status retweetStatus(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(post(this.conf.getRestBaseURL() + "statuses/retweet/" + j + ".json"));
    }

    public ResponseList<Place> reverseGeoCode(GeoQuery geoQuery) throws TwitterException {
        try {
            ObjectFactory objectFactory = this.factory;
            return objectFactory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/reverse_geocode.json", geoQuery.asHttpParameterArray()));
        } catch (TwitterException e) {
            if (e.getStatusCode() == 404) {
                return this.factory.createEmptyResponseList();
            }
            throw e;
        }
    }

    public SavedSearchesResources savedSearches() {
        return this;
    }

    public QueryResult search(Query query) throws TwitterException {
        if (query.nextPage() != null) {
            ObjectFactory objectFactory = this.factory;
            return objectFactory.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json" + query.nextPage()), query);
        }
        ObjectFactory objectFactory2 = this.factory;
        return objectFactory2.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json", query.asHttpParameterArray()), query);
    }

    public SearchResource search() {
        return this;
    }

    public ResponseList<Place> searchPlaces(GeoQuery geoQuery) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/search.json", geoQuery.asHttpParameterArray()));
    }

    public ResponseList<User> searchUsers(String str, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/search.json", new HttpParameter("q", str), new HttpParameter("per_page", 20), new HttpParameter("page", i)));
    }

    public DirectMessage sendDirectMessage(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter("user_id", j), new HttpParameter("text", str), new HttpParameter("full_text", true)));
    }

    public DirectMessage showDirectMessage(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessage(get(this.conf.getRestBaseURL() + "direct_messages/show.json?id=" + j + "&full_text=true"));
    }

    public Relationship showFriendship(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRelationship(get(this.conf.getRestBaseURL() + "friendships/show.json", new HttpParameter("source_id", j), new HttpParameter("target_id", j2)));
    }

    public SavedSearch showSavedSearch(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createSavedSearch(get(this.conf.getRestBaseURL() + "saved_searches/show/" + j + ".json"));
    }

    public Status showStatus(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(get(this.conf.getRestBaseURL() + "statuses/show/" + j + ".json", this.INCLUDE_MY_RETWEET));
    }

    public User showUser(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "users/show.json?user_id=" + j));
    }

    public UserList showUserList(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?list_id=" + j));
    }

    public User showUserListMembership(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?list_id=" + j + "&user_id=" + j2));
    }

    public User showUserListSubscription(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?list_id=" + j + "&user_id=" + j2));
    }

    public SpamReportingResource spamReporting() {
        return this;
    }

    public SuggestedUsersResources suggestedUsers() {
        return this;
    }

    public TimelinesResources timelines() {
        return this;
    }

    public String toString() {
        return "TwitterImpl{INCLUDE_MY_RETWEET=" + this.INCLUDE_MY_RETWEET + '}';
    }

    public TrendsResources trends() {
        return this;
    }

    public TweetsResources tweets() {
        return this;
    }

    public AccountSettings updateAccountSettings(Integer num, Boolean bool, String str, String str2, String str3, String str4) throws TwitterException {
        ArrayList arrayList = new ArrayList(6);
        if (num != null) {
            arrayList.add(new HttpParameter("trend_location_woeid", num.intValue()));
        }
        if (bool != null) {
            arrayList.add(new HttpParameter("sleep_time_enabled", bool.toString()));
        }
        if (str != null) {
            arrayList.add(new HttpParameter("start_sleep_time", str));
        }
        if (str2 != null) {
            arrayList.add(new HttpParameter("end_sleep_time", str2));
        }
        if (str3 != null) {
            arrayList.add(new HttpParameter("time_zone", str3));
        }
        if (str4 != null) {
            arrayList.add(new HttpParameter("lang", str4));
        }
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAccountSettings(post(this.conf.getRestBaseURL() + "account/settings.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public Relationship updateFriendship(long j, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRelationship(post(this.conf.getRestBaseURL() + "friendships/update.json", new HttpParameter("user_id", j), new HttpParameter("device", z), new HttpParameter("retweets", z2)));
    }

    public User updateProfile(String str, String str2, String str3, String str4) throws TwitterException {
        ArrayList arrayList = new ArrayList(4);
        addParameterToList(arrayList, "name", str);
        addParameterToList(arrayList, "url", str2);
        addParameterToList(arrayList, "location", str3);
        addParameterToList(arrayList, "description", str4);
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public User updateProfileBackgroundImage(File file, boolean z) throws TwitterException {
        checkFileValidity(file);
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter("image", file), new HttpParameter("tile", z)));
    }

    public void updateProfileBanner(File file) throws TwitterException {
        checkFileValidity(file);
        post(this.conf.getRestBaseURL() + "account/update_profile_banner.json", new HttpParameter("banner", file));
    }

    public User updateProfileColors(String str, String str2, String str3, String str4, String str5) throws TwitterException {
        ArrayList arrayList = new ArrayList(6);
        addParameterToList(arrayList, "profile_background_color", str);
        addParameterToList(arrayList, "profile_text_color", str2);
        addParameterToList(arrayList, "profile_link_color", str3);
        addParameterToList(arrayList, "profile_sidebar_fill_color", str4);
        addParameterToList(arrayList, "profile_sidebar_border_color", str5);
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_colors.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public User updateProfileImage(File file) throws TwitterException {
        checkFileValidity(file);
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter("image", file)));
    }

    public Status updateStatus(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatus(post(this.conf.getRestBaseURL() + "statuses/update.json", new HttpParameter((String) NotificationCompat.CATEGORY_STATUS, str)));
    }

    public UserList updateUserList(long j, String str, boolean z, String str2) throws TwitterException {
        return updateUserList(str, z, str2, new HttpParameter("list_id", j));
    }

    public UploadedMedia uploadMedia(File file) throws TwitterException {
        checkFileValidity(file);
        return new UploadedMedia(post(this.conf.getUploadBaseURL() + "media/upload.json", new HttpParameter("media", file)).asJSONObject());
    }

    public UsersResources users() {
        return this;
    }

    public User verifyCredentials() throws TwitterException {
        return super.fillInIDAndScreenName();
    }

    public User createBlock(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json", new HttpParameter("screen_name", str)));
    }

    public User createFriendship(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json", new HttpParameter("screen_name", str)));
    }

    public User createMute(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/create.json", new HttpParameter("screen_name", str)));
    }

    public UserList createUserListMember(long j, String str, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter("user_id", j2), new HttpParameter("owner_id", j), new HttpParameter("slug", str)));
    }

    public UserList createUserListSubscription(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str)));
    }

    public User destroyBlock(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json", new HttpParameter("screen_name", str)));
    }

    public User destroyFriendship(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json", new HttpParameter("screen_name", str)));
    }

    public User destroyMute(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/destroy.json", new HttpParameter("screen_name", str)));
    }

    public UserList destroyUserList(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str)));
    }

    public UserList destroyUserListMember(long j, String str, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("user_id", j2)));
    }

    public UserList destroyUserListSubscription(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str)));
    }

    public IDs getBlocksIDs(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json?cursor=" + j));
    }

    public PagableResponseList<User> getBlocksList(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "blocks/list.json?cursor=" + j));
    }

    public ResponseList<User> getContributees(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json", new HttpParameter("screen_name", str)));
    }

    public ResponseList<User> getContributors(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json", new HttpParameter("screen_name", str)));
    }

    public ResponseList<DirectMessage> getDirectMessages(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter("full_text", true))));
    }

    public ResponseList<Status> getFavorites(long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json?user_id=" + j));
    }

    public IDs getFollowersIDs(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?user_id=" + j + "&cursor=" + j2));
    }

    public PagableResponseList<User> getFollowersList(String str, long j) throws TwitterException {
        return getFollowersList(str, j, 20);
    }

    public IDs getFriendsIDs(long j, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?user_id=" + j + "&cursor=" + j2));
    }

    public PagableResponseList<User> getFriendsList(long j, long j2, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    public ResponseList<Status> getHomeTimeline(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/home_timeline.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[]{this.INCLUDE_MY_RETWEET})));
    }

    public ResponseList<Status> getMentionsTimeline(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json", paging.asPostParameterArray()));
    }

    public Map<String, RateLimitStatus> getRateLimitStatus(String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json?resources=" + StringUtil.join(strArr)));
    }

    public IDs getRetweeterIds(long j, int i, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "statuses/retweeters/ids.json?id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    public ResponseList<Status> getRetweetsOfMe(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json", paging.asPostParameterArray()));
    }

    public ResponseList<DirectMessage> getSentDirectMessages(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter("full_text", true))));
    }

    public PagableResponseList<User> getUserListMembers(long j, int i, long j2) throws TwitterException {
        return getUserListMembers(j, i, j2, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(int i, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json", new HttpParameter("cursor", j), new HttpParameter("count", i)));
    }

    public PagableResponseList<User> getUserListSubscribers(long j, int i, long j2) throws TwitterException {
        return getUserListSubscribers(j, i, j2, false);
    }

    public PagableResponseList<UserList> getUserListSubscriptions(String str, int i, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/subscriptions.json", new HttpParameter("screen_name", str), new HttpParameter("count", i), new HttpParameter("cursor", j)));
    }

    public ResponseList<UserList> getUserLists(String str, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json", new HttpParameter("screen_name", str), new HttpParameter("reverse", z)));
    }

    public PagableResponseList<UserList> getUserListsOwnerships(String str, int i, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/ownerships.json", new HttpParameter("screen_name", str), new HttpParameter("count", i), new HttpParameter("cursor", j)));
    }

    public ResponseList<Friendship> lookupFriendships(String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?screen_name=" + StringUtil.join(strArr)));
    }

    public User reportSpam(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json", new HttpParameter("screen_name", str)));
    }

    public DirectMessage sendDirectMessage(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter("screen_name", str), new HttpParameter("text", str2), new HttpParameter("full_text", true)));
    }

    public Relationship showFriendship(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRelationship(get(this.conf.getRestBaseURL() + "friendships/show.json", HttpParameter.getParameterArray("source_screen_name", str, "target_screen_name", str2)));
    }

    public User showUser(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "users/show.json", new HttpParameter("screen_name", str)));
    }

    public UserList showUserList(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?owner_id=" + j + "&slug=" + str));
    }

    public User showUserListMembership(long j, String str, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?owner_id=" + j + "&slug=" + str + "&user_id=" + j2));
    }

    public User showUserListSubscription(long j, String str, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?owner_id=" + j + "&slug=" + str + "&user_id=" + j2));
    }

    public Relationship updateFriendship(String str, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createRelationship(post(this.conf.getRestBaseURL() + "friendships/update.json", new HttpParameter("screen_name", str), new HttpParameter("device", z), new HttpParameter("retweets", z2)));
    }

    public Status updateStatus(StatusUpdate statusUpdate) throws TwitterException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.conf.getRestBaseURL());
        sb.append(statusUpdate.isForUpdateWithMedia() ? "statuses/update_with_media.json" : "statuses/update.json");
        return this.factory.createStatus(post(sb.toString(), statusUpdate.asHttpParameterArray()));
    }

    public UserList updateUserList(long j, String str, String str2, boolean z, String str3) throws TwitterException {
        return updateUserList(str2, z, str3, new HttpParameter("owner_id", j), new HttpParameter("slug", str));
    }

    public User createFriendship(long j, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + j + "&follow=" + z));
    }

    public UserList createUserListMember(String str, String str2, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter("user_id", j), new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)));
    }

    public UserList createUserListSubscription(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)));
    }

    public UserList destroyUserList(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)));
    }

    public UserList destroyUserListMember(long j, String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter("list_id", j), new HttpParameter("screen_name", str)));
    }

    public UserList destroyUserListSubscription(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)));
    }

    public ResponseList<Status> getFavorites(String str) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", new HttpParameter("screen_name", str)));
    }

    public IDs getFollowersIDs(long j, long j2, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    public PagableResponseList<User> getFollowersList(long j, long j2, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    public IDs getFriendsIDs(long j, long j2, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    public PagableResponseList<User> getFriendsList(String str, long j) throws TwitterException {
        return getFriendsList(str, j, 20);
    }

    public PagableResponseList<User> getUserListMembers(long j, int i, long j2, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json", new HttpParameter("list_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2), new HttpParameter("skip_status", z)));
    }

    public PagableResponseList<UserList> getUserListMemberships(String str, long j) throws TwitterException {
        return getUserListMemberships(str, j, false);
    }

    public PagableResponseList<User> getUserListSubscribers(long j, int i, long j2, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json", new HttpParameter("list_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2), new HttpParameter("skip_status", z)));
    }

    public PagableResponseList<UserList> getUserListSubscriptions(long j, long j2) throws TwitterException {
        return getUserListSubscriptions(j, 20, j2);
    }

    public ResponseList<UserList> getUserLists(long j) throws TwitterException {
        return getUserLists(j, false);
    }

    public PagableResponseList<UserList> getUserListsOwnerships(long j, long j2) throws TwitterException {
        return getUserListsOwnerships(j, 20, j2);
    }

    public UserList showUserList(String str, String str2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)));
    }

    public User showUserListMembership(String str, String str2, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", j)));
    }

    public User showUserListSubscription(String str, String str2, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", j)));
    }

    public User updateProfileBackgroundImage(InputStream inputStream, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter("image", "image", inputStream), new HttpParameter("tile", z)));
    }

    public void updateProfileBanner(InputStream inputStream) throws TwitterException {
        post(this.conf.getRestBaseURL() + "account/update_profile_banner.json", new HttpParameter("banner", "banner", inputStream));
    }

    public User updateProfileImage(InputStream inputStream) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter("image", "image", inputStream)));
    }

    public UserList updateUserList(String str, String str2, String str3, boolean z, String str4) throws TwitterException {
        return updateUserList(str3, z, str4, new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2));
    }

    private HttpParameter[] mergeParameters(HttpParameter[] httpParameterArr, HttpParameter httpParameter) {
        if (httpParameterArr != null && httpParameter != null) {
            int length = httpParameterArr.length + 1;
            HttpParameter[] httpParameterArr2 = new HttpParameter[length];
            System.arraycopy(httpParameterArr, 0, httpParameterArr2, 0, httpParameterArr.length);
            httpParameterArr2[length - 1] = httpParameter;
            return httpParameterArr2;
        } else if (httpParameterArr == null && httpParameter == null) {
            return new HttpParameter[0];
        } else {
            if (httpParameterArr != null) {
                return httpParameterArr;
            }
            return new HttpParameter[]{httpParameter};
        }
    }

    private UserList updateUserList(String str, boolean z, String str2, HttpParameter... httpParameterArr) throws TwitterException {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, httpParameterArr);
        if (str != null) {
            arrayList.add(new HttpParameter("name", str));
        }
        arrayList.add(new HttpParameter("mode", z ? "public" : "private"));
        if (str2 != null) {
            arrayList.add(new HttpParameter("description", str2));
        }
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/update.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    public User createFriendship(String str, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json", new HttpParameter("screen_name", str), new HttpParameter("follow", z)));
    }

    public UserList createUserListMembers(long j, String str, long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("user_id", StringUtil.join(jArr))));
    }

    public UserList destroyUserListMember(String str, String str2, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", j)));
    }

    public UserList destroyUserListMembers(long j, long[] jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter("list_id", j), new HttpParameter("user_id", StringUtil.join(jArr))));
    }

    public ResponseList<Status> getFavorites(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", paging.asPostParameterArray()));
    }

    public IDs getFollowersIDs(String str, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j)));
    }

    public PagableResponseList<User> getFollowersList(String str, long j, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i)));
    }

    public IDs getFriendsIDs(String str, long j) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j)));
    }

    public PagableResponseList<User> getFriendsList(String str, long j, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i)));
    }

    public PagableResponseList<User> getUserListMembers(long j, String str, long j2) throws TwitterException {
        return getUserListMembers(j, str, 20, j2, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(String str, int i, long j) throws TwitterException {
        return getUserListMemberships(str, i, j, false);
    }

    public ResponseList<Status> getUserListStatuses(long j, String str, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str)})));
    }

    public PagableResponseList<User> getUserListSubscribers(long j, String str, long j2) throws TwitterException {
        return getUserListSubscribers(j, str, 20, j2, false);
    }

    public PagableResponseList<UserList> getUserListSubscriptions(long j, int i, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/subscriptions.json", new HttpParameter("user_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2)));
    }

    public ResponseList<UserList> getUserLists(long j, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json", new HttpParameter("user_id", j), new HttpParameter("reverse", z)));
    }

    public PagableResponseList<UserList> getUserListsOwnerships(long j, int i, long j2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/ownerships.json", new HttpParameter("user_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2)));
    }

    public ResponseList<User> lookupUsers(String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createUserList(get(this.conf.getRestBaseURL() + "users/lookup.json", new HttpParameter("screen_name", StringUtil.join(strArr))));
    }

    public UploadedMedia uploadMedia(String str, InputStream inputStream) throws TwitterException {
        return new UploadedMedia(post(this.conf.getUploadBaseURL() + "media/upload.json", new HttpParameter("media", str, inputStream)).asJSONObject());
    }

    public ResponseList<Status> getFavorites(long j, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", mergeParameters(new HttpParameter[]{new HttpParameter("user_id", j)}, paging.asPostParameterArray())));
    }

    public IDs getFollowersIDs(String str, long j, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i)));
    }

    public PagableResponseList<User> getFollowersList(long j, long j2, int i, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    public IDs getFriendsIDs(String str, long j, int i) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i)));
    }

    public PagableResponseList<User> getFriendsList(long j, long j2, int i, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    public PagableResponseList<User> getUserListMembers(long j, String str, int i, long j2) throws TwitterException {
        return getUserListMembers(j, str, i, j2, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(String str, long j, boolean z) throws TwitterException {
        return getUserListMemberships(str, 20, j, z);
    }

    public PagableResponseList<User> getUserListSubscribers(long j, String str, int i, long j2) throws TwitterException {
        return getUserListSubscribers(j, str, i, j2, false);
    }

    public ResponseList<Status> getUserTimeline(long j, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{new HttpParameter("user_id", j), this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    public PagableResponseList<User> getFollowersList(String str, long j, int i, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i), new HttpParameter("skip_status", z), new HttpParameter("include_user_entities", z2)));
    }

    public PagableResponseList<User> getFriendsList(String str, long j, int i, boolean z, boolean z2) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json", new HttpParameter("screen_name", str), new HttpParameter("cursor", j), new HttpParameter("count", i), new HttpParameter("skip_status", z), new HttpParameter("include_user_entities", z2)));
    }

    public PagableResponseList<User> getUserListMembers(long j, String str, int i, long j2, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("count", i), new HttpParameter("cursor", j2), new HttpParameter("skip_status", z)));
    }

    public PagableResponseList<UserList> getUserListMemberships(String str, int i, long j, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json", new HttpParameter("screen_name", str), new HttpParameter("count", i), new HttpParameter("cursor", j), new HttpParameter("filter_to_owned_lists", z)));
    }

    public PagableResponseList<User> getUserListSubscribers(long j, String str, int i, long j2, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("count", i), new HttpParameter("cursor", j2), new HttpParameter("skip_status", z)));
    }

    public UserList createUserListMembers(String str, String str2, long... jArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", StringUtil.join(jArr))));
    }

    public UserList destroyUserListMembers(String str, String str2, String[] strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("screen_name", StringUtil.join(strArr))));
    }

    public PagableResponseList<User> getUserListMembers(String str, String str2, long j) throws TwitterException {
        return getUserListMembers(str, str2, 20, j, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(long j, long j2) throws TwitterException {
        return getUserListMemberships(j, j2, false);
    }

    public ResponseList<Status> getUserListStatuses(String str, String str2, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)})));
    }

    public PagableResponseList<User> getUserListSubscribers(String str, String str2, long j) throws TwitterException {
        return getUserListSubscribers(str, str2, 20, j, false);
    }

    public PagableResponseList<User> getUserListMembers(String str, String str2, int i, long j) throws TwitterException {
        return getUserListMembers(str, str2, i, j, false);
    }

    public PagableResponseList<UserList> getUserListMemberships(long j, int i, long j2) throws TwitterException {
        return getUserListMemberships(j, i, j2, false);
    }

    public PagableResponseList<User> getUserListSubscribers(String str, String str2, int i, long j) throws TwitterException {
        return getUserListSubscribers(str, str2, i, j, false);
    }

    public ResponseList<Status> getFavorites(String str, Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", mergeParameters(new HttpParameter[]{new HttpParameter("screen_name", str)}, paging.asPostParameterArray())));
    }

    public PagableResponseList<User> getUserListMembers(String str, String str2, int i, long j, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("count", i), new HttpParameter("cursor", j), new HttpParameter("skip_status", z)));
    }

    public PagableResponseList<UserList> getUserListMemberships(long j, long j2, boolean z) throws TwitterException {
        return getUserListMemberships(j, 20, j2, z);
    }

    public PagableResponseList<User> getUserListSubscribers(String str, String str2, int i, long j, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("count", i), new HttpParameter("cursor", j), new HttpParameter("skip_status", z)));
    }

    public ResponseList<Status> getUserTimeline(String str) throws TwitterException {
        return getUserTimeline(str, new Paging());
    }

    public UserList createUserListMembers(long j, String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("list_id", j), new HttpParameter("screen_name", StringUtil.join(strArr))));
    }

    public PagableResponseList<UserList> getUserListMemberships(long j, int i, long j2, boolean z) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json", new HttpParameter("user_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2), new HttpParameter("filter_to_owned_lists", z)));
    }

    public ResponseList<Status> getUserTimeline(long j) throws TwitterException {
        return getUserTimeline(j, new Paging());
    }

    private HttpResponse post(String str, HttpParameter... httpParameterArr) throws TwitterException {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.post(str, mergeImplicitParams(httpParameterArr), this.auth, this);
        }
        HttpResponse httpResponse = null;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            httpResponse = this.http.post(str, mergeImplicitParams(httpParameterArr), this.auth, this);
            return httpResponse;
        } finally {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - currentTimeMillis, isOk(httpResponse));
        }
    }

    public ResponseList<Status> getUserTimeline() throws TwitterException {
        return getUserTimeline(new Paging());
    }

    public ResponseList<Status> getUserTimeline(Paging paging) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    public UserList createUserListMembers(long j, String str, String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("screen_name", StringUtil.join(strArr))));
    }

    private HttpResponse get(String str, HttpParameter... httpParameterArr) throws TwitterException {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.get(str, mergeImplicitParams(httpParameterArr), this.auth, this);
        }
        HttpResponse httpResponse = null;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            httpResponse = this.http.get(str, mergeImplicitParams(httpParameterArr), this.auth, this);
            return httpResponse;
        } finally {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - currentTimeMillis, isOk(httpResponse));
        }
    }

    public UserList createUserListMembers(String str, String str2, String... strArr) throws TwitterException {
        ObjectFactory objectFactory = this.factory;
        return objectFactory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("screen_name", StringUtil.join(strArr))));
    }
}
