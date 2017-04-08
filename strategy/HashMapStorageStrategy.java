package com.javarush.task.task33.task3310.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanaria on 4/8/17.
 */
public class HashMapStorageStrategy implements StorageStrategy {
    /*
    5.2. Добавь в класс поле HashMap<Long, String> data. В нем будут храниться наши данные.
5.3. Реализуй в классе все необходимые методы. Реализации методов должны
использовать поле data. Дополнительные поля не создавать.
     */
    private HashMap<Long, String> data = new HashMap<>();
    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);

    }

    @Override
    public Long getKey(String value) {
        for (Map.Entry<Long, String> entry : data.entrySet())
        {
            if (entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
