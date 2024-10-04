package org.example.Controller;

import org.example.Module.Laptop;
import org.example.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController
{
    @Autowired
    private LaptopService laptopService;


    @PostMapping("/add")
    public Laptop addLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.addLaptop(laptop);
    }
    @GetMapping("/Specification")
    public List<Laptop> getLaptopSpecification(@RequestParam int maxPrice, @RequestParam int ram,
                                               @RequestParam String bran, @RequestParam String pross, @RequestParam String store)
    {
        return laptopService.getLaptopUnderBudgetwithspecificcriteria(ram,store,maxPrice,bran,pross);
    }
}
