package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbDevice;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.UsbDeviceConnectionTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13706o;

/* compiled from: UsbDeviceConnectionReceiver.kt */
public final class UsbDeviceConnectionReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action;
        UsbDevice usbDevice;
        UsbAccessory usbAccessory;
        Trigger next;
        if (intent != null && (action = intent.getAction()) != null) {
            boolean z = C13706o.m87924a(action, "android.hardware.usb.action.USB_DEVICE_ATTACHED") || C13706o.m87924a(action, "android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
            int hashCode = action.hashCode();
            if (hashCode == -2114103349 ? action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED") : hashCode == -1608292967 && action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            } else {
                usbDevice = null;
            }
            int hashCode2 = action.hashCode();
            if (hashCode2 == 1099555123 ? action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED") : hashCode2 == 1605365505 && action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
            } else {
                usbAccessory = null;
            }
            ArrayList<Macro> arrayList = new ArrayList<>();
            for (Macro next2 : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    if ((next instanceof UsbDeviceConnectionTrigger) && next.mo27845e0((TriggerContextInfo) null)) {
                        UsbDeviceConnectionTrigger usbDeviceConnectionTrigger = (UsbDeviceConnectionTrigger) next;
                        if ((usbDeviceConnectionTrigger.mo31574g3() == 0 && z) || (usbDeviceConnectionTrigger.mo31574g3() == 1 && !z)) {
                            next2.setTriggerThatInvoked(next);
                            String str = "";
                            String str2 = "?";
                        }
                    }
                }
                next2.setTriggerThatInvoked(next);
                String str3 = "";
                String str22 = "?";
                if (usbDevice != null) {
                    String productName = usbDevice.getProductName();
                    if (productName != null) {
                        str22 = productName;
                    }
                    String manufacturerName = usbDevice.getManufacturerName();
                    if (manufacturerName != null) {
                        str3 = manufacturerName;
                    }
                    next2.setTriggerContextInfo(TriggerContextInfo.m23362c(next, str22, str3));
                } else if (usbAccessory != null) {
                    String model = usbAccessory.getModel();
                    if (model != null) {
                        str22 = model;
                    }
                    String manufacturer = usbAccessory.getManufacturer();
                    if (manufacturer != null) {
                        str3 = manufacturer;
                    }
                    next2.setTriggerContextInfo(TriggerContextInfo.m23362c(next, str22, str3));
                }
                if (next2.canInvoke(next2.getTriggerContextInfo())) {
                    C13706o.m87928e(next2, "macro");
                    arrayList.add(next2);
                }
            }
            for (Macro macro : arrayList) {
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }
    }
}
