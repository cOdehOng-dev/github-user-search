package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.c0de_h0ng.presentation.DataBinderMapperImpl());
  }
}
