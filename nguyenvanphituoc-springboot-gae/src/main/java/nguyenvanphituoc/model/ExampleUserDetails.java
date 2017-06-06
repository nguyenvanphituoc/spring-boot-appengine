package nguyenvanphituoc.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.security.SocialUser;
import nguyenvanphituoc.util.*;
public class ExampleUserDetails extends SocialUser{

	private Long id;
	 
    private String username;
 
    private Role role;
 
    private SocialMediaService socialSignInProvider;
 
    public ExampleUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
 
    //Getters are omitted for the sake of clarity.
    public static Builder getBuilder() {
    	
    	return new Builder();
    }
    
    public static class Builder {
 
        private Long id;
 
        private String username;
 
        private String password;
 
        private Role role;
 
        private SocialMediaService socialSignInProvider;
 
        private Set<GrantedAuthority> authorities;
 
        public Builder() {
            this.authorities = new HashSet<>();
        }
 
        public Builder userName(String userNmae) {
            this.username = userNmae;
            return this;
        }
 
        public Builder id(Long id) {
            this.id = id;
            return this;
        }
 
        public Builder password(String password) {
            if (password == null) {
                password = "SocialUser";
            }
 
            this.password = password;
            return this;
        }
 
        public Builder role(Role role) {
            this.role = role;
 
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
            this.authorities.add(authority);
 
            return this;
        }
 
        public Builder socialSignInProvider(SocialMediaService socialSignInProvider) {
            this.socialSignInProvider = socialSignInProvider;
            return this;
        }
 
        public Builder username(String username) {
            this.username = username;
            return this;
        }
 
        public ExampleUserDetails build() {
            ExampleUserDetails user = new ExampleUserDetails(username, password, authorities);
 
            user.id = id;
            user.username = username;
            user.role = role;
            user.socialSignInProvider = socialSignInProvider;
 
            return user;
        }
    }
		

}
