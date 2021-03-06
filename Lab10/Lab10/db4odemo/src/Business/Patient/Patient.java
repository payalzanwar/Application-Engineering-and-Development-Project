/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author mantr
 */
public class Patient {
    public static int CustomerId = 0;
    private static int WalletId = 0;
    private String PatientUserId;
    private String PatientPassword;
    private String ReenterPatientPassword;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Gender;
    private String Height;
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String Country;
    private int Zipcode;
    private int Phone;
    private String Email;
    private String InsuranceId;
    private String InsuranceType;
    private String ProviderName;
    private String ProviderAddress;

    
    private UserAccountDirectory user;
    public Patient() {
        CustomerId++;
        WalletId++;
         user = new UserAccountDirectory();
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getWalletId() {
        return WalletId;
    }

    public void setWalletId(int WalletId) {
        this.WalletId = WalletId;
    }

    public String getPatientUserId() {
        return PatientUserId;
    }

    public void setPatientUserId(String PatientUserId) {
        this.PatientUserId = PatientUserId;
    }

    public String getPatientPassword() {
        return PatientPassword;
    }

    public void setPatientPassword(String PatientPassword) {
        this.PatientPassword = PatientPassword;
    }

    public String getReenterPatientPassword() {
        return ReenterPatientPassword;
    }

    public void setReenterPatientPassword(String ReenterPatientPassword) {
        this.ReenterPatientPassword = ReenterPatientPassword;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int Zipcode) {
        this.Zipcode = Zipcode;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getInsuranceId() {
        return InsuranceId;
    }

    public void setInsuranceId(String InsuranceId) {
        this.InsuranceId = InsuranceId;
    }

    public String getInsuranceType() {
        return InsuranceType;
    }

    public void setInsuranceType(String InsuranceType) {
        this.InsuranceType = InsuranceType;
    }

    public String getProviderName() {
        return ProviderName;
    }

    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    public String getProviderAddress() {
        return ProviderAddress;
    }

    public void setProviderAddress(String ProviderAddress) {
        this.ProviderAddress = ProviderAddress;
    }
   
    
    
    
}
