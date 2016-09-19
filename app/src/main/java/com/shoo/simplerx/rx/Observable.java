package com.shoo.simplerx.rx;

/**
 * Created by Shoo on 16-9-19.
 */
public class Observable<T> {

    IAction<Subscriber<T>> action;

    public static <T> Observable<T> just(T t) {
        return create(new Action<>(t));
    }

    public static <T> Observable<T> create(IAction<Subscriber<T>> action) {
        return new Observable<>(action);
    }

    private Observable(IAction<Subscriber<T>> action) {
        this.action = action;
    }

    public void subscribe(Subscriber<T> subscriber) {
        action.call(subscriber);
    }
}
