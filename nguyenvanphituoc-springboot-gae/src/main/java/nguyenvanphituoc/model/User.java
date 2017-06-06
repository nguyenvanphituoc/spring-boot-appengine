package nguyenvanphituoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import nguyenvanphituoc.util.Role;
import nguyenvanphituoc.util.SocialMediaService;

@Entity
public class User {
 
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="username", nullable = false, unique = true)
    private String username;

    @Column(name="password")
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "userRole", length = 20, nullable = false)
    private Role role;
 
    @Enumerated(EnumType.STRING)
    @Column(name = "sign_in_provider", length = 20)
    private SocialMediaService signInProvider;
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("User [id=").append(id).append(", username=").append(username).append(", password=").append(password).append("]");
        return builder.toString();
    }
    
    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  

    public Role getRole() {
 		return role;
 	}

 	public void setRole(Role role) {
 		this.role = role;
 	}

 	public SocialMediaService getSignInProvider() {
 		return signInProvider;
 	}

 	public void setSignInProvider(SocialMediaService signInProvider) {
 		this.signInProvider = signInProvider;
 	}
}
