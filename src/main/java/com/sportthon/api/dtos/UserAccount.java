package com.sportthon.api.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportthon.api.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.UUID;

public class UserAccount implements UserDetails {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	private UUID id;
	private String email;
	
	private Integer status;
	
	  @JsonProperty("reset_password_token")
	private String resetPasswordToken;
	  
	  @JsonProperty("reset_password_sent_at")
	private Timestamp resetPasswordSentAt;
	  
	  @JsonProperty("remember_created_at")
	private Timestamp rememberCreatedAt;
	  
	  @JsonProperty("sign_in_count")
	private Integer signInCount;
	  
	  @JsonProperty("current_sign_in_at")
	private Timestamp currentSignInAt;
	  
	  @JsonProperty("last_sign_in_at")
	private Timestamp lastSignInAt;
	  
	  @JsonProperty("current_sign_in_ip")
	private String currentSignInIp;
	  
	  @JsonProperty("last_sign_in_ip")
	private String lastSignInIp;
	  
	  @JsonProperty("invitation_token")
	private String invitationToken;
	  
	  @JsonProperty("invitation_created_at")
	private Timestamp invitationCreatedAt;
	  
	  @JsonProperty("invitation_sent_at")
	private Timestamp invitationSentAt;
	  
	  @JsonProperty("invitation_accepted_at")
	private Timestamp invitationAcceptedAt;
	  
	  @JsonProperty("invitation_limit")
	private Integer invitationLimit;
	  
	 @JsonProperty("invited_by_type")
	private String invitedByType;
	  
	 @JsonProperty("invited_by_id")
	private Long invitedById;
	  
	 @JsonProperty("invitations_count")
	private Integer invitationsCount;
	  
	 @JsonProperty("created_at")
	private Timestamp createdAt;
	  
	 @JsonProperty("updated_at")
	private Timestamp updatedAt;
	 
	 @JsonProperty("first_name")
	private String firstName;
	  
	 @JsonProperty("last_name")
	private String lastName;
	  
	 @JsonProperty("specialist_id")
	private UUID specialistId;
	  
	@JsonProperty("practice_id")
	private UUID practiceId;
	
	private Collection<? extends GrantedAuthority> authorities;

	public UserAccount() {
	}

	public UserAccount(User users, Collection<? extends GrantedAuthority> authorities) {
		BeanUtils.copyProperties(users, this);
		this.authorities = authorities;
		this.username = users.getEmail();
	}

	/*public UserAccount(AdminUser users, Collection<? extends GrantedAuthority> authorities) {
		BeanUtils.copyProperties(users, this);
		this.authorities = authorities;
		this.username = users.getEmail();
	}

	public UserAccount(Patients users, Collection<? extends GrantedAuthority> authorities) {
		BeanUtils.copyProperties(users, this);
		this.authorities = authorities;
		this.username = users.getEmail();
	}*/

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
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

		return status!=null && status==0;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public Timestamp getResetPasswordSentAt() {
		return resetPasswordSentAt;
	}

	public void setResetPasswordSentAt(Timestamp resetPasswordSentAt) {
		this.resetPasswordSentAt = resetPasswordSentAt;
	}

	public Timestamp getRememberCreatedAt() {
		return rememberCreatedAt;
	}

	public void setRememberCreatedAt(Timestamp rememberCreatedAt) {
		this.rememberCreatedAt = rememberCreatedAt;
	}

	public Integer getSignInCount() {
		return signInCount;
	}

	public void setSignInCount(Integer signInCount) {
		this.signInCount = signInCount;
	}

	public Timestamp getCurrentSignInAt() {
		return currentSignInAt;
	}

	public void setCurrentSignInAt(Timestamp currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public Timestamp getLastSignInAt() {
		return lastSignInAt;
	}

	public void setLastSignInAt(Timestamp lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getCurrentSignInIp() {
		return currentSignInIp;
	}

	public void setCurrentSignInIp(String currentSignInIp) {
		this.currentSignInIp = currentSignInIp;
	}

	public String getLastSignInIp() {
		return lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public String getInvitationToken() {
		return invitationToken;
	}

	public void setInvitationToken(String invitationToken) {
		this.invitationToken = invitationToken;
	}

	public Timestamp getInvitationCreatedAt() {
		return invitationCreatedAt;
	}

	public void setInvitationCreatedAt(Timestamp invitationCreatedAt) {
		this.invitationCreatedAt = invitationCreatedAt;
	}

	public Timestamp getInvitationSentAt() {
		return invitationSentAt;
	}

	public void setInvitationSentAt(Timestamp invitationSentAt) {
		this.invitationSentAt = invitationSentAt;
	}

	public Timestamp getInvitationAcceptedAt() {
		return invitationAcceptedAt;
	}

	public void setInvitationAcceptedAt(Timestamp invitationAcceptedAt) {
		this.invitationAcceptedAt = invitationAcceptedAt;
	}

	public Integer getInvitationLimit() {
		return invitationLimit;
	}

	public void setInvitationLimit(Integer invitationLimit) {
		this.invitationLimit = invitationLimit;
	}

	public String getInvitedByType() {
		return invitedByType;
	}

	public void setInvitedByType(String invitedByType) {
		this.invitedByType = invitedByType;
	}

	public Long getInvitedById() {
		return invitedById;
	}

	public void setInvitedById(Long invitedById) {
		this.invitedById = invitedById;
	}

	public Integer getInvitationsCount() {
		return invitationsCount;
	}

	public void setInvitationsCount(Integer invitationsCount) {
		this.invitationsCount = invitationsCount;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UUID getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(UUID specialistId) {
		this.specialistId = specialistId;
	}

	public UUID getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(UUID practiceId) {
		this.practiceId = practiceId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
