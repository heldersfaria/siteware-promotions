package br.com.siteware.promotions.mappers;

import br.com.siteware.promotions.dto.ProductDto;
import br.com.siteware.promotions.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductModelToDtoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDto> convertModels(List<Product> models)
    {
        return null;
    }


    public ProductDto convertModel(Product model)
    {
        return null;
    }

}
