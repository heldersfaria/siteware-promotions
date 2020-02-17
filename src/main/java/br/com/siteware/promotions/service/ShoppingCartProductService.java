package br.com.siteware.promotions.service;

import br.com.siteware.promotions.dto.ShoppingCartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartProductService {

    @Autowired
    private ProductService service;

    public ShoppingCartDto processCart(ShoppingCartDto cart) {
        return null;
    }
}
