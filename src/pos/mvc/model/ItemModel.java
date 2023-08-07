/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author Dell
 */
public class ItemModel {
    private String itemCode;
    private String description;
    private String packSize;
    private Double unitPrize;
    private Integer qoh;

    public ItemModel() {
    }

    public ItemModel(String itemCode, String description, String packSize, Double unitPrize, Integer qoh) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrize = unitPrize;
        this.qoh = qoh;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrize
     */
    public Double getUnitPrize() {
        return unitPrize;
    }

    /**
     * @param unitPrize the unitPrize to set
     */
    public void setUnitPrize(Double unitPrize) {
        this.unitPrize = unitPrize;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemModel{" + "itemCode=" + itemCode + ", description=" + description + ", packSize=" + packSize + ", unitPrize=" + unitPrize + ", qoh=" + qoh + '}';
    }
   
    
    
}
