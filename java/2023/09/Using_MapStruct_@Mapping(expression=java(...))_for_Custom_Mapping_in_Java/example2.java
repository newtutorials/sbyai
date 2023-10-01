@Mapper(componentModel = "spring")
public interface MyMapper {
    @Mapping(source = "sourceProperty", target = "targetProperty", expression = "java(com.example.MyCustomMapper.customMapping(source.getProperty()))")
    TargetClass map(SourceClass source);
}
