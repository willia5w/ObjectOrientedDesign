package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;


public abstract class Service implements IService {
  private static final Integer BASE_RATE = 80;
  protected String invoiceID;
  protected String propertyAddress;
  protected PropertySize propertySize;
  protected Boolean monthly;
  protected Integer timesServiced;
  protected Double priceOfService;


  public Service(Integer BASE_RATE, String invoiceID, String propertyAddress, Boolean monthly,
                 Integer timesServiced, Double priceOfService) {
    this.invoiceID = invoiceID;
    this.propertyAddress = propertyAddress;
    this.monthly = monthly;
    this.timesServiced = timesServiced;
    this.priceOfService = priceOfService;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Service)) return false;
    Service service = (Service) o;
    return getInvoiceID().equals(service.getInvoiceID()) &&
        getPropertyAddress().equals(service.getPropertyAddress()) &&
        getMonthly().equals(service.getMonthly()) &&
        getTimesServiced().equals(service.getTimesServiced());
  }

  public int hashCode() {
    return Objects.hash(getInvoiceID(), getPropertyAddress(), getMonthly(), getTimesServiced());
  }

  public String getInvoiceID() {
    return invoiceID;
  }

  public String getPropertyAddress() {
    return propertyAddress;
  }

  public Boolean getMonthly() {
    return monthly;
  }

  public PropertySize getPropertySize() {
    return propertySize;
  }

  public Double getPriceOfService() {
    return priceOfService;
  }

  public Integer getTimesServiced() {
    return timesServiced;

  }
  public void frequencyDiscount() {
    if (monthly == true && timesServiced % 10 != 9) {
      priceOfService = priceOfService * 0.9;
    }
    if (monthly == true && timesServiced % 10 == 9) {
      priceOfService = priceOfService * 0.5;
    }
  }
  public Double calculatePrice() {
    baseFee();
    additionalFee();
    frequencyDiscount();
    return getPriceOfService();
  }

  public String toString() {
    String toString = super.toString();
    return toString;
  }
}
