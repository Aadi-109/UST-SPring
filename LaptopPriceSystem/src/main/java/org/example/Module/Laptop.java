package org.example.Module;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Laptop")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String brand;
    private int storage;
    private double price;
    private int ramSize;
    private String processor;
}

