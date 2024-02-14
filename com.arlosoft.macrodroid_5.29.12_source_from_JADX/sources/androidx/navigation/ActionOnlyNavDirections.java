package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;

public final class ActionOnlyNavDirections implements NavDirections {
    private final int mActionId;

    public ActionOnlyNavDirections(int i) {
        this.mActionId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ActionOnlyNavDirections.class == obj.getClass() && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
    }

    public int getActionId() {
        return this.mActionId;
    }

    @NonNull
    public Bundle getArguments() {
        return new Bundle();
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ")";
    }
}
