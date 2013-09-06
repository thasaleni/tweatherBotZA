package com.twoogle.bot.services.impl;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import twitter4j.AccountSettings;
import twitter4j.Category;
import twitter4j.DirectMessage;
import twitter4j.Friendship;
import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.IDs;
import twitter4j.Location;
import twitter4j.OEmbed;
import twitter4j.OEmbedRequest;
import twitter4j.PagableResponseList;
import twitter4j.Paging;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.RateLimitStatusListener;
import twitter4j.RelatedResults;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.SavedSearch;
import twitter4j.SimilarPlaces;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterAPIConfiguration;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;

import com.twoogle.bot.services.TwitterService;

public class TwitterServiceImpl implements Twitter {

	public void setOAuthConsumer(String consumerKey, String consumerSecret) {
		// TODO Auto-generated method stub
		
	}

	public RequestToken getOAuthRequestToken() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestToken getOAuthRequestToken(String callbackURL)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public RequestToken getOAuthRequestToken(String callbackURL,
			String xAuthAccessType) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessToken getOAuthAccessToken() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessToken getOAuthAccessToken(String oauthVerifier)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessToken getOAuthAccessToken(RequestToken requestToken)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessToken getOAuthAccessToken(RequestToken requestToken,
			String oauthVerifier) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccessToken getOAuthAccessToken(String screenName, String password)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOAuthAccessToken(AccessToken accessToken) {
		// TODO Auto-generated method stub
		
	}

	public String getScreenName() throws TwitterException,
			IllegalStateException {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() throws TwitterException, IllegalStateException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addRateLimitStatusListener(RateLimitStatusListener listener) {
		// TODO Auto-generated method stub
		
	}

	public Authorization getAuthorization() {
		// TODO Auto-generated method stub
		return null;
	}

	public Configuration getConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	public ResponseList<Status> getMentions() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getMentionsTimeline() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getMentions(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getMentionsTimeline(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline(String screenName, Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline(long userId, Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline(String screenName)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline(long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserTimeline(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getHomeTimeline() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getHomeTimeline(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getRetweetsOfMe() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getRetweetsOfMe(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getRetweets(long statusId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status showStatus(long id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status destroyStatus(long statusId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status updateStatus(String status) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status updateStatus(StatusUpdate latestStatus)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status retweetStatus(long statusId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public OEmbed getOEmbed(OEmbedRequest req) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryResult search(Query query) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<DirectMessage> getDirectMessages()
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<DirectMessage> getDirectMessages(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<DirectMessage> getSentDirectMessages()
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<DirectMessage> getSentDirectMessages(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public DirectMessage showDirectMessage(long id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public DirectMessage destroyDirectMessage(long id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public DirectMessage sendDirectMessage(long userId, String text)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public DirectMessage sendDirectMessage(String screenName, String text)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFriendsIDs(long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFriendsIDs(long userId, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFriendsIDs(String screenName, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFollowersIDs(long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFollowersIDs(long userId, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getFollowersIDs(String screenName, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Friendship> lookupFriendships(long[] ids)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Friendship> lookupFriendships(String[] screenNames)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getIncomingFriendships(long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getOutgoingFriendships(long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createFriendship(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createFriendship(String screenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createFriendship(long userId, boolean follow)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createFriendship(String screenName, boolean follow)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User destroyFriendship(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User destroyFriendship(String screenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Relationship updateFriendship(long userId,
			boolean enableDeviceNotification, boolean retweets)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Relationship updateFriendship(String screenName,
			boolean enableDeviceNotification, boolean retweets)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Relationship showFriendship(long sourceId, long targetId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Relationship showFriendship(String sourceScreenName,
			String targetScreenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getFriendsList(long userId, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getFriendsList(String screenName,
			long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getFollowersList(long userId, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getFollowersList(String screenName,
			long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountSettings getAccountSettings() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User verifyCredentials() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountSettings updateAccountSettings(Integer trendLocationWoeid,
			Boolean sleepTimeEnabled, String startSleepTime,
			String endSleepTime, String timeZone, String lang)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfile(String name, String url, String location,
			String description) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfileBackgroundImage(File image, boolean tile)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfileBackgroundImage(InputStream image, boolean tile)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfileColors(String profileBackgroundColor,
			String profileTextColor, String profileLinkColor,
			String profileSidebarFillColor, String profileSidebarBorderColor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfileImage(File image) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateProfileImage(InputStream image) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getBlocksList() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getBlocksList(long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getBlocksIDs() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public IDs getBlocksIDs(long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createBlock(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User createBlock(String screenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User destroyBlock(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User destroyBlock(String screen_name) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> lookupUsers(long[] ids) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> lookupUsers(String[] screenNames)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUser(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUser(String screenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> searchUsers(String query, int page)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> getContributees(long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> getContributees(String screenName)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> getContributors(long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> getContributors(String screenName)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeProfileBanner() throws TwitterException {
		// TODO Auto-generated method stub
		
	}

	public void updateProfileBanner(File image) throws TwitterException {
		// TODO Auto-generated method stub
		
	}

	public void updateProfileBanner(InputStream image) throws TwitterException {
		// TODO Auto-generated method stub
		
	}

	public ResponseList<User> getUserSuggestions(String categorySlug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Category> getSuggestedUserCategories()
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<User> getMemberSuggestions(String categorySlug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites(long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites(String screenName)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites(Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites(long userId, Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getFavorites(String screenName, Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status createFavorite(long id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Status destroyFavorite(long id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<UserList> getUserLists(String listOwnerScreenName)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<UserList> getUserLists(long listOwnerUserId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserListStatuses(int listId, Paging paging)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserListStatuses(long ownerId, String slug,
			Paging paging) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Status> getUserListStatuses(String ownerScreenName,
			String slug, Paging paging) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListMember(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList deleteUserListMember(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListMember(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList deleteUserListMember(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListMember(String ownerScreenName, String slug,
			long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListMemberships(long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListMemberships(
			long listMemberId, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListMemberships(
			String listMemberScreenName, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListMemberships(
			String listMemberScreenName, long cursor, boolean filterToOwnedLists)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListMemberships(
			long listMemberId, long cursor, boolean filterToOwnedLists)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListSubscribers(int listId,
			long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListSubscribers(long ownerId,
			String slug, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListSubscribers(
			String ownerScreenName, String slug, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListSubscription(int listId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListSubscription(long ownerId, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListSubscription(String ownerScreenName,
			String slug) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListSubscription(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListSubscription(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListSubscription(String ownerScreenName, String slug,
			long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListSubscription(int listId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListSubscription(long ownerId, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserListSubscription(String ownerScreenName,
			String slug) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(int listId, long[] userIds)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMembers(int listId, long[] userIds)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(long ownerId, String slug,
			long[] userIds) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMembers(long ownerId, String slug, long[] userIds)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(String ownerScreenName, String slug,
			long[] userIds) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(int listId, String[] screenNames)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMembers(int listId, String[] screenNames)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(long ownerId, String slug,
			String[] screenNames) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMembers(long ownerId, String slug,
			String[] screenNames) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMembers(String ownerScreenName, String slug,
			String[] screenNames) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListMembership(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListMembership(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User showUserListMembership(String ownerScreenName, String slug,
			long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListMembers(int listId, long cursor)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListMembers(long ownerId,
			String slug, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<User> getUserListMembers(String ownerScreenName,
			String slug, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMember(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMember(int listId, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMember(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList addUserListMember(long ownerId, String slug, long userId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserListMember(String ownerScreenName, String slug,
			long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserList(int listId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserList(long ownerId, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList destroyUserList(String ownerScreenName, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList updateUserList(int listId, String newListName,
			boolean isPublicList, String newDescription)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList updateUserList(long ownerId, String slug,
			String newListName, boolean isPublicList, String newDescription)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList updateUserList(String ownerScreenName, String slug,
			String newListName, boolean isPublicList, String newDescription)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList createUserList(String listName, boolean isPublicList,
			String description) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList showUserList(int listId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList showUserList(long ownerId, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public UserList showUserList(String ownerScreenName, String slug)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public PagableResponseList<UserList> getUserListSubscriptions(
			String listOwnerScreenName, long cursor) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<SavedSearch> getSavedSearches() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public SavedSearch showSavedSearch(int id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public SavedSearch createSavedSearch(String query) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public SavedSearch destroySavedSearch(int id) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Place getGeoDetails(String placeId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Place> reverseGeoCode(GeoQuery query)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Place> searchPlaces(GeoQuery query)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public SimilarPlaces getSimilarPlaces(GeoLocation location, String name,
			String containedWithin, String streetAddress)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Place createPlace(String name, String containedWithin, String token,
			GeoLocation location, String streetAddress) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Trends getLocationTrends(int woeid) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Trends getPlaceTrends(int woeid) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Location> getAvailableTrends() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Location> getAvailableTrends(GeoLocation location)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Location> getClosestTrends(GeoLocation location)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User reportSpam(long userId) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public User reportSpam(String screenName) throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public TwitterAPIConfiguration getAPIConfiguration()
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseList<Language> getLanguages() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrivacyPolicy() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTermsOfService() throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, RateLimitStatus> getRateLimitStatus()
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, RateLimitStatus> getRateLimitStatus(String... resources)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}

	public RelatedResults getRelatedResults(long statusId)
			throws TwitterException {
		// TODO Auto-generated method stub
		return null;
	}
  public List<Status> getRecent100WithHashTag(String tag){
	  List<Status> taggedStatuses = new ArrayList<Status>();
	  for (int page = 1; page <= 10; page++) {
		  Twitter twitter = TwitterFactory.getSingleton();
	        Query query = new Query("#"+tag);
	        query.setCount(100);
	        QueryResult qr = query.;
	        List<Status> qrTweets = qr.getTweets();

	        // break out if there are no more tweets
	        if(qrTweets.size() == 0) break;

	        // separate tweets into good and bad bins
	        for(Status t : qrTweets) {
	            if (t.getText().toLowerCase().contains("happy") ||
	                t.getText().toLowerCase().contains("love")) {
	                goodWeather.add(t);
	            }

	            if (t.getText().toLowerCase().contains("sad") ||
	                t.getText().toLowerCase().contains("hate")) {
	                badWeather.add(t);
	            }
	        }
	    }
	  
	  
	  return taggedStatuses;
  }
}
