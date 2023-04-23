/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String email;
    private String firstName;
    private String lastName;
    private String mothersName;
    private String taxId;
    private String socialSecurityNumber;
    private LocalDate dateOfBirth;
    private String placeOfBirth;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.email = value.email;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.mothersName = value.mothersName;
        this.taxId = value.taxId;
        this.socialSecurityNumber = value.socialSecurityNumber;
        this.dateOfBirth = value.dateOfBirth;
        this.placeOfBirth = value.placeOfBirth;
    }

    public User(
        UUID id,
        String email,
        String firstName,
        String lastName,
        String mothersName,
        String taxId,
        String socialSecurityNumber,
        LocalDate dateOfBirth,
        String placeOfBirth
    ) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mothersName = mothersName;
        this.taxId = taxId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.user.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>public.user.email</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>public.user.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>public.user.first_name</code>.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for <code>public.user.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>public.user.last_name</code>.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for <code>public.user.mothers_name</code>.
     */
    public String getMothersName() {
        return this.mothersName;
    }

    /**
     * Setter for <code>public.user.mothers_name</code>.
     */
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    /**
     * Getter for <code>public.user.tax_id</code>.
     */
    public String getTaxId() {
        return this.taxId;
    }

    /**
     * Setter for <code>public.user.tax_id</code>.
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Getter for <code>public.user.social_security_number</code>.
     */
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    /**
     * Setter for <code>public.user.social_security_number</code>.
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Getter for <code>public.user.date_of_birth</code>.
     */
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Setter for <code>public.user.date_of_birth</code>.
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for <code>public.user.place_of_birth</code>.
     */
    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    /**
     * Setter for <code>public.user.place_of_birth</code>.
     */
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!this.firstName.equals(other.firstName))
            return false;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!this.lastName.equals(other.lastName))
            return false;
        if (this.mothersName == null) {
            if (other.mothersName != null)
                return false;
        }
        else if (!this.mothersName.equals(other.mothersName))
            return false;
        if (this.taxId == null) {
            if (other.taxId != null)
                return false;
        }
        else if (!this.taxId.equals(other.taxId))
            return false;
        if (this.socialSecurityNumber == null) {
            if (other.socialSecurityNumber != null)
                return false;
        }
        else if (!this.socialSecurityNumber.equals(other.socialSecurityNumber))
            return false;
        if (this.dateOfBirth == null) {
            if (other.dateOfBirth != null)
                return false;
        }
        else if (!this.dateOfBirth.equals(other.dateOfBirth))
            return false;
        if (this.placeOfBirth == null) {
            if (other.placeOfBirth != null)
                return false;
        }
        else if (!this.placeOfBirth.equals(other.placeOfBirth))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.mothersName == null) ? 0 : this.mothersName.hashCode());
        result = prime * result + ((this.taxId == null) ? 0 : this.taxId.hashCode());
        result = prime * result + ((this.socialSecurityNumber == null) ? 0 : this.socialSecurityNumber.hashCode());
        result = prime * result + ((this.dateOfBirth == null) ? 0 : this.dateOfBirth.hashCode());
        result = prime * result + ((this.placeOfBirth == null) ? 0 : this.placeOfBirth.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(mothersName);
        sb.append(", ").append(taxId);
        sb.append(", ").append(socialSecurityNumber);
        sb.append(", ").append(dateOfBirth);
        sb.append(", ").append(placeOfBirth);

        sb.append(")");
        return sb.toString();
    }
}
