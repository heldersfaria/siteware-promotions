package br.com.siteware.promotions.controller;

import br.com.siteware.promotions.dto.ProductDto;
import br.com.siteware.promotions.dto.ResponseDto;
import br.com.siteware.promotions.mappers.ProductModelToDtoMapper;
import br.com.siteware.promotions.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private ProductModelToDtoMapper mapper;

    @GetMapping
    public ResponseEntity<ResponseDto<List<ProductDto>>> find() {
        List<ProductDto> dtos = mapper.convertModels(service.findAll());
        ResponseDto response = new ResponseDto<>(dtos);
        return new ResponseEntity<>(response, OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseDto<ProductDto>> findById(@PathVariable("id") String id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<ResponseDto<ProductDto>> save(@RequestBody ProductDto dto) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ResponseDto<ProductDto>> delte(@PathVariable("id") String id) {
        return null;
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ProductDto>> edit(@RequestBody ProductDto dto) {
        return null;
    }

}
