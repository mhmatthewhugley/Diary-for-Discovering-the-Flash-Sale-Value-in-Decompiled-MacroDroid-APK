package org.mockito.exceptions.base;

import java.io.ObjectStreamException;

public class MockitoSerializationIssue extends ObjectStreamException {
    private StackTraceElement[] unfilteredStackTrace;
}
