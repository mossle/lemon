package com.mossle.acl.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AclSid .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "ACL_SID")
public class AclSid implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String reference;

    /** null. */
    private Long globalId;

    /** null. */
    private Long localId;

    public AclSid() {
    }

    public AclSid(String name, String reference, Long globalId, Long localId) {
        this.name = name;
        this.reference = reference;
        this.globalId = globalId;
        this.localId = localId;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "REFERENCE", length = 200)
    public String getReference() {
        return this.reference;
    }

    /**
     * @param reference
     *            null.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /** @return null. */
    @Column(name = "GLOBAL_ID")
    public Long getGlobalId() {
        return this.globalId;
    }

    /**
     * @param globalId
     *            null.
     */
    public void setGlobalId(Long globalId) {
        this.globalId = globalId;
    }

    /** @return null. */
    @Column(name = "LOCAL_ID")
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @param localId
     *            null.
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }
}