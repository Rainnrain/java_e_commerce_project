package company;

import company.category.Category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remainingStock;
    private UUID categoryID;

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStock, UUID categoryID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingStock = remainingStock;
        this.categoryID = categoryID;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public UUID getCategoryID() {
        return categoryID;
    }

    public void setRemainingStock(Integer remainingStock) {
        this.remainingStock = remainingStock;
    }

    public String getCategoryName() throws Exception{
        for(Category category : StaticConstants.CATEGORY_LIST){
            if(getCategoryID().toString().equals(category.getId().toString())){
                return category.getName();
            }
        }
        throw new Exception("Category not found, " +getName());
    }

    public LocalDateTime getDeliveryDueDate() throws Exception{
        for(Category category: StaticConstants.CATEGORY_LIST){
            if(getCategoryID().toString().equals(category.getId().toString())){
                return category.findDeliveryDueDate();
            }
        }
        throw new Exception("Category could not be found");
    }
}
