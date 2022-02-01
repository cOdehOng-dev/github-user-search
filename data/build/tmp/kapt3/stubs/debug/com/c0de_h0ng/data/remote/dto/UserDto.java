package com.c0de_h0ng.data.remote.dto;

import java.lang.System;

/**
 * Created by c0de_h0ng on 2022/02/02.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/c0de_h0ng/data/remote/dto/UserDto;", "", "isIncompleteResults", "", "userList", "", "Lcom/c0de_h0ng/data/remote/dto/Item;", "totalCount", "", "(ZLjava/util/List;I)V", "()Z", "getTotalCount", "()I", "getUserList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "data_debug"})
public final class UserDto {
    @com.google.gson.annotations.SerializedName(value = "incomplete_results")
    private final boolean isIncompleteResults = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.List<com.c0de_h0ng.data.remote.dto.Item> userList = null;
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int totalCount = 0;
    
    /**
     * Created by c0de_h0ng on 2022/02/02.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.c0de_h0ng.data.remote.dto.UserDto copy(boolean isIncompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.c0de_h0ng.data.remote.dto.Item> userList, int totalCount) {
        return null;
    }
    
    /**
     * Created by c0de_h0ng on 2022/02/02.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by c0de_h0ng on 2022/02/02.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by c0de_h0ng on 2022/02/02.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserDto(boolean isIncompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.c0de_h0ng.data.remote.dto.Item> userList, int totalCount) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isIncompleteResults() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.c0de_h0ng.data.remote.dto.Item> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.c0de_h0ng.data.remote.dto.Item> getUserList() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
}