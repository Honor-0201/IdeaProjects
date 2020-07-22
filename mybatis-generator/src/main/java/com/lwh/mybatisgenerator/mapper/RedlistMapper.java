package com.lwh.mybatisgenerator.mapper;

import com.lwh.mybatisgenerator.domain.Redlist;
import java.util.List;

public interface RedlistMapper {
    int insert(Redlist record);

    List<Redlist> selectAll();
}