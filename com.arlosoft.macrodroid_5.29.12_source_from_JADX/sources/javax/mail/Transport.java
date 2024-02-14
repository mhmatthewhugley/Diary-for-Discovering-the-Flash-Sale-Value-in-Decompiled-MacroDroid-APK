package javax.mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.mail.event.TransportEvent;
import javax.mail.event.TransportListener;

public abstract class Transport extends Service {
    private volatile Vector<TransportListener> transportListeners = null;

    public Transport(Session session, URLName uRLName) {
        super(session, uRLName);
    }

    public static void send(Message message) throws MessagingException {
        message.saveChanges();
        send0(message, message.getAllRecipients(), (String) null, (String) null);
    }

    private static void send0(Message message, Address[] addressArr, String str, String str2) throws MessagingException {
        Address[] addressArr2;
        Address[] addressArr3;
        Message message2 = message;
        Address[] addressArr4 = addressArr;
        String str3 = str;
        if (addressArr4 == null || addressArr4.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < addressArr4.length; i++) {
            if (hashMap.containsKey(addressArr4[i].getType())) {
                ((List) hashMap.get(addressArr4[i].getType())).add(addressArr4[i]);
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(addressArr4[i]);
                hashMap.put(addressArr4[i].getType(), arrayList4);
            }
        }
        int size = hashMap.size();
        if (size != 0) {
            Session session = message2.session;
            Address[] addressArr5 = null;
            if (session == null) {
                session = Session.getDefaultInstance(System.getProperties(), (Authenticator) null);
            }
            if (size == 1) {
                Transport transport = session.getTransport(addressArr4[0]);
                if (str3 != null) {
                    try {
                        transport.connect(str3, str2);
                    } catch (Throwable th) {
                        transport.close();
                        throw th;
                    }
                } else {
                    transport.connect();
                }
                transport.sendMessage(message2, addressArr4);
                transport.close();
                return;
            }
            SendFailedException sendFailedException = null;
            boolean z = false;
            for (List list : hashMap.values()) {
                int size2 = list.size();
                Address[] addressArr6 = new Address[size2];
                list.toArray(addressArr6);
                Transport transport2 = session.getTransport(addressArr6[0]);
                if (transport2 == null) {
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList.add(addressArr6[i2]);
                    }
                } else {
                    try {
                        transport2.connect();
                        transport2.sendMessage(message2, addressArr6);
                        transport2.close();
                    } catch (SendFailedException e) {
                        if (sendFailedException == null) {
                            sendFailedException = e;
                        } else {
                            sendFailedException.setNextException(e);
                        }
                        Address[] invalidAddresses = e.getInvalidAddresses();
                        if (invalidAddresses != null) {
                            for (Address add : invalidAddresses) {
                                arrayList.add(add);
                            }
                        }
                        Address[] validSentAddresses = e.getValidSentAddresses();
                        if (validSentAddresses != null) {
                            for (Address add2 : validSentAddresses) {
                                arrayList2.add(add2);
                            }
                        }
                        Address[] validUnsentAddresses = e.getValidUnsentAddresses();
                        if (validUnsentAddresses != null) {
                            for (Address add3 : validUnsentAddresses) {
                                arrayList3.add(add3);
                            }
                        }
                        transport2.close();
                        z = true;
                    } catch (MessagingException e2) {
                        if (sendFailedException == null) {
                            sendFailedException = e2;
                        } else {
                            sendFailedException.setNextException(e2);
                        }
                        transport2.close();
                        z = true;
                    } catch (Throwable th2) {
                        transport2.close();
                        throw th2;
                    }
                }
            }
            if (z || arrayList.size() != 0 || arrayList3.size() != 0) {
                if (arrayList2.size() > 0) {
                    Address[] addressArr7 = new Address[arrayList2.size()];
                    arrayList2.toArray(addressArr7);
                    addressArr2 = addressArr7;
                } else {
                    addressArr2 = null;
                }
                if (arrayList3.size() > 0) {
                    Address[] addressArr8 = new Address[arrayList3.size()];
                    arrayList3.toArray(addressArr8);
                    addressArr3 = addressArr8;
                } else {
                    addressArr3 = null;
                }
                if (arrayList.size() > 0) {
                    addressArr5 = new Address[arrayList.size()];
                    arrayList.toArray(addressArr5);
                }
                throw new SendFailedException("Sending failed", sendFailedException, addressArr2, addressArr3, addressArr5);
            }
            return;
        }
        throw new SendFailedException("No recipient addresses");
    }

    public synchronized void addTransportListener(TransportListener transportListener) {
        if (this.transportListeners == null) {
            this.transportListeners = new Vector<>();
        }
        this.transportListeners.addElement(transportListener);
    }

    /* access modifiers changed from: protected */
    public void notifyTransportListeners(int i, Address[] addressArr, Address[] addressArr2, Address[] addressArr3, Message message) {
        if (this.transportListeners != null) {
            queueEvent(new TransportEvent(this, i, addressArr, addressArr2, addressArr3, message), this.transportListeners);
        }
    }

    public synchronized void removeTransportListener(TransportListener transportListener) {
        if (this.transportListeners != null) {
            this.transportListeners.removeElement(transportListener);
        }
    }

    public abstract void sendMessage(Message message, Address[] addressArr) throws MessagingException;

    public static void send(Message message, Address[] addressArr) throws MessagingException {
        message.saveChanges();
        send0(message, addressArr, (String) null, (String) null);
    }

    public static void send(Message message, String str, String str2) throws MessagingException {
        message.saveChanges();
        send0(message, message.getAllRecipients(), str, str2);
    }

    public static void send(Message message, Address[] addressArr, String str, String str2) throws MessagingException {
        message.saveChanges();
        send0(message, addressArr, str, str2);
    }
}
