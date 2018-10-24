package com.rest.customerapi.api.v1.mapper;

import com.rest.customerapi.api.v1.model.CategoryDTO;
import com.rest.customerapi.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryTOCategoryDTO(Category category);
}
