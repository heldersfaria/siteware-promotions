package br.com.siteware.promotions.service;

import br.com.siteware.promotions.model.Product;
import br.com.siteware.promotions.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return null;
    }

    public Product findById(long id) {
        return null;
    }

    public Product Save(Product product) {
        return null;
    }

    public void deleteById(long id) {

    }
}
