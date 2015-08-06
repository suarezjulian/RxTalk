package co.juliansuarez.rxtalk.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by julian on 8/5/15.
 */
public class Item {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @Expose
    private String description;
    @Expose
    private Boolean fork;
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @Expose
    private Object homepage;
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @Expose
    private Double score;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * @param _private The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * @return The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * @param htmlUrl The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The fork
     */
    public Boolean getFork() {
        return fork;
    }

    /**
     * @param fork The fork
     */
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The forksUrl
     */
    public String getForksUrl() {
        return forksUrl;
    }

    /**
     * @param forksUrl The forks_url
     */
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     * @return The keysUrl
     */
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     * @param keysUrl The keys_url
     */
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     * @return The collaboratorsUrl
     */
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     * @param collaboratorsUrl The collaborators_url
     */
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     * @return The teamsUrl
     */
    public String getTeamsUrl() {
        return teamsUrl;
    }

    /**
     * @param teamsUrl The teams_url
     */
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
     * @return The hooksUrl
     */
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     * @param hooksUrl The hooks_url
     */
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
     * @return The issueEventsUrl
     */
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     * @param issueEventsUrl The issue_events_url
     */
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     * @return The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * @param eventsUrl The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * @return The assigneesUrl
     */
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     * @param assigneesUrl The assignees_url
     */
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     * @return The branchesUrl
     */
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     * @param branchesUrl The branches_url
     */
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
     * @return The tagsUrl
     */
    public String getTagsUrl() {
        return tagsUrl;
    }

    /**
     * @param tagsUrl The tags_url
     */
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
     * @return The blobsUrl
     */
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     * @param blobsUrl The blobs_url
     */
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
     * @return The gitTagsUrl
     */
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     * @param gitTagsUrl The git_tags_url
     */
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     * @return The gitRefsUrl
     */
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     * @param gitRefsUrl The git_refs_url
     */
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     * @return The treesUrl
     */
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     * @param treesUrl The trees_url
     */
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     * @return The statusesUrl
     */
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     * @param statusesUrl The statuses_url
     */
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
     * @return The languagesUrl
     */
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     * @param languagesUrl The languages_url
     */
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
     * @return The stargazersUrl
     */
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     * @param stargazersUrl The stargazers_url
     */
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     * @return The contributorsUrl
     */
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     * @param contributorsUrl The contributors_url
     */
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     * @return The subscribersUrl
     */
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     * @param subscribersUrl The subscribers_url
     */
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     * @return The subscriptionUrl
     */
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * @param subscriptionUrl The subscription_url
     */
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * @return The commitsUrl
     */
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     * @param commitsUrl The commits_url
     */
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     * @return The gitCommitsUrl
     */
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     * @param gitCommitsUrl The git_commits_url
     */
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     * @return The commentsUrl
     */
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * @param commentsUrl The comments_url
     */
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     * @return The issueCommentUrl
     */
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     * @param issueCommentUrl The issue_comment_url
     */
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     * @return The contentsUrl
     */
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     * @param contentsUrl The contents_url
     */
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
     * @return The compareUrl
     */
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     * @param compareUrl The compare_url
     */
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
     * @return The mergesUrl
     */
    public String getMergesUrl() {
        return mergesUrl;
    }

    /**
     * @param mergesUrl The merges_url
     */
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
     * @return The archiveUrl
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     * @param archiveUrl The archive_url
     */
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     * @return The downloadsUrl
     */
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     * @param downloadsUrl The downloads_url
     */
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     * @return The issuesUrl
     */
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     * @param issuesUrl The issues_url
     */
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     * @return The pullsUrl
     */
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     * @param pullsUrl The pulls_url
     */
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
     * @return The milestonesUrl
     */
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     * @param milestonesUrl The milestones_url
     */
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     * @return The notificationsUrl
     */
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     * @param notificationsUrl The notifications_url
     */
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     * @return The labelsUrl
     */
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     * @param labelsUrl The labels_url
     */
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
     * @return The releasesUrl
     */
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     * @param releasesUrl The releases_url
     */
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return The pushedAt
     */
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     * @param pushedAt The pushed_at
     */
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     * @return The gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * @param gitUrl The git_url
     */
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     * @return The sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * @param sshUrl The ssh_url
     */
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     * @return The cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     * @param cloneUrl The clone_url
     */
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
     * @return The svnUrl
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     * @param svnUrl The svn_url
     */
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
     * @return The homepage
     */
    public Object getHomepage() {
        return homepage;
    }

    /**
     * @param homepage The homepage
     */
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    /**
     * @return The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return The stargazersCount
     */
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     * @param stargazersCount The stargazers_count
     */
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     * @return The watchersCount
     */
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     * @param watchersCount The watchers_count
     */
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     * @return The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return The hasIssues
     */
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * @param hasIssues The has_issues
     */
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     * @return The hasDownloads
     */
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * @param hasDownloads The has_downloads
     */
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     * @return The hasWiki
     */
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * @param hasWiki The has_wiki
     */
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     * @return The hasPages
     */
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     * @param hasPages The has_pages
     */
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
     * @return The forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     * @param forksCount The forks_count
     */
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     * @return The mirrorUrl
     */
    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     * @param mirrorUrl The mirror_url
     */
    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     * @return The openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     * @param openIssuesCount The open_issues_count
     */
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     * @return The forks
     */
    public Integer getForks() {
        return forks;
    }

    /**
     * @param forks The forks
     */
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    /**
     * @return The openIssues
     */
    public Integer getOpenIssues() {
        return openIssues;
    }

    /**
     * @param openIssues The open_issues
     */
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    /**
     * @return The watchers
     */
    public Integer getWatchers() {
        return watchers;
    }

    /**
     * @param watchers The watchers
     */
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    /**
     * @return The defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * @param defaultBranch The default_branch
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * @return The score
     */
    public Double getScore() {
        return score;
    }

    /**
     * @param score The score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(fullName).append(owner).append(_private)
                .append(htmlUrl).append(description).append(fork).append(url).append(forksUrl).append(keysUrl)
                .append(collaboratorsUrl).append(teamsUrl).append(hooksUrl).append(issueEventsUrl).append(eventsUrl)
                .append(assigneesUrl).append(branchesUrl).append(tagsUrl).append(blobsUrl).append(gitTagsUrl)
                .append(gitRefsUrl).append(treesUrl).append(statusesUrl).append(languagesUrl).append(stargazersUrl)
                .append(contributorsUrl).append(subscribersUrl).append(subscriptionUrl).append(commitsUrl)
                .append(gitCommitsUrl).append(commentsUrl).append(issueCommentUrl).append(contentsUrl)
                .append(compareUrl).append(mergesUrl).append(archiveUrl).append(downloadsUrl).append(issuesUrl)
                .append(pullsUrl).append(milestonesUrl).append(notificationsUrl).append(labelsUrl)
                .append(releasesUrl).append(createdAt).append(updatedAt).append(pushedAt).append(gitUrl)
                .append(sshUrl).append(cloneUrl).append(svnUrl).append(homepage).append(size)
                .append(stargazersCount).append(watchersCount).append(language).append(hasIssues)
                .append(hasDownloads).append(hasWiki).append(hasPages).append(forksCount).append(mirrorUrl)
                .append(openIssuesCount).append(forks).append(openIssues).append(watchers).append(defaultBranch)
                .append(score).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(fullName, rhs.fullName)
                .append(owner, rhs.owner).append(_private, rhs._private).append(htmlUrl, rhs.htmlUrl)
                .append(description, rhs.description).append(fork, rhs.fork).append(url, rhs.url)
                .append(forksUrl, rhs.forksUrl).append(keysUrl, rhs.keysUrl)
                .append(collaboratorsUrl, rhs.collaboratorsUrl).append(teamsUrl, rhs.teamsUrl)
                .append(hooksUrl, rhs.hooksUrl).append(issueEventsUrl, rhs.issueEventsUrl)
                .append(eventsUrl, rhs.eventsUrl).append(assigneesUrl, rhs.assigneesUrl)
                .append(branchesUrl, rhs.branchesUrl).append(tagsUrl, rhs.tagsUrl).append(blobsUrl, rhs.blobsUrl)
                .append(gitTagsUrl, rhs.gitTagsUrl).append(gitRefsUrl, rhs.gitRefsUrl)
                .append(treesUrl, rhs.treesUrl).append(statusesUrl, rhs.statusesUrl)
                .append(languagesUrl, rhs.languagesUrl).append(stargazersUrl, rhs.stargazersUrl)
                .append(contributorsUrl, rhs.contributorsUrl).append(subscribersUrl, rhs.subscribersUrl)
                .append(subscriptionUrl, rhs.subscriptionUrl).append(commitsUrl, rhs.commitsUrl)
                .append(gitCommitsUrl, rhs.gitCommitsUrl).append(commentsUrl, rhs.commentsUrl)
                .append(issueCommentUrl, rhs.issueCommentUrl).append(contentsUrl, rhs.contentsUrl)
                .append(compareUrl, rhs.compareUrl).append(mergesUrl, rhs.mergesUrl)
                .append(archiveUrl, rhs.archiveUrl).append(downloadsUrl, rhs.downloadsUrl)
                .append(issuesUrl, rhs.issuesUrl).append(pullsUrl, rhs.pullsUrl)
                .append(milestonesUrl, rhs.milestonesUrl).append(notificationsUrl, rhs.notificationsUrl)
                .append(labelsUrl, rhs.labelsUrl).append(releasesUrl, rhs.releasesUrl)
                .append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(pushedAt, rhs.pushedAt)
                .append(gitUrl, rhs.gitUrl).append(sshUrl, rhs.sshUrl).append(cloneUrl, rhs.cloneUrl)
                .append(svnUrl, rhs.svnUrl).append(homepage, rhs.homepage).append(size, rhs.size)
                .append(stargazersCount, rhs.stargazersCount).append(watchersCount, rhs.watchersCount)
                .append(language, rhs.language).append(hasIssues, rhs.hasIssues)
                .append(hasDownloads, rhs.hasDownloads).append(hasWiki, rhs.hasWiki).append(hasPages, rhs.hasPages)
                .append(forksCount, rhs.forksCount).append(mirrorUrl, rhs.mirrorUrl)
                .append(openIssuesCount, rhs.openIssuesCount).append(forks, rhs.forks)
                .append(openIssues, rhs.openIssues).append(watchers, rhs.watchers)
                .append(defaultBranch, rhs.defaultBranch).append(score, rhs.score).isEquals();
    }

}
