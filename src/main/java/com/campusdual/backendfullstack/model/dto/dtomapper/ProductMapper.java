package com.campusdual.backendfullstack.model.dto.dtomapper;

import com.campusdual.backendfullstack.model.Product;
import com.campusdual.backendfullstack.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);

    List<ProductDTO> toDTOList(List<Product> products);

    Product toEntity(ProductDTO productdto);
}
