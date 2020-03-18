package com.zjy.mapper;

import com.zjy.entity.TestEntity;
import com.zjy.entity.TypeListEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    void add(@Param("number") Integer number);

    List<TypeListEntity> getType();

    List<TestEntity> getResult(@Param("list") List<TypeListEntity> list);
}
