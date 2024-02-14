package org.apache.harmony.awt.datatransfer;

import java.awt.Point;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;

public class DragSourceEventProxy implements Runnable {
    public static final int DRAG_ACTION_CHANGED = 3;
    public static final int DRAG_DROP_END = 6;
    public static final int DRAG_ENTER = 1;
    public static final int DRAG_EXIT = 5;
    public static final int DRAG_MOUSE_MOVED = 4;
    public static final int DRAG_OVER = 2;
    private final DragSourceContext context;
    private final int modifiers;
    private final boolean success;
    private final int targetActions;
    private final int type;
    private final int userAction;

    /* renamed from: x */
    private final int f65999x;

    /* renamed from: y */
    private final int f66000y;

    public DragSourceEventProxy(DragSourceContext dragSourceContext, int i, int i2, int i3, Point point, int i4) {
        this.context = dragSourceContext;
        this.type = i;
        this.userAction = i2;
        this.targetActions = i3;
        this.f65999x = point.x;
        this.f66000y = point.y;
        this.modifiers = i4;
        this.success = false;
    }

    private DragSourceDragEvent newDragSourceDragEvent() {
        return new DragSourceDragEvent(this.context, this.userAction, this.targetActions, this.modifiers, this.f65999x, this.f66000y);
    }

    public void run() {
        switch (this.type) {
            case 1:
                this.context.dragEnter(newDragSourceDragEvent());
                return;
            case 2:
                this.context.dragOver(newDragSourceDragEvent());
                return;
            case 3:
                this.context.dropActionChanged(newDragSourceDragEvent());
                return;
            case 4:
                this.context.dragMouseMoved(newDragSourceDragEvent());
                return;
            case 5:
                this.context.dragExit(new DragSourceEvent(this.context, this.f65999x, this.f66000y));
                return;
            case 6:
                this.context.dragExit(new DragSourceDropEvent(this.context, this.userAction, this.success, this.f65999x, this.f66000y));
                return;
            default:
                return;
        }
    }

    public DragSourceEventProxy(DragSourceContext dragSourceContext, int i, int i2, boolean z, Point point, int i3) {
        this.context = dragSourceContext;
        this.type = i;
        this.userAction = i2;
        this.targetActions = i2;
        this.f65999x = point.x;
        this.f66000y = point.y;
        this.modifiers = i3;
        this.success = z;
    }
}
