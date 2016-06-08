package co.juliansuarez.rxtalk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by julian on 8/5/15.
 */
public class RepoSearchResults {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("incomplete_results")
    @Expose
    private Boolean incompleteResults;
    @Expose
    private List<Item> items = new ArrayList<Item>();

    /**
     * @return The totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount The total_count
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return The incompleteResults
     */
    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    /**
     * @param incompleteResults The incomplete_results
     */
    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    /**
     * @return The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalCount).append(incompleteResults).append(items).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepoSearchResults) == false) {
            return false;
        }
        RepoSearchResults rhs = ((RepoSearchResults) other);
        return new EqualsBuilder().append(totalCount, rhs.totalCount).append(incompleteResults, rhs.incompleteResults).append(items, rhs.items).isEquals();
    }

}
