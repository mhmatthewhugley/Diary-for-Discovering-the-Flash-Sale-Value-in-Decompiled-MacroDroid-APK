package com.google.api.client.googleapis.testing.notifications;

import com.google.api.client.googleapis.notifications.UnparsedNotificationCallback;
import com.google.api.client.util.Beta;

@Beta
public class MockUnparsedNotificationCallback implements UnparsedNotificationCallback {
    private static final long serialVersionUID = 0;
    private boolean wasCalled;
}
