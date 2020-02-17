package br.com.siteware.promotions.controller;

import br.com.siteware.promotions.dto.ShoppingCartDto;
import br.com.siteware.promotions.service.ShoppingCartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/shopping-cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartProductService service;

    @PostMapping
    public ResponseEntity<ShoppingCartDto> findById(@RequestBody ShoppingCartDto cart)  {
        return new ResponseEntity<ShoppingCartDto>(service.processCart(cart), OK);
    }
}
