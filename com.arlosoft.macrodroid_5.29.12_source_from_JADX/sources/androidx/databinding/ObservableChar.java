package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableChar extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new Parcelable.Creator<ObservableChar>() {
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    };
    static final long serialVersionUID = 1;
    private char mValue;

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public int describeContents() {
        return 0;
    }

    public char get() {
        return this.mValue;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    public ObservableChar() {
    }

    public ObservableChar(Observable... observableArr) {
        super(observableArr);
    }
}
