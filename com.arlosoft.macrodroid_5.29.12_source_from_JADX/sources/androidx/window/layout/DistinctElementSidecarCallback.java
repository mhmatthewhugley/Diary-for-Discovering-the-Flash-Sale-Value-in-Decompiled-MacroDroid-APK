package androidx.window.layout;

import android.os.IBinder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    @GuardedBy("mLock")
    private final Map<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
    private final SidecarAdapter mAdapter;
    private final SidecarInterface.SidecarCallback mCallback;
    @GuardedBy("mLock")
    private SidecarDeviceState mLastDeviceState;
    private final Object mLock;

    DistinctElementSidecarCallback(@NonNull SidecarAdapter sidecarAdapter, @NonNull SidecarInterface.SidecarCallback sidecarCallback) {
        this.mLock = new Object();
        this.mActivityWindowLayoutInfo = new WeakHashMap();
        this.mAdapter = sidecarAdapter;
        this.mCallback = sidecarCallback;
    }

    public void onDeviceStateChanged(@NonNull SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.mLock) {
                if (!this.mAdapter.isEqualSidecarDeviceState(this.mLastDeviceState, sidecarDeviceState)) {
                    this.mLastDeviceState = sidecarDeviceState;
                    this.mCallback.onDeviceStateChanged(sidecarDeviceState);
                }
            }
        }
    }

    public void onWindowLayoutChanged(@NonNull IBinder iBinder, @NonNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.mLock) {
            if (!this.mAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(iBinder), sidecarWindowLayoutInfo)) {
                this.mActivityWindowLayoutInfo.put(iBinder, sidecarWindowLayoutInfo);
                this.mCallback.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    @VisibleForTesting
    DistinctElementSidecarCallback(@NonNull SidecarInterface.SidecarCallback sidecarCallback) {
        this.mLock = new Object();
        this.mActivityWindowLayoutInfo = new WeakHashMap();
        this.mAdapter = new SidecarAdapter();
        this.mCallback = sidecarCallback;
    }
}
