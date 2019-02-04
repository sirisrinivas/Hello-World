package com.test.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tbl_accountingunit")
public class Test {
	
	@Id
	private Long pk_intauid;
	//stracctunitname, stracctunitdescription, status
	
	@Column(name="stracctunitname")
	private String strAcctUnitName;
	@Column(name="stracctunitdescription")
	private String strAcctUnitDescription;
	@Column(name="status")
	private String status;
	
	@OneToMany
	@JoinColumn(name="fk_intauid")
	private Set<Medicine> medicines;
	
	/**
	 * @return the pk_intauid
	 */
	public Long getPk_intauid() {
		return pk_intauid;
	}
	/**
	 * @param pk_intauid the pk_intauid to set
	 */
	public void setPk_intauid(Long pk_intauid) {
		this.pk_intauid = pk_intauid;
	}
	/**
	 * @return the strAcctUnitName
	 */
	public String getStrAcctUnitName() {
		return strAcctUnitName;
	}
	/**
	 * @param strAcctUnitName the strAcctUnitName to set
	 */
	public void setStrAcctUnitName(String strAcctUnitName) {
		this.strAcctUnitName = strAcctUnitName;
	}
	/**
	 * @return the strAcctUnitDescription
	 */
	public String getStrAcctUnitDescription() {
		return strAcctUnitDescription;
	}
	/**
	 * @param strAcctUnitDescription the strAcctUnitDescription to set
	 */
	public void setStrAcctUnitDescription(String strAcctUnitDescription) {
		this.strAcctUnitDescription = strAcctUnitDescription;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the medicines
	 */
	public Set<Medicine> getMedicines() {
		return medicines;
	}
	/**
	 * @param medicines the medicines to set
	 */
	public void setMedicines(Set<Medicine> medicines) {
		this.medicines = medicines;
	}
	
	
	
	
	

}
