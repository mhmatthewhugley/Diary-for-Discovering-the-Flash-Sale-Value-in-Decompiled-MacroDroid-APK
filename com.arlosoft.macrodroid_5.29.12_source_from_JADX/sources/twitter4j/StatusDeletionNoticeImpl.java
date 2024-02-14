package twitter4j;

import java.io.Serializable;

class StatusDeletionNoticeImpl implements StatusDeletionNotice, Serializable {
    private static final long serialVersionUID = 9144204870473786368L;
    private final long statusId;
    private final long userId;

    StatusDeletionNoticeImpl(JSONObject jSONObject) {
        this.statusId = ParseUtil.getLong("id", jSONObject);
        this.userId = ParseUtil.getLong("user_id", jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusDeletionNoticeImpl statusDeletionNoticeImpl = (StatusDeletionNoticeImpl) obj;
        return this.statusId == statusDeletionNoticeImpl.statusId && this.userId == statusDeletionNoticeImpl.userId;
    }

    public long getStatusId() {
        return this.statusId;
    }

    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        long j = this.statusId;
        long j2 = this.userId;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "StatusDeletionNoticeImpl{statusId=" + this.statusId + ", userId=" + this.userId + '}';
    }

    public int compareTo(StatusDeletionNotice statusDeletionNotice) {
        long statusId2 = this.statusId - statusDeletionNotice.getStatusId();
        if (statusId2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (statusId2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) statusId2;
    }
}
