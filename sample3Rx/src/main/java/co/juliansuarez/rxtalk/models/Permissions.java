package co.juliansuarez.rxtalk.models;

import com.google.gson.annotations.Expose;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by julian on 7/30/15.
 */
public class Permissions {

    @Expose
    private Boolean admin;
    @Expose
    private Boolean push;
    @Expose
    private Boolean pull;

    /**
     * @return The admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * @param admin The admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * @return The push
     */
    public Boolean getPush() {
        return push;
    }

    /**
     * @param push The push
     */
    public void setPush(Boolean push) {
        this.push = push;
    }

    /**
     * @return The pull
     */
    public Boolean getPull() {
        return pull;
    }

    /**
     * @param pull The pull
     */
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(admin).append(push).append(pull).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Permissions)) {
            return false;
        }
        Permissions rhs = ((Permissions) other);
        return new EqualsBuilder().append(admin, rhs.admin).append(push, rhs.push).append(pull, rhs.pull).isEquals();
    }

}
