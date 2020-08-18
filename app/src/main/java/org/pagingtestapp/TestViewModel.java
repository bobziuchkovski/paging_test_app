package org.pagingtestapp;

import androidx.lifecycle.ViewModel;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.rxjava3.PagingRx;

import io.reactivex.rxjava3.core.Flowable;

public class TestViewModel extends ViewModel {
    final Pager<Integer, String> pager;
    final Flowable<PagingData<String>> flowable;

    public TestViewModel() {
        this.pager = new Pager<Integer, String>(
                new PagingConfig(20),
                () -> { return new TestPagingSource(); }
        );
        this.flowable = PagingRx.getFlowable(pager);

        // The following line won't compile due to missing viewModelScope reference
        // PagingRx.cachedIn(this.flowable, viewModelScope);
    }
}