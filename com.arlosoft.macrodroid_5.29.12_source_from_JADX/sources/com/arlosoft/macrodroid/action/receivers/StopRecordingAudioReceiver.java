package com.arlosoft.macrodroid.action.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.action.RecordMicrophoneAction;

public class StopRecordingAudioReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        RecordMicrophoneAction.m12017M3();
    }
}
