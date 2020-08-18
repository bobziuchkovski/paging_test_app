package org.pagingtestapp;

import androidx.paging.rxjava3.RxPagingSource;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import io.reactivex.rxjava3.core.Single;

public class TestPagingSource extends RxPagingSource<Integer, String> {
    @NotNull
    @Override
    public Single<LoadResult<Integer, String>> loadSingle(@NotNull LoadParams<Integer> loadParams) {
        LoadResult<Integer, String> result = new LoadResult.Page<Integer, String>(
                Arrays.asList("a", "b", "c"),
                null,
                null,
                0,
                0
        );
        return Single.just(result);
    }
}
