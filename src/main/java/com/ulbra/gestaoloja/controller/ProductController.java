package com.ulbra.gestaoloja.controller;

import com.ulbra.gestaoloja.model.Product;
import com.ulbra.gestaoloja.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/")
    public String list(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }

    @RequestMapping("/save")
    public String save(Product product){
        productRepository.save(product);
        return "redirect:/";
    }
}
