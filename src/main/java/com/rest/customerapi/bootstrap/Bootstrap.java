package com.rest.customerapi.bootstrap;

import com.rest.customerapi.domain.Category;
import com.rest.customerapi.domain.Customer;
import com.rest.customerapi.domain.Vendor;
import com.rest.customerapi.repositories.CategoryRepository;
import com.rest.customerapi.repositories.CustomerRepository;
import com.rest.customerapi.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;
    private VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository,VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCustomers();
        loadCategories();
        loadVendors();

    }

    private void loadCategories(){
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dreied");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Data loaded = " + categoryRepository.count());
    }

    private void loadCustomers(){

        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstName("Chuck");
        customer1.setLastName("Norris");

        Customer customer2= new Customer();
        customer2.setId(2L);
        customer2.setFirstName("Lara");
        customer2.setLastName("Croft");

        customerRepository.save(customer1);
        customerRepository.save(customer2);

        System.out.println("Customers loaded = " + customerRepository.count());
    }

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setName("Vendor 1");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setName("Vendor 2");
        vendorRepository.save(vendor2);

    }
}
