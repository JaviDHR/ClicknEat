package com.dam2.clickneat.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 * Created by ferna on 29/04/2017.
 */

public abstract class BaseClass<T>  {

    @Expose(serialize = false, deserialize = false)
    private Class<T> type;

    @Expose(serialize = false, deserialize = false)
    private TypeToken<T> listType;

    public BaseClass(Class<T> type, TypeToken<T> listType) {

        this.type       = type;
        this.listType   = listType;
    }

    public Class<T> getType() {

        return this.type;
    }

    public Type getListType() {

        return this.listType.getType();
    }

}
