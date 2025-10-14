
package za.ac.cput.carrental.domain;

/**
 *
 * @author Zahrah Vermaak 
 */
public class Rental {
    private String vehicleRegistration;
    private String customerId;
    private LocalDateTime dateOfCollection, dateOfReturn;

    public Rental() {
    }
    
    

    public Rental(String vehicleRegistration, String customerId, localDate dateOfCollection, localDate dateOfReturn) {
        this.vehicleRegistration = vehicleRegistration;
        this.customerId = customerId;
        this.dateOfCollection = dateOfCollection;
        this.dateOfReturn = dateOfReturn;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public String getCustomerId() {
        return customerId;
    }

    public localDate getDateOfCollection() {
        return dateOfCollection;
    }

    public localDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setDateOfCollection(localDate dateOfCollection) {
        this.dateOfCollection = dateOfCollection;
    }

    public void setDateOfReturn(localDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleRegistration=" + vehicleRegistration + ", customerId=" + customerId + ", dateOfCollection=" + dateOfCollection + ", dateOfReturn=" + dateOfReturn + '}';
    }
    
    
    
    
    
}
