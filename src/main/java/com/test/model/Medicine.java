/**
 * 
 */
package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author satya
 *
 */
@Entity
@Table(name="tbl_mstpvms")
public class Medicine {

	@Id
	private long pk_intpvmsid;
	@Column(name="strechsnumber")
	private String strechsNumber;
	@Column(name="strpvmsnomenclature")
	private String strpvmsNomenclature;
	@Column(name="fk_intauid")
	private int fk_intAuId;
	/**
	 * @return the pk_intpvmsid
	 */
	public long getPk_intpvmsid() {
		return pk_intpvmsid;
	}
	/**
	 * @param pk_intpvmsid the pk_intpvmsid to set
	 */
	public void setPk_intpvmsid(long pk_intpvmsid) {
		this.pk_intpvmsid = pk_intpvmsid;
	}
	/**
	 * @return the strechsNumber
	 */
	public String getStrechsNumber() {
		return strechsNumber;
	}
	/**
	 * @param strechsNumber the strechsNumber to set
	 */
	public void setStrechsNumber(String strechsNumber) {
		this.strechsNumber = strechsNumber;
	}
	/**
	 * @return the strpvmsNomenclature
	 */
	public String getStrpvmsNomenclature() {
		return strpvmsNomenclature;
	}
	/**
	 * @param strpvmsNomenclature the strpvmsNomenclature to set
	 */
	public void setStrpvmsNomenclature(String strpvmsNomenclature) {
		this.strpvmsNomenclature = strpvmsNomenclature;
	}
	/**
	 * @return the fk_intAuId
	 */
	public int getFk_intAuId() {
		return fk_intAuId;
	}
	/**
	 * @param fk_intAuId the fk_intAuId to set
	 */
	public void setFk_intAuId(int fk_intAuId) {
		this.fk_intAuId = fk_intAuId;
	}
	
}
