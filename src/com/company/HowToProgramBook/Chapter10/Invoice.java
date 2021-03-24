package com.company.HowToProgramBook.Chapter10;
// Invoice class that implements Payable.

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // four-argument constructor
    public Invoice(String part, String description, int count,
                   double price) {
        partNumber = part;
        partDescription = description;
        setQuantity(count); // validate and store quantity
        setPricePerItem(price); // validate and store price per item
    } // end four-argument Invoice constructor

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    // set quantity
    public void setQuantity(int count) {
        if (count >= 0)
            quantity = count;
        else
            throw new IllegalArgumentException("Quantity must be >= 0");

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double price) {
        if (price >= 0.0)
            pricePerItem = price;
        else
            throw new IllegalArgumentException(
                    "Price per item must be >= 0");
    }

    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost
    } // end method getPaymentAmount

}