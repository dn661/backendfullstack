package com.campusdual.backendfullstack;

import com.campusdual.backendfullstack.model.Product;
import com.campusdual.backendfullstack.model.dao.ProductDao;
import com.campusdual.backendfullstack.model.dto.ProductDTO;
import com.campusdual.backendfullstack.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
@Lazy
public class ProductService implements IProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDTO queryProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        return ProductMapper.INSTANCE.toDTO(productDao.getReferenceById(product.getID()));
    }

    @Override
    public List<ProductDTO> queryAllProducts() {

        return ProductMapper.INSTANCE.toDTOList(productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDTO productDTO) {
        Product product  = ProductMapper.INSTANCE.toEntity(productDTO);
        productDao.saveAndFlush(product);
        return product.getID();
    }

    @Override
    public int updateProduct(ProductDTO productDTO) {
        return insertProduct(productDTO);
    }

    @Override
    public int deleteProduct(ProductDTO productDTO) {
        int id = productDTO.getID();
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);

        productDao.delete(product);

        return id;
    }
}
