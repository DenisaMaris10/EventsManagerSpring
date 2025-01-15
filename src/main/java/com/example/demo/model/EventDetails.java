package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity{

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotBlank(message = "Message is required")
    @Email(message = "Invalid email. Try again")
    private String contactEmail;

    public EventDetails(String description, String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }

    public EventDetails(){}

    public String getDescription() {
        return description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
