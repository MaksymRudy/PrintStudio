package model;

import java.util.List;
import java.util.Map;

public class Product {

    private Type name;
    private Service service;
    private Long id;
    private Map<Company, List<Price>> companyToPrices;
}
