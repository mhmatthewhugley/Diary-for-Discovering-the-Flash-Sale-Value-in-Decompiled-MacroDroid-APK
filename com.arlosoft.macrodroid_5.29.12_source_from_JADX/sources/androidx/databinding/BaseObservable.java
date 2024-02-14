package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.Observable;

public class BaseObservable implements Observable {
    private transient PropertyChangeRegistry mCallbacks;

    public void addOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new PropertyChangeRegistry();
            }
        }
        this.mCallbacks.add(onPropertyChangedCallback);
    }

    public void notifyChange() {
        synchronized (this) {
            PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
            if (propertyChangeRegistry != null) {
                propertyChangeRegistry.notifyCallbacks(this, 0, null);
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
            if (propertyChangeRegistry != null) {
                propertyChangeRegistry.notifyCallbacks(this, i, null);
            }
        }
    }

    public void removeOnPropertyChangedCallback(@NonNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
            if (propertyChangeRegistry != null) {
                propertyChangeRegistry.remove(onPropertyChangedCallback);
            }
        }
    }
}
