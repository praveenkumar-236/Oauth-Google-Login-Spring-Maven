package com.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String userId; // User ID
    private String fullName; // Full name
    private String givenName; // Given name
    private String familyName; // Family name
    private String profilePictureUrl; // Profile picture URL
    private String email; // Email address
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }
    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User(String id, String userId, String fullName, String givenName, String familyName,
            String profilePictureUrl, String email) {
        this.id = id;
        this.userId = userId;
        this.fullName = fullName;
        this.givenName = givenName;
        this.familyName = familyName;
        this.profilePictureUrl = profilePictureUrl;
        this.email = email;
    }

}
