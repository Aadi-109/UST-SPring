package org.example.Service;

import org.example.Module.Laptop;
import org.example.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LaptopService
{
    @Autowired
    private LaptopRepository laptopRepo;

    public Laptop addLaptop(Laptop lap)
    {
        return laptopRepo.save(lap);
    }

    public List<Laptop> getLaptopUnderBudgetwithspecificcriteria(int ram, String store, double maxPrice, String pross, String bran) {
        return laptopRepo.findAll().stream()
                .filter(laptop -> laptop.getPrice() <= maxPrice)
                .filter(laptop -> Objects.equals(laptop.getProcessor(), pross))
                .filter(laptop -> Objects.equals(laptop.getBrand(), bran))
                .filter(laptop -> Objects.equals(laptop.getStorage(), store))
                .filter(laptop -> laptop.getRamSize() == ram)
                .toList();
    }

}
