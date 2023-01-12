package com.rawsanj.bootjsp.domain;

import java.io.Serializable;

public class JmsMessage<T> implements Serializable {

    private String changeKind;

    private T newValue;

    public JmsMessage() {
    }

    public JmsMessage(String changeKind, T newValue) {
        this.changeKind = changeKind;
        this.newValue = newValue;
    }

    public String getChangeKind() {
        return changeKind;
    }

    public void setChangeKind(String changeKind) {
        this.changeKind = changeKind;
    }

    public T getNewValue() {
        return newValue;
    }

    public void setNewValue(T newValue) {
        this.newValue = newValue;
    }
}
