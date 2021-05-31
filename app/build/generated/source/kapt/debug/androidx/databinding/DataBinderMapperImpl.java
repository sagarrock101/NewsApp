package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.sagarock101.newsapp.DataBinderMapperImpl());
  }
}
