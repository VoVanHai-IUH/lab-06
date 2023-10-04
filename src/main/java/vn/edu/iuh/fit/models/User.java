package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "firstName", nullable = true, length = 50)
    private String firstName;
    @Basic
    @Column(name = "middleName", nullable = true, length = 50)
    private String middleName;
    @Basic
    @Column(name = "lastName", nullable = true, length = 50)
    private String lastName;
    @Basic
    @Column(name = "mobile", nullable = true, length = 15)
    private String mobile;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "passwordHash", nullable = false, length = 32)
    private String passwordHash;
    @Basic
    @Column(name = "registeredAt", nullable = false)
    private Timestamp registeredAt;
    @Basic
    @Column(name = "lastLogin", nullable = true)
    private Timestamp lastLogin;
    @Basic
    @Column(name = "intro", nullable = true)
    private String intro;
    @Basic
    @Column(name = "profile", nullable = true, length = -1)
    private String profile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(firstName, user.firstName) && Objects.equals(middleName, user.middleName) && Objects.equals(lastName, user.lastName) && Objects.equals(mobile, user.mobile) && Objects.equals(email, user.email) && Objects.equals(passwordHash, user.passwordHash) && Objects.equals(registeredAt, user.registeredAt) && Objects.equals(lastLogin, user.lastLogin) && Objects.equals(intro, user.intro) && Objects.equals(profile, user.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, mobile, email, passwordHash, registeredAt, lastLogin, intro, profile);
    }
}
