package com.example.PMS.controllers;

import com.example.PMS.models.product;
import com.example.PMS.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("products")
public class ProductsController {
    @Autowired
    private ProductsRepository repo;

    @GetMapping({"", "/"})
    public String showProductList(Model model){
        List<product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
