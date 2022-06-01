package com.api;


import com.api.model.entity.Category;
import com.api.model.entity.Customer;
import com.api.model.entity.Product;
import com.api.model.entity.Seller;
import com.api.repository.CategoryRepository;
import com.api.repository.CustomerRepository;
import com.api.repository.ProductRepository;
import com.api.repository.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class DbLoader implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    private final SellerRepository sellerRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Product> productList= new ArrayList<>();
        List<Category> categoryList= new ArrayList<>();
        for (int i=1;i<5;i++){
            Category category= new Category();
            category.setName("category"+i);
            categoryList.add(category);
        }
        categoryRepository.saveAllAndFlush(categoryList);
        categoryList.clear();
        categoryList=categoryRepository.findAll();

        for (int i=1;i<3;i++){
            Product product = new Product();
            product.setName("urun"+i);
            product.setPrice(12.0+i);
            product.setCost(2.0+i);
            product.setCategory(categoryList.get(2));
            productList.add(product);
        }
        for (int i=1;i<3;i++){
            Product product = new Product();
            product.setName("urun"+i);
            product.setPrice(12.0+i);
            product.setCost(2.0+i);
            product.setCategory(categoryList.get(3));
            productList.add(product);
        }
        productRepository.saveAll(productList);



        List<Seller> sellerList= new ArrayList<>();
        for (int i=1;i<=4;i++){
            Seller seller= new Seller();
            seller.setUsername("seller"+i);
            seller.setMail("mail"+i+i+"@hotmail.c0m");
            seller.setPassword("pass"+i+i+i);
            seller.setShopName("shoppp"+(i+i)+"shop");
            seller.setTaxNo(String.valueOf(i*12345));
            sellerList.add(seller);
        }
        sellerRepository.saveAll(sellerList);


        List<Customer> customerList= new ArrayList<>();
        for (int i=1;i<=4;i++){
            Customer customer= new Customer();
            customer.setUsername("Customer"+i);
            customer.setMail("mail"+i+i+"@hotmail.c0m");
            customer.setPassword("pass"+i+i+i);
            customer.setBalance(new BigDecimal(123).multiply(new BigDecimal(i)));
            customer.setPhone("+90"+String.valueOf(i*12345));
            customerList.add(customer);
        }
        customerRepository.saveAll(customerList);



    }
}
