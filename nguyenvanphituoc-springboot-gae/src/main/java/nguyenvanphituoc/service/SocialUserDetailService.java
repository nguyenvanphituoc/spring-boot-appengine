package nguyenvanphituoc.service;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;

public class SocialUserDetailService implements SocialUserDetailsService {

	private UserDetailsService userDetailsService;
	 
    public SocialUserDetailService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
 
    @Override
    public SocialUserDetails loadUserByUserId(String userId) 
                           throws UsernameNotFoundException, DataAccessException {
        UserDetails userDetails = userDetailsService.loadUserByUsername(userId);
        return new SocialUser(userDetails.getUsername(), 
                           userDetails.getPassword(), userDetails.getAuthorities());
    }

}
