package com.example.book.controller;

import com.example.book.Bean.Book;
import com.example.book.Bean.Carts;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    static List<Carts> list = new ArrayList<>();
    int id = 0;
    @PostMapping("/add")
    public Boolean add(@RequestBody List<Book>book){
        Carts carts = new Carts(id++,book);
        list.add(carts);
        return true;
    }
    @GetMapping("/list")
    public List<Carts> getCarList(){
        return list;
    }
    @GetMapping("list/{id}")
    public Carts getCartByid(@PathVariable int id){
        for (Carts carts : list){
            if (carts.getCartid()==id)
                return carts;
        }

        return new Carts(0,null);
    }
}
