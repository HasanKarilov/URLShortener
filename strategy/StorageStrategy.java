package com.javarush.task.task33.task3310.strategy;

/**
 * Created by hanaria on 4/8/17.
 */
public interface StorageStrategy {
    boolean containsKey(Long key); // должен вернуть true, если хранилище имеет переданный ключ
    boolean containsValue(String value); // должен вернуть true, если хранилище имеет переданное значение
    void put(Long key, String value); // добавить в хранилище новую пару ключ
    Long getKey(String value); // вернуть ключ для переданного значения.
    String getValue(Long key); // вернуть значение для переданного ключа.
}
