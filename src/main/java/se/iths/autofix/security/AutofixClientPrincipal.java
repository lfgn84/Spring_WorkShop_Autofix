package se.iths.autofix.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import se.iths.autofix.entity.AuthGroup;
import se.iths.autofix.entity.Client;
import se.iths.autofix.entity.Employee;

import java.util.*;

public class AutofixClientPrincipal implements UserDetails {
    //AutofixUserPrincipal

    private Client client;
   // private Employee employee;
    private List<AuthGroup> authGroups;

    public AutofixClientPrincipal(Client client, List<AuthGroup> authGroups) {
        super();
        this.client = client;
        this.authGroups = authGroups;
    }

//    public AutofixClientPrincipal(Employee employee, List<AuthGroup> authGroups) {
//        super();
//        this.employee = employee;
//        this.authGroups = authGroups;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (authGroups==null) {
            return Collections.emptySet();
        }
        Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
        authGroups.forEach(group->{
            grantedAuthorities.add(new SimpleGrantedAuthority(group.getAuthGroup()));
        });
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return this.client.getPassword();
    }


    @Override
    public String getUsername() {
        return this.client.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}