package org.example;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto
{

    @Min(value = 0, message = "Price should be a non-negative value")
    private double price;

    @NotBlank(message = "Processor type is mandatory")
    private String processor;

    @Min(value = 0, message = "Storage should be a non-negative value")
    private int storage;


}
