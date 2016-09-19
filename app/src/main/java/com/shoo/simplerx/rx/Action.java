package com.shoo.simplerx.rx;

/**
 * Created by Shoo on 16-9-19.
 */
public class Action<T> implements IAction<Subscriber<T>> {

    T t;

    public Action(T t) {
        this.t = t;
    }

    @Override
    public void call(Subscriber<T> mySubscriber) {
        mySubscriber.onNext(t);
        mySubscriber.onCompleted();
    }
}
