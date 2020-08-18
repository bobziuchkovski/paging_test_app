# Paging Test App

This is a simple test app to demonstrate the androidx paging v3 viewModelScope issue I reported
[here](https://issuetracker.google.com/issues/164791572).

Uncommenting line 23 in TestViewModel causes the following compilation error:

```
TestViewModel.java:23: error: cannot find symbol
         PagingRx.cachedIn(this.flowable, viewModelScope);
                                          ^
  symbol:   variable viewModelScope
  location: class TestViewModel
```